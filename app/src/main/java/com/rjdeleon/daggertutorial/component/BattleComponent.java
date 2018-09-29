package com.rjdeleon.daggertutorial.component;

import com.rjdeleon.daggertutorial.model.War;

import dagger.Component;

@Component
public interface BattleComponent {

    War getWar();
}
