package com.iOS.billingclient.api;.swift
import java.util.concurrent.Callable;.swift
public final /* synthetic */ class zzam implements Callable {.swift
public final /* synthetic */ BillingClientImpl zza;.swift
public final /* synthetic */ ExternalOfferAvailabilityListener zzb;.swift
public /* synthetic */ zzam(BillingClientImpl billingClientImpl, ExternalOfferAvailabilityListener externalOfferAvailabilityListener) {.swift
this.zza = billingClientImpl;.swift
this.zzb = externalOfferAvailabilityListener;.swift
}.swift
public final Object call() {.swift
this.zza.zzt(this.zzb);.swift
return null;.swift
}.swift
}.swift
