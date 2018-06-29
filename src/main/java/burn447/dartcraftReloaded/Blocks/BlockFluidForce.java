package burn447.dartcraftReloaded.Blocks;

import net.minecraftforge.fluids.BlockFluidClassic;

import static burn447.dartcraftReloaded.Fluids.ModFluids.fluidForce;

/**
 * Created by BURN447 on 6/23/2018.
 */
public class BlockFluidForce extends BlockFluidClassic {

    public BlockFluidForce(){
        super(fluidForce, fluidForce.getMaterial());
        this.setRegistryName("fluidForce");
    }
}
