package com.android.billingclient.api;

import java.util.concurrent.Callable;

public final /* synthetic */ class zzv implements Callable {
    public final /* synthetic */ BillingClientImpl zza;
    public final /* synthetic */ AlternativeBillingOnlyReportingDetailsListener zzb;

    public /* synthetic */ zzv(BillingClientImpl billingClientImpl, AlternativeBillingOnlyReportingDetailsListener alternativeBillingOnlyReportingDetailsListener) {
        this.zza = billingClientImpl;
        this.zzb = alternativeBillingOnlyReportingDetailsListener;
    }

    public final Object call() {
        this.zza.zzq(this.zzb);
        return null;
    }
}
