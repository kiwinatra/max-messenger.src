package com.android.billingclient.api;

import android.os.Bundle;
import android.os.Handler;
import android.os.ResultReceiver;
import com.android.billingclient.api.BillingResult;

final class zzat extends ResultReceiver {
    final /* synthetic */ AlternativeBillingOnlyInformationDialogListener zza;
    final /* synthetic */ BillingClientImpl zzb;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public zzat(BillingClientImpl billingClientImpl, Handler handler, AlternativeBillingOnlyInformationDialogListener alternativeBillingOnlyInformationDialogListener) {
        super(handler);
        this.zza = alternativeBillingOnlyInformationDialogListener;
        this.zzb = billingClientImpl;
    }

    public final void onReceiveResult(int i, Bundle bundle) {
        BillingResult.Builder newBuilder = BillingResult.newBuilder();
        newBuilder.setResponseCode(i);
        if (i != 0) {
            if (bundle == null) {
                zzby zzh = this.zzb.zzf;
                BillingResult billingResult = zzca.zzj;
                zzh.zza(zzbx.zzb(73, 16, billingResult));
                this.zza.onAlternativeBillingOnlyInformationDialogResponse(billingResult);
                return;
            }
            newBuilder.setDebugMessage(oyg.d("BillingClient", bundle));
            int i2 = bundle.getInt("INTERNAL_LOG_ERROR_REASON");
            this.zzb.zzf.zza(zzbx.zzc(i2 != 0 ? hi7.k0(i2) : 23, 16, newBuilder.build(), bundle.getString("INTERNAL_LOG_ERROR_ADDITIONAL_DETAILS")));
        }
        this.zza.onAlternativeBillingOnlyInformationDialogResponse(newBuilder.build());
    }
}
