package com.example.myapplication;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class reservation extends Activity implements View.OnClickListener {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.reservation);

        Button bt1 = (Button)findViewById(R.id.button4);
        Button bt2 = (Button)findViewById(R.id.button3);

        bt1.setOnClickListener(this);
        bt2.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.button4:
                Intent intent1 = new Intent(this,orderhistory.class);
                startActivity(intent1);
                break;

            case R.id.button3:
                Intent intent2 = new Intent(this,home.class);
                startActivity(intent2);
                break;
        }
    }
}