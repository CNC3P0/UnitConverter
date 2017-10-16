package com.example.t00597013.unitconverter;

import android.content.Context;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final Button b = (Button) findViewById(R.id.convertbutton);
        b.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Spinner fromSpinner = (Spinner) findViewById(R.id.fromspinner);
                Spinner toSpinner = (Spinner) findViewById(R.id.tospinner);
                String fromText = fromSpinner.getSelectedItem().toString();
                String toText = toSpinner.getSelectedItem().toString();
                EditText inputValue = (EditText) findViewById(R.id.enterValue);
                String value = inputValue.getText().toString();

                InputMethodManager inputManager = (InputMethodManager)
                        getSystemService(Context.INPUT_METHOD_SERVICE);
                inputManager.hideSoftInputFromWindow(getCurrentFocus().getWindowToken(),
                        InputMethodManager.HIDE_NOT_ALWAYS);

                if (fromText.equals(toText)) {
                    Toast.makeText(getBaseContext(), "From and To are the same", Toast.LENGTH_SHORT).show();
                }
                else if (value.matches("")) {
                    Toast.makeText(getBaseContext(), "Please enter a value", Toast.LENGTH_SHORT).show();
                }
                else if (toText.equals("Celsius")) {
                    Toast.makeText(getBaseContext(), "Converting to Celsius", Toast.LENGTH_SHORT).show();
                }
                else if (toText.equals("Fahrenheit")) {
                    Toast.makeText(getBaseContext(), "Converting to Fahrenheit", Toast.LENGTH_SHORT).show();
                }
                TextView e = (TextView) findViewById(R.id.outputResults);
                e.setText("blah");
                //Toast.makeText(getBaseContext(), toText, Toast.LENGTH_SHORT).show();
            }
        });


    }






}
