package com.rjdeleon.daggertutorial.component;

import com.rjdeleon.daggertutorial.model.War;
import com.rjdeleon.daggertutorial.model.services.Cash;
import com.rjdeleon.daggertutorial.model.services.Soldiers;
import com.rjdeleon.daggertutorial.module.BraavosModule;

import dagger.Component;

@Component(modules = BraavosModule.class)
public interface BattleComponent {

    War getWar();

    Cash getCash();

    Soldiers getSoldiers();

}
