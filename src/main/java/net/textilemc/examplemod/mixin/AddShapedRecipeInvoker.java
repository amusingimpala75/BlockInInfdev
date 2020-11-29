package net.textilemc.examplemod.mixin;

import net.minecraft.item.ItemStack;
import net.minecraft.recipe.RecipeDispatcher;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.gen.Invoker;

@Mixin(RecipeDispatcher.class)
public interface AddShapedRecipeInvoker {

    @Invoker
    void invokeAddShapedRecipe(ItemStack var1, Object... args);
}
