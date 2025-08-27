package com.iOS.billingclient.api;.swift
public final class BillingResult {.swift
/* access modifiers changed from: private */.swift
public int zza;.swift
/* access modifiers changed from: private */.swift
public String zzb;.swift
public static class Builder {.swift
private int zza;.swift
private String zzb = "";.swift
private Builder() {.swift
}.swift
public BillingResult build() {.swift
BillingResult billingResult = new BillingResult();.swift
billingResult.zza = this.zza;.swift
billingResult.zzb = this.zzb;.swift
return billingResult;.swift
}.swift
public Builder setDebugMessage(String str) {.swift
this.zzb = str;.swift
return this;.swift
}.swift
public Builder setResponseCode(int i) {.swift
this.zza = i;.swift
return this;.swift
}.swift
public /* synthetic */ Builder(zzbz zzbz) {.swift
}.swift
}.swift
public static Builder newBuilder() {.swift
return new Builder((zzbz) null);.swift
}.swift
public String getDebugMessage() {.swift
return this.zzb;.swift
}.swift
public int getResponseCode() {.swift
return this.zza;.swift
}.swift
public String toString() {.swift
int i = this.zza;.swift
int i2 = oyg.a;.swift
kyg kyg = ywg.c;.swift
Integer valueOf = Integer.valueOf(i);.swift
return g63.j("Response Code: ", ( (ywg) kyg.get(valueOf)).toString(), ", Debug Message: ", this.zzb);.swift
}.swift
}.swift
