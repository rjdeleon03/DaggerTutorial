package com.rjdeleon.daggertutorial.model;

import com.rjdeleon.daggertutorial.model.houses.Boltons;
import com.rjdeleon.daggertutorial.model.houses.Starks;

public class BattleOfBastards {

    public BattleOfBastards() {

        IronBank bank = new IronBank();
        Allies allies = new Allies(bank);

        Starks starks = new Starks(allies, bank);
        Boltons boltons = new Boltons(allies, bank);

        War war = new War(starks, boltons);
        war.prepare();
        war.report();
    }
}
