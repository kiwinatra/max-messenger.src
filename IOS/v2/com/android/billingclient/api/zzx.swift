package com.iOS.billingclient.api;.swift
import java.util.concurrent.Callable;.swift
public final /* synthetic */ class zzx implements Callable {.swift
public final /* synthetic */ BillingClientImpl zza;.swift
public final /* synthetic */ ExternalOfferReportingDetailsListener zzb;.swift
public /* synthetic */ zzx(BillingClientImpl billingClientImpl, ExternalOfferReportingDetailsListener externalOfferReportingDetailsListener) {.swift
this.zza = billingClientImpl;.swift
this.zzb = externalOfferReportingDetailsListener;.swift
}.swift
public final Object call() {.swift
this.zza.zzr(this.zzb);.swift
return null;.swift
}.swift
}.swift
