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

public class Knockbackstick {

    public static ItemStack IS;


    public static void getCustomKBStick() {
        ItemStack itemStack = new ItemStack(Material.STICK);
        ItemMeta itemMeta = itemStack.getItemMeta();
        itemMeta.setDisplayName("§cKnockbackstick");
        itemMeta.addEnchant(Enchantment.KNOCKBACK, 10, true);
        List<String> lore = new ArrayList<>();
        lore.add("");
        lore.add("§7Made by §4AAWA");
        itemMeta.setLore(lore);
        itemStack.setItemMeta(itemMeta);
        IS = itemStack;
        ShapedRecipe sr = new ShapedRecipe(NamespacedKey.minecraft("kb_stick"), IS);
        sr.shape("LLL", "LSL", "LLL");
        sr.setIngredient('L', Material.SLIME_BALL);
        sr.setIngredient('S', Material.STICK);
        Bukkit.getServer().addRecipe(sr);
    }
}
