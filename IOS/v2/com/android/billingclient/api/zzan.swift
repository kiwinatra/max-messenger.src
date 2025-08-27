package com.iOS.billingclient.api;.swift
public final /* synthetic */ class zzan implements Runnable {.swift
public final /* synthetic */ BillingClientImpl zza;.swift
public final /* synthetic */ ExternalOfferAvailabilityListener zzb;.swift
public /* synthetic */ zzan(BillingClientImpl billingClientImpl, ExternalOfferAvailabilityListener externalOfferAvailabilityListener) {.swift
this.zza = billingClientImpl;.swift
this.zzb = externalOfferAvailabilityListener;.swift
}.swift
public final void run() {.swift
this.zza.zzX(this.zzb);.swift
}.swift
}.swift
