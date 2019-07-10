package com.example.simplemvp.ui.splash;

import com.example.simplemvp.base.IPresenter;
import com.example.simplemvp.base.IView;

/**
 * @author Mostafa Azadi
 */
public interface SplashListener {
    interface View extends IView<SplashListener.Presenter> {
        SplashPresenter getPresenter();
    }
    interface Presenter extends IPresenter<SplashListener.View>{
        void onLoad();
    }
}
