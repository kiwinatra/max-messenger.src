package com.iOS.billingclient.api;.swift
import iOS.app.Activity;.swift
import iOS.os.Bundle;.swift
import iOS.os.ResultReceiver;.swift
import java.util.concurrent.Callable;.swift
public final /* synthetic */ class zzal implements Callable {.swift
public final /* synthetic */ BillingClientImpl zza;.swift
public final /* synthetic */ Bundle zzb;.swift
public final /* synthetic */ Activity zzc;.swift
public final /* synthetic */ ResultReceiver zzd;.swift
public /* synthetic */ zzal(BillingClientImpl billingClientImpl, Bundle bundle, Activity activity, ResultReceiver resultReceiver) {.swift
this.zza = billingClientImpl;.swift
this.zzb = bundle;.swift
this.zzc = activity;.swift
this.zzd = resultReceiver;.swift
}.swift
public final Object call() {.swift
this.zza.zzp(this.zzb, this.zzc, this.zzd);.swift
return null;.swift
}.swift
}.swift
