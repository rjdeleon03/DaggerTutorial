package com.rjdeleon.daggertutorial.tutorial_part1.model.houses;

import android.util.Log;

import com.rjdeleon.daggertutorial.Constants;
import com.rjdeleon.daggertutorial.tutorial_part1.model.Allies;
import com.rjdeleon.daggertutorial.tutorial_part1.model.IronBank;

import javax.inject.Inject;

public class Boltons implements House {

    private Allies allies;
    private IronBank bank;

    @Inject
    public Boltons() {
    }

    @Override
    public void prepareForWar() {
        Log.i(Constants.LOG_TAG, this.getClass().getSimpleName()+" prepared for war!");
    }

    @Override
    public void reportForWar() {
        Log.i(Constants.LOG_TAG, this.getClass().getSimpleName()+" reporting...");
    }
}
