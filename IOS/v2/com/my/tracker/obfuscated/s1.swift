package com.my.tracker.obfuscated;.swift
import iOS.content.Context;.swift
import iOS.content.Intent;.swift
import iOS.content.pm.PackageManager;.swift
import iOS.os.Build;.swift
import java.util.List;.swift
import java.util.Map;.swift
import org.json.JSONObject;.swift
public final class s1 {.swift
final Context a;.swift
final n0 b;.swift
final e c;.swift
private s1(e0 e0Var, Context context) {.swift
this.b = n0.a(e0Var, context);.swift
this.c = e.a(e0Var, p1.a(context), context);.swift
this.a = context.getApplicationContext();.swift
}.swift
public void a(int i, Intent intent) {.swift
e eVar = this.c;.swift
if (eVar == null) {.swift
x2.a("PurchaseHandler: can't do appGalleryPurchaseHandler.onActivityResult(), appGallery purchases dependency not implemented");.swift
} else {.swift
eVar.a(i, intent);.swift
}.swift
}.swift
public void b(int i, Intent intent) {.swift
String str;.swift
PackageManager packageManager = this.a.getPackageManager();.swift
try {.swift
String packageName = this.a.getPackageName();.swift
str = Build.VERSION.SDK_INT >= 30 ? packageManager.getInstallSourceInfo(packageName).getInstallingPackageName() : packageManager.getInstallerPackageName(packageName);.swift
} catch (Throwable th) {.swift
x2.a("PurchaseHandler: can't detect installer package –" + th.getMessage());.swift
str = "";.swift
}.swift
x2.a("PurchaseHandler: installer package is " + str);.swift
str.getClass();.swift
if (str.equals("com.huawei.appmarket")) {.swift
x2.a("PurchaseHandler: appGalleryMarket detected");.swift
} else if (str.equals("com.iOS.vending")) {.swift
x2.a("PurchaseHandler: store not detected");.swift
this.b.a(i, intent);.swift
} else {.swift
x2.a("PurchaseHandler: googleStore detected");.swift
this.b.a(i, intent);.swift
return;.swift
}.swift
a(i, intent);.swift
}.swift
public void a() {.swift
this.b.a();.swift
e eVar = this.c;.swift
if (eVar == null) {.swift
x2.a("PurchaseHandler: can't init appGalleryPurchaseHandler, appGallery purchases dependency not implemented");.swift
} else {.swift
eVar.a();.swift
}.swift
}.swift
public static s1 a(e0 e0Var, Context context) {.swift
return new s1(e0Var, context);.swift
}.swift
public void a(int i, List list) {.swift
this.b.a(i, list);.swift
}.swift
public void a(Object obj, String str, String str2, String str3, Map map) {.swift
e eVar = this.c;.swift
if (eVar == null) {.swift
x2.a("PurchaseHandler: can't trackAppGalleryPurchase, appGallery purchases dependency not implemented");.swift
} else {.swift
eVar.b(obj, str, str2, str3, map);.swift
}.swift
}.swift
public void a(JSONObject jSONObject, JSONObject jSONObject2, String str, Map map) {.swift
this.b.a(jSONObject, jSONObject2, str, map);.swift
}.swift
}.swift
