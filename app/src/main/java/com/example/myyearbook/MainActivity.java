package com.example.myyearbook;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btn1 = (Button) findViewById(R.id.btn1);
        TextView txt1 = (TextView) findViewById(R.id.txt1);

        btn1.setOnClickListener(new OnClickListener(){
            @Override
            public void onClick(View v){
                txt1.setText("Great job!!! You changed the text");


            }
        });
    }

}