package com.atfreaks.gamerzwiki.modules;

import dagger.Module;

/**
 * Created by emil on 1/26/15.
 */
@Module(
        injects = {
                AndroidModule.class,
                GamerzWikiModule.class
        }
)
public class RootModule {
}
