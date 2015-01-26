package com.atfreaks.gamerzwiki.cores;

import dagger.ObjectGraph;

/**
 * Created by emil on 1/26/15.
 */
public final class ObjectGraphInjector {
    private static ObjectGraph objectGraph = null;

    public static void init(final Object rootModule) {

        if (objectGraph == null) {
            objectGraph = ObjectGraph.create(rootModule);
        } else {
            objectGraph = objectGraph.plus(rootModule);
        }

        objectGraph.injectStatics();
    }

    public static void init(final Object rootModule, final Object target) {
        init(rootModule);
        inject(target);
    }

    public static void inject(final Object target) {
        objectGraph.inject(target);
    }

    public static <T> T resolve(Class<T> type) {
        return objectGraph.get(type);
    }
}
