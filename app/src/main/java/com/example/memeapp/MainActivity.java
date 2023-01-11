package com.example.memeapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    ImageView imageView;
    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imageView = findViewById(R.id.imageView);
        button = findViewById(R.id.button);

        int[] arr ={
                R.drawable.img1,
                R.drawable.img2,
                R.drawable.img3,
                R.drawable.img4
        };

        imageView.setImageResource(arr[0]);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int temp = arr.length;
                Random random = new Random();
                int next = random.nextInt(temp);
                imageView.setImageResource(arr[next]);
            }
        });
    }
}