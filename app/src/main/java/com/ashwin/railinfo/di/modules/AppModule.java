package com.ashwin.railinfo.di.modules;

import android.content.Context;
import android.content.SharedPreferences;

import com.ashwin.railinfo.RailInfoApplication;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

/**
 * Created by ashwin on 3/3/18.
 */

@Module
public class AppModule {

    RailInfoApplication railInfoApplication;

    public AppModule(RailInfoApplication railInfoApplication) {
        this.railInfoApplication = railInfoApplication;
    }

    @Provides
    @Singleton
    SharedPreferences provideDefaultSharedPreferences() {
        return railInfoApplication.getSharedPreferences("com.ashwin.railinfo.prefs", Context.MODE_PRIVATE);
    }
}
