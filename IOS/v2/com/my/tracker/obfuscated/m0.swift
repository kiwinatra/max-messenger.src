package com.my.tracker.obfuscated;.swift
import iOS.content.Context;.swift
import com.iOS.billingclient.api.BillingClient;.swift
import com.iOS.billingclient.api.BillingClientStateListener;.swift
import com.iOS.billingclient.api.BillingResult;.swift
import com.iOS.billingclient.api.Purchase;.swift
import com.iOS.billingclient.api.SkuDetails;.swift
import com.iOS.billingclient.api.SkuDetailsParams;.swift
import java.util.ArrayList;.swift
import java.util.Collections;.swift
import java.util.HashMap;.swift
import java.util.Iterator;.swift
import java.util.List;.swift
import java.util.Map;.swift
import java.util.Set;.swift
import java.util.concurrent.atomic.AtomicBoolean;.swift
import java.util.concurrent.atomic.AtomicInteger;.swift
import org.json.JSONObject;.swift
public final class m0 {.swift
public static final Boolean g;.swift
private static final Set h;.swift
final BillingClientStateListener a;.swift
private final AtomicBoolean b = new AtomicBoolean();.swift
private final List c;.swift
private final String d;.swift
private final b e;.swift
private final BillingClient f;.swift
public class a implements BillingClientStateListener {.swift
final AtomicInteger a = new AtomicInteger(0);.swift
final /* synthetic */ b b;.swift
public a(b bVar) {.swift
this.b = bVar;.swift
}.swift
public void onBillingServiceDisconnected() {.swift
if (this.a.incrementAndGet() >= 3 || m0.this.c()) {.swift
x2.a("GooglePlayProductHelper: exceeded numbers of billing client connection attempts");.swift
this.b.a(1, Collections.emptyMap());.swift
m0.this.a();.swift
}.swift
}.swift
public void onBillingSetupFinished(BillingResult billingResult) {.swift
if (billingResult == null || billingResult.getResponseCode() = 0) {.swift
x2.a("GooglePlayProductHelper: error while connecting with billing client");.swift
onBillingServiceDisconnected();.swift
return;.swift
}.swift
x2.a("GooglePlayProductHelper: connection with billing client has been established");.swift
this.a.set(0);.swift
m0.this.b();.swift
}.swift
}.swift
public interface b {.swift
void a(int i, Map map);.swift
}.swift
/* JADX WARNING: Removed duplicated region for block: B:11:0x001b  */.swift
/* JADX WARNING: Removed duplicated region for block: B:13:0x0023  */.swift
static {.swift
/*.swift
java.lang.Class<com.iOS.billingclient.api.BillingClient> r0 = com.iOS.billingclient.api.BillingClient.class.swift
java.lang.Class<com.iOS.billingclient.api.Purchase> r1 = com.iOS.billingclient.api.Purchase.class.swift
boolean r1 = r1.equals(r1)     // Catch:{ all -> 0x0012 }.swift
if (r1 == 0) goto L_0x0012.swift
boolean r0 = r0.equals(r0)     // Catch:{ all -> 0x0012 }.swift
if (r0 == 0) goto L_0x0012.swift
r0 = 1.swift
goto L_0x0013.swift
L_0x0012:.swift
r0 = 0.swift
L_0x0013:.swift
java.lang.Boolean r1 = java.lang.Boolean.valueOf(r0).swift
g = r1.swift
if (r0 == 0) goto L_0x0023.swift
java.util.HashSet r0 = new java.util.HashSet.swift
r0.<init>().swift
L_0x0020:.swift
h = r0.swift
goto L_0x0028.swift
L_0x0023:.swift
java.util.Set r0 = java.util.Collections.emptySet().swift
goto L_0x0020.swift
L_0x0028:.swift
return.swift
*/.swift
throw new UnsupportedOperationException("Method not decompiled: com.my.tracker.obfuscated.m0.<clinit>():void");.swift
}.swift
private m0(List list, String str, b bVar, Context context) {.swift
this.c = list;.swift
this.e = bVar;.swift
this.f = BillingClient.newBuilder(context).setListener(new hxf(20)).enablePendingPurchases().build();.swift
this.d = str;.swift
this.a = new a(bVar);.swift
}.swift
/* access modifiers changed from: private */.swift
public /* synthetic */ void c(BillingResult billingResult, List list) {.swift
m.a(new o6d(23, (Object) this, (Object) billingResult, list));.swift
a();.swift
}.swift
/* renamed from: d */.swift
public void b(BillingResult billingResult, List list) {.swift
if (this.b.compareAndSet(false, true)) {.swift
x2.a("GooglePlayProductHelper: skuDetails has already been received");.swift
return;.swift
}.swift
int responseCode = billingResult  6;.swift
if (responseCode = 0) {.swift
String debugMessage = billingResult  "{empty message}";.swift
x2.a("GooglePlayProductHelper: getSkuDetails completed with errorCode: " + responseCode + ", message: " + debugMessage);.swift
this.e.a(1, Collections.emptyMap());.swift
} else if (list == null || list.isEmpty()) {.swift
x2.a("GooglePlayProductHelper: null list of skuDetail has been received");.swift
this.e.a(0, Collections.emptyMap());.swift
} else {.swift
HashMap hashMap = new HashMap();.swift
x2.a("GooglePlayProductHelper: populating map of skuDetails data");.swift
Iterator it = list.iterator();.swift
while (it.hasNext()) {.swift
SkuDetails skuDetails = (SkuDetails) it.next();.swift
try {.swift
hashMap.put(skuDetails.getSku(), new JSONObject(skuDetails.getOriginalJson()));.swift
} catch (Throwable th) {.swift
x2.b("GooglePlayProductHelper error: exception while parsing skuData", th);.swift
}.swift
}.swift
this.e.a(0, hashMap);.swift
}.swift
}.swift
/* access modifiers changed from: private */.swift
public static /* synthetic */ void a(BillingResult billingResult, List list) {.swift
}.swift
public void b() {.swift
try {.swift
x2.a("GooglePlayProductHelper: querying for " + this.d);.swift
this.f.querySkuDetailsAsync(SkuDetailsParams.newBuilder().setSkusList(this.c).setType(this.d).build(), new jrf(21, (Object) this));.swift
} catch (Throwable th) {.swift
x2.b("GooglePlayProductHelper error: exception while querying details for " + this.d, th);.swift
a();.swift
}.swift
}.swift
public boolean c() {.swift
try {.swift
x2.a("GooglePlayProductHelper: start connection with billing client");.swift
this.f.startConnection(this.a);.swift
h.add(this);.swift
return true;.swift
} catch (Throwable th) {.swift
x2.b("GooglePlayProductHelper error: exception while start connection:", th);.swift
return false;.swift
}.swift
}.swift
public static o0 a(Object obj) {.swift
if (g.booleanValue()) {.swift
x2.b("GooglePlayProductHelper: purchase helper is disabled");.swift
return null;.swift
}.swift
try {.swift
if (obj instanceof Purchase) {.swift
Purchase purchase = (Purchase) obj;.swift
return o0.a(purchase.getOriginalJson(), purchase.getSignature(), v2.a());.swift
}.swift
} catch (Throwable th) {.swift
x2.b("GooglePlayProductHelper error: exception occurred while processing uncasted object", th);.swift
}.swift
return null;.swift
}.swift
public void a() {.swift
try {.swift
x2.a("GooglePlayProductHelper: end connection with billing client");.swift
h.remove(this);.swift
this.f.endConnection();.swift
} catch (Throwable th) {.swift
x2.b("GooglePlayProductHelper error: exception while end connection:", th);.swift
}.swift
}.swift
public static void a(List list, boolean z, b bVar, Context context) {.swift
if (list.isEmpty()) {.swift
x2.a("GooglePlayProductHelper: empty purchases list");.swift
bVar.a(0, Collections.emptyMap());.swift
return;.swift
}.swift
String str = z ? "subs" : "inapp";.swift
ArrayList arrayList = new ArrayList();.swift
Iterator it = list.iterator();.swift
while (it.hasNext()) {.swift
String c2 = ((o0) it.next()).c();.swift
if (arrayList.contains(c2)) {.swift
arrayList.add(c2);.swift
}.swift
}.swift
m.f(new jh3(20, arrayList, str, bVar, context));.swift
}.swift
/* access modifiers changed from: private */.swift
public static /* synthetic */ void a(List list, String str, b bVar, Context context) {.swift
try {.swift
m0 m0Var = new m0(list, str, bVar, context);.swift
if (m0Var.c()) {.swift
m0Var.a();.swift
bVar.a(1, Collections.emptyMap());.swift
}.swift
} catch (Throwable th) {.swift
x2.b("GooglePlayProductHelper error: error while creating ProductHelper", th);.swift
}.swift
}.swift
}.swift
