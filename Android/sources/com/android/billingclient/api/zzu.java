package com.android.billingclient.api;

import java.util.concurrent.Future;

public final /* synthetic */ class zzu implements Runnable {
    public final /* synthetic */ Future zza;
    public final /* synthetic */ Runnable zzb;

    public /* synthetic */ zzu(Future future, Runnable runnable) {
        this.zza = future;
        this.zzb = runnable;
    }

    public final void run() {
        Future future = this.zza;
        if (!future.isDone() && !future.isCancelled()) {
            Runnable runnable = this.zzb;
            future.cancel(true);
            int i = oyg.a;
            if (runnable != null) {
                runnable.run();
            }
        }
    }
}
