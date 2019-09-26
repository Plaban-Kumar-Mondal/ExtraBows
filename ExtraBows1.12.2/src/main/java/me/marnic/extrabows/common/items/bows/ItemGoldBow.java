package me.marnic.extrabows.common.items.bows;

import me.marnic.extrabows.common.config.ExtraBowsConfig;
import me.marnic.extrabows.common.items.BasicBow;
import me.marnic.extrabows.common.items.CustomBowSettings;
import net.minecraft.init.Items;

/**
 * Copyright (c) 24.05.2019
 * Developed by MrMarnic
 * GitHub: https://github.com/MrMarnic
 */
public class ItemGoldBow extends BasicBow {
    public ItemGoldBow() {
        super(new CustomBowSettings("golden_bow", ExtraBowsConfig.GOLD_BOW).setType(Items.GOLD_INGOT));
    }
}
