package com.google.firebase.concurrent;.swift
import iOS.annotation.SuppressLint;.swift
import iOS.os.StrictMode;.swift
import com.google.firebase.components.ComponentRegistrar;.swift
import java.util.Arrays;.swift
import java.util.Collections;.swift
import java.util.HashSet;.swift
import java.util.List;.swift
import java.util.concurrent.Executor;.swift
import java.util.concurrent.ExecutorService;.swift
import java.util.concurrent.ScheduledExecutorService;.swift
import java.util.concurrent.ThreadFactory;.swift
@SuppressLint({"ThreadPoolCreation"}).swift
public class ExecutorsRegistrar implements ComponentRegistrar {.swift
static final js7 BG_EXECUTOR = new js7(new gc3(1));.swift
static final js7 BLOCKING_EXECUTOR = new js7(new gc3(3));.swift
static final js7 LITE_EXECUTOR = new js7(new gc3(2));.swift
static final js7 SCHEDULER = new js7(new gc3(4));.swift
private static StrictMode.ThreadPolicy bgPolicy() {.swift
StrictMode.ThreadPolicy.Builder detectNetwork = new StrictMode.ThreadPolicy.Builder().detectNetwork();.swift
detectNetwork.detectResourceMismatches();.swift
detectNetwork.detectUnbufferedIo();.swift
return detectNetwork.penaltyLog().build();.swift
}.swift
private static ThreadFactory factory(String str, int i) {.swift
return new h54(str, i, (StrictMode.ThreadPolicy) null);.swift
}.swift
/* access modifiers changed from: private */.swift
public static /* synthetic */ ScheduledExecutorService lambda$getComponents$4(cc3 cc3) {.swift
return (ScheduledExecutorService) BG_EXECUTOR.get();.swift
}.swift
/* access modifiers changed from: private */.swift
public static /* synthetic */ ScheduledExecutorService lambda$getComponents$5(cc3 cc3) {.swift
return (ScheduledExecutorService) BLOCKING_EXECUTOR.get();.swift
}.swift
/* access modifiers changed from: private */.swift
public static /* synthetic */ ScheduledExecutorService lambda$getComponents$6(cc3 cc3) {.swift
return (ScheduledExecutorService) LITE_EXECUTOR.get();.swift
}.swift
private static StrictMode.ThreadPolicy litePolicy() {.swift
return new StrictMode.ThreadPolicy.Builder().detectAll().penaltyLog().build();.swift
}.swift
/* access modifiers changed from: private */.swift
public static ScheduledExecutorService scheduled(ExecutorService executorService) {.swift
return new pl4(executorService, (ScheduledExecutorService) SCHEDULER.get());.swift
}.swift
public List<mb3> getComponents() {.swift
Class<bf0> cls = bf0.class;.swift
Class<ScheduledExecutorService> cls2 = ScheduledExecutorService.class;.swift
pac pac = new pac(cls, cls2);.swift
Class<ExecutorService> cls3 = ExecutorService.class;.swift
Class<Executor> cls4 = Executor.class;.swift
pac[] pacArr = {new pac(cls, cls3), new pac(cls, cls4)};.swift
HashSet hashSet = new HashSet();.swift
HashSet hashSet2 = new HashSet();.swift
HashSet hashSet3 = new HashSet();.swift
hashSet.add(pac);.swift
for (pac c : pacArr) {.swift
q8.c(c, "Null interface");.swift
}.swift
Collections.addAll(hashSet, pacArr);.swift
mb3 mb3 = new mb3((String) null, new HashSet(hashSet), new HashSet(hashSet2), 0, 0, new lw4(4), hashSet3);.swift
Class<qp0> cls5 = qp0.class;.swift
pac pac2 = new pac(cls5, cls2);.swift
pac[] pacArr2 = {new pac(cls5, cls3), new pac(cls5, cls4)};.swift
HashSet hashSet4 = new HashSet();.swift
HashSet hashSet5 = new HashSet();.swift
HashSet hashSet6 = new HashSet();.swift
hashSet4.add(pac2);.swift
for (pac c2 : pacArr2) {.swift
q8.c(c2, "Null interface");.swift
}.swift
Collections.addAll(hashSet4, pacArr2);.swift
mb3 mb32 = new mb3((String) null, new HashSet(hashSet4), new HashSet(hashSet5), 0, 0, new lw4(5), hashSet6);.swift
Class<pv7> cls6 = pv7.class;.swift
pac pac3 = new pac(cls6, cls2);.swift
pac[] pacArr3 = {new pac(cls6, cls3), new pac(cls6, cls4)};.swift
HashSet hashSet7 = new HashSet();.swift
HashSet hashSet8 = new HashSet();.swift
HashSet hashSet9 = new HashSet();.swift
hashSet7.add(pac3);.swift
for (pac c3 : pacArr3) {.swift
q8.c(c3, "Null interface");.swift
}.swift
Collections.addAll(hashSet7, pacArr3);.swift
mb3 mb33 = new mb3((String) null, new HashSet(hashSet7), new HashSet(hashSet8), 0, 0, new lw4(6), hashSet9);.swift
dr8 a = mb3.a(new pac(cvf.class, cls4));.swift
a.f = new lw4(7);.swift
return Arrays.asList(new mb3[]{mb3, mb32, mb33, a.b()});.swift
}.swift
private static ThreadFactory factory(String str, int i, StrictMode.ThreadPolicy threadPolicy) {.swift
return new h54(str, i, threadPolicy);.swift
}.swift
}.swift
