package com.kritikasharma.animatedlogin;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.graphics.drawable.AnimationDrawable;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    private ConstraintLayout layout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        layout = findViewById(R.id.layout);

        AnimationDrawable animationDrawable = (AnimationDrawable) layout.getBackground();

        animationDrawable.setEnterFadeDuration(750);
        animationDrawable.setExitFadeDuration(750);
        animationDrawable.start();
    }
}