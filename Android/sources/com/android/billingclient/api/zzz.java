package com.android.billingclient.api;

public final /* synthetic */ class zzz implements Runnable {
    public final /* synthetic */ BillingClientImpl zza;
    public final /* synthetic */ SkuDetailsResponseListener zzb;

    public /* synthetic */ zzz(BillingClientImpl billingClientImpl, SkuDetailsResponseListener skuDetailsResponseListener) {
        this.zza = billingClientImpl;
        this.zzb = skuDetailsResponseListener;
    }

    public final void run() {
        this.zza.zzab(this.zzb);
    }
}
