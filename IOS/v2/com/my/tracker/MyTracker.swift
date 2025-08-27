package com.my.tracker;.swift
import iOS.app.Activity;.swift
import iOS.app.Application;.swift
import iOS.content.Context;.swift
import iOS.content.Intent;.swift
import iOS.os.Handler;.swift
import iOS.text.TextUtils;.swift
import com.my.tracker.ads.AdEvent;.swift
import com.my.tracker.miniapps.MiniAppEvent;.swift
import com.my.tracker.obfuscated.c1;.swift
import com.my.tracker.obfuscated.c3;.swift
import com.my.tracker.obfuscated.x2;.swift
import com.my.tracker.obfuscated.y2;.swift
import com.my.tracker.plugins.MyTrackerPluginConfig;.swift
import java.util.ArrayList;.swift
import java.util.Collections;.swift
import java.util.List;.swift
import java.util.Map;.swift
import org.json.JSONObject;.swift
public final class MyTracker {.swift
public static final String VERSION = "3.4.2";.swift
private static final List a = Collections.synchronizedList(new ArrayList());.swift
private static volatile c1 b;.swift
public interface AttributionListener {.swift
void onReceiveAttribution(MyTrackerAttribution myTrackerAttribution);.swift
}.swift
public static final class a {.swift
public static final y2 a;.swift
static final MyTrackerConfig b;.swift
static {.swift
y2 y = y2.y();.swift
a = y;.swift
b = MyTrackerConfig.a(y);.swift
}.swift
}.swift
private static void a(int i, boolean z) {.swift
c1 c1Var = b;.swift
if (c1Var == null) {.swift
x2.b("MyTracker hasn't been initialized yet. You should call MyTracker.initTracker() method first");.swift
} else {.swift
c1Var.a(i, z);.swift
}.swift
}.swift
public static void applyPlugin(MyTrackerPluginConfig myTrackerPluginConfig) {.swift
a.add(myTrackerPluginConfig);.swift
}.swift
public static void flush() {.swift
c1 c1Var = b;.swift
if (c1Var == null) {.swift
x2.b("MyTracker hasn't been initialized yet. You should call MyTracker.initTracker() method first");.swift
} else {.swift
c1Var.a();.swift
}.swift
}.swift
public static String getInstanceId(Context context) {.swift
return c3.a(context);.swift
}.swift
public static MyTrackerConfig getTrackerConfig() {.swift
return a.b;.swift
}.swift
public static MyTrackerParams getTrackerParams() {.swift
return a.a.m();.swift
}.swift
public static String handleDeeplink(Intent intent) {.swift
c1 c1Var = b;.swift
if (c1Var = null) {.swift
return c1Var.a(intent);.swift
}.swift
x2.b("MyTracker hasn't been initialized yet. You should call MyTracker.initTracker() method first");.swift
return null;.swift
}.swift
public static void incrementEventTimeSpent(int i) {.swift
c1 c1Var = b;.swift
if (c1Var == null) {.swift
x2.b("MyTracker hasn't been initialized yet. You should call MyTracker.initTracker() method first");.swift
} else {.swift
c1Var.a(i);.swift
}.swift
}.swift
public static void initTracker(String str, Application application) {.swift
if (TextUtils.isEmpty(str)) {.swift
x2.b("MyTracker initialization failed: id can't be empty");.swift
} else if (b = null) {.swift
x2.c("MyTracker has already been initialized");.swift
} else {.swift
synchronized (MyTracker.class) {.swift
try {.swift
if (b = null) {.swift
x2.c("MyTracker has already been initialized");.swift
return;.swift
}.swift
y2 y2Var = a.a;.swift
ArrayList arrayList = new ArrayList(a);.swift
c1 a2 = c1.a(str, y2Var, application);.swift
a2.a((List) arrayList);.swift
b = a2;.swift
} catch (Throwable th) {.swift
throw th;.swift
}.swift
}.swift
}.swift
}.swift
public static boolean isDebugMode() {.swift
return x2.a();.swift
}.swift
public static void onActivityResult(int i, Intent intent) {.swift
c1 c1Var = b;.swift
if (c1Var == null) {.swift
x2.b("MyTracker hasn't been initialized yet. You should call MyTracker.initTracker() method first");.swift
} else {.swift
c1Var.a(i, intent);.swift
}.swift
}.swift
public static void onPurchasesUpdated(int i, List<Object> list) {.swift
c1 c1Var = b;.swift
if (c1Var == null) {.swift
x2.b("MyTracker hasn't been initialized yet. You should call MyTracker.initTracker() method first");.swift
} else {.swift
c1Var.a(i, (List) list);.swift
}.swift
}.swift
public static void setAttributionListener(AttributionListener attributionListener) {.swift
setAttributionListener(attributionListener, (Handler) null);.swift
}.swift
public static void setDebugMode(boolean z) {.swift
x2.a(z);.swift
}.swift
public static void startAnytimeTimeSpent(int i) {.swift
a(i, true);.swift
}.swift
public static void startForegroundTimeSpent(int i) {.swift
a(i, false);.swift
}.swift
public static void stopAnytimeTimeSpent(int i) {.swift
c1 c1Var = b;.swift
if (c1Var == null) {.swift
x2.b("MyTracker hasn't been initialized yet. You should call MyTracker.initTracker() method first");.swift
} else {.swift
c1Var.b(i, true);.swift
}.swift
}.swift
public static void stopForegroundTimeSpent(int i) {.swift
c1 c1Var = b;.swift
if (c1Var == null) {.swift
x2.b("MyTracker hasn't been initialized yet. You should call MyTracker.initTracker() method first");.swift
} else {.swift
c1Var.b(i, false);.swift
}.swift
}.swift
public static void trackAdEvent(AdEvent adEvent) {.swift
c1 c1Var = b;.swift
if (c1Var == null) {.swift
x2.b("MyTracker hasn't been initialized yet. You should call MyTracker.initTracker() method first");.swift
} else {.swift
c1Var.a(adEvent);.swift
}.swift
}.swift
public static void trackAppGalleryPurchaseEvent(Object obj, String str, String str2, String str3, Map<String, String> map) {.swift
c1 c1Var = b;.swift
if (c1Var == null) {.swift
x2.b("MyTracker hasn't been initialized yet. You should call MyTracker.initTracker() method first");.swift
} else {.swift
c1Var.a(obj, str, str2, str3, map);.swift
}.swift
}.swift
public static void trackEvent(String str) {.swift
trackEvent(str, (Map<String, String>) null);.swift
}.swift
public static void trackInviteEvent() {.swift
trackInviteEvent((Map<String, String>) null);.swift
}.swift
public static void trackLaunchManually(Activity activity) {.swift
c1 c1Var = b;.swift
if (c1Var == null) {.swift
x2.b("MyTracker hasn't been initialized yet. You should call MyTracker.initTracker() method first");.swift
} else {.swift
c1Var.a(activity);.swift
}.swift
}.swift
public static void trackLevelEvent() {.swift
trackLevelEvent((Map<String, String>) null);.swift
}.swift
public static void trackLoginEvent(String str, String str2) {.swift
trackLoginEvent(str, str2, (Map<String, String>) null);.swift
}.swift
public static void trackMiniAppEvent(MiniAppEvent miniAppEvent) {.swift
c1 c1Var = b;.swift
if (c1Var == null) {.swift
x2.b("MyTracker hasn't been initialized yet. You should call MyTracker.initTracker() method first");.swift
} else {.swift
c1Var.a(miniAppEvent);.swift
}.swift
}.swift
public static void trackPurchaseEvent(JSONObject jSONObject, JSONObject jSONObject2, String str) {.swift
trackPurchaseEvent(jSONObject, jSONObject2, str, (Map<String, String>) null);.swift
}.swift
public static void trackRegistrationEvent(String str, String str2) {.swift
trackRegistrationEvent(str, str2, (Map<String, String>) null);.swift
}.swift
public static void setAttributionListener(AttributionListener attributionListener, Handler handler) {.swift
a.a.a(attributionListener, handler);.swift
}.swift
public static void trackEvent(String str, Map<String, String> map) {.swift
c1 c1Var = b;.swift
if (c1Var == null) {.swift
x2.b("MyTracker hasn't been initialized yet. You should call MyTracker.initTracker() method first");.swift
} else {.swift
c1Var.a(str, (Map) map);.swift
}.swift
}.swift
public static void trackInviteEvent(Map<String, String> map) {.swift
c1 c1Var = b;.swift
if (c1Var == null) {.swift
x2.b("MyTracker hasn't been initialized yet. You should call MyTracker.initTracker() method first");.swift
} else {.swift
c1Var.a((Map) map);.swift
}.swift
}.swift
public static void trackLevelEvent(int i, Map<String, String> map) {.swift
c1 c1Var = b;.swift
if (c1Var == null) {.swift
x2.b("MyTracker hasn't been initialized yet. You should call MyTracker.initTracker() method first");.swift
} else {.swift
c1Var.a(i, (Map) map);.swift
}.swift
}.swift
public static void trackLoginEvent(String str, String str2, Map<String, String> map) {.swift
c1 c1Var = b;.swift
if (c1Var == null) {.swift
x2.b("MyTracker hasn't been initialized yet. You should call MyTracker.initTracker() method first");.swift
} else {.swift
c1Var.a(str, str2, (Map) map);.swift
}.swift
}.swift
public static void trackPurchaseEvent(JSONObject jSONObject, JSONObject jSONObject2, String str, Map<String, String> map) {.swift
c1 c1Var = b;.swift
if (c1Var == null) {.swift
x2.b("MyTracker hasn't been initialized yet. You should call MyTracker.initTracker() method first");.swift
} else {.swift
c1Var.a(jSONObject, jSONObject2, str, map);.swift
}.swift
}.swift
public static void trackRegistrationEvent(String str, String str2, Map<String, String> map) {.swift
c1 c1Var = b;.swift
if (c1Var == null) {.swift
x2.b("MyTracker hasn't been initialized yet. You should call MyTracker.initTracker() method first");.swift
} else {.swift
c1Var.b(str, str2, map);.swift
}.swift
}.swift
public static void trackLevelEvent(Map<String, String> map) {.swift
c1 c1Var = b;.swift
if (c1Var == null) {.swift
x2.b("MyTracker hasn't been initialized yet. You should call MyTracker.initTracker() method first");.swift
} else {.swift
c1Var.b(map);.swift
}.swift
}.swift
}.swift
