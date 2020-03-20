package com.example.fadinganimation;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    ImageView logoImage;
    ImageView ezioImage
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        logoImage = (ImageView) findViewById(R.id.imageViewLogo);
        ezioImage = (ImageView) findViewById(R.id.imageViewEzio);
    }

    public void imageClicked(View v) {

    }
}
