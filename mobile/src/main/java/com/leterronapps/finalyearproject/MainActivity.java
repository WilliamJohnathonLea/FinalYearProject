package com.leterronapps.finalyearproject;

import android.os.Bundle;

import com.leterronapps.finalyearproject.game2d.CatchAssets;
import com.leterronapps.finalyearproject.game2d.CatchStartScene;
import com.leterronapps.finalyearproject.game3d.InvaderAssets;
import com.leterronapps.finalyearproject.game3d.InvaderScene;
import com.leterronapps.finalyearproject.game3d.InvaderStartScene;
import com.leterronapps.hyperfour.game.HFGame;
import com.leterronapps.hyperfour.graphics.HFScene;

public class MainActivity extends HFGame {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        gameAssets = new InvaderAssets();
        //gameAssets = new CatchAssets();
    }

    @Override
    public HFScene getStartScene() {
        return new InvaderStartScene(this);
        //return new CatchStartScene(this);
    }
}
