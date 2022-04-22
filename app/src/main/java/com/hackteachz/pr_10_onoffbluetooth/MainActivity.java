package com.hackteachz.pr_10_onoffbluetooth;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;
import android.widget.ToggleButton;

public class MainActivity extends AppCompatActivity {

    ToggleButton tg1, tg2;
    Button submit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // initiate toggle button's
        tg1 = findViewById(R.id.toggleButton);
        tg2 = findViewById(R.id.toggleButton2);
        submit = findViewById(R.id.button);
        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String status = "ToggleButton1 : " + tg1.getText() + "\n" + "ToggleButton2 : " + tg2.getText();
                Toast.makeText(getApplicationContext(), status, Toast.LENGTH_SHORT).show();
            }
        });
    }


}