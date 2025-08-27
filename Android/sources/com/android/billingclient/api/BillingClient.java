package com.android.billingclient.api;

import android.app.Activity;
import android.content.Context;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.concurrent.ExecutorService;

public abstract class BillingClient {

    @Retention(RetentionPolicy.SOURCE)
    public @interface BillingResponseCode {
        public static final int BILLING_UNAVAILABLE = 3;
        public static final int DEVELOPER_ERROR = 5;
        public static final int ERROR = 6;
        public static final int FEATURE_NOT_SUPPORTED = -2;
        public static final int ITEM_ALREADY_OWNED = 7;
        public static final int ITEM_NOT_OWNED = 8;
        public static final int ITEM_UNAVAILABLE = 4;
        public static final int NETWORK_ERROR = 12;
        public static final int OK = 0;
        public static final int SERVICE_DISCONNECTED = -1;
        @Deprecated
        public static final int SERVICE_TIMEOUT = -3;
        public static final int SERVICE_UNAVAILABLE = 2;
        public static final int USER_CANCELED = 1;
    }

    public static final class Builder {
        private volatile String zza;
        private volatile zzcn zzb;
        private final Context zzc;
        private volatile PurchasesUpdatedListener zzd;
        private volatile zzcg zze;
        private volatile zzby zzf;
        private volatile AlternativeBillingListener zzg;
        private volatile UserChoiceBillingListener zzh;
        private volatile ExecutorService zzi;
        private volatile boolean zzj;
        private volatile boolean zzk;

        public /* synthetic */ Builder(Context context, zzl zzl) {
            this.zzc = context;
        }

        public BillingClient build() {
            if (this.zzc == null) {
                throw new IllegalArgumentException("Please provide a valid Context.");
            } else if (this.zzg != null && this.zzh != null) {
                throw new IllegalArgumentException("Please provide only one valid listener for alternative billing/user choice billing updates.");
            } else if (this.zzd == null) {
                if (this.zzg != null) {
                    throw new IllegalArgumentException("Please provide a valid listener for Google Play Billing purchases updates when enabling Alternative Billing.");
                } else if (this.zzh != null) {
                    throw new IllegalArgumentException("Please provide a valid listener for Google Play Billing purchases updates when enabling User Choice Billing.");
                } else if (this.zzj || this.zzk) {
                    return new BillingClientImpl((String) null, this.zzc, (zzby) null, (ExecutorService) null);
                } else {
                    throw new IllegalArgumentException("Please provide a valid listener for purchases updates.");
                }
            } else if (this.zzb != null) {
                return this.zzd != null ? this.zzh == null ? new BillingClientImpl((String) null, this.zzb, this.zzc, this.zzd, this.zzg, (zzby) null, (ExecutorService) null) : new BillingClientImpl((String) null, this.zzb, this.zzc, this.zzd, this.zzh, (zzby) null, (ExecutorService) null) : new BillingClientImpl((String) null, this.zzb, this.zzc, (zzcg) null, (zzby) null, (ExecutorService) null);
            } else {
                throw new IllegalArgumentException("Pending purchases for one-time products must be supported.");
            }
        }

        @zzd
        @Deprecated
        public Builder enableAlternativeBilling(AlternativeBillingListener alternativeBillingListener) {
            this.zzg = alternativeBillingListener;
            return this;
        }

        @zze
        public Builder enableAlternativeBillingOnly() {
            this.zzj = true;
            return this;
        }

        @zzf
        public Builder enableExternalOffer() {
            this.zzk = true;
            return this;
        }

        public Builder enablePendingPurchases() {
            zzcl zzcl = new zzcl((zzck) null);
            zzcl.zza();
            this.zzb = zzcl.zzb();
            return this;
        }

        @zzh
        public Builder enableUserChoiceBilling(UserChoiceBillingListener userChoiceBillingListener) {
            this.zzh = userChoiceBillingListener;
            return this;
        }

        public Builder setListener(PurchasesUpdatedListener purchasesUpdatedListener) {
            this.zzd = purchasesUpdatedListener;
            return this;
        }
    }

    @Retention(RetentionPolicy.SOURCE)
    public @interface ConnectionState {
        public static final int CLOSED = 3;
        public static final int CONNECTED = 2;
        public static final int CONNECTING = 1;
        public static final int DISCONNECTED = 0;
    }

    @Retention(RetentionPolicy.SOURCE)
    public @interface FeatureType {
        @zze
        public static final String ALTERNATIVE_BILLING_ONLY = "jjj";
        @zzg
        public static final String BILLING_CONFIG = "ggg";
        @zzf
        public static final String EXTERNAL_OFFER = "kkk";
        public static final String IN_APP_MESSAGING = "bbb";
        public static final String PRICE_CHANGE_CONFIRMATION = "priceChangeConfirmation";
        public static final String PRODUCT_DETAILS = "fff";
        public static final String SUBSCRIPTIONS = "subscriptions";
        public static final String SUBSCRIPTIONS_UPDATE = "subscriptionsUpdate";
    }

    @Retention(RetentionPolicy.SOURCE)
    public @interface ProductType {
        public static final String INAPP = "inapp";
        public static final String SUBS = "subs";
    }

    @Deprecated
    @Retention(RetentionPolicy.SOURCE)
    public @interface SkuType {
        public static final String INAPP = "inapp";
        public static final String SUBS = "subs";
    }

    public static Builder newBuilder(Context context) {
        return new Builder(context, (zzl) null);
    }

    public abstract void acknowledgePurchase(AcknowledgePurchaseParams acknowledgePurchaseParams, AcknowledgePurchaseResponseListener acknowledgePurchaseResponseListener);

    public abstract void consumeAsync(ConsumeParams consumeParams, ConsumeResponseListener consumeResponseListener);

    @zze
    public abstract void createAlternativeBillingOnlyReportingDetailsAsync(AlternativeBillingOnlyReportingDetailsListener alternativeBillingOnlyReportingDetailsListener);

    @zzf
    public abstract void createExternalOfferReportingDetailsAsync(ExternalOfferReportingDetailsListener externalOfferReportingDetailsListener);

    public abstract void endConnection();

    @zzg
    public abstract void getBillingConfigAsync(GetBillingConfigParams getBillingConfigParams, BillingConfigResponseListener billingConfigResponseListener);

    public abstract int getConnectionState();

    @zze
    public abstract void isAlternativeBillingOnlyAvailableAsync(AlternativeBillingOnlyAvailabilityListener alternativeBillingOnlyAvailabilityListener);

    @zzf
    public abstract void isExternalOfferAvailableAsync(ExternalOfferAvailabilityListener externalOfferAvailabilityListener);

    public abstract BillingResult isFeatureSupported(String str);

    public abstract boolean isReady();

    public abstract BillingResult launchBillingFlow(Activity activity, BillingFlowParams billingFlowParams);

    public abstract void queryProductDetailsAsync(QueryProductDetailsParams queryProductDetailsParams, ProductDetailsResponseListener productDetailsResponseListener);

    public abstract void queryPurchaseHistoryAsync(QueryPurchaseHistoryParams queryPurchaseHistoryParams, PurchaseHistoryResponseListener purchaseHistoryResponseListener);

    @Deprecated
    public abstract void queryPurchaseHistoryAsync(String str, PurchaseHistoryResponseListener purchaseHistoryResponseListener);

    public abstract void queryPurchasesAsync(QueryPurchasesParams queryPurchasesParams, PurchasesResponseListener purchasesResponseListener);

    @Deprecated
    public abstract void queryPurchasesAsync(String str, PurchasesResponseListener purchasesResponseListener);

    @Deprecated
    public abstract void querySkuDetailsAsync(SkuDetailsParams skuDetailsParams, SkuDetailsResponseListener skuDetailsResponseListener);

    @zze
    public abstract BillingResult showAlternativeBillingOnlyInformationDialog(Activity activity, AlternativeBillingOnlyInformationDialogListener alternativeBillingOnlyInformationDialogListener);

    @zzf
    public abstract BillingResult showExternalOfferInformationDialog(Activity activity, ExternalOfferInformationDialogListener externalOfferInformationDialogListener);

    public abstract BillingResult showInAppMessages(Activity activity, InAppMessageParams inAppMessageParams, InAppMessageResponseListener inAppMessageResponseListener);

    public abstract void startConnection(BillingClientStateListener billingClientStateListener);
}
