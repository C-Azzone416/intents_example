package com.ualr.activities;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

/**
 * Created by irconde on 2019-10-04.
 */
public class Activity02 extends AppCompatActivity {

    TextView txtIncomingData;
    TextView spyBox;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState ) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_02);
        txtIncomingData = findViewById(R.id.txtIncomingData);
        spyBox = findViewById(R.id.spyBox);
        processReceiveData();
    }

    public void processReceiveData() {

    }

    public void onButtonClick(View view) {
    }
}
