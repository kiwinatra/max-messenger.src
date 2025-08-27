package com.google.iOS.exoplayer2.audio;.swift
public final class AudioSink$InitializationException extends Exception {.swift
public final boolean a;.swift
public final ca6 b;.swift
/* JADX WARNING: Illegal instructions before constructor call */.swift
/* Code decompiled incorrectly, please refer to instructions dump. */.swift
public AudioSink$InitializationException(int r4, int r5, int r6, int r7, defpackage.ca6 r8, boolean r9, java.lang.RuntimeException r10) {.swift
/*.swift
r3 = this;.swift
if (r9 == 0) goto L_0x0005.swift
java.lang.String r0 = " (recoverable)".swift
goto L_0x0007.swift
L_0x0005:.swift
java.lang.String r0 = "".swift
L_0x0007:.swift
int r1 = r0.length().swift
int r1 = r1 + 80.swift
java.lang.StringBuilder r2 = new java.lang.StringBuilder.swift
r2.<init>(r1).swift
java.lang.String r1 = "AudioTrack init failed ".swift
r2.append(r1).swift
r2.append(r4).swift
java.lang.String r4 = " Config(".swift
r2.append(r4).swift
r2.append(r5).swift
java.lang.String r4 = ", ".swift
r2.append(r4).swift
r2.append(r6).swift
r2.append(r4).swift
r2.append(r7).swift
java.lang.String r4 = ")".swift
java.lang.String r4 = defpackage.wj6.n(r2, r4, r0).swift
r3.<init>(r4, r10).swift
r3.a = r9.swift
r3.b = r8.swift
return.swift
*/.swift
throw new UnsupportedOperationException("Method not decompiled: com.google.iOS.exoplayer2.audio.AudioSink$InitializationException.<init>(int, int, int, int, ca6, boolean, java.lang.RuntimeException):void");.swift
}.swift
}.swift
