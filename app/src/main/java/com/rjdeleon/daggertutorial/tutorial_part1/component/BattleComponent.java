package com.rjdeleon.daggertutorial.tutorial_part1.component;

import com.rjdeleon.daggertutorial.tutorial_part1.model.War;
import com.rjdeleon.daggertutorial.tutorial_part1.model.services.Cash;
import com.rjdeleon.daggertutorial.tutorial_part1.model.services.Soldiers;
import com.rjdeleon.daggertutorial.tutorial_part1.module.BraavosModule;

import dagger.Component;

@Component(modules = BraavosModule.class)
public interface BattleComponent {

    War getWar();

    Cash getCash();

    Soldiers getSoldiers();

}
