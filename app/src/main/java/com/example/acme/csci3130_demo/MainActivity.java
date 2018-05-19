package com.example.acme.csci3130_demo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    private EditText inputText;
    private TextView textOut;

    public void buttonOnClick(View v)
    {
        Button button=(Button) v;
        inputText = (EditText) findViewById(R.id.inputText);
        textOut = (TextView) findViewById(R.id.textOut);
        textOut.setText(inputText.getText());
    }
}

