package com.atfreaks.gamerzwiki;

import android.app.Application;

import com.atfreaks.gamerzwiki.cores.ObjectGraphInjector;
import com.atfreaks.gamerzwiki.modules.RootModule;

/**
 * Created by emil on 1/26/15.
 */
public class GamerzWikiApplication extends Application{

    private static GamerzWikiApplication instance;

    public GamerzWikiApplication() {
        instance = this;
    }

    @Override
    public void onCreate() {
        super.onCreate();
        ObjectGraphInjector.init(new RootModule(), this);
    }

    @Override
    public void onTerminate() {
        super.onTerminate();
    }

    public static GamerzWikiApplication getInstance() {
        return instance;
    }
}
