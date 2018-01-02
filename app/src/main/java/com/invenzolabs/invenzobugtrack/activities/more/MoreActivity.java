package com.invenzolabs.invenzobugtrack.activities.more;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.Window;
import android.widget.RelativeLayout;

import com.invenzolabs.invenzobugtrack.R;
import com.invenzolabs.invenzobugtrack.activities.user.ProfileActivity;

/**
 * Created by Invenzo on 18-12-2017.
 */

public class MoreActivity  extends AppCompatActivity {

    RelativeLayout accountsetting,notificationsetting,privacysetting, termssetting;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_more);


        accountsetting = (RelativeLayout)this.findViewById(R.id.accountsetting);
        notificationsetting = (RelativeLayout)this.findViewById(R.id.notificationsetting);
        privacysetting = (RelativeLayout)this.findViewById(R.id.privacysetting);
        termssetting = (RelativeLayout)this.findViewById(R.id.termssetting);

        accountsetting.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i = new Intent(getApplicationContext(),ProfileActivity.class);
                startActivity(i);
            }
        });
        notificationsetting.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
        privacysetting.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i = new Intent(getApplicationContext(),PrivacyActivity.class);
                startActivity(i);
            }
        });
        termssetting.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i = new Intent(getApplicationContext(),TermsConditionsActivity.class);
                startActivity(i);
            }
        });
    }

}
