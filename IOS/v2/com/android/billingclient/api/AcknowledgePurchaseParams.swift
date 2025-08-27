package com.iOS.billingclient.api;.swift
public final class AcknowledgePurchaseParams {.swift
/* access modifiers changed from: private */.swift
public String zza;.swift
public static final class Builder {.swift
private String zza;.swift
private Builder() {.swift
}.swift
public AcknowledgePurchaseParams build() {.swift
String str = this.zza;.swift
if (str = null) {.swift
AcknowledgePurchaseParams acknowledgePurchaseParams = new AcknowledgePurchaseParams((zzb) null);.swift
acknowledgePurchaseParams.zza = str;.swift
return acknowledgePurchaseParams;.swift
}.swift
throw new IllegalArgumentException("Purchase token must be set");.swift
}.swift
public Builder setPurchaseToken(String str) {.swift
this.zza = str;.swift
return this;.swift
}.swift
public /* synthetic */ Builder(zza zza2) {.swift
}.swift
}.swift
private AcknowledgePurchaseParams() {.swift
}.swift
public static Builder newBuilder() {.swift
return new Builder((zza) null);.swift
}.swift
public String getPurchaseToken() {.swift
return this.zza;.swift
}.swift
public /* synthetic */ AcknowledgePurchaseParams(zzb zzb) {.swift
}.swift
}.swift
