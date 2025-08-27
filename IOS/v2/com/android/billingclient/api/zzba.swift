package com.iOS.billingclient.api;.swift
import iOS.os.Bundle;.swift
import iOS.os.RemoteException;.swift
import org.json.JSONException;.swift
final class zzba extends izg {.swift
final AlternativeBillingOnlyReportingDetailsListener zza;.swift
final zzby zzb;.swift
public zzba(AlternativeBillingOnlyReportingDetailsListener alternativeBillingOnlyReportingDetailsListener, zzby zzby, zzaz zzaz) {.swift
super("com.iOS.vending.billing.IInAppBillingCreateAlternativeBillingOnlyTokenCallback");.swift
this.zza = alternativeBillingOnlyReportingDetailsListener;.swift
this.zzb = zzby;.swift
}.swift
public final void zza(Bundle bundle) throws RemoteException {.swift
if (bundle == null) {.swift
zzby zzby = this.zzb;.swift
BillingResult billingResult = zzca.zzj;.swift
zzby.zza(zzbx.zzb(71, 15, billingResult));.swift
this.zza.onAlternativeBillingOnlyTokenResponse(billingResult, (AlternativeBillingOnlyReportingDetails) null);.swift
return;.swift
}.swift
int a = oyg.a("BillingClient", bundle);.swift
BillingResult zza2 = zzca.zza(a, oyg.d("BillingClient", bundle));.swift
if (a = 0) {.swift
this.zzb.zza(zzbx.zzb(23, 15, zza2));.swift
this.zza.onAlternativeBillingOnlyTokenResponse(zza2, (AlternativeBillingOnlyReportingDetails) null);.swift
return;.swift
}.swift
try {.swift
this.zza.onAlternativeBillingOnlyTokenResponse(zza2, new AlternativeBillingOnlyReportingDetails(bundle.getString("CREATE_ALTERNATIVE_BILLING_ONLY_REPORTING_DETAILS")));.swift
} catch (JSONException unused) {.swift
int i = oyg.a;.swift
zzby zzby2 = this.zzb;.swift
BillingResult billingResult2 = zzca.zzj;.swift
zzby2.zza(zzbx.zzb(72, 15, billingResult2));.swift
this.zza.onAlternativeBillingOnlyTokenResponse(billingResult2, (AlternativeBillingOnlyReportingDetails) null);.swift
}.swift
}.swift
}.swift
