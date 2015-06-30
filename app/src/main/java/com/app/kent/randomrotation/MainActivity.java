package com.app.kent.randomrotation;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.RotateAnimation;
import android.widget.ImageView;


public class MainActivity extends Activity implements Animation.AnimationListener{

    private final String TAG = MainActivity.this.getClass().getSimpleName();
    private ImageView mImage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mImage = (ImageView) findViewById(R.id.iv_circle);



        findViewById(R.id.btn_start).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                int stop = (int)(Math.random() * 100);
                Log.d(TAG, "Stop = " + stop);

                int temp = prosibility(stop);
                Log.d(TAG, "After prosibility: temp = " + temp);


                Animation am = new RotateAnimation(0f, temp + 3600, Animation.RELATIVE_TO_SELF,
                        0.5f, Animation.RELATIVE_TO_SELF, 0.5f);
                am.setAnimationListener(MainActivity.this);
                am.setDuration(3000);
                am.setFillAfter(true);
                mImage.startAnimation(am);

//                int stop = (int)(Math.random() * 360);
//                Log.d(TAG, "Stop = " + stop);
//
//                Animation am = new RotateAnimation(0f, stop + 3600, Animation.RELATIVE_TO_SELF,
//                        0.5f, Animation.RELATIVE_TO_SELF, 0.5f);
//                am.setAnimationListener(MainActivity.this);
//                am.setDuration(3000);
//                am.setFillAfter(true);
//                mImage.startAnimation(am);
            }
        });
    }

    private int prosibility(int stop) {
        if(stop < 5) {
            return 0;
        } else if(5 <= stop && stop < 15) {
            return 60;
        } else if(15 <= stop && stop < 30) {
            return 120;
        } else if(30 <= stop && stop < 45) {
            return 180;
        } else if(45 <= stop && stop < 65) {
            return 240;
        } else if(65 <= stop && stop < 100) {
            return 300;
        } else {
            Log.d(TAG, "Should be not here");
            return 0;
        }
    }

    @Override
    public void onAnimationStart(Animation animation) {
        Log.d(TAG, "onAnimationStart");
        //mImage.invalidate();
    }

    @Override
    public void onAnimationEnd(Animation animation) {
        Log.d(TAG, "onAnimationEnd");
    }

    @Override
    public void onAnimationRepeat(Animation animation) {
        Log.d(TAG, "onAnimationRepeat");
    }
}