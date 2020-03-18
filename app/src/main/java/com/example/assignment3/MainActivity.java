package com.example.assignment3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.RadioGroup;
import android.widget.SeekBar;
import android.widget.Spinner;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    double price;
    int quantity;
    double total;
    double tippert;
    ImageView image;
    EditText ET;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        image = findViewById(R.id.imageView);

        RadioGroup radioGroup = findViewById(R.id.radioGroup6);
        Spinner spinner = findViewById(R.id.spinner);
        SeekBar seekBar = findViewById(R.id.seekBar);
        TextView textView = findViewById(R.id.textView2);
        CheckBox checkBox = findViewById(R.id.checkBox);
       ET = findViewById(R.id.editText3);
        final EditText pricetext = findViewById(R.id.editText);
        final double prices[] = {0,10,12,19,45,23,11,9,15,28,12};

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
                price = prices[position];
                pricetext.setText(price +"dollars");
                double mealprice = price * quantity;
                total = mealprice + mealprice * tippert + mealprice * 0.13;
                ET.setText(total + "dollars");

            }


            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });
        Button btn = findViewById(R.id.buttonOrder);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.i("Info","Lovepreet ere");

            }
        });
        radioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                switch (checkedId) {
                    case R.id.radioButton:
                        tippert = 0.10;
                        break;
                    case R.id.radioButton2:
                        tippert = 0.15;
                        break;
                    case R.id.radioButton4:
                        tippert = 0.20;
                        break;

                }
                double mealprice = price * quantity;
                total = mealprice + mealprice * tippert + mealprice * 0.13;
                ET.setText(total + "dollars");
            }
        });

        seekBar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                if (fromUser)
                   quantity =  seekBar.getProgress();
                double mealprice = price * quantity;
                total = mealprice + mealprice * tippert + mealprice * 0.13;
                ET.setText(total + "dollars");
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });

    }




    }





