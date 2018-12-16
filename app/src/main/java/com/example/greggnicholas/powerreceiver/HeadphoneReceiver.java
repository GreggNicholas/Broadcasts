package com.example.greggnicholas.powerreceiver;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.widget.Toast;

public class HeadphoneReceiver extends BroadcastReceiver {

    private static final String ACTION_CUSTOM_BROADCAST =
            BuildConfig.APPLICATION_ID + ".ACTION_CUSTOM_BROADCAST";


    @Override
    public void onReceive(Context context, Intent intent) {
//        String intentAction = intent.getAction();
//        if (intentAction.equals( Intent.ACTION_HEADSET_PLUG) ) {
//            String toastMessage = "Headset Connected";
//        } else if(intentAction )
//
//
//        else {
//            String toastMessage = "Headset Unplugged";
//        }
//return Toast.makeText(context, toastMessage, Toast.LENGTH_SHORT).show();

    }
}
