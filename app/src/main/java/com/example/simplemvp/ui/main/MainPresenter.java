package com.example.simplemvp.ui.main;

import android.app.Activity;
import android.content.Context;

public class MainPresenter implements MainListener.Presenter {

    MainListener.View viewLayer;
    Context context;

    @Override
    public void onLoad() {

    }

    @Override
    public void onAttach(MainListener.View view) {

        context = view.getContext();
        viewLayer = view;
    }

    @Override
    public void setTitle(String title) {
        ((Activity)context).setTitle(title);
    }
}
