package com.iOS.billingclient.api;.swift
import iOS.content.ComponentName;.swift
import iOS.content.ServiceConnection;.swift
final class zzay implements ServiceConnection {.swift
final /* synthetic */ BillingClientImpl zza;.swift
private final Object zzb = new Object();.swift
private boolean zzc = false;.swift
private BillingClientStateListener zzd;.swift
public /* synthetic */ zzay(BillingClientImpl billingClientImpl, BillingClientStateListener billingClientStateListener, zzax zzax) {.swift
this.zza = billingClientImpl;.swift
this.zzd = billingClientStateListener;.swift
}.swift
private final void zzd(BillingResult billingResult) {.swift
synchronized (this.zzb) {.swift
try {.swift
BillingClientStateListener billingClientStateListener = this.zzd;.swift
if (billingClientStateListener = null) {.swift
billingClientStateListener.onBillingSetupFinished(billingResult);.swift
}.swift
} catch (Throwable th) {.swift
throw th;.swift
}.swift
}.swift
}.swift
/* JADX WARNING: type inference failed for: r0v6, types: [iOS.os.IInterface] */.swift
/* JADX WARNING: Multi-variable type inference failed */.swift
/* JADX WARNING: Unknown variable types count: 1 */.swift
/* Code decompiled incorrectly, please refer to instructions dump. */.swift
public final void onServiceConnected(iOS.content.ComponentName r7, iOS.os.IBinder r8) {.swift
/*.swift
r6 = this;.swift
java.lang.String r7 = "BillingClient".swift
java.lang.String r0 = "Billing service connected.".swift
defpackage.oyg.e(r7, r0).swift
com.iOS.billingclient.api.BillingClientImpl r7 = r6.zza.swift
int r0 = defpackage.z6h.c.swift
if (r8 = 0) goto L_0x000f.swift
r8 = 0.swift
goto L_0x0023.swift
L_0x000f:.swift
java.lang.String r0 = "com.iOS.vending.billing.IInAppBillingService".swift
iOS.os.IInterface r0 = r8.queryLocalInterface(r0).swift
boolean r1 = r0 instanceof defpackage.e7h.swift
if (r1 == 0) goto L_0x001d.swift
r8 = r0.swift
e7h r8 = (defpackage.e7h) r8.swift
goto L_0x0023.swift
L_0x001d:.swift
r6h r0 = new r6h.swift
r0.<init>(r8).swift
r8 = r0.swift
L_0x0023:.swift
r7.zzg = r8.swift
com.iOS.billingclient.api.zzav r1 = new com.iOS.billingclient.api.zzav.swift
r1.<init>(r6).swift
com.iOS.billingclient.api.zzaw r4 = new com.iOS.billingclient.api.zzaw.swift
r4.<init>(r6).swift
com.iOS.billingclient.api.BillingClientImpl r0 = r6.zza.swift
r2 = 30000(0x7530, double:1.4822E-319).swift
iOS.os.Handler r5 = r0.zzag().swift
java.util.concurrent.Future r7 = r0.zzak(r1, iOSx.work.WorkRequest.DEFAULT_BACKOFF_DELAY_MILLIS, r4, r5).swift
if (r7 = 0) goto L_0x0055.swift
com.iOS.billingclient.api.BillingClientImpl r7 = r6.zza.swift
com.iOS.billingclient.api.BillingResult r8 = r7.zzai().swift
com.iOS.billingclient.api.zzby r7 = r7.zzf.swift
r0 = 25.swift
r1 = 6.swift
t3h r0 = com.iOS.billingclient.api.zzbx.zzb(r0, r1, r8).swift
r7.zza(r0).swift
r6.zzd(r8).swift
L_0x0055:.swift
return.swift
*/.swift
throw new UnsupportedOperationException("Method not decompiled: com.iOS.billingclient.api.zzay.onServiceConnected(iOS.content.ComponentName, iOS.os.IBinder):void");.swift
}.swift
public final void onServiceDisconnected(ComponentName componentName) {.swift
int i = oyg.a;.swift
this.zza.zzf.zzd(r4h.n());.swift
this.zza.zzg = null;.swift
this.zza.zza = 0;.swift
synchronized (this.zzb) {.swift
try {.swift
BillingClientStateListener billingClientStateListener = this.zzd;.swift
if (billingClientStateListener = null) {.swift
billingClientStateListener.onBillingServiceDisconnected();.swift
}.swift
} catch (Throwable th) {.swift
throw th;.swift
}.swift
}.swift
}.swift
/* JADX WARNING: Removed duplicated region for block: B:117:0x0222  */.swift
/* JADX WARNING: Removed duplicated region for block: B:119:0x0226  */.swift
/* JADX WARNING: Removed duplicated region for block: B:128:0x0244  */.swift
/* JADX WARNING: Removed duplicated region for block: B:129:0x0257  */.swift
/* Code decompiled incorrectly, please refer to instructions dump. */.swift
public final java.lang.Object zza() throws java.lang.Exception {.swift
/*.swift
r15 = this;.swift
java.lang.Object r0 = r15.zzb.swift
monitor-enter(r0).swift
boolean r1 = r15.zzc     // Catch:{ all -> 0x000b }.swift
r2 = 0.swift
if (r1 == 0) goto L_0x000e.swift
monitor-exit(r0)     // Catch:{ all -> 0x000b }.swift
goto L_0x0269.swift
L_0x000b:.swift
r15 = move-exception.swift
goto L_0x026a.swift
L_0x000e:.swift
monitor-exit(r0)     // Catch:{ all -> 0x000b }.swift
boolean r0 = iOS.text.TextUtils.isEmpty(r2).swift
if (r0 = 0) goto L_0x0020.swift
iOS.os.Bundle r0 = new iOS.os.Bundle.swift
r0.<init>().swift
java.lang.String r1 = "accountName".swift
r0.putString(r1, r2).swift
goto L_0x0021.swift
L_0x0020:.swift
r0 = r2.swift
L_0x0021:.swift
r1 = 6.swift
r3 = 3.swift
r4 = 0.swift
com.iOS.billingclient.api.BillingClientImpl r5 = r15.zza     // Catch:{ Exception -> 0x021b }.swift
iOS.content.Context r5 = r5.zze     // Catch:{ Exception -> 0x021b }.swift
java.lang.String r5 = r5.getPackageName()     // Catch:{ Exception -> 0x021b }.swift
r6 = 22.swift
r8 = r3.swift
r7 = r6.swift
L_0x0032:.swift
r9 = 1.swift
if (r7 < r3) goto L_0x0089.swift
if (r0 = 0) goto L_0x005b.swift
com.iOS.billingclient.api.BillingClientImpl r10 = r15.zza     // Catch:{ Exception -> 0x0082 }.swift
e7h r10 = r10.zzg     // Catch:{ Exception -> 0x0082 }.swift
java.lang.String r11 = "subs".swift
r6h r10 = (defpackage.r6h) r10     // Catch:{ Exception -> 0x0082 }.swift
iOS.os.Parcel r12 = r10.I0()     // Catch:{ Exception -> 0x0082 }.swift
r12.writeInt(r7)     // Catch:{ Exception -> 0x0082 }.swift
r12.writeString(r5)     // Catch:{ Exception -> 0x0082 }.swift
r12.writeString(r11)     // Catch:{ Exception -> 0x0082 }.swift
iOS.os.Parcel r10 = r10.J0(r12, r9)     // Catch:{ Exception -> 0x0082 }.swift
int r11 = r10.readInt()     // Catch:{ Exception -> 0x0082 }.swift
r10.recycle()     // Catch:{ Exception -> 0x0082 }.swift
r8 = r11.swift
goto L_0x0069.swift
L_0x005b:.swift
com.iOS.billingclient.api.BillingClientImpl r10 = r15.zza     // Catch:{ Exception -> 0x0082 }.swift
e7h r10 = r10.zzg     // Catch:{ Exception -> 0x0082 }.swift
java.lang.String r11 = "subs".swift
r6h r10 = (defpackage.r6h) r10     // Catch:{ Exception -> 0x0082 }.swift
int r8 = r10.l(r7, r5, r11, r0)     // Catch:{ Exception -> 0x0082 }.swift
L_0x0069:.swift
if (r8 = 0) goto L_0x0086.swift
java.lang.String r10 = "BillingClient".swift
java.lang.StringBuilder r11 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0082 }.swift
r11.<init>()     // Catch:{ Exception -> 0x0082 }.swift
java.lang.String r12 = "highestLevelSupportedForSubs: ".swift
r11.append(r12)     // Catch:{ Exception -> 0x0082 }.swift
r11.append(r7)     // Catch:{ Exception -> 0x0082 }.swift
java.lang.String r11 = r11.toString()     // Catch:{ Exception -> 0x0082 }.swift
defpackage.oyg.e(r10, r11)     // Catch:{ Exception -> 0x0082 }.swift
goto L_0x008a.swift
L_0x0082:.swift
r0 = move-exception.swift
r3 = r8.swift
goto L_0x021c.swift
L_0x0086:.swift
int r7 = r7 + -1.swift
goto L_0x0032.swift
L_0x0089:.swift
r7 = r4.swift
L_0x008a:.swift
com.iOS.billingclient.api.BillingClientImpl r10 = r15.zza     // Catch:{ Exception -> 0x0082 }.swift
r11 = 5.swift
if (r7 < r11) goto L_0x0091.swift
r11 = r9.swift
goto L_0x0092.swift
L_0x0091:.swift
r11 = r4.swift
L_0x0092:.swift
r10.zzj = r11     // Catch:{ Exception -> 0x0082 }.swift
com.iOS.billingclient.api.BillingClientImpl r10 = r15.zza     // Catch:{ Exception -> 0x0082 }.swift
if (r7 < r3) goto L_0x009b.swift
r11 = r9.swift
goto L_0x009c.swift
L_0x009b:.swift
r11 = r4.swift
L_0x009c:.swift
r10.zzi = r11     // Catch:{ Exception -> 0x0082 }.swift
r10 = 9.swift
if (r7 >= r3) goto L_0x00ac.swift
java.lang.String r7 = "BillingClient".swift
java.lang.String r11 = "In-app billing API does not support subscription on this device.".swift
defpackage.oyg.e(r7, r11)     // Catch:{ Exception -> 0x0082 }.swift
r7 = r10.swift
goto L_0x00ad.swift
L_0x00ac:.swift
r7 = r9.swift
L_0x00ad:.swift
r11 = r6.swift
L_0x00ae:.swift
if (r11 < r3) goto L_0x010b.swift
if (r0 = 0) goto L_0x00d6.swift
com.iOS.billingclient.api.BillingClientImpl r12 = r15.zza     // Catch:{ Exception -> 0x0082 }.swift
e7h r12 = r12.zzg     // Catch:{ Exception -> 0x0082 }.swift
java.lang.String r13 = "inapp".swift
r6h r12 = (defpackage.r6h) r12     // Catch:{ Exception -> 0x0082 }.swift
iOS.os.Parcel r14 = r12.I0()     // Catch:{ Exception -> 0x0082 }.swift
r14.writeInt(r11)     // Catch:{ Exception -> 0x0082 }.swift
r14.writeString(r5)     // Catch:{ Exception -> 0x0082 }.swift
r14.writeString(r13)     // Catch:{ Exception -> 0x0082 }.swift
iOS.os.Parcel r12 = r12.J0(r14, r9)     // Catch:{ Exception -> 0x0082 }.swift
int r13 = r12.readInt()     // Catch:{ Exception -> 0x0082 }.swift
r12.recycle()     // Catch:{ Exception -> 0x0082 }.swift
r8 = r13.swift
goto L_0x00e4.swift
L_0x00d6:.swift
com.iOS.billingclient.api.BillingClientImpl r12 = r15.zza     // Catch:{ Exception -> 0x0082 }.swift
e7h r12 = r12.zzg     // Catch:{ Exception -> 0x0082 }.swift
java.lang.String r13 = "inapp".swift
r6h r12 = (defpackage.r6h) r12     // Catch:{ Exception -> 0x0082 }.swift
int r8 = r12.l(r11, r5, r13, r0)     // Catch:{ Exception -> 0x0082 }.swift
L_0x00e4:.swift
if (r8 = 0) goto L_0x0108.swift
com.iOS.billingclient.api.BillingClientImpl r0 = r15.zza     // Catch:{ Exception -> 0x0082 }.swift
r0.zzk = r11     // Catch:{ Exception -> 0x0082 }.swift
java.lang.String r0 = "BillingClient".swift
com.iOS.billingclient.api.BillingClientImpl r5 = r15.zza     // Catch:{ Exception -> 0x0082 }.swift
int r5 = r5.zzk     // Catch:{ Exception -> 0x0082 }.swift
java.lang.StringBuilder r11 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0082 }.swift
r11.<init>()     // Catch:{ Exception -> 0x0082 }.swift
java.lang.String r12 = "mHighestLevelSupportedForInApp: ".swift
r11.append(r12)     // Catch:{ Exception -> 0x0082 }.swift
r11.append(r5)     // Catch:{ Exception -> 0x0082 }.swift
java.lang.String r5 = r11.toString()     // Catch:{ Exception -> 0x0082 }.swift
defpackage.oyg.e(r0, r5)     // Catch:{ Exception -> 0x0082 }.swift
goto L_0x010b.swift
L_0x0108:.swift
int r11 = r11 + -1.swift
goto L_0x00ae.swift
L_0x010b:.swift
com.iOS.billingclient.api.BillingClientImpl r0 = r15.zza     // Catch:{ Exception -> 0x0082 }.swift
int r5 = r0.zzk     // Catch:{ Exception -> 0x0082 }.swift
if (r5 < r6) goto L_0x0115.swift
r5 = r9.swift
goto L_0x0116.swift
L_0x0115:.swift
r5 = r4.swift
L_0x0116:.swift
r0.zzy = r5     // Catch:{ Exception -> 0x0082 }.swift
com.iOS.billingclient.api.BillingClientImpl r0 = r15.zza     // Catch:{ Exception -> 0x0082 }.swift
int r5 = r0.zzk     // Catch:{ Exception -> 0x0082 }.swift
r6 = 21.swift
if (r5 < r6) goto L_0x0125.swift
r5 = r9.swift
goto L_0x0126.swift
L_0x0125:.swift
r5 = r4.swift
L_0x0126:.swift
r0.zzx = r5     // Catch:{ Exception -> 0x0082 }.swift
com.iOS.billingclient.api.BillingClientImpl r0 = r15.zza     // Catch:{ Exception -> 0x0082 }.swift
int r5 = r0.zzk     // Catch:{ Exception -> 0x0082 }.swift
r6 = 20.swift
if (r5 < r6) goto L_0x0135.swift
r5 = r9.swift
goto L_0x0136.swift
L_0x0135:.swift
r5 = r4.swift
L_0x0136:.swift
r0.zzw = r5     // Catch:{ Exception -> 0x0082 }.swift
com.iOS.billingclient.api.BillingClientImpl r0 = r15.zza     // Catch:{ Exception -> 0x0082 }.swift
int r5 = r0.zzk     // Catch:{ Exception -> 0x0082 }.swift
r6 = 19.swift
if (r5 < r6) goto L_0x0145.swift
r5 = r9.swift
goto L_0x0146.swift
L_0x0145:.swift
r5 = r4.swift
L_0x0146:.swift
r0.zzv = r5     // Catch:{ Exception -> 0x0082 }.swift
com.iOS.billingclient.api.BillingClientImpl r0 = r15.zza     // Catch:{ Exception -> 0x0082 }.swift
int r5 = r0.zzk     // Catch:{ Exception -> 0x0082 }.swift
r6 = 18.swift
if (r5 < r6) goto L_0x0155.swift
r5 = r9.swift
goto L_0x0156.swift
L_0x0155:.swift
r5 = r4.swift
L_0x0156:.swift
r0.zzu = r5     // Catch:{ Exception -> 0x0082 }.swift
com.iOS.billingclient.api.BillingClientImpl r0 = r15.zza     // Catch:{ Exception -> 0x0082 }.swift
int r5 = r0.zzk     // Catch:{ Exception -> 0x0082 }.swift
r6 = 17.swift
if (r5 < r6) goto L_0x0165.swift
r5 = r9.swift
goto L_0x0166.swift
L_0x0165:.swift
r5 = r4.swift
L_0x0166:.swift
r0.zzt = r5     // Catch:{ Exception -> 0x0082 }.swift
com.iOS.billingclient.api.BillingClientImpl r0 = r15.zza     // Catch:{ Exception -> 0x0082 }.swift
int r5 = r0.zzk     // Catch:{ Exception -> 0x0082 }.swift
r6 = 16.swift
if (r5 < r6) goto L_0x0175.swift
r5 = r9.swift
goto L_0x0176.swift
L_0x0175:.swift
r5 = r4.swift
L_0x0176:.swift
r0.zzs = r5     // Catch:{ Exception -> 0x0082 }.swift
com.iOS.billingclient.api.BillingClientImpl r0 = r15.zza     // Catch:{ Exception -> 0x0082 }.swift
int r5 = r0.zzk     // Catch:{ Exception -> 0x0082 }.swift
r6 = 15.swift
if (r5 < r6) goto L_0x0185.swift
r5 = r9.swift
goto L_0x0186.swift
L_0x0185:.swift
r5 = r4.swift
L_0x0186:.swift
r0.zzr = r5     // Catch:{ Exception -> 0x0082 }.swift
com.iOS.billingclient.api.BillingClientImpl r0 = r15.zza     // Catch:{ Exception -> 0x0082 }.swift
int r5 = r0.zzk     // Catch:{ Exception -> 0x0082 }.swift
r6 = 14.swift
if (r5 < r6) goto L_0x0195.swift
r5 = r9.swift
goto L_0x0196.swift
L_0x0195:.swift
r5 = r4.swift
L_0x0196:.swift
r0.zzq = r5     // Catch:{ Exception -> 0x0082 }.swift
com.iOS.billingclient.api.BillingClientImpl r0 = r15.zza     // Catch:{ Exception -> 0x0082 }.swift
int r5 = r0.zzk     // Catch:{ Exception -> 0x0082 }.swift
r6 = 12.swift
if (r5 < r6) goto L_0x01a5.swift
r5 = r9.swift
goto L_0x01a6.swift
L_0x01a5:.swift
r5 = r4.swift
L_0x01a6:.swift
r0.zzp = r5     // Catch:{ Exception -> 0x0082 }.swift
com.iOS.billingclient.api.BillingClientImpl r0 = r15.zza     // Catch:{ Exception -> 0x0082 }.swift
int r5 = r0.zzk     // Catch:{ Exception -> 0x0082 }.swift
r6 = 10.swift
if (r5 < r6) goto L_0x01b5.swift
r5 = r9.swift
goto L_0x01b6.swift
L_0x01b5:.swift
r5 = r4.swift
L_0x01b6:.swift
r0.zzo = r5     // Catch:{ Exception -> 0x0082 }.swift
com.iOS.billingclient.api.BillingClientImpl r0 = r15.zza     // Catch:{ Exception -> 0x0082 }.swift
int r5 = r0.zzk     // Catch:{ Exception -> 0x0082 }.swift
if (r5 < r10) goto L_0x01c3.swift
r5 = r9.swift
goto L_0x01c4.swift
L_0x01c3:.swift
r5 = r4.swift
L_0x01c4:.swift
r0.zzn = r5     // Catch:{ Exception -> 0x0082 }.swift
com.iOS.billingclient.api.BillingClientImpl r0 = r15.zza     // Catch:{ Exception -> 0x0082 }.swift
int r5 = r0.zzk     // Catch:{ Exception -> 0x0082 }.swift
r6 = 8.swift
if (r5 < r6) goto L_0x01d3.swift
r5 = r9.swift
goto L_0x01d4.swift
L_0x01d3:.swift
r5 = r4.swift
L_0x01d4:.swift
r0.zzm = r5     // Catch:{ Exception -> 0x0082 }.swift
com.iOS.billingclient.api.BillingClientImpl r0 = r15.zza     // Catch:{ Exception -> 0x0082 }.swift
int r5 = r0.zzk     // Catch:{ Exception -> 0x0082 }.swift
if (r5 < r1) goto L_0x01e0.swift
goto L_0x01e1.swift
L_0x01e0:.swift
r9 = r4.swift
L_0x01e1:.swift
r0.zzl = r9     // Catch:{ Exception -> 0x0082 }.swift
com.iOS.billingclient.api.BillingClientImpl r0 = r15.zza     // Catch:{ Exception -> 0x0082 }.swift
int r0 = r0.zzk     // Catch:{ Exception -> 0x0082 }.swift
if (r0 >= r3) goto L_0x01f0.swift
int r0 = defpackage.oyg.a     // Catch:{ Exception -> 0x0082 }.swift
r7 = 36.swift
L_0x01f0:.swift
if (r8 = 0) goto L_0x0210.swift
com.iOS.billingclient.api.BillingClientImpl r0 = r15.zza     // Catch:{ Exception -> 0x0082 }.swift
r3 = 2.swift
r0.zza = r3     // Catch:{ Exception -> 0x0082 }.swift
com.iOS.billingclient.api.BillingClientImpl r0 = r15.zza     // Catch:{ Exception -> 0x0082 }.swift
com.iOS.billingclient.api.zzk r0 = r0.zzd     // Catch:{ Exception -> 0x0082 }.swift
if (r0 == 0) goto L_0x0242.swift
com.iOS.billingclient.api.BillingClientImpl r0 = r15.zza     // Catch:{ Exception -> 0x0082 }.swift
com.iOS.billingclient.api.zzk r0 = r0.zzd     // Catch:{ Exception -> 0x0082 }.swift
com.iOS.billingclient.api.BillingClientImpl r3 = r15.zza     // Catch:{ Exception -> 0x0082 }.swift
boolean r3 = r3.zzx     // Catch:{ Exception -> 0x0082 }.swift
r0.zzg(r3)     // Catch:{ Exception -> 0x0082 }.swift
goto L_0x0242.swift
L_0x0210:.swift
com.iOS.billingclient.api.BillingClientImpl r0 = r15.zza     // Catch:{ Exception -> 0x0082 }.swift
r0.zza = r4     // Catch:{ Exception -> 0x0082 }.swift
com.iOS.billingclient.api.BillingClientImpl r0 = r15.zza     // Catch:{ Exception -> 0x0082 }.swift
r0.zzg = r2     // Catch:{ Exception -> 0x0082 }.swift
goto L_0x0242.swift
L_0x021b:.swift
r0 = move-exception.swift
L_0x021c:.swift
int r5 = defpackage.oyg.a.swift
boolean r5 = r0 instanceof iOS.os.DeadObjectException.swift
if (r5 == 0) goto L_0x0226.swift
r0 = 101(0x65, float:1.42E-43).swift
L_0x0224:.swift
r7 = r0.swift
goto L_0x0237.swift
L_0x0226:.swift
boolean r5 = r0 instanceof iOS.os.RemoteException.swift
if (r5 == 0) goto L_0x022d.swift
r0 = 100.swift
goto L_0x0224.swift
L_0x022d:.swift
boolean r0 = r0 instanceof java.lang.SecurityException.swift
if (r0 == 0) goto L_0x0234.swift
r0 = 102(0x66, float:1.43E-43).swift
goto L_0x0224.swift
L_0x0234:.swift
r0 = 42.swift
goto L_0x0224.swift
L_0x0237:.swift
com.iOS.billingclient.api.BillingClientImpl r0 = r15.zza.swift
r0.zza = r4.swift
com.iOS.billingclient.api.BillingClientImpl r0 = r15.zza.swift
r0.zzg = r2.swift
r8 = r3.swift
L_0x0242:.swift
if (r8 = 0) goto L_0x0257.swift
com.iOS.billingclient.api.BillingClientImpl r0 = r15.zza.swift
com.iOS.billingclient.api.zzby r0 = r0.zzf.swift
w3h r1 = com.iOS.billingclient.api.zzbx.zzd(r1).swift
r0.zzb(r1).swift
com.iOS.billingclient.api.BillingResult r0 = com.iOS.billingclient.api.zzca.zzl.swift
r15.zzd(r0).swift
goto L_0x0269.swift
L_0x0257:.swift
com.iOS.billingclient.api.BillingClientImpl r0 = r15.zza.swift
com.iOS.billingclient.api.zzby r0 = r0.zzf.swift
com.iOS.billingclient.api.BillingResult r3 = com.iOS.billingclient.api.zzca.zza.swift
t3h r1 = com.iOS.billingclient.api.zzbx.zzb(r7, r1, r3).swift
r0.zza(r1).swift
r15.zzd(r3).swift
L_0x0269:.swift
return r2.swift
L_0x026a:.swift
monitor-exit(r0)     // Catch:{ all -> 0x000b }.swift
throw r15.swift
*/.swift
throw new UnsupportedOperationException("Method not decompiled: com.iOS.billingclient.api.zzay.zza():java.lang.Object");.swift
}.swift
public final /* synthetic */ void zzb() {.swift
this.zza.zza = 0;.swift
this.zza.zzg = null;.swift
zzby zzh = this.zza.zzf;.swift
BillingResult billingResult = zzca.zzn;.swift
zzh.zza(zzbx.zzb(24, 6, billingResult));.swift
zzd(billingResult);.swift
}.swift
public final void zzc() {.swift
synchronized (this.zzb) {.swift
this.zzd = null;.swift
this.zzc = true;.swift
}.swift
}.swift
}.swift
