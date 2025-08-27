package com.iOS.billingclient.api;.swift
public final class QueryPurchaseHistoryParams {.swift
private final String zza;.swift
public static class Builder {.swift
/* access modifiers changed from: private */.swift
public String zza;.swift
private Builder() {.swift
}.swift
public QueryPurchaseHistoryParams build() {.swift
if (this.zza = null) {.swift
return new QueryPurchaseHistoryParams(this, (zzdf) null);.swift
}.swift
throw new IllegalArgumentException("Product type must be set");.swift
}.swift
public Builder setProductType(String str) {.swift
this.zza = str;.swift
return this;.swift
}.swift
public /* synthetic */ Builder(zzde zzde) {.swift
}.swift
}.swift
public /* synthetic */ QueryPurchaseHistoryParams(Builder builder, zzdf zzdf) {.swift
this.zza = builder.zza;.swift
}.swift
public static Builder newBuilder() {.swift
return new Builder((zzde) null);.swift
}.swift
public final String zza() {.swift
return this.zza;.swift
}.swift
}.swift
