package com.android.billingclient.api;

import java.util.concurrent.Callable;

public final /* synthetic */ class zzn implements Callable {
    public final /* synthetic */ BillingClientImpl zza;
    public final /* synthetic */ String zzb;
    public final /* synthetic */ String zzc;

    public /* synthetic */ zzn(BillingClientImpl billingClientImpl, String str, String str2) {
        this.zza = billingClientImpl;
        this.zzb = str;
        this.zzc = str2;
    }

    public final Object call() {
        return this.zza.zzd(this.zzb, this.zzc);
    }
}
