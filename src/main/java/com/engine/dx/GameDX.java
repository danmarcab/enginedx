package com.engine.dx;

import com.badlogic.gdx.Game;
import com.badlogic.gdx.Screen;
import com.engine.dx.screens.HeavyScreen;

public abstract class GameDX extends Game {
    Screen loadingScreen;

    public void setLoadingScreen(Screen loadingScreen) {
        this.loadingScreen = loadingScreen;
    }

    public void setHeavyScreen(final HeavyScreen screen) {
        if(loadingScreen != null)
            setScreen(loadingScreen);

        new Thread( new Runnable() {
            @Override
            public void run() {
                screen.load();
                setScreen(screen);
            }
        }).start();
    }
}
