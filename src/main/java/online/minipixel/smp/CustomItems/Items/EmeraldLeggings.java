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

public class EmeraldLeggings {

    public static ItemStack IS;

    public static void getCustomEmeraldleggings() {
        ItemStack itemStack = new ItemStack(Material.DIAMOND_LEGGINGS);
        AttributeModifier modifier = new AttributeModifier(UUID.randomUUID(), "Armor", 6, AttributeModifier.Operation.ADD_NUMBER);
        AttributeModifier modifier1 = new AttributeModifier(UUID.randomUUID(), "Durability", 2000, AttributeModifier.Operation.ADD_NUMBER);
        ItemMeta itemMeta = itemStack.getItemMeta();
        itemMeta.addAttributeModifier(Attribute.GENERIC_ARMOR, modifier);
        itemMeta.addAttributeModifier(Attribute.GENERIC_ARMOR_TOUGHNESS, modifier1);
        itemMeta.setDisplayName("§2Smaragdhose");

        itemMeta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
        List<String> lore = new ArrayList<>();
        lore.add("");
        lore.add("§7An den Beinen");
        lore.add("§9 +6 Rüstung");
        lore.add("§9 +2000 Rüstungshärte");
        lore.add("");
        lore.add("§7Made by §4AAWA");
        itemMeta.setLore(lore);
        itemStack.setItemMeta(itemMeta);
        IS = itemStack;
        ShapedRecipe sr = new ShapedRecipe(NamespacedKey.minecraft("emerald_leggings"), IS);
        sr.shape("EEE", "E E", "E E");
        sr.setIngredient('E', Material.EMERALD);
        Bukkit.getServer().addRecipe(sr);
    }
}
