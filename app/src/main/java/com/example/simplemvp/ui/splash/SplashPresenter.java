package com.example.simplemvp.ui.splash;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Handler;

import com.example.simplemvp.ui.main.MainActivity;

/**
 * @author Mostafa Azadi
 */
public class SplashPresenter implements SplashListener.Presenter{

    Context context;
    SplashListener.View viewLayer;
    private final int SPLASH_DELAY = 3000;

    @Override
    public void onLoad() {

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                /**
                 * you can put some more lines of code here
                 */
                Intent intent = new Intent(context, MainActivity.class);
                context.startActivity(intent);
                ((Activity) context).finish();
            }
        }, SPLASH_DELAY);

    }

    @Override
    public void onAttach(SplashListener.View view) {

        viewLayer = view;
        context = view.getContext();
    }

    @Override
    public void setTitle(String title) {
//        ((Activity) context).setTitle(title);
    }
}
