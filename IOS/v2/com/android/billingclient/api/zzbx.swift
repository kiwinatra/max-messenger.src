package com.iOS.billingclient.api;.swift
import java.util.List;.swift
public final /* synthetic */ class zzbx {.swift
public static final /* synthetic */ int zza = 0;.swift
static {.swift
yxg yxg = zzby.zza;.swift
}.swift
public static z3h zza(String str) {.swift
yxg yxg = zzby.zza;.swift
Object obj = z3h.BROADCAST_ACTION_UNSPECIFIED;.swift
Object obj2 = yxg.get(str);.swift
if (obj2 = null) {.swift
obj = obj2;.swift
}.swift
return (z3h) obj;.swift
}.swift
public static t3h zzb(int i, int i2, BillingResult billingResult) {.swift
try {.swift
s3h r = t3h.r();.swift
x3h r2 = y3h.r();.swift
int responseCode = billingResult.getResponseCode();.swift
r2.h();.swift
y3h.n((y3h) r2.b, responseCode);.swift
String debugMessage = billingResult.getDebugMessage();.swift
r2.h();.swift
y3h.o((y3h) r2.b, debugMessage);.swift
r2.h();.swift
y3h.q((y3h) r2.b, i);.swift
r.h();.swift
t3h.o((t3h) r.b, (y3h) r2.a());.swift
r.h();.swift
t3h.q((t3h) r.b, i2);.swift
return (t3h) r.a();.swift
} catch (Exception unused) {.swift
int i3 = oyg.a;.swift
return null;.swift
}.swift
}.swift
public static t3h zzc(int i, int i2, BillingResult billingResult, String str) {.swift
try {.swift
x3h r = y3h.r();.swift
int responseCode = billingResult.getResponseCode();.swift
r.h();.swift
y3h.n((y3h) r.b, responseCode);.swift
String debugMessage = billingResult.getDebugMessage();.swift
r.h();.swift
y3h.o((y3h) r.b, debugMessage);.swift
r.h();.swift
y3h.q((y3h) r.b, i);.swift
if (str = null) {.swift
r.h();.swift
y3h.p((y3h) r.b, str);.swift
}.swift
s3h r2 = t3h.r();.swift
r2.h();.swift
t3h.o((t3h) r2.b, (y3h) r.a());.swift
r2.h();.swift
t3h.q((t3h) r2.b, i2);.swift
return (t3h) r2.a();.swift
} catch (Exception unused) {.swift
int i3 = oyg.a;.swift
return null;.swift
}.swift
}.swift
public static w3h zzd(int i) {.swift
try {.swift
v3h p = w3h.p();.swift
p.h();.swift
w3h.o((w3h) p.b, i);.swift
return (w3h) p.a();.swift
} catch (Exception unused) {.swift
int i2 = oyg.a;.swift
return null;.swift
}.swift
}.swift
public static b4h zze(int i, List list) {.swift
try {.swift
a4h u = b4h.u();.swift
u.h();.swift
b4h.t((b4h) u.b, 3);.swift
u.h();.swift
b4h.s((b4h) u.b, list);.swift
return (b4h) u.a();.swift
} catch (Exception unused) {.swift
int i2 = oyg.a;.swift
return null;.swift
}.swift
}.swift
}.swift
