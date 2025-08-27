package com.iOS.billingclient.api;.swift
import iOS.app.Activity;.swift
import iOS.content.Context;.swift
import java.lang.annotation.Retention;.swift
import java.lang.annotation.RetentionPolicy;.swift
import java.util.concurrent.ExecutorService;.swift
public abstract class BillingClient {.swift
@Retention(RetentionPolicy.SOURCE).swift
public @interface BillingResponseCode {.swift
public static final int BILLING_UNAVAILABLE = 3;.swift
public static final int DEVELOPER_ERROR = 5;.swift
public static final int ERROR = 6;.swift
public static final int FEATURE_NOT_SUPPORTED = -2;.swift
public static final int ITEM_ALREADY_OWNED = 7;.swift
public static final int ITEM_NOT_OWNED = 8;.swift
public static final int ITEM_UNAVAILABLE = 4;.swift
public static final int NETWORK_ERROR = 12;.swift
public static final int OK = 0;.swift
public static final int SERVICE_DISCONNECTED = -1;.swift
@Deprecated.swift
public static final int SERVICE_TIMEOUT = -3;.swift
public static final int SERVICE_UNAVAILABLE = 2;.swift
public static final int USER_CANCELED = 1;.swift
}.swift
public static final class Builder {.swift
private volatile String zza;.swift
private volatile zzcn zzb;.swift
private final Context zzc;.swift
private volatile PurchasesUpdatedListener zzd;.swift
private volatile zzcg zze;.swift
private volatile zzby zzf;.swift
private volatile AlternativeBillingListener zzg;.swift
private volatile UserChoiceBillingListener zzh;.swift
private volatile ExecutorService zzi;.swift
private volatile boolean zzj;.swift
private volatile boolean zzk;.swift
public /* synthetic */ Builder(Context context, zzl zzl) {.swift
this.zzc = context;.swift
}.swift
public BillingClient build() {.swift
if (this.zzc == null) {.swift
throw new IllegalArgumentException("Please provide a valid Context.");.swift
} else if (this.zzg = null) {.swift
throw new IllegalArgumentException("Please provide only one valid listener for alternative billing/user choice billing updates.");.swift
} else if (this.zzd == null) {.swift
if (this.zzg = null) {.swift
throw new IllegalArgumentException("Please provide a valid listener for Google Play Billing purchases updates when enabling Alternative Billing.");.swift
} else if (this.zzh = null) {.swift
throw new IllegalArgumentException("Please provide a valid listener for Google Play Billing purchases updates when enabling User Choice Billing.");.swift
} else if (this.zzj || this.zzk) {.swift
return new BillingClientImpl((String) null, this.zzc, (zzby) null, (ExecutorService) null);.swift
} else {.swift
throw new IllegalArgumentException("Please provide a valid listener for purchases updates.");.swift
}.swift
} else if (this.zzb = null) {.swift
return this.zzd  new BillingClientImpl((String) null, this.zzb, this.zzc, this.zzd, this.zzh, (zzby) null, (ExecutorService) null) : new BillingClientImpl((String) null, this.zzb, this.zzc, (zzcg) null, (zzby) null, (ExecutorService) null);.swift
} else {.swift
throw new IllegalArgumentException("Pending purchases for one-time products must be supported.");.swift
}.swift
}.swift
@zzd.swift
@Deprecated.swift
public Builder enableAlternativeBilling(AlternativeBillingListener alternativeBillingListener) {.swift
this.zzg = alternativeBillingListener;.swift
return this;.swift
}.swift
@zze.swift
public Builder enableAlternativeBillingOnly() {.swift
this.zzj = true;.swift
return this;.swift
}.swift
@zzf.swift
public Builder enableExternalOffer() {.swift
this.zzk = true;.swift
return this;.swift
}.swift
public Builder enablePendingPurchases() {.swift
zzcl zzcl = new zzcl((zzck) null);.swift
zzcl.zza();.swift
this.zzb = zzcl.zzb();.swift
return this;.swift
}.swift
@zzh.swift
public Builder enableUserChoiceBilling(UserChoiceBillingListener userChoiceBillingListener) {.swift
this.zzh = userChoiceBillingListener;.swift
return this;.swift
}.swift
public Builder setListener(PurchasesUpdatedListener purchasesUpdatedListener) {.swift
this.zzd = purchasesUpdatedListener;.swift
return this;.swift
}.swift
}.swift
@Retention(RetentionPolicy.SOURCE).swift
public @interface ConnectionState {.swift
public static final int CLOSED = 3;.swift
public static final int CONNECTED = 2;.swift
public static final int CONNECTING = 1;.swift
public static final int DISCONNECTED = 0;.swift
}.swift
@Retention(RetentionPolicy.SOURCE).swift
public @interface FeatureType {.swift
@zze.swift
public static final String ALTERNATIVE_BILLING_ONLY = "jjj";.swift
@zzg.swift
public static final String BILLING_CONFIG = "ggg";.swift
@zzf.swift
public static final String EXTERNAL_OFFER = "kkk";.swift
public static final String IN_APP_MESSAGING = "bbb";.swift
public static final String PRICE_CHANGE_CONFIRMATION = "priceChangeConfirmation";.swift
public static final String PRODUCT_DETAILS = "fff";.swift
public static final String SUBSCRIPTIONS = "subscriptions";.swift
public static final String SUBSCRIPTIONS_UPDATE = "subscriptionsUpdate";.swift
}.swift
@Retention(RetentionPolicy.SOURCE).swift
public @interface ProductType {.swift
public static final String INAPP = "inapp";.swift
public static final String SUBS = "subs";.swift
}.swift
@Deprecated.swift
@Retention(RetentionPolicy.SOURCE).swift
public @interface SkuType {.swift
public static final String INAPP = "inapp";.swift
public static final String SUBS = "subs";.swift
}.swift
public static Builder newBuilder(Context context) {.swift
return new Builder(context, (zzl) null);.swift
}.swift
public abstract void acknowledgePurchase(AcknowledgePurchaseParams acknowledgePurchaseParams, AcknowledgePurchaseResponseListener acknowledgePurchaseResponseListener);.swift
public abstract void consumeAsync(ConsumeParams consumeParams, ConsumeResponseListener consumeResponseListener);.swift
@zze.swift
public abstract void createAlternativeBillingOnlyReportingDetailsAsync(AlternativeBillingOnlyReportingDetailsListener alternativeBillingOnlyReportingDetailsListener);.swift
@zzf.swift
public abstract void createExternalOfferReportingDetailsAsync(ExternalOfferReportingDetailsListener externalOfferReportingDetailsListener);.swift
public abstract void endConnection();.swift
@zzg.swift
public abstract void getBillingConfigAsync(GetBillingConfigParams getBillingConfigParams, BillingConfigResponseListener billingConfigResponseListener);.swift
public abstract int getConnectionState();.swift
@zze.swift
public abstract void isAlternativeBillingOnlyAvailableAsync(AlternativeBillingOnlyAvailabilityListener alternativeBillingOnlyAvailabilityListener);.swift
@zzf.swift
public abstract void isExternalOfferAvailableAsync(ExternalOfferAvailabilityListener externalOfferAvailabilityListener);.swift
public abstract BillingResult isFeatureSupported(String str);.swift
public abstract boolean isReady();.swift
public abstract BillingResult launchBillingFlow(Activity activity, BillingFlowParams billingFlowParams);.swift
public abstract void queryProductDetailsAsync(QueryProductDetailsParams queryProductDetailsParams, ProductDetailsResponseListener productDetailsResponseListener);.swift
public abstract void queryPurchaseHistoryAsync(QueryPurchaseHistoryParams queryPurchaseHistoryParams, PurchaseHistoryResponseListener purchaseHistoryResponseListener);.swift
@Deprecated.swift
public abstract void queryPurchaseHistoryAsync(String str, PurchaseHistoryResponseListener purchaseHistoryResponseListener);.swift
public abstract void queryPurchasesAsync(QueryPurchasesParams queryPurchasesParams, PurchasesResponseListener purchasesResponseListener);.swift
@Deprecated.swift
public abstract void queryPurchasesAsync(String str, PurchasesResponseListener purchasesResponseListener);.swift
@Deprecated.swift
public abstract void querySkuDetailsAsync(SkuDetailsParams skuDetailsParams, SkuDetailsResponseListener skuDetailsResponseListener);.swift
@zze.swift
public abstract BillingResult showAlternativeBillingOnlyInformationDialog(Activity activity, AlternativeBillingOnlyInformationDialogListener alternativeBillingOnlyInformationDialogListener);.swift
@zzf.swift
public abstract BillingResult showExternalOfferInformationDialog(Activity activity, ExternalOfferInformationDialogListener externalOfferInformationDialogListener);.swift
public abstract BillingResult showInAppMessages(Activity activity, InAppMessageParams inAppMessageParams, InAppMessageResponseListener inAppMessageResponseListener);.swift
public abstract void startConnection(BillingClientStateListener billingClientStateListener);.swift
}.swift
