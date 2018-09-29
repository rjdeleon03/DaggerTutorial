package com.rjdeleon.daggertutorial.model;

import com.rjdeleon.daggertutorial.model.houses.Boltons;
import com.rjdeleon.daggertutorial.model.houses.Starks;

import javax.inject.Inject;

public class War {

    private Starks starks;
    private Boltons boltons;

    @Inject
    public War(Starks starks, Boltons boltons) {
        this.starks = starks;
        this.boltons = boltons;
    }

    public void prepare() {
        starks.prepareForWar();
        boltons.prepareForWar();
    }

    public void report() {
        starks.reportForWar();
        boltons.reportForWar();
    }
}
