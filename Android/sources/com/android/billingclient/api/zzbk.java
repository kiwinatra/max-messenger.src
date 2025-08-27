package com.android.billingclient.api;

import android.os.Bundle;
import android.os.RemoteException;

final class zzbk extends y5h {
    final AlternativeBillingOnlyAvailabilityListener zza;
    final zzby zzb;

    public zzbk(AlternativeBillingOnlyAvailabilityListener alternativeBillingOnlyAvailabilityListener, zzby zzby, zzbj zzbj) {
        super("com.android.vending.billing.IInAppBillingIsAlternativeBillingOnlyAvailableCallback");
        this.zza = alternativeBillingOnlyAvailabilityListener;
        this.zzb = zzby;
    }

    public final void zza(Bundle bundle) throws RemoteException {
        if (bundle == null) {
            zzby zzby = this.zzb;
            BillingResult billingResult = zzca.zzj;
            zzby.zza(zzbx.zzb(67, 14, billingResult));
            this.zza.onAlternativeBillingOnlyAvailabilityResponse(billingResult);
            return;
        }
        int a = oyg.a("BillingClient", bundle);
        BillingResult zza2 = zzca.zza(a, oyg.d("BillingClient", bundle));
        if (a != 0) {
            this.zzb.zza(zzbx.zzb(23, 14, zza2));
        }
        this.zza.onAlternativeBillingOnlyAvailabilityResponse(zza2);
    }
}
