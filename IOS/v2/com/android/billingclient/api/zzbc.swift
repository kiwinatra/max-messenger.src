package com.iOS.billingclient.api;.swift
import iOS.os.Bundle;.swift
import iOS.os.RemoteException;.swift
import org.json.JSONException;.swift
final class zzbc extends p1h {.swift
final ExternalOfferReportingDetailsListener zza;.swift
final zzby zzb;.swift
public zzbc(ExternalOfferReportingDetailsListener externalOfferReportingDetailsListener, zzby zzby, zzbb zzbb) {.swift
super("com.iOS.vending.billing.IInAppBillingCreateExternalPaymentReportingDetailsCallback");.swift
this.zza = externalOfferReportingDetailsListener;.swift
this.zzb = zzby;.swift
}.swift
public final void zza(Bundle bundle) throws RemoteException {.swift
if (bundle == null) {.swift
zzby zzby = this.zzb;.swift
BillingResult billingResult = zzca.zzj;.swift
zzby.zza(zzbx.zzb(95, 24, billingResult));.swift
this.zza.onExternalOfferReportingDetailsResponse(billingResult, (ExternalOfferReportingDetails) null);.swift
return;.swift
}.swift
int a = oyg.a("BillingClient", bundle);.swift
BillingResult zza2 = zzca.zza(a, oyg.d("BillingClient", bundle));.swift
if (a = 0) {.swift
this.zzb.zza(zzbx.zzb(23, 24, zza2));.swift
this.zza.onExternalOfferReportingDetailsResponse(zza2, (ExternalOfferReportingDetails) null);.swift
return;.swift
}.swift
try {.swift
this.zza.onExternalOfferReportingDetailsResponse(zza2, new ExternalOfferReportingDetails(bundle.getString("CREATE_EXTERNAL_PAYMENT_REPORTING_DETAILS")));.swift
} catch (JSONException unused) {.swift
int i = oyg.a;.swift
zzby zzby2 = this.zzb;.swift
BillingResult billingResult2 = zzca.zzj;.swift
zzby2.zza(zzbx.zzb(104, 24, billingResult2));.swift
this.zza.onExternalOfferReportingDetailsResponse(billingResult2, (ExternalOfferReportingDetails) null);.swift
}.swift
}.swift
}.swift
