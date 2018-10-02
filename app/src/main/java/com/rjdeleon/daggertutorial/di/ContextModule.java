package com.rjdeleon.daggertutorial.di;

import android.content.Context;

import com.rjdeleon.daggertutorial.di.custom.RandomUserApplicationScope;

import javax.inject.Named;

import dagger.Module;
import dagger.Provides;

@Module
public class ContextModule {

    private Context context;

    public ContextModule(Context context) {
        this.context = context;
    }

    @Named("application_context")
    @RandomUserApplicationScope
    @Provides
    public Context context()
    {
        return context.getApplicationContext();
    }
}
