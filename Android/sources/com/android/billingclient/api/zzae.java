package com.android.billingclient.api;

public final /* synthetic */ class zzae implements Runnable {
    public final /* synthetic */ BillingClientImpl zza;
    public final /* synthetic */ ConsumeResponseListener zzb;
    public final /* synthetic */ ConsumeParams zzc;

    public /* synthetic */ zzae(BillingClientImpl billingClientImpl, ConsumeResponseListener consumeResponseListener, ConsumeParams consumeParams) {
        this.zza = billingClientImpl;
        this.zzb = consumeResponseListener;
        this.zzc = consumeParams;
    }

    public final void run() {
        this.zza.zzS(this.zzb, this.zzc);
    }
}
