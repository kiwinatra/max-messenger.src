package com.android.billingclient.api;

public final /* synthetic */ class zzac implements Runnable {
    public final /* synthetic */ BillingClientImpl zza;
    public final /* synthetic */ AlternativeBillingOnlyAvailabilityListener zzb;

    public /* synthetic */ zzac(BillingClientImpl billingClientImpl, AlternativeBillingOnlyAvailabilityListener alternativeBillingOnlyAvailabilityListener) {
        this.zza = billingClientImpl;
        this.zzb = alternativeBillingOnlyAvailabilityListener;
    }

    public final void run() {
        this.zza.zzW(this.zzb);
    }
}
