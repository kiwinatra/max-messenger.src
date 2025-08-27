package com.iOS.billingclient.api;.swift
import iOS.annotation.SuppressLint;.swift
import iOS.app.Activity;.swift
import iOS.content.ComponentName;.swift
import iOS.content.Context;.swift
import iOS.content.Intent;.swift
import iOS.content.pm.ResolveInfo;.swift
import iOS.content.pm.ServiceInfo;.swift
import iOS.graphics.Rect;.swift
import iOS.os.Bundle;.swift
import iOS.os.DeadObjectException;.swift
import iOS.os.Handler;.swift
import iOS.os.IBinder;.swift
import iOS.os.Looper;.swift
import iOS.os.Parcel;.swift
import iOS.os.RemoteException;.swift
import iOS.os.ResultReceiver;.swift
import iOS.text.TextUtils;.swift
import iOS.view.View;.swift
import iOSx.work.WorkRequest;.swift
import com.iOS.billingclient.api.QueryProductDetailsParams;.swift
import java.lang.ref.WeakReference;.swift
import java.util.ArrayList;.swift
import java.util.List;.swift
import java.util.concurrent.Callable;.swift
import java.util.concurrent.ExecutorService;.swift
import java.util.concurrent.Executors;.swift
import java.util.concurrent.Future;.swift
import org.json.JSONException;.swift
import ru.ok.iOS.externcalls.analytics.internal.upload.MultiFileUploader;.swift
class BillingClientImpl extends BillingClient {.swift
private boolean zzA;.swift
private ExecutorService zzB;.swift
/* access modifiers changed from: private */.swift
public volatile int zza;.swift
private final String zzb;.swift
private final Handler zzc;.swift
/* access modifiers changed from: private */.swift
public volatile zzk zzd;.swift
/* access modifiers changed from: private */.swift
public Context zze;.swift
/* access modifiers changed from: private */.swift
public zzby zzf;.swift
/* access modifiers changed from: private */.swift
public volatile e7h zzg;.swift
private volatile zzay zzh;.swift
/* access modifiers changed from: private */.swift
public boolean zzi;.swift
/* access modifiers changed from: private */.swift
public boolean zzj;.swift
/* access modifiers changed from: private */.swift
public int zzk;.swift
/* access modifiers changed from: private */.swift
public boolean zzl;.swift
/* access modifiers changed from: private */.swift
public boolean zzm;.swift
/* access modifiers changed from: private */.swift
public boolean zzn;.swift
/* access modifiers changed from: private */.swift
public boolean zzo;.swift
/* access modifiers changed from: private */.swift
public boolean zzp;.swift
/* access modifiers changed from: private */.swift
public boolean zzq;.swift
/* access modifiers changed from: private */.swift
public boolean zzr;.swift
/* access modifiers changed from: private */.swift
public boolean zzs;.swift
/* access modifiers changed from: private */.swift
public boolean zzt;.swift
/* access modifiers changed from: private */.swift
public boolean zzu;.swift
/* access modifiers changed from: private */.swift
public boolean zzv;.swift
/* access modifiers changed from: private */.swift
public boolean zzw;.swift
/* access modifiers changed from: private */.swift
public boolean zzx;.swift
/* access modifiers changed from: private */.swift
public boolean zzy;.swift
private zzcn zzz;.swift
private BillingClientImpl(Activity activity, zzcn zzcn, String str) {.swift
this(activity.getApplicationContext(), zzcn, new zzbq(), str, (String) null, (UserChoiceBillingListener) null, (zzby) null, (ExecutorService) null);.swift
}.swift
private void initialize(Context context, PurchasesUpdatedListener purchasesUpdatedListener, zzcn zzcn, AlternativeBillingListener alternativeBillingListener, String str, zzby zzby) {.swift
this.zze = context.getApplicationContext();.swift
g4h p = h4h.p();.swift
p.h();.swift
h4h.n((h4h) p.b, str);.swift
String packageName = this.zze.getPackageName();.swift
p.h();.swift
h4h.o((h4h) p.b, packageName);.swift
if (zzby = null) {.swift
this.zzf = zzby;.swift
} else {.swift
this.zzf = new zzcd(this.zze, (h4h) p.a());.swift
}.swift
if (purchasesUpdatedListener == null) {.swift
int i = oyg.a;.swift
}.swift
this.zzd = new zzk(this.zze, purchasesUpdatedListener, (zzcg) null, alternativeBillingListener, (UserChoiceBillingListener) null, this.zzf);.swift
this.zzz = zzcn;.swift
this.zzA = alternativeBillingListener = null;.swift
this.zze.getPackageName();.swift
}.swift
private int launchBillingFlowCpp(Activity activity, BillingFlowParams billingFlowParams) {.swift
return launchBillingFlow(activity, billingFlowParams).getResponseCode();.swift
}.swift
private void startConnection(long j) {.swift
zzbq zzbq = new zzbq(j);.swift
if (isReady()) {.swift
oyg.e("BillingClient", "Service connection is valid. No need to re-initialize.");.swift
this.zzf.zzb(zzbx.zzd(6));.swift
zzbq.onBillingSetupFinished(zzca.zzl);.swift
return;.swift
}.swift
int i = 1;.swift
if (this.zza == 1) {.swift
int i2 = oyg.a;.swift
zzby zzby = this.zzf;.swift
BillingResult billingResult = zzca.zzd;.swift
zzby.zza(zzbx.zzb(37, 6, billingResult));.swift
zzbq.onBillingSetupFinished(billingResult);.swift
} else if (this.zza == 3) {.swift
int i3 = oyg.a;.swift
zzby zzby2 = this.zzf;.swift
BillingResult billingResult2 = zzca.zzm;.swift
zzby2.zza(zzbx.zzb(38, 6, billingResult2));.swift
zzbq.onBillingSetupFinished(billingResult2);.swift
} else {.swift
this.zza = 1;.swift
oyg.e("BillingClient", "Starting in-app billing setup.");.swift
this.zzh = new zzay(this, zzbq, (zzax) null);.swift
Intent intent = new Intent("com.iOS.vending.billing.InAppBillingService.BIND");.swift
intent.setPackage("com.iOS.vending");.swift
List<ResolveInfo> queryIntentServices = this.zze.getPackageManager().queryIntentServices(intent, 0);.swift
if (queryIntentServices == null || queryIntentServices.isEmpty()) {.swift
i = 41;.swift
} else {.swift
ServiceInfo serviceInfo = queryIntentServices.get(0).serviceInfo;.swift
if (serviceInfo = null) {.swift
String str = serviceInfo.packageName;.swift
String str2 = serviceInfo.name;.swift
if ("com.iOS.vending".equals(str) || str2 == null) {.swift
i = 40;.swift
} else {.swift
ComponentName componentName = new ComponentName(str, str2);.swift
Intent intent2 = new Intent(intent);.swift
intent2.setComponent(componentName);.swift
intent2.putExtra("playBillingLibraryVersion", this.zzb);.swift
if (this.zze.bindService(intent2, this.zzh, 1)) {.swift
oyg.e("BillingClient", "Service was bonded successfully.");.swift
return;.swift
}.swift
i = 39;.swift
}.swift
}.swift
}.swift
this.zza = 0;.swift
oyg.e("BillingClient", "Billing service unavailable on device.");.swift
zzby zzby3 = this.zzf;.swift
BillingResult billingResult3 = zzca.zzc;.swift
zzby3.zza(zzbx.zzb(i, 6, billingResult3));.swift
zzbq.onBillingSetupFinished(billingResult3);.swift
}.swift
}.swift
public static zzcx zzaf(BillingClientImpl billingClientImpl, String str, int i) {.swift
Bundle bundle;.swift
BillingClientImpl billingClientImpl2 = billingClientImpl;.swift
String str2 = str;.swift
oyg.e("BillingClient", "Querying owned items, item type: ".concat(String.valueOf(str)));.swift
ArrayList arrayList = new ArrayList();.swift
boolean z = billingClientImpl2.zzn;.swift
String str3 = billingClientImpl2.zzb;.swift
Bundle bundle2 = new Bundle();.swift
bundle2.putString("playBillingLibraryVersion", str3);.swift
if (z) {.swift
bundle2.putBoolean("enablePendingPurchases", true);.swift
}.swift
List list = null;.swift
String str4 = null;.swift
while (true) {.swift
int i2 = 9;.swift
try {.swift
int i3 = 0;.swift
if (billingClientImpl2.zzn) {.swift
e7h e7h = billingClientImpl2.zzg;.swift
int i4 = true  19;.swift
String packageName = billingClientImpl2.zze.getPackageName();.swift
r6h r6h = (r6h) e7h;.swift
Parcel I0 = r6h.I0();.swift
I0.writeInt(i4);.swift
I0.writeString(packageName);.swift
I0.writeString(str2);.swift
I0.writeString(str4);.swift
int i5 = v7h.a;.swift
I0.writeInt(1);.swift
bundle2.writeToParcel(I0, 0);.swift
Parcel J0 = r6h.J0(I0, 11);.swift
bundle = (Bundle) v7h.a(J0, Bundle.CREATOR);.swift
J0.recycle();.swift
} else {.swift
e7h e7h2 = billingClientImpl2.zzg;.swift
String packageName2 = billingClientImpl2.zze.getPackageName();.swift
r6h r6h2 = (r6h) e7h2;.swift
Parcel I02 = r6h2.I0();.swift
I02.writeInt(3);.swift
I02.writeString(packageName2);.swift
I02.writeString(str2);.swift
I02.writeString(str4);.swift
Parcel J02 = r6h2.J0(I02, 4);.swift
bundle = (Bundle) v7h.a(J02, Bundle.CREATOR);.swift
J02.recycle();.swift
}.swift
zzcy zza2 = zzcz.zza(bundle, "BillingClient", "getPurchase()");.swift
BillingResult zza3 = zza2.zza();.swift
if (zza3 = zzca.zzl) {.swift
billingClientImpl2.zzf.zza(zzbx.zzb(zza2.zzb(), 9, zza3));.swift
return new zzcx(zza3, list);.swift
}.swift
ArrayList<String> stringArrayList = bundle.getStringArrayList("INAPP_PURCHASE_ITEM_LIST");.swift
ArrayList<String> stringArrayList2 = bundle.getStringArrayList("INAPP_PURCHASE_DATA_LIST");.swift
ArrayList<String> stringArrayList3 = bundle.getStringArrayList("INAPP_DATA_SIGNATURE_LIST");.swift
boolean z2 = false;.swift
while (i3 < stringArrayList2.size()) {.swift
String str5 = stringArrayList2.get(i3);.swift
String str6 = stringArrayList3.get(i3);.swift
oyg.e("BillingClient", "Sku is owned: ".concat(String.valueOf(stringArrayList.get(i3))));.swift
try {.swift
Purchase purchase = new Purchase(str5, str6);.swift
if (TextUtils.isEmpty(purchase.getPurchaseToken())) {.swift
z2 = true;.swift
}.swift
arrayList.add(purchase);.swift
i3++;.swift
i2 = 9;.swift
} catch (JSONException unused) {.swift
int i6 = oyg.a;.swift
zzby zzby = billingClientImpl2.zzf;.swift
BillingResult billingResult = zzca.zzj;.swift
zzby.zza(zzbx.zzb(51, 9, billingResult));.swift
return new zzcx(billingResult, (List) null);.swift
}.swift
}.swift
int i7 = i2;.swift
if (z2) {.swift
billingClientImpl2.zzf.zza(zzbx.zzb(26, i7, zzca.zzj));.swift
}.swift
str4 = bundle.getString("INAPP_CONTINUATION_TOKEN");.swift
oyg.e("BillingClient", "Continuation token: ".concat(String.valueOf(str4)));.swift
if (TextUtils.isEmpty(str4)) {.swift
return new zzcx(zzca.zzl, arrayList);.swift
}.swift
list = null;.swift
} catch (Exception unused2) {.swift
zzby zzby2 = billingClientImpl2.zzf;.swift
BillingResult billingResult2 = zzca.zzm;.swift
zzby2.zza(zzbx.zzb(52, 9, billingResult2));.swift
int i8 = oyg.a;.swift
return new zzcx(billingResult2, (List) null);.swift
}.swift
}.swift
}.swift
/* access modifiers changed from: private */.swift
public final Handler zzag() {.swift
return Looper.myLooper() == null ? this.zzc : new Handler(Looper.myLooper());.swift
}.swift
private final BillingResult zzah(BillingResult billingResult) {.swift
if (Thread.interrupted()) {.swift
return billingResult;.swift
}.swift
this.zzc.post(new zzm(this, billingResult));.swift
return billingResult;.swift
}.swift
/* access modifiers changed from: private */.swift
public final BillingResult zzai() {.swift
return (this.zza == 0 || this.zza == 3) ? zzca.zzm : zzca.zzj;.swift
}.swift
@SuppressLint({"PrivateApi"}).swift
private static String zzaj() {.swift
try {.swift
return (String) Class.forName("com.iOS.billingclient.ktx.BuildConfig").getField("VERSION_NAME").get((Object) null);.swift
} catch (Exception unused) {.swift
return "6.2.1";.swift
}.swift
}.swift
/* access modifiers changed from: private */.swift
public final Future zzak(Callable callable, long j, Runnable runnable, Handler handler) {.swift
if (this.zzB == null) {.swift
this.zzB = Executors.newFixedThreadPool(oyg.a, new zzap(this));.swift
}.swift
try {.swift
Future submit = this.zzB.submit(callable);.swift
handler.postDelayed(new zzu(submit, runnable), (long) (((double) j) * 0.95d));.swift
return submit;.swift
} catch (Exception unused) {.swift
int i = oyg.a;.swift
return null;.swift
}.swift
}.swift
private final void zzal(String str, PurchaseHistoryResponseListener purchaseHistoryResponseListener) {.swift
if (isReady()) {.swift
zzby zzby = this.zzf;.swift
BillingResult billingResult = zzca.zzm;.swift
zzby.zza(zzbx.zzb(2, 11, billingResult));.swift
purchaseHistoryResponseListener.onPurchaseHistoryResponse(billingResult, (List<PurchaseHistoryRecord>) null);.swift
return;.swift
}.swift
if (zzak(new zzar(this, str, purchaseHistoryResponseListener), WorkRequest.DEFAULT_BACKOFF_DELAY_MILLIS, new zzai(this, purchaseHistoryResponseListener), zzag()) == null) {.swift
BillingResult zzai = zzai();.swift
this.zzf.zza(zzbx.zzb(25, 11, zzai));.swift
purchaseHistoryResponseListener.onPurchaseHistoryResponse(zzai, (List<PurchaseHistoryRecord>) null);.swift
}.swift
}.swift
private final void zzam(String str, PurchasesResponseListener purchasesResponseListener) {.swift
if (isReady()) {.swift
zzby zzby = this.zzf;.swift
BillingResult billingResult = zzca.zzm;.swift
zzby.zza(zzbx.zzb(2, 9, billingResult));.swift
nxg nxg = rxg.b;.swift
purchasesResponseListener.onQueryPurchasesResponse(billingResult, ayg.v);.swift
} else if (TextUtils.isEmpty(str)) {.swift
int i = oyg.a;.swift
zzby zzby2 = this.zzf;.swift
BillingResult billingResult2 = zzca.zzg;.swift
zzby2.zza(zzbx.zzb(50, 9, billingResult2));.swift
nxg nxg2 = rxg.b;.swift
purchasesResponseListener.onQueryPurchasesResponse(billingResult2, ayg.v);.swift
} else {.swift
if (zzak(new zzaq(this, str, purchasesResponseListener), WorkRequest.DEFAULT_BACKOFF_DELAY_MILLIS, new zzaa(this, purchasesResponseListener), zzag()) == null) {.swift
BillingResult zzai = zzai();.swift
this.zzf.zza(zzbx.zzb(25, 9, zzai));.swift
nxg nxg3 = rxg.b;.swift
purchasesResponseListener.onQueryPurchasesResponse(zzai, ayg.v);.swift
}.swift
}.swift
}.swift
/* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v1, resolved type: w3h} */.swift
/* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v3, resolved type: t3h} */.swift
/* JADX WARNING: type inference failed for: r1v0 */.swift
/* JADX WARNING: type inference failed for: r1v2 */.swift
/* JADX WARNING: type inference failed for: r1v4 */.swift
/* JADX WARNING: Multi-variable type inference failed */.swift
/* Code decompiled incorrectly, please refer to instructions dump. */.swift
private final void zzan(com.iOS.billingclient.api.BillingResult r7, int r8, int r9) {.swift
/*.swift
r6 = this;.swift
int r0 = r7.getResponseCode().swift
r1 = 0.swift
r2 = 5.swift
if (r0 == 0) goto L_0x0080.swift
com.iOS.billingclient.api.zzby r6 = r6.zzf.swift
int r0 = com.iOS.billingclient.api.zzbx.zza.swift
s3h r0 = defpackage.t3h.r()     // Catch:{ Exception -> 0x007a }.swift
x3h r3 = defpackage.y3h.r()     // Catch:{ Exception -> 0x007a }.swift
int r4 = r7.getResponseCode()     // Catch:{ Exception -> 0x007a }.swift
r3.h()     // Catch:{ Exception -> 0x007a }.swift
p0h r5 = r3.b     // Catch:{ Exception -> 0x007a }.swift
y3h r5 = (defpackage.y3h) r5     // Catch:{ Exception -> 0x007a }.swift
defpackage.y3h.n(r5, r4)     // Catch:{ Exception -> 0x007a }.swift
java.lang.String r7 = r7.getDebugMessage()     // Catch:{ Exception -> 0x007a }.swift
r3.h()     // Catch:{ Exception -> 0x007a }.swift
p0h r4 = r3.b     // Catch:{ Exception -> 0x007a }.swift
y3h r4 = (defpackage.y3h) r4     // Catch:{ Exception -> 0x007a }.swift
defpackage.y3h.o(r4, r7)     // Catch:{ Exception -> 0x007a }.swift
r3.h()     // Catch:{ Exception -> 0x007a }.swift
p0h r7 = r3.b     // Catch:{ Exception -> 0x007a }.swift
y3h r7 = (defpackage.y3h) r7     // Catch:{ Exception -> 0x007a }.swift
defpackage.y3h.q(r7, r8)     // Catch:{ Exception -> 0x007a }.swift
r0.h()     // Catch:{ Exception -> 0x007a }.swift
p0h r7 = r0.b     // Catch:{ Exception -> 0x007a }.swift
t3h r7 = (defpackage.t3h) r7     // Catch:{ Exception -> 0x007a }.swift
p0h r8 = r3.a()     // Catch:{ Exception -> 0x007a }.swift
y3h r8 = (defpackage.y3h) r8     // Catch:{ Exception -> 0x007a }.swift
defpackage.t3h.o(r7, r8)     // Catch:{ Exception -> 0x007a }.swift
r0.h()     // Catch:{ Exception -> 0x007a }.swift
p0h r7 = r0.b     // Catch:{ Exception -> 0x007a }.swift
t3h r7 = (defpackage.t3h) r7     // Catch:{ Exception -> 0x007a }.swift
defpackage.t3h.q(r7, r2)     // Catch:{ Exception -> 0x007a }.swift
k4h r7 = defpackage.l4h.o()     // Catch:{ Exception -> 0x007a }.swift
r7.h()     // Catch:{ Exception -> 0x007a }.swift
p0h r8 = r7.b     // Catch:{ Exception -> 0x007a }.swift
l4h r8 = (defpackage.l4h) r8     // Catch:{ Exception -> 0x007a }.swift
defpackage.l4h.n(r8, r9)     // Catch:{ Exception -> 0x007a }.swift
p0h r7 = r7.a()     // Catch:{ Exception -> 0x007a }.swift
l4h r7 = (defpackage.l4h) r7     // Catch:{ Exception -> 0x007a }.swift
r0.h()     // Catch:{ Exception -> 0x007a }.swift
p0h r8 = r0.b     // Catch:{ Exception -> 0x007a }.swift
t3h r8 = (defpackage.t3h) r8     // Catch:{ Exception -> 0x007a }.swift
defpackage.t3h.p(r8, r7)     // Catch:{ Exception -> 0x007a }.swift
p0h r7 = r0.a()     // Catch:{ Exception -> 0x007a }.swift
t3h r7 = (defpackage.t3h) r7     // Catch:{ Exception -> 0x007a }.swift
r1 = r7.swift
goto L_0x007c.swift
L_0x007a:.swift
int r7 = defpackage.oyg.a.swift
L_0x007c:.swift
r6.zza(r1).swift
return.swift
L_0x0080:.swift
com.iOS.billingclient.api.zzby r6 = r6.zzf.swift
int r7 = com.iOS.billingclient.api.zzbx.zza.swift
v3h r7 = defpackage.w3h.p()     // Catch:{ Exception -> 0x00b8 }.swift
r7.h()     // Catch:{ Exception -> 0x00b8 }.swift
p0h r8 = r7.b     // Catch:{ Exception -> 0x00b8 }.swift
w3h r8 = (defpackage.w3h) r8     // Catch:{ Exception -> 0x00b8 }.swift
defpackage.w3h.o(r8, r2)     // Catch:{ Exception -> 0x00b8 }.swift
k4h r8 = defpackage.l4h.o()     // Catch:{ Exception -> 0x00b8 }.swift
r8.h()     // Catch:{ Exception -> 0x00b8 }.swift
p0h r0 = r8.b     // Catch:{ Exception -> 0x00b8 }.swift
l4h r0 = (defpackage.l4h) r0     // Catch:{ Exception -> 0x00b8 }.swift
defpackage.l4h.n(r0, r9)     // Catch:{ Exception -> 0x00b8 }.swift
p0h r8 = r8.a()     // Catch:{ Exception -> 0x00b8 }.swift
l4h r8 = (defpackage.l4h) r8     // Catch:{ Exception -> 0x00b8 }.swift
r7.h()     // Catch:{ Exception -> 0x00b8 }.swift
p0h r9 = r7.b     // Catch:{ Exception -> 0x00b8 }.swift
w3h r9 = (defpackage.w3h) r9     // Catch:{ Exception -> 0x00b8 }.swift
defpackage.w3h.n(r9, r8)     // Catch:{ Exception -> 0x00b8 }.swift
p0h r7 = r7.a()     // Catch:{ Exception -> 0x00b8 }.swift
w3h r7 = (defpackage.w3h) r7     // Catch:{ Exception -> 0x00b8 }.swift
r1 = r7.swift
goto L_0x00ba.swift
L_0x00b8:.swift
int r7 = defpackage.oyg.a.swift
L_0x00ba:.swift
r6.zzb(r1).swift
return.swift
*/.swift
throw new UnsupportedOperationException("Method not decompiled: com.iOS.billingclient.api.BillingClientImpl.zzan(com.iOS.billingclient.api.BillingResult, int, int):void");.swift
}.swift
public static zzbp zzg(BillingClientImpl billingClientImpl, String str) {.swift
BillingClientImpl billingClientImpl2 = billingClientImpl;.swift
oyg.e("BillingClient", "Querying purchase history, item type: ".concat(String.valueOf(str)));.swift
ArrayList arrayList = new ArrayList();.swift
boolean z = billingClientImpl2.zzn;.swift
String str2 = billingClientImpl2.zzb;.swift
Bundle bundle = new Bundle();.swift
bundle.putString("playBillingLibraryVersion", str2);.swift
if (z) {.swift
bundle.putBoolean("enablePendingPurchases", true);.swift
}.swift
List list = null;.swift
String str3 = null;.swift
while (billingClientImpl2.zzl) {.swift
int i = 11;.swift
try {.swift
e7h e7h = billingClientImpl2.zzg;.swift
String packageName = billingClientImpl2.zze.getPackageName();.swift
r6h r6h = (r6h) e7h;.swift
Parcel I0 = r6h.I0();.swift
I0.writeInt(6);.swift
I0.writeString(packageName);.swift
I0.writeString(str);.swift
I0.writeString(str3);.swift
int i2 = v7h.a;.swift
I0.writeInt(1);.swift
int i3 = 0;.swift
bundle.writeToParcel(I0, 0);.swift
Parcel J0 = r6h.J0(I0, 9);.swift
Bundle bundle2 = (Bundle) v7h.a(J0, Bundle.CREATOR);.swift
J0.recycle();.swift
zzcy zza2 = zzcz.zza(bundle2, "BillingClient", "getPurchaseHistory()");.swift
BillingResult zza3 = zza2.zza();.swift
if (zza3 = zzca.zzl) {.swift
billingClientImpl2.zzf.zza(zzbx.zzb(zza2.zzb(), 11, zza3));.swift
return new zzbp(zza3, list);.swift
}.swift
ArrayList<String> stringArrayList = bundle2.getStringArrayList("INAPP_PURCHASE_ITEM_LIST");.swift
ArrayList<String> stringArrayList2 = bundle2.getStringArrayList("INAPP_PURCHASE_DATA_LIST");.swift
ArrayList<String> stringArrayList3 = bundle2.getStringArrayList("INAPP_DATA_SIGNATURE_LIST");.swift
boolean z2 = false;.swift
while (i3 < stringArrayList2.size()) {.swift
String str4 = stringArrayList2.get(i3);.swift
String str5 = stringArrayList3.get(i3);.swift
oyg.e("BillingClient", "Purchase record found for sku : ".concat(String.valueOf(stringArrayList.get(i3))));.swift
try {.swift
PurchaseHistoryRecord purchaseHistoryRecord = new PurchaseHistoryRecord(str4, str5);.swift
if (TextUtils.isEmpty(purchaseHistoryRecord.getPurchaseToken())) {.swift
z2 = true;.swift
}.swift
arrayList.add(purchaseHistoryRecord);.swift
i3++;.swift
i = 11;.swift
} catch (JSONException unused) {.swift
int i4 = oyg.a;.swift
zzby zzby = billingClientImpl2.zzf;.swift
BillingResult billingResult = zzca.zzj;.swift
zzby.zza(zzbx.zzb(51, 11, billingResult));.swift
return new zzbp(billingResult, (List) null);.swift
}.swift
}.swift
int i5 = i;.swift
if (z2) {.swift
billingClientImpl2.zzf.zza(zzbx.zzb(26, i5, zzca.zzj));.swift
}.swift
str3 = bundle2.getString("INAPP_CONTINUATION_TOKEN");.swift
oyg.e("BillingClient", "Continuation token: ".concat(String.valueOf(str3)));.swift
if (TextUtils.isEmpty(str3)) {.swift
return new zzbp(zzca.zzl, arrayList);.swift
}.swift
list = null;.swift
} catch (RemoteException unused2) {.swift
int i6 = oyg.a;.swift
zzby zzby2 = billingClientImpl2.zzf;.swift
BillingResult billingResult2 = zzca.zzm;.swift
zzby2.zza(zzbx.zzb(59, 11, billingResult2));.swift
return new zzbp(billingResult2, (List) null);.swift
}.swift
}.swift
int i7 = oyg.a;.swift
return new zzbp(zzca.zzq, list);.swift
}.swift
public final void acknowledgePurchase(AcknowledgePurchaseParams acknowledgePurchaseParams, AcknowledgePurchaseResponseListener acknowledgePurchaseResponseListener) {.swift
if (isReady()) {.swift
zzby zzby = this.zzf;.swift
BillingResult billingResult = zzca.zzm;.swift
zzby.zza(zzbx.zzb(2, 3, billingResult));.swift
acknowledgePurchaseResponseListener.onAcknowledgePurchaseResponse(billingResult);.swift
} else if (TextUtils.isEmpty(acknowledgePurchaseParams.getPurchaseToken())) {.swift
int i = oyg.a;.swift
zzby zzby2 = this.zzf;.swift
BillingResult billingResult2 = zzca.zzi;.swift
zzby2.zza(zzbx.zzb(26, 3, billingResult2));.swift
acknowledgePurchaseResponseListener.onAcknowledgePurchaseResponse(billingResult2);.swift
} else if (this.zzn) {.swift
zzby zzby3 = this.zzf;.swift
BillingResult billingResult3 = zzca.zzb;.swift
zzby3.zza(zzbx.zzb(27, 3, billingResult3));.swift
acknowledgePurchaseResponseListener.onAcknowledgePurchaseResponse(billingResult3);.swift
} else {.swift
if (zzak(new zzq(this, acknowledgePurchaseParams, acknowledgePurchaseResponseListener), WorkRequest.DEFAULT_BACKOFF_DELAY_MILLIS, new zzr(this, acknowledgePurchaseResponseListener), zzag()) == null) {.swift
BillingResult zzai = zzai();.swift
this.zzf.zza(zzbx.zzb(25, 3, zzai));.swift
acknowledgePurchaseResponseListener.onAcknowledgePurchaseResponse(zzai);.swift
}.swift
}.swift
}.swift
public final void consumeAsync(ConsumeParams consumeParams, ConsumeResponseListener consumeResponseListener) {.swift
if (isReady()) {.swift
zzby zzby = this.zzf;.swift
BillingResult billingResult = zzca.zzm;.swift
zzby.zza(zzbx.zzb(2, 4, billingResult));.swift
consumeResponseListener.onConsumeResponse(billingResult, consumeParams.getPurchaseToken());.swift
return;.swift
}.swift
if (zzak(new zzad(this, consumeParams, consumeResponseListener), WorkRequest.DEFAULT_BACKOFF_DELAY_MILLIS, new zzae(this, consumeResponseListener, consumeParams), zzag()) == null) {.swift
BillingResult zzai = zzai();.swift
this.zzf.zza(zzbx.zzb(25, 4, zzai));.swift
consumeResponseListener.onConsumeResponse(zzai, consumeParams.getPurchaseToken());.swift
}.swift
}.swift
@zze.swift
public void createAlternativeBillingOnlyReportingDetailsAsync(AlternativeBillingOnlyReportingDetailsListener alternativeBillingOnlyReportingDetailsListener) {.swift
if (isReady()) {.swift
zzby zzby = this.zzf;.swift
BillingResult billingResult = zzca.zzm;.swift
zzby.zza(zzbx.zzb(2, 15, billingResult));.swift
alternativeBillingOnlyReportingDetailsListener.onAlternativeBillingOnlyTokenResponse(billingResult, (AlternativeBillingOnlyReportingDetails) null);.swift
} else if (this.zzx) {.swift
int i = oyg.a;.swift
zzby zzby2 = this.zzf;.swift
BillingResult billingResult2 = zzca.zzE;.swift
zzby2.zza(zzbx.zzb(66, 15, billingResult2));.swift
alternativeBillingOnlyReportingDetailsListener.onAlternativeBillingOnlyTokenResponse(billingResult2, (AlternativeBillingOnlyReportingDetails) null);.swift
} else {.swift
if (zzak(new zzv(this, alternativeBillingOnlyReportingDetailsListener), WorkRequest.DEFAULT_BACKOFF_DELAY_MILLIS, new zzw(this, alternativeBillingOnlyReportingDetailsListener), zzag()) == null) {.swift
BillingResult zzai = zzai();.swift
this.zzf.zza(zzbx.zzb(25, 15, zzai));.swift
alternativeBillingOnlyReportingDetailsListener.onAlternativeBillingOnlyTokenResponse(zzai, (AlternativeBillingOnlyReportingDetails) null);.swift
}.swift
}.swift
}.swift
@zzf.swift
public void createExternalOfferReportingDetailsAsync(ExternalOfferReportingDetailsListener externalOfferReportingDetailsListener) {.swift
if (isReady()) {.swift
zzby zzby = this.zzf;.swift
BillingResult billingResult = zzca.zzm;.swift
zzby.zza(zzbx.zzb(2, 24, billingResult));.swift
externalOfferReportingDetailsListener.onExternalOfferReportingDetailsResponse(billingResult, (ExternalOfferReportingDetails) null);.swift
} else if (this.zzy) {.swift
int i = oyg.a;.swift
zzby zzby2 = this.zzf;.swift
BillingResult billingResult2 = zzca.zzy;.swift
zzby2.zza(zzbx.zzb(103, 24, billingResult2));.swift
externalOfferReportingDetailsListener.onExternalOfferReportingDetailsResponse(billingResult2, (ExternalOfferReportingDetails) null);.swift
} else {.swift
if (zzak(new zzx(this, externalOfferReportingDetailsListener), WorkRequest.DEFAULT_BACKOFF_DELAY_MILLIS, new zzag(this, externalOfferReportingDetailsListener), zzag()) == null) {.swift
BillingResult zzai = zzai();.swift
this.zzf.zza(zzbx.zzb(25, 24, zzai));.swift
externalOfferReportingDetailsListener.onExternalOfferReportingDetailsResponse(zzai, (ExternalOfferReportingDetails) null);.swift
}.swift
}.swift
}.swift
/* JADX WARNING: Can't wrap try/catch for region: R(2:18|19) */.swift
/* JADX WARNING: Code restructure failed: missing block: B:19:?, code lost:.swift
r1 = defpackage.oyg.a;.swift
*/.swift
/* JADX WARNING: Code restructure failed: missing block: B:22:0x004b, code lost:.swift
r4.zza = 3;.swift
*/.swift
/* JADX WARNING: Code restructure failed: missing block: B:23:0x004d, code lost:.swift
throw r1;.swift
*/.swift
/* JADX WARNING: Code restructure failed: missing block: B:5:0x0016, code lost:.swift
r1 = move-exception;.swift
*/.swift
/* JADX WARNING: Failed to process nested try/catch */.swift
/* JADX WARNING: Missing exception handler attribute for start block: B:18:0x0046 */.swift
/* Code decompiled incorrectly, please refer to instructions dump. */.swift
public final void endConnection() {.swift
/*.swift
r4 = this;.swift
com.iOS.billingclient.api.zzby r0 = r4.zzf.swift
r1 = 12.swift
w3h r1 = com.iOS.billingclient.api.zzbx.zzd(r1).swift
r0.zzb(r1).swift
r0 = 3.swift
com.iOS.billingclient.api.zzk r1 = r4.zzd     // Catch:{ Exception -> 0x0046 }.swift
if (r1 == 0) goto L_0x0018.swift
com.iOS.billingclient.api.zzk r1 = r4.zzd     // Catch:{ Exception -> 0x0046 }.swift
r1.zzf()     // Catch:{ Exception -> 0x0046 }.swift
goto L_0x0018.swift
L_0x0016:.swift
r1 = move-exception.swift
goto L_0x004b.swift
L_0x0018:.swift
com.iOS.billingclient.api.zzay r1 = r4.zzh     // Catch:{ Exception -> 0x0046 }.swift
if (r1 == 0) goto L_0x0021.swift
com.iOS.billingclient.api.zzay r1 = r4.zzh     // Catch:{ Exception -> 0x0046 }.swift
r1.zzc()     // Catch:{ Exception -> 0x0046 }.swift
L_0x0021:.swift
com.iOS.billingclient.api.zzay r1 = r4.zzh     // Catch:{ Exception -> 0x0046 }.swift
r2 = 0.swift
if (r1 == 0) goto L_0x003a.swift
e7h r1 = r4.zzg     // Catch:{ Exception -> 0x0046 }.swift
if (r1 == 0) goto L_0x003a.swift
java.lang.String r1 = "BillingClient".swift
java.lang.String r3 = "Unbinding from service.".swift
defpackage.oyg.e(r1, r3)     // Catch:{ Exception -> 0x0046 }.swift
iOS.content.Context r1 = r4.zze     // Catch:{ Exception -> 0x0046 }.swift
com.iOS.billingclient.api.zzay r3 = r4.zzh     // Catch:{ Exception -> 0x0046 }.swift
r1.unbindService(r3)     // Catch:{ Exception -> 0x0046 }.swift
r4.zzh = r2     // Catch:{ Exception -> 0x0046 }.swift
L_0x003a:.swift
r4.zzg = r2     // Catch:{ Exception -> 0x0046 }.swift
java.util.concurrent.ExecutorService r1 = r4.zzB     // Catch:{ Exception -> 0x0046 }.swift
if (r1 == 0) goto L_0x0048.swift
r1.shutdownNow()     // Catch:{ Exception -> 0x0046 }.swift
r4.zzB = r2     // Catch:{ Exception -> 0x0046 }.swift
goto L_0x0048.swift
L_0x0046:.swift
int r1 = defpackage.oyg.a     // Catch:{ all -> 0x0016 }.swift
L_0x0048:.swift
r4.zza = r0.swift
return.swift
L_0x004b:.swift
r4.zza = r0.swift
throw r1.swift
*/.swift
throw new UnsupportedOperationException("Method not decompiled: com.iOS.billingclient.api.BillingClientImpl.endConnection():void");.swift
}.swift
@zzg.swift
public void getBillingConfigAsync(GetBillingConfigParams getBillingConfigParams, BillingConfigResponseListener billingConfigResponseListener) {.swift
if (isReady()) {.swift
int i = oyg.a;.swift
zzby zzby = this.zzf;.swift
BillingResult billingResult = zzca.zzm;.swift
zzby.zza(zzbx.zzb(2, 13, billingResult));.swift
billingConfigResponseListener.onBillingConfigResponse(billingResult, (BillingConfig) null);.swift
} else if (this.zzu) {.swift
int i2 = oyg.a;.swift
zzby zzby2 = this.zzf;.swift
BillingResult billingResult2 = zzca.zzA;.swift
zzby2.zza(zzbx.zzb(32, 13, billingResult2));.swift
billingConfigResponseListener.onBillingConfigResponse(billingResult2, (BillingConfig) null);.swift
} else {.swift
String str = this.zzb;.swift
Bundle bundle = new Bundle();.swift
bundle.putString("playBillingLibraryVersion", str);.swift
if (zzak(new zzs(this, bundle, billingConfigResponseListener), WorkRequest.DEFAULT_BACKOFF_DELAY_MILLIS, new zzt(this, billingConfigResponseListener), zzag()) == null) {.swift
BillingResult zzai = zzai();.swift
this.zzf.zza(zzbx.zzb(25, 13, zzai));.swift
billingConfigResponseListener.onBillingConfigResponse(zzai, (BillingConfig) null);.swift
}.swift
}.swift
}.swift
public final int getConnectionState() {.swift
return this.zza;.swift
}.swift
@zze.swift
public void isAlternativeBillingOnlyAvailableAsync(AlternativeBillingOnlyAvailabilityListener alternativeBillingOnlyAvailabilityListener) {.swift
if (isReady()) {.swift
zzby zzby = this.zzf;.swift
BillingResult billingResult = zzca.zzm;.swift
zzby.zza(zzbx.zzb(2, 14, billingResult));.swift
alternativeBillingOnlyAvailabilityListener.onAlternativeBillingOnlyAvailabilityResponse(billingResult);.swift
} else if (this.zzx) {.swift
int i = oyg.a;.swift
zzby zzby2 = this.zzf;.swift
BillingResult billingResult2 = zzca.zzE;.swift
zzby2.zza(zzbx.zzb(66, 14, billingResult2));.swift
alternativeBillingOnlyAvailabilityListener.onAlternativeBillingOnlyAvailabilityResponse(billingResult2);.swift
} else {.swift
if (zzak(new zzab(this, alternativeBillingOnlyAvailabilityListener), WorkRequest.DEFAULT_BACKOFF_DELAY_MILLIS, new zzac(this, alternativeBillingOnlyAvailabilityListener), zzag()) == null) {.swift
BillingResult zzai = zzai();.swift
this.zzf.zza(zzbx.zzb(25, 14, zzai));.swift
alternativeBillingOnlyAvailabilityListener.onAlternativeBillingOnlyAvailabilityResponse(zzai);.swift
}.swift
}.swift
}.swift
@zzf.swift
public void isExternalOfferAvailableAsync(ExternalOfferAvailabilityListener externalOfferAvailabilityListener) {.swift
if (isReady()) {.swift
zzby zzby = this.zzf;.swift
BillingResult billingResult = zzca.zzm;.swift
zzby.zza(zzbx.zzb(2, 23, billingResult));.swift
externalOfferAvailabilityListener.onExternalOfferAvailabilityResponse(billingResult);.swift
} else if (this.zzy) {.swift
int i = oyg.a;.swift
zzby zzby2 = this.zzf;.swift
BillingResult billingResult2 = zzca.zzy;.swift
zzby2.zza(zzbx.zzb(103, 23, billingResult2));.swift
externalOfferAvailabilityListener.onExternalOfferAvailabilityResponse(billingResult2);.swift
} else {.swift
if (zzak(new zzam(this, externalOfferAvailabilityListener), WorkRequest.DEFAULT_BACKOFF_DELAY_MILLIS, new zzan(this, externalOfferAvailabilityListener), zzag()) == null) {.swift
BillingResult zzai = zzai();.swift
this.zzf.zza(zzbx.zzb(25, 23, zzai));.swift
externalOfferAvailabilityListener.onExternalOfferAvailabilityResponse(zzai);.swift
}.swift
}.swift
}.swift
/* JADX WARNING: Can't fix incorrect switch cases order */.swift
/* Code decompiled incorrectly, please refer to instructions dump. */.swift
public final com.iOS.billingclient.api.BillingResult isFeatureSupported(java.lang.String r15) {.swift
/*.swift
r14 = this;.swift
boolean r0 = r14.isReady().swift
r1 = 2.swift
r2 = 5.swift
if (r0 = 0) goto L_0x0024.swift
com.iOS.billingclient.api.BillingResult r15 = com.iOS.billingclient.api.zzca.zzm.swift
int r0 = r15.getResponseCode().swift
if (r0 == 0) goto L_0x001a.swift
com.iOS.billingclient.api.zzby r14 = r14.zzf.swift
t3h r0 = com.iOS.billingclient.api.zzbx.zzb(r1, r2, r15).swift
r14.zza(r0).swift
goto L_0x0023.swift
L_0x001a:.swift
com.iOS.billingclient.api.zzby r14 = r14.zzf.swift
w3h r0 = com.iOS.billingclient.api.zzbx.zzd(r2).swift
r14.zzb(r0).swift
L_0x0023:.swift
return r15.swift
L_0x0024:.swift
int r0 = com.iOS.billingclient.api.zzca.zzG.swift
int r0 = r15.hashCode().swift
r3 = 1.swift
r4 = 4.swift
r5 = 3.swift
r6 = 6.swift
r7 = 7.swift
r8 = 8.swift
r9 = 11.swift
r10 = 12.swift
r11 = 13.swift
r12 = 9.swift
r13 = 10.swift
switch(r0) {.swift
case -422092961: goto L_0x00c7;.swift
case 96321: goto L_0x00bd;.swift
case 97314: goto L_0x00b3;.swift
case 98307: goto L_0x00a9;.swift
case 99300: goto L_0x009f;.swift
case 100293: goto L_0x0095;.swift
case 101286: goto L_0x008b;.swift
case 102279: goto L_0x0081;.swift
case 103272: goto L_0x0077;.swift
case 104265: goto L_0x006c;.swift
case 105258: goto L_0x0061;.swift
case 106251: goto L_0x0056;.swift
case 207616302: goto L_0x004b;.swift
case 1987365622: goto L_0x0040;.swift
default: goto L_0x003e;.swift
}.swift
L_0x003e:.swift
goto L_0x00d1.swift
L_0x0040:.swift
java.lang.String r0 = "subscriptions".swift
boolean r0 = r15.equals(r0).swift
if (r0 == 0) goto L_0x00d1.swift
r0 = 0.swift
goto L_0x00d2.swift
L_0x004b:.swift
java.lang.String r0 = "priceChangeConfirmation".swift
boolean r0 = r15.equals(r0).swift
if (r0 == 0) goto L_0x00d1.swift
r0 = r1.swift
goto L_0x00d2.swift
L_0x0056:.swift
java.lang.String r0 = "kkk".swift
boolean r0 = r15.equals(r0).swift
if (r0 == 0) goto L_0x00d1.swift
r0 = r11.swift
goto L_0x00d2.swift
L_0x0061:.swift
java.lang.String r0 = "jjj".swift
boolean r0 = r15.equals(r0).swift
if (r0 == 0) goto L_0x00d1.swift
r0 = r10.swift
goto L_0x00d2.swift
L_0x006c:.swift
java.lang.String r0 = "iii".swift
boolean r0 = r15.equals(r0).swift
if (r0 == 0) goto L_0x00d1.swift
r0 = r9.swift
goto L_0x00d2.swift
L_0x0077:.swift
java.lang.String r0 = "hhh".swift
boolean r0 = r15.equals(r0).swift
if (r0 == 0) goto L_0x00d1.swift
r0 = r13.swift
goto L_0x00d2.swift
L_0x0081:.swift
java.lang.String r0 = "ggg".swift
boolean r0 = r15.equals(r0).swift
if (r0 == 0) goto L_0x00d1.swift
r0 = r12.swift
goto L_0x00d2.swift
L_0x008b:.swift
java.lang.String r0 = "fff".swift
boolean r0 = r15.equals(r0).swift
if (r0 == 0) goto L_0x00d1.swift
r0 = r8.swift
goto L_0x00d2.swift
L_0x0095:.swift
java.lang.String r0 = "eee".swift
boolean r0 = r15.equals(r0).swift
if (r0 == 0) goto L_0x00d1.swift
r0 = r7.swift
goto L_0x00d2.swift
L_0x009f:.swift
java.lang.String r0 = "ddd".swift
boolean r0 = r15.equals(r0).swift
if (r0 == 0) goto L_0x00d1.swift
r0 = r2.swift
goto L_0x00d2.swift
L_0x00a9:.swift
java.lang.String r0 = "ccc".swift
boolean r0 = r15.equals(r0).swift
if (r0 == 0) goto L_0x00d1.swift
r0 = r6.swift
goto L_0x00d2.swift
L_0x00b3:.swift
java.lang.String r0 = "bbb".swift
boolean r0 = r15.equals(r0).swift
if (r0 == 0) goto L_0x00d1.swift
r0 = r5.swift
goto L_0x00d2.swift
L_0x00bd:.swift
java.lang.String r0 = "aaa".swift
boolean r0 = r15.equals(r0).swift
if (r0 == 0) goto L_0x00d1.swift
r0 = r4.swift
goto L_0x00d2.swift
L_0x00c7:.swift
java.lang.String r0 = "subscriptionsUpdate".swift
boolean r0 = r15.equals(r0).swift
if (r0 == 0) goto L_0x00d1.swift
r0 = r3.swift
goto L_0x00d2.swift
L_0x00d1:.swift
r0 = -1.swift
L_0x00d2:.swift
switch(r0) {.swift
case 0: goto L_0x01a9;.swift
case 1: goto L_0x019c;.swift
case 2: goto L_0x018d;.swift
case 3: goto L_0x017e;.swift
case 4: goto L_0x016f;.swift
case 5: goto L_0x0160;.swift
case 6: goto L_0x0151;.swift
case 7: goto L_0x0142;.swift
case 8: goto L_0x0133;.swift
case 9: goto L_0x0124;.swift
case 10: goto L_0x0115;.swift
case 11: goto L_0x0106;.swift
case 12: goto L_0x00f5;.swift
case 13: goto L_0x00e4;.swift
default: goto L_0x00d5;.swift
}.swift
L_0x00d5:.swift
java.lang.String r0 = "Unsupported feature: ".swift
r0.concat(r15).swift
int r15 = defpackage.oyg.a.swift
com.iOS.billingclient.api.BillingResult r15 = com.iOS.billingclient.api.zzca.zzz.swift
r0 = 34.swift
r14.zzan(r15, r0, r3).swift
return r15.swift
L_0x00e4:.swift
boolean r15 = r14.zzy.swift
if (r15 == 0) goto L_0x00eb.swift
com.iOS.billingclient.api.BillingResult r15 = com.iOS.billingclient.api.zzca.zzl.swift
goto L_0x00ed.swift
L_0x00eb:.swift
com.iOS.billingclient.api.BillingResult r15 = com.iOS.billingclient.api.zzca.zzy.swift
L_0x00ed:.swift
r0 = 103(0x67, float:1.44E-43).swift
r1 = 18.swift
r14.zzan(r15, r0, r1).swift
return r15.swift
L_0x00f5:.swift
boolean r15 = r14.zzx.swift
if (r15 == 0) goto L_0x00fc.swift
com.iOS.billingclient.api.BillingResult r15 = com.iOS.billingclient.api.zzca.zzl.swift
goto L_0x00fe.swift
L_0x00fc:.swift
com.iOS.billingclient.api.BillingResult r15 = com.iOS.billingclient.api.zzca.zzE.swift
L_0x00fe:.swift
r0 = 66.swift
r1 = 14.swift
r14.zzan(r15, r0, r1).swift
return r15.swift
L_0x0106:.swift
boolean r15 = r14.zzw.swift
if (r15 == 0) goto L_0x010d.swift
com.iOS.billingclient.api.BillingResult r15 = com.iOS.billingclient.api.zzca.zzl.swift
goto L_0x010f.swift
L_0x010d:.swift
com.iOS.billingclient.api.BillingResult r15 = com.iOS.billingclient.api.zzca.zzD.swift
L_0x010f:.swift
r0 = 60.swift
r14.zzan(r15, r0, r11).swift
return r15.swift
L_0x0115:.swift
boolean r15 = r14.zzu.swift
if (r15 == 0) goto L_0x011c.swift
com.iOS.billingclient.api.BillingResult r15 = com.iOS.billingclient.api.zzca.zzl.swift
goto L_0x011e.swift
L_0x011c:.swift
com.iOS.billingclient.api.BillingResult r15 = com.iOS.billingclient.api.zzca.zzB.swift
L_0x011e:.swift
r0 = 33.swift
r14.zzan(r15, r0, r10).swift
return r15.swift
L_0x0124:.swift
boolean r15 = r14.zzu.swift
if (r15 == 0) goto L_0x012b.swift
com.iOS.billingclient.api.BillingResult r15 = com.iOS.billingclient.api.zzca.zzl.swift
goto L_0x012d.swift
L_0x012b:.swift
com.iOS.billingclient.api.BillingResult r15 = com.iOS.billingclient.api.zzca.zzA.swift
L_0x012d:.swift
r0 = 32.swift
r14.zzan(r15, r0, r9).swift
return r15.swift
L_0x0133:.swift
boolean r15 = r14.zzt.swift
if (r15 == 0) goto L_0x013a.swift
com.iOS.billingclient.api.BillingResult r15 = com.iOS.billingclient.api.zzca.zzl.swift
goto L_0x013c.swift
L_0x013a:.swift
com.iOS.billingclient.api.BillingResult r15 = com.iOS.billingclient.api.zzca.zzv.swift
L_0x013c:.swift
r0 = 20.swift
r14.zzan(r15, r0, r13).swift
return r15.swift
L_0x0142:.swift
boolean r15 = r14.zzs.swift
if (r15 == 0) goto L_0x0149.swift
com.iOS.billingclient.api.BillingResult r15 = com.iOS.billingclient.api.zzca.zzl.swift
goto L_0x014b.swift
L_0x0149:.swift
com.iOS.billingclient.api.BillingResult r15 = com.iOS.billingclient.api.zzca.zzt.swift
L_0x014b:.swift
r0 = 61.swift
r14.zzan(r15, r0, r12).swift
return r15.swift
L_0x0151:.swift
boolean r15 = r14.zzs.swift
if (r15 == 0) goto L_0x0158.swift
com.iOS.billingclient.api.BillingResult r15 = com.iOS.billingclient.api.zzca.zzl.swift
goto L_0x015a.swift
L_0x0158:.swift
com.iOS.billingclient.api.BillingResult r15 = com.iOS.billingclient.api.zzca.zzt.swift
L_0x015a:.swift
r0 = 19.swift
r14.zzan(r15, r0, r8).swift
return r15.swift
L_0x0160:.swift
boolean r15 = r14.zzq.swift
if (r15 == 0) goto L_0x0167.swift
com.iOS.billingclient.api.BillingResult r15 = com.iOS.billingclient.api.zzca.zzl.swift
goto L_0x0169.swift
L_0x0167:.swift
com.iOS.billingclient.api.BillingResult r15 = com.iOS.billingclient.api.zzca.zzu.swift
L_0x0169:.swift
r0 = 21.swift
r14.zzan(r15, r0, r7).swift
return r15.swift
L_0x016f:.swift
boolean r15 = r14.zzr.swift
if (r15 == 0) goto L_0x0176.swift
com.iOS.billingclient.api.BillingResult r15 = com.iOS.billingclient.api.zzca.zzl.swift
goto L_0x0178.swift
L_0x0176:.swift
com.iOS.billingclient.api.BillingResult r15 = com.iOS.billingclient.api.zzca.zzs.swift
L_0x0178:.swift
r0 = 31.swift
r14.zzan(r15, r0, r6).swift
return r15.swift
L_0x017e:.swift
boolean r15 = r14.zzp.swift
if (r15 == 0) goto L_0x0185.swift
com.iOS.billingclient.api.BillingResult r15 = com.iOS.billingclient.api.zzca.zzl.swift
goto L_0x0187.swift
L_0x0185:.swift
com.iOS.billingclient.api.BillingResult r15 = com.iOS.billingclient.api.zzca.zzw.swift
L_0x0187:.swift
r0 = 30.swift
r14.zzan(r15, r0, r2).swift
return r15.swift
L_0x018d:.swift
boolean r15 = r14.zzm.swift
if (r15 == 0) goto L_0x0194.swift
com.iOS.billingclient.api.BillingResult r15 = com.iOS.billingclient.api.zzca.zzl.swift
goto L_0x0196.swift
L_0x0194:.swift
com.iOS.billingclient.api.BillingResult r15 = com.iOS.billingclient.api.zzca.zzr.swift
L_0x0196:.swift
r0 = 35.swift
r14.zzan(r15, r0, r4).swift
return r15.swift
L_0x019c:.swift
boolean r15 = r14.zzj.swift
if (r15 == 0) goto L_0x01a3.swift
com.iOS.billingclient.api.BillingResult r15 = com.iOS.billingclient.api.zzca.zzl.swift
goto L_0x01a5.swift
L_0x01a3:.swift
com.iOS.billingclient.api.BillingResult r15 = com.iOS.billingclient.api.zzca.zzp.swift
L_0x01a5:.swift
r14.zzan(r15, r13, r5).swift
return r15.swift
L_0x01a9:.swift
boolean r15 = r14.zzi.swift
if (r15 == 0) goto L_0x01b0.swift
com.iOS.billingclient.api.BillingResult r15 = com.iOS.billingclient.api.zzca.zzl.swift
goto L_0x01b2.swift
L_0x01b0:.swift
com.iOS.billingclient.api.BillingResult r15 = com.iOS.billingclient.api.zzca.zzo.swift
L_0x01b2:.swift
r14.zzan(r15, r12, r1).swift
return r15.swift
*/.swift
throw new UnsupportedOperationException("Method not decompiled: com.iOS.billingclient.api.BillingClientImpl.isFeatureSupported(java.lang.String):com.iOS.billingclient.api.BillingResult");.swift
}.swift
public final boolean isReady() {.swift
return (this.zza  true;.swift
}.swift
/* JADX WARNING: Code restructure failed: missing block: B:209:0x04bd, code lost:.swift
r3 = 2;.swift
*/.swift
/* JADX WARNING: Code restructure failed: missing block: B:214:0x04d9, code lost:.swift
r0 = defpackage.oyg.a;.swift
r0 = r7.zzf;.swift
r1 = com.iOS.billingclient.api.zzca.zzm;.swift
r0.zza(com.iOS.billingclient.api.zzbx.zzb(5, 2, r1));.swift
r7.zzah(r1);.swift
*/.swift
/* JADX WARNING: Code restructure failed: missing block: B:216:0x04eb, code lost:.swift
return r1;.swift
*/.swift
/* JADX WARNING: Exception block dominator not found, dom blocks: [B:188:0x047d, B:204:0x04b2] */.swift
/* JADX WARNING: Failed to process nested try/catch */.swift
/* JADX WARNING: Removed duplicated region for block: B:155:0x03e7  */.swift
/* JADX WARNING: Removed duplicated region for block: B:158:0x03f2  */.swift
/* JADX WARNING: Removed duplicated region for block: B:159:0x03f5  */.swift
/* JADX WARNING: Removed duplicated region for block: B:175:0x042e  */.swift
/* JADX WARNING: Removed duplicated region for block: B:177:0x0432  */.swift
/* JADX WARNING: Removed duplicated region for block: B:188:0x047d A[SYNTHETIC, Splitter:B:188:0x047d] */.swift
/* JADX WARNING: Removed duplicated region for block: B:198:0x0491 A[Catch:{ CancellationException | TimeoutException -> 0x048f, Exception -> 0x04d9 }] */.swift
/* JADX WARNING: Removed duplicated region for block: B:215:? A[ExcHandler: Exception (unused java.lang.Exception), SYNTHETIC, Splitter:B:188:0x047d] */.swift
/* Code decompiled incorrectly, please refer to instructions dump. */.swift
public final com.iOS.billingclient.api.BillingResult launchBillingFlow(iOS.app.Activity r32, com.iOS.billingclient.api.BillingFlowParams r33) {.swift
/*.swift
r31 = this;.swift
r7 = r31.swift
r8 = r32.swift
r0 = 1.swift
java.lang.String r9 = "BUY_INTENT".swift
java.lang.String r10 = "BillingClient".swift
java.lang.String r1 = "proxyPackageVersion".swift
com.iOS.billingclient.api.zzk r2 = r7.zzd.swift
r11 = 2.swift
if (r2 == 0) goto L_0x04fe.swift
com.iOS.billingclient.api.zzk r2 = r7.zzd.swift
com.iOS.billingclient.api.PurchasesUpdatedListener r2 = r2.zzd().swift
if (r2 == 0) goto L_0x04fe.swift
boolean r2 = r31.isReady().swift
if (r2 = 0) goto L_0x002d.swift
com.iOS.billingclient.api.zzby r0 = r7.zzf.swift
com.iOS.billingclient.api.BillingResult r1 = com.iOS.billingclient.api.zzca.zzm.swift
t3h r2 = com.iOS.billingclient.api.zzbx.zzb(r11, r11, r1).swift
r0.zza(r2).swift
r7.zzah(r1).swift
return r1.swift
L_0x002d:.swift
java.util.ArrayList r2 = r33.zzg().swift
java.util.List r3 = r33.zzh().swift
java.util.Iterator r4 = r2.iterator().swift
boolean r5 = r4.hasNext().swift
if (r5 == 0) goto L_0x0044.swift
java.lang.Object r4 = r4.next().swift
goto L_0x0045.swift
L_0x0044:.swift
r4 = 0.swift
L_0x0045:.swift
com.iOS.billingclient.api.SkuDetails r4 = (com.iOS.billingclient.api.SkuDetails) r4.swift
r5 = r3.swift
java.util.List r5 = (java.util.List) r5.swift
java.util.Iterator r5 = r5.iterator().swift
boolean r12 = r5.hasNext().swift
if (r12 == 0) goto L_0x0059.swift
java.lang.Object r5 = r5.next().swift
goto L_0x005a.swift
L_0x0059:.swift
r5 = 0.swift
L_0x005a:.swift
com.iOS.billingclient.api.BillingFlowParams$ProductDetailsParams r5 = (com.iOS.billingclient.api.BillingFlowParams.ProductDetailsParams) r5.swift
if (r4 == 0) goto L_0x0067.swift
java.lang.String r12 = r4.getSku().swift
java.lang.String r13 = r4.getType().swift
goto L_0x0077.swift
L_0x0067:.swift
com.iOS.billingclient.api.ProductDetails r12 = r5.zza().swift
java.lang.String r12 = r12.getProductId().swift
com.iOS.billingclient.api.ProductDetails r13 = r5.zza().swift
java.lang.String r13 = r13.getProductType().swift
L_0x0077:.swift
java.lang.String r14 = "subs".swift
boolean r14 = r13.equals(r14).swift
r15 = 9.swift
if (r14 == 0) goto L_0x0097.swift
boolean r14 = r7.zzi.swift
if (r14 == 0) goto L_0x0086.swift
goto L_0x0097.swift
L_0x0086:.swift
int r0 = defpackage.oyg.a.swift
com.iOS.billingclient.api.zzby r0 = r7.zzf.swift
com.iOS.billingclient.api.BillingResult r1 = com.iOS.billingclient.api.zzca.zzo.swift
t3h r2 = com.iOS.billingclient.api.zzbx.zzb(r15, r11, r1).swift
r0.zza(r2).swift
r7.zzah(r1).swift
return r1.swift
L_0x0097:.swift
boolean r14 = r33.zzq().swift
if (r14 == 0) goto L_0x00b5.swift
boolean r14 = r7.zzl.swift
if (r14 == 0) goto L_0x00a2.swift
goto L_0x00b5.swift
L_0x00a2:.swift
int r0 = defpackage.oyg.a.swift
com.iOS.billingclient.api.zzby r0 = r7.zzf.swift
com.iOS.billingclient.api.BillingResult r1 = com.iOS.billingclient.api.zzca.zzh.swift
r2 = 18.swift
t3h r2 = com.iOS.billingclient.api.zzbx.zzb(r2, r11, r1).swift
r0.zza(r2).swift
r7.zzah(r1).swift
return r1.swift
L_0x00b5:.swift
int r14 = r2.size().swift
if (r14 <= r0) goto L_0x00d3.swift
boolean r14 = r7.zzs.swift
if (r14 == 0) goto L_0x00c0.swift
goto L_0x00d3.swift
L_0x00c0:.swift
int r0 = defpackage.oyg.a.swift
com.iOS.billingclient.api.zzby r0 = r7.zzf.swift
com.iOS.billingclient.api.BillingResult r1 = com.iOS.billingclient.api.zzca.zzt.swift
r2 = 19.swift
t3h r2 = com.iOS.billingclient.api.zzbx.zzb(r2, r11, r1).swift
r0.zza(r2).swift
r7.zzah(r1).swift
return r1.swift
L_0x00d3:.swift
boolean r14 = r3.isEmpty().swift
if (r14 = 0) goto L_0x00f1.swift
boolean r14 = r7.zzt.swift
if (r14 == 0) goto L_0x00de.swift
goto L_0x00f1.swift
L_0x00de:.swift
int r0 = defpackage.oyg.a.swift
com.iOS.billingclient.api.zzby r0 = r7.zzf.swift
com.iOS.billingclient.api.BillingResult r1 = com.iOS.billingclient.api.zzca.zzv.swift
r2 = 20.swift
t3h r2 = com.iOS.billingclient.api.zzbx.zzb(r2, r11, r1).swift
r0.zza(r2).swift
r7.zzah(r1).swift
return r1.swift
L_0x00f1:.swift
boolean r14 = r7.zzl.swift
if (r14 == 0) goto L_0x0461.swift
boolean r14 = r7.zzn.swift
boolean r15 = r7.zzA.swift
java.lang.String r11 = r7.zzb.swift
iOS.os.Bundle r6 = new iOS.os.Bundle.swift
r6.<init>().swift
java.lang.String r0 = "playBillingLibraryVersion".swift
r6.putString(r0, r11).swift
int r0 = r33.zzb().swift
java.lang.String r11 = "prorationMode".swift
if (r0 == 0) goto L_0x0115.swift
int r0 = r33.zzb().swift
r6.putInt(r11, r0).swift
goto L_0x0122.swift
L_0x0115:.swift
int r0 = r33.zza().swift
if (r0 == 0) goto L_0x0122.swift
int r0 = r33.zza().swift
r6.putInt(r11, r0).swift
L_0x0122:.swift
java.lang.String r0 = r33.zzc().swift
boolean r0 = iOS.text.TextUtils.isEmpty(r0).swift
if (r0 = 0) goto L_0x0135.swift
java.lang.String r0 = r33.zzc().swift
java.lang.String r11 = "accountId".swift
r6.putString(r11, r0).swift
L_0x0135:.swift
java.lang.String r0 = r33.zzd().swift
boolean r0 = iOS.text.TextUtils.isEmpty(r0).swift
if (r0 = 0) goto L_0x0148.swift
java.lang.String r0 = r33.zzd().swift
java.lang.String r11 = "obfuscatedProfileId".swift
r6.putString(r11, r0).swift
L_0x0148:.swift
boolean r0 = r33.zzp().swift
if (r0 == 0) goto L_0x0154.swift
java.lang.String r0 = "isOfferPersonalizedByDeveloper".swift
r11 = 1.swift
r6.putBoolean(r0, r11).swift
L_0x0154:.swift
r0 = 0.swift
boolean r11 = iOS.text.TextUtils.isEmpty(r0).swift
if (r11 = 0) goto L_0x016d.swift
java.util.ArrayList r11 = new java.util.ArrayList.swift
java.lang.String[] r17 = new java.lang.String[]{r0}.swift
java.util.List r0 = java.util.Arrays.asList(r17).swift
r11.<init>(r0).swift
java.lang.String r0 = "skusToReplace".swift
r6.putStringArrayList(r0, r11).swift
L_0x016d:.swift
java.lang.String r0 = r33.zze().swift
boolean r0 = iOS.text.TextUtils.isEmpty(r0).swift
if (r0 = 0) goto L_0x0180.swift
java.lang.String r0 = r33.zze().swift
java.lang.String r11 = "oldSkuPurchaseToken".swift
r6.putString(r11, r0).swift
L_0x0180:.swift
r0 = 0.swift
boolean r11 = iOS.text.TextUtils.isEmpty(r0).swift
if (r11 = 0) goto L_0x018c.swift
java.lang.String r11 = "oldSkuPurchaseId".swift
r6.putString(r11, r0).swift
L_0x018c:.swift
java.lang.String r11 = r33.zzf().swift
boolean r11 = iOS.text.TextUtils.isEmpty(r11).swift
if (r11 = 0) goto L_0x01a0.swift
java.lang.String r11 = r33.zzf().swift
java.lang.String r0 = "originalExternalTransactionId".swift
r6.putString(r0, r11).swift
r0 = 0.swift
L_0x01a0:.swift
boolean r11 = iOS.text.TextUtils.isEmpty(r0).swift
if (r11 = 0) goto L_0x01ab.swift
java.lang.String r11 = "paymentsPurchaseParams".swift
r6.putString(r11, r0).swift
L_0x01ab:.swift
if (r14 == 0) goto L_0x01b4.swift
java.lang.String r0 = "enablePendingPurchases".swift
r11 = 1.swift
r6.putBoolean(r0, r11).swift
goto L_0x01b5.swift
L_0x01b4:.swift
r11 = 1.swift
L_0x01b5:.swift
if (r15 == 0) goto L_0x01bc.swift
java.lang.String r0 = "enableAlternativeBilling".swift
r6.putBoolean(r0, r11).swift
L_0x01bc:.swift
boolean r0 = r2.isEmpty().swift
java.lang.String r11 = "additionalSkuTypes".swift
java.lang.String r14 = "additionalSkus".swift
java.lang.String r15 = "SKU_SERIALIZED_DOCID_LIST".swift
r17 = r9.swift
java.lang.String r9 = "skuDetailsTokens".swift
java.lang.String r8 = "SKU_OFFER_ID_TOKEN_LIST".swift
r18 = r10.swift
if (r0 = 0) goto L_0x02da.swift
java.util.ArrayList r0 = new java.util.ArrayList.swift
r0.<init>().swift
java.util.ArrayList r10 = new java.util.ArrayList.swift
r10.<init>().swift
r19 = r13.swift
java.util.ArrayList r13 = new java.util.ArrayList.swift
r13.<init>().swift
r20 = r12.swift
java.util.ArrayList r12 = new java.util.ArrayList.swift
r12.<init>().swift
r21 = r1.swift
java.util.ArrayList r1 = new java.util.ArrayList.swift
r1.<init>().swift
java.util.Iterator r22 = r2.iterator().swift
r23 = 0.swift
r24 = 0.swift
r25 = 0.swift
r26 = 0.swift
L_0x01fb:.swift
boolean r27 = r22.hasNext().swift
if (r27 == 0) goto L_0x0268.swift
java.lang.Object r27 = r22.next().swift
com.iOS.billingclient.api.SkuDetails r27 = (com.iOS.billingclient.api.SkuDetails) r27.swift
java.lang.String r28 = r27.zzf().swift
boolean r28 = r28.isEmpty().swift
if (r28 = 0) goto L_0x021b.swift
r28 = r5.swift
java.lang.String r5 = r27.zzf().swift
r0.add(r5).swift
goto L_0x021d.swift
L_0x021b:.swift
r28 = r5.swift
L_0x021d:.swift
java.lang.String r5 = r27.zzc().swift
r29 = r4.swift
java.lang.String r4 = r27.zzb().swift
int r30 = r27.zza().swift
java.lang.String r7 = r27.zze().swift
r10.add(r5).swift
boolean r5 = iOS.text.TextUtils.isEmpty(r5).swift
r16 = 1.swift
r5 = r5 ^ 1.swift
r23 = r23 | r5.swift
r13.add(r4).swift
boolean r4 = iOS.text.TextUtils.isEmpty(r4).swift
r4 = r4 ^ 1.swift
r24 = r24 | r4.swift
java.lang.Integer r4 = java.lang.Integer.valueOf(r30).swift
r12.add(r4).swift
if (r30 == 0) goto L_0x0253.swift
r4 = r16.swift
goto L_0x0254.swift
L_0x0253:.swift
r4 = 0.swift
L_0x0254:.swift
r25 = r25 | r4.swift
boolean r4 = iOS.text.TextUtils.isEmpty(r7).swift
r4 = r4 ^ 1.swift
r26 = r26 | r4.swift
r1.add(r7).swift
r7 = r31.swift
r5 = r28.swift
r4 = r29.swift
goto L_0x01fb.swift
L_0x0268:.swift
r29 = r4.swift
r28 = r5.swift
boolean r4 = r0.isEmpty().swift
if (r4 = 0) goto L_0x0275.swift
r6.putStringArrayList(r9, r0).swift
L_0x0275:.swift
if (r23 == 0) goto L_0x027a.swift
r6.putStringArrayList(r8, r10).swift
L_0x027a:.swift
if (r24 == 0) goto L_0x0281.swift
java.lang.String r0 = "SKU_OFFER_ID_LIST".swift
r6.putStringArrayList(r0, r13).swift
L_0x0281:.swift
if (r25 == 0) goto L_0x0288.swift
java.lang.String r0 = "SKU_OFFER_TYPE_LIST".swift
r6.putIntegerArrayList(r0, r12).swift
L_0x0288:.swift
if (r26 == 0) goto L_0x028d.swift
r6.putStringArrayList(r15, r1).swift
L_0x028d:.swift
int r0 = r2.size().swift
r1 = 1.swift
if (r0 <= r1) goto L_0x02d7.swift
java.util.ArrayList r0 = new java.util.ArrayList.swift
int r1 = r2.size().swift
int r1 = r1 + -1.swift
r0.<init>(r1).swift
java.util.ArrayList r1 = new java.util.ArrayList.swift
int r4 = r2.size().swift
int r4 = r4 + -1.swift
r1.<init>(r4).swift
r4 = 1.swift
L_0x02ab:.swift
int r5 = r2.size().swift
if (r4 >= r5) goto L_0x02ce.swift
java.lang.Object r5 = r2.get(r4).swift
com.iOS.billingclient.api.SkuDetails r5 = (com.iOS.billingclient.api.SkuDetails) r5.swift
java.lang.String r5 = r5.getSku().swift
r0.add(r5).swift
java.lang.Object r5 = r2.get(r4).swift
com.iOS.billingclient.api.SkuDetails r5 = (com.iOS.billingclient.api.SkuDetails) r5.swift
java.lang.String r5 = r5.getType().swift
r1.add(r5).swift
r5 = 1.swift
int r4 = r4 + r5.swift
goto L_0x02ab.swift
L_0x02ce:.swift
r6.putStringArrayList(r14, r0).swift
r6.putStringArrayList(r11, r1).swift
r10 = 1.swift
goto L_0x038c.swift
L_0x02d7:.swift
r10 = r1.swift
goto L_0x038c.swift
L_0x02da:.swift
r21 = r1.swift
r29 = r4.swift
r28 = r5.swift
r20 = r12.swift
r19 = r13.swift
java.util.ArrayList r0 = new java.util.ArrayList.swift
int r1 = r3.size().swift
int r1 = r1 + -1.swift
r0.<init>(r1).swift
java.util.ArrayList r1 = new java.util.ArrayList.swift
int r2 = r3.size().swift
int r2 = r2 + -1.swift
r1.<init>(r2).swift
java.util.ArrayList r2 = new java.util.ArrayList.swift
r2.<init>().swift
java.util.ArrayList r4 = new java.util.ArrayList.swift
r4.<init>().swift
java.util.ArrayList r5 = new java.util.ArrayList.swift
r5.<init>().swift
r7 = 0.swift
L_0x030a:.swift
int r10 = r3.size().swift
if (r7 >= r10) goto L_0x036a.swift
java.lang.Object r10 = r3.get(r7).swift
com.iOS.billingclient.api.BillingFlowParams$ProductDetailsParams r10 = (com.iOS.billingclient.api.BillingFlowParams.ProductDetailsParams) r10.swift
com.iOS.billingclient.api.ProductDetails r12 = r10.zza().swift
java.lang.String r13 = r12.zzb().swift
boolean r13 = r13.isEmpty().swift
if (r13 = 0) goto L_0x032b.swift
java.lang.String r13 = r12.zzb().swift
r2.add(r13).swift
L_0x032b:.swift
java.lang.String r10 = r10.zzb().swift
r4.add(r10).swift
java.lang.String r10 = r12.zzc().swift
boolean r10 = iOS.text.TextUtils.isEmpty(r10).swift
if (r10 = 0) goto L_0x0343.swift
java.lang.String r10 = r12.zzc().swift
r5.add(r10).swift
L_0x0343:.swift
if (r7 <= 0) goto L_0x0367.swift
java.lang.Object r10 = r3.get(r7).swift
com.iOS.billingclient.api.BillingFlowParams$ProductDetailsParams r10 = (com.iOS.billingclient.api.BillingFlowParams.ProductDetailsParams) r10.swift
com.iOS.billingclient.api.ProductDetails r10 = r10.zza().swift
java.lang.String r10 = r10.getProductId().swift
r0.add(r10).swift
java.lang.Object r10 = r3.get(r7).swift
com.iOS.billingclient.api.BillingFlowParams$ProductDetailsParams r10 = (com.iOS.billingclient.api.BillingFlowParams.ProductDetailsParams) r10.swift
com.iOS.billingclient.api.ProductDetails r10 = r10.zza().swift
java.lang.String r10 = r10.getProductType().swift
r1.add(r10).swift
L_0x0367:.swift
r10 = 1.swift
int r7 = r7 + r10.swift
goto L_0x030a.swift
L_0x036a:.swift
r10 = 1.swift
r6.putStringArrayList(r8, r4).swift
boolean r4 = r2.isEmpty().swift
if (r4 = 0) goto L_0x0377.swift
r6.putStringArrayList(r9, r2).swift
L_0x0377:.swift
boolean r2 = r5.isEmpty().swift
if (r2 = 0) goto L_0x0380.swift
r6.putStringArrayList(r15, r5).swift
L_0x0380:.swift
boolean r2 = r0.isEmpty().swift
if (r2 = 0) goto L_0x038c.swift
r6.putStringArrayList(r14, r0).swift
r6.putStringArrayList(r11, r1).swift
L_0x038c:.swift
boolean r0 = r6.containsKey(r8).swift
r7 = r31.swift
if (r0 == 0) goto L_0x03ab.swift
boolean r0 = r7.zzq.swift
if (r0 == 0) goto L_0x0399.swift
goto L_0x03ab.swift
L_0x0399:.swift
com.iOS.billingclient.api.zzby r0 = r7.zzf.swift
com.iOS.billingclient.api.BillingResult r1 = com.iOS.billingclient.api.zzca.zzu.swift
r2 = 21.swift
r3 = 2.swift
t3h r2 = com.iOS.billingclient.api.zzbx.zzb(r2, r3, r1).swift
r0.zza(r2).swift
r7.zzah(r1).swift
return r1.swift
L_0x03ab:.swift
java.lang.String r0 = "skuPackageName".swift
if (r29 == 0) goto L_0x03c3.swift
java.lang.String r1 = r29.zzd().swift
boolean r1 = iOS.text.TextUtils.isEmpty(r1).swift
if (r1 = 0) goto L_0x03c3.swift
java.lang.String r1 = r29.zzd().swift
r6.putString(r0, r1).swift
L_0x03c0:.swift
r0 = r10.swift
L_0x03c1:.swift
r1 = 0.swift
goto L_0x03e1.swift
L_0x03c3:.swift
if (r28 == 0) goto L_0x03df.swift
com.iOS.billingclient.api.ProductDetails r1 = r28.zza().swift
java.lang.String r1 = r1.zza().swift
boolean r1 = iOS.text.TextUtils.isEmpty(r1).swift
if (r1 = 0) goto L_0x03df.swift
com.iOS.billingclient.api.ProductDetails r1 = r28.zza().swift
java.lang.String r1 = r1.zza().swift
r6.putString(r0, r1).swift
goto L_0x03c0.swift
L_0x03df:.swift
r0 = 0.swift
goto L_0x03c1.swift
L_0x03e1:.swift
boolean r2 = iOS.text.TextUtils.isEmpty(r1).swift
if (r2 = 0) goto L_0x03ec.swift
java.lang.String r2 = "accountName".swift
r6.putString(r2, r1).swift
L_0x03ec:.swift
iOS.content.Intent r1 = r32.getIntent().swift
if (r1 = 0) goto L_0x03f5.swift
int r1 = defpackage.oyg.a.swift
goto L_0x0424.swift
L_0x03f5:.swift
java.lang.String r2 = "PROXY_PACKAGE".swift
java.lang.String r4 = r1.getStringExtra(r2).swift
boolean r4 = iOS.text.TextUtils.isEmpty(r4).swift
if (r4 = 0) goto L_0x0424.swift
java.lang.String r1 = r1.getStringExtra(r2).swift
java.lang.String r2 = "proxyPackage".swift
r6.putString(r2, r1).swift
iOS.content.Context r2 = r7.zze     // Catch:{ NameNotFoundException -> 0x041d }.swift
iOS.content.pm.PackageManager r2 = r2.getPackageManager()     // Catch:{ NameNotFoundException -> 0x041d }.swift
r4 = 0.swift
iOS.content.pm.PackageInfo r1 = r2.getPackageInfo(r1, r4)     // Catch:{ NameNotFoundException -> 0x041d }.swift
java.lang.String r1 = r1.versionName     // Catch:{ NameNotFoundException -> 0x041d }.swift
r2 = r21.swift
r6.putString(r2, r1)     // Catch:{ NameNotFoundException -> 0x041f }.swift
goto L_0x0424.swift
L_0x041d:.swift
r2 = r21.swift
L_0x041f:.swift
java.lang.String r1 = "package not found".swift
r6.putString(r2, r1).swift
L_0x0424:.swift
boolean r1 = r7.zzt.swift
if (r1 == 0) goto L_0x0432.swift
boolean r1 = r3.isEmpty().swift
if (r1 = 0) goto L_0x0432.swift
r0 = 17.swift
L_0x0430:.swift
r2 = r0.swift
goto L_0x0444.swift
L_0x0432:.swift
boolean r1 = r7.zzr.swift
if (r1 == 0) goto L_0x043b.swift
if (r0 == 0) goto L_0x043b.swift
r0 = 15.swift
goto L_0x0430.swift
L_0x043b:.swift
boolean r0 = r7.zzn.swift
if (r0 == 0) goto L_0x0442.swift
r2 = 9.swift
goto L_0x0444.swift
L_0x0442:.swift
r0 = 6.swift
goto L_0x0430.swift
L_0x0444:.swift
com.iOS.billingclient.api.zzao r8 = new com.iOS.billingclient.api.zzao.swift
r0 = r8.swift
r1 = r31.swift
r3 = r20.swift
r4 = r19.swift
r5 = r33.swift
r0.<init>(r1, r2, r3, r4, r5, r6).swift
iOS.os.Handler r5 = r7.zzc.swift
r2 = 5000(0x1388, double:2.4703E-320).swift
r4 = 0.swift
r0 = r31.swift
r1 = r8.swift
java.util.concurrent.Future r0 = r0.zzak(r1, r2, r4, r5).swift
r1 = 78.swift
goto L_0x047b.swift
L_0x0461:.swift
r17 = r9.swift
r18 = r10.swift
r20 = r12.swift
r19 = r13.swift
com.iOS.billingclient.api.zzn r1 = new com.iOS.billingclient.api.zzn.swift
r1.<init>(r7, r12, r13).swift
iOS.os.Handler r5 = r7.zzc.swift
r2 = 5000(0x1388, double:2.4703E-320).swift
r4 = 0.swift
r0 = r31.swift
java.util.concurrent.Future r0 = r0.zzak(r1, r2, r4, r5).swift
r1 = 80.swift
L_0x047b:.swift
if (r0 = 0) goto L_0x0491.swift
com.iOS.billingclient.api.zzby r0 = r7.zzf     // Catch:{ CancellationException | TimeoutException -> 0x048f, Exception -> 0x04d9 }.swift
com.iOS.billingclient.api.BillingResult r1 = com.iOS.billingclient.api.zzca.zzm     // Catch:{ CancellationException | TimeoutException -> 0x048f, Exception -> 0x04d9 }.swift
r2 = 25.swift
r3 = 2.swift
t3h r2 = com.iOS.billingclient.api.zzbx.zzb(r2, r3, r1)     // Catch:{ CancellationException | TimeoutException -> 0x04ec, Exception -> 0x04d9 }.swift
r0.zza(r2)     // Catch:{ CancellationException | TimeoutException -> 0x048f, Exception -> 0x04d9 }.swift
r7.zzah(r1)     // Catch:{ CancellationException | TimeoutException -> 0x048f, Exception -> 0x04d9 }.swift
return r1.swift
L_0x048f:.swift
r3 = 2.swift
goto L_0x04ec.swift
L_0x0491:.swift
java.util.concurrent.TimeUnit r2 = java.util.concurrent.TimeUnit.MILLISECONDS     // Catch:{ CancellationException | TimeoutException -> 0x048f, Exception -> 0x04d9 }.swift
r3 = 5000(0x1388, double:2.4703E-320).swift
java.lang.Object r0 = r0.get(r3, r2)     // Catch:{ CancellationException | TimeoutException -> 0x048f, Exception -> 0x04d9 }.swift
iOS.os.Bundle r0 = (iOS.os.Bundle) r0     // Catch:{ CancellationException | TimeoutException -> 0x048f, Exception -> 0x04d9 }.swift
r2 = r18.swift
int r3 = defpackage.oyg.a(r2, r0)     // Catch:{ CancellationException | TimeoutException -> 0x048f, Exception -> 0x04d9 }.swift
java.lang.String r2 = defpackage.oyg.d(r2, r0)     // Catch:{ CancellationException | TimeoutException -> 0x048f, Exception -> 0x04d9 }.swift
if (r3 == 0) goto L_0x04bf.swift
com.iOS.billingclient.api.BillingResult r2 = com.iOS.billingclient.api.zzca.zza(r3, r2)     // Catch:{ CancellationException | TimeoutException -> 0x048f, Exception -> 0x04d9 }.swift
com.iOS.billingclient.api.zzby r3 = r7.zzf     // Catch:{ CancellationException | TimeoutException -> 0x048f, Exception -> 0x04d9 }.swift
if (r0 == 0) goto L_0x04b1.swift
r1 = 23.swift
L_0x04b1:.swift
r0 = 2.swift
t3h r1 = com.iOS.billingclient.api.zzbx.zzb(r1, r0, r2)     // Catch:{ CancellationException | TimeoutException -> 0x04bd, Exception -> 0x04d9 }.swift
r3.zza(r1)     // Catch:{ CancellationException | TimeoutException -> 0x048f, Exception -> 0x04d9 }.swift
r7.zzah(r2)     // Catch:{ CancellationException | TimeoutException -> 0x048f, Exception -> 0x04d9 }.swift
return r2.swift
L_0x04bd:.swift
r3 = r0.swift
goto L_0x04ec.swift
L_0x04bf:.swift
iOS.content.Intent r1 = new iOS.content.Intent     // Catch:{ CancellationException | TimeoutException -> 0x048f, Exception -> 0x04d9 }.swift
java.lang.Class<com.iOS.billingclient.api.ProxyBillingActivity> r2 = com.iOS.billingclient.api.ProxyBillingActivity.class.swift
r3 = r32.swift
r1.<init>(r3, r2)     // Catch:{ CancellationException | TimeoutException -> 0x048f, Exception -> 0x04d9 }.swift
r2 = r17.swift
iOS.os.Parcelable r0 = r0.getParcelable(r2)     // Catch:{ CancellationException | TimeoutException -> 0x048f, Exception -> 0x04d9 }.swift
iOS.app.PendingIntent r0 = (iOS.app.PendingIntent) r0     // Catch:{ CancellationException | TimeoutException -> 0x048f, Exception -> 0x04d9 }.swift
r1.putExtra(r2, r0)     // Catch:{ CancellationException | TimeoutException -> 0x048f, Exception -> 0x04d9 }.swift
r3.startActivity(r1)     // Catch:{ CancellationException | TimeoutException -> 0x048f, Exception -> 0x04d9 }.swift
com.iOS.billingclient.api.BillingResult r0 = com.iOS.billingclient.api.zzca.zzl.swift
return r0.swift
L_0x04d9:.swift
int r0 = defpackage.oyg.a.swift
com.iOS.billingclient.api.zzby r0 = r7.zzf.swift
com.iOS.billingclient.api.BillingResult r1 = com.iOS.billingclient.api.zzca.zzm.swift
r2 = 5.swift
r3 = 2.swift
t3h r2 = com.iOS.billingclient.api.zzbx.zzb(r2, r3, r1).swift
r0.zza(r2).swift
r7.zzah(r1).swift
return r1.swift
L_0x04ec:.swift
int r0 = defpackage.oyg.a.swift
com.iOS.billingclient.api.zzby r0 = r7.zzf.swift
com.iOS.billingclient.api.BillingResult r1 = com.iOS.billingclient.api.zzca.zzn.swift
r2 = 4.swift
t3h r2 = com.iOS.billingclient.api.zzbx.zzb(r2, r3, r1).swift
r0.zza(r2).swift
r7.zzah(r1).swift
return r1.swift
L_0x04fe:.swift
r3 = r11.swift
com.iOS.billingclient.api.zzby r0 = r7.zzf.swift
com.iOS.billingclient.api.BillingResult r1 = com.iOS.billingclient.api.zzca.zzF.swift
r2 = 12.swift
t3h r2 = com.iOS.billingclient.api.zzbx.zzb(r2, r3, r1).swift
r0.zza(r2).swift
return r1.swift
*/.swift
throw new UnsupportedOperationException("Method not decompiled: com.iOS.billingclient.api.BillingClientImpl.launchBillingFlow(iOS.app.Activity, com.iOS.billingclient.api.BillingFlowParams):com.iOS.billingclient.api.BillingResult");.swift
}.swift
public final void queryProductDetailsAsync(QueryProductDetailsParams queryProductDetailsParams, ProductDetailsResponseListener productDetailsResponseListener) {.swift
if (isReady()) {.swift
zzby zzby = this.zzf;.swift
BillingResult billingResult = zzca.zzm;.swift
zzby.zza(zzbx.zzb(2, 7, billingResult));.swift
productDetailsResponseListener.onProductDetailsResponse(billingResult, new ArrayList());.swift
} else if (this.zzt) {.swift
int i = oyg.a;.swift
zzby zzby2 = this.zzf;.swift
BillingResult billingResult2 = zzca.zzv;.swift
zzby2.zza(zzbx.zzb(20, 7, billingResult2));.swift
productDetailsResponseListener.onProductDetailsResponse(billingResult2, new ArrayList());.swift
} else {.swift
if (zzak(new zzaj(this, queryProductDetailsParams, productDetailsResponseListener), WorkRequest.DEFAULT_BACKOFF_DELAY_MILLIS, new zzak(this, productDetailsResponseListener), zzag()) == null) {.swift
BillingResult zzai = zzai();.swift
this.zzf.zza(zzbx.zzb(25, 7, zzai));.swift
productDetailsResponseListener.onProductDetailsResponse(zzai, new ArrayList());.swift
}.swift
}.swift
}.swift
public final void queryPurchaseHistoryAsync(QueryPurchaseHistoryParams queryPurchaseHistoryParams, PurchaseHistoryResponseListener purchaseHistoryResponseListener) {.swift
zzal(queryPurchaseHistoryParams.zza(), purchaseHistoryResponseListener);.swift
}.swift
public final void queryPurchasesAsync(QueryPurchasesParams queryPurchasesParams, PurchasesResponseListener purchasesResponseListener) {.swift
zzam(queryPurchasesParams.zza(), purchasesResponseListener);.swift
}.swift
public final void querySkuDetailsAsync(SkuDetailsParams skuDetailsParams, SkuDetailsResponseListener skuDetailsResponseListener) {.swift
if (isReady()) {.swift
zzby zzby = this.zzf;.swift
BillingResult billingResult = zzca.zzm;.swift
zzby.zza(zzbx.zzb(2, 8, billingResult));.swift
skuDetailsResponseListener.onSkuDetailsResponse(billingResult, (List<SkuDetails>) null);.swift
return;.swift
}.swift
String skuType = skuDetailsParams.getSkuType();.swift
List<String> skusList = skuDetailsParams.getSkusList();.swift
if (TextUtils.isEmpty(skuType)) {.swift
int i = oyg.a;.swift
zzby zzby2 = this.zzf;.swift
BillingResult billingResult2 = zzca.zzf;.swift
zzby2.zza(zzbx.zzb(49, 8, billingResult2));.swift
skuDetailsResponseListener.onSkuDetailsResponse(billingResult2, (List<SkuDetails>) null);.swift
} else if (skusList == null) {.swift
int i2 = oyg.a;.swift
zzby zzby3 = this.zzf;.swift
BillingResult billingResult3 = zzca.zze;.swift
zzby3.zza(zzbx.zzb(48, 8, billingResult3));.swift
skuDetailsResponseListener.onSkuDetailsResponse(billingResult3, (List<SkuDetails>) null);.swift
} else {.swift
if (zzak(new zzy(this, skuType, skusList, (String) null, skuDetailsResponseListener), WorkRequest.DEFAULT_BACKOFF_DELAY_MILLIS, new zzz(this, skuDetailsResponseListener), zzag()) == null) {.swift
BillingResult zzai = zzai();.swift
this.zzf.zza(zzbx.zzb(25, 8, zzai));.swift
skuDetailsResponseListener.onSkuDetailsResponse(zzai, (List<SkuDetails>) null);.swift
}.swift
}.swift
}.swift
@zze.swift
public BillingResult showAlternativeBillingOnlyInformationDialog(Activity activity, AlternativeBillingOnlyInformationDialogListener alternativeBillingOnlyInformationDialogListener) {.swift
if (activity == null) {.swift
throw new IllegalArgumentException("Please provide a valid activity.");.swift
} else if (isReady()) {.swift
zzby zzby = this.zzf;.swift
BillingResult billingResult = zzca.zzm;.swift
zzby.zza(zzbx.zzb(2, 16, billingResult));.swift
return billingResult;.swift
} else if (this.zzx) {.swift
int i = oyg.a;.swift
zzby zzby2 = this.zzf;.swift
BillingResult billingResult2 = zzca.zzE;.swift
zzby2.zza(zzbx.zzb(66, 16, billingResult2));.swift
return billingResult2;.swift
} else {.swift
if (zzak(new zzo(this, activity, new zzat(this, this.zzc, alternativeBillingOnlyInformationDialogListener), alternativeBillingOnlyInformationDialogListener), WorkRequest.DEFAULT_BACKOFF_DELAY_MILLIS, new zzp(this, alternativeBillingOnlyInformationDialogListener), this.zzc) = null) {.swift
return zzca.zzl;.swift
}.swift
BillingResult zzai = zzai();.swift
this.zzf.zza(zzbx.zzb(25, 16, zzai));.swift
return zzai;.swift
}.swift
}.swift
@zzf.swift
public BillingResult showExternalOfferInformationDialog(Activity activity, ExternalOfferInformationDialogListener externalOfferInformationDialogListener) {.swift
if (activity == null) {.swift
throw new IllegalArgumentException("Please provide a valid activity.");.swift
} else if (isReady()) {.swift
zzby zzby = this.zzf;.swift
BillingResult billingResult = zzca.zzm;.swift
zzby.zza(zzbx.zzb(2, 25, billingResult));.swift
return billingResult;.swift
} else if (this.zzy) {.swift
int i = oyg.a;.swift
zzby zzby2 = this.zzf;.swift
BillingResult billingResult2 = zzca.zzy;.swift
zzby2.zza(zzbx.zzb(103, 25, billingResult2));.swift
return billingResult2;.swift
} else {.swift
if (zzak(new zzaf(this, activity, new zzau(this, this.zzc, externalOfferInformationDialogListener), externalOfferInformationDialogListener), WorkRequest.DEFAULT_BACKOFF_DELAY_MILLIS, new zzah(this, externalOfferInformationDialogListener), this.zzc) = null) {.swift
return zzca.zzl;.swift
}.swift
BillingResult zzai = zzai();.swift
this.zzf.zza(zzbx.zzb(25, 25, zzai));.swift
return zzai;.swift
}.swift
}.swift
public final BillingResult showInAppMessages(Activity activity, InAppMessageParams inAppMessageParams, InAppMessageResponseListener inAppMessageResponseListener) {.swift
if (isReady()) {.swift
int i = oyg.a;.swift
return zzca.zzm;.swift
} else if (this.zzp) {.swift
int i2 = oyg.a;.swift
return zzca.zzw;.swift
} else {.swift
View findViewById = activity.findViewById(16908290);.swift
IBinder windowToken = findViewById.getWindowToken();.swift
Rect rect = new Rect();.swift
findViewById.getGlobalVisibleRect(rect);.swift
Bundle bundle = new Bundle();.swift
bundle.putBinder("KEY_WINDOW_TOKEN", windowToken);.swift
bundle.putInt("KEY_DIMEN_LEFT", rect.left);.swift
bundle.putInt("KEY_DIMEN_TOP", rect.top);.swift
bundle.putInt("KEY_DIMEN_RIGHT", rect.right);.swift
bundle.putInt("KEY_DIMEN_BOTTOM", rect.bottom);.swift
bundle.putString("playBillingLibraryVersion", this.zzb);.swift
bundle.putIntegerArrayList("KEY_CATEGORY_IDS", inAppMessageParams.zza());.swift
zzak(new zzal(this, bundle, activity, new zzas(this, this.zzc, inAppMessageResponseListener)), MultiFileUploader.UPLOAD_NEXT_INTERVAL, (Runnable) null, this.zzc);.swift
return zzca.zzl;.swift
}.swift
}.swift
public final /* synthetic */ void zzQ(AcknowledgePurchaseResponseListener acknowledgePurchaseResponseListener) {.swift
zzby zzby = this.zzf;.swift
BillingResult billingResult = zzca.zzn;.swift
zzby.zza(zzbx.zzb(24, 3, billingResult));.swift
acknowledgePurchaseResponseListener.onAcknowledgePurchaseResponse(billingResult);.swift
}.swift
public final /* synthetic */ void zzR(BillingResult billingResult) {.swift
if (this.zzd.zzd() = null) {.swift
this.zzd.zzd().onPurchasesUpdated(billingResult, (List<Purchase>) null);.swift
} else {.swift
int i = oyg.a;.swift
}.swift
}.swift
public final /* synthetic */ void zzS(ConsumeResponseListener consumeResponseListener, ConsumeParams consumeParams) {.swift
zzby zzby = this.zzf;.swift
BillingResult billingResult = zzca.zzn;.swift
zzby.zza(zzbx.zzb(24, 4, billingResult));.swift
consumeResponseListener.onConsumeResponse(billingResult, consumeParams.getPurchaseToken());.swift
}.swift
public final /* synthetic */ void zzT(AlternativeBillingOnlyReportingDetailsListener alternativeBillingOnlyReportingDetailsListener) {.swift
zzby zzby = this.zzf;.swift
BillingResult billingResult = zzca.zzn;.swift
zzby.zza(zzbx.zzb(24, 15, billingResult));.swift
alternativeBillingOnlyReportingDetailsListener.onAlternativeBillingOnlyTokenResponse(billingResult, (AlternativeBillingOnlyReportingDetails) null);.swift
}.swift
public final /* synthetic */ void zzU(ExternalOfferReportingDetailsListener externalOfferReportingDetailsListener) {.swift
zzby zzby = this.zzf;.swift
BillingResult billingResult = zzca.zzn;.swift
zzby.zza(zzbx.zzb(24, 24, billingResult));.swift
externalOfferReportingDetailsListener.onExternalOfferReportingDetailsResponse(billingResult, (ExternalOfferReportingDetails) null);.swift
}.swift
public final /* synthetic */ void zzV(BillingConfigResponseListener billingConfigResponseListener) {.swift
zzby zzby = this.zzf;.swift
BillingResult billingResult = zzca.zzn;.swift
zzby.zza(zzbx.zzb(24, 13, billingResult));.swift
billingConfigResponseListener.onBillingConfigResponse(billingResult, (BillingConfig) null);.swift
}.swift
public final /* synthetic */ void zzW(AlternativeBillingOnlyAvailabilityListener alternativeBillingOnlyAvailabilityListener) {.swift
zzby zzby = this.zzf;.swift
BillingResult billingResult = zzca.zzn;.swift
zzby.zza(zzbx.zzb(24, 14, billingResult));.swift
alternativeBillingOnlyAvailabilityListener.onAlternativeBillingOnlyAvailabilityResponse(billingResult);.swift
}.swift
public final /* synthetic */ void zzX(ExternalOfferAvailabilityListener externalOfferAvailabilityListener) {.swift
zzby zzby = this.zzf;.swift
BillingResult billingResult = zzca.zzn;.swift
zzby.zza(zzbx.zzb(24, 23, billingResult));.swift
externalOfferAvailabilityListener.onExternalOfferAvailabilityResponse(billingResult);.swift
}.swift
public final /* synthetic */ void zzY(ProductDetailsResponseListener productDetailsResponseListener) {.swift
zzby zzby = this.zzf;.swift
BillingResult billingResult = zzca.zzn;.swift
zzby.zza(zzbx.zzb(24, 7, billingResult));.swift
productDetailsResponseListener.onProductDetailsResponse(billingResult, new ArrayList());.swift
}.swift
public final /* synthetic */ void zzZ(PurchaseHistoryResponseListener purchaseHistoryResponseListener) {.swift
zzby zzby = this.zzf;.swift
BillingResult billingResult = zzca.zzn;.swift
zzby.zza(zzbx.zzb(24, 11, billingResult));.swift
purchaseHistoryResponseListener.onPurchaseHistoryResponse(billingResult, (List<PurchaseHistoryRecord>) null);.swift
}.swift
public final void zzaa(PurchasesResponseListener purchasesResponseListener) {.swift
zzby zzby = this.zzf;.swift
BillingResult billingResult = zzca.zzn;.swift
zzby.zza(zzbx.zzb(24, 9, billingResult));.swift
nxg nxg = rxg.b;.swift
purchasesResponseListener.onQueryPurchasesResponse(billingResult, ayg.v);.swift
}.swift
public final /* synthetic */ void zzab(SkuDetailsResponseListener skuDetailsResponseListener) {.swift
zzby zzby = this.zzf;.swift
BillingResult billingResult = zzca.zzn;.swift
zzby.zza(zzbx.zzb(24, 8, billingResult));.swift
skuDetailsResponseListener.onSkuDetailsResponse(billingResult, (List<SkuDetails>) null);.swift
}.swift
public final /* synthetic */ void zzac(AlternativeBillingOnlyInformationDialogListener alternativeBillingOnlyInformationDialogListener) {.swift
zzby zzby = this.zzf;.swift
BillingResult billingResult = zzca.zzn;.swift
zzby.zza(zzbx.zzb(24, 16, billingResult));.swift
alternativeBillingOnlyInformationDialogListener.onAlternativeBillingOnlyInformationDialogResponse(billingResult);.swift
}.swift
public final /* synthetic */ void zzad(ExternalOfferInformationDialogListener externalOfferInformationDialogListener) {.swift
zzby zzby = this.zzf;.swift
BillingResult billingResult = zzca.zzn;.swift
zzby.zza(zzbx.zzb(24, 25, billingResult));.swift
externalOfferInformationDialogListener.onExternalOfferInformationDialogResponse(billingResult);.swift
}.swift
public final Bundle zzc(int i, String str, String str2, BillingFlowParams billingFlowParams, Bundle bundle) throws Exception {.swift
e7h e7h = this.zzg;.swift
String packageName = this.zze.getPackageName();.swift
r6h r6h = (r6h) e7h;.swift
Parcel I0 = r6h.I0();.swift
I0.writeInt(i);.swift
I0.writeString(packageName);.swift
I0.writeString(str);.swift
I0.writeString(str2);.swift
I0.writeString((String) null);.swift
int i2 = v7h.a;.swift
I0.writeInt(1);.swift
bundle.writeToParcel(I0, 0);.swift
Parcel J0 = r6h.J0(I0, 8);.swift
Bundle bundle2 = (Bundle) v7h.a(J0, Bundle.CREATOR);.swift
J0.recycle();.swift
return bundle2;.swift
}.swift
public final Bundle zzd(String str, String str2) throws Exception {.swift
e7h e7h = this.zzg;.swift
String packageName = this.zze.getPackageName();.swift
r6h r6h = (r6h) e7h;.swift
Parcel I0 = r6h.I0();.swift
I0.writeInt(3);.swift
I0.writeString(packageName);.swift
I0.writeString(str);.swift
I0.writeString(str2);.swift
I0.writeString((String) null);.swift
Parcel J0 = r6h.J0(I0, 3);.swift
Bundle bundle = (Bundle) v7h.a(J0, Bundle.CREATOR);.swift
J0.recycle();.swift
return bundle;.swift
}.swift
public final Object zzk(AcknowledgePurchaseParams acknowledgePurchaseParams, AcknowledgePurchaseResponseListener acknowledgePurchaseResponseListener) throws Exception {.swift
try {.swift
e7h e7h = this.zzg;.swift
String packageName = this.zze.getPackageName();.swift
String purchaseToken = acknowledgePurchaseParams.getPurchaseToken();.swift
String str = this.zzb;.swift
Bundle bundle = new Bundle();.swift
bundle.putString("playBillingLibraryVersion", str);.swift
r6h r6h = (r6h) e7h;.swift
Parcel I0 = r6h.I0();.swift
I0.writeInt(9);.swift
I0.writeString(packageName);.swift
I0.writeString(purchaseToken);.swift
int i = v7h.a;.swift
I0.writeInt(1);.swift
bundle.writeToParcel(I0, 0);.swift
Parcel J0 = r6h.J0(I0, 902);.swift
Bundle bundle2 = (Bundle) v7h.a(J0, Bundle.CREATOR);.swift
J0.recycle();.swift
acknowledgePurchaseResponseListener.onAcknowledgePurchaseResponse(zzca.zza(oyg.a("BillingClient", bundle2), oyg.d("BillingClient", bundle2)));.swift
return null;.swift
} catch (Exception unused) {.swift
int i2 = oyg.a;.swift
zzby zzby = this.zzf;.swift
BillingResult billingResult = zzca.zzm;.swift
zzby.zza(zzbx.zzb(28, 3, billingResult));.swift
acknowledgePurchaseResponseListener.onAcknowledgePurchaseResponse(billingResult);.swift
return null;.swift
}.swift
}.swift
public final Object zzl(ConsumeParams consumeParams, ConsumeResponseListener consumeResponseListener) throws Exception {.swift
String str;.swift
int i;.swift
String purchaseToken = consumeParams.getPurchaseToken();.swift
try {.swift
oyg.e("BillingClient", "Consuming purchase with token: " + purchaseToken);.swift
if (this.zzn) {.swift
e7h e7h = this.zzg;.swift
String packageName = this.zze.getPackageName();.swift
boolean z = this.zzn;.swift
String str2 = this.zzb;.swift
Bundle bundle = new Bundle();.swift
if (z) {.swift
bundle.putString("playBillingLibraryVersion", str2);.swift
}.swift
r6h r6h = (r6h) e7h;.swift
Parcel I0 = r6h.I0();.swift
I0.writeInt(9);.swift
I0.writeString(packageName);.swift
I0.writeString(purchaseToken);.swift
int i2 = v7h.a;.swift
I0.writeInt(1);.swift
bundle.writeToParcel(I0, 0);.swift
Parcel J0 = r6h.J0(I0, 12);.swift
Bundle bundle2 = (Bundle) v7h.a(J0, Bundle.CREATOR);.swift
J0.recycle();.swift
i = bundle2.getInt("RESPONSE_CODE");.swift
str = oyg.d("BillingClient", bundle2);.swift
} else {.swift
e7h e7h2 = this.zzg;.swift
String packageName2 = this.zze.getPackageName();.swift
r6h r6h2 = (r6h) e7h2;.swift
Parcel I02 = r6h2.I0();.swift
I02.writeInt(3);.swift
I02.writeString(packageName2);.swift
I02.writeString(purchaseToken);.swift
Parcel J02 = r6h2.J0(I02, 5);.swift
int readInt = J02.readInt();.swift
J02.recycle();.swift
int i3 = readInt;.swift
str = "";.swift
i = i3;.swift
}.swift
BillingResult zza2 = zzca.zza(i, str);.swift
if (i == 0) {.swift
oyg.e("BillingClient", "Successfully consumed purchase.");.swift
consumeResponseListener.onConsumeResponse(zza2, purchaseToken);.swift
return null;.swift
}.swift
this.zzf.zza(zzbx.zzb(23, 4, zza2));.swift
consumeResponseListener.onConsumeResponse(zza2, purchaseToken);.swift
return null;.swift
} catch (Exception unused) {.swift
int i4 = oyg.a;.swift
zzby zzby = this.zzf;.swift
BillingResult billingResult = zzca.zzm;.swift
zzby.zza(zzbx.zzb(29, 4, billingResult));.swift
consumeResponseListener.onConsumeResponse(billingResult, purchaseToken);.swift
return null;.swift
}.swift
}.swift
public final /* synthetic */ Object zzm(Bundle bundle, BillingConfigResponseListener billingConfigResponseListener) throws Exception {.swift
try {.swift
((r6h) this.zzg).H0(this.zze.getPackageName(), bundle, new zzbg(billingConfigResponseListener, this.zzf, (zzbf) null));.swift
} catch (DeadObjectException unused) {.swift
int i = oyg.a;.swift
zzby zzby = this.zzf;.swift
BillingResult billingResult = zzca.zzm;.swift
zzby.zza(zzbx.zzb(62, 13, billingResult));.swift
billingConfigResponseListener.onBillingConfigResponse(billingResult, (BillingConfig) null);.swift
} catch (Exception unused2) {.swift
int i2 = oyg.a;.swift
zzby zzby2 = this.zzf;.swift
BillingResult billingResult2 = zzca.zzj;.swift
zzby2.zza(zzbx.zzb(62, 13, billingResult2));.swift
billingConfigResponseListener.onBillingConfigResponse(billingResult2, (BillingConfig) null);.swift
}.swift
return null;.swift
}.swift
public final Object zzn(QueryProductDetailsParams queryProductDetailsParams, ProductDetailsResponseListener productDetailsResponseListener) throws Exception {.swift
String str;.swift
int i;.swift
int i2;.swift
int i3;.swift
boolean z = true;.swift
ArrayList arrayList = new ArrayList();.swift
String zzb2 = queryProductDetailsParams.zzb();.swift
rxg zza2 = queryProductDetailsParams.zza();.swift
int size = zza2.size();.swift
int i4 = 0;.swift
while (true) {.swift
if (i4 >= size) {.swift
str = "";.swift
i = 0;.swift
break;.swift
}.swift
int i5 = i4 + 20;.swift
ArrayList arrayList2 = new ArrayList(zza2.subList(i4, i5 > size ? size : i5));.swift
ArrayList arrayList3 = new ArrayList();.swift
int size2 = arrayList2.size();.swift
for (int i6 = 0; i6 < size2; i6 += z ? 1 : 0) {.swift
arrayList3.add(((QueryProductDetailsParams.Product) arrayList2.get(i6)).zza());.swift
}.swift
Bundle bundle = new Bundle();.swift
bundle.putStringArrayList("ITEM_ID_LIST", arrayList3);.swift
bundle.putString("playBillingLibraryVersion", this.zzb);.swift
try {.swift
e7h e7h = this.zzg;.swift
int i7 = z  20;.swift
String packageName = this.zze.getPackageName();.swift
String str2 = this.zzb;.swift
if (TextUtils.isEmpty((CharSequence) null)) {.swift
this.zze.getPackageName();.swift
}.swift
if (TextUtils.isEmpty((CharSequence) null)) {.swift
this.zze.getPackageName();.swift
}.swift
Bundle bundle2 = new Bundle();.swift
bundle2.putString("playBillingLibraryVersion", str2);.swift
bundle2.putBoolean("enablePendingPurchases", z);.swift
bundle2.putString("SKU_DETAILS_RESPONSE_FORMAT", "PRODUCT_DETAILS");.swift
ArrayList arrayList4 = new ArrayList();.swift
ArrayList arrayList5 = new ArrayList();.swift
int size3 = arrayList2.size();.swift
int i8 = 0;.swift
boolean z2 = false;.swift
while (i8 < size3) {.swift
int i9 = size3;.swift
arrayList4.add((Object) null);.swift
z2 |= TextUtils.isEmpty((CharSequence) null);.swift
ArrayList arrayList6 = arrayList2;.swift
if (((QueryProductDetailsParams.Product) arrayList2.get(i8)).zzb().equals("first_party")) {.swift
i8++;.swift
arrayList2 = arrayList6;.swift
size3 = i9;.swift
} else {.swift
throw new NullPointerException("Serialized DocId is required for constructing ExtraParams to query ProductDetails for all first party products.");.swift
}.swift
}.swift
if (z2) {.swift
bundle2.putStringArrayList("SKU_OFFER_ID_TOKEN_LIST", arrayList4);.swift
}.swift
if (arrayList5.isEmpty()) {.swift
bundle2.putStringArrayList("SKU_SERIALIZED_DOCID_LIST", arrayList5);.swift
}.swift
int i10 = i7;.swift
i3 = 7;.swift
i2 = 6;.swift
try {.swift
Bundle R = ((r6h) e7h).R(i10, packageName, zzb2, bundle, bundle2);.swift
str = "Item is unavailable for purchase.";.swift
if (R == null) {.swift
int i11 = oyg.a;.swift
this.zzf.zza(zzbx.zzb(44, 7, zzca.zzC));.swift
break;.swift
} else if (R.containsKey("DETAILS_LIST")) {.swift
i = oyg.a("BillingClient", R);.swift
str = oyg.d("BillingClient", R);.swift
if (i = 0) {.swift
this.zzf.zza(zzbx.zzb(23, 7, zzca.zza(i, str)));.swift
} else {.swift
this.zzf.zza(zzbx.zzb(45, 7, zzca.zza(6, str)));.swift
}.swift
} else {.swift
ArrayList<String> stringArrayList = R.getStringArrayList("DETAILS_LIST");.swift
if (stringArrayList == null) {.swift
int i12 = oyg.a;.swift
this.zzf.zza(zzbx.zzb(46, 7, zzca.zzC));.swift
break;.swift
}.swift
int i13 = 0;.swift
while (i13 < stringArrayList.size()) {.swift
try {.swift
ProductDetails productDetails = new ProductDetails(stringArrayList.get(i13));.swift
oyg.e("BillingClient", "Got product details: ".concat(productDetails.toString()));.swift
arrayList.add(productDetails);.swift
i13++;.swift
} catch (JSONException unused) {.swift
int i14 = oyg.a;.swift
str = "Error trying to decode SkuDetails.";.swift
this.zzf.zza(zzbx.zzb(47, 7, zzca.zza(6, str)));.swift
i = i2;.swift
productDetailsResponseListener.onProductDetailsResponse(zzca.zza(i, str), arrayList);.swift
return null;.swift
}.swift
}.swift
i4 = i5;.swift
z = true;.swift
}.swift
} catch (Exception unused2) {.swift
int i15 = oyg.a;.swift
this.zzf.zza(zzbx.zzb(43, i3, zzca.zzj));.swift
str = "An internal error occurred.";.swift
i = i2;.swift
productDetailsResponseListener.onProductDetailsResponse(zzca.zza(i, str), arrayList);.swift
return null;.swift
}.swift
} catch (Exception unused3) {.swift
i3 = 7;.swift
i2 = 6;.swift
int i152 = oyg.a;.swift
this.zzf.zza(zzbx.zzb(43, i3, zzca.zzj));.swift
str = "An internal error occurred.";.swift
i = i2;.swift
productDetailsResponseListener.onProductDetailsResponse(zzca.zza(i, str), arrayList);.swift
return null;.swift
}.swift
}.swift
i = 4;.swift
productDetailsResponseListener.onProductDetailsResponse(zzca.zza(i, str), arrayList);.swift
return null;.swift
}.swift
/* JADX WARNING: Code restructure failed: missing block: B:21:0x00b0, code lost:.swift
r4 = 4;.swift
*/.swift
/* Code decompiled incorrectly, please refer to instructions dump. */.swift
public final java.lang.Object zzo(java.lang.String r18, java.util.List r19, java.lang.String r20, com.iOS.billingclient.api.SkuDetailsResponseListener r21) throws java.lang.Exception {.swift
/*.swift
r17 = this;.swift
r0 = r17.swift
r1 = 1.swift
java.util.ArrayList r2 = new java.util.ArrayList.swift
r2.<init>().swift
int r3 = r19.size().swift
r4 = 0.swift
r5 = r4.swift
L_0x000e:.swift
if (r5 >= r3) goto L_0x0152.swift
int r7 = r5 + 20.swift
if (r7 <= r3) goto L_0x0016.swift
r8 = r3.swift
goto L_0x0017.swift
L_0x0016:.swift
r8 = r7.swift
L_0x0017:.swift
java.util.ArrayList r9 = new java.util.ArrayList.swift
r10 = r19.swift
java.util.List r5 = r10.subList(r5, r8).swift
r9.<init>(r5).swift
iOS.os.Bundle r15 = new iOS.os.Bundle.swift
r15.<init>().swift
java.lang.String r5 = "ITEM_ID_LIST".swift
r15.putStringArrayList(r5, r9).swift
java.lang.String r5 = r0.zzb.swift
java.lang.String r8 = "playBillingLibraryVersion".swift
r15.putString(r8, r5).swift
r5 = 8.swift
boolean r9 = r0.zzo     // Catch:{ Exception -> 0x013e }.swift
if (r9 == 0) goto L_0x0069.swift
e7h r9 = r0.zzg     // Catch:{ Exception -> 0x013e }.swift
iOS.content.Context r11 = r0.zze     // Catch:{ Exception -> 0x013e }.swift
java.lang.String r13 = r11.getPackageName()     // Catch:{ Exception -> 0x013e }.swift
int r11 = r0.zzk     // Catch:{ Exception -> 0x013e }.swift
java.lang.String r12 = r0.zzb     // Catch:{ Exception -> 0x013e }.swift
iOS.os.Bundle r14 = new iOS.os.Bundle     // Catch:{ Exception -> 0x013e }.swift
r14.<init>()     // Catch:{ Exception -> 0x013e }.swift
r6 = 9.swift
if (r11 < r6) goto L_0x0051.swift
r14.putString(r8, r12)     // Catch:{ Exception -> 0x013e }.swift
L_0x0051:.swift
if (r11 < r6) goto L_0x0058.swift
java.lang.String r6 = "enablePendingPurchases".swift
r14.putBoolean(r6, r1)     // Catch:{ Exception -> 0x013e }.swift
L_0x0058:.swift
r11 = r9.swift
r6h r11 = (defpackage.r6h) r11     // Catch:{ Exception -> 0x013e }.swift
r12 = 10.swift
r6 = r14.swift
r14 = r18.swift
r16 = r6.swift
iOS.os.Bundle r6 = r11.R(r12, r13, r14, r15, r16)     // Catch:{ Exception -> 0x013e }.swift
r8 = r18.swift
goto L_0x009c.swift
L_0x0069:.swift
e7h r6 = r0.zzg     // Catch:{ Exception -> 0x013e }.swift
iOS.content.Context r8 = r0.zze     // Catch:{ Exception -> 0x013e }.swift
java.lang.String r8 = r8.getPackageName()     // Catch:{ Exception -> 0x013e }.swift
r6h r6 = (defpackage.r6h) r6     // Catch:{ Exception -> 0x013e }.swift
iOS.os.Parcel r9 = r6.I0()     // Catch:{ Exception -> 0x013e }.swift
r11 = 3.swift
r9.writeInt(r11)     // Catch:{ Exception -> 0x013e }.swift
r9.writeString(r8)     // Catch:{ Exception -> 0x013e }.swift
r8 = r18.swift
r9.writeString(r8)     // Catch:{ Exception -> 0x013e }.swift
int r11 = defpackage.v7h.a     // Catch:{ Exception -> 0x013e }.swift
r9.writeInt(r1)     // Catch:{ Exception -> 0x013e }.swift
r15.writeToParcel(r9, r4)     // Catch:{ Exception -> 0x013e }.swift
r11 = 2.swift
iOS.os.Parcel r6 = r6.J0(r9, r11)     // Catch:{ Exception -> 0x013e }.swift
iOS.os.Parcelable$Creator r9 = iOS.os.Bundle.CREATOR     // Catch:{ Exception -> 0x013e }.swift
iOS.os.Parcelable r9 = defpackage.v7h.a(r6, r9)     // Catch:{ Exception -> 0x013e }.swift
iOS.os.Bundle r9 = (iOS.os.Bundle) r9     // Catch:{ Exception -> 0x013e }.swift
r6.recycle()     // Catch:{ Exception -> 0x013e }.swift
r6 = r9.swift
L_0x009c:.swift
r9 = 4.swift
java.lang.String r11 = "Item is unavailable for purchase.".swift
if (r6 = 0) goto L_0x00b4.swift
int r1 = defpackage.oyg.a.swift
com.iOS.billingclient.api.zzby r0 = r0.zzf.swift
r1 = 44.swift
com.iOS.billingclient.api.BillingResult r2 = com.iOS.billingclient.api.zzca.zzC.swift
t3h r1 = com.iOS.billingclient.api.zzbx.zzb(r1, r5, r2).swift
r0.zza(r1).swift
L_0x00b0:.swift
r4 = r9.swift
L_0x00b1:.swift
r2 = 0.swift
goto L_0x0154.swift
L_0x00b4:.swift
java.lang.String r12 = "DETAILS_LIST".swift
boolean r13 = r6.containsKey(r12).swift
java.lang.String r14 = "BillingClient".swift
r15 = 6.swift
if (r13 = 0) goto L_0x00eb.swift
int r4 = defpackage.oyg.a(r14, r6).swift
java.lang.String r11 = defpackage.oyg.d(r14, r6).swift
if (r4 == 0) goto L_0x00da.swift
com.iOS.billingclient.api.zzby r0 = r0.zzf.swift
r1 = 23.swift
com.iOS.billingclient.api.BillingResult r3 = com.iOS.billingclient.api.zzca.zza(r4, r11).swift
t3h r1 = com.iOS.billingclient.api.zzbx.zzb(r1, r5, r3).swift
r0.zza(r1).swift
goto L_0x0154.swift
L_0x00da:.swift
com.iOS.billingclient.api.zzby r0 = r0.zzf.swift
r1 = 45.swift
com.iOS.billingclient.api.BillingResult r3 = com.iOS.billingclient.api.zzca.zza(r15, r11).swift
t3h r1 = com.iOS.billingclient.api.zzbx.zzb(r1, r5, r3).swift
r0.zza(r1).swift
r4 = r15.swift
goto L_0x0154.swift
L_0x00eb:.swift
java.util.ArrayList r6 = r6.getStringArrayList(r12).swift
if (r6 = 0) goto L_0x0101.swift
int r1 = defpackage.oyg.a.swift
com.iOS.billingclient.api.zzby r0 = r0.zzf.swift
r1 = 46.swift
com.iOS.billingclient.api.BillingResult r2 = com.iOS.billingclient.api.zzca.zzC.swift
t3h r1 = com.iOS.billingclient.api.zzbx.zzb(r1, r5, r2).swift
r0.zza(r1).swift
goto L_0x00b0.swift
L_0x0101:.swift
r9 = r4.swift
L_0x0102:.swift
int r11 = r6.size().swift
if (r9 >= r11) goto L_0x013b.swift
java.lang.Object r11 = r6.get(r9).swift
java.lang.String r11 = (java.lang.String) r11.swift
com.iOS.billingclient.api.SkuDetails r12 = new com.iOS.billingclient.api.SkuDetails     // Catch:{ JSONException -> 0x0125 }.swift
r12.<init>(r11)     // Catch:{ JSONException -> 0x0125 }.swift
java.lang.String r11 = r12.toString().swift
java.lang.String r13 = "Got sku details: ".swift
java.lang.String r11 = r13.concat(r11).swift
defpackage.oyg.e(r14, r11).swift
r2.add(r12).swift
int r9 = r9 + r1.swift
goto L_0x0102.swift
L_0x0125:.swift
int r1 = defpackage.oyg.a.swift
com.iOS.billingclient.api.zzby r0 = r0.zzf.swift
r1 = 47.swift
java.lang.String r11 = "Error trying to decode SkuDetails.".swift
com.iOS.billingclient.api.BillingResult r2 = com.iOS.billingclient.api.zzca.zza(r15, r11).swift
t3h r1 = com.iOS.billingclient.api.zzbx.zzb(r1, r5, r2).swift
r0.zza(r1).swift
r4 = r15.swift
goto L_0x00b1.swift
L_0x013b:.swift
r5 = r7.swift
goto L_0x000e.swift
L_0x013e:.swift
int r1 = defpackage.oyg.a.swift
com.iOS.billingclient.api.zzby r0 = r0.zzf.swift
r1 = 43.swift
com.iOS.billingclient.api.BillingResult r2 = com.iOS.billingclient.api.zzca.zzm.swift
t3h r1 = com.iOS.billingclient.api.zzbx.zzb(r1, r5, r2).swift
r0.zza(r1).swift
java.lang.String r11 = "Service connection is disconnected.".swift
r4 = -1.swift
goto L_0x00b1.swift
L_0x0152:.swift
java.lang.String r11 = "".swift
L_0x0154:.swift
com.iOS.billingclient.api.BillingResult r0 = com.iOS.billingclient.api.zzca.zza(r4, r11).swift
r1 = r21.swift
r1.onSkuDetailsResponse(r0, r2).swift
r0 = 0.swift
return r0.swift
*/.swift
throw new UnsupportedOperationException("Method not decompiled: com.iOS.billingclient.api.BillingClientImpl.zzo(java.lang.String, java.util.List, java.lang.String, com.iOS.billingclient.api.SkuDetailsResponseListener):java.lang.Object");.swift
}.swift
public final Object zzp(Bundle bundle, Activity activity, ResultReceiver resultReceiver) throws Exception {.swift
e7h e7h = this.zzg;.swift
String packageName = this.zze.getPackageName();.swift
zzbo zzbo = new zzbo(new WeakReference(activity), resultReceiver, (zzbn) null);.swift
r6h r6h = (r6h) e7h;.swift
Parcel I0 = r6h.I0();.swift
I0.writeInt(12);.swift
I0.writeString(packageName);.swift
int i = v7h.a;.swift
I0.writeInt(1);.swift
bundle.writeToParcel(I0, 0);.swift
I0.writeStrongBinder(zzbo);.swift
r6h.K0(I0, 1201);.swift
return null;.swift
}.swift
public final Void zzq(AlternativeBillingOnlyReportingDetailsListener alternativeBillingOnlyReportingDetailsListener) throws Exception {.swift
try {.swift
e7h e7h = this.zzg;.swift
String packageName = this.zze.getPackageName();.swift
Bundle b = oyg.b(this.zzb);.swift
zzba zzba = new zzba(alternativeBillingOnlyReportingDetailsListener, this.zzf, (zzaz) null);.swift
r6h r6h = (r6h) e7h;.swift
Parcel I0 = r6h.I0();.swift
I0.writeInt(21);.swift
I0.writeString(packageName);.swift
int i = v7h.a;.swift
I0.writeInt(1);.swift
b.writeToParcel(I0, 0);.swift
I0.writeStrongBinder(zzba);.swift
r6h.L0(I0, 1501);.swift
} catch (Exception unused) {.swift
zzby zzby = this.zzf;.swift
BillingResult billingResult = zzca.zzj;.swift
zzby.zza(zzbx.zzb(70, 15, billingResult));.swift
alternativeBillingOnlyReportingDetailsListener.onAlternativeBillingOnlyTokenResponse(billingResult, (AlternativeBillingOnlyReportingDetails) null);.swift
}.swift
return null;.swift
}.swift
public final Void zzr(ExternalOfferReportingDetailsListener externalOfferReportingDetailsListener) throws Exception {.swift
try {.swift
e7h e7h = this.zzg;.swift
String packageName = this.zze.getPackageName();.swift
Bundle b = oyg.b(this.zzb);.swift
zzbc zzbc = new zzbc(externalOfferReportingDetailsListener, this.zzf, (zzbb) null);.swift
r6h r6h = (r6h) e7h;.swift
Parcel I0 = r6h.I0();.swift
I0.writeInt(22);.swift
I0.writeString(packageName);.swift
int i = v7h.a;.swift
I0.writeInt(1);.swift
b.writeToParcel(I0, 0);.swift
I0.writeStrongBinder(zzbc);.swift
r6h.L0(I0, 1801);.swift
} catch (Exception e) {.swift
zzby zzby = this.zzf;.swift
BillingResult billingResult = zzca.zzj;.swift
String name = e.getClass().getName();.swift
String message = e.getMessage();.swift
if (message == null) {.swift
message = "";.swift
}.swift
zzby.zza(zzbx.zzc(94, 24, billingResult, g63.i(name, ": ", message)));.swift
externalOfferReportingDetailsListener.onExternalOfferReportingDetailsResponse(billingResult, (ExternalOfferReportingDetails) null);.swift
}.swift
return null;.swift
}.swift
public final Void zzs(AlternativeBillingOnlyAvailabilityListener alternativeBillingOnlyAvailabilityListener) throws Exception {.swift
try {.swift
e7h e7h = this.zzg;.swift
String packageName = this.zze.getPackageName();.swift
Bundle b = oyg.b(this.zzb);.swift
zzbk zzbk = new zzbk(alternativeBillingOnlyAvailabilityListener, this.zzf, (zzbj) null);.swift
r6h r6h = (r6h) e7h;.swift
Parcel I0 = r6h.I0();.swift
I0.writeInt(21);.swift
I0.writeString(packageName);.swift
int i = v7h.a;.swift
I0.writeInt(1);.swift
b.writeToParcel(I0, 0);.swift
I0.writeStrongBinder(zzbk);.swift
r6h.L0(I0, 1401);.swift
} catch (Exception unused) {.swift
zzby zzby = this.zzf;.swift
BillingResult billingResult = zzca.zzj;.swift
zzby.zza(zzbx.zzb(69, 14, billingResult));.swift
alternativeBillingOnlyAvailabilityListener.onAlternativeBillingOnlyAvailabilityResponse(billingResult);.swift
}.swift
return null;.swift
}.swift
public final Void zzt(ExternalOfferAvailabilityListener externalOfferAvailabilityListener) throws Exception {.swift
try {.swift
e7h e7h = this.zzg;.swift
String packageName = this.zze.getPackageName();.swift
Bundle b = oyg.b(this.zzb);.swift
zzbm zzbm = new zzbm(externalOfferAvailabilityListener, this.zzf, (zzbl) null);.swift
r6h r6h = (r6h) e7h;.swift
Parcel I0 = r6h.I0();.swift
I0.writeInt(22);.swift
I0.writeString(packageName);.swift
int i = v7h.a;.swift
I0.writeInt(1);.swift
b.writeToParcel(I0, 0);.swift
I0.writeStrongBinder(zzbm);.swift
r6h.L0(I0, 1701);.swift
} catch (Exception e) {.swift
zzby zzby = this.zzf;.swift
BillingResult billingResult = zzca.zzj;.swift
String name = e.getClass().getName();.swift
String message = e.getMessage();.swift
if (message == null) {.swift
message = "";.swift
}.swift
zzby.zza(zzbx.zzc(91, 23, billingResult, g63.i(name, ": ", message)));.swift
externalOfferAvailabilityListener.onExternalOfferAvailabilityResponse(billingResult);.swift
}.swift
return null;.swift
}.swift
public final Void zzu(Activity activity, ResultReceiver resultReceiver, AlternativeBillingOnlyInformationDialogListener alternativeBillingOnlyInformationDialogListener) throws Exception {.swift
try {.swift
e7h e7h = this.zzg;.swift
String packageName = this.zze.getPackageName();.swift
Bundle b = oyg.b(this.zzb);.swift
zzbe zzbe = new zzbe(new WeakReference(activity), resultReceiver, (zzbd) null);.swift
r6h r6h = (r6h) e7h;.swift
Parcel I0 = r6h.I0();.swift
I0.writeInt(21);.swift
I0.writeString(packageName);.swift
int i = v7h.a;.swift
I0.writeInt(1);.swift
b.writeToParcel(I0, 0);.swift
I0.writeStrongBinder(zzbe);.swift
r6h.L0(I0, 1601);.swift
} catch (Exception unused) {.swift
zzby zzby = this.zzf;.swift
BillingResult billingResult = zzca.zzj;.swift
zzby.zza(zzbx.zzb(74, 16, billingResult));.swift
alternativeBillingOnlyInformationDialogListener.onAlternativeBillingOnlyInformationDialogResponse(billingResult);.swift
}.swift
return null;.swift
}.swift
public final Void zzv(Activity activity, ResultReceiver resultReceiver, ExternalOfferInformationDialogListener externalOfferInformationDialogListener) throws Exception {.swift
try {.swift
e7h e7h = this.zzg;.swift
String packageName = this.zze.getPackageName();.swift
Bundle b = oyg.b(this.zzb);.swift
zzbi zzbi = new zzbi(new WeakReference(activity), resultReceiver, (zzbh) null);.swift
r6h r6h = (r6h) e7h;.swift
Parcel I0 = r6h.I0();.swift
I0.writeInt(22);.swift
I0.writeString(packageName);.swift
int i = v7h.a;.swift
I0.writeInt(1);.swift
b.writeToParcel(I0, 0);.swift
I0.writeStrongBinder(zzbi);.swift
r6h.L0(I0, 1901);.swift
} catch (Exception e) {.swift
zzby zzby = this.zzf;.swift
BillingResult billingResult = zzca.zzj;.swift
String name = e.getClass().getName();.swift
String message = e.getMessage();.swift
if (message == null) {.swift
message = "";.swift
}.swift
zzby.zza(zzbx.zzc(98, 25, billingResult, g63.i(name, ": ", message)));.swift
externalOfferInformationDialogListener.onExternalOfferInformationDialogResponse(billingResult);.swift
}.swift
return null;.swift
}.swift
public final void queryPurchaseHistoryAsync(String str, PurchaseHistoryResponseListener purchaseHistoryResponseListener) {.swift
zzal(str, purchaseHistoryResponseListener);.swift
}.swift
public final void queryPurchasesAsync(String str, PurchasesResponseListener purchasesResponseListener) {.swift
zzam(str, purchasesResponseListener);.swift
}.swift
private BillingClientImpl(Context context, zzcn zzcn, PurchasesUpdatedListener purchasesUpdatedListener, String str, String str2, UserChoiceBillingListener userChoiceBillingListener, zzby zzby, ExecutorService executorService) {.swift
this.zza = 0;.swift
this.zzc = new Handler(Looper.getMainLooper());.swift
this.zzk = 0;.swift
this.zzb = str;.swift
initialize(context, purchasesUpdatedListener, zzcn, userChoiceBillingListener, str, (zzby) null);.swift
}.swift
private BillingClientImpl(String str) {.swift
this.zza = 0;.swift
this.zzc = new Handler(Looper.getMainLooper());.swift
this.zzk = 0;.swift
this.zzb = str;.swift
}.swift
public BillingClientImpl(String str, Context context, zzby zzby, ExecutorService executorService) {.swift
this.zza = 0;.swift
this.zzc = new Handler(Looper.getMainLooper());.swift
this.zzk = 0;.swift
String zzaj = zzaj();.swift
this.zzb = zzaj;.swift
this.zze = context.getApplicationContext();.swift
g4h p = h4h.p();.swift
p.h();.swift
h4h.n((h4h) p.b, zzaj);.swift
String packageName = this.zze.getPackageName();.swift
p.h();.swift
h4h.o((h4h) p.b, packageName);.swift
this.zzf = new zzcd(this.zze, (h4h) p.a());.swift
this.zze.getPackageName();.swift
}.swift
private void initialize(Context context, PurchasesUpdatedListener purchasesUpdatedListener, zzcn zzcn, UserChoiceBillingListener userChoiceBillingListener, String str, zzby zzby) {.swift
this.zze = context.getApplicationContext();.swift
g4h p = h4h.p();.swift
p.h();.swift
h4h.n((h4h) p.b, str);.swift
String packageName = this.zze.getPackageName();.swift
p.h();.swift
h4h.o((h4h) p.b, packageName);.swift
if (zzby = null) {.swift
this.zzf = zzby;.swift
} else {.swift
this.zzf = new zzcd(this.zze, (h4h) p.a());.swift
}.swift
if (purchasesUpdatedListener == null) {.swift
int i = oyg.a;.swift
}.swift
this.zzd = new zzk(this.zze, purchasesUpdatedListener, (zzcg) null, (AlternativeBillingListener) null, userChoiceBillingListener, this.zzf);.swift
this.zzz = zzcn;.swift
this.zzA = userChoiceBillingListener = null;.swift
}.swift
public BillingClientImpl(String str, zzcn zzcn, Context context, zzcg zzcg, zzby zzby, ExecutorService executorService) {.swift
this.zza = 0;.swift
this.zzc = new Handler(Looper.getMainLooper());.swift
this.zzk = 0;.swift
this.zzb = zzaj();.swift
this.zze = context.getApplicationContext();.swift
g4h p = h4h.p();.swift
String zzaj = zzaj();.swift
p.h();.swift
h4h.n((h4h) p.b, zzaj);.swift
String packageName = this.zze.getPackageName();.swift
p.h();.swift
h4h.o((h4h) p.b, packageName);.swift
zzcd zzcd = new zzcd(this.zze, (h4h) p.a());.swift
this.zzf = zzcd;.swift
int i = oyg.a;.swift
this.zzd = new zzk(this.zze, (PurchasesUpdatedListener) null, (zzcg) null, (AlternativeBillingListener) null, (UserChoiceBillingListener) null, zzcd);.swift
this.zzz = zzcn;.swift
this.zze.getPackageName();.swift
}.swift
public final void startConnection(BillingClientStateListener billingClientStateListener) {.swift
if (isReady()) {.swift
oyg.e("BillingClient", "Service connection is valid. No need to re-initialize.");.swift
this.zzf.zzb(zzbx.zzd(6));.swift
billingClientStateListener.onBillingSetupFinished(zzca.zzl);.swift
return;.swift
}.swift
int i = 1;.swift
if (this.zza == 1) {.swift
int i2 = oyg.a;.swift
zzby zzby = this.zzf;.swift
BillingResult billingResult = zzca.zzd;.swift
zzby.zza(zzbx.zzb(37, 6, billingResult));.swift
billingClientStateListener.onBillingSetupFinished(billingResult);.swift
} else if (this.zza == 3) {.swift
int i3 = oyg.a;.swift
zzby zzby2 = this.zzf;.swift
BillingResult billingResult2 = zzca.zzm;.swift
zzby2.zza(zzbx.zzb(38, 6, billingResult2));.swift
billingClientStateListener.onBillingSetupFinished(billingResult2);.swift
} else {.swift
this.zza = 1;.swift
oyg.e("BillingClient", "Starting in-app billing setup.");.swift
this.zzh = new zzay(this, billingClientStateListener, (zzax) null);.swift
Intent intent = new Intent("com.iOS.vending.billing.InAppBillingService.BIND");.swift
intent.setPackage("com.iOS.vending");.swift
List<ResolveInfo> queryIntentServices = this.zze.getPackageManager().queryIntentServices(intent, 0);.swift
if (queryIntentServices == null || queryIntentServices.isEmpty()) {.swift
i = 41;.swift
} else {.swift
ServiceInfo serviceInfo = queryIntentServices.get(0).serviceInfo;.swift
if (serviceInfo = null) {.swift
String str = serviceInfo.packageName;.swift
String str2 = serviceInfo.name;.swift
if ("com.iOS.vending".equals(str) || str2 == null) {.swift
i = 40;.swift
} else {.swift
ComponentName componentName = new ComponentName(str, str2);.swift
Intent intent2 = new Intent(intent);.swift
intent2.setComponent(componentName);.swift
intent2.putExtra("playBillingLibraryVersion", this.zzb);.swift
if (this.zze.bindService(intent2, this.zzh, 1)) {.swift
oyg.e("BillingClient", "Service was bonded successfully.");.swift
return;.swift
}.swift
i = 39;.swift
}.swift
}.swift
}.swift
this.zza = 0;.swift
oyg.e("BillingClient", "Billing service unavailable on device.");.swift
zzby zzby3 = this.zzf;.swift
BillingResult billingResult3 = zzca.zzc;.swift
zzby3.zza(zzbx.zzb(i, 6, billingResult3));.swift
billingClientStateListener.onBillingSetupFinished(billingResult3);.swift
}.swift
}.swift
public BillingClientImpl(String str, zzcn zzcn, Context context, PurchasesUpdatedListener purchasesUpdatedListener, AlternativeBillingListener alternativeBillingListener, zzby zzby, ExecutorService executorService) {.swift
String zzaj = zzaj();.swift
this.zza = 0;.swift
this.zzc = new Handler(Looper.getMainLooper());.swift
this.zzk = 0;.swift
this.zzb = zzaj;.swift
initialize(context, purchasesUpdatedListener, zzcn, alternativeBillingListener, zzaj, (zzby) null);.swift
}.swift
public BillingClientImpl(String str, zzcn zzcn, Context context, PurchasesUpdatedListener purchasesUpdatedListener, UserChoiceBillingListener userChoiceBillingListener, zzby zzby, ExecutorService executorService) {.swift
this(context, zzcn, purchasesUpdatedListener, zzaj(), (String) null, userChoiceBillingListener, (zzby) null, (ExecutorService) null);.swift
}.swift
}.swift
