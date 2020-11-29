package net.textilemc.examplemod.mixin;

import net.minecraft.block.Block;
import net.minecraft.feature.Lake;
import net.minecraft.world.ChunkAccess;
import net.minecraft.world.TerrainPopulator;
import net.minecraft.world.World;
import net.textilemc.examplemod.feature.FabricFeature;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

import java.util.Random;

@Mixin(TerrainPopulator.class)
public class TerrainPopulatorMixin {
    @Shadow
    private Random seededRandom;

    @Shadow
    private World world;

    @Inject(at=@At("HEAD"), method = "method_172")
    public void addFabricFeature(ChunkAccess access, int j, int i, CallbackInfo info) {
        int chunkAccess = i << 4;
        int var5;
        int var6;
        int var7;
        for(var5 = 0; var5 < 20; ++var5) {
            var6 = chunkAccess + (this.seededRandom.nextInt(16)) + 8;
            var7 = this.seededRandom.nextInt(this.seededRandom.nextInt(this.seededRandom.nextInt(112) + 8) + 8);
            j = i + this.seededRandom.nextInt(16) + 8;
            (new FabricFeature()).generate(this.world, this.seededRandom, var6, var7, j);
        }
    }
}
