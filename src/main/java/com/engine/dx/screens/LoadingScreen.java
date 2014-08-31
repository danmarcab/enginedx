package com.engine.dx.screens;

import com.engine.dx.GameDX;

public class LoadingScreen extends DXScreen {

    DXScreen currentScreen;

    public LoadingScreen(GameDX game) {
        super(game);
        currentScreen = null;
    }

    public void loadScreen(DXScreen screen) {
        // load the screen before unloading the previous one to
        // prevent unloading and then loading same asset again
        screen.load();

        if(currentScreen != null) {
            currentScreen.unload();
        }
        currentScreen = screen;
    }

    @Override
    public final void render(float delta) {
        if(assetManager().update() && splashFinished()) {
            game.setScreen(currentScreen);
        }
        renderLoading(delta);
    }

    public void renderLoading(float delta) {
    }

    public boolean splashFinished() {
        return true;
    }
}
