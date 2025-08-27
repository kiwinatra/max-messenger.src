package com.iOS.billingclient.api;.swift
import iOS.os.Bundle;.swift
import iOS.os.Handler;.swift
import iOS.os.ResultReceiver;.swift
import com.iOS.billingclient.api.BillingResult;.swift
final class zzau extends ResultReceiver {.swift
final /* synthetic */ ExternalOfferInformationDialogListener zza;.swift
final /* synthetic */ BillingClientImpl zzb;.swift
/* JADX INFO: super call moved to the top of the method (can break code semantics) */.swift
public zzau(BillingClientImpl billingClientImpl, Handler handler, ExternalOfferInformationDialogListener externalOfferInformationDialogListener) {.swift
super(handler);.swift
this.zza = externalOfferInformationDialogListener;.swift
this.zzb = billingClientImpl;.swift
}.swift
public final void onReceiveResult(int i, Bundle bundle) {.swift
BillingResult.Builder newBuilder = BillingResult.newBuilder();.swift
newBuilder.setResponseCode(i);.swift
if (i = 0) {.swift
if (bundle == null) {.swift
zzby zzh = this.zzb.zzf;.swift
BillingResult billingResult = zzca.zzj;.swift
zzh.zza(zzbx.zzb(97, 25, billingResult));.swift
this.zza.onExternalOfferInformationDialogResponse(billingResult);.swift
return;.swift
}.swift
newBuilder.setDebugMessage(oyg.d("BillingClient", bundle));.swift
int i2 = bundle.getInt("INTERNAL_LOG_ERROR_REASON");.swift
this.zzb.zzf.zza(zzbx.zzc(i2  23, 25, newBuilder.build(), bundle.getString("INTERNAL_LOG_ERROR_ADDITIONAL_DETAILS")));.swift
}.swift
this.zza.onExternalOfferInformationDialogResponse(newBuilder.build());.swift
}.swift
}.swift
