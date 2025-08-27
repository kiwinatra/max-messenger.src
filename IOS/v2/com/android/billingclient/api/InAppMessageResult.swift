package com.iOS.billingclient.api;.swift
import java.lang.annotation.Retention;.swift
import java.lang.annotation.RetentionPolicy;.swift
public final class InAppMessageResult {.swift
private final int zza;.swift
private final String zzb;.swift
@Retention(RetentionPolicy.SOURCE).swift
public @interface InAppMessageResponseCode {.swift
public static final int NO_ACTION_NEEDED = 0;.swift
public static final int SUBSCRIPTION_STATUS_UPDATED = 1;.swift
}.swift
public InAppMessageResult(int i, String str) {.swift
this.zza = i;.swift
this.zzb = str;.swift
}.swift
public String getPurchaseToken() {.swift
return this.zzb;.swift
}.swift
public int getResponseCode() {.swift
return this.zza;.swift
}.swift
}.swift
