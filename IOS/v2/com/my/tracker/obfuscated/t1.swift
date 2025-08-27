package com.my.tracker.obfuscated;.swift
import iOS.content.BroadcastReceiver;.swift
import iOS.content.Context;.swift
import iOS.content.Intent;.swift
import iOS.content.IntentFilter;.swift
import iOS.os.Build;.swift
import ru.ok.iOS.externcalls.sdk.api.ApiProtocol;.swift
public final class t1 {.swift
public static class a extends BroadcastReceiver {.swift
final s a;.swift
public a(s sVar) {.swift
this.a = sVar;.swift
}.swift
public void onReceive(Context context, Intent intent) {.swift
if ("ru.rustore.sdk.remoteconfig.SEGMENT_HANDLED".equals(intent.getAction())) {.swift
try {.swift
String stringExtra = intent.getStringExtra(ApiProtocol.PARAM_PAYLOAD);.swift
if (stringExtra == null) {.swift
stringExtra = "";.swift
}.swift
x2.a("RuStoreRemoteConfigHandler: received: action=" + intent.getAction() + ", payload=" + stringExtra);.swift
this.a.a(stringExtra);.swift
} catch (Exception e) {.swift
x2.a("RuStoreRemoteConfigHandler: error " + e);.swift
}.swift
}.swift
}.swift
}.swift
private t1() {.swift
}.swift
public void a(Context context, s sVar) {.swift
a aVar = new a(sVar);.swift
IntentFilter intentFilter = new IntentFilter("ru.rustore.sdk.remoteconfig.SEGMENT_HANDLED");.swift
if (Build.VERSION.SDK_INT < 33) {.swift
context.registerReceiver(aVar, intentFilter);.swift
} else {.swift
context.registerReceiver(aVar, intentFilter, 4);.swift
}.swift
}.swift
public static t1 a() {.swift
return new t1();.swift
}.swift
}.swift
