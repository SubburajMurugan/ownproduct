package com.invenzolabs.invenzobugtrack.activities.user;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Window;

import com.invenzolabs.invenzobugtrack.R;

/**
 * Created by Invenzo on 19-12-2017.
 */

public class ResetPasswordActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_resetpassword);


    }
}
