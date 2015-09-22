package com.naixx.kotlinbug.app;

import kotlin.Function1;

public final class CompilerCrash {

    public static <T> Function1<T, Object> crashOnDeprecated() {
        return new Function1<T, Object>() {

            @Override
            public Object invoke(T arg) {
                return null;
            }
        };
    }
}
