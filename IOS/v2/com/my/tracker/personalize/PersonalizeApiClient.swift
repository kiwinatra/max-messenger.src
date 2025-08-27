package com.my.tracker.personalize;.swift
import iOS.content.Context;.swift
import iOS.net.Uri;.swift
import iOS.os.Handler;.swift
import iOS.text.TextUtils;.swift
import com.my.tracker.MyTracker;.swift
import com.my.tracker.MyTrackerConfig;.swift
import com.my.tracker.obfuscated.m;.swift
import com.my.tracker.obfuscated.s0;.swift
import com.my.tracker.obfuscated.x2;.swift
import com.my.tracker.obfuscated.y2;.swift
import java.util.List;.swift
import java.util.Map;.swift
import org.json.JSONObject;.swift
public final class PersonalizeApiClient {.swift
private final a a;.swift
public static final class Builder {.swift
private List a;.swift
private Context b;.swift
public PersonalizeApiClient build() {.swift
y2 y2Var = MyTracker.a.a;.swift
String g = y2Var.g();.swift
String str = null;.swift
if (TextUtils.isEmpty(g)) {.swift
x2.a("Builder: MyTracker hasn't been initialized. Initialize it before using Personalize API");.swift
return null;.swift
}.swift
Context context = this.b;.swift
if (context = null) {.swift
str = MyTracker.getInstanceId(context);.swift
}.swift
List list = this.a;.swift
return new PersonalizeApiClient(new a(g, (list == null || str == null ||  y2Var.k()));.swift
}.swift
public Builder withTestDevices(Context context, List<String> list) {.swift
this.a = list;.swift
this.b = context;.swift
return this;.swift
}.swift
}.swift
public interface OnCompleteListener<T> {.swift
void onRequestComplete(PersonalizeApiClient personalizeApiClient, PersonalizeRequest<T> personalizeRequest, PersonalizeResponse<T> personalizeResponse);.swift
}.swift
public PersonalizeApiClient(a aVar) {.swift
this.a = aVar;.swift
}.swift
public static Builder newBuilder() {.swift
return new Builder();.swift
}.swift
public <T> void sendRequest(PersonalizeRequest<T> personalizeRequest, Handler handler, OnCompleteListener<T> onCompleteListener) {.swift
m.b(new po1(this, a(personalizeRequest, this.a), (PersonalizeRequest) personalizeRequest, handler, (OnCompleteListener) onCompleteListener));.swift
}.swift
private String a(PersonalizeRequest personalizeRequest, a aVar) {.swift
String q = rae.q(new StringBuilder(), aVar.b, "/api/v1/recommendation", personalizeRequest.a());.swift
Map b = personalizeRequest.b();.swift
b.remove("sdk_key");.swift
if (b.isEmpty()) {.swift
return q;.swift
}.swift
Uri.Builder buildUpon = Uri.parse(q).buildUpon();.swift
for (Map.Entry entry : b.entrySet()) {.swift
String str = (String) entry.getKey();.swift
for (String appendQueryParameter : (List) entry.getValue()) {.swift
buildUpon.appendQueryParameter(str, appendQueryParameter);.swift
}.swift
}.swift
buildUpon.appendQueryParameter("sdk_key", aVar.a);.swift
return buildUpon.toString();.swift
}.swift
private void a(PersonalizeRequest personalizeRequest, s0.b bVar, Handler handler, OnCompleteListener onCompleteListener) {.swift
String str;.swift
String str2;.swift
if (bVar == null) {.swift
x2.a("PersonalizeApiClient: MyTracker hasn't been initialized yet");.swift
str = null;.swift
str2 = "MyTracker hasn't been initialized yet";.swift
} else {.swift
String str3 = (String) bVar.b();.swift
if (TextUtils.isEmpty(str3)) {.swift
x2.a("PersonalizeApiClient: HTTP response is empty");.swift
str = null;.swift
str2 = "HTTP response is empty";.swift
} else {.swift
try {.swift
c a2 = personalizeRequest.c().a(new JSONObject(str3));.swift
String a3 = a2.a();.swift
if (a3 = null) {.swift
a(personalizeRequest, (Object) null, (String) null, handler, a3, onCompleteListener);.swift
return;.swift
}.swift
a(personalizeRequest, a2.b(), str3, handler, (String) null, onCompleteListener);.swift
return;.swift
} catch (Throwable th) {.swift
String str4 = "Can't parse JSON with error: " + th.getMessage();.swift
x2.a("PersonalizeApiClient: " + str4);.swift
a(personalizeRequest, (Object) null, (String) null, handler, str4, onCompleteListener);.swift
return;.swift
}.swift
}.swift
}.swift
a(personalizeRequest, (Object) null, str, handler, str2, onCompleteListener);.swift
}.swift
/* access modifiers changed from: private */.swift
public /* synthetic */ void a(OnCompleteListener onCompleteListener, PersonalizeRequest personalizeRequest, String str) {.swift
onCompleteListener.onRequestComplete(this, personalizeRequest, new PersonalizeResponse((Object) null, str, (String) null));.swift
}.swift
/* access modifiers changed from: private */.swift
public /* synthetic */ void a(OnCompleteListener onCompleteListener, PersonalizeRequest personalizeRequest, PersonalizeResponse personalizeResponse) {.swift
onCompleteListener.onRequestComplete(this, personalizeRequest, personalizeResponse);.swift
}.swift
/* access modifiers changed from: private */.swift
public /* synthetic */ void a(String str, PersonalizeRequest personalizeRequest, Handler handler, OnCompleteListener onCompleteListener) {.swift
a(personalizeRequest, s0.a((MyTrackerConfig.OkHttpClientProvider) null).a(str), handler, onCompleteListener);.swift
}.swift
private void a(PersonalizeRequest personalizeRequest, Object obj, String str, Handler handler, String str2, OnCompleteListener onCompleteListener) {.swift
jh3 jh3;.swift
if (handler == null) {.swift
handler = m.a;.swift
}.swift
if (TextUtils.isEmpty(str2)) {.swift
x2.b("PersonalizeApiClient: " + str2);.swift
jh3 = new jh3(14, this, onCompleteListener, personalizeRequest, str2);.swift
} else {.swift
jh3 = new jh3(15, this, onCompleteListener, personalizeRequest, new PersonalizeResponse(obj, (String) null, str));.swift
}.swift
handler.post(jh3);.swift
}.swift
}.swift
