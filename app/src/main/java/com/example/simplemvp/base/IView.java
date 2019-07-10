package com.example.simplemvp.base;

import android.content.Context;

/**
 * @author Mostafa Azadi
 */
public interface IView<T>{
    Context getContext();
    void showMessage(String message);
    boolean isConnected();
}