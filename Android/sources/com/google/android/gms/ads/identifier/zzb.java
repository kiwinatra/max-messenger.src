package com.google.android.gms.ads.identifier;

import java.lang.ref.WeakReference;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

final class zzb extends Thread {
    final CountDownLatch zza = new CountDownLatch(1);
    private final WeakReference zzb;
    private final long zzc;

    public zzb(AdvertisingIdClient advertisingIdClient, long j) {
        super("AdIdClientAutoDisconnectThread");
        this.zzb = new WeakReference(advertisingIdClient);
        this.zzc = j;
        start();
    }

    private final void zza() {
        AdvertisingIdClient advertisingIdClient = (AdvertisingIdClient) this.zzb.get();
        if (advertisingIdClient != null) {
            advertisingIdClient.zza();
        }
    }

    public final void run() {
        try {
            if (!this.zza.await(this.zzc, TimeUnit.MILLISECONDS)) {
                zza();
            }
        } catch (InterruptedException unused) {
            zza();
        }
    }
}
