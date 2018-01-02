package com.invenzolabs.invenzobugtrack.activities.user;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.Window;
import android.widget.RelativeLayout;

import com.invenzolabs.invenzobugtrack.R;

/**
 * Created by Invenzo on 19-12-2017.
 */

public class ChangePasswordActivity extends AppCompatActivity {

    RelativeLayout cancel,proceed;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_changepassword);

        cancel = (RelativeLayout)this.findViewById(R.id.cancel);
        proceed = (RelativeLayout)this.findViewById(R.id.cancel);
        cancel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
        proceed.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

    }

}
