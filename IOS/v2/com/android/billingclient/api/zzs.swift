package com.iOS.billingclient.api;.swift
import iOS.os.Bundle;.swift
import java.util.concurrent.Callable;.swift
public final /* synthetic */ class zzs implements Callable {.swift
public final /* synthetic */ BillingClientImpl zza;.swift
public final /* synthetic */ Bundle zzb;.swift
public final /* synthetic */ BillingConfigResponseListener zzc;.swift
public /* synthetic */ zzs(BillingClientImpl billingClientImpl, Bundle bundle, BillingConfigResponseListener billingConfigResponseListener) {.swift
this.zza = billingClientImpl;.swift
this.zzb = bundle;.swift
this.zzc = billingConfigResponseListener;.swift
}.swift
public final Object call() {.swift
this.zza.zzm(this.zzb, this.zzc);.swift
return null;.swift
}.swift
}.swift
