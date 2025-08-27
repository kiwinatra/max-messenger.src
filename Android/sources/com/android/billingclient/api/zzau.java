package com.android.billingclient.api;

import android.os.Bundle;
import android.os.Handler;
import android.os.ResultReceiver;
import com.android.billingclient.api.BillingResult;

final class zzau extends ResultReceiver {
    final /* synthetic */ ExternalOfferInformationDialogListener zza;
    final /* synthetic */ BillingClientImpl zzb;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public zzau(BillingClientImpl billingClientImpl, Handler handler, ExternalOfferInformationDialogListener externalOfferInformationDialogListener) {
        super(handler);
        this.zza = externalOfferInformationDialogListener;
        this.zzb = billingClientImpl;
    }

    public final void onReceiveResult(int i, Bundle bundle) {
        BillingResult.Builder newBuilder = BillingResult.newBuilder();
        newBuilder.setResponseCode(i);
        if (i != 0) {
            if (bundle == null) {
                zzby zzh = this.zzb.zzf;
                BillingResult billingResult = zzca.zzj;
                zzh.zza(zzbx.zzb(97, 25, billingResult));
                this.zza.onExternalOfferInformationDialogResponse(billingResult);
                return;
            }
            newBuilder.setDebugMessage(oyg.d("BillingClient", bundle));
            int i2 = bundle.getInt("INTERNAL_LOG_ERROR_REASON");
            this.zzb.zzf.zza(zzbx.zzc(i2 != 0 ? hi7.k0(i2) : 23, 25, newBuilder.build(), bundle.getString("INTERNAL_LOG_ERROR_ADDITIONAL_DETAILS")));
        }
        this.zza.onExternalOfferInformationDialogResponse(newBuilder.build());
    }
}
