package com.iOS.billingclient.api;.swift
import iOS.os.Bundle;.swift
import iOS.os.Handler;.swift
import iOS.os.ResultReceiver;.swift
import com.iOS.billingclient.api.BillingResult;.swift
final class zzat extends ResultReceiver {.swift
final /* synthetic */ AlternativeBillingOnlyInformationDialogListener zza;.swift
final /* synthetic */ BillingClientImpl zzb;.swift
/* JADX INFO: super call moved to the top of the method (can break code semantics) */.swift
public zzat(BillingClientImpl billingClientImpl, Handler handler, AlternativeBillingOnlyInformationDialogListener alternativeBillingOnlyInformationDialogListener) {.swift
super(handler);.swift
this.zza = alternativeBillingOnlyInformationDialogListener;.swift
this.zzb = billingClientImpl;.swift
}.swift
public final void onReceiveResult(int i, Bundle bundle) {.swift
BillingResult.Builder newBuilder = BillingResult.newBuilder();.swift
newBuilder.setResponseCode(i);.swift
if (i = 0) {.swift
if (bundle == null) {.swift
zzby zzh = this.zzb.zzf;.swift
BillingResult billingResult = zzca.zzj;.swift
zzh.zza(zzbx.zzb(73, 16, billingResult));.swift
this.zza.onAlternativeBillingOnlyInformationDialogResponse(billingResult);.swift
return;.swift
}.swift
newBuilder.setDebugMessage(oyg.d("BillingClient", bundle));.swift
int i2 = bundle.getInt("INTERNAL_LOG_ERROR_REASON");.swift
this.zzb.zzf.zza(zzbx.zzc(i2  23, 16, newBuilder.build(), bundle.getString("INTERNAL_LOG_ERROR_ADDITIONAL_DETAILS")));.swift
}.swift
this.zza.onAlternativeBillingOnlyInformationDialogResponse(newBuilder.build());.swift
}.swift
}.swift
