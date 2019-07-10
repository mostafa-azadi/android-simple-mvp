package com.example.simplemvp.base;

/**
 * @author Mostafa Azadi
 */

public interface IPresenter<T> {
    void onAttach(T view);
    void setTitle(String title);
}
