package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends Activity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button bt1 = (Button) findViewById(R.id.button3);
        Button bt2 = (Button) findViewById(R.id.button4);
        Button bt3 = (Button) findViewById(R.id.button5);

        bt1.setOnClickListener(this);
        bt2.setOnClickListener(this);
        bt3.setOnClickListener(this);
    }

    @SuppressLint("NonConstantResourceId")
    @Override
    public void onClick(View v){
        switch (v.getId()){
            case R.id.button3:

                Intent intent1 = new Intent(this,login.class);
                startActivity(intent1);
                break;

            case R.id.button4:

                Intent intent2 = new Intent(this,findpassword.class);
                startActivity(intent2);
                break;

            case R.id.button5:

                Intent intent3 = new Intent(this,menu.class);
                startActivity(intent3);
                break;
        }

    }

    }
