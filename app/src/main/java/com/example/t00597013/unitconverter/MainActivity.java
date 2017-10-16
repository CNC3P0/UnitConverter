package com.example.t00597013.unitconverter;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final Button b = (Button) findViewById(R.id.convertbutton);
        b.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                EditText e = (EditText) findViewById(R.id.editText);
                e.setText("blah");
            }
        });


    }


}
