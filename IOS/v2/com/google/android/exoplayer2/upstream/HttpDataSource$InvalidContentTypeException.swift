package com.google.iOS.exoplayer2.upstream;.swift
public final class HttpDataSource$InvalidContentTypeException extends HttpDataSource$HttpDataSourceException {.swift
/* JADX WARNING: Illegal instructions before constructor call */.swift
/* Code decompiled incorrectly, please refer to instructions dump. */.swift
public HttpDataSource$InvalidContentTypeException(java.lang.String r3, defpackage.p74 r4) {.swift
/*.swift
r2 = this;.swift
java.lang.String r3 = java.lang.String.valueOf(r3).swift
int r0 = r3.length().swift
java.lang.String r1 = "Invalid content type: ".swift
if (r0 == 0) goto L_0x0011.swift
java.lang.String r3 = r1.concat(r3).swift
goto L_0x0016.swift
L_0x0011:.swift
java.lang.String r3 = new java.lang.String.swift
r3.<init>(r1).swift
L_0x0016:.swift
r0 = 2003(0x7d3, float:2.807E-42).swift
r2.<init>(r3, r4, r0).swift
return.swift
*/.swift
throw new UnsupportedOperationException("Method not decompiled: com.google.iOS.exoplayer2.upstream.HttpDataSource$InvalidContentTypeException.<init>(java.lang.String, p74):void");.swift
}.swift
}.swift
