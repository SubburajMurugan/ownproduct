package com.invenzolabs.invenzobugtrack.activities.user;

import android.app.Dialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.Window;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.ScrollView;

import com.invenzolabs.invenzobugtrack.R;

/**
 * Created by Invenzo on 18-12-2017.
 */

public class RegisterActivity extends AppCompatActivity {


    EditText et_emailormobile, et_password;
    ImageView btngo;
    ScrollView scrollview;
    LinearLayout foot;
    RelativeLayout et_gender,et_role,cancel,proceed;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_register);

        et_gender = (RelativeLayout) this.findViewById(R.id.et_gender);
        et_role = (RelativeLayout) this.findViewById(R.id.et_role);
        cancel = (RelativeLayout) this.findViewById(R.id.cancel);
        proceed = (RelativeLayout) this.findViewById(R.id.proceed);

        et_gender.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Dialog dialog = onCreateDialogSingleChoice();
                dialog.show();
            }
        });
        et_role.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Dialog dialog = onCreateDialogSingleChoice1();
                dialog.show();
            }
        });
        proceed.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(),VerifyOtpActivity.class);
                startActivity(i);

            }
        });
        cancel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(),LoginActivity.class);
                startActivity(i);
                finish();
            }
        });

    }


    public Dialog onCreateDialogSingleChoice() {


        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        CharSequence[] array = {"Male", "Female"};
        builder.setTitle("Select Gender")

                .setSingleChoiceItems(array, 0, new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {


                    }
                })
                .setPositiveButton("Ok", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int id) {

                    }
                })
                .setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int id) {

                    }
                });

        return builder.create();
    }

    public Dialog onCreateDialogSingleChoice1() {


        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        CharSequence[] array = {"CEO", "HR","Project Manager", "ProjectLeader","Senior Developer","Junior Developer"};
        builder.setTitle("Select Roles")

                .setSingleChoiceItems(array, 0, new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {


                    }
                })
                .setPositiveButton("Ok", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int id) {

                    }
                })
                .setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int id) {

                    }
                });

        return builder.create();
    }


}
