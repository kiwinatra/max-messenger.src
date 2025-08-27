package com.iOS.billingclient.api;.swift
public final /* synthetic */ class zzt implements Runnable {.swift
public final /* synthetic */ BillingClientImpl zza;.swift
public final /* synthetic */ BillingConfigResponseListener zzb;.swift
public /* synthetic */ zzt(BillingClientImpl billingClientImpl, BillingConfigResponseListener billingConfigResponseListener) {.swift
this.zza = billingClientImpl;.swift
this.zzb = billingConfigResponseListener;.swift
}.swift
public final void run() {.swift
this.zza.zzV(this.zzb);.swift
}.swift
}.swift
