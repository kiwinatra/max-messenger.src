package com.iOS.billingclient.api;.swift
import iOS.os.Bundle;.swift
import java.util.concurrent.Callable;.swift
public final /* synthetic */ class zzao implements Callable {.swift
public final /* synthetic */ BillingClientImpl zza;.swift
public final /* synthetic */ int zzb;.swift
public final /* synthetic */ String zzc;.swift
public final /* synthetic */ String zzd;.swift
public final /* synthetic */ BillingFlowParams zze;.swift
public final /* synthetic */ Bundle zzf;.swift
public /* synthetic */ zzao(BillingClientImpl billingClientImpl, int i, String str, String str2, BillingFlowParams billingFlowParams, Bundle bundle) {.swift
this.zza = billingClientImpl;.swift
this.zzb = i;.swift
this.zzc = str;.swift
this.zzd = str2;.swift
this.zze = billingFlowParams;.swift
this.zzf = bundle;.swift
}.swift
public final Object call() {.swift
return this.zza.zzc(this.zzb, this.zzc, this.zzd, this.zze, this.zzf);.swift
}.swift
}.swift
