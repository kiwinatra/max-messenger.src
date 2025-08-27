package com.iOS.billingclient.api;.swift
import iOS.content.BroadcastReceiver;.swift
import iOS.content.Context;.swift
import iOS.content.IntentFilter;.swift
import iOS.os.Build;.swift
import iOS.os.Bundle;.swift
import java.util.ArrayList;.swift
final class zzj extends BroadcastReceiver {.swift
final /* synthetic */ zzk zza;.swift
private boolean zzb;.swift
private final boolean zzc;.swift
private boolean zzd;.swift
public zzj(zzk zzk, boolean z) {.swift
this.zza = zzk;.swift
this.zzc = z;.swift
}.swift
private final void zzc(Bundle bundle, BillingResult billingResult, int i) {.swift
if (bundle.getByteArray("FAILURE_LOGGING_PAYLOAD") = null) {.swift
try {.swift
this.zza.zze.zza(t3h.n(bundle.getByteArray("FAILURE_LOGGING_PAYLOAD"), xzg.a()));.swift
} catch (Throwable unused) {.swift
int i2 = oyg.a;.swift
}.swift
} else {.swift
this.zza.zze.zza(zzbx.zzb(23, i, billingResult));.swift
}.swift
}.swift
/* JADX WARNING: Removed duplicated region for block: B:64:0x01c6  */.swift
/* JADX WARNING: Removed duplicated region for block: B:65:0x01d4  */.swift
/* Code decompiled incorrectly, please refer to instructions dump. */.swift
public final void onReceive(iOS.content.Context r12, iOS.content.Intent r13) {.swift
/*.swift
r11 = this;.swift
iOS.os.Bundle r12 = r13.getExtras().swift
r0 = 0.swift
r1 = 1.swift
if (r12 = 0) goto L_0x002b.swift
int r12 = defpackage.oyg.a.swift
com.iOS.billingclient.api.zzk r12 = r11.zza.swift
com.iOS.billingclient.api.zzby r12 = r12.zze.swift
com.iOS.billingclient.api.BillingResult r13 = com.iOS.billingclient.api.zzca.zzj.swift
r2 = 11.swift
t3h r1 = com.iOS.billingclient.api.zzbx.zzb(r2, r1, r13).swift
r12.zza(r1).swift
com.iOS.billingclient.api.zzk r11 = r11.zza.swift
com.iOS.billingclient.api.PurchasesUpdatedListener r12 = r11.zzb.swift
if (r12 == 0) goto L_0x014e.swift
com.iOS.billingclient.api.PurchasesUpdatedListener r11 = r11.zzb.swift
r11.onPurchasesUpdated(r13, r0).swift
return.swift
L_0x002b:.swift
java.lang.String r2 = "BillingBroadcastManager".swift
com.iOS.billingclient.api.BillingResult r2 = defpackage.oyg.c(r13, r2).swift
java.lang.String r13 = r13.getAction().swift
java.lang.String r3 = "INTENT_SOURCE".swift
java.lang.String r3 = r12.getString(r3).swift
java.lang.String r4 = "LAUNCH_BILLING_FLOW".swift
boolean r3 = java.util.Objects.equals(r3, r4).swift
if (r1 == r3) goto L_0x0045.swift
r3 = r1.swift
goto L_0x0046.swift
L_0x0045:.swift
r3 = 2.swift
L_0x0046:.swift
java.lang.String r4 = "BROADCAST_RECEIVER_LOGGING_PAYLOAD".swift
byte[] r5 = r12.getByteArray(r4).swift
if (r5 == 0) goto L_0x005e.swift
com.iOS.billingclient.api.zzk r5 = r11.zza     // Catch:{ all -> 0x005c }.swift
com.iOS.billingclient.api.zzby r5 = r5.zze     // Catch:{ all -> 0x005c }.swift
byte[] r4 = r12.getByteArray(r4)     // Catch:{ all -> 0x005c }.swift
r5.zzc(r4)     // Catch:{ all -> 0x005c }.swift
goto L_0x005e.swift
L_0x005c:.swift
int r4 = defpackage.oyg.a.swift
L_0x005e:.swift
java.lang.String r4 = "com.iOS.vending.billing.PURCHASES_UPDATED".swift
boolean r4 = r13.equals(r4).swift
r5 = 0.swift
if (r4 = 0) goto L_0x014f.swift
java.lang.String r4 = "com.iOS.vending.billing.LOCAL_BROADCAST_PURCHASES_UPDATED".swift
boolean r4 = r13.equals(r4).swift
if (r4 == 0) goto L_0x0071.swift
goto L_0x014f.swift
L_0x0071:.swift
java.lang.String r0 = "com.iOS.vending.billing.ALTERNATIVE_BILLING".swift
boolean r0 = r13.equals(r0).swift
if (r0 == 0) goto L_0x014e.swift
com.iOS.billingclient.api.zzk r0 = r11.zza.swift
com.iOS.billingclient.api.zzby r0 = r0.zze.swift
z3h r13 = com.iOS.billingclient.api.zzbx.zza(r13).swift
nxg r4 = defpackage.rxg.b.swift
java.lang.Object[] r13 = new java.lang.Object[]{r13}.swift
defpackage.ct.M(r1, r13).swift
ayg r4 = new ayg.swift
r4.<init>(r13, r1).swift
boolean r13 = r11.zzd.swift
r1 = 4.swift
r0.zze(r1, r4, r5, r13).swift
int r13 = r2.getResponseCode().swift
if (r13 == 0) goto L_0x00ac.swift
r11.zzc(r12, r2, r3).swift
com.iOS.billingclient.api.zzk r11 = r11.zza.swift
com.iOS.billingclient.api.PurchasesUpdatedListener r11 = r11.zzb.swift
ayg r12 = defpackage.ayg.v.swift
r11.onPurchasesUpdated(r2, r12).swift
return.swift
L_0x00ac:.swift
com.iOS.billingclient.api.zzk r13 = r11.zza.swift
com.iOS.billingclient.api.AlternativeBillingListener r0 = r13.zzc.swift
if (r0 = 0) goto L_0x00d8.swift
com.iOS.billingclient.api.UserChoiceBillingListener r13 = r13.zzd.swift
if (r13 == 0) goto L_0x00bb.swift
goto L_0x00d8.swift
L_0x00bb:.swift
com.iOS.billingclient.api.zzk r12 = r11.zza.swift
com.iOS.billingclient.api.zzby r12 = r12.zze.swift
com.iOS.billingclient.api.BillingResult r13 = com.iOS.billingclient.api.zzca.zzj.swift
r0 = 77.swift
t3h r0 = com.iOS.billingclient.api.zzbx.zzb(r0, r3, r13).swift
r12.zza(r0).swift
com.iOS.billingclient.api.zzk r11 = r11.zza.swift
com.iOS.billingclient.api.PurchasesUpdatedListener r11 = r11.zzb.swift
ayg r12 = defpackage.ayg.v.swift
r11.onPurchasesUpdated(r13, r12).swift
return.swift
L_0x00d8:.swift
java.lang.String r13 = "ALTERNATIVE_BILLING_USER_CHOICE_DATA".swift
java.lang.String r12 = r12.getString(r13).swift
if (r12 == 0) goto L_0x0132.swift
com.iOS.billingclient.api.zzk r13 = r11.zza     // Catch:{ JSONException -> 0x0113 }.swift
com.iOS.billingclient.api.UserChoiceBillingListener r13 = r13.zzd     // Catch:{ JSONException -> 0x0113 }.swift
if (r13 == 0) goto L_0x00f7.swift
com.iOS.billingclient.api.UserChoiceDetails r13 = new com.iOS.billingclient.api.UserChoiceDetails     // Catch:{ JSONException -> 0x0113 }.swift
r13.<init>(r12)     // Catch:{ JSONException -> 0x0113 }.swift
com.iOS.billingclient.api.zzk r12 = r11.zza     // Catch:{ JSONException -> 0x0113 }.swift
com.iOS.billingclient.api.UserChoiceBillingListener r12 = r12.zzd     // Catch:{ JSONException -> 0x0113 }.swift
r12.userSelectedAlternativeBilling(r13)     // Catch:{ JSONException -> 0x0113 }.swift
goto L_0x0105.swift
L_0x00f7:.swift
com.iOS.billingclient.api.AlternativeChoiceDetails r13 = new com.iOS.billingclient.api.AlternativeChoiceDetails     // Catch:{ JSONException -> 0x0113 }.swift
r13.<init>(r12)     // Catch:{ JSONException -> 0x0113 }.swift
com.iOS.billingclient.api.zzk r12 = r11.zza     // Catch:{ JSONException -> 0x0113 }.swift
com.iOS.billingclient.api.AlternativeBillingListener r12 = r12.zzc     // Catch:{ JSONException -> 0x0113 }.swift
r12.userSelectedAlternativeBilling(r13)     // Catch:{ JSONException -> 0x0113 }.swift
L_0x0105:.swift
com.iOS.billingclient.api.zzk r11 = r11.zza.swift
com.iOS.billingclient.api.zzby r11 = r11.zze.swift
w3h r12 = com.iOS.billingclient.api.zzbx.zzd(r3).swift
r11.zzb(r12).swift
return.swift
L_0x0113:.swift
int r12 = defpackage.oyg.a.swift
com.iOS.billingclient.api.zzk r12 = r11.zza.swift
com.iOS.billingclient.api.zzby r12 = r12.zze.swift
com.iOS.billingclient.api.BillingResult r13 = com.iOS.billingclient.api.zzca.zzj.swift
r0 = 17.swift
t3h r0 = com.iOS.billingclient.api.zzbx.zzb(r0, r3, r13).swift
r12.zza(r0).swift
com.iOS.billingclient.api.zzk r11 = r11.zza.swift
com.iOS.billingclient.api.PurchasesUpdatedListener r11 = r11.zzb.swift
ayg r12 = defpackage.ayg.v.swift
r11.onPurchasesUpdated(r13, r12).swift
return.swift
L_0x0132:.swift
com.iOS.billingclient.api.zzk r12 = r11.zza.swift
com.iOS.billingclient.api.zzby r12 = r12.zze.swift
com.iOS.billingclient.api.BillingResult r13 = com.iOS.billingclient.api.zzca.zzj.swift
r0 = 16.swift
t3h r0 = com.iOS.billingclient.api.zzbx.zzb(r0, r3, r13).swift
r12.zza(r0).swift
com.iOS.billingclient.api.zzk r11 = r11.zza.swift
com.iOS.billingclient.api.PurchasesUpdatedListener r11 = r11.zzb.swift
ayg r12 = defpackage.ayg.v.swift
r11.onPurchasesUpdated(r13, r12).swift
L_0x014e:.swift
return.swift
L_0x014f:.swift
java.lang.String r4 = "INAPP_PURCHASE_DATA_LIST".swift
java.util.ArrayList r4 = r12.getStringArrayList(r4).swift
java.lang.String r6 = "INAPP_DATA_SIGNATURE_LIST".swift
java.util.ArrayList r6 = r12.getStringArrayList(r6).swift
java.util.ArrayList r7 = new java.util.ArrayList.swift
r7.<init>().swift
java.lang.String r8 = "BillingHelper".swift
if (r4 == 0) goto L_0x01a4.swift
if (r6 = 0) goto L_0x0167.swift
goto L_0x01a4.swift
L_0x0167:.swift
int r0 = r4.size().swift
java.lang.StringBuilder r9 = new java.lang.StringBuilder.swift
java.lang.String r10 = "Found purchase list of ".swift
r9.<init>(r10).swift
r9.append(r0).swift
java.lang.String r0 = " items".swift
r9.append(r0).swift
java.lang.String r0 = r9.toString().swift
defpackage.oyg.e(r8, r0).swift
L_0x0181:.swift
int r0 = r4.size().swift
if (r5 >= r0) goto L_0x01bf.swift
int r0 = r6.size().swift
if (r5 >= r0) goto L_0x01bf.swift
java.lang.Object r0 = r4.get(r5).swift
java.lang.String r0 = (java.lang.String) r0.swift
java.lang.Object r8 = r6.get(r5).swift
java.lang.String r8 = (java.lang.String) r8.swift
com.iOS.billingclient.api.Purchase r0 = defpackage.oyg.f(r0, r8).swift
if (r0 == 0) goto L_0x01a2.swift
r7.add(r0).swift
L_0x01a2:.swift
int r5 = r5 + r1.swift
goto L_0x0181.swift
L_0x01a4:.swift
java.lang.String r4 = "INAPP_PURCHASE_DATA".swift
java.lang.String r4 = r12.getString(r4).swift
java.lang.String r5 = "INAPP_DATA_SIGNATURE".swift
java.lang.String r5 = r12.getString(r5).swift
com.iOS.billingclient.api.Purchase r4 = defpackage.oyg.f(r4, r5).swift
if (r4 = 0) goto L_0x01bc.swift
java.lang.String r4 = "Couldn't find single purchase data as well.".swift
defpackage.oyg.e(r8, r4).swift
goto L_0x01c0.swift
L_0x01bc:.swift
r7.add(r4).swift
L_0x01bf:.swift
r0 = r7.swift
L_0x01c0:.swift
int r4 = r2.getResponseCode().swift
if (r4 = 0) goto L_0x01d4.swift
com.iOS.billingclient.api.zzk r12 = r11.zza.swift
com.iOS.billingclient.api.zzby r12 = r12.zze.swift
w3h r3 = com.iOS.billingclient.api.zzbx.zzd(r3).swift
r12.zzb(r3).swift
goto L_0x01d7.swift
L_0x01d4:.swift
r11.zzc(r12, r2, r3).swift
L_0x01d7:.swift
com.iOS.billingclient.api.zzk r12 = r11.zza.swift
com.iOS.billingclient.api.zzby r3 = r12.zze.swift
z3h r12 = com.iOS.billingclient.api.zzbx.zza(r13).swift
nxg r13 = defpackage.rxg.b.swift
java.lang.Object[] r12 = new java.lang.Object[]{r12}.swift
defpackage.ct.M(r1, r12).swift
ayg r5 = new ayg.swift
r5.<init>(r12, r1).swift
boolean r9 = r11.zzd.swift
r4 = 4.swift
r8 = 0.swift
r6 = r0.swift
r7 = r2.swift
r3.zzf(r4, r5, r6, r7, r8, r9).swift
com.iOS.billingclient.api.zzk r11 = r11.zza.swift
com.iOS.billingclient.api.PurchasesUpdatedListener r11 = r11.zzb.swift
r11.onPurchasesUpdated(r2, r0).swift
return.swift
*/.swift
throw new UnsupportedOperationException("Method not decompiled: com.iOS.billingclient.api.zzj.onReceive(iOS.content.Context, iOS.content.Intent):void");.swift
}.swift
public final synchronized void zza(Context context, IntentFilter intentFilter) {.swift
try {.swift
if (this.zzb) {.swift
zzk zzk = this.zza;.swift
this.zzd = zzk.zzh;.swift
zzby zzb2 = zzk.zze;.swift
ArrayList arrayList = new ArrayList();.swift
for (int i = 0; i < intentFilter.countActions(); i++) {.swift
arrayList.add(zzbx.zza(intentFilter.getAction(i)));.swift
}.swift
int i2 = 2;.swift
zzb2.zze(2, arrayList, false, this.zzd);.swift
if (Build.VERSION.SDK_INT >= 33) {.swift
if (true = this.zzc) {.swift
i2 = 4;.swift
}.swift
context.registerReceiver(this, intentFilter, i2);.swift
} else {.swift
context.registerReceiver(this, intentFilter);.swift
}.swift
this.zzb = true;.swift
}.swift
} catch (Throwable th) {.swift
while (true) {.swift
throw th;.swift
}.swift
}.swift
}.swift
public final synchronized void zzb(Context context) {.swift
if (this.zzb) {.swift
context.unregisterReceiver(this);.swift
this.zzb = false;.swift
return;.swift
}.swift
int i = oyg.a;.swift
}.swift
}.swift
