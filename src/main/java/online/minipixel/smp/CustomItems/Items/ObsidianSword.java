package online.minipixel.smp.CustomItems.Items;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.NamespacedKey;
import org.bukkit.attribute.Attribute;
import org.bukkit.attribute.AttributeModifier;
import org.bukkit.inventory.ItemFlag;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.ShapedRecipe;
import org.bukkit.inventory.meta.ItemMeta;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class ObsidianSword {

    public static ItemStack IS;


    public static void getCustomObsidianSword() {
        AttributeModifier modifier = new AttributeModifier(UUID.randomUUID(), "Damage", 10, AttributeModifier.Operation.ADD_NUMBER);
        ItemStack itemStack = new ItemStack(Material.NETHERITE_SWORD);
        ItemMeta itemMeta = itemStack.getItemMeta();
        itemMeta.addAttributeModifier(Attribute.GENERIC_ATTACK_DAMAGE, modifier);
        itemMeta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
        itemMeta.setDisplayName("§5Obsidianschwert");
        List<String> lore = new ArrayList<>();
        lore.add("");
        lore.add("§7In der Haupthand");
        lore.add("§2 10 Angriffsschaden");
        lore.add("§2 1.6 Angriffsgeschwindigkeit");
        lore.add("");
        lore.add("§7Made by §4AAWA");
        itemMeta.setLore(lore);
        itemStack.setItemMeta(itemMeta);
        IS = itemStack;



        ShapedRecipe sr = new ShapedRecipe(NamespacedKey.minecraft("obsidian_sword"), IS);
        sr.shape(" O ", " O ", " S ");
        sr.setIngredient('O', Material.OBSIDIAN);
        sr.setIngredient('S', Material.STICK);
        Bukkit.getServer().addRecipe(sr);
    }
}
