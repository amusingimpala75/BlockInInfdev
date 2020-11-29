package net.textilemc.examplemod.mixin;

import net.minecraft.recipe.RecipeDispatcher;
import net.textilemc.examplemod.recipe.FabricItemToBlockRecipe;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(RecipeDispatcher.class)
public class AddRecipesMixin {
    @Inject(at=@At("TAIL"), method = "<init>")
    public void addMyRecipes(CallbackInfo info) {
        (new FabricItemToBlockRecipe()).register(((RecipeDispatcher)(Object)this));
    }
}
