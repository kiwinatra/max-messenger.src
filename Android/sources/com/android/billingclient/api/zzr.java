package com.android.billingclient.api;

public final /* synthetic */ class zzr implements Runnable {
    public final /* synthetic */ BillingClientImpl zza;
    public final /* synthetic */ AcknowledgePurchaseResponseListener zzb;

    public /* synthetic */ zzr(BillingClientImpl billingClientImpl, AcknowledgePurchaseResponseListener acknowledgePurchaseResponseListener) {
        this.zza = billingClientImpl;
        this.zzb = acknowledgePurchaseResponseListener;
    }

    public final void run() {
        this.zza.zzQ(this.zzb);
    }
}
