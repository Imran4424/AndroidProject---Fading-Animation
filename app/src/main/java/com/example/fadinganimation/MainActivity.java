package com.example.fadinganimation;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    ImageView logoImage;
    ImageView ezioImage;
    int selectedImage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        logoImage = (ImageView) findViewById(R.id.imageViewLogo);
        ezioImage = (ImageView) findViewById(R.id.imageViewEzio);

        selectedImage = 1;
        ezioImage.animate().alpha(0);
    }

    public void imageClicked(View v) {
        
    }
}
