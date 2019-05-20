package com.shiqichuban.gittest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.airbnb.lottie.LottieAnimationView;

public class MainActivity extends AppCompatActivity {

    LottieAnimationView lav;
    //base1
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        lav=findViewById(R.id.lottieAnimation);
        lav.setImageAssetsFolder("splash");
        lav.setAnimation("splash.json");
        lav.playAnimation();
        lav.loop(true);//ss

        //添加2
        //添加3
        //添加4
        //branch1
        //branch3
        //branch34
    }
}
