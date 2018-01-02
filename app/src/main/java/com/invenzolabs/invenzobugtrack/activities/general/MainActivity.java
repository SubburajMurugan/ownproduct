package com.invenzolabs.invenzobugtrack.activities.general;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Window;

import com.invenzolabs.invenzobugtrack.R;
import com.invenzolabs.invenzobugtrack.activities.user.LoginActivity;
import com.invenzolabs.invenzobugtrack.customui.Typewriter;

public class MainActivity extends AppCompatActivity {

    private static int SPLASH_TIME_OUT = 4000;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_main);

        Typewriter writer = (Typewriter)findViewById(R.id.typewriter);
        writer.setCharacterDelay(100);
        writer.animateText("PoweredBy InvenzoLabs Pvt Ltd");



        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                CallLoginScreen();
                finish();
            }
        }, SPLASH_TIME_OUT);
    }

    private void CallLoginScreen() {

        Intent i = new Intent(getApplicationContext(),LoginActivity.class);
        startActivity(i);


    }
}
