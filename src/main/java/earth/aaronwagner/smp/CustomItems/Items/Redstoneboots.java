package earth.aaronwagner.smp.CustomItems.Items;

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

public class Redstoneboots {

    public static ItemStack IS;

    public static void getCustomRedStoneBoots() {
        ItemStack itemStack = new ItemStack(Material.IRON_BOOTS);
        ItemMeta itemMeta = itemStack.getItemMeta();
        AttributeModifier modifier = new AttributeModifier(UUID.randomUUID(), "Armor", 4, AttributeModifier.Operation.ADD_NUMBER);
        AttributeModifier modifier1 = new AttributeModifier(UUID.randomUUID(), "Speed", 0.11, AttributeModifier.Operation.ADD_NUMBER);
        itemMeta.addAttributeModifier(Attribute.GENERIC_MOVEMENT_SPEED, modifier1);
        itemMeta.addAttributeModifier(Attribute.GENERIC_ARMOR, modifier);
        itemMeta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
        itemMeta.setDisplayName("§cRedstoneschuhe");
        List<String> lore = new ArrayList<>();
        lore.add("");
        lore.add("§7An den Füßen");
        lore.add("§9+4 Rüstung");
        lore.add("§9 +0.7 Speed");
        lore.add("");
        lore.add("§7Made by §4AAWA");
        itemMeta.setLore(lore);
        itemStack.setItemMeta(itemMeta);
        IS = itemStack;
        ShapedRecipe sr = new ShapedRecipe(NamespacedKey.minecraft("redstone_boots"), IS);
        sr.shape("   ", "E E", "E E");
        sr.setIngredient('E', Material.REDSTONE_BLOCK);
        Bukkit.getServer().addRecipe(sr);

    }
}
