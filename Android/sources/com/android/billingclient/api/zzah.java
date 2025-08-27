package com.android.billingclient.api;

public final /* synthetic */ class zzah implements Runnable {
    public final /* synthetic */ BillingClientImpl zza;
    public final /* synthetic */ ExternalOfferInformationDialogListener zzb;

    public /* synthetic */ zzah(BillingClientImpl billingClientImpl, ExternalOfferInformationDialogListener externalOfferInformationDialogListener) {
        this.zza = billingClientImpl;
        this.zzb = externalOfferInformationDialogListener;
    }

    public final void run() {
        this.zza.zzad(this.zzb);
    }
}
