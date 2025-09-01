package joseangelrd.disc_mod.util;


import net.fabricmc.fabric.api.loot.v3.LootTableEvents;
import joseangelrd.disc_mod.item.disc_item;
import net.minecraft.loot.LootPool;
import net.minecraft.loot.LootTable;
import net.minecraft.loot.condition.RandomChanceLootCondition;
import net.minecraft.loot.entry.ItemEntry;
import net.minecraft.loot.function.SetCountLootFunction;
import net.minecraft.loot.provider.number.ConstantLootNumberProvider;
import net.minecraft.loot.provider.number.UniformLootNumberProvider;
import net.minecraft.util.Identifier;
import net.minecraft.item.Items;


public class ModLootTableModifiers {
    //disc 1
    private static final Identifier TRAIL_RUINS_DISC1_COMMON
            = Identifier.of("minecraft", "archaeology/trail_ruins_common");

    //disc 2
    private static final Identifier WOODLAND_MANSION_DISC2
            = Identifier.of("minecraft", "chests/woodland_mansion");

    //disc 3
    private static final Identifier DESERT_PYRAMID_DISC3
            = Identifier.of("minecraft", "chests/desert_pyramid");

    //disc 4
    private static final Identifier BARCO_HUNDIDO_DISC4
            = Identifier.of("minecraft", "chests/shipwreck_treasure");
    private static final Identifier COFRE_ARENA_DISC4
            = Identifier.of("minecraft", "chests/buried_treasure");

    //disc 5
    private static final Identifier MINESHAFT_DISC5
            = Identifier.of("minecraft", "chests/abandoned_mineshaft");
    private static final Identifier MONSTER_ROOM_DISC5
            = Identifier.of("minecraft", "chests/simple_dungeon");

    //disc 6
    private static final Identifier DESERT_HOUSE_DISC6
            = Identifier.of("minecraft", "chests/village/village_desert_house");
    private static final Identifier PLAINS_HOUSE_DISC6
            = Identifier.of("minecraft", "chests/village/village_plains_house");
    private static final Identifier SAVANNA_HOUSE_DISC6
            = Identifier.of("minecraft", "chests/village/village_savanna_house");
    private static final Identifier TAIGA_HOUSE_DISC6
            = Identifier.of("minecraft", "chests/village/village_taiga_house");
    private static final Identifier SNOWY_HOUSE_DISC6
            = Identifier.of("minecraft", "chests/village/village_snowy_house");

    //disc 7
    //stronghold
    private static final Identifier CORRIDOR_STRONGHOLD_DISC7
            = Identifier.of("minecraft", "chests/stronghold_corridor");
    private static final Identifier LIBRARY_STRONGHOLD_DISC7
            = Identifier.of("minecraft", "chests/stronghold_library");
    private static final Identifier CROSSING_STRONGHOLD_DISC7
            = Identifier.of("minecraft", "chests/stronghold_crossing");
    //end
    private static final Identifier ENDCITY_DISC7
            = Identifier.of("minecraft", "chests/end_city_treasure");

    //disc 8
    //stronghold
    private static final Identifier CORRIDOR_STRONGHOLD_DISC8
            = Identifier.of("minecraft", "chests/stronghold_corridor");
    private static final Identifier LIBRARY_STRONGHOLD_DISC8
            = Identifier.of("minecraft", "chests/stronghold_library");
    private static final Identifier CROSSING_STRONGHOLD_DISC8
            = Identifier.of("minecraft", "chests/stronghold_crossing");

    //ruined portal
    private static final Identifier RUINED_PORTAL_DISC8
            = Identifier.of("minecraft", "chests/ruined_portal");

    //disc 9
    private static final Identifier ANCIENT_CITY_DISC9
            = Identifier.of("minecraft", "chests/ancient_city");


    public static void modifyLootTables() {
        LootTableEvents.REPLACE.register((key, originalTable, source, registry) -> {

            if(TRAIL_RUINS_DISC1_COMMON.equals(key.getValue())) {
                    LootTable.Builder tableBuilder = LootTable.builder();
                    LootPool.Builder poolBuilder = LootPool.builder()
                            .rolls(ConstantLootNumberProvider.create(1))
                            .conditionally(RandomChanceLootCondition.builder(1.0f)) // Drops 100% of the time
                            .with(ItemEntry.builder(disc_item.Disc1))
                            .with(ItemEntry.builder(Items.EMERALD).weight(2))
                            .with(ItemEntry.builder(Items.WHEAT).weight(2))
                            .with(ItemEntry.builder(Items.WOODEN_HOE).weight(2))
                            .with(ItemEntry.builder(Items.CLAY_BALL).weight(2))
                            .with(ItemEntry.builder(Items.BRICK).weight(2))
                            .with(ItemEntry.builder(Items.YELLOW_DYE).weight(2))
                            .with(ItemEntry.builder(Items.BLUE_DYE).weight(2))
                            .with(ItemEntry.builder(Items.LIGHT_BLUE_DYE).weight(2))
                            .with(ItemEntry.builder(Items.WHITE_DYE).weight(2))
                            .with(ItemEntry.builder(Items.ORANGE_DYE).weight(2))
                            .with(ItemEntry.builder(Items.RED_CANDLE).weight(2))
                            .with(ItemEntry.builder(Items.GREEN_CANDLE).weight(2))
                            .with(ItemEntry.builder(Items.PURPLE_CANDLE).weight(2))
                            .with(ItemEntry.builder(Items.BROWN_CANDLE).weight(2))
                            .with(ItemEntry.builder(Items.MAGENTA_STAINED_GLASS_PANE))
                            .with(ItemEntry.builder(Items.PINK_STAINED_GLASS_PANE))
                            .with(ItemEntry.builder(Items.BLUE_STAINED_GLASS_PANE))
                            .with(ItemEntry.builder(Items.LIGHT_BLUE_STAINED_GLASS_PANE))
                            .with(ItemEntry.builder(Items.RED_STAINED_GLASS_PANE))
                            .with(ItemEntry.builder(Items.YELLOW_STAINED_GLASS_PANE))
                            .with(ItemEntry.builder(Items.PURPLE_STAINED_GLASS_PANE))
                            .with(ItemEntry.builder(Items.SPRUCE_HANGING_SIGN))
                            .with(ItemEntry.builder(Items.OAK_HANGING_SIGN))
                            .with(ItemEntry.builder(Items.GOLD_NUGGET))
                            .with(ItemEntry.builder(Items.COAL))
                            .with(ItemEntry.builder(Items.WHEAT_SEEDS))
                            .with(ItemEntry.builder(Items.BEETROOT_SEEDS))
                            .with(ItemEntry.builder(Items.DEAD_BUSH))
                            .with(ItemEntry.builder(Items.FLOWER_POT))
                            .with(ItemEntry.builder(Items.STRING))
                            .with(ItemEntry.builder(Items.LEAD))
                            .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1.0f, 2.0f)).build());

                    tableBuilder.pool(poolBuilder.build());
                    return tableBuilder.build();
            }

                return originalTable;
        });

        LootTableEvents.MODIFY.register((registryKey, builder, lootTableSource, wrapperLookup) -> {

            //disc 2
            if(WOODLAND_MANSION_DISC2.equals(registryKey.getValue())) {
                LootPool.Builder poolBuilder = LootPool.builder()
                        .rolls(ConstantLootNumberProvider.create(1))
                        .conditionally(RandomChanceLootCondition.builder(0.25f))
                        .with(ItemEntry.builder(disc_item.Disc2));

                builder.pool(poolBuilder.build());
            }

            //disc 3
            if(DESERT_PYRAMID_DISC3.equals(registryKey.getValue())) {
                LootPool.Builder poolBuilder = LootPool.builder()
                        .rolls(ConstantLootNumberProvider.create(1))
                        .conditionally(RandomChanceLootCondition.builder(0.15f))
                        .with(ItemEntry.builder(disc_item.Disc3));

                builder.pool(poolBuilder.build());
            }

            //disc 4

            if(BARCO_HUNDIDO_DISC4.equals(registryKey.getValue())) {
                LootPool.Builder poolBuilder = LootPool.builder()
                        .rolls(ConstantLootNumberProvider.create(1))
                        .conditionally(RandomChanceLootCondition.builder(0.15f))
                        .with(ItemEntry.builder(disc_item.Disc4));

                builder.pool(poolBuilder.build());
            }

            if(COFRE_ARENA_DISC4.equals(registryKey.getValue())) {
                LootPool.Builder poolBuilder = LootPool.builder()
                        .rolls(ConstantLootNumberProvider.create(1))
                        .conditionally(RandomChanceLootCondition.builder(0.45f))
                        .with(ItemEntry.builder(disc_item.Disc4));

                builder.pool(poolBuilder.build());
            }

            //disc 5
            if(MINESHAFT_DISC5.equals(registryKey.getValue())) {
                LootPool.Builder poolBuilder = LootPool.builder()
                        .rolls(ConstantLootNumberProvider.create(1))
                        .conditionally(RandomChanceLootCondition.builder(0.15f))
                        .with(ItemEntry.builder(disc_item.Disc5));

                builder.pool(poolBuilder.build());
            }

            if(MONSTER_ROOM_DISC5.equals(registryKey.getValue())) {
                LootPool.Builder poolBuilder = LootPool.builder()
                        .rolls(ConstantLootNumberProvider.create(1))
                        .conditionally(RandomChanceLootCondition.builder(0.30f))
                        .with(ItemEntry.builder(disc_item.Disc5));

                builder.pool(poolBuilder.build());
            }

            //disc 6
            if(DESERT_HOUSE_DISC6.equals(registryKey.getValue())) {
                LootPool.Builder poolBuilder = LootPool.builder()
                        .rolls(ConstantLootNumberProvider.create(1))
                        .conditionally(RandomChanceLootCondition.builder(0.10f))
                        .with(ItemEntry.builder(disc_item.Disc6));

                builder.pool(poolBuilder.build());
            }

            if(TAIGA_HOUSE_DISC6.equals(registryKey.getValue())) {
                LootPool.Builder poolBuilder = LootPool.builder()
                        .rolls(ConstantLootNumberProvider.create(1))
                        .conditionally(RandomChanceLootCondition.builder(0.10f))
                        .with(ItemEntry.builder(disc_item.Disc6));

                builder.pool(poolBuilder.build());
            }

            if(PLAINS_HOUSE_DISC6.equals(registryKey.getValue())) {
                LootPool.Builder poolBuilder = LootPool.builder()
                        .rolls(ConstantLootNumberProvider.create(1))
                        .conditionally(RandomChanceLootCondition.builder(0.10f))
                        .with(ItemEntry.builder(disc_item.Disc6));

                builder.pool(poolBuilder.build());
            }

            if(SAVANNA_HOUSE_DISC6.equals(registryKey.getValue())) {
                LootPool.Builder poolBuilder = LootPool.builder()
                        .rolls(ConstantLootNumberProvider.create(1))
                        .conditionally(RandomChanceLootCondition.builder(0.10f))
                        .with(ItemEntry.builder(disc_item.Disc6));

                builder.pool(poolBuilder.build());
            }

            if(SNOWY_HOUSE_DISC6.equals(registryKey.getValue())) {
                LootPool.Builder poolBuilder = LootPool.builder()
                        .rolls(ConstantLootNumberProvider.create(1))
                        .conditionally(RandomChanceLootCondition.builder(0.10f))
                        .with(ItemEntry.builder(disc_item.Disc6));

                builder.pool(poolBuilder.build());
            }

            //disc 7
            if(CORRIDOR_STRONGHOLD_DISC7.equals(registryKey.getValue())) {
                LootPool.Builder poolBuilder = LootPool.builder()
                        .rolls(ConstantLootNumberProvider.create(1))
                        .conditionally(RandomChanceLootCondition.builder(0.01f))
                        .with(ItemEntry.builder(disc_item.Disc7));

                builder.pool(poolBuilder.build());
            }

            if(LIBRARY_STRONGHOLD_DISC7.equals(registryKey.getValue())) {
                LootPool.Builder poolBuilder = LootPool.builder()
                        .rolls(ConstantLootNumberProvider.create(1))
                        .conditionally(RandomChanceLootCondition.builder(0.01f))
                        .with(ItemEntry.builder(disc_item.Disc7));

                builder.pool(poolBuilder.build());
            }

            if(CROSSING_STRONGHOLD_DISC7.equals(registryKey.getValue())) {
                LootPool.Builder poolBuilder = LootPool.builder()
                        .rolls(ConstantLootNumberProvider.create(1))
                        .conditionally(RandomChanceLootCondition.builder(0.01f))
                        .with(ItemEntry.builder(disc_item.Disc7));

                builder.pool(poolBuilder.build());
            }

            if(ENDCITY_DISC7.equals(registryKey.getValue())) {
                LootPool.Builder poolBuilder = LootPool.builder()
                        .rolls(ConstantLootNumberProvider.create(1))
                        .conditionally(RandomChanceLootCondition.builder(0.25f))
                        .with(ItemEntry.builder(disc_item.Disc7));

                builder.pool(poolBuilder.build());
            }

            //disc 8
            if(CORRIDOR_STRONGHOLD_DISC8.equals(registryKey.getValue())) {
                LootPool.Builder poolBuilder = LootPool.builder()
                        .rolls(ConstantLootNumberProvider.create(1))
                        .conditionally(RandomChanceLootCondition.builder(0.3f))
                        .with(ItemEntry.builder(disc_item.Disc8));

                builder.pool(poolBuilder.build());
            }

            if(LIBRARY_STRONGHOLD_DISC8.equals(registryKey.getValue())) {
                LootPool.Builder poolBuilder = LootPool.builder()
                        .rolls(ConstantLootNumberProvider.create(1))
                        .conditionally(RandomChanceLootCondition.builder(0.3f))
                        .with(ItemEntry.builder(disc_item.Disc8));

                builder.pool(poolBuilder.build());
            }

            if(CROSSING_STRONGHOLD_DISC8.equals(registryKey.getValue())) {
                LootPool.Builder poolBuilder = LootPool.builder()
                        .rolls(ConstantLootNumberProvider.create(1))
                        .conditionally(RandomChanceLootCondition.builder(0.3f))
                        .with(ItemEntry.builder(disc_item.Disc8));

                builder.pool(poolBuilder.build());
            }

            if(RUINED_PORTAL_DISC8.equals(registryKey.getValue())) {
                LootPool.Builder poolBuilder = LootPool.builder()
                        .rolls(ConstantLootNumberProvider.create(1))
                        .conditionally(RandomChanceLootCondition.builder(0.05f))
                        .with(ItemEntry.builder(disc_item.Disc8));

                builder.pool(poolBuilder.build());
            }

            //disc 9
            if(ANCIENT_CITY_DISC9.equals(registryKey.getValue())) {
                LootPool.Builder poolBuilder = LootPool.builder()
                        .rolls(ConstantLootNumberProvider.create(1))
                        .conditionally(RandomChanceLootCondition.builder(0.005f))
                        .with(ItemEntry.builder(disc_item.Disc9));

                builder.pool(poolBuilder.build());
            }

            if(ANCIENT_CITY_DISC9.equals(registryKey.getValue())) {
                LootPool.Builder poolBuilder = LootPool.builder()
                        .rolls(ConstantLootNumberProvider.create(1))
                        .conditionally(RandomChanceLootCondition.builder(0.35f))
                        .with(ItemEntry.builder(disc_item.Disc9_fragment));

                builder.pool(poolBuilder.build());
            }

        });
    }
}