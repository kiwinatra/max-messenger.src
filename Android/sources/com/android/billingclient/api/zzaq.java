package com.android.billingclient.api;

import java.util.concurrent.Callable;

final class zzaq implements Callable {
    final /* synthetic */ String zza;
    final /* synthetic */ PurchasesResponseListener zzb;
    final /* synthetic */ BillingClientImpl zzc;

    public zzaq(BillingClientImpl billingClientImpl, String str, PurchasesResponseListener purchasesResponseListener) {
        this.zza = str;
        this.zzb = purchasesResponseListener;
        this.zzc = billingClientImpl;
    }

    public final Object call() throws Exception {
        zzcx zzaf = BillingClientImpl.zzaf(this.zzc, this.zza, 9);
        if (zzaf.zzb() != null) {
            this.zzb.onQueryPurchasesResponse(zzaf.zza(), zzaf.zzb());
            return null;
        }
        PurchasesResponseListener purchasesResponseListener = this.zzb;
        BillingResult zza2 = zzaf.zza();
        nxg nxg = rxg.b;
        purchasesResponseListener.onQueryPurchasesResponse(zza2, ayg.v);
        return null;
    }
}
