package tutorial.item.crafting;

import net.minecraft.init.Blocks;
import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.CraftingManager;
import net.minecraftforge.oredict.OreDictionary;
import tutorial.TutorialMain;

public class RecipesAll
{
	private static RecipesAll instance = new RecipesAll();
	
	public static RecipesAll instance() {
		return instance;
	}
	
	public void addArmorRecipes(CraftingManager crafting) {
		crafting.addRecipe(new ItemStack(TutorialMain.wizardHat), new Object[] {" X ", " X ", "XXX", 'X', new ItemStack(Blocks.wool,1,OreDictionary.WILDCARD_VALUE)});
		crafting.addRecipe(new ItemStack(TutorialMain.wizardRobe), new Object[] {"X X", "XXX", "XXX", 'X', new ItemStack(Blocks.wool,1,OreDictionary.WILDCARD_VALUE)});
		crafting.addRecipe(new ItemStack(TutorialMain.wizardPants), new Object[] {"XXX", "X X", "X X", 'X', new ItemStack(Blocks.wool,1,OreDictionary.WILDCARD_VALUE)});
		crafting.addRecipe(new ItemStack(TutorialMain.wizardBoots), new Object[] {"X X", "X X", 'X', new ItemStack(Blocks.wool,1,OreDictionary.WILDCARD_VALUE)});
	}
}
