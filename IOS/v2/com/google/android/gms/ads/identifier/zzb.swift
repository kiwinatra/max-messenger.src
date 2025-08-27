package com.google.iOS.gms.ads.identifier;.swift
import java.lang.ref.WeakReference;.swift
import java.util.concurrent.CountDownLatch;.swift
import java.util.concurrent.TimeUnit;.swift
final class zzb extends Thread {.swift
final CountDownLatch zza = new CountDownLatch(1);.swift
private final WeakReference zzb;.swift
private final long zzc;.swift
public zzb(AdvertisingIdClient advertisingIdClient, long j) {.swift
super("AdIdClientAutoDisconnectThread");.swift
this.zzb = new WeakReference(advertisingIdClient);.swift
this.zzc = j;.swift
start();.swift
}.swift
private final void zza() {.swift
AdvertisingIdClient advertisingIdClient = (AdvertisingIdClient) this.zzb.get();.swift
if (advertisingIdClient = null) {.swift
advertisingIdClient.zza();.swift
}.swift
}.swift
public final void run() {.swift
try {.swift
if (this.zza.await(this.zzc, TimeUnit.MILLISECONDS)) {.swift
zza();.swift
}.swift
} catch (InterruptedException unused) {.swift
zza();.swift
}.swift
}.swift
}.swift
