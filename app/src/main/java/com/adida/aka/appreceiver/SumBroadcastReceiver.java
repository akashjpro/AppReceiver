package com.adida.aka.appreceiver;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Toast;

/**
 * Created by Aka on 7/2/2017.
 */

public class SumBroadcastReceiver extends BroadcastReceiver {
    public static final
        String ACTION_ADD
            =  "com.adida.aka.broadcastreceiverlistener2app.ACTION_ADD";
    private static final String Key_A = "Num_A";
    private static final String Key_B = "Num_B";

    @Override
    public void onReceive(Context context, Intent intent) {
        switch (intent.getAction()){
            case ACTION_ADD:
                Bundle bundle = intent.getExtras();
                int numA = bundle.getInt(Key_A);
                int numB = bundle.getInt(Key_B);
                Toast.makeText(context, "Sum: "+ (numA + numB), Toast.LENGTH_SHORT).show();
                break;
        }
    }
}
