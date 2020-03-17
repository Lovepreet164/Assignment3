package com.example.assignment3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.Spinner;

public class MainActivity extends AppCompatActivity {

    ImageView image;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        image = findViewById(R.id.imageView);
        Spinner spinner = findViewById(R.id.spinner);

        final int[] srcArray = {
                R.drawable.meal1,
                R.drawable.meal2,
                R.drawable.meal3,
                R.drawable.meal4,
                R.drawable.meal5,
                R.drawable.meal6,
                R.drawable.meal7,
                R.drawable.meal8,
                R.drawable.meal9,
                R.drawable.meal10
                   };

        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                image.setImageResource(srcArray[position]);
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });




    }
    public void changeSource(View view){
        ImageView imageView = (ImageView) view;
        imageView.setBackgroundResource(R.drawable.meal1);
    }
}
