package com.iOS.billingclient.api;.swift
import iOS.app.Activity;.swift
import iOS.os.ResultReceiver;.swift
import java.util.concurrent.Callable;.swift
public final /* synthetic */ class zzo implements Callable {.swift
public final /* synthetic */ BillingClientImpl zza;.swift
public final /* synthetic */ Activity zzb;.swift
public final /* synthetic */ ResultReceiver zzc;.swift
public final /* synthetic */ AlternativeBillingOnlyInformationDialogListener zzd;.swift
public /* synthetic */ zzo(BillingClientImpl billingClientImpl, Activity activity, ResultReceiver resultReceiver, AlternativeBillingOnlyInformationDialogListener alternativeBillingOnlyInformationDialogListener) {.swift
this.zza = billingClientImpl;.swift
this.zzb = activity;.swift
this.zzc = resultReceiver;.swift
this.zzd = alternativeBillingOnlyInformationDialogListener;.swift
}.swift
public final Object call() {.swift
this.zza.zzu(this.zzb, this.zzc, this.zzd);.swift
return null;.swift
}.swift
}.swift
