package com.ualr.activities;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Activity01 extends AppCompatActivity {

    private final int IPC_ID = (int) (10001 * Math.random());
    TextView txtTop;
    TextView txtReturnedValues;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_01);
        txtTop = findViewById(R.id.txtTop);
        txtReturnedValues = findViewById(R.id.txtReturnedValues);
        txtTop.setText(String.format(getString(R.string.textTopPlaceholder), IPC_ID));
    }

    public void onButtonClick(View view) {
    }

}
