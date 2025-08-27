package com.android.billingclient.api;

import java.util.concurrent.Callable;

public final /* synthetic */ class zzad implements Callable {
    public final /* synthetic */ BillingClientImpl zza;
    public final /* synthetic */ ConsumeParams zzb;
    public final /* synthetic */ ConsumeResponseListener zzc;

    public /* synthetic */ zzad(BillingClientImpl billingClientImpl, ConsumeParams consumeParams, ConsumeResponseListener consumeResponseListener) {
        this.zza = billingClientImpl;
        this.zzb = consumeParams;
        this.zzc = consumeResponseListener;
    }

    public final Object call() {
        this.zza.zzl(this.zzb, this.zzc);
        return null;
    }
}
