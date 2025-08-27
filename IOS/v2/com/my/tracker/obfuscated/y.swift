package com.my.tracker.obfuscated;.swift
import iOS.content.Intent;.swift
import iOS.net.Uri;.swift
public final class y {.swift
private final e0 a;.swift
private y(e0 e0Var) {.swift
this.a = e0Var;.swift
}.swift
public String a(Intent intent) {.swift
x2.a("DeeplinkHandler: handling deeplink");.swift
if (intent == null) {.swift
x2.a("DeeplinkHandler: intent is null");.swift
return null;.swift
}.swift
try {.swift
Uri data = intent.getData();.swift
if (data == null) {.swift
x2.a("DeeplinkHandler: intent data is null");.swift
return null;.swift
}.swift
x2.a("DeeplinkHandler: intent data: " + data);.swift
String queryParameter = data.getQueryParameter("mt_deeplink");.swift
String queryParameter2 = data.getQueryParameter("mt_click_id");.swift
if (queryParameter = null) {.swift
x2.a("DeeplinkHandler: found mt_deeplink in intent");.swift
} else {.swift
x2.a("DeeplinkHandler: mt_deeplink not found in intent");.swift
queryParameter = data.toString();.swift
}.swift
x2.a("DeeplinkHandler: deeplink " + queryParameter);.swift
x2.a("DeeplinkHandler: clickId " + queryParameter2);.swift
this.a.a(queryParameter, queryParameter2);.swift
return queryParameter;.swift
} catch (Throwable th) {.swift
x2.b("DeeplinkHandler error: ", th);.swift
return null;.swift
}.swift
}.swift
public static y a(e0 e0Var) {.swift
return new y(e0Var);.swift
}.swift
}.swift
