package com.android.billingclient.api;

import android.os.Bundle;
import android.os.RemoteException;
import org.json.JSONException;

final class zzba extends izg {
    final AlternativeBillingOnlyReportingDetailsListener zza;
    final zzby zzb;

    public zzba(AlternativeBillingOnlyReportingDetailsListener alternativeBillingOnlyReportingDetailsListener, zzby zzby, zzaz zzaz) {
        super("com.android.vending.billing.IInAppBillingCreateAlternativeBillingOnlyTokenCallback");
        this.zza = alternativeBillingOnlyReportingDetailsListener;
        this.zzb = zzby;
    }

    public final void zza(Bundle bundle) throws RemoteException {
        if (bundle == null) {
            zzby zzby = this.zzb;
            BillingResult billingResult = zzca.zzj;
            zzby.zza(zzbx.zzb(71, 15, billingResult));
            this.zza.onAlternativeBillingOnlyTokenResponse(billingResult, (AlternativeBillingOnlyReportingDetails) null);
            return;
        }
        int a = oyg.a("BillingClient", bundle);
        BillingResult zza2 = zzca.zza(a, oyg.d("BillingClient", bundle));
        if (a != 0) {
            this.zzb.zza(zzbx.zzb(23, 15, zza2));
            this.zza.onAlternativeBillingOnlyTokenResponse(zza2, (AlternativeBillingOnlyReportingDetails) null);
            return;
        }
        try {
            this.zza.onAlternativeBillingOnlyTokenResponse(zza2, new AlternativeBillingOnlyReportingDetails(bundle.getString("CREATE_ALTERNATIVE_BILLING_ONLY_REPORTING_DETAILS")));
        } catch (JSONException unused) {
            int i = oyg.a;
            zzby zzby2 = this.zzb;
            BillingResult billingResult2 = zzca.zzj;
            zzby2.zza(zzbx.zzb(72, 15, billingResult2));
            this.zza.onAlternativeBillingOnlyTokenResponse(billingResult2, (AlternativeBillingOnlyReportingDetails) null);
        }
    }
}
