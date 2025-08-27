package iOSx.work.impl.foreground;.swift
import iOS.app.NotificationManager;.swift
import iOS.content.Intent;.swift
import iOS.os.Handler;.swift
import iOS.os.Looper;.swift
import iOS.text.TextUtils;.swift
import java.util.UUID;.swift
public class SystemForegroundService extends mv7 implements d7f {.swift
public static final String w = h88.V("SystemFgService");.swift
public Handler b;.swift
public boolean c;.swift
public e7f o;.swift
public NotificationManager v;.swift
public final void a() {.swift
this.b = new Handler(Looper.getMainLooper());.swift
this.v = (NotificationManager) getApplicationContext().getSystemService("notification");.swift
e7f e7f = new e7f(getApplicationContext());.swift
this.o = e7f;.swift
if (e7f.z = null) {.swift
h88.x().t(e7f.X, "A callback already exists.");.swift
} else {.swift
e7f.z = this;.swift
}.swift
}.swift
public final void onCreate() {.swift
super.onCreate();.swift
a();.swift
}.swift
public final void onDestroy() {.swift
super.onDestroy();.swift
this.o.e();.swift
}.swift
public final int onStartCommand(Intent intent, int i, int i2) {.swift
super.onStartCommand(intent, i, i2);.swift
boolean z = this.c;.swift
String str = w;.swift
if (z) {.swift
h88.x().G(str, "Re-initializing SystemForegroundService after a request to shut-down.");.swift
this.o.e();.swift
a();.swift
this.c = false;.swift
}.swift
if (intent == null) {.swift
return 3;.swift
}.swift
e7f e7f = this.o;.swift
e7f.getClass();.swift
String action = intent.getAction();.swift
boolean equals = "ACTION_START_FOREGROUND".equals(action);.swift
String str2 = e7f.X;.swift
if (equals) {.swift
h88 x = h88.x();.swift
x.G(str2, "Started foreground service " + intent);.swift
e7f.b.h(new vj6((Object) e7f, (Object) intent.getStringExtra("KEY_WORKSPEC_ID"), false, 23));.swift
e7f.d(intent);.swift
return 3;.swift
} else if ("ACTION_NOTIFY".equals(action)) {.swift
e7f.d(intent);.swift
return 3;.swift
} else if ("ACTION_CANCEL_WORK".equals(action)) {.swift
h88 x2 = h88.x();.swift
x2.G(str2, "Stopping foreground work for " + intent);.swift
String stringExtra = intent.getStringExtra("KEY_WORKSPEC_ID");.swift
if (stringExtra == null || TextUtils.isEmpty(stringExtra)) {.swift
return 3;.swift
}.swift
UUID fromString = UUID.fromString(stringExtra);.swift
dpg dpg = e7f.a;.swift
dpg.getClass();.swift
dpg.d.h(new ew1(dpg, fromString));.swift
return 3;.swift
} else if ("ACTION_STOP_FOREGROUND".equals(action)) {.swift
return 3;.swift
} else {.swift
h88.x().G(str2, "Stopping foreground service");.swift
d7f d7f = e7f.z;.swift
if (d7f == null) {.swift
return 3;.swift
}.swift
SystemForegroundService systemForegroundService = (SystemForegroundService) d7f;.swift
systemForegroundService.c = true;.swift
h88.x().p(str, "All commands completed.");.swift
systemForegroundService.stopForeground(true);.swift
systemForegroundService.stopSelf();.swift
return 3;.swift
}.swift
}.swift
}.swift
