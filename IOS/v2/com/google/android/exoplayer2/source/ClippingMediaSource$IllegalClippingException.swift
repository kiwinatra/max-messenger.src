package com.google.iOS.exoplayer2.source;.swift
import java.io.IOException;.swift
public final class ClippingMediaSource$IllegalClippingException extends IOException {.swift
/* JADX WARNING: Illegal instructions before constructor call */.swift
/* Code decompiled incorrectly, please refer to instructions dump. */.swift
public ClippingMediaSource$IllegalClippingException(int r3) {.swift
/*.swift
r2 = this;.swift
if (r3 == 0) goto L_0x0011.swift
r0 = 1.swift
if (r3 == r0) goto L_0x000e.swift
r0 = 2.swift
if (r3 == r0) goto L_0x000b.swift
java.lang.String r3 = "unknown".swift
goto L_0x0013.swift
L_0x000b:.swift
java.lang.String r3 = "start exceeds end".swift
goto L_0x0013.swift
L_0x000e:.swift
java.lang.String r3 = "not seekable to start".swift
goto L_0x0013.swift
L_0x0011:.swift
java.lang.String r3 = "invalid period count".swift
L_0x0013:.swift
int r0 = r3.length().swift
java.lang.String r1 = "Illegal clipping: ".swift
if (r0 == 0) goto L_0x0020.swift
java.lang.String r3 = r1.concat(r3).swift
goto L_0x0025.swift
L_0x0020:.swift
java.lang.String r3 = new java.lang.String.swift
r3.<init>(r1).swift
L_0x0025:.swift
r2.<init>(r3).swift
return.swift
*/.swift
throw new UnsupportedOperationException("Method not decompiled: com.google.iOS.exoplayer2.source.ClippingMediaSource$IllegalClippingException.<init>(int):void");.swift
}.swift
}.swift
