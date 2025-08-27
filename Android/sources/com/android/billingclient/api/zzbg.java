package com.android.billingclient.api;

import android.os.Bundle;
import android.os.RemoteException;
import com.android.billingclient.api.BillingResult;
import org.json.JSONException;

final class zzbg extends v4h {
    final BillingConfigResponseListener zza;
    final zzby zzb;

    public zzbg(BillingConfigResponseListener billingConfigResponseListener, zzby zzby, zzbf zzbf) {
        super("com.android.vending.billing.IInAppBillingGetBillingConfigCallback");
        this.zza = billingConfigResponseListener;
        this.zzb = zzby;
    }

    public final void zza(Bundle bundle) throws RemoteException {
        if (bundle == null) {
            zzby zzby = this.zzb;
            BillingResult billingResult = zzca.zzj;
            zzby.zza(zzbx.zzb(63, 13, billingResult));
            this.zza.onBillingConfigResponse(billingResult, (BillingConfig) null);
            return;
        }
        int a = oyg.a("BillingClient", bundle);
        String d = oyg.d("BillingClient", bundle);
        BillingResult.Builder newBuilder = BillingResult.newBuilder();
        newBuilder.setResponseCode(a);
        newBuilder.setDebugMessage(d);
        if (a != 0) {
            BillingResult build = newBuilder.build();
            this.zzb.zza(zzbx.zzb(23, 13, build));
            this.zza.onBillingConfigResponse(build, (BillingConfig) null);
        } else if (!bundle.containsKey("BILLING_CONFIG")) {
            newBuilder.setResponseCode(6);
            BillingResult build2 = newBuilder.build();
            this.zzb.zza(zzbx.zzb(64, 13, build2));
            this.zza.onBillingConfigResponse(build2, (BillingConfig) null);
        } else {
            try {
                this.zza.onBillingConfigResponse(newBuilder.build(), new BillingConfig(bundle.getString("BILLING_CONFIG")));
            } catch (JSONException unused) {
                int i = oyg.a;
                zzby zzby2 = this.zzb;
                BillingResult billingResult2 = zzca.zzj;
                zzby2.zza(zzbx.zzb(65, 13, billingResult2));
                this.zza.onBillingConfigResponse(billingResult2, (BillingConfig) null);
            }
        }
    }
}
