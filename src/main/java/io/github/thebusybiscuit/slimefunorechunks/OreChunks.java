package io.github.thebusybiscuit.slimefunorechunks;

import org.bstats.bukkit.Metrics;
import org.bukkit.NamespacedKey;
import org.bukkit.plugin.java.JavaPlugin;

import io.github.thebusybiscuit.slimefun4.api.SlimefunAddon;
import io.github.thebusybiscuit.slimefun4.api.items.ItemGroup;
import io.github.thebusybiscuit.slimefun4.api.recipes.RecipeType;
import io.github.thebusybiscuit.slimefun4.implementation.SlimefunItems;
import io.github.thebusybiscuit.slimefun4.libraries.dough.items.CustomItemStack;
import io.github.thebusybiscuit.slimefun4.libraries.dough.skins.PlayerHead;
import io.github.thebusybiscuit.slimefun4.libraries.dough.skins.PlayerSkin;
import io.github.thebusybiscuit.slimefun4.libraries.dough.config.Config;
import io.github.thebusybiscuit.slimefun4.libraries.dough.updater.GitHubBuildsUpdater;

public class OreChunks extends JavaPlugin implements SlimefunAddon {

	@Override
	public void onEnable() {
		Config cfg = new Config(this);
		new Metrics(this, 5683);
		
		if (cfg.getBoolean("options.auto-update") && getDescription().getVersion().startsWith("DEV - ")) {
			new GitHubBuildsUpdater(this, getFile(), "ybw0014/SlimefunOreChunks-CN/master").start();
		}
		
		ItemGroup itemGroup = new ItemGroup(new NamespacedKey(this, "ore_chunks"), new CustomItemStack(PlayerHead.getItemStack(PlayerSkin.fromHashCode("dde8f949bbf3a42782c531fbf8de9dc2d8cd84dd7cb8f5d5328eeda83956aac8")), "&6矿石块"));
		
		new OreChunk(this, itemGroup, "IRON_ORE_CHUNK", "铁矿石块", 4, "44cc1ccc75d0f724af8a5fe273edaf4c6d5951f9e4d038f9f16e4f2673ce3833",
		SlimefunItems.IRON_DUST).register(this);
		
		new OreChunk(this, itemGroup, "GOLD_ORE_CHUNK", "金矿石块", 2, "3184478b211439f3e2c509c3424ea5ff2fce73825c8bebf96cfccd103e4922eb",
		SlimefunItems.GOLD_DUST).register(this);
		
		new OreChunk(this, itemGroup, "COPPER_ORE_CHUNK", "铜矿石块", 5, "60d748757d6efddde852e0a4a1a9b92f2e4c58b1ea9a1731a32f6cedf2c23b36",
		SlimefunItems.COPPER_DUST).register(this);
		
		new OreChunk(this, itemGroup, "TIN_ORE_CHUNK", "锡矿石块", 3, "de2c955177ff65a2d55af17743755090a5a6b68b3586ccbc31a342dad9ef7799",
		SlimefunItems.TIN_DUST).register(this);
		
		new OreChunk(this, itemGroup, "SILVER_ORE_CHUNK", "银矿石块", 2, "dde8f949bbf3a42782c531fbf8de9dc2d8cd84dd7cb8f5d5328eeda83956aac8",
		SlimefunItems.SILVER_DUST).register(this);
		
		new OreChunk(this, itemGroup, "ALUMINUM_ORE_CHUNK", "铝矿石块", 4, "46732368c980b4c27495664bd50b5820cc37c573fb37a88f34c5d3a0dec66219",
		SlimefunItems.ALUMINUM_DUST).register(this);
		
		new OreChunk(this, itemGroup, "LEAD_ORE_CHUNK", "铅矿石块", 2, "2333fcec07c89c5fdb886caf5e3ebf8c6a536dd662b31f91c1a6dbd913bc3db0",
		SlimefunItems.LEAD_DUST).register(this);
		
		new OreChunk(this, itemGroup, "ZINC_ORE_CHUNK", "锌矿石块", 3, "63f82f20266b4b8e0456110379f941fca16413846e231e8ac202dc2caf7ffb41",
		SlimefunItems.ZINC_DUST).register(this);

		new OreChunk(this, itemGroup, "MAGNESIUM_ORE_CHUNK", "镁矿石块", 4, "e8c99d857a5b34331699ce6b5449d8d75f6c50b294ea1a29108f66ca086528bb",
		SlimefunItems.MAGNESIUM_DUST).register(this);

		new OreChunk(this, itemGroup, "NICKEL_ORE_CHUNK", "镍矿石块", "&7可在冶炼炉种烧成锭", 2, "3ba30df8316cdfe3c5b1ad7aa9775c94c3ad5e502ea1254efeb41344f7962381",
		RecipeType.SMELTERY, SlimefunItems.NICKEL_INGOT).register(this);
		
		new OreChunk(this, itemGroup, "COBALT_ORE_CHUNK", "钴矿石块", "&7可在冶炼炉种烧成锭", 1, "ec54a54b1a49c29686be1c6e3e05dd068f85e994c8c893838cc5878b5446bc8a",
		RecipeType.SMELTERY, SlimefunItems.COBALT_INGOT).register(this);
	}

	@Override
	public JavaPlugin getJavaPlugin() {
		return this;
	}

	@Override
	public String getBugTrackerURL() {
		return "https://github.com/ybw0014/SlimefunOreChunks-CN/issues";
	}

}
