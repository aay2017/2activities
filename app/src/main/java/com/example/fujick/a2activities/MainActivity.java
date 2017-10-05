package com.example.fujick.a2activities;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import static com.example.fujick.a2activities.R.id.knopka1;

public class MainActivity extends AppCompatActivity {
    private Button bgo;
    private EditText mname;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        mname = (EditText) findViewById(R.id.et1);
        bgo = (Button) findViewById(knopka1);
    }

    public void go(View view) {
        switch (view.getId()) {
            case R.id.knopka1:
                Intent intent = new Intent(MainActivity.this, Main2Activity.class);

                intent.putExtra("name", mname.getText().toString());
                startActivity(intent);
                break;
            default:
                break;
        }

    }
}
