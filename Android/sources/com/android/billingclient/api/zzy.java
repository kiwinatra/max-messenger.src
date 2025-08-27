package com.android.billingclient.api;

import java.util.List;
import java.util.concurrent.Callable;

public final /* synthetic */ class zzy implements Callable {
    public final /* synthetic */ BillingClientImpl zza;
    public final /* synthetic */ String zzb;
    public final /* synthetic */ List zzc;
    public final /* synthetic */ SkuDetailsResponseListener zzd;

    public /* synthetic */ zzy(BillingClientImpl billingClientImpl, String str, List list, String str2, SkuDetailsResponseListener skuDetailsResponseListener) {
        this.zza = billingClientImpl;
        this.zzb = str;
        this.zzc = list;
        this.zzd = skuDetailsResponseListener;
    }

    public final Object call() {
        this.zza.zzo(this.zzb, this.zzc, (String) null, this.zzd);
        return null;
    }
}
