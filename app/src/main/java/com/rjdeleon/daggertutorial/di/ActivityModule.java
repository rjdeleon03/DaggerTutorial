package com.rjdeleon.daggertutorial.di;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;

import com.rjdeleon.daggertutorial.di.custom.RandomUserApplicationScope;

import javax.inject.Named;

import dagger.Module;
import dagger.Provides;

@Module
public class ActivityModule {

    private final Context context;

    public ActivityModule(AppCompatActivity context) {
        this.context = context;
    }

    @Named("activity_context")
    @RandomUserApplicationScope
    @Provides
    public Context context() {
        return context;
    }
}
