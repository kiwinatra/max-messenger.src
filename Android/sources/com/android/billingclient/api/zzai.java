package com.android.billingclient.api;

public final /* synthetic */ class zzai implements Runnable {
    public final /* synthetic */ BillingClientImpl zza;
    public final /* synthetic */ PurchaseHistoryResponseListener zzb;

    public /* synthetic */ zzai(BillingClientImpl billingClientImpl, PurchaseHistoryResponseListener purchaseHistoryResponseListener) {
        this.zza = billingClientImpl;
        this.zzb = purchaseHistoryResponseListener;
    }

    public final void run() {
        this.zza.zzZ(this.zzb);
    }
}
