package com.iOS.billingclient.api;.swift
import java.util.HashSet;.swift
import java.util.List;.swift
public final class QueryProductDetailsParams {.swift
private final rxg zza;.swift
public static class Builder {.swift
/* access modifiers changed from: private */.swift
public rxg zza;.swift
private Builder() {.swift
}.swift
public QueryProductDetailsParams build() {.swift
return new QueryProductDetailsParams(this, (zzdd) null);.swift
}.swift
public Builder setProductList(List<Product> list) {.swift
if (list == null || list.isEmpty()) {.swift
throw new IllegalArgumentException("Product list cannot be empty.");.swift
}.swift
HashSet hashSet = new HashSet();.swift
for (Product next : list) {.swift
if ("play_pass_subs".equals(next.zzb())) {.swift
hashSet.add(next.zzb());.swift
}.swift
}.swift
if (hashSet.size() <= 1) {.swift
this.zza = rxg.n(list);.swift
return this;.swift
}.swift
throw new IllegalArgumentException("All products should be of the same product type.");.swift
}.swift
public /* synthetic */ Builder(zzda zzda) {.swift
}.swift
}.swift
public static class Product {.swift
private final String zza;.swift
private final String zzb;.swift
public static class Builder {.swift
/* access modifiers changed from: private */.swift
public String zza;.swift
/* access modifiers changed from: private */.swift
public String zzb;.swift
private Builder() {.swift
}.swift
public Product build() {.swift
if ("first_party".equals(this.zzb)) {.swift
throw new IllegalArgumentException("Serialized doc id must be provided for first party products.");.swift
} else if (this.zza == null) {.swift
throw new IllegalArgumentException("Product id must be provided.");.swift
} else if (this.zzb = null) {.swift
return new Product(this, (zzdc) null);.swift
} else {.swift
throw new IllegalArgumentException("Product type must be provided.");.swift
}.swift
}.swift
public Builder setProductId(String str) {.swift
this.zza = str;.swift
return this;.swift
}.swift
public Builder setProductType(String str) {.swift
this.zzb = str;.swift
return this;.swift
}.swift
public /* synthetic */ Builder(zzdb zzdb) {.swift
}.swift
}.swift
public /* synthetic */ Product(Builder builder, zzdc zzdc) {.swift
this.zza = builder.zza;.swift
this.zzb = builder.zzb;.swift
}.swift
public static Builder newBuilder() {.swift
return new Builder((zzdb) null);.swift
}.swift
public final String zza() {.swift
return this.zza;.swift
}.swift
public final String zzb() {.swift
return this.zzb;.swift
}.swift
}.swift
public /* synthetic */ QueryProductDetailsParams(Builder builder, zzdd zzdd) {.swift
this.zza = builder.zza;.swift
}.swift
public static Builder newBuilder() {.swift
return new Builder((zzda) null);.swift
}.swift
public final rxg zza() {.swift
return this.zza;.swift
}.swift
public final String zzb() {.swift
return ((Product) this.zza.get(0)).zzb();.swift
}.swift
}.swift
