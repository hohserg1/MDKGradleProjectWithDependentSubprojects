package hohserg.example.mod.b;

import net.minecraftforge.fml.common.Mod;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

@Mod("mod_b")
public class ExampleMod {
    private static final Logger LOGGER = LogManager.getLogger();

    public ExampleMod() {
        LOGGER.info("ModB is on");
    }
}
