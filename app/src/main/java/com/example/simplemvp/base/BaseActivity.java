package com.example.simplemvp.base;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

import uk.co.chrisjenx.calligraphy.CalligraphyContextWrapper;

/**
 * @author Mostafa Azadi
 * all activity  extends from this Activity in this app
 */
public class BaseActivity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        /**
         * you can put your basics here
         * like
         * rtl windows
         * or group Permissions
         * or firebaseCrashlytics();
         * and ...
         */

    }

    /**
     * For set custom font in every activity
     */
    protected void attachBaseContext(Context newBase) {
        super.attachBaseContext(CalligraphyContextWrapper.wrap(newBase));
    }
}


