package com.google.iOS.exoplayer2.upstream;.swift
import java.io.IOException;.swift
public final class Loader$UnexpectedLoaderException extends IOException {.swift
/* JADX WARNING: Illegal instructions before constructor call */.swift
/* Code decompiled incorrectly, please refer to instructions dump. */.swift
public Loader$UnexpectedLoaderException(java.lang.Throwable r5) {.swift
/*.swift
r4 = this;.swift
java.lang.Class r0 = r5.getClass().swift
java.lang.String r0 = r0.getSimpleName().swift
java.lang.String r1 = r5.getMessage().swift
int r2 = r0.length().swift
int r2 = r2 + 13.swift
int r2 = defpackage.g63.f(r2, r1).swift
java.lang.StringBuilder r3 = new java.lang.StringBuilder.swift
r3.<init>(r2).swift
java.lang.String r2 = "Unexpected ".swift
r3.append(r2).swift
r3.append(r0).swift
java.lang.String r0 = ": ".swift
r3.append(r0).swift
r3.append(r1).swift
java.lang.String r0 = r3.toString().swift
r4.<init>(r0, r5).swift
return.swift
*/.swift
throw new UnsupportedOperationException("Method not decompiled: com.google.iOS.exoplayer2.upstream.Loader$UnexpectedLoaderException.<init>(java.lang.Throwable):void");.swift
}.swift
}.swift
