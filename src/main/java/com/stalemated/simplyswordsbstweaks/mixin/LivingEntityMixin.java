package com.stalemated.simplyswordsbstweaks.mixin;

import net.minecraft.entity.LivingEntity;
import net.sweenus.simplyswords.entity.BattleStandardDarkEntity;
import net.sweenus.simplyswords.entity.BattleStandardEntity;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import com.stalemated.simplyswordsbstweaks.SimplySwordsBattleStandardConfig;

@Mixin(LivingEntity.class)
public class LivingEntityMixin {

    @Inject(
            method = "heal",
            at = @At("HEAD"),
            cancellable = true
    )
    private void preventBannerHealing(float amount, CallbackInfo ci) {
        if (SimplySwordsBattleStandardConfig.bannerHealingAllowed) {
            return;
        }

        LivingEntity entity = (LivingEntity) (Object) this;
        // Cancels healing from any source for both banner entities
        if (entity instanceof BattleStandardDarkEntity || entity instanceof BattleStandardEntity) {
            ci.cancel();
        }
    }
}
