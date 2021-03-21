package space.kiichan.geneticchickengineering.items;

import io.github.thebusybiscuit.slimefun4.core.attributes.MachineTier;
import io.github.thebusybiscuit.slimefun4.core.attributes.MachineType;
import io.github.thebusybiscuit.slimefun4.utils.LoreBuilder;
import me.mrCookieSlime.Slimefun.api.SlimefunItemStack;
import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;

public final class GCEItems {

    private GCEItems() {}

    public static final SlimefunItemStack POCKET_CHICKEN = new SlimefunItemStack("GCE_POCKET_CHICKEN", "1638469a599ceef7207537603248a9ab11ff591fd378bea4735b346a7fae893", "§r§b小鸡包裹", "§7在方块上右键", "§7释放小鸡");
    public static final SlimefunItemStack CHICKEN_NET = new SlimefunItemStack("GCE_CHICKEN_NET", new ItemStack(Material.COBWEB), "§a小鸡捕捉网", "§r§7§o打包小鸡", "", LoreBuilder.RIGHT_CLICK_TO_USE);
    public static final SlimefunItemStack WATER_EGG = new SlimefunItemStack("GCE_WATER_EGG", new ItemStack(Material.TURTLE_SPAWN_EGG), "§9水蛋", "§r§7§o富含水分", "", LoreBuilder.RIGHT_CLICK_TO_USE);
    public static final SlimefunItemStack LAVA_EGG = new SlimefunItemStack("GCE_LAVA_EGG", new ItemStack(Material.STRIDER_SPAWN_EGG), "§c岩浆蛋", "§r§7§o富含岩浆", "", LoreBuilder.RIGHT_CLICK_TO_USE);
    public static final SlimefunItemStack GENETIC_SEQUENCER = new SlimefunItemStack("GCE_GENETIC_SEQUENCER", new ItemStack(Material.SMOKER), "§e基因测序仪", "§r§7§o用于测定小鸡的基因序列", "", LoreBuilder.machine(MachineTier.MEDIUM, MachineType.MACHINE), LoreBuilder.powerPerSecond(6));
    public static final SlimefunItemStack EXCITATION_CHAMBER = new SlimefunItemStack("GCE_EXCITATION_CHAMBER", new ItemStack(Material.BLAST_FURNACE), "§e潜力激发仪", "§r§7§o让小鸡能够生产某种资源", "", LoreBuilder.machine(MachineTier.MEDIUM, MachineType.MACHINE), LoreBuilder.powerPerSecond(10));
    public static final SlimefunItemStack EXCITATION_CHAMBER_2 = new SlimefunItemStack("GCE_EXCITATION_CHAMBER_2", new ItemStack(Material.BLAST_FURNACE), "§e充能潜力激发仪", "§r§7§o让小鸡能够生产某种资源,", "§r§7§o但是更快", "", LoreBuilder.machine(MachineTier.END_GAME, MachineType.MACHINE), LoreBuilder.powerPerSecond(15));
    public static final SlimefunItemStack PRIVATE_COOP = new SlimefunItemStack("GCE_PRIVATE_COOP", new ItemStack(Material.BEEHIVE), "§e私人鸡舍", "§r§7§o大到能塞下两只鸡...", "", LoreBuilder.machine(MachineTier.MEDIUM, MachineType.MACHINE), LoreBuilder.powerPerSecond(2));
    public static final SlimefunItemStack RESTORATION_CHAMBER = new SlimefunItemStack("GCE_RESTORATION_CHAMBER", new ItemStack(Material.PINK_SHULKER_BOX), "§e恢复室", "§r§7§o治疗被打包的小鸡", "§7(放入筋疲力竭的小鸡和小麦种子)", "", LoreBuilder.machine(MachineTier.MEDIUM, MachineType.MACHINE), LoreBuilder.powerPerSecond(4));

}
