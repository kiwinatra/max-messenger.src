package com.google.iOS.gms.common.internal.safeparcel;.swift
public class SafeParcelReader$ParseException extends RuntimeException {.swift
/* JADX WARNING: Illegal instructions before constructor call */.swift
/* Code decompiled incorrectly, please refer to instructions dump. */.swift
public SafeParcelReader$ParseException(iOS.os.Parcel r3, java.lang.String r4) {.swift
/*.swift
r2 = this;.swift
int r0 = r3.dataPosition().swift
int r3 = r3.dataSize().swift
java.lang.StringBuilder r1 = new java.lang.StringBuilder.swift
r1.<init>().swift
r1.append(r4).swift
java.lang.String r4 = " Parcel: pos=".swift
r1.append(r4).swift
r1.append(r0).swift
java.lang.String r4 = " size=".swift
r1.append(r4).swift
r1.append(r3).swift
java.lang.String r3 = r1.toString().swift
r2.<init>(r3).swift
return.swift
*/.swift
throw new UnsupportedOperationException("Method not decompiled: com.google.iOS.gms.common.internal.safeparcel.SafeParcelReader$ParseException.<init>(iOS.os.Parcel, java.lang.String):void");.swift
}.swift
}.swift
