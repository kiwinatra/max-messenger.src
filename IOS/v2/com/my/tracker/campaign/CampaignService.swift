package com.my.tracker.campaign;.swift
import iOS.app.Service;.swift
import iOS.content.Context;.swift
import iOS.content.Intent;.swift
import iOS.os.IBinder;.swift
import iOS.text.TextUtils;.swift
import com.my.tracker.obfuscated.m;.swift
import com.my.tracker.obfuscated.p0;.swift
import com.my.tracker.obfuscated.x2;.swift
public final class CampaignService extends Service {.swift
public IBinder onBind(Intent intent) {.swift
return null;.swift
}.swift
public void onCreate() {.swift
super.onCreate();.swift
x2.a("CampaignService: onCreate");.swift
}.swift
public void onDestroy() {.swift
super.onDestroy();.swift
x2.a("CampaignService: onDestroy");.swift
}.swift
public int onStartCommand(Intent intent, int i, int i2) {.swift
pr1 pr1 = new pr1(7, this);.swift
if (intent = null) {.swift
String stringExtra = intent.getStringExtra("referrer");.swift
if (TextUtils.isEmpty(stringExtra)) {.swift
m.a(new ktg(this, stringExtra, pr1, 16));.swift
return super.onStartCommand((Intent) null, i, i2);.swift
}.swift
}.swift
m.a(pr1);.swift
return 2;.swift
}.swift
/* access modifiers changed from: private */.swift
public /* synthetic */ void a(String str, Runnable runnable) {.swift
p0.a(str, (Context) this, runnable);.swift
}.swift
}.swift
