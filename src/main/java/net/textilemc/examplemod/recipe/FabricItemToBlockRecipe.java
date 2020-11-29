package net.textilemc.examplemod.recipe;

import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.recipe.RecipeDispatcher;
import net.textilemc.examplemod.ExampleMod;
import net.textilemc.examplemod.mixin.AddShapedRecipeInvoker;

public class FabricItemToBlockRecipe {
    public void register(RecipeDispatcher dispatcher) {
        ((AddShapedRecipeInvoker)(Object)dispatcher).invokeAddShapedRecipe(new ItemStack(ExampleMod.FABRIC_BLOCK, 1), "###", "###", "###", '#', ExampleMod.FABRIC_ITEM);
        ((AddShapedRecipeInvoker)(Object)dispatcher).invokeAddShapedRecipe(new ItemStack(ExampleMod.FABRIC_ITEM, 2), "#", '#', ExampleMod.FABRIC_ITEM);
        ((AddShapedRecipeInvoker)(Object)dispatcher).invokeAddShapedRecipe(new ItemStack(ExampleMod.FABRIC_ITEM, 1), "#", '#', Item.STICK);
    }
}
