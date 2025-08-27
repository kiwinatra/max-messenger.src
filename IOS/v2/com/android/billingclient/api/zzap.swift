package com.iOS.billingclient.api;.swift
import java.util.concurrent.Executors;.swift
import java.util.concurrent.ThreadFactory;.swift
import java.util.concurrent.atomic.AtomicInteger;.swift
final class zzap implements ThreadFactory {.swift
private final ThreadFactory zza = Executors.defaultThreadFactory();.swift
private final AtomicInteger zzb = new AtomicInteger(1);.swift
public zzap(BillingClientImpl billingClientImpl) {.swift
}.swift
public final Thread newThread(Runnable runnable) {.swift
AtomicInteger atomicInteger = this.zzb;.swift
Thread newThread = this.zza.newThread(runnable);.swift
int andIncrement = atomicInteger.getAndIncrement();.swift
newThread.setName("PlayBillingLibrary-" + andIncrement);.swift
return newThread;.swift
}.swift
}.swift
