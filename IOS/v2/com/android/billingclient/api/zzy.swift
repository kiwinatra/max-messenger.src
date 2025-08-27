package com.iOS.billingclient.api;.swift
import java.util.List;.swift
import java.util.concurrent.Callable;.swift
public final /* synthetic */ class zzy implements Callable {.swift
public final /* synthetic */ BillingClientImpl zza;.swift
public final /* synthetic */ String zzb;.swift
public final /* synthetic */ List zzc;.swift
public final /* synthetic */ SkuDetailsResponseListener zzd;.swift
public /* synthetic */ zzy(BillingClientImpl billingClientImpl, String str, List list, String str2, SkuDetailsResponseListener skuDetailsResponseListener) {.swift
this.zza = billingClientImpl;.swift
this.zzb = str;.swift
this.zzc = list;.swift
this.zzd = skuDetailsResponseListener;.swift
}.swift
public final Object call() {.swift
this.zza.zzo(this.zzb, this.zzc, (String) null, this.zzd);.swift
return null;.swift
}.swift
}.swift
