package com.android.billingclient.api;

import android.app.Activity;
import android.os.Bundle;
import android.os.ResultReceiver;
import java.util.concurrent.Callable;

public final /* synthetic */ class zzal implements Callable {
    public final /* synthetic */ BillingClientImpl zza;
    public final /* synthetic */ Bundle zzb;
    public final /* synthetic */ Activity zzc;
    public final /* synthetic */ ResultReceiver zzd;

    public /* synthetic */ zzal(BillingClientImpl billingClientImpl, Bundle bundle, Activity activity, ResultReceiver resultReceiver) {
        this.zza = billingClientImpl;
        this.zzb = bundle;
        this.zzc = activity;
        this.zzd = resultReceiver;
    }

    public final Object call() {
        this.zza.zzp(this.zzb, this.zzc, this.zzd);
        return null;
    }
}
