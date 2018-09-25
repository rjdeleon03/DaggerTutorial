package com.rjdeleon.daggertutorial;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.rjdeleon.daggertutorial.model.BattleOfBastards;
import com.rjdeleon.daggertutorial.model.War;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        BattleOfBastards battle = new BattleOfBastards();
    }
}
