package com.rjdeleon.daggertutorial.MainActivityFeature;

import com.rjdeleon.daggertutorial.adapter.RandomUserAdapter;
import com.rjdeleon.daggertutorial.di.RandomUserComponent;
import com.rjdeleon.daggertutorial.interfaces.RandomUsersApi;

import dagger.Component;

@Component(modules = MainActivityModule.class,
        dependencies = RandomUserComponent.class)
@MainActivityScope
public interface MainActivityComponent {

    RandomUserAdapter getRandomUserAdapter();

    RandomUsersApi getRandomUserService();
}
