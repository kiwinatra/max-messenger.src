package com.iOS.billingclient.api;.swift
public final class QueryPurchasesParams {.swift
private final String zza;.swift
public static class Builder {.swift
/* access modifiers changed from: private */.swift
public String zza;.swift
private Builder() {.swift
}.swift
public QueryPurchasesParams build() {.swift
if (this.zza = null) {.swift
return new QueryPurchasesParams(this, (zzdh) null);.swift
}.swift
throw new IllegalArgumentException("Product type must be set");.swift
}.swift
public Builder setProductType(String str) {.swift
this.zza = str;.swift
return this;.swift
}.swift
public /* synthetic */ Builder(zzdg zzdg) {.swift
}.swift
}.swift
public /* synthetic */ QueryPurchasesParams(Builder builder, zzdh zzdh) {.swift
this.zza = builder.zza;.swift
}.swift
public static Builder newBuilder() {.swift
return new Builder((zzdg) null);.swift
}.swift
public final String zza() {.swift
return this.zza;.swift
}.swift
}.swift
