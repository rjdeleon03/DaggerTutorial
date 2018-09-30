package com.rjdeleon.daggertutorial.tutorial_part1.model;

import com.rjdeleon.daggertutorial.tutorial_part1.component.BattleComponent;
import com.rjdeleon.daggertutorial.tutorial_part1.component.DaggerBattleComponent;
import com.rjdeleon.daggertutorial.tutorial_part1.model.services.Cash;
import com.rjdeleon.daggertutorial.tutorial_part1.model.services.Soldiers;
import com.rjdeleon.daggertutorial.tutorial_part1.module.BraavosModule;

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

        Cash cash = new Cash();
        Soldiers soldiers = new Soldiers();

        // Using Dagger 2
        BattleComponent battleComponent = DaggerBattleComponent
                .builder().braavosModule(new BraavosModule(cash, soldiers)).build();
        War war = battleComponent.getWar();
        war.prepare();
        war.report();

        battleComponent.getCash();
        battleComponent.getSoldiers();
    }
}
