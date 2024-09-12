package com.github.ohwowdavid.togglesprint.mixin;

import com.github.ohwowdavid.togglesprint.SimpleToggleSprint;
import net.minecraft.client.entity.EntityPlayerSP;
import net.minecraft.client.settings.KeyBinding;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;


@Mixin(EntityPlayerSP.class)
public class MixinEntityPlayerSP {
    @Redirect(method = "onLivingUpdate()V", at = @At(value = "INVOKE", target = "Lnet/minecraft/client/settings/KeyBinding;isKeyDown()Z"))
    private boolean injected(KeyBinding instance) {
        return SimpleToggleSprint.sprintState;
    }
}
