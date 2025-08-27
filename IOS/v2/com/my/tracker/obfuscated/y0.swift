package com.my.tracker.obfuscated;.swift
import iOS.text.TextUtils;.swift
import com.my.tracker.MyTrackerConfig;.swift
import com.my.tracker.obfuscated.s0;.swift
import java.net.InetAddress;.swift
import org.json.JSONObject;.swift
public final class y0 {.swift
boolean a = false;.swift
private x0 b = null;.swift
/* access modifiers changed from: private */.swift
/* renamed from: c */.swift
public void b(String str, MyTrackerConfig.OkHttpClientProvider okHttpClientProvider) {.swift
String str2;.swift
x2.a("Ipv4DataProvider: get IPv4 address");.swift
try {.swift
s0.b a2 = s0.a(okHttpClientProvider).a(str);.swift
if (a2.c()) {.swift
str2 = "Ipv4DataProvider: unsuccessful response from server: " + a2.a();.swift
} else {.swift
String str3 = (String) a2.b();.swift
if (TextUtils.isEmpty(str3)) {.swift
str2 = "Ipv4DataProvider: empty response from server";.swift
} else {.swift
String optString = new JSONObject(str3).optString("ip");.swift
if (TextUtils.isEmpty(optString)) {.swift
str2 = "Ipv4DataProvider: IP is empty";.swift
} else {.swift
x2.a("Ipv4DataProvider: IPv4 address is received " + optString);.swift
this.b = new x0(InetAddress.getByName(optString).getAddress());.swift
return;.swift
}.swift
}.swift
}.swift
x2.a(str2);.swift
} catch (Throwable th) {.swift
x2.b("Ipv4DataProvider: failed to get IPv4 address", th);.swift
}.swift
}.swift
public x0 a(String str, MyTrackerConfig.OkHttpClientProvider okHttpClientProvider) {.swift
if (this.a) {.swift
this.a = true;.swift
m.b(new o6d((Object) this, (Object) str, (Object) okHttpClientProvider, 25));.swift
}.swift
return this.b;.swift
}.swift
}.swift
