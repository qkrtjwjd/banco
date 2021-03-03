package com.example.myapplication;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class event extends Activity implements View.OnClickListener {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.event);

        Button bt1 = (Button)findViewById(R.id.button36);
        Button bt2 = (Button)findViewById(R.id.button39);

        bt1.setOnClickListener(this);
        bt2.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.button36:
                Intent intent1 = new Intent(this,reservation.class);
                startActivity(intent1);
                break;

            case R.id.button39:
                Intent intent2 = new Intent(this,home.class);
                startActivity(intent2);
                break;

        }

    }
}