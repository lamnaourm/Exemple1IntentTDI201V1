package com.example.exemple1intent;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText e1, e2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        e1 = findViewById(R.id.e1);
        e2 = findViewById(R.id.e2);
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        if(requestCode==0) {
            String res1 = data.getExtras().getString("r1");
            int res2 = data.getExtras().getInt("r2");
            Toast.makeText(this, res1 + " - " + res2, Toast.LENGTH_SHORT).show();
        }
    }

    public void ouvrir(View view) {
        Intent i = new Intent(MainActivity.this, MainActivity2.class);
        i.putExtra("v1",e1.getText().toString());
        i.putExtra("v2",e2.getText().toString());
        startActivityForResult(i,0);
    }

    public void ouvrir2(View view) {
        Intent i = new Intent(MainActivity.this, MainActivity3.class);
        startActivityForResult(i,1);
    }
}