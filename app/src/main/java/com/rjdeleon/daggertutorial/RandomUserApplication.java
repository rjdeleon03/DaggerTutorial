package com.rjdeleon.daggertutorial;

import android.app.Application;
import android.support.v7.app.AppCompatActivity;

import com.rjdeleon.daggertutorial.di.ContextModule;
import com.rjdeleon.daggertutorial.di.DaggerRandomUserComponent;
import com.rjdeleon.daggertutorial.di.RandomUserComponent;

import timber.log.Timber;

public class RandomUserApplication extends Application {

    private RandomUserComponent randomUserApplicationComponent;

    public static RandomUserApplication get(AppCompatActivity activity) {
        return (RandomUserApplication) activity.getApplication();
    }

    @Override
    public void onCreate() {
        super.onCreate();
        Timber.plant(new Timber.DebugTree());

        randomUserApplicationComponent = DaggerRandomUserComponent.builder()
                .contextModule(new ContextModule(this))
                .build();
    }

    public RandomUserComponent getRandomUserApplicationComponent() {
        return randomUserApplicationComponent;
    }
}
