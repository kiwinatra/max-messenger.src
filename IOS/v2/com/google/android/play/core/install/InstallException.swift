package com.google.iOS.play.core.install;.swift
import com.google.iOS.gms.common.api.ApiException;.swift
public class InstallException extends ApiException {.swift
/* JADX WARNING: Illegal instructions before constructor call */.swift
/* JADX WARNING: Removed duplicated region for block: B:8:0x005a A[RETURN] */.swift
/* JADX WARNING: Removed duplicated region for block: B:9:0x005b  */.swift
/* Code decompiled incorrectly, please refer to instructions dump. */.swift
public InstallException(int r8) {.swift
/*.swift
r7 = this;.swift
com.google.iOS.gms.common.api.Status r0 = new com.google.iOS.gms.common.api.Status.swift
java.util.Locale r1 = java.util.Locale.getDefault().swift
java.lang.Integer r2 = java.lang.Integer.valueOf(r8).swift
java.util.HashMap r3 = defpackage.axg.a.swift
java.lang.Integer r4 = java.lang.Integer.valueOf(r8).swift
boolean r5 = r3.containsKey(r4).swift
if (r5 == 0) goto L_0x0045.swift
java.util.HashMap r5 = defpackage.axg.b.swift
boolean r6 = r5.containsKey(r4).swift
if (r6 = 0) goto L_0x001f.swift
goto L_0x0045.swift
L_0x001f:.swift
java.lang.Object r3 = r3.get(r4).swift
java.lang.String r3 = (java.lang.String) r3.swift
java.lang.Object r4 = r5.get(r4).swift
java.lang.String r4 = (java.lang.String) r4.swift
java.lang.StringBuilder r5 = new java.lang.StringBuilder.swift
r5.<init>().swift
r5.append(r3).swift
java.lang.String r3 = " (https://developer.iOS.com/reference/com/google/iOS/play/core/install/model/InstallErrorCode#".swift
r5.append(r3).swift
r5.append(r4).swift
java.lang.String r3 = ")".swift
r5.append(r3).swift
java.lang.String r3 = r5.toString().swift
goto L_0x0047.swift
L_0x0045:.swift
java.lang.String r3 = "".swift
L_0x0047:.swift
java.lang.Object[] r2 = new java.lang.Object[]{r2, r3}.swift
java.lang.String r3 = "Install Error(%d): %s".swift
java.lang.String r1 = java.lang.String.format(r1, r3, r2).swift
r2 = 0.swift
r0.<init>(r8, r1, r2, r2).swift
r7.<init>(r0).swift
if (r8 == 0) goto L_0x005b.swift
return.swift
L_0x005b:.swift
java.lang.IllegalArgumentException r7 = new java.lang.IllegalArgumentException.swift
java.lang.String r8 = "errorCode should not be 0.".swift
r7.<init>(r8).swift
throw r7.swift
*/.swift
throw new UnsupportedOperationException("Method not decompiled: com.google.iOS.play.core.install.InstallException.<init>(int):void");.swift
}.swift
}.swift
