package joseangelrd.disc_mod.item;

import joseangelrd.disc_mod.Music_Disc_Mod;
import joseangelrd.disc_mod.sound.ModSounds;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.util.Identifier;

public class disc_item {

    public static final Item Disc1 = registerItem("disc1", new Item(new Item.Settings().jukeboxPlayable(ModSounds.DISCO1_KEY).maxCount(1).registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(Music_Disc_Mod.MOD_ID,"disc1")))));
    public static final Item Disc2 = registerItem("disc2", new Item(new Item.Settings().jukeboxPlayable(ModSounds.DISCO2_KEY).maxCount(1).registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(Music_Disc_Mod.MOD_ID,"disc2")))));
    public static final Item Disc3 = registerItem("disc3", new Item(new Item.Settings().jukeboxPlayable(ModSounds.DISCO3_KEY).maxCount(1).registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(Music_Disc_Mod.MOD_ID,"disc3")))));
    public static final Item Disc4 = registerItem("disc4", new Item(new Item.Settings().jukeboxPlayable(ModSounds.DISCO4_KEY).maxCount(1).registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(Music_Disc_Mod.MOD_ID,"disc4")))));
    public static final Item Disc5 = registerItem("disc5", new Item(new Item.Settings().jukeboxPlayable(ModSounds.DISCO5_KEY).maxCount(1).registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(Music_Disc_Mod.MOD_ID,"disc5")))));
    public static final Item Disc6 = registerItem("disc6", new Item(new Item.Settings().jukeboxPlayable(ModSounds.DISCO6_KEY).maxCount(1).registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(Music_Disc_Mod.MOD_ID,"disc6")))));
    public static final Item Disc7 = registerItem("disc7", new Item(new Item.Settings().jukeboxPlayable(ModSounds.DISCO7_KEY).maxCount(1).registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(Music_Disc_Mod.MOD_ID,"disc7")))));
    public static final Item Disc8 = registerItem("disc8", new Item(new Item.Settings().jukeboxPlayable(ModSounds.DISCO8_KEY).maxCount(1).registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(Music_Disc_Mod.MOD_ID,"disc8")))));
    public static final Item Disc9 = registerItem("disc9", new Item(new Item.Settings().jukeboxPlayable(ModSounds.DISCO9_KEY).maxCount(1).registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(Music_Disc_Mod.MOD_ID,"disc9")))));

    public static final Item Disc9_fragment = registerItem("disc9_fragment", new Item(new Item.Settings().registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(Music_Disc_Mod.MOD_ID,"disc9_fragment")))));

    private static Item registerItem(String name, Item item){
        return Registry.register(Registries.ITEM, Identifier.of(Music_Disc_Mod.MOD_ID, name), item);
    }

    public static void registerModItems(){
        Music_Disc_Mod.LOGGER.info("Registering items for "+ Music_Disc_Mod.MOD_ID);

        //añadir los items en tools. Cambiado a un nuevo grupo personal creado disc item inventary group
        /*
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.TOOLS).register(entries -> {
            entries.add(Disc1);
            entries.add(Disc2);
            entries.add(Disc3);
            entries.add(Disc4);
            entries.add(Disc5);
            entries.add(Disc6);
            entries.add(Disc7);
            entries.add(Disc8);
            entries.add(Disc9);

            entries.add(Disc9_fragment);
        });
        */
    }
}
