package com.android.billingclient.api;

public final /* synthetic */ class zzaa implements Runnable {
    public final /* synthetic */ BillingClientImpl zza;
    public final /* synthetic */ PurchasesResponseListener zzb;

    public /* synthetic */ zzaa(BillingClientImpl billingClientImpl, PurchasesResponseListener purchasesResponseListener) {
        this.zza = billingClientImpl;
        this.zzb = purchasesResponseListener;
    }

    public final void run() {
        this.zza.zzaa(this.zzb);
    }
}
