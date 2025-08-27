package com.android.billingclient.api;

import android.content.Context;

final class zzcf {
    private boolean zza;
    private lsf zzb;

    public zzcf(Context context) {
        try {
            qsf.b(context);
            this.zzb = qsf.a().c(ax0.e).a("PLAY_BILLING_LIBRARY", new l65("proto"), zzce.zza);
        } catch (Throwable unused) {
            this.zza = true;
        }
    }

    public final void zza(n4h n4h) {
        if (this.zza) {
            int i = oyg.a;
            return;
        }
        try {
            ((pk4) this.zzb).D(new ta0(n4h, (wb0) null));
        } catch (Throwable unused) {
            int i2 = oyg.a;
        }
    }
}
