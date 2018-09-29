package com.rjdeleon.daggertutorial.model;

import com.rjdeleon.daggertutorial.component.BattleComponent;
import com.rjdeleon.daggertutorial.component.DaggerBattleComponent;
import com.rjdeleon.daggertutorial.model.houses.Boltons;
import com.rjdeleon.daggertutorial.model.houses.Starks;
import com.rjdeleon.daggertutorial.model.services.Cash;
import com.rjdeleon.daggertutorial.model.services.Soldiers;
import com.rjdeleon.daggertutorial.module.BraavosModule;

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
