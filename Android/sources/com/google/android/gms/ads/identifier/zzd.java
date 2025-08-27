package com.google.android.gms.ads.identifier;

import android.content.Context;
import com.google.android.gms.common.api.ApiException;
import java.time.Duration;
import java.util.concurrent.atomic.AtomicLong;

public final class zzd {
    private static volatile zzd zza;
    private static final Object zzb = new Object();
    private static final Duration zzc = Duration.ofMinutes(30);
    private final nef zzd;
    private final AtomicLong zze = new AtomicLong(-1);

    /* JADX WARNING: type inference failed for: r0v2, types: [ct6, nef] */
    private zzd(Context context, String str) {
        this.zzd = new ct6(context, swg.Y, (pl) new oef("ads_identifier:api"), bt6.c);
    }

    public static zzd zza(Context context) {
        if (zza == null) {
            synchronized (zzb) {
                try {
                    if (zza == null) {
                        zza = new zzd(context, "ads_identifier:api");
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return zza;
    }

    public static void zzb(zzd zzd2, long j, Exception exc) {
        bi3 bi3;
        "getting error as ".concat(String.valueOf(exc.getMessage()));
        if ((exc instanceof ApiException) && (bi3 = ((ApiException) exc).a.o) != null && bi3.b == 24) {
            zzd2.zze.set(j);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x006c, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0029, code lost:
        if ((r2 - r1.zze.get()) > zzc.toMillis()) goto L_0x002b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void zzc(int r19, int r20, long r21, long r23, int r25) {
        /*
            r18 = this;
            r1 = r18
            monitor-enter(r18)
            java.util.concurrent.atomic.AtomicLong r0 = r1.zze     // Catch:{ all -> 0x0069 }
            long r2 = android.os.SystemClock.elapsedRealtime()     // Catch:{ all -> 0x0069 }
            r0.get()     // Catch:{ all -> 0x0069 }
            java.util.concurrent.atomic.AtomicLong r0 = r1.zze     // Catch:{ all -> 0x0069 }
            long r4 = r0.get()     // Catch:{ all -> 0x0069 }
            r6 = -1
            int r0 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r0 != 0) goto L_0x0019
            goto L_0x002b
        L_0x0019:
            java.util.concurrent.atomic.AtomicLong r0 = r1.zze     // Catch:{ all -> 0x0069 }
            long r4 = r0.get()     // Catch:{ all -> 0x0069 }
            long r4 = r2 - r4
            java.time.Duration r0 = zzc     // Catch:{ all -> 0x0069 }
            long r6 = r0.toMillis()     // Catch:{ all -> 0x0069 }
            int r0 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r0 <= 0) goto L_0x006b
        L_0x002b:
            nef r0 = r1.zzd     // Catch:{ all -> 0x0069 }
            if (r0 != 0) goto L_0x0030
            goto L_0x006b
        L_0x0030:
            mef r4 = new mef     // Catch:{ all -> 0x0069 }
            lq9 r17 = new lq9     // Catch:{ all -> 0x0069 }
            r8 = 0
            r13 = 0
            r14 = 0
            r15 = 0
            r6 = 35401(0x8a49, float:4.9607E-41)
            r5 = r17
            r7 = r20
            r9 = r21
            r11 = r23
            r16 = r25
            r5.<init>(r6, r7, r8, r9, r11, r13, r14, r15, r16)     // Catch:{ all -> 0x0069 }
            lq9[] r5 = new defpackage.lq9[]{r17}     // Catch:{ all -> 0x0069 }
            java.util.List r5 = java.util.Arrays.asList(r5)     // Catch:{ all -> 0x0069 }
            r6 = 0
            r4.<init>(r6, r5)     // Catch:{ all -> 0x0069 }
            swg r0 = (defpackage.swg) r0     // Catch:{ all -> 0x0069 }
            s7h r0 = r0.d(r4)     // Catch:{ all -> 0x0069 }
            com.google.android.gms.ads.identifier.zzc r4 = new com.google.android.gms.ads.identifier.zzc     // Catch:{ all -> 0x0069 }
            r4.<init>(r1, r2)     // Catch:{ all -> 0x0069 }
            r0.getClass()     // Catch:{ all -> 0x0069 }
            k40 r2 = defpackage.xdf.a     // Catch:{ all -> 0x0069 }
            r0.c(r2, r4)     // Catch:{ all -> 0x0069 }
            monitor-exit(r18)
            return
        L_0x0069:
            r0 = move-exception
            goto L_0x006d
        L_0x006b:
            monitor-exit(r18)
            return
        L_0x006d:
            monitor-exit(r18)     // Catch:{ all -> 0x0069 }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.ads.identifier.zzd.zzc(int, int, long, long, int):void");
    }
}
