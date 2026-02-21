package com.stalemated;

import com.stalemated.config.ConfigManager;

public class SimplySwordsHasteConfig {
    public static int galeforceHasteAmplifier = 7;
    public static int abyssalStandardHasteAmplifier = 7;
    public static float galeforceHasteRadius = 3.0f;
    public static float abyssalStandardHasteRadius = 3.0f;
    public static int abyssalStandardAOERadius = 6;
    public static int abyssalStandardAOEHasteAmplifier = 2;
    public static float galeforceDamage = 1.0f;
    public static int galeforcePainAmplifier = 49;
    public static int galeforceAOERadius = 2;
    public static int abyssalStandardAOESlownessAmplifier = 0;

    public static void load() {
        ConfigManager config = new ConfigManager("simplyswords_main/haste_tweaks.json");

        galeforceHasteAmplifier = ((int) config.getOrDefault("galeforce_haste_amplifier", 7));
        galeforceHasteRadius = config.getOrDefault("galeforce_haste_radius", 3.0f);
        galeforceDamage = config.getOrDefault("galeforce_damage", 1.0f);
        galeforceAOERadius = ((int) config.getOrDefault("galeforce_aoe_radius", 2.0f));
        galeforcePainAmplifier = ((int) config.getOrDefault("galeforce_pain_amplifier", 49));
        abyssalStandardHasteAmplifier = ((int) config.getOrDefault("abyssal_standard_haste_amplifier", 7));
        abyssalStandardHasteRadius = config.getOrDefault("abyssal_standard_haste_radius", 3.0f);
        abyssalStandardAOEHasteAmplifier = ((int) config.getOrDefault("abyssal_standard_aoe_haste_amplifier", 2));
        abyssalStandardAOERadius = ((int) config.getOrDefault("abyssal_standard_aoe_radius", 6.0f));
        abyssalStandardAOESlownessAmplifier = ((int) config.getOrDefault("abyssal_standard_aoe_slowness_amplifier", 0));
    }
}