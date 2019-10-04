package com.ualr.activities;

import android.content.Intent;
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

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState ) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_02);
        txtIncomingData = findViewById(R.id.txtIncomingData);
        processReceiveData();
    }

    public void processReceiveData() {
        // TODO 06. Process data received from Activity 01
        Intent intent = getIntent();

        // TODO 07. Grab the data package with all the pieces sent to Activity 02
        Bundle bundle = intent.getExtras();

        int paramInt = bundle.getInt(Activity01.REQUEST_CODE);
        String paramString = bundle.getString(Activity01.STRING_CODE);
        Double paramDouble = bundle.getDouble(Activity01.DOUBLE_CODE);
        int[] paramIntArray = bundle.getIntArray(Activity01.INT_ARRAY_CODE);
        Person paramPerson = bundle.getParcelable(Activity01.PERSON_CODE);
        String name = paramPerson.getFullName();

        // TODO 08. Show arriving data
        txtIncomingData.append("\n------------------------------\n Caller's ID: " + paramInt +
                "\nString: " + paramString +
                "\nDouble: " + paramDouble +
                "\nArray: " + arrayToString(paramIntArray) +
                "\nPerson: " + name
        );

    }

    private String arrayToString(int[] arrayValue) {
        String result="";
        for (int i = 0; i < arrayValue.length; i++) {
            result += "," + String.valueOf(arrayValue[i]);
        }
        result = result.substring(1, result.length());
        return result;
    }

}
