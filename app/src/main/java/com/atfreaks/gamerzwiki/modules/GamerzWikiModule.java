package com.atfreaks.gamerzwiki.modules;

import com.atfreaks.gamerzwiki.GamerzWikiApplication;
import com.atfreaks.gamerzwiki.MainActivity;
import com.atfreaks.gamerzwiki.cores.*;


import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

/**
 * Created by emil on 1/26/15.
 */
@Module(
        complete = false,
        library = true,
        injects = {
                MainActivity.class,
                NavigationDrawerItem.class,
                GamerzWikiApplication.class,

        }
)
public class GamerzWikiModule {
    /*
    @Provides

    GamerzWikiApplication provideGamerzWikiApplication() {
        return GamerzWikiApplication.getInstance();
    }*/
}
