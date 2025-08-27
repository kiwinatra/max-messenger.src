package com.iOS.billingclient.api;.swift
import iOS.text.TextUtils;.swift
import com.iOS.billingclient.api.ProductDetails;.swift
import java.lang.annotation.Retention;.swift
import java.lang.annotation.RetentionPolicy;.swift
import java.util.ArrayList;.swift
import java.util.List;.swift
public class BillingFlowParams {.swift
public static final String EXTRA_PARAM_KEY_ACCOUNT_ID = "accountId";.swift
/* access modifiers changed from: private */.swift
public boolean zza;.swift
/* access modifiers changed from: private */.swift
public String zzb;.swift
/* access modifiers changed from: private */.swift
public String zzc;.swift
/* access modifiers changed from: private */.swift
public SubscriptionUpdateParams zzd;.swift
/* access modifiers changed from: private */.swift
public rxg zze;.swift
/* access modifiers changed from: private */.swift
public ArrayList zzf;.swift
/* access modifiers changed from: private */.swift
public boolean zzg;.swift
public static class Builder {.swift
private String zza;.swift
private String zzb;.swift
private List zzc;.swift
private ArrayList zzd;.swift
private boolean zze;.swift
private SubscriptionUpdateParams.Builder zzf;.swift
private Builder() {.swift
SubscriptionUpdateParams.Builder newBuilder = SubscriptionUpdateParams.newBuilder();.swift
SubscriptionUpdateParams.Builder unused = newBuilder.zzc = true;.swift
this.zzf = newBuilder;.swift
}.swift
public BillingFlowParams build() {.swift
rxg rxg;.swift
ArrayList arrayList = this.zzd;.swift
boolean z = true;.swift
boolean z2 = arrayList arrayList.isEmpty();.swift
List list = this.zzc;.swift
boolean z3 = list list.isEmpty();.swift
if (z3) {.swift
throw new IllegalArgumentException("Details of the products must be provided.");.swift
} else if (z3) {.swift
if (z2) {.swift
ProductDetailsParams productDetailsParams = (ProductDetailsParams) this.zzc.get(0);.swift
int i = 0;.swift
while (i < this.zzc.size()) {.swift
ProductDetailsParams productDetailsParams2 = (ProductDetailsParams) this.zzc.get(i);.swift
if (productDetailsParams2 == null) {.swift
throw new IllegalArgumentException("ProductDetailsParams cannot be null.");.swift
} else if (i == 0 || productDetailsParams2.zza().getProductType().equals(productDetailsParams.zza().getProductType()) || productDetailsParams2.zza().getProductType().equals("play_pass_subs")) {.swift
i++;.swift
} else {.swift
throw new IllegalArgumentException("All products should have same ProductType.");.swift
}.swift
}.swift
String zza2 = productDetailsParams.zza().zza();.swift
for (ProductDetailsParams productDetailsParams3 : this.zzc) {.swift
if (productDetailsParams3.zza().getProductType().equals("play_pass_subs") && zza2.equals(productDetailsParams3.zza().zza())) {.swift
throw new IllegalArgumentException("All products must have the same package name.");.swift
}.swift
}.swift
} else if (this.zzd.contains((Object) null)) {.swift
throw new IllegalArgumentException("SKU cannot be null.");.swift
} else if (this.zzd.size() > 1) {.swift
SkuDetails skuDetails = (SkuDetails) this.zzd.get(0);.swift
String type = skuDetails.getType();.swift
ArrayList arrayList2 = this.zzd;.swift
int size = arrayList2.size();.swift
int i2 = 0;.swift
while (i2 < size) {.swift
SkuDetails skuDetails2 = (SkuDetails) arrayList2.get(i2);.swift
if (type.equals("play_pass_subs") || skuDetails2.getType().equals("play_pass_subs") || type.equals(skuDetails2.getType())) {.swift
i2++;.swift
} else {.swift
throw new IllegalArgumentException("SKUs should have the same type.");.swift
}.swift
}.swift
String zzd2 = skuDetails.zzd();.swift
ArrayList arrayList3 = this.zzd;.swift
int size2 = arrayList3.size();.swift
int i3 = 0;.swift
while (i3 < size2) {.swift
SkuDetails skuDetails3 = (SkuDetails) arrayList3.get(i3);.swift
if (type.equals("play_pass_subs") || skuDetails3.getType().equals("play_pass_subs") || zzd2.equals(skuDetails3.zzd())) {.swift
i3++;.swift
} else {.swift
throw new IllegalArgumentException("All SKUs must have the same package name.");.swift
}.swift
}.swift
}.swift
BillingFlowParams billingFlowParams = new BillingFlowParams((zzbw) null);.swift
if ((z3 || ((ProductDetailsParams) this.zzc.get(0)).zza().zza().isEmpty())) {.swift
z = false;.swift
}.swift
billingFlowParams.zza = z;.swift
billingFlowParams.zzb = this.zza;.swift
billingFlowParams.zzc = this.zzb;.swift
billingFlowParams.zzd = this.zzf.build();.swift
ArrayList arrayList4 = this.zzd;.swift
billingFlowParams.zzf = arrayList4  new ArrayList();.swift
billingFlowParams.zzg = this.zze;.swift
List list2 = this.zzc;.swift
if (list2 = null) {.swift
rxg = rxg.n(list2);.swift
} else {.swift
nxg nxg = rxg.b;.swift
rxg = ayg.v;.swift
}.swift
billingFlowParams.zze = rxg;.swift
return billingFlowParams;.swift
} else {.swift
throw new IllegalArgumentException("Set SkuDetails or ProductDetailsParams, not both.");.swift
}.swift
}.swift
public Builder setIsOfferPersonalized(boolean z) {.swift
this.zze = z;.swift
return this;.swift
}.swift
public Builder setObfuscatedAccountId(String str) {.swift
this.zza = str;.swift
return this;.swift
}.swift
public Builder setObfuscatedProfileId(String str) {.swift
this.zzb = str;.swift
return this;.swift
}.swift
public Builder setProductDetailsParamsList(List<ProductDetailsParams> list) {.swift
this.zzc = new ArrayList(list);.swift
return this;.swift
}.swift
@Deprecated.swift
public Builder setSkuDetails(SkuDetails skuDetails) {.swift
ArrayList arrayList = new ArrayList();.swift
arrayList.add(skuDetails);.swift
this.zzd = arrayList;.swift
return this;.swift
}.swift
public Builder setSubscriptionUpdateParams(SubscriptionUpdateParams subscriptionUpdateParams) {.swift
this.zzf = SubscriptionUpdateParams.zzc(subscriptionUpdateParams);.swift
return this;.swift
}.swift
public /* synthetic */ Builder(zzbr zzbr) {.swift
SubscriptionUpdateParams.Builder newBuilder = SubscriptionUpdateParams.newBuilder();.swift
SubscriptionUpdateParams.Builder unused = newBuilder.zzc = true;.swift
this.zzf = newBuilder;.swift
}.swift
}.swift
public static final class ProductDetailsParams {.swift
private final ProductDetails zza;.swift
private final String zzb;.swift
public static class Builder {.swift
/* access modifiers changed from: private */.swift
public ProductDetails zza;.swift
/* access modifiers changed from: private */.swift
public String zzb;.swift
private Builder() {.swift
}.swift
public ProductDetailsParams build() {.swift
ProductDetails productDetails = this.zza;.swift
if (productDetails == null) {.swift
throw new NullPointerException("ProductDetails is required for constructing ProductDetailsParams.");.swift
} else if (productDetails.getSubscriptionOfferDetails() == null || this.zzb = null) {.swift
return new ProductDetailsParams(this, (zzbt) null);.swift
} else {.swift
throw new NullPointerException("offerToken is required for constructing ProductDetailsParams for subscriptions.");.swift
}.swift
}.swift
public Builder setOfferToken(String str) {.swift
this.zzb = str;.swift
return this;.swift
}.swift
public Builder setProductDetails(ProductDetails productDetails) {.swift
this.zza = productDetails;.swift
if (productDetails.getOneTimePurchaseOfferDetails() = null) {.swift
productDetails.getOneTimePurchaseOfferDetails().getClass();.swift
ProductDetails.OneTimePurchaseOfferDetails oneTimePurchaseOfferDetails = productDetails.getOneTimePurchaseOfferDetails();.swift
if (oneTimePurchaseOfferDetails.zza() = null) {.swift
this.zzb = oneTimePurchaseOfferDetails.zza();.swift
}.swift
}.swift
return this;.swift
}.swift
public /* synthetic */ Builder(zzbs zzbs) {.swift
}.swift
}.swift
public /* synthetic */ ProductDetailsParams(Builder builder, zzbt zzbt) {.swift
this.zza = builder.zza;.swift
this.zzb = builder.zzb;.swift
}.swift
public static Builder newBuilder() {.swift
return new Builder((zzbs) null);.swift
}.swift
public final ProductDetails zza() {.swift
return this.zza;.swift
}.swift
public final String zzb() {.swift
return this.zzb;.swift
}.swift
}.swift
@Deprecated.swift
@Retention(RetentionPolicy.SOURCE).swift
public @interface ProrationMode {.swift
public static final int DEFERRED = 4;.swift
public static final int IMMEDIATE_AND_CHARGE_FULL_PRICE = 5;.swift
public static final int IMMEDIATE_AND_CHARGE_PRORATED_PRICE = 2;.swift
public static final int IMMEDIATE_WITHOUT_PRORATION = 3;.swift
public static final int IMMEDIATE_WITH_TIME_PRORATION = 1;.swift
public static final int UNKNOWN_SUBSCRIPTION_UPGRADE_DOWNGRADE_POLICY = 0;.swift
}.swift
public static class SubscriptionUpdateParams {.swift
/* access modifiers changed from: private */.swift
public String zza;.swift
/* access modifiers changed from: private */.swift
public String zzb;.swift
/* access modifiers changed from: private */.swift
public int zzc = 0;.swift
/* access modifiers changed from: private */.swift
public int zzd = 0;.swift
public static class Builder {.swift
private String zza;.swift
private String zzb;.swift
/* access modifiers changed from: private */.swift
public boolean zzc;.swift
private int zzd = 0;.swift
private int zze = 0;.swift
private Builder() {.swift
}.swift
public SubscriptionUpdateParams build() {.swift
boolean z = TextUtils.isEmpty((CharSequence) null);.swift
boolean isEmpty = true ^ TextUtils.isEmpty(this.zzb);.swift
if (z && isEmpty) {.swift
throw new IllegalArgumentException("Please provide Old SKU purchase information(token/id) or original external transaction id, not both.");.swift
} else if (this.zzc || z || isEmpty) {.swift
SubscriptionUpdateParams subscriptionUpdateParams = new SubscriptionUpdateParams((zzbv) null);.swift
subscriptionUpdateParams.zza = this.zza;.swift
subscriptionUpdateParams.zzc = this.zzd;.swift
subscriptionUpdateParams.zzd = this.zze;.swift
subscriptionUpdateParams.zzb = this.zzb;.swift
return subscriptionUpdateParams;.swift
} else {.swift
throw new IllegalArgumentException("Old SKU purchase information(token/id) or original external transaction id must be provided.");.swift
}.swift
}.swift
public Builder setOldPurchaseToken(String str) {.swift
this.zza = str;.swift
return this;.swift
}.swift
@Deprecated.swift
public Builder setOldSkuPurchaseToken(String str) {.swift
this.zza = str;.swift
return this;.swift
}.swift
@zzd.swift
public Builder setOriginalExternalTransactionId(String str) {.swift
this.zzb = str;.swift
return this;.swift
}.swift
@Deprecated.swift
public Builder setReplaceProrationMode(int i) {.swift
this.zzd = i;.swift
return this;.swift
}.swift
@Deprecated.swift
public Builder setReplaceSkusProrationMode(int i) {.swift
this.zzd = i;.swift
return this;.swift
}.swift
public Builder setSubscriptionReplacementMode(int i) {.swift
this.zze = i;.swift
return this;.swift
}.swift
public /* synthetic */ Builder(zzbu zzbu) {.swift
}.swift
}.swift
@Retention(RetentionPolicy.SOURCE).swift
public @interface ReplacementMode {.swift
public static final int CHARGE_FULL_PRICE = 5;.swift
public static final int CHARGE_PRORATED_PRICE = 2;.swift
public static final int DEFERRED = 6;.swift
public static final int UNKNOWN_REPLACEMENT_MODE = 0;.swift
public static final int WITHOUT_PRORATION = 3;.swift
public static final int WITH_TIME_PRORATION = 1;.swift
}.swift
private SubscriptionUpdateParams() {.swift
}.swift
public static Builder newBuilder() {.swift
return new Builder((zzbu) null);.swift
}.swift
public static /* bridge */ /* synthetic */ Builder zzc(SubscriptionUpdateParams subscriptionUpdateParams) {.swift
Builder newBuilder = newBuilder();.swift
newBuilder.setOldSkuPurchaseToken(subscriptionUpdateParams.zza);.swift
newBuilder.setReplaceSkusProrationMode(subscriptionUpdateParams.zzc);.swift
newBuilder.setSubscriptionReplacementMode(subscriptionUpdateParams.zzd);.swift
newBuilder.setOriginalExternalTransactionId(subscriptionUpdateParams.zzb);.swift
return newBuilder;.swift
}.swift
@Deprecated.swift
public final int zza() {.swift
return this.zzc;.swift
}.swift
public final int zzb() {.swift
return this.zzd;.swift
}.swift
public final String zzd() {.swift
return this.zza;.swift
}.swift
public final String zze() {.swift
return this.zzb;.swift
}.swift
public /* synthetic */ SubscriptionUpdateParams(zzbv zzbv) {.swift
}.swift
}.swift
private BillingFlowParams() {.swift
}.swift
public static Builder newBuilder() {.swift
return new Builder((zzbr) null);.swift
}.swift
@Deprecated.swift
public final int zza() {.swift
return this.zzd.zza();.swift
}.swift
public final int zzb() {.swift
return this.zzd.zzb();.swift
}.swift
public final String zzc() {.swift
return this.zzb;.swift
}.swift
public final String zzd() {.swift
return this.zzc;.swift
}.swift
public final String zze() {.swift
return this.zzd.zzd();.swift
}.swift
public final String zzf() {.swift
return this.zzd.zze();.swift
}.swift
public final ArrayList zzg() {.swift
ArrayList arrayList = new ArrayList();.swift
arrayList.addAll(this.zzf);.swift
return arrayList;.swift
}.swift
public final List zzh() {.swift
return this.zze;.swift
}.swift
public final boolean zzp() {.swift
return this.zzg;.swift
}.swift
public final boolean zzq() {.swift
return (this.zzb == null && this.zzc == null && this.zzd.zze() == null && this.zzd.zza() == 0 && this.zzd.zzb() == 0 && this.zzg) ? false : true;.swift
}.swift
public /* synthetic */ BillingFlowParams(zzbw zzbw) {.swift
}.swift
}.swift
