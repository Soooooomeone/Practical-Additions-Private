package com.danako.practical_additions.combat;

import com.danako.practical_additions.PracticalAdditions;
import com.danako.practical_additions.core.PracticalItems;
import net.minecraft.core.Holder;
import net.minecraft.resources.Identifier;
import net.minecraft.tags.DamageTypeTags;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.ai.attributes.Attribute;
import net.minecraft.world.entity.ai.attributes.AttributeInstance;
import net.minecraft.world.entity.ai.attributes.AttributeModifier;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.item.ItemStack;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.neoforge.common.NeoForge;
import net.neoforged.neoforge.common.NeoForgeMod;
import net.neoforged.neoforge.event.entity.living.LivingIncomingDamageEvent;
import net.neoforged.neoforge.event.entity.living.MobEffectEvent;
import net.neoforged.neoforge.event.tick.EntityTickEvent;

import java.util.function.Predicate;

public class PAArmorEffectsHandler {
    private static final float REDUCTION_PER_PIECE = 0.22F;
    private static final float MAX_REDUCTION = 0.9F;
    private static final Identifier SPEED_MODIFIER_ID = Identifier.fromNamespaceAndPath(PracticalAdditions.MODID, "lead_weight_speed");
    private static final Identifier JUMP_MODIFIER_ID = Identifier.fromNamespaceAndPath(PracticalAdditions.MODID, "lead_weight_jump");
    private static final Identifier GRAVITY_MODIFIER_ID = Identifier.fromNamespaceAndPath(PracticalAdditions.MODID, "lead_weight_gravity");
    private static final Identifier SWIM_MODIFIER_ID = Identifier.fromNamespaceAndPath(PracticalAdditions.MODID, "cobalt_swim_speed");
    private static final double[] SPEED_PENALTY = {-0.05, -0.0667, -0.0833, -0.10};
    private static final double[] JUMP_PENALTY = {-0.05, -0.0667, -0.0833, -0.10};
    private static final double[] GRAVITY_BONUS = {0.025, 0.05, 0.075, 0.10};
    private static final double[] SWIM_BONUS = {0.15, 0.30, 0.45, 0.65};

    private static boolean isLeadPiece(ItemStack stack) {
        return stack.is(PracticalItems.LEAD_HELMET.get()) || stack.is(PracticalItems.LEAD_CHESTPLATE.get()) || stack.is(PracticalItems.LEAD_LEGGINGS.get()) || stack.is(PracticalItems.LEAD_BOOTS.get());
    }

    private static boolean isCobaltPiece(ItemStack stack) {
        return stack.is(PracticalItems.COBALT_HELMET.get()) || stack.is(PracticalItems.COBALT_CHESTPLATE.get()) || stack.is(PracticalItems.COBALT_LEGGINGS.get()) || stack.is(PracticalItems.COBALT_BOOTS.get());
    }

    private static boolean isKevlarPiece(ItemStack stack) {
        return stack.is(PracticalItems.BALLISTIC_HELMET.get()) || stack.is(PracticalItems.KEVLAR_VEST.get()) || stack.is(PracticalItems.KEVLAR_PANTS.get()) || stack.is(PracticalItems.KEVLAR_BOOTS.get());
    }

    private static void applyModifier(LivingEntity entity, Holder<Attribute> attribute, Identifier id, int pieces, double[] tiers) {
        AttributeInstance instance = entity.getAttribute(attribute);
        if (instance == null) {
            return;
        }
        instance.removeModifier(id);
        if (pieces <= 0) {
            return;
        }
        double amount = tiers[Math.min(pieces, 4) - 1];
        instance.addTransientModifier(new AttributeModifier(id, amount, AttributeModifier.Operation.ADD_MULTIPLIED_TOTAL));
    }

    private static int countArmorPieces(LivingEntity entity, Predicate<ItemStack> matcher) {
        int count = 0;
        for (EquipmentSlot slot : new EquipmentSlot[]{EquipmentSlot.HEAD, EquipmentSlot.CHEST, EquipmentSlot.LEGS, EquipmentSlot.FEET}) {
            ItemStack stack = entity.getItemBySlot(slot);
            if (matcher.test(stack)) {
                count++;
            }
        }
        return count;
    }

    public static void register() {
        NeoForge.EVENT_BUS.register(new PAArmorEffectsHandler());
    }

    @SubscribeEvent
    public void onIncomingDamage(LivingIncomingDamageEvent event) {
        if (!event.getSource().is(DamageTypeTags.IS_PROJECTILE)) {
            return;
        }
        LivingEntity entity = event.getEntity();
        int kevlarPieces = countArmorPieces(entity, PAArmorEffectsHandler::isKevlarPiece);
        if (kevlarPieces <= 0) {
            return;
        }
        float reduction = Math.min(MAX_REDUCTION, REDUCTION_PER_PIECE * kevlarPieces);
        event.setAmount(event.getAmount() * (1.0F - reduction));
    }

    @SubscribeEvent
    public void onEntityTickPost(EntityTickEvent.Post event) {
        if (!(event.getEntity() instanceof LivingEntity entity)) {
            return;
        }
        if (entity.level().isClientSide()) {
            return;
        }
        int leadPieces = countArmorPieces(entity, PAArmorEffectsHandler::isLeadPiece);
        int cobaltPieces = countArmorPieces(entity, PAArmorEffectsHandler::isCobaltPiece);
        applyModifier(entity, Attributes.MOVEMENT_SPEED, SPEED_MODIFIER_ID, leadPieces, SPEED_PENALTY);
        applyModifier(entity, Attributes.JUMP_STRENGTH, JUMP_MODIFIER_ID, leadPieces, JUMP_PENALTY);
        applyModifier(entity, Attributes.GRAVITY, GRAVITY_MODIFIER_ID, leadPieces, GRAVITY_BONUS);
        applyModifier(entity, NeoForgeMod.SWIM_SPEED, SWIM_MODIFIER_ID, cobaltPieces, SWIM_BONUS);
        if (leadPieces >= 4 && entity.hasEffect(MobEffects.LEVITATION)) {
            entity.removeEffect(MobEffects.LEVITATION);
        }
    }

    @SubscribeEvent
    public void onLevitationApply(MobEffectEvent.Applicable event) {
        if (event.getEffectInstance().getEffect() != MobEffects.LEVITATION) {
            return;
        }
        if (!(event.getEntity() instanceof LivingEntity living)) {
            return;
        }
        if (countArmorPieces(living, PAArmorEffectsHandler::isLeadPiece) >= 4) {
            event.setResult(MobEffectEvent.Applicable.Result.DO_NOT_APPLY);
        }
    }
}