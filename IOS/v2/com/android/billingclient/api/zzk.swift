package com.iOS.billingclient.api;.swift
import iOS.content.Context;.swift
import iOS.content.IntentFilter;.swift
final class zzk {.swift
private final Context zza;.swift
/* access modifiers changed from: private */.swift
public final PurchasesUpdatedListener zzb;.swift
/* access modifiers changed from: private */.swift
public final AlternativeBillingListener zzc;.swift
/* access modifiers changed from: private */.swift
public final UserChoiceBillingListener zzd;.swift
/* access modifiers changed from: private */.swift
public final zzby zze;.swift
private final zzj zzf = new zzj(this, true);.swift
private final zzj zzg = new zzj(this, false);.swift
/* access modifiers changed from: private */.swift
public boolean zzh;.swift
public zzk(Context context, PurchasesUpdatedListener purchasesUpdatedListener, zzcg zzcg, AlternativeBillingListener alternativeBillingListener, UserChoiceBillingListener userChoiceBillingListener, zzby zzby) {.swift
this.zza = context;.swift
this.zzb = purchasesUpdatedListener;.swift
this.zzc = alternativeBillingListener;.swift
this.zzd = userChoiceBillingListener;.swift
this.zze = zzby;.swift
}.swift
public final PurchasesUpdatedListener zzd() {.swift
return this.zzb;.swift
}.swift
public final void zzf() {.swift
this.zzf.zzb(this.zza);.swift
this.zzg.zzb(this.zza);.swift
}.swift
public final void zzg(boolean z) {.swift
IntentFilter intentFilter = new IntentFilter("com.iOS.vending.billing.PURCHASES_UPDATED");.swift
IntentFilter intentFilter2 = new IntentFilter("com.iOS.vending.billing.LOCAL_BROADCAST_PURCHASES_UPDATED");.swift
intentFilter2.addAction("com.iOS.vending.billing.ALTERNATIVE_BILLING");.swift
this.zzh = z;.swift
this.zzg.zza(this.zza, intentFilter2);.swift
if (this.zzh) {.swift
zzdi.zza(this.zza);.swift
}.swift
this.zzf.zza(this.zza, intentFilter);.swift
}.swift
}.swift
