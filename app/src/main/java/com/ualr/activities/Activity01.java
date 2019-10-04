package com.ualr.activities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Activity01 extends AppCompatActivity {

    public static final String REQUEST_CODE = "requestCode";
    public static final String STRING_CODE = "stringActivity01";
    public static final String DOUBLE_CODE = "doubleActivity01";
    public static final String INT_ARRAY_CODE = "intArrayActivity01";
    public static final String PERSON_CODE = "personActivity01";


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
        // TODO 01. Prepare an intent to talk to Activity 02
        Intent intent = new Intent(this, Activity02.class);

        // TODO 02. Prepare a bundle and add the data pieces to be sent
        Bundle data = new Bundle();
        data.putInt(REQUEST_CODE, IPC_ID);
        data.putString(STRING_CODE, "Hello Android");
        data.putDouble(DOUBLE_CODE, 3.141592);
        int[] intArray = {1, 2, 3};
        data.putIntArray(INT_ARRAY_CODE, intArray);

        // TODO 03. Create an object and put it into the bundle
        Person p = new Person("Ivan", "Rodriguez-Conde");
        data.putParcelable(PERSON_CODE, p);

        // TODO 04. Bind the bundle to the intent used to talk with activity 02
        intent.putExtras(data);

        // TODO 05. Call Activity 02 and wait for the result
        startActivityForResult(intent, IPC_ID);
    }

}
