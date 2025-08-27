package com.android.billingclient.api;

public final /* synthetic */ class zzan implements Runnable {
    public final /* synthetic */ BillingClientImpl zza;
    public final /* synthetic */ ExternalOfferAvailabilityListener zzb;

    public /* synthetic */ zzan(BillingClientImpl billingClientImpl, ExternalOfferAvailabilityListener externalOfferAvailabilityListener) {
        this.zza = billingClientImpl;
        this.zzb = externalOfferAvailabilityListener;
    }

    public final void run() {
        this.zza.zzX(this.zzb);
    }
}
