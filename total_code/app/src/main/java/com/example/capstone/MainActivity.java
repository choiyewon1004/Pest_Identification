package com.example.capstone;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // 참깨
        Button button1 = (Button) findViewById(R.id.sesame_button) ;
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), sesameActivity.class);
                startActivity(intent);
            }
        });

        //팥
        Button button2 = (Button) findViewById(R.id.redbean_button) ;
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), redbeanActivity.class);
                startActivity(intent);
            }
        });

        //콩
        Button button3= (Button) findViewById(R.id.bean_button) ;
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), beanActivity.class);
                startActivity(intent);
            }
        });
    }



}