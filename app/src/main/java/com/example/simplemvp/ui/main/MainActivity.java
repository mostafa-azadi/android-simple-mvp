package com.example.simplemvp.ui.main;

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
public class MainActivity extends BaseActivity implements MainListener.View {

    String title;
    MainPresenter mPresenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        title = "Home";

        getPresenter().onAttach(this);
        getPresenter().setTitle(title);
        getPresenter().onLoad();
    }

    @Override
    public MainPresenter getPresenter() {
        if (mPresenter == null){
            mPresenter = new MainPresenter();
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
        return Utility.isConnected(this);
    }
}
