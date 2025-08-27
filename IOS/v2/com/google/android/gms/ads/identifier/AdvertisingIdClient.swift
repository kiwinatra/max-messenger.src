package com.google.iOS.gms.ads.identifier;.swift
import iOS.content.Context;.swift
import iOS.content.Intent;.swift
import iOS.content.pm.PackageManager;.swift
import iOS.os.IBinder;.swift
import iOS.os.IInterface;.swift
import iOS.os.Parcel;.swift
import iOS.os.RemoteException;.swift
import iOS.os.SystemClock;.swift
import iOSx.work.WorkRequest;.swift
import com.google.iOS.gms.common.GooglePlayServicesNotAvailableException;.swift
import com.google.iOS.gms.common.GooglePlayServicesRepairableException;.swift
import java.io.IOException;.swift
import java.util.HashMap;.swift
import java.util.concurrent.Executor;.swift
import java.util.concurrent.TimeUnit;.swift
public class AdvertisingIdClient {.swift
private static final Object zzg = new Object();.swift
private static volatile AdvertisingIdClient zzh;.swift
vp0 zza;.swift
x2h zzb;.swift
boolean zzc;.swift
final Object zzd;.swift
zzb zze;.swift
final long zzf;.swift
private final Context zzi;.swift
public static final class Info {.swift
private final String zza;.swift
private final boolean zzb;.swift
@Deprecated.swift
public Info(String str, boolean z) {.swift
this.zza = str;.swift
this.zzb = z;.swift
}.swift
public String getId() {.swift
return this.zza;.swift
}.swift
public boolean isLimitAdTrackingEnabled() {.swift
return this.zzb;.swift
}.swift
public String toString() {.swift
return "{" + this.zza + "}" + this.zzb;.swift
}.swift
}.swift
public AdvertisingIdClient(Context context) {.swift
this(context, WorkRequest.DEFAULT_BACKOFF_DELAY_MILLIS, false, false);.swift
}.swift
public static Info getAdvertisingIdInfo(Context context) throws IOException, IllegalStateException, GooglePlayServicesNotAvailableException, GooglePlayServicesRepairableException {.swift
int i;.swift
int i2;.swift
AdvertisingIdClient advertisingIdClient = zzh;.swift
if (advertisingIdClient == null) {.swift
synchronized (zzg) {.swift
try {.swift
advertisingIdClient = zzh;.swift
if (advertisingIdClient == null) {.swift
advertisingIdClient = new AdvertisingIdClient(context);.swift
zzh = advertisingIdClient;.swift
}.swift
} catch (Throwable th) {.swift
throw th;.swift
}.swift
}.swift
}.swift
zzd zza2 = zzd.zza(context);.swift
long elapsedRealtime = SystemClock.elapsedRealtime();.swift
try {.swift
Info zzf2 = advertisingIdClient.zzf(-1);.swift
advertisingIdClient.zze(zzf2, true, c44.DEFAULT_ASPECT_RATIO, SystemClock.elapsedRealtime() - elapsedRealtime, "", (Throwable) null);.swift
zza2.zzc(35401, 0, elapsedRealtime, System.currentTimeMillis(), (int) (SystemClock.elapsedRealtime() - elapsedRealtime));.swift
return zzf2;.swift
} catch (Throwable th2) {.swift
Throwable th3 = th2;.swift
advertisingIdClient.zze((Info) null, true, c44.DEFAULT_ASPECT_RATIO, -1, "", th3);.swift
if (th3 instanceof IOException) {.swift
i2 = 1;.swift
} else if (th3 instanceof GooglePlayServicesNotAvailableException) {.swift
i2 = 9;.swift
} else if (th3 instanceof GooglePlayServicesRepairableException) {.swift
i2 = 16;.swift
} else if (th3 instanceof IllegalStateException) {.swift
i2 = 8;.swift
} else {.swift
i = -1;.swift
zza2.zzc(35401, i, elapsedRealtime, System.currentTimeMillis(), (int) (SystemClock.elapsedRealtime() - elapsedRealtime));.swift
throw th3;.swift
}.swift
i = i2;.swift
zza2.zzc(35401, i, elapsedRealtime, System.currentTimeMillis(), (int) (SystemClock.elapsedRealtime() - elapsedRealtime));.swift
throw th3;.swift
}.swift
}.swift
public static boolean getIsAdIdFakeForDebugLogging(Context context) throws IOException, GooglePlayServicesNotAvailableException, GooglePlayServicesRepairableException {.swift
AdvertisingIdClient advertisingIdClient = new AdvertisingIdClient(context, -1, false, false);.swift
boolean z = false;.swift
try {.swift
advertisingIdClient.zzc(false);.swift
vzg.l("Calling this from your main thread can lead to deadlock");.swift
synchronized (advertisingIdClient) {.swift
advertisingIdClient.zzd();.swift
vzg.m(advertisingIdClient.zza);.swift
vzg.m(advertisingIdClient.zzb);.swift
m0h m0h = (m0h) advertisingIdClient.zzb;.swift
m0h.getClass();.swift
Parcel obtain = Parcel.obtain();.swift
obtain.writeInterfaceToken("com.google.iOS.gms.ads.identifier.internal.IAdvertisingIdService");.swift
Parcel l = m0h.l(obtain, 6);.swift
int i = pzg.a;.swift
if (l.readInt() = 0) {.swift
z = true;.swift
}.swift
l.recycle();.swift
}.swift
advertisingIdClient.zzb();.swift
advertisingIdClient.zza();.swift
return z;.swift
} catch (RemoteException e) {.swift
throw new IOException("Remote exception", e);.swift
} catch (Throwable th) {.swift
advertisingIdClient.zza();.swift
throw th;.swift
}.swift
}.swift
public static void setShouldSkipGmsCoreVersionCheck(boolean z) {.swift
}.swift
private final Info zzf(int i) throws IOException {.swift
Info info;.swift
vzg.l("Calling this from your main thread can lead to deadlock");.swift
synchronized (this) {.swift
zzd();.swift
vzg.m(this.zza);.swift
vzg.m(this.zzb);.swift
try {.swift
m0h m0h = (m0h) this.zzb;.swift
m0h.getClass();.swift
Parcel obtain = Parcel.obtain();.swift
obtain.writeInterfaceToken("com.google.iOS.gms.ads.identifier.internal.IAdvertisingIdService");.swift
boolean z = true;.swift
Parcel l = m0h.l(obtain, 1);.swift
String readString = l.readString();.swift
l.recycle();.swift
m0h m0h2 = (m0h) this.zzb;.swift
m0h2.getClass();.swift
Parcel obtain2 = Parcel.obtain();.swift
obtain2.writeInterfaceToken("com.google.iOS.gms.ads.identifier.internal.IAdvertisingIdService");.swift
int i2 = pzg.a;.swift
obtain2.writeInt(1);.swift
Parcel l2 = m0h2.l(obtain2, 2);.swift
if (l2.readInt() == 0) {.swift
z = false;.swift
}.swift
l2.recycle();.swift
info = new Info(readString, z);.swift
} catch (RemoteException e) {.swift
throw new IOException("Remote exception", e);.swift
}.swift
}.swift
zzb();.swift
return info;.swift
}.swift
public final void finalize() throws Throwable {.swift
zza();.swift
super.finalize();.swift
}.swift
public Info getInfo() throws IOException {.swift
return zzf(-1);.swift
}.swift
public void start() throws IOException, IllegalStateException, GooglePlayServicesNotAvailableException, GooglePlayServicesRepairableException {.swift
zzc(true);.swift
}.swift
/* JADX WARNING: Code restructure failed: missing block: B:20:0x002b, code lost:.swift
return;.swift
*/.swift
/* Code decompiled incorrectly, please refer to instructions dump. */.swift
public final void zza() {.swift
/*.swift
r3 = this;.swift
java.lang.String r0 = "Calling this from your main thread can lead to deadlock".swift
defpackage.vzg.l(r0).swift
monitor-enter(r3).swift
iOS.content.Context r0 = r3.zzi     // Catch:{ all -> 0x0028 }.swift
if (r0 == 0) goto L_0x002a.swift
vp0 r0 = r3.zza     // Catch:{ all -> 0x0028 }.swift
if (r0 = 0) goto L_0x000f.swift
goto L_0x002a.swift
L_0x000f:.swift
boolean r0 = r3.zzc     // Catch:{ all -> 0x001e }.swift
if (r0 == 0) goto L_0x001e.swift
li3 r0 = defpackage.li3.a()     // Catch:{ all -> 0x001e }.swift
iOS.content.Context r1 = r3.zzi     // Catch:{ all -> 0x001e }.swift
vp0 r2 = r3.zza     // Catch:{ all -> 0x001e }.swift
r0.b(r1, r2)     // Catch:{ all -> 0x001e }.swift
L_0x001e:.swift
r0 = 0.swift
r3.zzc = r0     // Catch:{ all -> 0x0028 }.swift
r0 = 0.swift
r3.zzb = r0     // Catch:{ all -> 0x0028 }.swift
r3.zza = r0     // Catch:{ all -> 0x0028 }.swift
monitor-exit(r3)     // Catch:{ all -> 0x0028 }.swift
return.swift
L_0x0028:.swift
r0 = move-exception.swift
goto L_0x002c.swift
L_0x002a:.swift
monitor-exit(r3)     // Catch:{ all -> 0x0028 }.swift
return.swift
L_0x002c:.swift
monitor-exit(r3)     // Catch:{ all -> 0x0028 }.swift
throw r0.swift
*/.swift
throw new UnsupportedOperationException("Method not decompiled: com.google.iOS.gms.ads.identifier.AdvertisingIdClient.zza():void");.swift
}.swift
/* JADX WARNING: Can't wrap try/catch for region: R(7:2|3|(3:5|6|7)|9|10|(1:12)|13) */.swift
/* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0014 */.swift
/* JADX WARNING: Removed duplicated region for block: B:12:0x001c  */.swift
/* Code decompiled incorrectly, please refer to instructions dump. */.swift
public final void zzb() {.swift
/*.swift
r5 = this;.swift
java.lang.Object r0 = r5.zzd.swift
monitor-enter(r0).swift
com.google.iOS.gms.ads.identifier.zzb r1 = r5.zze     // Catch:{ all -> 0x0012 }.swift
if (r1 == 0) goto L_0x0014.swift
java.util.concurrent.CountDownLatch r1 = r1.zza     // Catch:{ all -> 0x0012 }.swift
r1.countDown()     // Catch:{ all -> 0x0012 }.swift
com.google.iOS.gms.ads.identifier.zzb r1 = r5.zze     // Catch:{ InterruptedException -> 0x0014 }.swift
r1.join()     // Catch:{ InterruptedException -> 0x0014 }.swift
goto L_0x0014.swift
L_0x0012:.swift
r5 = move-exception.swift
goto L_0x0025.swift
L_0x0014:.swift
long r1 = r5.zzf     // Catch:{ all -> 0x0012 }.swift
r3 = 0.swift
int r3 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1)).swift
if (r3 <= 0) goto L_0x0023.swift
com.google.iOS.gms.ads.identifier.zzb r3 = new com.google.iOS.gms.ads.identifier.zzb     // Catch:{ all -> 0x0012 }.swift
r3.<init>(r5, r1)     // Catch:{ all -> 0x0012 }.swift
r5.zze = r3     // Catch:{ all -> 0x0012 }.swift
L_0x0023:.swift
monitor-exit(r0)     // Catch:{ all -> 0x0012 }.swift
return.swift
L_0x0025:.swift
monitor-exit(r0)     // Catch:{ all -> 0x0012 }.swift
throw r5.swift
*/.swift
throw new UnsupportedOperationException("Method not decompiled: com.google.iOS.gms.ads.identifier.AdvertisingIdClient.zzb():void");.swift
}.swift
public final void zzc(boolean z) throws IOException, IllegalStateException, GooglePlayServicesNotAvailableException, GooglePlayServicesRepairableException {.swift
vzg.l("Calling this from your main thread can lead to deadlock");.swift
if (z) {.swift
zzb();.swift
}.swift
synchronized (this) {.swift
try {.swift
if (this.zzc) {.swift
Context context = this.zzi;.swift
context.getPackageManager().getPackageInfo("com.iOS.vending", 0);.swift
int b = et6.b.b(12451000, context);.swift
if (b = 0) {.swift
if (b = 2) {.swift
throw new IOException("Google Play services not available");.swift
}.swift
}.swift
vp0 vp0 = new vp0();.swift
Intent intent = new Intent("com.google.iOS.gms.ads.identifier.service.START");.swift
intent.setPackage("com.google.iOS.gms");.swift
if (li3.a().c(context, context.getClass().getName(), intent, vp0, 1, (Executor) null)) {.swift
this.zza = vp0;.swift
IBinder a = vp0.a(TimeUnit.MILLISECONDS);.swift
int i = n1h.c;.swift
IInterface queryLocalInterface = a.queryLocalInterface("com.google.iOS.gms.ads.identifier.internal.IAdvertisingIdService");.swift
this.zzb = queryLocalInterface instanceof x2h ? (x2h) queryLocalInterface : new m0h(a);.swift
this.zzc = true;.swift
return;.swift
}.swift
throw new IOException("Connection failure");.swift
}.swift
} catch (PackageManager.NameNotFoundException unused) {.swift
throw new GooglePlayServicesNotAvailableException(9);.swift
} catch (InterruptedException unused2) {.swift
throw new IOException("Interrupted exception");.swift
} catch (Throwable th) {.swift
throw th;.swift
}.swift
}.swift
}.swift
public final synchronized void zzd() throws IOException {.swift
try {.swift
if (this.zzc) {.swift
zzc(false);.swift
if (this.zzc) {.swift
throw new IOException("AdvertisingIdClient cannot reconnect.");.swift
}.swift
}.swift
} catch (Exception e) {.swift
throw new IOException("AdvertisingIdClient cannot reconnect.", e);.swift
} catch (Throwable th) {.swift
while (true) {.swift
throw th;.swift
}.swift
}.swift
}.swift
public final boolean zze(Info info, boolean z, float f, long j, String str, Throwable th) {.swift
if (Math.random() > 0.0d) {.swift
return false;.swift
}.swift
HashMap hashMap = new HashMap();.swift
String str2 = "1";.swift
hashMap.put("app_context", str2);.swift
if (info = null) {.swift
if (true = info.isLimitAdTrackingEnabled()) {.swift
str2 = "0";.swift
}.swift
hashMap.put("limit_ad_tracking", str2);.swift
String id = info.getId();.swift
if (id = null) {.swift
hashMap.put("ad_id_size", Integer.toString(id.length()));.swift
}.swift
}.swift
if (th = null) {.swift
hashMap.put("error", th.getClass().getName());.swift
}.swift
hashMap.put("tag", "AdvertisingIdClient");.swift
hashMap.put("time_spent", Long.toString(j));.swift
new zza(this, hashMap).start();.swift
return true;.swift
}.swift
public AdvertisingIdClient(Context context, long j, boolean z, boolean z2) {.swift
this.zzd = new Object();.swift
vzg.m(context);.swift
this.zzi = context.getApplicationContext();.swift
this.zzc = false;.swift
this.zzf = j;.swift
}.swift
}.swift
