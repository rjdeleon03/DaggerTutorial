package com.rjdeleon.daggertutorial.di;

import com.rjdeleon.daggertutorial.di.custom.RandomUserApplicationScope;
import com.rjdeleon.daggertutorial.interfaces.RandomUsersApi;
import com.squareup.picasso.Picasso;

import dagger.Component;

@RandomUserApplicationScope
@Component(modules = {
        RandomUsersModule.class,
        PicassoModule.class
})
public interface RandomUserComponent {

    RandomUsersApi getRandomUserService();
    Picasso getPicasso();

}
