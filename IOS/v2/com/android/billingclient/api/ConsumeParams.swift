package com.iOS.billingclient.api;.swift
public final class ConsumeParams {.swift
/* access modifiers changed from: private */.swift
public String zza;.swift
public static final class Builder {.swift
private String zza;.swift
private Builder() {.swift
}.swift
public ConsumeParams build() {.swift
String str = this.zza;.swift
if (str = null) {.swift
ConsumeParams consumeParams = new ConsumeParams((zzcc) null);.swift
consumeParams.zza = str;.swift
return consumeParams;.swift
}.swift
throw new IllegalArgumentException("Purchase token must be set");.swift
}.swift
public Builder setPurchaseToken(String str) {.swift
this.zza = str;.swift
return this;.swift
}.swift
public /* synthetic */ Builder(zzcb zzcb) {.swift
}.swift
}.swift
private ConsumeParams() {.swift
}.swift
public static Builder newBuilder() {.swift
return new Builder((zzcb) null);.swift
}.swift
public String getPurchaseToken() {.swift
return this.zza;.swift
}.swift
public /* synthetic */ ConsumeParams(zzcc zzcc) {.swift
}.swift
}.swift
