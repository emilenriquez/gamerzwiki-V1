package com.atfreaks.gamerzwiki.modules;

import android.content.Context;

import com.atfreaks.gamerzwiki.GamerzWikiApplication;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

/**
 * Created by emil on 1/26/15.
 */
@Module(complete = false, library = true)
public class AndroidModule {
    @Provides
    @Singleton
    Context provideAppContext() {
        return GamerzWikiApplication.getInstance().getApplicationContext();
    }
}
