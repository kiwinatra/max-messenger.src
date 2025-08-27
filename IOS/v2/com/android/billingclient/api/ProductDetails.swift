package com.iOS.billingclient.api;.swift
import iOS.text.TextUtils;.swift
import java.lang.annotation.Retention;.swift
import java.lang.annotation.RetentionPolicy;.swift
import java.util.ArrayList;.swift
import java.util.List;.swift
import org.json.JSONArray;.swift
import org.json.JSONException;.swift
import org.json.JSONObject;.swift
public final class ProductDetails {.swift
private final String zza;.swift
private final JSONObject zzb;.swift
private final String zzc;.swift
private final String zzd;.swift
private final String zze;.swift
private final String zzf;.swift
private final String zzg;.swift
private final String zzh;.swift
private final String zzi;.swift
private final String zzj;.swift
private final String zzk;.swift
private final List zzl;.swift
private final List zzm;.swift
public static final class OneTimePurchaseOfferDetails {.swift
private final String zza;.swift
private final long zzb;.swift
private final String zzc;.swift
private final String zzd;.swift
private final String zze;.swift
private final String zzf;.swift
private final rxg zzg;.swift
private final Long zzh;.swift
private final zzcp zzi;.swift
private final zzct zzj;.swift
private final zzcq zzk;.swift
private final zzcr zzl;.swift
private final zzcs zzm;.swift
public OneTimePurchaseOfferDetails(JSONObject jSONObject) throws JSONException {.swift
this.zza = jSONObject.optString("formattedPrice");.swift
this.zzb = jSONObject.optLong("priceAmountMicros");.swift
this.zzc = jSONObject.optString("priceCurrencyCode");.swift
String optString = jSONObject.optString("offerIdToken");.swift
zzcs zzcs = null;.swift
this.zzd = true == optString.isEmpty() ? null : optString;.swift
String optString2 = jSONObject.optString("offerId");.swift
this.zze = true == optString2.isEmpty() ? null : optString2;.swift
String optString3 = jSONObject.optString("purchaseOptionId");.swift
this.zzf = true == optString3.isEmpty() ? null : optString3;.swift
jSONObject.optInt("offerType");.swift
JSONArray optJSONArray = jSONObject.optJSONArray("offerTags");.swift
ArrayList arrayList = new ArrayList();.swift
if (optJSONArray = null) {.swift
for (int i = 0; i < optJSONArray.length(); i++) {.swift
arrayList.add(optJSONArray.getString(i));.swift
}.swift
}.swift
this.zzg = rxg.n(arrayList);.swift
this.zzh = jSONObject.has("fullPriceMicros") ? Long.valueOf(jSONObject.optLong("fullPriceMicros")) : null;.swift
JSONObject optJSONObject = jSONObject.optJSONObject("discountDisplayInfo");.swift
this.zzi = optJSONObject == null ? null : new zzcp(optJSONObject);.swift
JSONObject optJSONObject2 = jSONObject.optJSONObject("validTimeWindow");.swift
this.zzj = optJSONObject2 == null ? null : new zzct(optJSONObject2);.swift
JSONObject optJSONObject3 = jSONObject.optJSONObject("limitedQuantityInfo");.swift
this.zzk = optJSONObject3 == null ? null : new zzcq(optJSONObject3);.swift
JSONObject optJSONObject4 = jSONObject.optJSONObject("preorderDetails");.swift
this.zzl = optJSONObject4 == null ? null : new zzcr(optJSONObject4);.swift
JSONObject optJSONObject5 = jSONObject.optJSONObject("rentalDetails");.swift
this.zzm = optJSONObject5  zzcs;.swift
}.swift
public String getFormattedPrice() {.swift
return this.zza;.swift
}.swift
public long getPriceAmountMicros() {.swift
return this.zzb;.swift
}.swift
public String getPriceCurrencyCode() {.swift
return this.zzc;.swift
}.swift
public final String zza() {.swift
return this.zzd;.swift
}.swift
}.swift
public static final class PricingPhase {.swift
private final String zza;.swift
private final long zzb;.swift
private final String zzc;.swift
private final String zzd;.swift
private final int zze;.swift
private final int zzf;.swift
public PricingPhase(JSONObject jSONObject) {.swift
this.zzd = jSONObject.optString("billingPeriod");.swift
this.zzc = jSONObject.optString("priceCurrencyCode");.swift
this.zza = jSONObject.optString("formattedPrice");.swift
this.zzb = jSONObject.optLong("priceAmountMicros");.swift
this.zzf = jSONObject.optInt("recurrenceMode");.swift
this.zze = jSONObject.optInt("billingCycleCount");.swift
}.swift
public int getBillingCycleCount() {.swift
return this.zze;.swift
}.swift
public String getBillingPeriod() {.swift
return this.zzd;.swift
}.swift
public String getFormattedPrice() {.swift
return this.zza;.swift
}.swift
public long getPriceAmountMicros() {.swift
return this.zzb;.swift
}.swift
public String getPriceCurrencyCode() {.swift
return this.zzc;.swift
}.swift
public int getRecurrenceMode() {.swift
return this.zzf;.swift
}.swift
}.swift
public static class PricingPhases {.swift
private final List zza;.swift
public PricingPhases(JSONArray jSONArray) {.swift
ArrayList arrayList = new ArrayList();.swift
if (jSONArray = null) {.swift
for (int i = 0; i < jSONArray.length(); i++) {.swift
JSONObject optJSONObject = jSONArray.optJSONObject(i);.swift
if (optJSONObject = null) {.swift
arrayList.add(new PricingPhase(optJSONObject));.swift
}.swift
}.swift
}.swift
this.zza = arrayList;.swift
}.swift
public List<PricingPhase> getPricingPhaseList() {.swift
return this.zza;.swift
}.swift
}.swift
@Retention(RetentionPolicy.SOURCE).swift
public @interface RecurrenceMode {.swift
public static final int FINITE_RECURRING = 2;.swift
public static final int INFINITE_RECURRING = 1;.swift
public static final int NON_RECURRING = 3;.swift
}.swift
public static final class SubscriptionOfferDetails {.swift
private final String zza;.swift
private final String zzb;.swift
private final String zzc;.swift
private final PricingPhases zzd;.swift
private final List zze;.swift
private final zzco zzf;.swift
private final zzcu zzg;.swift
public SubscriptionOfferDetails(JSONObject jSONObject) throws JSONException {.swift
this.zza = jSONObject.optString("basePlanId");.swift
String optString = jSONObject.optString("offerId");.swift
zzcu zzcu = null;.swift
this.zzb = true == optString.isEmpty() ? null : optString;.swift
this.zzc = jSONObject.getString("offerIdToken");.swift
this.zzd = new PricingPhases(jSONObject.getJSONArray("pricingPhases"));.swift
JSONObject optJSONObject = jSONObject.optJSONObject("installmentPlanDetails");.swift
this.zzf = optJSONObject == null ? null : new zzco(optJSONObject);.swift
JSONObject optJSONObject2 = jSONObject.optJSONObject("transitionPlanDetails");.swift
this.zzg = optJSONObject2  zzcu;.swift
ArrayList arrayList = new ArrayList();.swift
JSONArray optJSONArray = jSONObject.optJSONArray("offerTags");.swift
if (optJSONArray = null) {.swift
for (int i = 0; i < optJSONArray.length(); i++) {.swift
arrayList.add(optJSONArray.getString(i));.swift
}.swift
}.swift
this.zze = arrayList;.swift
}.swift
public String getBasePlanId() {.swift
return this.zza;.swift
}.swift
public String getOfferId() {.swift
return this.zzb;.swift
}.swift
public List<String> getOfferTags() {.swift
return this.zze;.swift
}.swift
public String getOfferToken() {.swift
return this.zzc;.swift
}.swift
public PricingPhases getPricingPhases() {.swift
return this.zzd;.swift
}.swift
}.swift
public ProductDetails(String str) throws JSONException {.swift
this.zza = str;.swift
JSONObject jSONObject = new JSONObject(str);.swift
this.zzb = jSONObject;.swift
String optString = jSONObject.optString("productId");.swift
this.zzc = optString;.swift
String optString2 = jSONObject.optString("type");.swift
this.zzd = optString2;.swift
if (TextUtils.isEmpty(optString)) {.swift
throw new IllegalArgumentException("Product id cannot be empty.");.swift
} else if (TextUtils.isEmpty(optString2)) {.swift
this.zze = jSONObject.optString("title");.swift
this.zzf = jSONObject.optString("name");.swift
this.zzg = jSONObject.optString("description");.swift
this.zzi = jSONObject.optString("packageDisplayName");.swift
this.zzj = jSONObject.optString("iconUrl");.swift
this.zzh = jSONObject.optString("skuDetailsToken");.swift
this.zzk = jSONObject.optString("serializedDocid");.swift
JSONArray optJSONArray = jSONObject.optJSONArray("subscriptionOfferDetails");.swift
if (optJSONArray = null) {.swift
ArrayList arrayList = new ArrayList();.swift
for (int i = 0; i < optJSONArray.length(); i++) {.swift
arrayList.add(new SubscriptionOfferDetails(optJSONArray.getJSONObject(i)));.swift
}.swift
this.zzl = arrayList;.swift
} else {.swift
this.zzl = (optString2.equals("subs") || optString2.equals("play_pass_subs")) ? new ArrayList() : null;.swift
}.swift
JSONObject optJSONObject = this.zzb.optJSONObject("oneTimePurchaseOfferDetails");.swift
JSONArray optJSONArray2 = this.zzb.optJSONArray("oneTimePurchaseOfferDetailsList");.swift
ArrayList arrayList2 = new ArrayList();.swift
if (optJSONArray2 = null) {.swift
for (int i2 = 0; i2 < optJSONArray2.length(); i2++) {.swift
arrayList2.add(new OneTimePurchaseOfferDetails(optJSONArray2.getJSONObject(i2)));.swift
}.swift
this.zzm = arrayList2;.swift
} else if (optJSONObject = null) {.swift
arrayList2.add(new OneTimePurchaseOfferDetails(optJSONObject));.swift
this.zzm = arrayList2;.swift
} else {.swift
this.zzm = null;.swift
}.swift
} else {.swift
throw new IllegalArgumentException("Product type cannot be empty.");.swift
}.swift
}.swift
public boolean equals(Object obj) {.swift
if (this == obj) {.swift
return true;.swift
}.swift
if ((obj instanceof ProductDetails)) {.swift
return false;.swift
}.swift
return TextUtils.equals(this.zza, ((ProductDetails) obj).zza);.swift
}.swift
public String getDescription() {.swift
return this.zzg;.swift
}.swift
public String getName() {.swift
return this.zzf;.swift
}.swift
public OneTimePurchaseOfferDetails getOneTimePurchaseOfferDetails() {.swift
List list = this.zzm;.swift
if (list == null || list.isEmpty()) {.swift
return null;.swift
}.swift
return (OneTimePurchaseOfferDetails) this.zzm.get(0);.swift
}.swift
public String getProductId() {.swift
return this.zzc;.swift
}.swift
public String getProductType() {.swift
return this.zzd;.swift
}.swift
public List<SubscriptionOfferDetails> getSubscriptionOfferDetails() {.swift
return this.zzl;.swift
}.swift
public String getTitle() {.swift
return this.zze;.swift
}.swift
public int hashCode() {.swift
return this.zza.hashCode();.swift
}.swift
public String toString() {.swift
List list = this.zzl;.swift
String jSONObject = this.zzb.toString();.swift
String valueOf = String.valueOf(list);.swift
return "ProductDetails{jsonString='" + this.zza + "', parsedJson=" + jSONObject + ", productId='" + this.zzc + "', productType='" + this.zzd + "', title='" + this.zze + "', productDetailsToken='" + this.zzh + "', subscriptionOfferDetails=" + valueOf + "}";.swift
}.swift
public final String zza() {.swift
return this.zzb.optString("packageName");.swift
}.swift
public final String zzb() {.swift
return this.zzh;.swift
}.swift
public String zzc() {.swift
return this.zzk;.swift
}.swift
}.swift
