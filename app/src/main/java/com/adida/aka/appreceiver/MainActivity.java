package com.adida.aka.appreceiver;

import android.content.IntentFilter;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
    private SumBroadcastReceiver mSumBroadcastReceiver;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
    }

    private void initView() {
        mSumBroadcastReceiver = new SumBroadcastReceiver();
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction(mSumBroadcastReceiver.ACTION_ADD);
        registerReceiver(mSumBroadcastReceiver, intentFilter);
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        unregisterReceiver(mSumBroadcastReceiver);
    }
}
