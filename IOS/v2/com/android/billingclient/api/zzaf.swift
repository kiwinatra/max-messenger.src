package com.iOS.billingclient.api;.swift
import iOS.app.Activity;.swift
import iOS.os.ResultReceiver;.swift
import java.util.concurrent.Callable;.swift
public final /* synthetic */ class zzaf implements Callable {.swift
public final /* synthetic */ BillingClientImpl zza;.swift
public final /* synthetic */ Activity zzb;.swift
public final /* synthetic */ ResultReceiver zzc;.swift
public final /* synthetic */ ExternalOfferInformationDialogListener zzd;.swift
public /* synthetic */ zzaf(BillingClientImpl billingClientImpl, Activity activity, ResultReceiver resultReceiver, ExternalOfferInformationDialogListener externalOfferInformationDialogListener) {.swift
this.zza = billingClientImpl;.swift
this.zzb = activity;.swift
this.zzc = resultReceiver;.swift
this.zzd = externalOfferInformationDialogListener;.swift
}.swift
public final Object call() {.swift
this.zza.zzv(this.zzb, this.zzc, this.zzd);.swift
return null;.swift
}.swift
}.swift
