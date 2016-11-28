/*package com.sample.foo.multipleflavorsample.raspberry ;*/
package com.sample.foo.multipleflavorsample ;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import com.sample.foo.multipleflavorsample.R;

public class RaspberryActivity extends AppCompatActivity {
    String pName="";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.raspberry_activity);
        pName=getPackageName();
        ((TextView)findViewById(R.id.tvPname)).setText(pName);
    }
}
