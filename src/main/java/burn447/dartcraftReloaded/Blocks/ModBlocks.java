package burn447.dartcraftReloaded.Blocks;

import burn447.dartcraftReloaded.dartcraftReloaded;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraftforge.registries.IForgeRegistry;

/**
 * Created by BURN447 on 2/4/2018.
 */
public class ModBlocks {

    public static BlockForceOre orePower = new BlockForceOre("orePower").setCreativeTab(dartcraftReloaded.creativeTab);
    public static BlockForceSapling forceSapling = new BlockForceSapling(("forceSapling"));
    public static BlockForceLog forceLog = new BlockForceLog("forceLog").setCreativeTab(dartcraftReloaded.creativeTab);
    public static BlockForceLeaves forceLeaves = new BlockForceLeaves("forceLeaves");
    public static BlockInfuser infuser = new BlockInfuser("infuser");
    public static BlockFluidForce blockFluidForce = new BlockFluidForce();

    public static void register(IForgeRegistry<Block> registry) {
        registry.registerAll(
                orePower,
                forceSapling,
                forceLog,
                forceLeaves,
                infuser,
                blockFluidForce
        );

    }

    public static void registerItemBlocks(IForgeRegistry<Item> registry) {
        registry.registerAll(
                orePower.createItemBlock(),
                forceSapling.createItemBlock(),
                forceLog.createItemBlock(),
                forceLeaves.createItemBlock(),
                infuser.createItemBlock()
        );

    }

    public static void registerModels() {
        orePower.registerItemModel(Item.getItemFromBlock(orePower));
        forceLog.registerItemModel(Item.getItemFromBlock(forceLog));
        infuser.registerItemModel(Item.getItemFromBlock(infuser));
    }
}
