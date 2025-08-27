package com.android.billingclient.api;

import java.util.concurrent.Callable;

public final /* synthetic */ class zzab implements Callable {
    public final /* synthetic */ BillingClientImpl zza;
    public final /* synthetic */ AlternativeBillingOnlyAvailabilityListener zzb;

    public /* synthetic */ zzab(BillingClientImpl billingClientImpl, AlternativeBillingOnlyAvailabilityListener alternativeBillingOnlyAvailabilityListener) {
        this.zza = billingClientImpl;
        this.zzb = alternativeBillingOnlyAvailabilityListener;
    }

    public final Object call() {
        this.zza.zzs(this.zzb);
        return null;
    }
}
