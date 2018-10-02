package com.rjdeleon.daggertutorial.MainActivityFeature;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.rjdeleon.daggertutorial.R;
import com.rjdeleon.daggertutorial.RandomUserApplication;
import com.rjdeleon.daggertutorial.adapter.RandomUserAdapter;
import com.rjdeleon.daggertutorial.di.ContextModule;
import com.rjdeleon.daggertutorial.di.DaggerRandomUserComponent;
import com.rjdeleon.daggertutorial.di.RandomUserComponent;
import com.rjdeleon.daggertutorial.interfaces.RandomUsersApi;
import com.rjdeleon.daggertutorial.model.RandomUsers;
import com.squareup.picasso.Picasso;

import javax.inject.Inject;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import timber.log.Timber;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerView;

    @Inject
    RandomUserAdapter mAdapter;

    @Inject
    RandomUsersApi randomUsersApi;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initViews();

        Timber.plant(new Timber.DebugTree());

        MainActivityComponent mainActivityComponent = DaggerMainActivityComponent.builder()
                .mainActivityModule(new MainActivityModule(this))
                .randomUserComponent(RandomUserApplication.get(this).getRandomUserApplicationComponent())
                .build();
        mainActivityComponent.injectMainActivity(this);

        populateUsers();
    }

    private void initViews() {
        recyclerView = findViewById(R.id.recyclerView);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
    }

    public void populateUsers() {
        Call<RandomUsers> randomUsersCall = randomUsersApi.getRandomUsers(10);
        randomUsersCall.enqueue(new Callback<RandomUsers>() {
            @Override
            public void onResponse(Call<RandomUsers> call, Response<RandomUsers> response) {
                if (response.isSuccessful()) {
                    mAdapter.setItems(response.body().getResults());
                    recyclerView.setAdapter(mAdapter);
                }
            }

            @Override
            public void onFailure(Call<RandomUsers> call, Throwable t) {
                Timber.i(t.getMessage());
            }
        });
    }
}
