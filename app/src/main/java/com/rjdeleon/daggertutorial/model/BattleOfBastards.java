package com.rjdeleon.daggertutorial.model;

import com.rjdeleon.daggertutorial.component.BattleComponent;
import com.rjdeleon.daggertutorial.component.DaggerBattleComponent;
import com.rjdeleon.daggertutorial.model.houses.Boltons;
import com.rjdeleon.daggertutorial.model.houses.Starks;

public class BattleOfBastards {

    public BattleOfBastards() {

//        Manual DI
//        IronBank bank = new IronBank();
//        Allies allies = new Allies(bank);
//
//        Starks starks = new Starks(allies, bank);
//        Boltons boltons = new Boltons(allies, bank);
//
//        War war = new War(starks, boltons);
//        war.prepare();
//        war.report();

        // Using Dagger 2
        BattleComponent battleComponent = DaggerBattleComponent.create();
        War war = battleComponent.getWar();
        war.prepare();
        war.report();
    }
}
