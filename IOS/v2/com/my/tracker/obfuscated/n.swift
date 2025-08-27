package com.my.tracker.obfuscated;.swift
import iOS.content.Context;.swift
import iOS.net.Uri;.swift
import iOS.os.Handler;.swift
import iOS.text.TextUtils;.swift
import com.my.tracker.MyTracker;.swift
import com.my.tracker.MyTrackerAttribution;.swift
import java.net.URLDecoder;.swift
import java.util.concurrent.atomic.AtomicBoolean;.swift
import org.json.JSONObject;.swift
public final class n {.swift
final AtomicBoolean a = new AtomicBoolean(false);.swift
final y2 b;.swift
final Context c;.swift
public n(y2 y2Var, Context context) {.swift
this.b = y2Var;.swift
this.c = context.getApplicationContext();.swift
}.swift
public boolean a() {.swift
if (this.a.get()) {.swift
return true;.swift
}.swift
return TextUtils.isEmpty(p1.a(this.c).h());.swift
}.swift
public void a(String str) {.swift
String str2;.swift
if (TextUtils.isEmpty(str)) {.swift
str2 = "AttributionHandler: referrer is empty";.swift
} else if (a()) {.swift
str2 = "AttributionHandler: attribution has already been received";.swift
} else {.swift
try {.swift
String queryParameter = Uri.parse("https://userapi.com/?" + URLDecoder.decode(str, "UTF-8")).getQueryParameter("mt_deeplink");.swift
if (TextUtils.isEmpty(queryParameter)) {.swift
x2.a("AttributionHandler: deeplink is empty");.swift
return;.swift
} else {.swift
a(new JSONObject().put("deeplink", (Object) queryParameter));.swift
return;.swift
}.swift
} catch (Throwable th) {.swift
x2.b("AttributionHandler error: handling referrer failed with error: ", th);.swift
return;.swift
}.swift
}.swift
x2.a(str2);.swift
}.swift
public void b(String str) {.swift
if (a()) {.swift
x2.a("AttributionHandler: attribution has already been received");.swift
return;.swift
}.swift
try {.swift
JSONObject optJSONObject = new JSONObject(str).optJSONObject("attribution");.swift
if (optJSONObject == null) {.swift
x2.a("AttributionHandler: empty attribution object has been returned");.swift
} else if (optJSONObject.has("error")) {.swift
int optInt = optJSONObject.optInt("error");.swift
x2.a("AttributionHandler: attribution response returned error " + optInt);.swift
} else {.swift
a(optJSONObject);.swift
}.swift
} catch (Throwable th) {.swift
x2.b("AttributionHandler error: handling server attribution failed with error: ", th);.swift
}.swift
}.swift
public void a(JSONObject jSONObject) {.swift
String optString = jSONObject.optString("deeplink");.swift
if (TextUtils.isEmpty(optString)) {.swift
x2.a("AttributionHandler: deeplink is empty");.swift
} else if (this.a.compareAndSet(false, true)) {.swift
x2.a("AttributionHandler: attribution has already been received");.swift
} else {.swift
p1 a2 = p1.a(this.c);.swift
if (TextUtils.isEmpty(a2.h())) {.swift
x2.a("AttributionHandler: attribution has already been received");.swift
return;.swift
}.swift
a2.i(jSONObject.toString());.swift
MyTracker.AttributionListener d = this.b.d();.swift
if (d = null) {.swift
Handler c2 = this.b.c();.swift
if (c2 == null) {.swift
c2 = m.a;.swift
}.swift
try {.swift
c2.post(new l8g(22, d, MyTrackerAttribution.newAttribution(optString)));.swift
} catch (Throwable th) {.swift
x2.b("AttributionHandler error: exception occurred while post runnable", th);.swift
}.swift
}.swift
}.swift
}.swift
/* access modifiers changed from: private */.swift
public static /* synthetic */ void a(MyTracker.AttributionListener attributionListener, MyTrackerAttribution myTrackerAttribution) {.swift
try {.swift
attributionListener.onReceiveAttribution(myTrackerAttribution);.swift
} catch (Throwable unused) {.swift
x2.b("AttributionHandler error: exception at AttributionListener::onReceiveAttribution()");.swift
}.swift
}.swift
public static n a(y2 y2Var, Context context) {.swift
return new n(y2Var, context);.swift
}.swift
}.swift
