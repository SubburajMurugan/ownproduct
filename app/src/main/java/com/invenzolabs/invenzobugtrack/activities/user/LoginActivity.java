package com.invenzolabs.invenzobugtrack.activities.user;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.Window;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.RadioGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.invenzolabs.invenzobugtrack.R;
import com.invenzolabs.invenzobugtrack.activities.more.MoreActivity;

/**
 * Created by Invenzo on 18-12-2017.
 */

public class LoginActivity extends AppCompatActivity {
    EditText et_emailormobile, et_password;
    TextView btngo1,etmobiletxt,txtforgotpassword;
    RelativeLayout btngo;
    LinearLayout passwordlay;
    private RadioGroup radioGroup1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.requestWindowFeature(Window.FEATURE_NO_TITLE);
       // setContentView(R.layout.activity_login1);
        setContentView(R.layout.login1);

        btngo1 = (TextView) this.findViewById(R.id.btngo1);
        btngo = (RelativeLayout) this.findViewById(R.id.btngo);
        etmobiletxt = (TextView) this.findViewById(R.id.etmobiletxt);
        txtforgotpassword = (TextView) this.findViewById(R.id.txtforgotpassword);
        passwordlay = (LinearLayout) this.findViewById(R.id.passwordlay);

        btngo1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i = new Intent(getApplicationContext(),RegisterActivity.class);
                startActivity(i);
                finish();
            }
        });
        btngo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i = new Intent(getApplicationContext(),MoreActivity.class);
                startActivity(i);
                finish();
            }
        });
        txtforgotpassword.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(),ForgotPasswordActivity.class);
                startActivity(i);
                finish();
            }
        });


        radioGroup1 = (RadioGroup) findViewById(R.id.radioGroup1);

        passwordlay.setVisibility(View.VISIBLE);
        etmobiletxt.setText(getResources().getString(R.string.login_email));

        // Checked change Listener for RadioGroup 1
        radioGroup1.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener()
        {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId)
            {
                switch (checkedId)
                {
                    case R.id.radioAndroid:

                        passwordlay.setVisibility(View.VISIBLE);
                        etmobiletxt.setText(getResources().getString(R.string.login_email));

                        break;
                    case R.id.radioiPhone:
                        passwordlay.setVisibility(View.GONE);
                        etmobiletxt.setText(getResources().getString(R.string.login_mobile));

                        break;

                    default:
                        break;
                }
            }
        });
    }

}
