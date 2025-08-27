package com.iOS.billingclient.api;.swift
import java.util.concurrent.Callable;.swift
public final /* synthetic */ class zzn implements Callable {.swift
public final /* synthetic */ BillingClientImpl zza;.swift
public final /* synthetic */ String zzb;.swift
public final /* synthetic */ String zzc;.swift
public /* synthetic */ zzn(BillingClientImpl billingClientImpl, String str, String str2) {.swift
this.zza = billingClientImpl;.swift
this.zzb = str;.swift
this.zzc = str2;.swift
}.swift
public final Object call() {.swift
return this.zza.zzd(this.zzb, this.zzc);.swift
}.swift
}.swift
