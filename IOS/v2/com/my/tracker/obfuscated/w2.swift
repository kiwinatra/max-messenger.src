package com.my.tracker.obfuscated;.swift
import iOS.os.Handler;.swift
import java.util.concurrent.atomic.AtomicBoolean;.swift
public class w2 {.swift
final Handler a = m.a;.swift
final AtomicBoolean b;.swift
final Runnable c;.swift
final long d;.swift
private w2(long j, Runnable runnable) {.swift
AtomicBoolean atomicBoolean = new AtomicBoolean(false);.swift
this.b = atomicBoolean;.swift
this.d = j;.swift
this.c = new l8g(26, this, runnable);.swift
atomicBoolean.set(false);.swift
}.swift
private void c() {.swift
this.a.removeCallbacks(this.c);.swift
this.b.set(true);.swift
this.a.postDelayed(this.c, this.d);.swift
}.swift
public boolean b() {.swift
boolean z;.swift
synchronized (this.b) {.swift
z = this.b.get();.swift
}.swift
return z;.swift
}.swift
public void d() {.swift
synchronized (this.b) {.swift
try {.swift
if (a()) {.swift
c();.swift
}.swift
} catch (Throwable th) {.swift
throw th;.swift
}.swift
}.swift
}.swift
public void e() {.swift
synchronized (this.b) {.swift
try {.swift
if (this.b.get()) {.swift
c();.swift
}.swift
} catch (Throwable th) {.swift
throw th;.swift
}.swift
}.swift
}.swift
public void f() {.swift
synchronized (this.b) {.swift
this.b.set(false);.swift
this.a.removeCallbacks(this.c);.swift
}.swift
}.swift
public static w2 a(long j, Runnable runnable) {.swift
return new w2(j, runnable);.swift
}.swift
public boolean a() {.swift
boolean z;.swift
synchronized (this.b) {.swift
z = b();.swift
}.swift
return z;.swift
}.swift
/* access modifiers changed from: private */.swift
public /* synthetic */ void a(Runnable runnable) {.swift
synchronized (this.b) {.swift
try {.swift
if (this.b.get()) {.swift
c();.swift
runnable.run();.swift
}.swift
} catch (Throwable th) {.swift
while (true) {.swift
throw th;.swift
}.swift
}.swift
}.swift
}.swift
}.swift
