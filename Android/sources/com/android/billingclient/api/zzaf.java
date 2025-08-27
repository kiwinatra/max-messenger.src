package com.android.billingclient.api;

import android.app.Activity;
import android.os.ResultReceiver;
import java.util.concurrent.Callable;

public final /* synthetic */ class zzaf implements Callable {
    public final /* synthetic */ BillingClientImpl zza;
    public final /* synthetic */ Activity zzb;
    public final /* synthetic */ ResultReceiver zzc;
    public final /* synthetic */ ExternalOfferInformationDialogListener zzd;

    public /* synthetic */ zzaf(BillingClientImpl billingClientImpl, Activity activity, ResultReceiver resultReceiver, ExternalOfferInformationDialogListener externalOfferInformationDialogListener) {
        this.zza = billingClientImpl;
        this.zzb = activity;
        this.zzc = resultReceiver;
        this.zzd = externalOfferInformationDialogListener;
    }

    public final Object call() {
        this.zza.zzv(this.zzb, this.zzc, this.zzd);
        return null;
    }
}
