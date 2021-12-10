package online.minipixel.smp.CustomItems.Items;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.NamespacedKey;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.ShapedRecipe;
import org.bukkit.inventory.meta.ItemMeta;

import java.util.ArrayList;
import java.util.List;

public class Lapispickaxe {

    public static ItemStack IS;


    public static void getCustomLapisPickAxe() {
        ItemStack itemStack = new ItemStack(Material.DIAMOND_PICKAXE);
        ItemMeta itemMeta = itemStack.getItemMeta();
        itemMeta.setDisplayName("§9Lapisspitzhacke");
        itemMeta.addEnchant(Enchantment.DIG_SPEED, 2, true);
        itemMeta.addEnchant(Enchantment.LOOT_BONUS_BLOCKS, 3, true);
        List<String> lore = new ArrayList<>();
        lore.add("");
        lore.add("§7Made by §4AAWA");
        itemMeta.setLore(lore);
        itemStack.setItemMeta(itemMeta);
        IS = itemStack;
        ShapedRecipe sr = new ShapedRecipe(NamespacedKey.minecraft("lapis_pickaxe"), IS);
        sr.shape("LLL", " S ", " S ");
        sr.setIngredient('L', Material.LAPIS_LAZULI);
        sr.setIngredient('S', Material.STICK);
        Bukkit.getServer().addRecipe(sr);
    }
}
