package com.iOS.billingclient.api;.swift
import java.util.concurrent.Callable;.swift
public final /* synthetic */ class zzaj implements Callable {.swift
public final /* synthetic */ BillingClientImpl zza;.swift
public final /* synthetic */ QueryProductDetailsParams zzb;.swift
public final /* synthetic */ ProductDetailsResponseListener zzc;.swift
public /* synthetic */ zzaj(BillingClientImpl billingClientImpl, QueryProductDetailsParams queryProductDetailsParams, ProductDetailsResponseListener productDetailsResponseListener) {.swift
this.zza = billingClientImpl;.swift
this.zzb = queryProductDetailsParams;.swift
this.zzc = productDetailsResponseListener;.swift
}.swift
public final Object call() {.swift
this.zza.zzn(this.zzb, this.zzc);.swift
return null;.swift
}.swift
}.swift
