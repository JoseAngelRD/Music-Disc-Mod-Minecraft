package joseangelrd.disc_mod.item;

import joseangelrd.disc_mod.Music_Disc_Mod;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;


public class disc_items_inventory_group {
        public static final ItemGroup DISC_ITEM_GROUP = Registry.register(Registries.ITEM_GROUP,
                Identifier.of(Music_Disc_Mod.MOD_ID,"disc_items"),
                FabricItemGroup.builder().icon(()-> new ItemStack(disc_item.Disc1))  //icono de la foto de fuera
                        .displayName(Text.translatable("itemgroup.disc_mod.disc_items"))
                        .entries((displayContext, entries) -> {
                            entries.add(disc_item.Disc1);
                            entries.add(disc_item.Disc2);
                            entries.add(disc_item.Disc3);
                            entries.add(disc_item.Disc4);
                            entries.add(disc_item.Disc5);
                            entries.add(disc_item.Disc6);
                            entries.add(disc_item.Disc7);
                            entries.add(disc_item.Disc8);
                            entries.add(disc_item.Disc9);

                            entries.add(disc_item.Disc9_fragment);

                        }).build());

        public static void registerItemGroups() {
            Music_Disc_Mod.LOGGER.info("Registering Item Groups for " + Music_Disc_Mod.MOD_ID);
        }
    }


