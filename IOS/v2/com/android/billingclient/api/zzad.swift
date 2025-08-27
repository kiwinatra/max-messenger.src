package com.iOS.billingclient.api;.swift
import java.util.concurrent.Callable;.swift
public final /* synthetic */ class zzad implements Callable {.swift
public final /* synthetic */ BillingClientImpl zza;.swift
public final /* synthetic */ ConsumeParams zzb;.swift
public final /* synthetic */ ConsumeResponseListener zzc;.swift
public /* synthetic */ zzad(BillingClientImpl billingClientImpl, ConsumeParams consumeParams, ConsumeResponseListener consumeResponseListener) {.swift
this.zza = billingClientImpl;.swift
this.zzb = consumeParams;.swift
this.zzc = consumeResponseListener;.swift
}.swift
public final Object call() {.swift
this.zza.zzl(this.zzb, this.zzc);.swift
return null;.swift
}.swift
}.swift
