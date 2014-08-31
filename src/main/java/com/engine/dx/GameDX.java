package com.engine.dx;

import com.badlogic.gdx.Game;
import com.badlogic.gdx.assets.AssetManager;
import com.engine.dx.screens.DXScreen;
import com.engine.dx.screens.LoadingScreen;

public abstract class GameDX extends Game {
    AssetManager assetManager;
    LoadingScreen defaultLoadingScreen;

    public GameDX() {
        assetManager = new AssetManager();
    }

    public void setDefaultLoadingScreen(LoadingScreen loadingScreen) {
        this.defaultLoadingScreen = loadingScreen;
    }

    public void loadScreen(DXScreen screen, LoadingScreen loadingScreen) {
        loadingScreen.loadScreen(screen);
        setScreen(loadingScreen);
    }

    public void loadScreen(DXScreen screen) {
        loadScreen(screen, defaultLoadingScreen);
    }

    public AssetManager assetManager() {
        return assetManager;
    }
}
