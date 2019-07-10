package com.example.simplemvp.ui.splash;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

import com.example.simplemvp.R;
import com.example.simplemvp.base.BaseActivity;
import com.example.simplemvp.utils.Utility;

/**
 * @author Mostafa Azadi
 */
public class SplashActivity extends BaseActivity implements SplashListener.View {

    SplashPresenter mPresenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        getPresenter().onAttach(this);
        getPresenter().onLoad();
    }

    @Override
    public SplashPresenter getPresenter() {
        if (mPresenter == null){
            mPresenter = new SplashPresenter();
        }
        return mPresenter;
    }

    @Override
    public Context getContext() {
        return this;
    }

    @Override
    public void showMessage(String message) {
        Toast.makeText(this,message,Toast.LENGTH_LONG).show();
    }

    @Override
    public boolean isConnected() {
        return  Utility.isConnected(this);
    }
}
