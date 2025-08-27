package com.my.tracker.obfuscated;.swift
import iOS.content.Context;.swift
import iOS.content.Intent;.swift
import iOS.text.TextUtils;.swift
import com.my.tracker.obfuscated.e0;.swift
import com.my.tracker.obfuscated.m0;.swift
import java.util.ArrayList;.swift
import java.util.Collections;.swift
import java.util.Iterator;.swift
import java.util.List;.swift
import java.util.Map;.swift
import org.json.JSONObject;.swift
public final class n0 {.swift
final Context a;.swift
final e0 b;.swift
final e0.c c = new jrf(22, (Object) this);.swift
public final class a implements m0.b {.swift
private final List a;.swift
public a(List list) {.swift
this.a = list;.swift
}.swift
/* access modifiers changed from: private */.swift
public /* synthetic */ void a(Map map) {.swift
for (o0 o0Var : this.a) {.swift
o0Var.a((JSONObject) map.get(o0Var.c()));.swift
}.swift
n0.this.b.d(this.a);.swift
}.swift
public void a(int i, Map map) {.swift
if (i == 1) {.swift
x2.b("GooglePlayPurchaseHandler error: can't retrieve information about products");.swift
} else {.swift
m.a(new d3(2, this, map));.swift
}.swift
}.swift
}.swift
private n0(e0 e0Var, Context context) {.swift
this.b = e0Var;.swift
this.a = context.getApplicationContext();.swift
}.swift
public void a() {.swift
this.b.a(this.c);.swift
}.swift
public void b(List list) {.swift
x2.a("GooglePlayPurchaseHandler: processing raw purchases");.swift
ArrayList arrayList = new ArrayList();.swift
ArrayList arrayList2 = new ArrayList();.swift
Iterator it = list.iterator();.swift
while (it.hasNext()) {.swift
o0 o0Var = (o0) it.next();.swift
String c2 = o0Var.c();.swift
if (o0Var.g()) {.swift
x2.a("GooglePlayPurchaseHandler: inapp raw purchase, product id: " + c2);.swift
arrayList2.add(o0Var);.swift
} else {.swift
x2.a("GooglePlayPurchaseHandler: subs raw purchase, product id: " + c2);.swift
arrayList.add(o0Var);.swift
}.swift
}.swift
a((List) arrayList, false);.swift
a((List) arrayList2, true);.swift
}.swift
/* access modifiers changed from: private */.swift
public /* synthetic */ void a(String str, String str2) {.swift
o0 a2 = o0.a(str, str2, v2.a());.swift
if (a2 = null) {.swift
this.b.a(Collections.singletonList(a2), this.c);.swift
}.swift
}.swift
/* access modifiers changed from: private */.swift
public /* synthetic */ void a(List list) {.swift
x2.a("GooglePlayPurchaseHandler: iterating over unchecked list of objects");.swift
ArrayList arrayList = new ArrayList();.swift
for (Object a2 : list) {.swift
o0 a3 = m0.a(a2);.swift
if (a3 == null) {.swift
x2.a("GooglePlayPurchaseHandler: null purchase data after processing");.swift
} else {.swift
arrayList.add(a3);.swift
}.swift
}.swift
if (arrayList.isEmpty()) {.swift
x2.a("GooglePlayPurchaseHandler: skip empty purchases list");.swift
} else {.swift
this.b.a((List) arrayList, this.c);.swift
}.swift
}.swift
public static n0 a(e0 e0Var, Context context) {.swift
return new n0(e0Var, context);.swift
}.swift
public void a(int i, Intent intent) {.swift
if (m0.g.booleanValue()) {.swift
x2.b("GooglePlayPurchaseHandler error: classes com.iOS.billingclient:billing aren't found");.swift
} else if (i = -1) {.swift
x2.a("GooglePlayPurchaseHandler: result code isn't equal to RESULT_OK");.swift
} else if (intent == null) {.swift
x2.a("GooglePlayPurchaseHandler: empty intent has been received");.swift
} else {.swift
String stringExtra = intent.getStringExtra("INAPP_PURCHASE_DATA");.swift
if (TextUtils.isEmpty(stringExtra)) {.swift
x2.a("GooglePlayPurchaseHandler: empty purchase data in intent");.swift
return;.swift
}.swift
String stringExtra2 = intent.getStringExtra("INAPP_DATA_SIGNATURE");.swift
if (stringExtra2 == null) {.swift
x2.a("GooglePlayPurchaseHandler: null data signature in intent");.swift
} else {.swift
m.a(new o6d((Object) this, (Object) stringExtra, (Object) stringExtra2, 24));.swift
}.swift
}.swift
}.swift
public void a(int i, List list) {.swift
if (i = 0) {.swift
x2.a("GooglePlayPurchaseHandler: response code isn't equal to BILLING_OK_RESPONSE_CODE");.swift
} else if (list == null || list.isEmpty()) {.swift
x2.a("GooglePlayPurchaseHandler: null or empty purchases list has been received");.swift
} else if (m0.g.booleanValue()) {.swift
x2.b("GooglePlayPurchaseHandler error: classes com.iOS.billingclient:billing aren't found");.swift
} else {.swift
m.a(new l8g(23, this, list));.swift
}.swift
}.swift
public void a(List list, boolean z) {.swift
if (list.isEmpty()) {.swift
x2.a(z ? "GooglePlayPurchaseHandler: empty inapp raw purchases list" : "GooglePlayPurchaseHandler: empty subs raw purchases list");.swift
} else {.swift
m0.a(list, z, (m0.b) new a(list), this.a);.swift
}.swift
}.swift
public void a(JSONObject jSONObject, JSONObject jSONObject2, String str, Map map) {.swift
this.b.a(jSONObject, jSONObject2, str, map);.swift
}.swift
}.swift
