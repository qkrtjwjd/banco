package com.example.myapplication;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class myinformation extends Activity implements View.OnClickListener {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.myinformation);

        Button bt1 = (Button)findViewById(R.id.button);
        Button bt2 = (Button)findViewById(R.id.button2);
        Button bt3 = (Button)findViewById(R.id.button10);
        Button bt4 = (Button)findViewById(R.id.button3);
        Button bt5 = (Button)findViewById(R.id.button13);
        Button bt6 = (Button)findViewById(R.id.button4);
        Button bt7 = (Button)findViewById(R.id.button5);
        Button bt8 = (Button)findViewById(R.id.button6);
        Button bt9 = (Button)findViewById(R.id.button8);
        Button bt10 = (Button)findViewById(R.id.button11);
        Button bt11 = (Button)findViewById(R.id.button12);

        bt1.setOnClickListener(this);
        bt2.setOnClickListener(this);
        bt3.setOnClickListener(this);
        bt4.setOnClickListener(this);
        bt5.setOnClickListener(this);
        bt6.setOnClickListener(this);
        bt7.setOnClickListener(this);
        bt8.setOnClickListener(this);
        bt9.setOnClickListener(this);
        bt10.setOnClickListener(this);
        bt11.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.button:
                Intent intent1 = new Intent(this,home.class);
                startActivity(intent1);
                break;

            case R.id.button2:
                Intent intent2 = new Intent(this,reservation.class);
                startActivity(intent2);
                break;

            case R.id.button10:
                Intent intent3 = new Intent(this,reservation.class);
                startActivity(intent3);
                break;

            case R.id.button3:
                Intent intent4 = new Intent(this,orderhistory.class);
                startActivity(intent4);
                break;

            case R.id.button13:
                Intent intent5 = new Intent(this,orderhistory.class);
                startActivity(intent5);
                break;

            case R.id.button4:
                Intent intent6 = new Intent(this,orderhistory.class);
                startActivity(intent6);
                break;

            case R.id.button5:
                Intent intent7 = new Intent(this,orderhistory.class);
                startActivity(intent7);
                break;

            case R.id.button6:
                Intent intent8 = new Intent(this,orderhistory.class);
                startActivity(intent8);
                break;

            case R.id.button8:
                Intent intent9 = new Intent(this,orderhistory.class);
                startActivity(intent9);
                break;

            case R.id.button11:
                Intent intent10 = new Intent(this,categories.class);
                startActivity(intent10);
                break;

            case R.id.button12:
                Intent intent11 = new Intent(this,home.class);
                startActivity(intent11);
                break;
        }
    }
}

