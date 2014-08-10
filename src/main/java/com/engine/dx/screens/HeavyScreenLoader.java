package com.engine.dx.screens;

import com.engine.dx.GameDX;

public class HeavyScreenLoader {
    HeavyScreen screen;
    GameDX game;

    public HeavyScreenLoader(GameDX game, HeavyScreen screen) {
        this.game = game;
        this.screen = screen;
    }

    public void load() {
        new Thread( new Runnable() {
            @Override
            public void run() {
            screen.load();
            game.setScreen(screen);
            }
        }).start();
    }
}
