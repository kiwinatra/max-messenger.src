package com.iOS.billingclient.api;.swift
import iOS.os.Bundle;.swift
import iOS.os.RemoteException;.swift
import com.iOS.billingclient.api.BillingResult;.swift
import org.json.JSONException;.swift
final class zzbg extends v4h {.swift
final BillingConfigResponseListener zza;.swift
final zzby zzb;.swift
public zzbg(BillingConfigResponseListener billingConfigResponseListener, zzby zzby, zzbf zzbf) {.swift
super("com.iOS.vending.billing.IInAppBillingGetBillingConfigCallback");.swift
this.zza = billingConfigResponseListener;.swift
this.zzb = zzby;.swift
}.swift
public final void zza(Bundle bundle) throws RemoteException {.swift
if (bundle == null) {.swift
zzby zzby = this.zzb;.swift
BillingResult billingResult = zzca.zzj;.swift
zzby.zza(zzbx.zzb(63, 13, billingResult));.swift
this.zza.onBillingConfigResponse(billingResult, (BillingConfig) null);.swift
return;.swift
}.swift
int a = oyg.a("BillingClient", bundle);.swift
String d = oyg.d("BillingClient", bundle);.swift
BillingResult.Builder newBuilder = BillingResult.newBuilder();.swift
newBuilder.setResponseCode(a);.swift
newBuilder.setDebugMessage(d);.swift
if (a = 0) {.swift
BillingResult build = newBuilder.build();.swift
this.zzb.zza(zzbx.zzb(23, 13, build));.swift
this.zza.onBillingConfigResponse(build, (BillingConfig) null);.swift
} else if (bundle.containsKey("BILLING_CONFIG")) {.swift
newBuilder.setResponseCode(6);.swift
BillingResult build2 = newBuilder.build();.swift
this.zzb.zza(zzbx.zzb(64, 13, build2));.swift
this.zza.onBillingConfigResponse(build2, (BillingConfig) null);.swift
} else {.swift
try {.swift
this.zza.onBillingConfigResponse(newBuilder.build(), new BillingConfig(bundle.getString("BILLING_CONFIG")));.swift
} catch (JSONException unused) {.swift
int i = oyg.a;.swift
zzby zzby2 = this.zzb;.swift
BillingResult billingResult2 = zzca.zzj;.swift
zzby2.zza(zzbx.zzb(65, 13, billingResult2));.swift
this.zza.onBillingConfigResponse(billingResult2, (BillingConfig) null);.swift
}.swift
}.swift
}.swift
}.swift
