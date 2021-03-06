package com.leterronapps.finalyearproject;

import android.os.Bundle;

import com.leterronapps.hyperfour.game.HFGame;
import com.leterronapps.hyperfour.graphics.HFScene;

public class MainActivity extends HFGame {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        gameAssets = new CatchAssets();
    }

    @Override
    public HFScene getStartScene() {
        return new CatchStartScene(this);
    }
}
