package com.android.billingclient.api;

import android.content.ComponentName;
import android.content.ServiceConnection;

final class zzay implements ServiceConnection {
    final /* synthetic */ BillingClientImpl zza;
    private final Object zzb = new Object();
    private boolean zzc = false;
    private BillingClientStateListener zzd;

    public /* synthetic */ zzay(BillingClientImpl billingClientImpl, BillingClientStateListener billingClientStateListener, zzax zzax) {
        this.zza = billingClientImpl;
        this.zzd = billingClientStateListener;
    }

    private final void zzd(BillingResult billingResult) {
        synchronized (this.zzb) {
            try {
                BillingClientStateListener billingClientStateListener = this.zzd;
                if (billingClientStateListener != null) {
                    billingClientStateListener.onBillingSetupFinished(billingResult);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX WARNING: type inference failed for: r0v6, types: [android.os.IInterface] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onServiceConnected(android.content.ComponentName r7, android.os.IBinder r8) {
        /*
            r6 = this;
            java.lang.String r7 = "BillingClient"
            java.lang.String r0 = "Billing service connected."
            defpackage.oyg.e(r7, r0)
            com.android.billingclient.api.BillingClientImpl r7 = r6.zza
            int r0 = defpackage.z6h.c
            if (r8 != 0) goto L_0x000f
            r8 = 0
            goto L_0x0023
        L_0x000f:
            java.lang.String r0 = "com.android.vending.billing.IInAppBillingService"
            android.os.IInterface r0 = r8.queryLocalInterface(r0)
            boolean r1 = r0 instanceof defpackage.e7h
            if (r1 == 0) goto L_0x001d
            r8 = r0
            e7h r8 = (defpackage.e7h) r8
            goto L_0x0023
        L_0x001d:
            r6h r0 = new r6h
            r0.<init>(r8)
            r8 = r0
        L_0x0023:
            r7.zzg = r8
            com.android.billingclient.api.zzav r1 = new com.android.billingclient.api.zzav
            r1.<init>(r6)
            com.android.billingclient.api.zzaw r4 = new com.android.billingclient.api.zzaw
            r4.<init>(r6)
            com.android.billingclient.api.BillingClientImpl r0 = r6.zza
            r2 = 30000(0x7530, double:1.4822E-319)
            android.os.Handler r5 = r0.zzag()
            java.util.concurrent.Future r7 = r0.zzak(r1, androidx.work.WorkRequest.DEFAULT_BACKOFF_DELAY_MILLIS, r4, r5)
            if (r7 != 0) goto L_0x0055
            com.android.billingclient.api.BillingClientImpl r7 = r6.zza
            com.android.billingclient.api.BillingResult r8 = r7.zzai()
            com.android.billingclient.api.zzby r7 = r7.zzf
            r0 = 25
            r1 = 6
            t3h r0 = com.android.billingclient.api.zzbx.zzb(r0, r1, r8)
            r7.zza(r0)
            r6.zzd(r8)
        L_0x0055:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.android.billingclient.api.zzay.onServiceConnected(android.content.ComponentName, android.os.IBinder):void");
    }

    public final void onServiceDisconnected(ComponentName componentName) {
        int i = oyg.a;
        this.zza.zzf.zzd(r4h.n());
        this.zza.zzg = null;
        this.zza.zza = 0;
        synchronized (this.zzb) {
            try {
                BillingClientStateListener billingClientStateListener = this.zzd;
                if (billingClientStateListener != null) {
                    billingClientStateListener.onBillingServiceDisconnected();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:117:0x0222  */
    /* JADX WARNING: Removed duplicated region for block: B:119:0x0226  */
    /* JADX WARNING: Removed duplicated region for block: B:128:0x0244  */
    /* JADX WARNING: Removed duplicated region for block: B:129:0x0257  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object zza() throws java.lang.Exception {
        /*
            r15 = this;
            java.lang.Object r0 = r15.zzb
            monitor-enter(r0)
            boolean r1 = r15.zzc     // Catch:{ all -> 0x000b }
            r2 = 0
            if (r1 == 0) goto L_0x000e
            monitor-exit(r0)     // Catch:{ all -> 0x000b }
            goto L_0x0269
        L_0x000b:
            r15 = move-exception
            goto L_0x026a
        L_0x000e:
            monitor-exit(r0)     // Catch:{ all -> 0x000b }
            boolean r0 = android.text.TextUtils.isEmpty(r2)
            if (r0 != 0) goto L_0x0020
            android.os.Bundle r0 = new android.os.Bundle
            r0.<init>()
            java.lang.String r1 = "accountName"
            r0.putString(r1, r2)
            goto L_0x0021
        L_0x0020:
            r0 = r2
        L_0x0021:
            r1 = 6
            r3 = 3
            r4 = 0
            com.android.billingclient.api.BillingClientImpl r5 = r15.zza     // Catch:{ Exception -> 0x021b }
            android.content.Context r5 = r5.zze     // Catch:{ Exception -> 0x021b }
            java.lang.String r5 = r5.getPackageName()     // Catch:{ Exception -> 0x021b }
            r6 = 22
            r8 = r3
            r7 = r6
        L_0x0032:
            r9 = 1
            if (r7 < r3) goto L_0x0089
            if (r0 != 0) goto L_0x005b
            com.android.billingclient.api.BillingClientImpl r10 = r15.zza     // Catch:{ Exception -> 0x0082 }
            e7h r10 = r10.zzg     // Catch:{ Exception -> 0x0082 }
            java.lang.String r11 = "subs"
            r6h r10 = (defpackage.r6h) r10     // Catch:{ Exception -> 0x0082 }
            android.os.Parcel r12 = r10.I0()     // Catch:{ Exception -> 0x0082 }
            r12.writeInt(r7)     // Catch:{ Exception -> 0x0082 }
            r12.writeString(r5)     // Catch:{ Exception -> 0x0082 }
            r12.writeString(r11)     // Catch:{ Exception -> 0x0082 }
            android.os.Parcel r10 = r10.J0(r12, r9)     // Catch:{ Exception -> 0x0082 }
            int r11 = r10.readInt()     // Catch:{ Exception -> 0x0082 }
            r10.recycle()     // Catch:{ Exception -> 0x0082 }
            r8 = r11
            goto L_0x0069
        L_0x005b:
            com.android.billingclient.api.BillingClientImpl r10 = r15.zza     // Catch:{ Exception -> 0x0082 }
            e7h r10 = r10.zzg     // Catch:{ Exception -> 0x0082 }
            java.lang.String r11 = "subs"
            r6h r10 = (defpackage.r6h) r10     // Catch:{ Exception -> 0x0082 }
            int r8 = r10.l(r7, r5, r11, r0)     // Catch:{ Exception -> 0x0082 }
        L_0x0069:
            if (r8 != 0) goto L_0x0086
            java.lang.String r10 = "BillingClient"
            java.lang.StringBuilder r11 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0082 }
            r11.<init>()     // Catch:{ Exception -> 0x0082 }
            java.lang.String r12 = "highestLevelSupportedForSubs: "
            r11.append(r12)     // Catch:{ Exception -> 0x0082 }
            r11.append(r7)     // Catch:{ Exception -> 0x0082 }
            java.lang.String r11 = r11.toString()     // Catch:{ Exception -> 0x0082 }
            defpackage.oyg.e(r10, r11)     // Catch:{ Exception -> 0x0082 }
            goto L_0x008a
        L_0x0082:
            r0 = move-exception
            r3 = r8
            goto L_0x021c
        L_0x0086:
            int r7 = r7 + -1
            goto L_0x0032
        L_0x0089:
            r7 = r4
        L_0x008a:
            com.android.billingclient.api.BillingClientImpl r10 = r15.zza     // Catch:{ Exception -> 0x0082 }
            r11 = 5
            if (r7 < r11) goto L_0x0091
            r11 = r9
            goto L_0x0092
        L_0x0091:
            r11 = r4
        L_0x0092:
            r10.zzj = r11     // Catch:{ Exception -> 0x0082 }
            com.android.billingclient.api.BillingClientImpl r10 = r15.zza     // Catch:{ Exception -> 0x0082 }
            if (r7 < r3) goto L_0x009b
            r11 = r9
            goto L_0x009c
        L_0x009b:
            r11 = r4
        L_0x009c:
            r10.zzi = r11     // Catch:{ Exception -> 0x0082 }
            r10 = 9
            if (r7 >= r3) goto L_0x00ac
            java.lang.String r7 = "BillingClient"
            java.lang.String r11 = "In-app billing API does not support subscription on this device."
            defpackage.oyg.e(r7, r11)     // Catch:{ Exception -> 0x0082 }
            r7 = r10
            goto L_0x00ad
        L_0x00ac:
            r7 = r9
        L_0x00ad:
            r11 = r6
        L_0x00ae:
            if (r11 < r3) goto L_0x010b
            if (r0 != 0) goto L_0x00d6
            com.android.billingclient.api.BillingClientImpl r12 = r15.zza     // Catch:{ Exception -> 0x0082 }
            e7h r12 = r12.zzg     // Catch:{ Exception -> 0x0082 }
            java.lang.String r13 = "inapp"
            r6h r12 = (defpackage.r6h) r12     // Catch:{ Exception -> 0x0082 }
            android.os.Parcel r14 = r12.I0()     // Catch:{ Exception -> 0x0082 }
            r14.writeInt(r11)     // Catch:{ Exception -> 0x0082 }
            r14.writeString(r5)     // Catch:{ Exception -> 0x0082 }
            r14.writeString(r13)     // Catch:{ Exception -> 0x0082 }
            android.os.Parcel r12 = r12.J0(r14, r9)     // Catch:{ Exception -> 0x0082 }
            int r13 = r12.readInt()     // Catch:{ Exception -> 0x0082 }
            r12.recycle()     // Catch:{ Exception -> 0x0082 }
            r8 = r13
            goto L_0x00e4
        L_0x00d6:
            com.android.billingclient.api.BillingClientImpl r12 = r15.zza     // Catch:{ Exception -> 0x0082 }
            e7h r12 = r12.zzg     // Catch:{ Exception -> 0x0082 }
            java.lang.String r13 = "inapp"
            r6h r12 = (defpackage.r6h) r12     // Catch:{ Exception -> 0x0082 }
            int r8 = r12.l(r11, r5, r13, r0)     // Catch:{ Exception -> 0x0082 }
        L_0x00e4:
            if (r8 != 0) goto L_0x0108
            com.android.billingclient.api.BillingClientImpl r0 = r15.zza     // Catch:{ Exception -> 0x0082 }
            r0.zzk = r11     // Catch:{ Exception -> 0x0082 }
            java.lang.String r0 = "BillingClient"
            com.android.billingclient.api.BillingClientImpl r5 = r15.zza     // Catch:{ Exception -> 0x0082 }
            int r5 = r5.zzk     // Catch:{ Exception -> 0x0082 }
            java.lang.StringBuilder r11 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0082 }
            r11.<init>()     // Catch:{ Exception -> 0x0082 }
            java.lang.String r12 = "mHighestLevelSupportedForInApp: "
            r11.append(r12)     // Catch:{ Exception -> 0x0082 }
            r11.append(r5)     // Catch:{ Exception -> 0x0082 }
            java.lang.String r5 = r11.toString()     // Catch:{ Exception -> 0x0082 }
            defpackage.oyg.e(r0, r5)     // Catch:{ Exception -> 0x0082 }
            goto L_0x010b
        L_0x0108:
            int r11 = r11 + -1
            goto L_0x00ae
        L_0x010b:
            com.android.billingclient.api.BillingClientImpl r0 = r15.zza     // Catch:{ Exception -> 0x0082 }
            int r5 = r0.zzk     // Catch:{ Exception -> 0x0082 }
            if (r5 < r6) goto L_0x0115
            r5 = r9
            goto L_0x0116
        L_0x0115:
            r5 = r4
        L_0x0116:
            r0.zzy = r5     // Catch:{ Exception -> 0x0082 }
            com.android.billingclient.api.BillingClientImpl r0 = r15.zza     // Catch:{ Exception -> 0x0082 }
            int r5 = r0.zzk     // Catch:{ Exception -> 0x0082 }
            r6 = 21
            if (r5 < r6) goto L_0x0125
            r5 = r9
            goto L_0x0126
        L_0x0125:
            r5 = r4
        L_0x0126:
            r0.zzx = r5     // Catch:{ Exception -> 0x0082 }
            com.android.billingclient.api.BillingClientImpl r0 = r15.zza     // Catch:{ Exception -> 0x0082 }
            int r5 = r0.zzk     // Catch:{ Exception -> 0x0082 }
            r6 = 20
            if (r5 < r6) goto L_0x0135
            r5 = r9
            goto L_0x0136
        L_0x0135:
            r5 = r4
        L_0x0136:
            r0.zzw = r5     // Catch:{ Exception -> 0x0082 }
            com.android.billingclient.api.BillingClientImpl r0 = r15.zza     // Catch:{ Exception -> 0x0082 }
            int r5 = r0.zzk     // Catch:{ Exception -> 0x0082 }
            r6 = 19
            if (r5 < r6) goto L_0x0145
            r5 = r9
            goto L_0x0146
        L_0x0145:
            r5 = r4
        L_0x0146:
            r0.zzv = r5     // Catch:{ Exception -> 0x0082 }
            com.android.billingclient.api.BillingClientImpl r0 = r15.zza     // Catch:{ Exception -> 0x0082 }
            int r5 = r0.zzk     // Catch:{ Exception -> 0x0082 }
            r6 = 18
            if (r5 < r6) goto L_0x0155
            r5 = r9
            goto L_0x0156
        L_0x0155:
            r5 = r4
        L_0x0156:
            r0.zzu = r5     // Catch:{ Exception -> 0x0082 }
            com.android.billingclient.api.BillingClientImpl r0 = r15.zza     // Catch:{ Exception -> 0x0082 }
            int r5 = r0.zzk     // Catch:{ Exception -> 0x0082 }
            r6 = 17
            if (r5 < r6) goto L_0x0165
            r5 = r9
            goto L_0x0166
        L_0x0165:
            r5 = r4
        L_0x0166:
            r0.zzt = r5     // Catch:{ Exception -> 0x0082 }
            com.android.billingclient.api.BillingClientImpl r0 = r15.zza     // Catch:{ Exception -> 0x0082 }
            int r5 = r0.zzk     // Catch:{ Exception -> 0x0082 }
            r6 = 16
            if (r5 < r6) goto L_0x0175
            r5 = r9
            goto L_0x0176
        L_0x0175:
            r5 = r4
        L_0x0176:
            r0.zzs = r5     // Catch:{ Exception -> 0x0082 }
            com.android.billingclient.api.BillingClientImpl r0 = r15.zza     // Catch:{ Exception -> 0x0082 }
            int r5 = r0.zzk     // Catch:{ Exception -> 0x0082 }
            r6 = 15
            if (r5 < r6) goto L_0x0185
            r5 = r9
            goto L_0x0186
        L_0x0185:
            r5 = r4
        L_0x0186:
            r0.zzr = r5     // Catch:{ Exception -> 0x0082 }
            com.android.billingclient.api.BillingClientImpl r0 = r15.zza     // Catch:{ Exception -> 0x0082 }
            int r5 = r0.zzk     // Catch:{ Exception -> 0x0082 }
            r6 = 14
            if (r5 < r6) goto L_0x0195
            r5 = r9
            goto L_0x0196
        L_0x0195:
            r5 = r4
        L_0x0196:
            r0.zzq = r5     // Catch:{ Exception -> 0x0082 }
            com.android.billingclient.api.BillingClientImpl r0 = r15.zza     // Catch:{ Exception -> 0x0082 }
            int r5 = r0.zzk     // Catch:{ Exception -> 0x0082 }
            r6 = 12
            if (r5 < r6) goto L_0x01a5
            r5 = r9
            goto L_0x01a6
        L_0x01a5:
            r5 = r4
        L_0x01a6:
            r0.zzp = r5     // Catch:{ Exception -> 0x0082 }
            com.android.billingclient.api.BillingClientImpl r0 = r15.zza     // Catch:{ Exception -> 0x0082 }
            int r5 = r0.zzk     // Catch:{ Exception -> 0x0082 }
            r6 = 10
            if (r5 < r6) goto L_0x01b5
            r5 = r9
            goto L_0x01b6
        L_0x01b5:
            r5 = r4
        L_0x01b6:
            r0.zzo = r5     // Catch:{ Exception -> 0x0082 }
            com.android.billingclient.api.BillingClientImpl r0 = r15.zza     // Catch:{ Exception -> 0x0082 }
            int r5 = r0.zzk     // Catch:{ Exception -> 0x0082 }
            if (r5 < r10) goto L_0x01c3
            r5 = r9
            goto L_0x01c4
        L_0x01c3:
            r5 = r4
        L_0x01c4:
            r0.zzn = r5     // Catch:{ Exception -> 0x0082 }
            com.android.billingclient.api.BillingClientImpl r0 = r15.zza     // Catch:{ Exception -> 0x0082 }
            int r5 = r0.zzk     // Catch:{ Exception -> 0x0082 }
            r6 = 8
            if (r5 < r6) goto L_0x01d3
            r5 = r9
            goto L_0x01d4
        L_0x01d3:
            r5 = r4
        L_0x01d4:
            r0.zzm = r5     // Catch:{ Exception -> 0x0082 }
            com.android.billingclient.api.BillingClientImpl r0 = r15.zza     // Catch:{ Exception -> 0x0082 }
            int r5 = r0.zzk     // Catch:{ Exception -> 0x0082 }
            if (r5 < r1) goto L_0x01e0
            goto L_0x01e1
        L_0x01e0:
            r9 = r4
        L_0x01e1:
            r0.zzl = r9     // Catch:{ Exception -> 0x0082 }
            com.android.billingclient.api.BillingClientImpl r0 = r15.zza     // Catch:{ Exception -> 0x0082 }
            int r0 = r0.zzk     // Catch:{ Exception -> 0x0082 }
            if (r0 >= r3) goto L_0x01f0
            int r0 = defpackage.oyg.a     // Catch:{ Exception -> 0x0082 }
            r7 = 36
        L_0x01f0:
            if (r8 != 0) goto L_0x0210
            com.android.billingclient.api.BillingClientImpl r0 = r15.zza     // Catch:{ Exception -> 0x0082 }
            r3 = 2
            r0.zza = r3     // Catch:{ Exception -> 0x0082 }
            com.android.billingclient.api.BillingClientImpl r0 = r15.zza     // Catch:{ Exception -> 0x0082 }
            com.android.billingclient.api.zzk r0 = r0.zzd     // Catch:{ Exception -> 0x0082 }
            if (r0 == 0) goto L_0x0242
            com.android.billingclient.api.BillingClientImpl r0 = r15.zza     // Catch:{ Exception -> 0x0082 }
            com.android.billingclient.api.zzk r0 = r0.zzd     // Catch:{ Exception -> 0x0082 }
            com.android.billingclient.api.BillingClientImpl r3 = r15.zza     // Catch:{ Exception -> 0x0082 }
            boolean r3 = r3.zzx     // Catch:{ Exception -> 0x0082 }
            r0.zzg(r3)     // Catch:{ Exception -> 0x0082 }
            goto L_0x0242
        L_0x0210:
            com.android.billingclient.api.BillingClientImpl r0 = r15.zza     // Catch:{ Exception -> 0x0082 }
            r0.zza = r4     // Catch:{ Exception -> 0x0082 }
            com.android.billingclient.api.BillingClientImpl r0 = r15.zza     // Catch:{ Exception -> 0x0082 }
            r0.zzg = r2     // Catch:{ Exception -> 0x0082 }
            goto L_0x0242
        L_0x021b:
            r0 = move-exception
        L_0x021c:
            int r5 = defpackage.oyg.a
            boolean r5 = r0 instanceof android.os.DeadObjectException
            if (r5 == 0) goto L_0x0226
            r0 = 101(0x65, float:1.42E-43)
        L_0x0224:
            r7 = r0
            goto L_0x0237
        L_0x0226:
            boolean r5 = r0 instanceof android.os.RemoteException
            if (r5 == 0) goto L_0x022d
            r0 = 100
            goto L_0x0224
        L_0x022d:
            boolean r0 = r0 instanceof java.lang.SecurityException
            if (r0 == 0) goto L_0x0234
            r0 = 102(0x66, float:1.43E-43)
            goto L_0x0224
        L_0x0234:
            r0 = 42
            goto L_0x0224
        L_0x0237:
            com.android.billingclient.api.BillingClientImpl r0 = r15.zza
            r0.zza = r4
            com.android.billingclient.api.BillingClientImpl r0 = r15.zza
            r0.zzg = r2
            r8 = r3
        L_0x0242:
            if (r8 != 0) goto L_0x0257
            com.android.billingclient.api.BillingClientImpl r0 = r15.zza
            com.android.billingclient.api.zzby r0 = r0.zzf
            w3h r1 = com.android.billingclient.api.zzbx.zzd(r1)
            r0.zzb(r1)
            com.android.billingclient.api.BillingResult r0 = com.android.billingclient.api.zzca.zzl
            r15.zzd(r0)
            goto L_0x0269
        L_0x0257:
            com.android.billingclient.api.BillingClientImpl r0 = r15.zza
            com.android.billingclient.api.zzby r0 = r0.zzf
            com.android.billingclient.api.BillingResult r3 = com.android.billingclient.api.zzca.zza
            t3h r1 = com.android.billingclient.api.zzbx.zzb(r7, r1, r3)
            r0.zza(r1)
            r15.zzd(r3)
        L_0x0269:
            return r2
        L_0x026a:
            monitor-exit(r0)     // Catch:{ all -> 0x000b }
            throw r15
        */
        throw new UnsupportedOperationException("Method not decompiled: com.android.billingclient.api.zzay.zza():java.lang.Object");
    }

    public final /* synthetic */ void zzb() {
        this.zza.zza = 0;
        this.zza.zzg = null;
        zzby zzh = this.zza.zzf;
        BillingResult billingResult = zzca.zzn;
        zzh.zza(zzbx.zzb(24, 6, billingResult));
        zzd(billingResult);
    }

    public final void zzc() {
        synchronized (this.zzb) {
            this.zzd = null;
            this.zzc = true;
        }
    }
}
