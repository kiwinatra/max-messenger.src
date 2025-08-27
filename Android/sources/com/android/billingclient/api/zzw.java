package com.android.billingclient.api;

public final /* synthetic */ class zzw implements Runnable {
    public final /* synthetic */ BillingClientImpl zza;
    public final /* synthetic */ AlternativeBillingOnlyReportingDetailsListener zzb;

    public /* synthetic */ zzw(BillingClientImpl billingClientImpl, AlternativeBillingOnlyReportingDetailsListener alternativeBillingOnlyReportingDetailsListener) {
        this.zza = billingClientImpl;
        this.zzb = alternativeBillingOnlyReportingDetailsListener;
    }

    public final void run() {
        this.zza.zzT(this.zzb);
    }
}
