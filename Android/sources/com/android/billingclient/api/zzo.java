package com.android.billingclient.api;

import android.app.Activity;
import android.os.ResultReceiver;
import java.util.concurrent.Callable;

public final /* synthetic */ class zzo implements Callable {
    public final /* synthetic */ BillingClientImpl zza;
    public final /* synthetic */ Activity zzb;
    public final /* synthetic */ ResultReceiver zzc;
    public final /* synthetic */ AlternativeBillingOnlyInformationDialogListener zzd;

    public /* synthetic */ zzo(BillingClientImpl billingClientImpl, Activity activity, ResultReceiver resultReceiver, AlternativeBillingOnlyInformationDialogListener alternativeBillingOnlyInformationDialogListener) {
        this.zza = billingClientImpl;
        this.zzb = activity;
        this.zzc = resultReceiver;
        this.zzd = alternativeBillingOnlyInformationDialogListener;
    }

    public final Object call() {
        this.zza.zzu(this.zzb, this.zzc, this.zzd);
        return null;
    }
}
