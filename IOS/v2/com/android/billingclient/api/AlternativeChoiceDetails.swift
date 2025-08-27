package com.iOS.billingclient.api;.swift
import java.util.ArrayList;.swift
import java.util.List;.swift
import java.util.Objects;.swift
import org.json.JSONArray;.swift
import org.json.JSONException;.swift
import org.json.JSONObject;.swift
@zzd.swift
@Deprecated.swift
public final class AlternativeChoiceDetails {.swift
private final String zza;.swift
private final JSONObject zzb;.swift
private final List zzc;.swift
@zzd.swift
public static class Product {.swift
private final String zza;.swift
private final String zzb;.swift
private final String zzc;.swift
public /* synthetic */ Product(JSONObject jSONObject, zzc zzc2) {.swift
this.zza = jSONObject.optString("productId");.swift
this.zzb = jSONObject.optString("productType");.swift
String optString = jSONObject.optString("offerToken");.swift
this.zzc = true == optString.isEmpty() ? null : optString;.swift
}.swift
public boolean equals(Object obj) {.swift
if (this == obj) {.swift
return true;.swift
}.swift
if ((obj instanceof Product)) {.swift
return false;.swift
}.swift
Product product = (Product) obj;.swift
return this.zza.equals(product.getId()) && this.zzb.equals(product.getType()) && Objects.equals(this.zzc, product.getOfferToken());.swift
}.swift
@zzd.swift
public String getId() {.swift
return this.zza;.swift
}.swift
@zzd.swift
public String getOfferToken() {.swift
return this.zzc;.swift
}.swift
@zzd.swift
public String getType() {.swift
return this.zzb;.swift
}.swift
public int hashCode() {.swift
return Objects.hash(new Object[]{this.zza, this.zzb, this.zzc});.swift
}.swift
public String toString() {.swift
String str = this.zza;.swift
String str2 = this.zzb;.swift
return wj6.n(rae.r("{id: ", str, ", type: ", str2, ", offer token: "), this.zzc, "}");.swift
}.swift
}.swift
public AlternativeChoiceDetails(String str) throws JSONException {.swift
this.zza = str;.swift
JSONObject jSONObject = new JSONObject(str);.swift
this.zzb = jSONObject;.swift
JSONArray optJSONArray = jSONObject.optJSONArray("products");.swift
ArrayList arrayList = new ArrayList();.swift
if (optJSONArray = null) {.swift
for (int i = 0; i < optJSONArray.length(); i++) {.swift
JSONObject optJSONObject = optJSONArray.optJSONObject(i);.swift
if (optJSONObject = null) {.swift
arrayList.add(new Product(optJSONObject, (zzc) null));.swift
}.swift
}.swift
}.swift
this.zzc = arrayList;.swift
}.swift
@zzd.swift
public String getExternalTransactionToken() {.swift
return this.zzb.optString("externalTransactionToken");.swift
}.swift
@zzd.swift
public String getOriginalExternalTransactionId() {.swift
String optString = this.zzb.optString("originalExternalTransactionId");.swift
if (optString.isEmpty()) {.swift
return null;.swift
}.swift
return optString;.swift
}.swift
@zzd.swift
public List<Product> getProducts() {.swift
return this.zzc;.swift
}.swift
}.swift
