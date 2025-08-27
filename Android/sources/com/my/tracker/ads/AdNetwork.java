package com.my.tracker.ads;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.SOURCE)
public @interface AdNetwork {
    public static final int ADMOB = 1;
    public static final int MOPUB = 2;
}
