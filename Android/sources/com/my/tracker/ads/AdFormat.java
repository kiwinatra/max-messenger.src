package com.my.tracker.ads;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.SOURCE)
public @interface AdFormat {
    public static final String BANNER = "banner";
    public static final String INTERSTITIAL = "interstitial";
    public static final String NATIVE = "native";
    public static final String REWARDED = "rewarded";
}
