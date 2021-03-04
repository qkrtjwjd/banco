package com.example.myapplication;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class address extends Activity implements View.OnClickListener {
    @Override
    public void onCreate(Bundle savedlnstanceState) {
        super.onCreate(savedlnstanceState);
        setContentView(R.layout.address);

        Button bt1 = (Button)findViewById(R.id.button2);

        bt1.setOnClickListener(this);
    }

    @Override
    public void onClick(View v){
        switch (v.getId()){
            case R.id.button2:

                Intent intent1 = new Intent(this,address2.class);
                startActivity(intent1);
                break;
        }
    }
}
