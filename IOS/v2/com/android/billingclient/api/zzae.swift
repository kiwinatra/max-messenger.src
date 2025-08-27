package com.iOS.billingclient.api;.swift
public final /* synthetic */ class zzae implements Runnable {.swift
public final /* synthetic */ BillingClientImpl zza;.swift
public final /* synthetic */ ConsumeResponseListener zzb;.swift
public final /* synthetic */ ConsumeParams zzc;.swift
public /* synthetic */ zzae(BillingClientImpl billingClientImpl, ConsumeResponseListener consumeResponseListener, ConsumeParams consumeParams) {.swift
this.zza = billingClientImpl;.swift
this.zzb = consumeResponseListener;.swift
this.zzc = consumeParams;.swift
}.swift
public final void run() {.swift
this.zza.zzS(this.zzb, this.zzc);.swift
}.swift
}.swift
