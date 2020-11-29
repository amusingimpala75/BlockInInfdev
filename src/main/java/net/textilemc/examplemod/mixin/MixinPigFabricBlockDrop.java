package net.textilemc.examplemod.mixin;

import net.minecraft.entity.living.PassiveMob;
import net.minecraft.entity.living.Pig;
import net.minecraft.world.World;
import net.textilemc.examplemod.ExampleMod;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(Pig.class)
public abstract class MixinPigFabricBlockDrop extends PassiveMob {
    public MixinPigFabricBlockDrop(World var1) {
        super(var1);
    }
    @Inject(at=@At("HEAD"), method = "getDropItem", cancellable = true)
    public void replaceWithFabricBlock(CallbackInfoReturnable<Integer> info) {
        info.setReturnValue(ExampleMod.FABRIC_ITEM.id);
    }
}
