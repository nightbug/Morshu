package Morshu;


import basemod.AutoAdd;
import basemod.BaseMod;
import basemod.helpers.RelicType;
import basemod.interfaces.*;
import com.badlogic.gdx.Gdx;
import com.evacipated.cardcrawl.mod.stslib.Keyword;
import com.evacipated.cardcrawl.modthespire.lib.SpireInitializer;
import com.google.gson.Gson;
import com.megacrit.cardcrawl.localization.CardStrings;
import com.megacrit.cardcrawl.localization.CharacterStrings;
import com.megacrit.cardcrawl.localization.RelicStrings;
import com.megacrit.cardcrawl.localization.UIStrings;
import com.megacrit.cardcrawl.unlock.UnlockTracker;

import java.nio.charset.StandardCharsets;

@SuppressWarnings({"unused", "WeakerAccess"})
@SpireInitializer
public class Morshu implements EditStringsSubscriber {

    private static String modID = "morshu";
    public static String getModID() {
        return modID;
    }
    public static String makeID(String idText) {
        return getModID() + ":" + idText;
    }

    public Morshu() {
        BaseMod.subscribe(this);
    }

    public static void initialize() {
        Morshu morshu = new Morshu();
    }

    @Override
    public void receiveEditStrings() {
        BaseMod.loadCustomStringsFile(CharacterStrings.class, getModID() + "Resources/localization/eng/Char.json");
    }
}
