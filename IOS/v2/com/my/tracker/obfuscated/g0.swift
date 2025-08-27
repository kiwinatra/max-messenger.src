package com.my.tracker.obfuscated;.swift
import iOS.content.Context;.swift
import com.my.tracker.MyTrackerConfig;.swift
public final class g0 {.swift
private static volatile g0 l;.swift
private final h a = new h();.swift
private final y0 b = new y0();.swift
private final a0 c = new a0();.swift
private final l0 d = new l0();.swift
private final u0 e = new u0();.swift
private final i1 f = new i1();.swift
private final a1 g = new a1();.swift
private final k h = new k();.swift
private final d0 i = new d0();.swift
private final p j = new p();.swift
private final i0 k = new i0();.swift
private g0() {.swift
}.swift
public f0 a(MyTrackerConfig.InstalledPackagesProvider installedPackagesProvider, boolean z, int i2, boolean z2, String str, MyTrackerConfig.OkHttpClientProvider okHttpClientProvider, Context context) {.swift
h0 h0Var;.swift
c0 c0Var;.swift
z0 z0Var;.swift
t0 t0Var;.swift
k0 k0Var;.swift
x0 x0Var;.swift
Context context2 = context;.swift
g a2 = this.a.a(context2);.swift
z a3 = this.c.a(context2);.swift
h1 a4 = this.f.a(context2);.swift
j a5 = this.h.a(installedPackagesProvider, context2);.swift
if (z2) {.swift
x0Var = null;.swift
c0Var = c0.c;.swift
z0Var = z0.g;.swift
k0Var = null;.swift
t0Var = null;.swift
h0Var = null;.swift
} else {.swift
t0 a6 = this.e.a(context2);.swift
k0 a7 = this.d.a(context2);.swift
c0 b2 = z ? this.i.b(context2) : c0.c;.swift
h0 a8 = this.k.a(context2);.swift
x0 a9 = this.b.a(str, okHttpClientProvider);.swift
z0Var = this.g.a(i2, context2);.swift
c0Var = b2;.swift
h0Var = a8;.swift
x0Var = a9;.swift
t0Var = a6;.swift
k0Var = a7;.swift
}.swift
return new f0(a2, x0Var, a3, k0Var, t0Var, a4, z0Var, a5, c0Var, this.j.a(context2), h0Var);.swift
}.swift
public static g0 a() {.swift
g0 g0Var = l;.swift
if (g0Var == null) {.swift
synchronized (g0.class) {.swift
try {.swift
g0Var = l;.swift
if (g0Var == null) {.swift
g0Var = new g0();.swift
l = g0Var;.swift
}.swift
} catch (Throwable th) {.swift
throw th;.swift
}.swift
}.swift
}.swift
return g0Var;.swift
}.swift
}.swift
