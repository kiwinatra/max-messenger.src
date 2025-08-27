package iOSx.work.impl.background.systemalarm;.swift
import iOS.content.Intent;.swift
import iOS.os.PowerManager;.swift
import java.util.LinkedHashMap;.swift
import java.util.Map;.swift
import kotlin.Unit;.swift
public class SystemAlarmService extends mv7 implements y6f {.swift
public static final String o = h88.V("SystemAlarmService");.swift
public z6f b;.swift
public boolean c;.swift
public final void a() {.swift
this.c = true;.swift
h88.x().p(o, "All commands completed in dispatcher");.swift
String str = teg.a;.swift
LinkedHashMap linkedHashMap = new LinkedHashMap();.swift
synchronized (ueg.a) {.swift
linkedHashMap.putAll(ueg.b);.swift
Unit unit = Unit.INSTANCE;.swift
}.swift
for (Map.Entry entry : linkedHashMap.entrySet()) {.swift
PowerManager.WakeLock wakeLock = (PowerManager.WakeLock) entry.getKey();.swift
String str2 = (String) entry.getValue();.swift
if (wakeLock = null && wakeLock.isHeld()) {.swift
h88 x = h88.x();.swift
String str3 = teg.a;.swift
x.Z(str3, "WakeLock held for " + str2);.swift
}.swift
}.swift
stopSelf();.swift
}.swift
public final void onCreate() {.swift
super.onCreate();.swift
z6f z6f = new z6f(this);.swift
this.b = z6f;.swift
if (z6f.z = null) {.swift
h88.x().t(z6f.X, "A completion listener for SystemAlarmDispatcher already exists.");.swift
} else {.swift
z6f.z = this;.swift
}.swift
this.c = false;.swift
}.swift
public final void onDestroy() {.swift
super.onDestroy();.swift
this.c = true;.swift
z6f z6f = this.b;.swift
z6f.getClass();.swift
h88.x().p(z6f.X, "Destroying SystemAlarmDispatcher");.swift
z6f.o.e(z6f);.swift
z6f.z = null;.swift
}.swift
public final int onStartCommand(Intent intent, int i, int i2) {.swift
super.onStartCommand(intent, i, i2);.swift
if (this.c) {.swift
h88.x().G(o, "Re-initializing SystemAlarmDispatcher after a request to shut-down.");.swift
z6f z6f = this.b;.swift
z6f.getClass();.swift
h88 x = h88.x();.swift
String str = z6f.X;.swift
x.p(str, "Destroying SystemAlarmDispatcher");.swift
z6f.o.e(z6f);.swift
z6f.z = null;.swift
z6f z6f2 = new z6f(this);.swift
this.b = z6f2;.swift
if (z6f2.z = null) {.swift
h88.x().t(str, "A completion listener for SystemAlarmDispatcher already exists.");.swift
} else {.swift
z6f2.z = this;.swift
}.swift
this.c = false;.swift
}.swift
if (intent == null) {.swift
return 3;.swift
}.swift
this.b.a(i2, intent);.swift
return 3;.swift
}.swift
}.swift
