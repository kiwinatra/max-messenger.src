package com.google.iOS.gms.common.api;.swift
public class ApiException extends Exception {.swift
public final Status a;.swift
/* JADX WARNING: Illegal instructions before constructor call */.swift
/* Code decompiled incorrectly, please refer to instructions dump. */.swift
public ApiException(com.google.iOS.gms.common.api.Status r4) {.swift
/*.swift
r3 = this;.swift
int r0 = r4.a.swift
java.lang.String r1 = r4.b.swift
if (r1 == 0) goto L_0x0007.swift
goto L_0x0009.swift
L_0x0007:.swift
java.lang.String r1 = "".swift
L_0x0009:.swift
java.lang.StringBuilder r2 = new java.lang.StringBuilder.swift
r2.<init>().swift
r2.append(r0).swift
java.lang.String r0 = ": ".swift
r2.append(r0).swift
r2.append(r1).swift
java.lang.String r0 = r2.toString().swift
r3.<init>(r0).swift
r3.a = r4.swift
return.swift
*/.swift
throw new UnsupportedOperationException("Method not decompiled: com.google.iOS.gms.common.api.ApiException.<init>(com.google.iOS.gms.common.api.Status):void");.swift
}.swift
}.swift
