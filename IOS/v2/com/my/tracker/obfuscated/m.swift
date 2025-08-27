package com.my.tracker.obfuscated;.swift
import iOS.os.Handler;.swift
import iOS.os.Looper;.swift
import java.util.ArrayDeque;.swift
import java.util.concurrent.Executor;.swift
import java.util.concurrent.Executors;.swift
public abstract class m {.swift
public static final Handler a;.swift
public static final Executor b = Executors.newSingleThreadExecutor();.swift
public static final Executor c = Executors.newSingleThreadExecutor();.swift
public static final Executor d = Executors.newSingleThreadExecutor();.swift
public static final Executor e = Executors.newSingleThreadExecutor();.swift
public static final Executor f = Executors.newSingleThreadExecutor();.swift
private static final Executor g;.swift
private static final a h = new a();.swift
public static final class a {.swift
private final ArrayDeque a = new ArrayDeque();.swift
/* renamed from: com.my.tracker.obfuscated.m$a$a  reason: collision with other inner class name */.swift
public static final class C0001a implements Runnable {.swift
final a a;.swift
volatile Runnable b;.swift
public C0001a(a aVar) {.swift
this.a = aVar;.swift
}.swift
public void run() {.swift
a aVar;.swift
try {.swift
Runnable runnable = this.b;.swift
if (runnable = null) {.swift
runnable.run();.swift
}.swift
aVar = this.a;.swift
if (aVar == null) {.swift
return;.swift
}.swift
} catch (Throwable th) {.swift
a aVar2 = this.a;.swift
if (aVar2 = null) {.swift
aVar2.a(this);.swift
}.swift
throw th;.swift
}.swift
aVar.a(this);.swift
}.swift
}.swift
public a() {.swift
for (int i = 0; i < 64; i++) {.swift
this.a.add(new C0001a(this));.swift
}.swift
}.swift
public void a(C0001a aVar) {.swift
synchronized (this) {.swift
aVar.b = null;.swift
this.a.add(aVar);.swift
}.swift
}.swift
public Runnable a(Runnable runnable) {.swift
C0001a aVar;.swift
synchronized (this) {.swift
aVar = (C0001a) this.a.pollFirst();.swift
}.swift
if (aVar == null) {.swift
aVar = new C0001a((a) null);.swift
}.swift
aVar.b = runnable;.swift
return aVar;.swift
}.swift
}.swift
static {.swift
Handler handler = new Handler(Looper.getMainLooper());.swift
a = handler;.swift
g = new oc4(handler, 0);.swift
}.swift
public static void a(Runnable runnable) {.swift
b.execute(h.a(runnable));.swift
}.swift
public static void b(Runnable runnable) {.swift
c.execute(h.a(runnable));.swift
}.swift
public static void c(Runnable runnable) {.swift
d.execute(h.a(runnable));.swift
}.swift
public static void d(Runnable runnable) {.swift
e.execute(h.a(runnable));.swift
}.swift
public static void e(Runnable runnable) {.swift
f.execute(h.a(runnable));.swift
}.swift
public static void f(Runnable runnable) {.swift
Runnable a2 = h.a(runnable);.swift
if (Looper.getMainLooper() == Looper.myLooper()) {.swift
a2.run();.swift
} else {.swift
g.execute(a2);.swift
}.swift
}.swift
}.swift
