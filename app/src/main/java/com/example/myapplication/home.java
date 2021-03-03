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

        Button bt1 = (Button) findViewById(R.id.button9);
        Button bt2 = (Button) findViewById(R.id.button14);

        bt1.setOnClickListener(this);
        bt2.setOnClickListener(this);
    }
    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.button9:
                Intent intent1 = new Intent(this,address.class);
                startActivity(intent1);
                break;

            case R.id.button14:
                Intent intent2 = new Intent(this,search.class);
                startActivity(intent2);
                break;
        }
    }
}
