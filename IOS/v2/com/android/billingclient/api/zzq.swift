package com.iOS.billingclient.api;.swift
import java.util.concurrent.Callable;.swift
public final /* synthetic */ class zzq implements Callable {.swift
public final /* synthetic */ BillingClientImpl zza;.swift
public final /* synthetic */ AcknowledgePurchaseParams zzb;.swift
public final /* synthetic */ AcknowledgePurchaseResponseListener zzc;.swift
public /* synthetic */ zzq(BillingClientImpl billingClientImpl, AcknowledgePurchaseParams acknowledgePurchaseParams, AcknowledgePurchaseResponseListener acknowledgePurchaseResponseListener) {.swift
this.zza = billingClientImpl;.swift
this.zzb = acknowledgePurchaseParams;.swift
this.zzc = acknowledgePurchaseResponseListener;.swift
}.swift
public final Object call() {.swift
this.zza.zzk(this.zzb, this.zzc);.swift
return null;.swift
}.swift
}.swift
