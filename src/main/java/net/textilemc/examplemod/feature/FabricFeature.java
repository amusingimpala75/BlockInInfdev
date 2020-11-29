package net.textilemc.examplemod.feature;

import net.minecraft.block.Block;
import net.minecraft.world.World;
import net.minecraft.world.feature.Feature;

import java.util.Random;

public class FabricFeature extends Feature {
    @Override
    public boolean generate(World world, Random rand, int x, int y, int z) {
        for (int i = 0; i < 10; i++) {
            //world.method_214(x, 60+i, z, Block.GRASS.id);
        }
        return true;
    }
}
