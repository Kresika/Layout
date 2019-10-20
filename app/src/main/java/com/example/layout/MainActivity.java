package com.example.layout;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    RadioGroup rgflower;
    RadioButton btnYellow,btnBlue,btnWhite;
    ImageView image;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rgflower=findViewById(R.id.rgFlower);
        image= findViewById(R.id.imageView);
        btnBlue=findViewById(R.id.rbblue);
        btnYellow=findViewById(R.id.rbyellow);
        btnWhite=findViewById(R.id.rbwhite);

        btnBlue.setOnClickListener(this);
        btnYellow.setOnClickListener(this);
        btnWhite.setOnClickListener(this);


    }

    @Override
    public void onClick(View view) {
        switch (view.getId())
        {
            case R.id.rbyellow:
                image.setImageResource(R.drawable.yellow);
                break;
            case R.id.rbwhite :
                image.setImageResource(R.drawable.white);
                break;
            case R.id.rbblue :
                image.setImageResource(R.drawable.blue);
                break;
        }

    }
}

