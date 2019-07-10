package com.example.simplemvp;

import android.app.Application;
import android.content.Context;
import android.support.multidex.MultiDex;

import uk.co.chrisjenx.calligraphy.CalligraphyConfig;

/**
 * @author Mostafa Azadi
 * You must add this class to name in application tag in manifests file
 */

public class App extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        getFont();
    }


    /**
     *
     * You Must Enable multidex When Your app with over 64K methods
     *
     */
    @Override
    protected void attachBaseContext(Context base) {
        super.attachBaseContext(base);
        MultiDex.install(this);
    }


    /**
     *Custom fonts in Android the easy way for whole app
     */
    void getFont(){
        CalligraphyConfig.initDefault(new CalligraphyConfig.Builder()

                .setDefaultFontPath("fonts/MavenPro.ttf")
                .setFontAttrId(R.attr.fontPath)
                .build()
        );
    }
}
