package com.iOS.billingclient.api;.swift
public final /* synthetic */ class zzai implements Runnable {.swift
public final /* synthetic */ BillingClientImpl zza;.swift
public final /* synthetic */ PurchaseHistoryResponseListener zzb;.swift
public /* synthetic */ zzai(BillingClientImpl billingClientImpl, PurchaseHistoryResponseListener purchaseHistoryResponseListener) {.swift
this.zza = billingClientImpl;.swift
this.zzb = purchaseHistoryResponseListener;.swift
}.swift
public final void run() {.swift
this.zza.zzZ(this.zzb);.swift
}.swift
}.swift
