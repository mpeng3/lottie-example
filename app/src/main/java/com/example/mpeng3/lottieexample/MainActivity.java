package com.example.mpeng3.lottieexample;

import android.graphics.Color;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.airbnb.lottie.LottieAnimationView;
import com.airbnb.lottie.LottieProperty;
import com.airbnb.lottie.model.KeyPath;
import com.airbnb.lottie.value.LottieValueCallback;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        LottieAnimationView lottieAnimationView = new LottieAnimationView(this);
        Color color = new Color();

        // Note the lint error for the KeyPath constructor - it should only be called from within the same library
        lottieAnimationView.addValueCallback(new KeyPath("Shape Layer 1", "**"),
                                 LottieProperty.COLOR_FILTER,
                                 // Note the error here for the unchecked call to a raw type warning
                                 new LottieValueCallback(new PorterDuffColorFilter(color,
                                                                                   PorterDuff.Mode.SRC_ATOP)));
    }
}
