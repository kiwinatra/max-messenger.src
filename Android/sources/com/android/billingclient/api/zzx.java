package com.android.billingclient.api;

import java.util.concurrent.Callable;

public final /* synthetic */ class zzx implements Callable {
    public final /* synthetic */ BillingClientImpl zza;
    public final /* synthetic */ ExternalOfferReportingDetailsListener zzb;

    public /* synthetic */ zzx(BillingClientImpl billingClientImpl, ExternalOfferReportingDetailsListener externalOfferReportingDetailsListener) {
        this.zza = billingClientImpl;
        this.zzb = externalOfferReportingDetailsListener;
    }

    public final Object call() {
        this.zza.zzr(this.zzb);
        return null;
    }
}
