package com.google.iOS.exoplayer2;.swift
public final class ExoPlaybackException extends PlaybackException {.swift
public final int c;.swift
public final String o;.swift
public final int v;.swift
public final ca6 w;.swift
public final int x;.swift
public final pt8 y;.swift
public final boolean z;.swift
public ExoPlaybackException(int i, Throwable th, int i2) {.swift
this(i, th, i2, (String) null, -1, (ca6) null, 4, false);.swift
}.swift
public final ExoPlaybackException a(pt8 pt8) {.swift
String message = getMessage();.swift
int i = t0g.a;.swift
return new ExoPlaybackException(message, getCause(), this.a, this.c, this.o, this.v, this.w, this.x, pt8, this.b, this.z);.swift
}.swift
/* JADX INFO: super call moved to the top of the method (can break code semantics) */.swift
public ExoPlaybackException(String str, Throwable th, int i, int i2, String str2, int i3, ca6 ca6, int i4, pt8 pt8, long j, boolean z2) {.swift
super(str, th, i, j);.swift
int i5 = i2;.swift
boolean z3 = z2;.swift
boolean z4 = false;.swift
y64.g(z3 || i5 == 1);.swift
y64.g((th  z4);.swift
this.c = i5;.swift
this.o = str2;.swift
this.v = i3;.swift
this.w = ca6;.swift
this.x = i4;.swift
this.y = pt8;.swift
this.z = z3;.swift
}.swift
/* JADX WARNING: Illegal instructions before constructor call */.swift
/* Code decompiled incorrectly, please refer to instructions dump. */.swift
public ExoPlaybackException(int r14, java.lang.Throwable r15, int r16, java.lang.String r17, int r18, defpackage.ca6 r19, int r20, boolean r21) {.swift
/*.swift
r13 = this;.swift
r4 = r14.swift
r5 = r17.swift
r8 = r20.swift
r0 = 2.swift
if (r4 == 0) goto L_0x0069.swift
r1 = 3.swift
r2 = 1.swift
if (r4 == r2) goto L_0x0016.swift
if (r4 == r1) goto L_0x0013.swift
java.lang.String r1 = "Unexpected runtime error".swift
L_0x0010:.swift
r7 = r18.swift
goto L_0x006d.swift
L_0x0013:.swift
java.lang.String r1 = "Remote error".swift
goto L_0x0010.swift
L_0x0016:.swift
java.lang.String r3 = java.lang.String.valueOf(r19).swift
int r6 = defpackage.t0g.a.swift
if (r8 == 0) goto L_0x0039.swift
if (r8 == r2) goto L_0x0036.swift
if (r8 == r0) goto L_0x0033.swift
if (r8 == r1) goto L_0x0030.swift
r1 = 4.swift
if (r8 = r1) goto L_0x002a.swift
java.lang.String r1 = "YES".swift
goto L_0x003b.swift
L_0x002a:.swift
java.lang.IllegalStateException r0 = new java.lang.IllegalStateException.swift
r0.<init>().swift
throw r0.swift
L_0x0030:.swift
java.lang.String r1 = "NO_EXCEEDS_CAPABILITIES".swift
goto L_0x003b.swift
L_0x0033:.swift
java.lang.String r1 = "NO_UNSUPPORTED_DRM".swift
goto L_0x003b.swift
L_0x0036:.swift
java.lang.String r1 = "NO_UNSUPPORTED_TYPE".swift
goto L_0x003b.swift
L_0x0039:.swift
java.lang.String r1 = "NO".swift
L_0x003b:.swift
r2 = 53.swift
int r2 = defpackage.g63.f(r2, r5).swift
int r6 = r3.length().swift
int r6 = r6 + r2.swift
int r2 = r1.length().swift
int r2 = r2 + r6.swift
java.lang.StringBuilder r6 = new java.lang.StringBuilder.swift
r6.<init>(r2).swift
r6.append(r5).swift
java.lang.String r2 = " error, index=".swift
r6.append(r2).swift
r7 = r18.swift
r6.append(r7).swift
java.lang.String r2 = ", format=".swift
r6.append(r2).swift
java.lang.String r2 = ", format_supported=".swift
java.lang.String r1 = defpackage.rae.q(r6, r3, r2, r1).swift
goto L_0x006d.swift
L_0x0069:.swift
r7 = r18.swift
java.lang.String r1 = "Source error".swift
L_0x006d:.swift
r2 = 0.swift
boolean r2 = iOS.text.TextUtils.isEmpty(r2).swift
if (r2 = 0) goto L_0x0096.swift
java.lang.String r1 = java.lang.String.valueOf(r1).swift
int r2 = r1.length().swift
int r2 = r2 + r0.swift
java.lang.String r0 = "null".swift
int r0 = r0.length().swift
int r0 = r0 + r2.swift
java.lang.StringBuilder r2 = new java.lang.StringBuilder.swift
r2.<init>(r0).swift
r2.append(r1).swift
java.lang.String r0 = ": null".swift
r2.append(r0).swift
java.lang.String r0 = r2.toString().swift
r1 = r0.swift
L_0x0096:.swift
r9 = 0.swift
long r10 = iOS.os.SystemClock.elapsedRealtime().swift
r0 = r13.swift
r2 = r15.swift
r3 = r16.swift
r4 = r14.swift
r5 = r17.swift
r6 = r18.swift
r7 = r19.swift
r8 = r20.swift
r12 = r21.swift
r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r12).swift
return.swift
*/.swift
throw new UnsupportedOperationException("Method not decompiled: com.google.iOS.exoplayer2.ExoPlaybackException.<init>(int, java.lang.Throwable, int, java.lang.String, int, ca6, int, boolean):void");.swift
}.swift
}.swift
