package joseangelrd.disc_mod.sound;

import joseangelrd.disc_mod.Music_Disc_Mod;
import net.minecraft.block.jukebox.JukeboxSong;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.sound.SoundEvent;
import net.minecraft.util.Identifier;

public class ModSounds {

    public static final SoundEvent DISCO1 = registerSoundEvent("disc1");
    public static final RegistryKey<JukeboxSong> DISCO1_KEY =
            RegistryKey.of(RegistryKeys.JUKEBOX_SONG, Identifier.of(Music_Disc_Mod.MOD_ID, "disc1"));

    public static final SoundEvent DISCO2 = registerSoundEvent("disc2");
    public static final RegistryKey<JukeboxSong> DISCO2_KEY =
            RegistryKey.of(RegistryKeys.JUKEBOX_SONG, Identifier.of(Music_Disc_Mod.MOD_ID, "disc2"));

    public static final SoundEvent DISCO3 = registerSoundEvent("disc3");
    public static final RegistryKey<JukeboxSong> DISCO3_KEY =
            RegistryKey.of(RegistryKeys.JUKEBOX_SONG, Identifier.of(Music_Disc_Mod.MOD_ID, "disc3"));

    public static final SoundEvent DISCO4 = registerSoundEvent("disc4");
    public static final RegistryKey<JukeboxSong> DISCO4_KEY =
            RegistryKey.of(RegistryKeys.JUKEBOX_SONG, Identifier.of(Music_Disc_Mod.MOD_ID, "disc4"));

    public static final SoundEvent DISCO5 = registerSoundEvent("disc5");
    public static final RegistryKey<JukeboxSong> DISCO5_KEY =
            RegistryKey.of(RegistryKeys.JUKEBOX_SONG, Identifier.of(Music_Disc_Mod.MOD_ID, "disc5"));

    public static final SoundEvent DISCO6 = registerSoundEvent("disc6");
    public static final RegistryKey<JukeboxSong> DISCO6_KEY =
            RegistryKey.of(RegistryKeys.JUKEBOX_SONG, Identifier.of(Music_Disc_Mod.MOD_ID, "disc6"));

    public static final SoundEvent DISCO7 = registerSoundEvent("disc7");
    public static final RegistryKey<JukeboxSong> DISCO7_KEY =
            RegistryKey.of(RegistryKeys.JUKEBOX_SONG, Identifier.of(Music_Disc_Mod.MOD_ID, "disc7"));

    public static final SoundEvent DISCO8 = registerSoundEvent("disc8");
    public static final RegistryKey<JukeboxSong> DISCO8_KEY =
            RegistryKey.of(RegistryKeys.JUKEBOX_SONG, Identifier.of(Music_Disc_Mod.MOD_ID, "disc8"));

    public static final SoundEvent DISCO9 = registerSoundEvent("disc9");
    public static final RegistryKey<JukeboxSong> DISCO9_KEY =
            RegistryKey.of(RegistryKeys.JUKEBOX_SONG, Identifier.of(Music_Disc_Mod.MOD_ID, "disc9"));

    private static SoundEvent registerSoundEvent(String name){
        Identifier id = Identifier.of(Music_Disc_Mod.MOD_ID,name);
        return Registry.register(Registries.SOUND_EVENT, id, SoundEvent.of(id));
    }

    private static void registerSounds(){
        Music_Disc_Mod.LOGGER.info("Registrando Mods Sounds para "+Music_Disc_Mod.MOD_ID);
    }
}
