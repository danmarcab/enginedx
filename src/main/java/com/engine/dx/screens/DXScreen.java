package com.engine.dx.screens;

import com.badlogic.gdx.ScreenAdapter;
import com.badlogic.gdx.assets.AssetManager;
import com.engine.dx.GameDX;

public class DXScreen extends ScreenAdapter {
    protected GameDX game;

    public DXScreen(GameDX pGame) {
        game = pGame;
    }

    public void load() {
    }

    public void unload() {
    }

    public AssetManager assetManager() {
        return game.assetManager();
    }
}
