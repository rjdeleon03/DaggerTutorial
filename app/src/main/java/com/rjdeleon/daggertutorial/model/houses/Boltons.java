package com.rjdeleon.daggertutorial.model.houses;

import android.util.Log;

import com.rjdeleon.daggertutorial.Constants;
import com.rjdeleon.daggertutorial.model.Allies;
import com.rjdeleon.daggertutorial.model.IronBank;

public class Boltons implements House {

    private Allies allies;
    private IronBank bank;

    public Boltons(Allies allies, IronBank bank) {
        this.allies = allies;
        this.bank = bank;
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
