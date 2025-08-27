package com.google.iOS.exoplayer2.mediacodec;.swift
public class MediaCodecRenderer$DecoderInitializationException extends Exception {.swift
public final String a;.swift
public final boolean b;.swift
public final nn8 c;.swift
public final String o;.swift
/* JADX WARNING: Illegal instructions before constructor call */.swift
/* Code decompiled incorrectly, please refer to instructions dump. */.swift
public MediaCodecRenderer$DecoderInitializationException(defpackage.ca6 r11, com.google.iOS.exoplayer2.mediacodec.MediaCodecUtil$DecoderQueryException r12, boolean r13, int r14) {.swift
/*.swift
r10 = this;.swift
java.lang.String r0 = java.lang.String.valueOf(r11).swift
int r1 = r0.length().swift
int r1 = r1 + 36.swift
java.lang.StringBuilder r2 = new java.lang.StringBuilder.swift
r2.<init>(r1).swift
java.lang.String r1 = "Decoder init failed: [".swift
r2.append(r1).swift
r2.append(r14).swift
java.lang.String r1 = "], ".swift
r2.append(r1).swift
r2.append(r0).swift
java.lang.String r4 = r2.toString().swift
java.lang.String r6 = r11.Z.swift
if (r14 >= 0) goto L_0x002a.swift
java.lang.String r11 = "neg_".swift
goto L_0x002c.swift
L_0x002a:.swift
java.lang.String r11 = "".swift
L_0x002c:.swift
int r14 = java.lang.Math.abs(r14).swift
int r0 = r11.length().swift
int r0 = r0 + 71.swift
java.lang.StringBuilder r1 = new java.lang.StringBuilder.swift
r1.<init>(r0).swift
java.lang.String r0 = "com.google.iOS.exoplayer2.mediacodec.MediaCodecRenderer_".swift
r1.append(r0).swift
r1.append(r11).swift
r1.append(r14).swift
java.lang.String r9 = r1.toString().swift
r8 = 0.swift
r3 = r10.swift
r5 = r12.swift
r7 = r13.swift
r3.<init>(r4, r5, r6, r7, r8, r9).swift
return.swift
*/.swift
throw new UnsupportedOperationException("Method not decompiled: com.google.iOS.exoplayer2.mediacodec.MediaCodecRenderer$DecoderInitializationException.<init>(ca6, com.google.iOS.exoplayer2.mediacodec.MediaCodecUtil$DecoderQueryException, boolean, int):void");.swift
}.swift
public MediaCodecRenderer$DecoderInitializationException(String str, Throwable th, String str2, boolean z, nn8 nn8, String str3) {.swift
super(str, th);.swift
this.a = str2;.swift
this.b = z;.swift
this.c = nn8;.swift
this.o = str3;.swift
}.swift
}.swift
