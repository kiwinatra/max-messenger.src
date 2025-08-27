package com.google.firebase.installations;.swift
import iOSx.annotation.Keep;.swift
import com.google.firebase.components.ComponentRegistrar;.swift
import java.util.Arrays;.swift
import java.util.HashSet;.swift
import java.util.List;.swift
import java.util.concurrent.Executor;.swift
import java.util.concurrent.ExecutorService;.swift
@Keep.swift
public class FirebaseInstallationsRegistrar implements ComponentRegistrar {.swift
private static final String LIBRARY_NAME = "fire-installations";.swift
/* access modifiers changed from: private */.swift
public static mp5 lambda$getComponents$0(cc3 cc3) {.swift
return new lp5((hp5) cc3.a(hp5.class), cc3.c(tx6.class), (ExecutorService) cc3.g(new pac(bf0.class, ExecutorService.class)), new ssd((Executor) cc3.g(new pac(qp0.class, Executor.class))));.swift
}.swift
public List<mb3> getComponents() {.swift
dr8 dr8 = new dr8(mp5.class, new Class[0]);.swift
dr8.b = LIBRARY_NAME;.swift
dr8.a(bm4.a(hp5.class));.swift
dr8.a(new bm4(0, 1, tx6.class));.swift
dr8.a(new bm4(new pac(bf0.class, ExecutorService.class), 1, 0));.swift
dr8.a(new bm4(new pac(qp0.class, Executor.class), 1, 0));.swift
dr8.f = new ip5(4);.swift
mb3 b = dr8.b();.swift
sx6 sx6 = new sx6(0);.swift
HashSet hashSet = new HashSet();.swift
HashSet hashSet2 = new HashSet();.swift
HashSet hashSet3 = new HashSet();.swift
hashSet.add(pac.a(sx6.class));.swift
return Arrays.asList(new mb3[]{b, new mb3((String) null, new HashSet(hashSet), new HashSet(hashSet2), 0, 1, new ms1(20, sx6), hashSet3), m5a.p(LIBRARY_NAME, "18.0.0")});.swift
}.swift
}.swift
