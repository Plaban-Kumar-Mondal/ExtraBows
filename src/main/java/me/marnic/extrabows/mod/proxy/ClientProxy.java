package me.marnic.extrabows.mod.proxy;

import me.marnic.extrabows.mod.input.ExtraBowsInputHandler;

/**
 * Copyright (c) 30.05.2019
 * Developed by MrMarnic
 * GitHub: https://github.com/MrMarnic
 */
public class ClientProxy extends CommonProxy{
    @Override
    public void handleInit() {
        ExtraBowsInputHandler.registerKeys();
    }
}
