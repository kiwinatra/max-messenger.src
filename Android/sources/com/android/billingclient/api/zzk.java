package com.android.billingclient.api;

import android.content.Context;
import android.content.IntentFilter;

final class zzk {
    private final Context zza;
    /* access modifiers changed from: private */
    public final PurchasesUpdatedListener zzb;
    /* access modifiers changed from: private */
    public final AlternativeBillingListener zzc;
    /* access modifiers changed from: private */
    public final UserChoiceBillingListener zzd;
    /* access modifiers changed from: private */
    public final zzby zze;
    private final zzj zzf = new zzj(this, true);
    private final zzj zzg = new zzj(this, false);
    /* access modifiers changed from: private */
    public boolean zzh;

    public zzk(Context context, PurchasesUpdatedListener purchasesUpdatedListener, zzcg zzcg, AlternativeBillingListener alternativeBillingListener, UserChoiceBillingListener userChoiceBillingListener, zzby zzby) {
        this.zza = context;
        this.zzb = purchasesUpdatedListener;
        this.zzc = alternativeBillingListener;
        this.zzd = userChoiceBillingListener;
        this.zze = zzby;
    }

    public final PurchasesUpdatedListener zzd() {
        return this.zzb;
    }

    public final void zzf() {
        this.zzf.zzb(this.zza);
        this.zzg.zzb(this.zza);
    }

    public final void zzg(boolean z) {
        IntentFilter intentFilter = new IntentFilter("com.android.vending.billing.PURCHASES_UPDATED");
        IntentFilter intentFilter2 = new IntentFilter("com.android.vending.billing.LOCAL_BROADCAST_PURCHASES_UPDATED");
        intentFilter2.addAction("com.android.vending.billing.ALTERNATIVE_BILLING");
        this.zzh = z;
        this.zzg.zza(this.zza, intentFilter2);
        if (this.zzh) {
            zzdi.zza(this.zza);
        }
        this.zzf.zza(this.zza, intentFilter);
    }
}
