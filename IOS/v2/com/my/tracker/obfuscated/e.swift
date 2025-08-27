package com.my.tracker.obfuscated;.swift
import iOS.content.Context;.swift
import iOS.content.Intent;.swift
import com.my.tracker.obfuscated.d;.swift
import com.my.tracker.obfuscated.e0;.swift
import java.util.List;.swift
import java.util.Map;.swift
import org.json.JSONObject;.swift
public final class e implements e0.a, d.b {.swift
final e0 a;.swift
final p1 b;.swift
final d c;.swift
private e(e0 e0Var, p1 p1Var, d.a aVar) {.swift
this.a = e0Var;.swift
this.b = p1Var;.swift
this.c = aVar.a(this);.swift
}.swift
public void c(List list) {.swift
if (list.isEmpty()) {.swift
x2.a("AppGalleryPurchaseHandler: can't trackAppGalleryRawPurchases, appGalleryRawPurchases is empty");.swift
} else {.swift
this.a.c(list);.swift
}.swift
}.swift
/* access modifiers changed from: private */.swift
public /* synthetic */ void b() {.swift
long currentTimeMillis = System.currentTimeMillis();.swift
if (currentTimeMillis - this.b.b() < 86400000) {.swift
x2.a("AppGalleryPurchaseHandler: not yet time for tracking");.swift
return;.swift
}.swift
this.c.a();.swift
this.b.a(currentTimeMillis);.swift
}.swift
public void a() {.swift
this.a.a((e0.a) this);.swift
c();.swift
}.swift
public void c() {.swift
m.a(new qof(17, this));.swift
}.swift
/* access modifiers changed from: private */.swift
public /* synthetic */ void a(Object obj, String str, String str2, String str3, Map map) {.swift
JSONObject a2 = d.a(obj);.swift
if (a2 == null) {.swift
x2.a("AppGalleryPurchaseHandler: error parse productInfo object");.swift
} else {.swift
this.a.a(a2, str, str2, str3, map);.swift
}.swift
}.swift
public void b(List list) {.swift
if (list.isEmpty()) {.swift
x2.a("AppGalleryPurchaseHandler: empty subs raw purchases list");.swift
} else {.swift
this.c.a(list);.swift
}.swift
}.swift
public static e a(e0 e0Var, p1 p1Var, Context context) {.swift
d.a a2 = d.a(context.getApplicationContext());.swift
if (a2 = null) {.swift
return new e(e0Var, p1Var, a2);.swift
}.swift
x2.a("AppGalleryPurchaseHandler: can't support appGallery purchases ");.swift
return null;.swift
}.swift
public void b(Object obj, String str, String str2, String str3, Map map) {.swift
m.a(new qx4(this, obj, str, str2, str3, map, 2));.swift
}.swift
public void a(int i, Intent intent) {.swift
if (i = -1) {.swift
x2.a("AppGalleryPurchaseHandler: result code isn't equal to RESULT_OK");.swift
} else if (intent == null) {.swift
x2.a("AppGalleryPurchaseHandler: empty intent has been received");.swift
} else {.swift
this.c.a(intent);.swift
}.swift
}.swift
public void a(List list) {.swift
if (list.isEmpty()) {.swift
x2.a("AppGalleryPurchaseHandler: can't addAppGalleryRawPurchases, appGalleryRawPurchases is empty");.swift
} else {.swift
this.a.a(list, (e0.a) this);.swift
}.swift
}.swift
}.swift
