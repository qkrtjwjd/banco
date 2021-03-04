package com.example.myapplication;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class search  extends Activity implements View.OnClickListener {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.search);

        Button bt1 = (Button)findViewById(R.id.button4);
        Button bt2 = (Button)findViewById(R.id.button2);
        Button bt3 = (Button)findViewById(R.id.button3);
        Button bt4 = (Button)findViewById(R.id.button5);

        bt1.setOnClickListener(this);
        bt2.setOnClickListener(this);
        bt3.setOnClickListener(this);
        bt4.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.button4:
                Intent intent1 = new Intent(this,home.class);
                startActivity(intent1);
                break;

            case R.id.button2:
                Intent intent2 = new Intent(this,reservation.class);
                startActivity(intent2);
                break;

            case R.id.button3:
                Intent intent3 = new Intent(this,categories.class);
                startActivity(intent3);
                break;

            case R.id.button5:
                Intent intent4 = new Intent(this,orderhistory.class);
                startActivity(intent4);
                break;
        }
    }
}
