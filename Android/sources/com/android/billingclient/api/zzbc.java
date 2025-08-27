package com.android.billingclient.api;

import android.os.Bundle;
import android.os.RemoteException;
import org.json.JSONException;

final class zzbc extends p1h {
    final ExternalOfferReportingDetailsListener zza;
    final zzby zzb;

    public zzbc(ExternalOfferReportingDetailsListener externalOfferReportingDetailsListener, zzby zzby, zzbb zzbb) {
        super("com.android.vending.billing.IInAppBillingCreateExternalPaymentReportingDetailsCallback");
        this.zza = externalOfferReportingDetailsListener;
        this.zzb = zzby;
    }

    public final void zza(Bundle bundle) throws RemoteException {
        if (bundle == null) {
            zzby zzby = this.zzb;
            BillingResult billingResult = zzca.zzj;
            zzby.zza(zzbx.zzb(95, 24, billingResult));
            this.zza.onExternalOfferReportingDetailsResponse(billingResult, (ExternalOfferReportingDetails) null);
            return;
        }
        int a = oyg.a("BillingClient", bundle);
        BillingResult zza2 = zzca.zza(a, oyg.d("BillingClient", bundle));
        if (a != 0) {
            this.zzb.zza(zzbx.zzb(23, 24, zza2));
            this.zza.onExternalOfferReportingDetailsResponse(zza2, (ExternalOfferReportingDetails) null);
            return;
        }
        try {
            this.zza.onExternalOfferReportingDetailsResponse(zza2, new ExternalOfferReportingDetails(bundle.getString("CREATE_EXTERNAL_PAYMENT_REPORTING_DETAILS")));
        } catch (JSONException unused) {
            int i = oyg.a;
            zzby zzby2 = this.zzb;
            BillingResult billingResult2 = zzca.zzj;
            zzby2.zza(zzbx.zzb(104, 24, billingResult2));
            this.zza.onExternalOfferReportingDetailsResponse(billingResult2, (ExternalOfferReportingDetails) null);
        }
    }
}
