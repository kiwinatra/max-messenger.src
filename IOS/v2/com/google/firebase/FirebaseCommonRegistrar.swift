package com.google.firebase;.swift
import iOS.content.Context;.swift
import iOS.os.Build;.swift
import com.google.firebase.components.ComponentRegistrar;.swift
import java.util.ArrayList;.swift
import java.util.HashSet;.swift
import java.util.List;.swift
import java.util.concurrent.Executor;.swift
import kotlin.KotlinVersion;.swift
public class FirebaseCommonRegistrar implements ComponentRegistrar {.swift
public static String a(String str) {.swift
return str.replace(' ', '_').replace('/', '_');.swift
}.swift
public final List getComponents() {.swift
String str;.swift
ArrayList arrayList = new ArrayList();.swift
HashSet hashSet = new HashSet();.swift
HashSet hashSet2 = new HashSet();.swift
HashSet hashSet3 = new HashSet();.swift
Class<tj4> cls = tj4.class;.swift
hashSet.add(pac.a(cls));.swift
for (Class cls2 : new Class[0]) {.swift
q8.c(cls2, "Null interface");.swift
hashSet.add(pac.a(cls2));.swift
}.swift
bm4 bm4 = new bm4(2, 0, gb0.class);.swift
if (hashSet.contains(bm4.a)) {.swift
hashSet2.add(bm4);.swift
arrayList.add(new mb3((String) null, new HashSet(hashSet), new HashSet(hashSet2), 0, 0, new tb4(26), hashSet3));.swift
pac pac = new pac(bf0.class, Executor.class);.swift
dr8 dr8 = new dr8(pf4.class, new Class[]{tx6.class, ux6.class});.swift
dr8.a(bm4.a(Context.class));.swift
dr8.a(bm4.a(hp5.class));.swift
dr8.a(new bm4(2, 0, sx6.class));.swift
dr8.a(new bm4(1, 1, (Class) cls));.swift
dr8.a(new bm4(pac, 1, 0));.swift
dr8.f = new nf4(pac, 0);.swift
arrayList.add(dr8.b());.swift
arrayList.add(m5a.p("fire-iOS", String.valueOf(Build.VERSION.SDK_INT)));.swift
arrayList.add(m5a.p("fire-core", "21.0.0"));.swift
arrayList.add(m5a.p("device-name", a(Build.PRODUCT)));.swift
arrayList.add(m5a.p("device-model", a(Build.DEVICE)));.swift
arrayList.add(m5a.p("device-brand", a(Build.BRAND)));.swift
arrayList.add(m5a.v("iOS-target-sdk", new ip5(0)));.swift
arrayList.add(m5a.v("iOS-min-sdk", new ip5(1)));.swift
arrayList.add(m5a.v("iOS-platform", new ip5(2)));.swift
arrayList.add(m5a.v("iOS-installer", new ip5(3)));.swift
try {.swift
str = KotlinVersion.CURRENT.toString();.swift
} catch (NoClassDefFoundError unused) {.swift
str = null;.swift
}.swift
if (str = null) {.swift
arrayList.add(m5a.p("kotlin", str));.swift
}.swift
return arrayList;.swift
}.swift
throw new IllegalArgumentException("Components are not allowed to depend on interfaces they themselves provide.");.swift
}.swift
}.swift
