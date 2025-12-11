/**
 * Minecraft Mod - By Garrison Moore
 * MODS:
 * - 7 custom blocks with custom textures created in LibreSprite
 * - 2 custom items with custom effects and custom textures created in LibreSprite
 * - 1 custom model made in blockbench (not working)
 * <p>
 * I struggled with getting custom recipes and loot tables to work.
 * It seems the game will not load my data folder at all.
 * After days of reconfiguring and testing, nothing worked.
 * My mod file came to be in such a bad state that it was no longer repairable.
 * <p>
 * I had to resort to restoring an older version of my mod file.
 * I lost loot tables in that process, so those are not present,
 * A single custom recipe still remains in src/main/resources/data/recipes. However, it does not show up in the game.
 * There are no errors in the log files, so I am not sure what is wrong.
 * <p>
 * I added a custom debugger for my hand_cannon.json recipe file.
 * The logger found my custom recipe, but still will not load in the game.
 * <p>
 * Most of my time on this project was spent troubleshooting and not building mods.
 * I am hoping the effort I put into troubleshooting makes up for my lack of mods.
 */

package com.example.examplemod;

import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.item.PrimedTnt;
import net.minecraftforge.event.server.ServerStartingEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.entity.ProjectileImpactEvent;
import net.minecraft.world.entity.projectile.AbstractArrow;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.config.ModConfig;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.*;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.sounds.SoundSource;
import com.mojang.logging.LogUtils;
import net.minecraft.client.Minecraft;

import net.minecraft.world.entity.player.Player;
import net.minecraft.world.level.Level;
import net.minecraft.core.registries.Registries;
import net.minecraft.world.item.*;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.MapColor;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.BuildCreativeModeTabContentsEvent;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import org.slf4j.Logger;

import java.io.IOException;
import java.io.InputStream;


// The value here should match an entry in the META-INF/mods.toml file
@Mod(ExampleMod.MODID)
public class ExampleMod {
    // Define mod id in a common place for everything to reference
    public static final String MODID = "examplemod";
    // Directly reference a slf4j logger
    private static final Logger LOGGER = LogUtils.getLogger();
    // Create a Deferred Register to hold Blocks which will all be registered under the "examplemod" namespace
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, MODID);
    // Create a Deferred Register to hold Items which will all be registered under the "examplemod" namespace
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, MODID);
    // Create a Deferred Register to hold CreativeModeTabs which will all be registered under the "examplemod" namespace
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, MODID);

    ///  CUSTOM MODS BELOW
    // Creates a new Block with the id "examplemod:example_block", combining the namespace and path
    public static final RegistryObject<Block> block1 = BLOCKS.register("block1", () -> new Block(BlockBehaviour.Properties.of().mapColor(MapColor.STONE).noOcclusion()));
    // Creates a new BlockItem with the id "examplemod:example_block", combining the namespace and path
    public static final RegistryObject<Item> block1_item = ITEMS.register("block1", () -> new BlockItem(block1.get(), new Item.Properties()));

    public static final RegistryObject<Block> block2 = BLOCKS.register("block2", () -> new Block(BlockBehaviour.Properties.of().mapColor(MapColor.STONE).noOcclusion()));
    // Creates a new BlockItem with the id "examplemod:example_block", combining the namespace and path
    public static final RegistryObject<Item> block2_item = ITEMS.register("block2", () -> new BlockItem(block2.get(), new Item.Properties()));

    public static final RegistryObject<Block> block3 = BLOCKS.register("block3", () -> new Block(BlockBehaviour.Properties.of().mapColor(MapColor.STONE).noOcclusion()));
    // Creates a new BlockItem with the id "examplemod:example_block", combining the namespace and path
    public static final RegistryObject<Item> block3_item = ITEMS.register("block3", () -> new BlockItem(block3.get(), new Item.Properties()));

    public static final RegistryObject<Block> block4 = BLOCKS.register("block4", () -> new Block(BlockBehaviour.Properties.of().mapColor(MapColor.STONE).noOcclusion()));
    // Creates a new BlockItem with the id "examplemod:example_block", combining the namespace and path
    public static final RegistryObject<Item> block4_item = ITEMS.register("block4", () -> new BlockItem(block4.get(), new Item.Properties()));

    public static final RegistryObject<Block> block5 = BLOCKS.register("block5", () -> new Block(BlockBehaviour.Properties.of().mapColor(MapColor.STONE).noOcclusion()));
    // Creates a new BlockItem with the id "examplemod:example_block", combining the namespace and path
    public static final RegistryObject<Item> block5_item = ITEMS.register("block5", () -> new BlockItem(block5.get(), new Item.Properties()));

    public static final RegistryObject<Block> block6 = BLOCKS.register("block6", () -> new Block(BlockBehaviour.Properties.of().mapColor(MapColor.STONE).noOcclusion()));
    // Creates a new BlockItem with the id "examplemod:example_block", combining the namespace and path
    public static final RegistryObject<Item> block6_item = ITEMS.register("block6", () -> new BlockItem(block6.get(), new Item.Properties()));

    public static final RegistryObject<Block> purpleheartplanks = BLOCKS.register("purpleheartplanks", () -> new Block(BlockBehaviour.Properties.of().mapColor(MapColor.STONE).noOcclusion()));
    // Creates a new BlockItem with the id "examplemod:example_block", combining the namespace and path
    public static final RegistryObject<Item> purpleheartplanks_item = ITEMS.register("purpleheartplanks", () -> new BlockItem(purpleheartplanks.get(), new Item.Properties()));

    // Creates a new food item with the id "examplemod:example_id", nutrition 1 and saturation 2
    public static final RegistryObject<Item> EXAMPLE_ITEM = ITEMS.register("example_item", () -> new Item(new Item.Properties().food(new FoodProperties.Builder()
            .alwaysEdible().nutrition(1).saturationModifier(2f).build())));

    /**
     * Custom Sword Item
     * uses a custom 'sign' texture and spawns TNT at the target location
     */
    public static final RegistryObject<Item> SWORD_0 =
            ///  register a new sword item, DIAMOND tier
            ITEMS.register("sword_0",
                    () -> new SwordItem(
                            Tiers.DIAMOND,
                            new Item.Properties()
                    ) {
                        /// Overriding the onLeftClickEntity method so the sword has custom effects
                        @Override
                        public boolean onLeftClickEntity(ItemStack stack, Player player, Entity entity) {
                            if (player.level().isClientSide) {
                                return false;
                            }

                            /// Boosting the knockback effect greatly
                            if (entity instanceof LivingEntity target) {
                                target.knockback(20.0F, player.getX() - target.getX(), player.getZ() - target.getZ());
                                Level level = player.level();

                                /// spawning a new TNT entity at the target location. Trying to loop for multiple TNT (not working)
                                for (int i = 0; i < 50; i++) {
                                    PrimedTnt tnt = new PrimedTnt(level, target.getX(), target.getY(), target.getZ(), player);
                                    /// quick fuse for instant explosion
                                    tnt.setFuse(1);
                                    level.addFreshEntity(tnt);
                                }
                            }
                            return true;
                        }
                    });

    ///  Hand Cannon item mod.
    public static final RegistryObject<Item> hand_cannon =
            ITEMS.register("hand_cannon",
                    ///  Made the handcannon  a new bow item
                    () -> new BowItem(new Item.Properties()) {
                        /// overriding the onLeftClickEntity so the bow uses custom ammunition
                        @Override
                        public boolean onLeftClickEntity(ItemStack stack, Player player, Entity entity) {
                            if (player.level().isClientSide) {
                                return false;
                            }

                            /// Boosting the knockback effect greatly
                            if (entity instanceof LivingEntity target) {
                                target.knockback(20.0F, player.getX() - target.getX(), player.getZ() - target.getZ());
                                Level level = player.level();

                                /// Making the bow shoot TNT. I tried to put it in a loop and make it shoot multiple, But I don't think it works
                                for (int i = 0; i < 50; i++) {
                                    PrimedTnt tnt = new PrimedTnt(level, target.getX(), target.getY(), target.getZ(), player);
                                    tnt.setFuse(1);
                                    level.addFreshEntity(tnt);
                                }
                            }
                            return true;
                        }

                        /// Override the releaseUsing method so the ammo has max velocity and play a custom sound
                        @Override
                        public void releaseUsing(ItemStack stack, Level level, LivingEntity entity, int timeLeft) {
                            /// Passing '0' as timeLeft simulates the bow being held for the maximum duration,
                            /// resulting in an immediate full-power shot
                            super.releaseUsing(stack, level, entity, 0);
                            if (entity instanceof Player player) {
                                /// create the arrow manually
                                AbstractArrow arrow = ((ArrowItem) Items.ARROW).createArrow(level, new ItemStack(Items.ARROW), player, null);

                                /// Set velocity to MAX (3.0F)
                                arrow.shootFromRotation(player, player.getXRot(), player.getYRot(), 0.0F, 3.0F, 1.0F);

                                /// play a custom 'gunshot' sound. AI provided the logic for this
                                /// Using GENERIC_EXPLODE with pitch 2.0F sounds like a gunshot
                                level.playSound(null, player.getX(), player.getY(), player.getZ(),
                                        SoundEvents.GENERIC_EXPLODE, SoundSource.PLAYERS, 1.0F, 2.0F);

                                /// spawn the arrow
                                if (!level.isClientSide) {
                                    level.addFreshEntity(arrow);
                                }

                            }
                        }
                    });

    // Creates a creative tab with the id "examplemod:example_tab" for the example item, that is placed after the combat tab
    public static final RegistryObject<CreativeModeTab> EXAMPLE_TAB = CREATIVE_MODE_TABS.register("example_tab", () -> CreativeModeTab.builder()
            .withTabsBefore(CreativeModeTabs.COMBAT)
            .icon(() -> EXAMPLE_ITEM.get().getDefaultInstance())
            ///  adding all the custom items here
            .displayItems((parameters, output) -> {
                output.accept(EXAMPLE_ITEM.get());
                output.accept(SWORD_0.get());// Add the example item to the tab. For your own tabs, this method is preferred over the event
                output.accept(hand_cannon.get());
                output.accept(block1.get());
                output.accept(block1_item.get());
                output.accept(block2.get());
                output.accept(block2_item.get());
                output.accept(block3.get());
                output.accept(block3_item.get());
                output.accept(block4.get());
                output.accept(block4_item.get());
                output.accept(block5.get());
                output.accept(block5_item.get());
                output.accept(block6.get());
                output.accept(block6_item.get());
                output.accept(purpleheartplanks.get());
                output.accept(purpleheartplanks_item.get());
            }).build());


    /**
     * This is the instance of the mod as created by Forge
     *
     * I added a custom logger for my hand_cannon recipe since I was having trouble with it.
     * @param context
     */
    public ExampleMod(FMLJavaModLoadingContext context) {
        IEventBus modEventBus = context.getModEventBus();

        // Register the commonSetup method for modloading
        modEventBus.addListener(this::commonSetup);

        // Register the Deferred Register to the mod event bus so blocks get registered
        BLOCKS.register(modEventBus);
        // Register the Deferred Register to the mod event bus so items get registered
        ITEMS.register(modEventBus);
        // Register the Deferred Register to the mod event bus so tabs get registered
        CREATIVE_MODE_TABS.register(modEventBus);

        // Register ourselves for server and other game events we are interested in
        MinecraftForge.EVENT_BUS.register(this);

        // Register the item to a creative tab
        modEventBus.addListener(this::addCreative);

        // Register our mod's ForgeConfigSpec so that Forge can create and load the config file for us
        context.registerConfig(ModConfig.Type.COMMON, Config.SPEC);

        /** Custom debugger for my hand_cannon recipe
         *  I could not get my hand_cannon recipe to work,
         *  so I used this debugger to check if the recipe was being read correctly.
         *  The logger found my custom recipe, but still will not load in game
         *
         *  Debugger was provided by the AI assistant
         */
        // create a new input stream from the hand_cannon.json recipe file
        InputStream is = ExampleMod.class.getResourceAsStream(
                "/data/examplemod/recipes/hand_cannon.json"
        );
        // if the filepath is not found, print an error message
        if (is == null) {
            LOGGER.error(">>> hand_cannon.json NOT FOUND on classpath!");
            // if the filepath is found, log this message and close the stream
        } else {
            LOGGER.info(">>> hand_cannon.json IS present on classpath.");
            try {
                is.close();
            } catch (IOException ignored) {
            }
        }
    }

    private void commonSetup(final FMLCommonSetupEvent event) {
        // Some common setup code
        LOGGER.info("HELLO FROM COMMON SETUP");

        if (Config.logDirtBlock)
            LOGGER.info("DIRT BLOCK >> {}", ForgeRegistries.BLOCKS.getKey(Blocks.DIRT));

        LOGGER.info(Config.magicNumberIntroduction + Config.magicNumber);

        Config.items.forEach((item) -> LOGGER.info("ITEM >> {}", item.toString()));
    }

    /// add custom items to the creative mode tab
    private void addCreative(BuildCreativeModeTabContentsEvent event) {
        if (event.getTabKey() == CreativeModeTabs.BUILDING_BLOCKS) {
            event.accept(block1_item.get());
            event.accept(EXAMPLE_ITEM);
            event.accept(SWORD_0);
            event.accept(hand_cannon.get());
            event.accept(block2_item.get());
            event.accept(block3_item.get());
            event.accept(block4_item.get());
            event.accept(block5_item.get());
            event.accept(block6_item.get());
            event.accept(purpleheartplanks_item.get());
        }
    }

    // You can use SubscribeEvent and let the Event Bus discover methods to call
    @SubscribeEvent
    public void onServerStarting(ServerStartingEvent event) {
        // Do something when the server starts
        LOGGER.info("HELLO from server starting");
    }

    /// creating a custom instance of ProjectileImpactEvent so that the arrow spawns TNT where it hits
    @SubscribeEvent
    public void onProjectileImpact(ProjectileImpactEvent event) {
        /// check if the projectile is an arrow shot from the player
        if (event.getProjectile() instanceof AbstractArrow arrow && arrow.getOwner() instanceof Player player) {
            /// check if the player is holding the hand cannon in either hand
            if (player.getMainHandItem().getItem() == hand_cannon.get() || player.getOffhandItem().getItem() == hand_cannon.get()) {
                /// get the level of the arrow. this represents the world in which the arrow is spawned
                Level level = arrow.level();
                /// if the world is client side
                if (!level.isClientSide) {
                    /// spawn TNT at the arrow's location
                    PrimedTnt tnt = new PrimedTnt(level, arrow.getX(), arrow.getY(), arrow.getZ(), player);
                    tnt.setFuse(5); // short fuse for instant explosion
                    level.addFreshEntity(tnt);
                    /// remove the arrow so it doesn't stick in the ground
                    arrow.discard();
                }
            }
        }
    }


    // You can use EventBusSubscriber to automatically register all static methods in the class annotated with @SubscribeEvent
    @Mod.EventBusSubscriber(modid = MODID, bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
    public static class ClientModEvents {
        @SubscribeEvent
        public static void onClientSetup(FMLClientSetupEvent event) {
            // Some client setup code
            LOGGER.info("HELLO FROM CLIENT SETUP");
            LOGGER.info("MINECRAFT NAME >> {}", Minecraft.getInstance().getUser().getName());
        }

        @SubscribeEvent
        public static void registerLayer(EntityRenderersEvent.RegisterLayerDefinitions event) {
            event.registerLayerDefinition(com.example.examplemod.client.model.friend_Converted.LAYER_LOCATION,
                    com.example.examplemod.client.model.friend_Converted::createBodyLayer);
        }
    }
}
