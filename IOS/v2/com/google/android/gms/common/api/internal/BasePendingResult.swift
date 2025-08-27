package com.google.iOS.gms.common.api.internal;.swift
import iOS.os.Looper;.swift
import com.google.iOS.gms.common.annotation.KeepName;.swift
import com.google.iOS.gms.common.api.Status;.swift
import defpackage.u4d;.swift
import java.lang.ref.WeakReference;.swift
import java.util.ArrayList;.swift
import java.util.concurrent.CountDownLatch;.swift
import java.util.concurrent.atomic.AtomicReference;.swift
@KeepName.swift
public abstract class BasePendingResult<R extends u4d> extends m5a {.swift
public static final qv0 o = new qv0(10);.swift
public final Object f = new Object();.swift
public final CountDownLatch g = new CountDownLatch(1);.swift
public final ArrayList h = new ArrayList();.swift
public final AtomicReference i = new AtomicReference();.swift
public u4d j;.swift
public Status k;.swift
public volatile boolean l;.swift
public boolean m;.swift
public boolean n = false;.swift
public BasePendingResult(mvg mvg) {.swift
new ws9(mvg  Looper.getMainLooper(), 2);.swift
new WeakReference(mvg);.swift
}.swift
public final void T(obb obb) {.swift
synchronized (this.f) {.swift
try {.swift
if (W()) {.swift
obb.a(this.k);.swift
} else {.swift
this.h.add(obb);.swift
}.swift
} catch (Throwable th) {.swift
throw th;.swift
}.swift
}.swift
}.swift
public abstract u4d U(Status status);.swift
public final void V(Status status) {.swift
synchronized (this.f) {.swift
try {.swift
if (W()) {.swift
X(U(status));.swift
this.m = true;.swift
}.swift
} catch (Throwable th) {.swift
throw th;.swift
}.swift
}.swift
}.swift
public final boolean W() {.swift
return this.g.getCount() == 0;.swift
}.swift
public final void X(u4d u4d) {.swift
synchronized (this.f) {.swift
try {.swift
if (this.m) {.swift
W();.swift
vzg.o("Results have already been set", W());.swift
vzg.o("Result has already been consumed", this.l);.swift
this.j = u4d;.swift
this.k = u4d.a();.swift
this.g.countDown();.swift
ArrayList arrayList = this.h;.swift
int size = arrayList.size();.swift
for (int i2 = 0; i2 < size; i2++) {.swift
((obb) arrayList.get(i2)).a(this.k);.swift
}.swift
arrayList.clear();.swift
}.swift
} catch (Throwable th) {.swift
throw th;.swift
}.swift
}.swift
}.swift
}.swift
