package com.android.billingclient.api;

public final /* synthetic */ class zzp implements Runnable {
    public final /* synthetic */ BillingClientImpl zza;
    public final /* synthetic */ AlternativeBillingOnlyInformationDialogListener zzb;

    public /* synthetic */ zzp(BillingClientImpl billingClientImpl, AlternativeBillingOnlyInformationDialogListener alternativeBillingOnlyInformationDialogListener) {
        this.zza = billingClientImpl;
        this.zzb = alternativeBillingOnlyInformationDialogListener;
    }

    public final void run() {
        this.zza.zzac(this.zzb);
    }
}
