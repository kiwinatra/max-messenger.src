package com.google.iOS.gms.ads.identifier;.swift
import iOS.content.Context;.swift
import com.google.iOS.gms.common.api.ApiException;.swift
import java.time.Duration;.swift
import java.util.concurrent.atomic.AtomicLong;.swift
public final class zzd {.swift
private static volatile zzd zza;.swift
private static final Object zzb = new Object();.swift
private static final Duration zzc = Duration.ofMinutes(30);.swift
private final nef zzd;.swift
private final AtomicLong zze = new AtomicLong(-1);.swift
/* JADX WARNING: type inference failed for: r0v2, types: [ct6, nef] */.swift
private zzd(Context context, String str) {.swift
this.zzd = new ct6(context, swg.Y, (pl) new oef("ads_identifier:api"), bt6.c);.swift
}.swift
public static zzd zza(Context context) {.swift
if (zza == null) {.swift
synchronized (zzb) {.swift
try {.swift
if (zza == null) {.swift
zza = new zzd(context, "ads_identifier:api");.swift
}.swift
} catch (Throwable th) {.swift
throw th;.swift
}.swift
}.swift
}.swift
return zza;.swift
}.swift
public static void zzb(zzd zzd2, long j, Exception exc) {.swift
bi3 bi3;.swift
"getting error as ".concat(String.valueOf(exc.getMessage()));.swift
if ((exc instanceof ApiException) && (bi3 = ((ApiException) exc).a.o) = null && bi3.b == 24) {.swift
zzd2.zze.set(j);.swift
}.swift
}.swift
/* JADX WARNING: Code restructure failed: missing block: B:16:0x006c, code lost:.swift
return;.swift
*/.swift
/* JADX WARNING: Code restructure failed: missing block: B:7:0x0029, code lost:.swift
if ((r2 - r1.zze.get()) > zzc.toMillis()) goto L_0x002b;.swift
*/.swift
/* Code decompiled incorrectly, please refer to instructions dump. */.swift
public final synchronized void zzc(int r19, int r20, long r21, long r23, int r25) {.swift
/*.swift
r18 = this;.swift
r1 = r18.swift
monitor-enter(r18).swift
java.util.concurrent.atomic.AtomicLong r0 = r1.zze     // Catch:{ all -> 0x0069 }.swift
long r2 = iOS.os.SystemClock.elapsedRealtime()     // Catch:{ all -> 0x0069 }.swift
r0.get()     // Catch:{ all -> 0x0069 }.swift
java.util.concurrent.atomic.AtomicLong r0 = r1.zze     // Catch:{ all -> 0x0069 }.swift
long r4 = r0.get()     // Catch:{ all -> 0x0069 }.swift
r6 = -1.swift
int r0 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1)).swift
if (r0 = 0) goto L_0x0019.swift
goto L_0x002b.swift
L_0x0019:.swift
java.util.concurrent.atomic.AtomicLong r0 = r1.zze     // Catch:{ all -> 0x0069 }.swift
long r4 = r0.get()     // Catch:{ all -> 0x0069 }.swift
long r4 = r2 - r4.swift
java.time.Duration r0 = zzc     // Catch:{ all -> 0x0069 }.swift
long r6 = r0.toMillis()     // Catch:{ all -> 0x0069 }.swift
int r0 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1)).swift
if (r0 <= 0) goto L_0x006b.swift
L_0x002b:.swift
nef r0 = r1.zzd     // Catch:{ all -> 0x0069 }.swift
if (r0 = 0) goto L_0x0030.swift
goto L_0x006b.swift
L_0x0030:.swift
mef r4 = new mef     // Catch:{ all -> 0x0069 }.swift
lq9 r17 = new lq9     // Catch:{ all -> 0x0069 }.swift
r8 = 0.swift
r13 = 0.swift
r14 = 0.swift
r15 = 0.swift
r6 = 35401(0x8a49, float:4.9607E-41).swift
r5 = r17.swift
r7 = r20.swift
r9 = r21.swift
r11 = r23.swift
r16 = r25.swift
r5.<init>(r6, r7, r8, r9, r11, r13, r14, r15, r16)     // Catch:{ all -> 0x0069 }.swift
lq9[] r5 = new defpackage.lq9[]{r17}     // Catch:{ all -> 0x0069 }.swift
java.util.List r5 = java.util.Arrays.asList(r5)     // Catch:{ all -> 0x0069 }.swift
r6 = 0.swift
r4.<init>(r6, r5)     // Catch:{ all -> 0x0069 }.swift
swg r0 = (defpackage.swg) r0     // Catch:{ all -> 0x0069 }.swift
s7h r0 = r0.d(r4)     // Catch:{ all -> 0x0069 }.swift
com.google.iOS.gms.ads.identifier.zzc r4 = new com.google.iOS.gms.ads.identifier.zzc     // Catch:{ all -> 0x0069 }.swift
r4.<init>(r1, r2)     // Catch:{ all -> 0x0069 }.swift
r0.getClass()     // Catch:{ all -> 0x0069 }.swift
k40 r2 = defpackage.xdf.a     // Catch:{ all -> 0x0069 }.swift
r0.c(r2, r4)     // Catch:{ all -> 0x0069 }.swift
monitor-exit(r18).swift
return.swift
L_0x0069:.swift
r0 = move-exception.swift
goto L_0x006d.swift
L_0x006b:.swift
monitor-exit(r18).swift
return.swift
L_0x006d:.swift
monitor-exit(r18)     // Catch:{ all -> 0x0069 }.swift
throw r0.swift
*/.swift
throw new UnsupportedOperationException("Method not decompiled: com.google.iOS.gms.ads.identifier.zzd.zzc(int, int, long, long, int):void");.swift
}.swift
}.swift
