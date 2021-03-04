package com.example.myapplication;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class home extends Activity implements View.OnClickListener {

    @Override
    public void onCreate(Bundle savedlnstanceState){
        super.onCreate(savedlnstanceState);
        setContentView(R.layout.home);

        Button bt1 = (Button) findViewById(R.id.button);
        Button bt2 = (Button) findViewById(R.id.button2);
        Button bt3 = (Button) findViewById(R.id.button3);
        Button bt4 = (Button) findViewById(R.id.button13);
        Button bt5 = (Button) findViewById(R.id.button17);
        Button bt6 = (Button) findViewById(R.id.button14);

        bt1.setOnClickListener(this);
        bt2.setOnClickListener(this);
        bt3.setOnClickListener(this);
        bt4.setOnClickListener(this);
        bt5.setOnClickListener(this);
        bt6.setOnClickListener(this);
    }
    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.button:
                Intent intent1 = new Intent(this,address.class);
                startActivity(intent1);
                break;

            case R.id.button2:
                Intent intent2 = new Intent(this,search.class);
                startActivity(intent2);
                break;

            case R.id.button3:
                Intent intent3 = new Intent(this,event.class);
                startActivity(intent3);
                break;

            case R.id.button13:
                Intent intent4 = new Intent(this,reservation.class);
                startActivity(intent4);
                break;

            case R.id.button17:
                Intent intent5 = new Intent(this,orderhistory.class);
                startActivity(intent5);
                break;

            case R.id.button14:
                Intent intent6 = new Intent(this,categories.class);
                startActivity(intent6);
                break;
        }
    }
}
