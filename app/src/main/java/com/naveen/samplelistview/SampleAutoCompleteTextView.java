package com.naveen.samplelistview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.Button;
import android.widget.Toast;

public class SampleAutoCompleteTextView extends AppCompatActivity implements View.OnClickListener{

    private AutoCompleteTextView autoCompleteTextView;
    private Button button;

    String[] array = {"Bike","Car","Other","Android","Java","Kotlin"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.auto_complete_text_view);


        autoCompleteTextView = (AutoCompleteTextView)findViewById(R.id.autoComplete);
        button = (Button)findViewById(R.id.bn_click);

        button.setOnClickListener(this);

        autoCompleteTextView.setThreshold(1);
        ArrayAdapter arrayAdapter = new ArrayAdapter(getApplicationContext(),android.R.layout.select_dialog_item,array);
        autoCompleteTextView.setAdapter(arrayAdapter);

    }

    @Override
    public void onClick(View v) {

        switch (v.getId()){
            case R.id.bn_click:

                Toast.makeText(this, "Selected Item is "+autoCompleteTextView.getText().toString(), Toast.LENGTH_SHORT).show();
                break;
        }


    }
}
