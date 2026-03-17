package com.moovintwo.fishing_frenzy.item.rods;

import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.projectile.FishingBobberEntity;
import net.minecraft.item.FishingRodItem;
import net.minecraft.item.ItemStack;
import net.minecraft.sound.SoundCategory;
import net.minecraft.sound.SoundEvents;
import net.minecraft.stat.Stats;
import net.minecraft.util.Hand;
import net.minecraft.util.TypedActionResult;
import net.minecraft.world.World;

public class Pufferline extends FishingRodItem {
    public Pufferline(Settings settings) {
        super(settings);
    }

    @Override
    public TypedActionResult<ItemStack> use(World world, PlayerEntity user, Hand hand) {
        ItemStack itemStack = user.getStackInHand(hand);

        if (user.fishHook != null) {
            int damage = user.fishHook.use(itemStack);
            itemStack.damage(damage, user, p -> p.sendToolBreakStatus(hand));
            user.swingHand(hand);
        } else {
            world.playSound(null, user.getX(), user.getY(), user.getZ(),
                    SoundEvents.ENTITY_FISHING_BOBBER_THROW,
                    SoundCategory.NEUTRAL, 0.5F,
                    0.4F / (world.random.nextFloat() * 0.4F + 0.8F));

            if (!world.isClient) {
                FishingBobberEntity bobber = new FishingBobberEntity(user, world, 0, 0);
                user.fishHook = bobber;
                world.spawnEntity(bobber);
            }

            user.incrementStat(Stats.USED.getOrCreateStat(this));
        }

        return TypedActionResult.success(itemStack, world.isClient());
    }

}
