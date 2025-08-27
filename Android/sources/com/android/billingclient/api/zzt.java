package com.android.billingclient.api;

public final /* synthetic */ class zzt implements Runnable {
    public final /* synthetic */ BillingClientImpl zza;
    public final /* synthetic */ BillingConfigResponseListener zzb;

    public /* synthetic */ zzt(BillingClientImpl billingClientImpl, BillingConfigResponseListener billingConfigResponseListener) {
        this.zza = billingClientImpl;
        this.zzb = billingConfigResponseListener;
    }

    public final void run() {
        this.zza.zzV(this.zzb);
    }
}
