package com.example.myapplication;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class preferences extends Activity implements View.OnClickListener {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.preferences);

        Button bt1 = (Button)findViewById(R.id.button5);
        Button bt2 = (Button)findViewById(R.id.button6);
        Button bt3 = (Button)findViewById(R.id.button7);
        Button bt4 = (Button)findViewById(R.id.button8);
        Button bt5 = (Button)findViewById(R.id.button9);

        bt1.setOnClickListener(this);
        bt1.setOnClickListener(this);
        bt1.setOnClickListener(this);
        bt1.setOnClickListener(this);
        bt1.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.button5:
                Intent intent1 = new Intent(this,reservation.class);
                startActivity(intent1);
                break;

            case R.id.button6:
                Intent intent2 = new Intent(this,categories.class);
                startActivity(intent2);
                break;

            case R.id.button7:
                Intent intent3 = new Intent(this,home.class);
                startActivity(intent3);
                break;

            case R.id.button8:
                Intent intent4 = new Intent(this,orderhistory.class);
                startActivity(intent4);
                break;

            case R.id.button9:
                Intent intent5 = new Intent(this,myinformation.class);
                startActivity(intent5);
                break;
        }
    }
}