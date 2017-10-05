package com.example.fujick.a2activities;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {
    private TextView textpaste;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        textpaste = (TextView) findViewById(R.id.tv1);
        String tochtovet1 = getIntent().getStringExtra("name");

        textpaste.setText(tochtovet1);
    }

    public void back(View view) {
        switch (view.getId()) {

            case R.id.knopka2:
                Intent intent = new Intent(Main2Activity.this, MainActivity.class);
                    startActivity(intent);
                break;
            default:
                break;
        }


    }
}
