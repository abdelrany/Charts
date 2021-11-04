package com.example.chrats;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button lineChatButton=findViewById(R.id.lineChatButton);
        Button halfPieChatButton=findViewById(R.id.halfPieChatButton);
        Button multipleBarChatButton=findViewById(R.id.multipleBarChatButton);

        lineChatButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(), LineChartActivity.class));
            }
        });


        halfPieChatButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(), PieChartActivity.class));
            }
        });

        multipleBarChatButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(), RadarChartActivity.class));
            }
        });
    }
}