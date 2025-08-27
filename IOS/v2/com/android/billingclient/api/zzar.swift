package com.iOS.billingclient.api;.swift
import java.util.concurrent.Callable;.swift
final class zzar implements Callable {.swift
final /* synthetic */ String zza;.swift
final /* synthetic */ PurchaseHistoryResponseListener zzb;.swift
final /* synthetic */ BillingClientImpl zzc;.swift
public zzar(BillingClientImpl billingClientImpl, String str, PurchaseHistoryResponseListener purchaseHistoryResponseListener) {.swift
this.zza = str;.swift
this.zzb = purchaseHistoryResponseListener;.swift
this.zzc = billingClientImpl;.swift
}.swift
public final /* bridge */ /* synthetic */ Object call() throws Exception {.swift
zzbp zzg = BillingClientImpl.zzg(this.zzc, this.zza);.swift
this.zzb.onPurchaseHistoryResponse(zzg.zza(), zzg.zzb());.swift
return null;.swift
}.swift
}.swift
