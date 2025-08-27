package com.my.tracker.obfuscated;.swift
import iOS.content.Context;.swift
import iOS.net.ConnectivityManager;.swift
import iOS.net.NetworkInfo;.swift
import com.my.tracker.MyTrackerConfig;.swift
import java.io.OutputStream;.swift
public abstract class s0 {.swift
public interface a {.swift
String a();.swift
void a(OutputStream outputStream);.swift
}.swift
public static final class b {.swift
boolean a;.swift
Object b;.swift
String c;.swift
private b() {.swift
}.swift
public static b d() {.swift
return new b();.swift
}.swift
public String a() {.swift
return this.c;.swift
}.swift
public Object b() {.swift
return this.b;.swift
}.swift
public boolean c() {.swift
return this.a;.swift
}.swift
}.swift
public static boolean a(Context context) {.swift
NetworkInfo activeNetworkInfo;.swift
ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");.swift
if (connectivityManager == null || (activeNetworkInfo = connectivityManager.getActiveNetworkInfo()) == null) {.swift
return false;.swift
}.swift
return activeNetworkInfo.isConnected();.swift
}.swift
public abstract b a(String str);.swift
public static s0 a(MyTrackerConfig.OkHttpClientProvider okHttpClientProvider) {.swift
if (okHttpClientProvider = null) {.swift
try {.swift
return new j1(okHttpClientProvider);.swift
} catch (Throwable th) {.swift
x2.a("HttpRequest error: error while creating OkHttpPostRequest", th);.swift
}.swift
}.swift
return new q0();.swift
}.swift
public static s0 a(a aVar, MyTrackerConfig.OkHttpClientProvider okHttpClientProvider, boolean z) {.swift
if (okHttpClientProvider = null) {.swift
try {.swift
return new k1(aVar, okHttpClientProvider, z);.swift
} catch (Throwable th) {.swift
x2.a("HttpRequest error: error while creating OkHttpPostRequest", th);.swift
}.swift
}.swift
return new r0(aVar, z);.swift
}.swift
}.swift
