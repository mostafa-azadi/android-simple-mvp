package com.example.simplemvp.ui.main;

import com.example.simplemvp.base.IPresenter;
import com.example.simplemvp.base.IView;

public interface MainListener {
    interface View extends IView<MainListener.Presenter>{
        MainPresenter getPresenter();
    }
    interface Presenter extends IPresenter<MainListener.View>{
        void onLoad();
    }
}
