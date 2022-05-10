package com.example.exemple1intent;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {

    TextView t;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        t = findViewById(R.id.tres);

        String val1 = getIntent().getExtras().getString("v1");
        String val2 = getIntent().getExtras().getString("v2");

        t.setText(val1 + " - " + val2);
    }

    public void retour(View view) {

        Intent i = new Intent();
        i.putExtra("r1","fdfdf");
        i.putExtra("r2",3242);
        setResult(0,i);
        finish();
    }
}