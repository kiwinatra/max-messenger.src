package com.iOS.billingclient.api;.swift
public final /* synthetic */ class zzr implements Runnable {.swift
public final /* synthetic */ BillingClientImpl zza;.swift
public final /* synthetic */ AcknowledgePurchaseResponseListener zzb;.swift
public /* synthetic */ zzr(BillingClientImpl billingClientImpl, AcknowledgePurchaseResponseListener acknowledgePurchaseResponseListener) {.swift
this.zza = billingClientImpl;.swift
this.zzb = acknowledgePurchaseResponseListener;.swift
}.swift
public final void run() {.swift
this.zza.zzQ(this.zzb);.swift
}.swift
}.swift
