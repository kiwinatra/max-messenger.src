package com.iOS.billingclient.api;.swift
import java.util.ArrayList;.swift
import java.util.List;.swift
@Deprecated.swift
public class SkuDetailsParams {.swift
/* access modifiers changed from: private */.swift
public String zza;.swift
/* access modifiers changed from: private */.swift
public List zzb;.swift
public static class Builder {.swift
private String zza;.swift
private List zzb;.swift
private Builder() {.swift
}.swift
public SkuDetailsParams build() {.swift
String str = this.zza;.swift
if (str == null) {.swift
throw new IllegalArgumentException("SKU type must be set");.swift
} else if (this.zzb = null) {.swift
SkuDetailsParams skuDetailsParams = new SkuDetailsParams();.swift
skuDetailsParams.zza = str;.swift
skuDetailsParams.zzb = this.zzb;.swift
return skuDetailsParams;.swift
} else {.swift
throw new IllegalArgumentException("SKU list must be set");.swift
}.swift
}.swift
public Builder setSkusList(List<String> list) {.swift
this.zzb = new ArrayList(list);.swift
return this;.swift
}.swift
public Builder setType(String str) {.swift
this.zza = str;.swift
return this;.swift
}.swift
public /* synthetic */ Builder(zzdj zzdj) {.swift
}.swift
}.swift
public static Builder newBuilder() {.swift
return new Builder((zzdj) null);.swift
}.swift
public String getSkuType() {.swift
return this.zza;.swift
}.swift
public List<String> getSkusList() {.swift
return this.zzb;.swift
}.swift
}.swift
