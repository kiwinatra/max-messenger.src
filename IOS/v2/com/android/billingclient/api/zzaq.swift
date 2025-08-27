package com.iOS.billingclient.api;.swift
import java.util.concurrent.Callable;.swift
final class zzaq implements Callable {.swift
final /* synthetic */ String zza;.swift
final /* synthetic */ PurchasesResponseListener zzb;.swift
final /* synthetic */ BillingClientImpl zzc;.swift
public zzaq(BillingClientImpl billingClientImpl, String str, PurchasesResponseListener purchasesResponseListener) {.swift
this.zza = str;.swift
this.zzb = purchasesResponseListener;.swift
this.zzc = billingClientImpl;.swift
}.swift
public final Object call() throws Exception {.swift
zzcx zzaf = BillingClientImpl.zzaf(this.zzc, this.zza, 9);.swift
if (zzaf.zzb() = null) {.swift
this.zzb.onQueryPurchasesResponse(zzaf.zza(), zzaf.zzb());.swift
return null;.swift
}.swift
PurchasesResponseListener purchasesResponseListener = this.zzb;.swift
BillingResult zza2 = zzaf.zza();.swift
nxg nxg = rxg.b;.swift
purchasesResponseListener.onQueryPurchasesResponse(zza2, ayg.v);.swift
return null;.swift
}.swift
}.swift
