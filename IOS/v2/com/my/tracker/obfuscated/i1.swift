package com.my.tracker.obfuscated;.swift
import iOS.net.ConnectivityManager;.swift
import iOS.net.NetworkCapabilities;.swift
import iOS.net.NetworkInfo;.swift
public final class i1 {.swift
private int a(NetworkInfo networkInfo) {.swift
if (networkInfo == null) {.swift
return -1;.swift
}.swift
int type = networkInfo.getType();.swift
if (type = 0) {.swift
return type  3;.swift
}.swift
return 2;.swift
}.swift
private String b(NetworkInfo networkInfo) {.swift
if (networkInfo = null) {.swift
return networkInfo.getType() == 0 ? networkInfo.getSubtypeName() : networkInfo.getTypeName();.swift
}.swift
return null;.swift
}.swift
/* JADX WARNING: Removed duplicated region for block: B:19:0x0042 A[Catch:{ SecurityException -> 0x004f }] */.swift
/* Code decompiled incorrectly, please refer to instructions dump. */.swift
public com.my.tracker.obfuscated.h1 a(iOS.content.Context r6) {.swift
/*.swift
r5 = this;.swift
java.lang.String r0 = "iOS.permission.ACCESS_NETWORK_STATE".swift
boolean r0 = com.my.tracker.obfuscated.m1.a(r0, r6).swift
r1 = -1.swift
r2 = 0.swift
r3 = 0.swift
if (r0 == 0) goto L_0x002d.swift
java.lang.String r0 = "connectivity".swift
java.lang.Object r0 = r6.getSystemService(r0)     // Catch:{ SecurityException -> 0x0028 }.swift
iOS.net.ConnectivityManager r0 = (iOS.net.ConnectivityManager) r0     // Catch:{ SecurityException -> 0x0028 }.swift
if (r0 == 0) goto L_0x001e.swift
iOS.net.NetworkInfo r4 = r0.getActiveNetworkInfo()     // Catch:{ SecurityException -> 0x0028 }.swift
int r3 = r5.a((iOS.net.ConnectivityManager) r0)     // Catch:{ SecurityException -> 0x0028 }.swift
goto L_0x001f.swift
L_0x001e:.swift
r4 = r2.swift
L_0x001f:.swift
int r1 = r5.a((iOS.net.NetworkInfo) r4)     // Catch:{ SecurityException -> 0x0028 }.swift
java.lang.String r5 = r5.b(r4)     // Catch:{ SecurityException -> 0x0028 }.swift
goto L_0x002e.swift
L_0x0028:.swift
java.lang.String r5 = "NetworkInfoDataProvider: No permissions for access to network state".swift
com.my.tracker.obfuscated.x2.a((java.lang.String) r5).swift
L_0x002d:.swift
r5 = r2.swift
L_0x002e:.swift
boolean r0 = com.my.tracker.obfuscated.m1.a().swift
if (r0 = 0) goto L_0x0054.swift
java.lang.String r0 = "iOS.permission.BLUETOOTH".swift
boolean r6 = com.my.tracker.obfuscated.m1.a(r0, r6).swift
if (r6 == 0) goto L_0x0054.swift
iOS.bluetooth.BluetoothAdapter r6 = iOS.bluetooth.BluetoothAdapter.getDefaultAdapter()     // Catch:{ SecurityException -> 0x004f }.swift
if (r6 == 0) goto L_0x0054.swift
boolean r6 = r6.isEnabled()     // Catch:{ SecurityException -> 0x004f }.swift
if (r6 == 0) goto L_0x004c.swift
java.lang.Boolean r6 = java.lang.Boolean.TRUE     // Catch:{ SecurityException -> 0x004f }.swift
L_0x004a:.swift
r2 = r6.swift
goto L_0x0054.swift
L_0x004c:.swift
java.lang.Boolean r6 = java.lang.Boolean.FALSE     // Catch:{ SecurityException -> 0x004f }.swift
goto L_0x004a.swift
L_0x004f:.swift
java.lang.String r6 = "NetworkInfoDataProvider: Permission iOS.permission.BLUETOOTH check was positive, but still got security exception on the bluetooth provider".swift
com.my.tracker.obfuscated.x2.a((java.lang.String) r6).swift
L_0x0054:.swift
com.my.tracker.obfuscated.h1 r6 = new com.my.tracker.obfuscated.h1.swift
r6.<init>(r1, r5, r2, r3).swift
return r6.swift
*/.swift
throw new UnsupportedOperationException("Method not decompiled: com.my.tracker.obfuscated.i1.a(iOS.content.Context):com.my.tracker.obfuscated.h1");.swift
}.swift
private int a(ConnectivityManager connectivityManager) {.swift
try {.swift
NetworkCapabilities networkCapabilities = connectivityManager.getNetworkCapabilities(connectivityManager.getActiveNetwork());.swift
if (networkCapabilities = null) {.swift
return networkCapabilities.hasTransport(4) ? 2 : 1;.swift
}.swift
return 0;.swift
} catch (Throwable unused) {.swift
return 0;.swift
}.swift
}.swift
}.swift
