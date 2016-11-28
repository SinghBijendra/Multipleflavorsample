package com.sample.foo.multipleflavorsample;

import android.content.Context;
import android.widget.Toast;

/**
 * Created by Newdream on 28-Nov-16.
 */

public class L {
    public static void message(Context context, String msg)
    {
        Toast.makeText(context,msg,Toast.LENGTH_LONG).show();

    }
}
