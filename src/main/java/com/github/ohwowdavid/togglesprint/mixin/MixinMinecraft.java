package com.github.ohwowdavid.togglesprint.mixin;

import com.github.ohwowdavid.togglesprint.SimpleToggleSprint;
import net.minecraft.client.Minecraft;
import net.minecraft.client.settings.KeyBinding;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(Minecraft.class)
public class MixinMinecraft {
    @Inject(method = "runTick()V", at = @At("TAIL"))
    private void injected(CallbackInfo ci) {
        KeyBinding sprintkey = Minecraft.getMinecraft().gameSettings.keyBindSprint;
        if (sprintkey.isPressed( )) {
            SimpleToggleSprint.sprintState = !SimpleToggleSprint.sprintState;

        }
    }
}
