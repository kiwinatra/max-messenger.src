package com.android.billingclient.api;

import com.android.billingclient.api.BillingResult;

final class zzca {
    static final BillingResult zzA = wzf.j(-2, "Play Store version installed does not support get billing config.");
    static final BillingResult zzB = wzf.j(-2, "Query product details with serialized docid is not supported.");
    static final BillingResult zzC = wzf.j(4, "Item is unavailable for purchase.");
    static final BillingResult zzD = wzf.j(-2, "Query product details with developer specified account is not supported.");
    static final BillingResult zzE = wzf.j(-2, "Play Store version installed does not support alternative billing only.");
    static final BillingResult zzF = wzf.j(5, "To use this API you must specify a PurchasesUpdateListener when initializing a BillingClient.");
    public static final /* synthetic */ int zzG = 0;
    static final BillingResult zza = wzf.j(3, "Google Play In-app Billing API version is less than 3");
    static final BillingResult zzb = wzf.j(3, "Google Play In-app Billing API version is less than 9");
    static final BillingResult zzc = wzf.j(3, "Billing service unavailable on device.");
    static final BillingResult zzd = wzf.j(5, "Client is already in the process of connecting to billing service.");
    static final BillingResult zze = wzf.j(5, "The list of SKUs can't be empty.");
    static final BillingResult zzf = wzf.j(5, "SKU type can't be empty.");
    static final BillingResult zzg = wzf.j(5, "Product type can't be empty.");
    static final BillingResult zzh = wzf.j(-2, "Client does not support extra params.");
    static final BillingResult zzi = wzf.j(5, "Invalid purchase token.");
    static final BillingResult zzj = wzf.j(6, "An internal error occurred.");
    static final BillingResult zzk = wzf.j(5, "SKU can't be null.");
    static final BillingResult zzl;
    static final BillingResult zzm = wzf.j(-1, "Service connection is disconnected.");
    static final BillingResult zzn = wzf.j(2, "Timeout communicating with service.");
    static final BillingResult zzo = wzf.j(-2, "Client does not support subscriptions.");
    static final BillingResult zzp = wzf.j(-2, "Client does not support subscriptions update.");
    static final BillingResult zzq = wzf.j(-2, "Client does not support get purchase history.");
    static final BillingResult zzr = wzf.j(-2, "Client does not support price change confirmation.");
    static final BillingResult zzs = wzf.j(-2, "Play Store version installed does not support cross selling products.");
    static final BillingResult zzt = wzf.j(-2, "Client does not support multi-item purchases.");
    static final BillingResult zzu = wzf.j(-2, "Client does not support offer_id_token.");
    static final BillingResult zzv = wzf.j(-2, "Client does not support ProductDetails.");
    static final BillingResult zzw = wzf.j(-2, "Client does not support in-app messages.");
    static final BillingResult zzx = wzf.j(-2, "Client does not support user choice billing.");
    static final BillingResult zzy = wzf.j(-2, "Play Store version installed does not support external offer.");
    static final BillingResult zzz = wzf.j(5, "Unknown feature");

    static {
        BillingResult.Builder newBuilder = BillingResult.newBuilder();
        newBuilder.setResponseCode(0);
        zzl = newBuilder.build();
    }

    public static BillingResult zza(int i, String str) {
        return wzf.j(i, str);
    }
}
