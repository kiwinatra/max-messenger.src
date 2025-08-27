package com.android.billingclient.api;

public final /* synthetic */ class zzag implements Runnable {
    public final /* synthetic */ BillingClientImpl zza;
    public final /* synthetic */ ExternalOfferReportingDetailsListener zzb;

    public /* synthetic */ zzag(BillingClientImpl billingClientImpl, ExternalOfferReportingDetailsListener externalOfferReportingDetailsListener) {
        this.zza = billingClientImpl;
        this.zzb = externalOfferReportingDetailsListener;
    }

    public final void run() {
        this.zza.zzU(this.zzb);
    }
}
