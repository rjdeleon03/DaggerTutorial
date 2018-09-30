package com.rjdeleon.daggertutorial.tutorial_part1.model.houses;

import android.util.Log;

import com.rjdeleon.daggertutorial.Constants;
import com.rjdeleon.daggertutorial.tutorial_part1.model.Allies;
import com.rjdeleon.daggertutorial.tutorial_part1.model.IronBank;

import javax.inject.Inject;

public class Starks implements House {

    private Allies allies;
    private IronBank bank;

    @Inject
    public Starks() {
    }

    @Override
    public void prepareForWar() {
        Log.d(Constants.LOG_TAG, this.getClass().getSimpleName()+" prepared for war!");
    }

    @Override
    public void reportForWar() {
        Log.d(Constants.LOG_TAG, this.getClass().getSimpleName()+" reporting...");
    }
}
