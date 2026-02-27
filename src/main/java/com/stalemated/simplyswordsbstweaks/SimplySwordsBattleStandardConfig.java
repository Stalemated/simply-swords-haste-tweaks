package com.stalemated.simplyswordsbstweaks;

import com.stalemated.simplyswordsbstweaks.config.ConfigManager;

public class SimplySwordsBattleStandardConfig {
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
    public static boolean bannerHealingAllowed = true;

    public static void load() {
        ConfigManager config = new ConfigManager("simplyswords_main/battle_standard_tweaks.json");

        galeforceHasteAmplifier = config.getOrDefault("galeforce_haste_amplifier", 7);
        galeforceHasteRadius = config.getOrDefault("galeforce_haste_radius", 3.0f);
        galeforceDamage = config.getOrDefault("galeforce_damage", 1.0f);
        galeforceAOERadius = config.getOrDefault("galeforce_aoe_radius", 2);
        galeforcePainAmplifier = config.getOrDefault("galeforce_pain_amplifier", 49);
        abyssalStandardHasteAmplifier = config.getOrDefault("abyssal_standard_haste_amplifier", 7);
        abyssalStandardHasteRadius = config.getOrDefault("abyssal_standard_haste_radius", 3.0f);
        abyssalStandardAOEHasteAmplifier = config.getOrDefault("abyssal_standard_aoe_haste_amplifier", 2);
        abyssalStandardAOERadius = config.getOrDefault("abyssal_standard_aoe_radius", 6);
        abyssalStandardAOESlownessAmplifier = config.getOrDefault("abyssal_standard_aoe_slowness_amplifier", 0);
        bannerHealingAllowed = config.getOrDefault("banner_healing_allowed", true);
    }
}