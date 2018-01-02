package com.invenzolabs.invenzobugtrack.activities.user;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.view.Window;

import com.invenzolabs.invenzobugtrack.R;
import com.invenzolabs.invenzobugtrack.customui.Typewriter;

/**
 * Created by Invenzo on 18-12-2017.
 */

public class VerifyOtpActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_verifyotp);




    }


}
