package com.android.billingclient.api;

import android.os.Bundle;
import android.os.RemoteException;

final class zzbm extends h6h {
    final ExternalOfferAvailabilityListener zza;
    final zzby zzb;

    public zzbm(ExternalOfferAvailabilityListener externalOfferAvailabilityListener, zzby zzby, zzbl zzbl) {
        super("com.android.vending.billing.IInAppBillingIsExternalPaymentAvailableCallback");
        this.zza = externalOfferAvailabilityListener;
        this.zzb = zzby;
    }

    public final void zza(Bundle bundle) throws RemoteException {
        if (bundle == null) {
            zzby zzby = this.zzb;
            BillingResult billingResult = zzca.zzj;
            zzby.zza(zzbx.zzb(92, 23, billingResult));
            this.zza.onExternalOfferAvailabilityResponse(billingResult);
            return;
        }
        int a = oyg.a("BillingClient", bundle);
        BillingResult zza2 = zzca.zza(a, oyg.d("BillingClient", bundle));
        if (a != 0) {
            this.zzb.zza(zzbx.zzb(23, 23, zza2));
        }
        this.zza.onExternalOfferAvailabilityResponse(zza2);
    }
}
