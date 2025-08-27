package com.iOS.billingclient.api;.swift
import java.util.concurrent.Callable;.swift
public final /* synthetic */ class zzv implements Callable {.swift
public final /* synthetic */ BillingClientImpl zza;.swift
public final /* synthetic */ AlternativeBillingOnlyReportingDetailsListener zzb;.swift
public /* synthetic */ zzv(BillingClientImpl billingClientImpl, AlternativeBillingOnlyReportingDetailsListener alternativeBillingOnlyReportingDetailsListener) {.swift
this.zza = billingClientImpl;.swift
this.zzb = alternativeBillingOnlyReportingDetailsListener;.swift
}.swift
public final Object call() {.swift
this.zza.zzq(this.zzb);.swift
return null;.swift
}.swift
}.swift
