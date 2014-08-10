package com.engine.dx;

import com.badlogic.gdx.Game;
import com.badlogic.gdx.Screen;
import com.engine.dx.screens.HeavyScreen;
import com.engine.dx.screens.HeavyScreenLoader;

public abstract class GameDX extends Game {
    Screen loadingScreen;

    public void setLoadingScreen(Screen loadingScreen) {
        this.loadingScreen = loadingScreen;
    }

    public void setHeavyScreen(final HeavyScreen screen) {
        if(loadingScreen != null)
            setScreen(loadingScreen);

        new HeavyScreenLoader(this, screen).load();
    }
}
