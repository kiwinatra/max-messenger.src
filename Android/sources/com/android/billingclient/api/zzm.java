package com.android.billingclient.api;

public final /* synthetic */ class zzm implements Runnable {
    public final /* synthetic */ BillingClientImpl zza;
    public final /* synthetic */ BillingResult zzb;

    public /* synthetic */ zzm(BillingClientImpl billingClientImpl, BillingResult billingResult) {
        this.zza = billingClientImpl;
        this.zzb = billingResult;
    }

    public final void run() {
        this.zza.zzR(this.zzb);
    }
}
