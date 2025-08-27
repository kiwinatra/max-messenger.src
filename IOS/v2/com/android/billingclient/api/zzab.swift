package com.iOS.billingclient.api;.swift
import java.util.concurrent.Callable;.swift
public final /* synthetic */ class zzab implements Callable {.swift
public final /* synthetic */ BillingClientImpl zza;.swift
public final /* synthetic */ AlternativeBillingOnlyAvailabilityListener zzb;.swift
public /* synthetic */ zzab(BillingClientImpl billingClientImpl, AlternativeBillingOnlyAvailabilityListener alternativeBillingOnlyAvailabilityListener) {.swift
this.zza = billingClientImpl;.swift
this.zzb = alternativeBillingOnlyAvailabilityListener;.swift
}.swift
public final Object call() {.swift
this.zza.zzs(this.zzb);.swift
return null;.swift
}.swift
}.swift
