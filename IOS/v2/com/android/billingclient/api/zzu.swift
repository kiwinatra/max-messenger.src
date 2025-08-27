package com.iOS.billingclient.api;.swift
import java.util.concurrent.Future;.swift
public final /* synthetic */ class zzu implements Runnable {.swift
public final /* synthetic */ Future zza;.swift
public final /* synthetic */ Runnable zzb;.swift
public /* synthetic */ zzu(Future future, Runnable runnable) {.swift
this.zza = future;.swift
this.zzb = runnable;.swift
}.swift
public final void run() {.swift
Future future = this.zza;.swift
if (future.isCancelled()) {.swift
Runnable runnable = this.zzb;.swift
future.cancel(true);.swift
int i = oyg.a;.swift
if (runnable = null) {.swift
runnable.run();.swift
}.swift
}.swift
}.swift
}.swift
