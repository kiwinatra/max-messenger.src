package com.my.tracker.obfuscated;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.concurrent.TimeUnit;

@Retention(RetentionPolicy.SOURCE)
public @interface h2 {
    public static final long a = TimeUnit.MINUTES.toMillis(1);
}
