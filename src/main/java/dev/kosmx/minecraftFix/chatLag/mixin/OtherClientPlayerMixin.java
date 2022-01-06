package dev.kosmx.minecraftFix.chatLag.mixin;

import net.minecraft.client.MinecraftClient;
import net.minecraft.client.network.OtherClientPlayerEntity;
import net.minecraft.text.Text;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

import java.util.UUID;

@Mixin(OtherClientPlayerEntity.class)
public class OtherClientPlayerMixin {

    private void functionCopy(Text message, UUID sender){
        MinecraftClient minecraftClient = MinecraftClient.getInstance();
        if (!minecraftClient.shouldBlockMessages(sender)) {
            minecraftClient.inGameHud.getChatHud().addMessage(message);
        }
    }

    @Inject(method = "sendSystemMessage", at = @At("HEAD"), cancellable = true)
    private void doThreaded(Text message, UUID sender, CallbackInfo ci){
        new Thread(() -> functionCopy(message, sender)).start();
        ci.cancel();
    }
}
