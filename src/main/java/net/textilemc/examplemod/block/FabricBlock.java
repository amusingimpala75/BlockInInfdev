package net.textilemc.examplemod.block;

import net.minecraft.block.Block;
import net.minecraft.block.Material;

public class FabricBlock extends Block {
    public FabricBlock(int id, Material material) {
        super(id, 31, material);
    }

    @Override
    public boolean method_101() {
        return false;
    }
}
