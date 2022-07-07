package earth.aaronwagner.smp.CustomItems.Items;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.NamespacedKey;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.ShapedRecipe;
import org.bukkit.inventory.meta.ItemMeta;

import java.util.ArrayList;
import java.util.List;

public class EmeraldPickaxe {

    public static ItemStack IS;

    public static void getCustomEmeraldPickAxe() {
        ItemStack itemStack = new ItemStack(Material.DIAMOND_PICKAXE);
        ItemMeta itemMeta = itemStack.getItemMeta();
        itemMeta.setDisplayName("§2Smaragdspitzhacke");
        itemMeta.addEnchant(Enchantment.DIG_SPEED, 5, true);
        List<String> lore = new ArrayList<>();
        lore.add("");
        lore.add("§7Made by §4AAWA");
        itemMeta.setLore(lore);
        itemStack.setItemMeta(itemMeta);
        IS = itemStack;
        ShapedRecipe sr = new ShapedRecipe(NamespacedKey.minecraft("emerald_pickaxe"), IS);
        sr.shape("EEE", " S ", " S ");
        sr.setIngredient('E', Material.EMERALD);
        sr.setIngredient('S', Material.STICK);
        Bukkit.getServer().addRecipe(sr);

    }

}
