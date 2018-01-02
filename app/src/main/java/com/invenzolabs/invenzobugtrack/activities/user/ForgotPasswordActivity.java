package com.invenzolabs.invenzobugtrack.activities.user;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.Window;
import android.widget.ImageView;
import android.widget.RelativeLayout;

import com.invenzolabs.invenzobugtrack.R;

/**
 * Created by Invenzo on 19-12-2017.
 */

public class ForgotPasswordActivity extends AppCompatActivity {

    RelativeLayout proceed;
    ImageView icon;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_forgotpassword);

        proceed = (RelativeLayout) this.findViewById(R.id.proceed);
        icon = (ImageView) this.findViewById(R.id.icon);

        proceed.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(), ResetPasswordActivity.class);
                startActivity(i);
                finish();
            }
        });
        icon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

    }
}
