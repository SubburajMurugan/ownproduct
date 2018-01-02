package com.invenzolabs.invenzobugtrack.activities.more;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Window;
import android.webkit.WebView;

import com.invenzolabs.invenzobugtrack.R;

/**
 * Created by Invenzo on 18-12-2017.
 */

public class TermsConditionsActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_terms);

        WebView mywebview = (WebView) findViewById(R.id.webView1);
        mywebview.loadUrl("https://www.website.com/terms-and-conditions/");




    }

}
