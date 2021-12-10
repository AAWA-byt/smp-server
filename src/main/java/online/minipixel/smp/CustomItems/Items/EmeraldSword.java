package online.minipixel.smp.CustomItems.Items;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.NamespacedKey;
import org.bukkit.attribute.Attribute;
import org.bukkit.attribute.AttributeModifier;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.inventory.ItemFlag;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.ShapedRecipe;
import org.bukkit.inventory.meta.ItemMeta;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class EmeraldSword {

    public static ItemStack IS;

    public static void getCustomEmeraldsword() {
        ItemStack itemStack = new ItemStack(Material.DIAMOND_SWORD);
        AttributeModifier modifier = new AttributeModifier(UUID.randomUUID(), "Damage", 8, AttributeModifier.Operation.ADD_NUMBER);
        ItemMeta itemMeta = itemStack.getItemMeta();
        itemMeta.setDisplayName("§2Smaragdschwert");
        itemMeta.addEnchant(Enchantment.KNOCKBACK, 3, true);
        itemMeta.addAttributeModifier(Attribute.GENERIC_ATTACK_DAMAGE, modifier);

        itemMeta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
        List<String> lore = new ArrayList<>();
        lore.add("");
        lore.add("§7In der Haupthand");
        lore.add("§2 8 Angriffsschaden");
        lore.add("§2 1.6 Angriffsgeschwindigkeit");
        lore.add("");
        lore.add("§7Made by §4AAWA");
        itemMeta.setLore(lore);
        itemStack.setItemMeta(itemMeta);
        IS = itemStack;


        //Shaped Recipe
        ShapedRecipe sr = new ShapedRecipe(NamespacedKey.minecraft("emerald_sword"), IS);
        sr.shape(" E ", " E ", " S ");
        sr.setIngredient('E', Material.EMERALD);
        sr.setIngredient('S', Material.STICK);
        Bukkit.getServer().addRecipe(sr);

    }
}
