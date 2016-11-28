package com.sample.foo.multipleflavorsample;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {

    String pName="";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        pName=getPackageName();
        ((TextView)findViewById(R.id.tvPname)).setText(pName);
    }

    public void gotoOther(View v)
    {
     }
}
