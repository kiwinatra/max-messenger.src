package com.android.billingclient.api;

import java.util.concurrent.Callable;

public final /* synthetic */ class zzam implements Callable {
    public final /* synthetic */ BillingClientImpl zza;
    public final /* synthetic */ ExternalOfferAvailabilityListener zzb;

    public /* synthetic */ zzam(BillingClientImpl billingClientImpl, ExternalOfferAvailabilityListener externalOfferAvailabilityListener) {
        this.zza = billingClientImpl;
        this.zzb = externalOfferAvailabilityListener;
    }

    public final Object call() {
        this.zza.zzt(this.zzb);
        return null;
    }
}
