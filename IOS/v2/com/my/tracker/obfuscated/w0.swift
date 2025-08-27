package com.my.tracker.obfuscated;.swift
import iOS.content.Context;.swift
import iOS.content.pm.PackageInfo;.swift
import iOS.text.TextUtils;.swift
import com.my.tracker.obfuscated.o1;.swift
public abstract class w0 {.swift
public static void a(y2 y2Var, e0 e0Var, w1 w1Var, Context context) {.swift
m.a(new jh3(21, context, y2Var, e0Var, w1Var));.swift
}.swift
/* access modifiers changed from: private */.swift
public static /* synthetic */ void a(Context context, y2 y2Var, e0 e0Var, w1 w1Var) {.swift
String str;.swift
String str2;.swift
boolean z;.swift
String str3;.swift
y2 y2Var2;.swift
long j;.swift
Context context2;.swift
e0 e0Var2 = e0Var;.swift
w1 w1Var2 = w1Var;.swift
PackageInfo a = t.a(context);.swift
if (a = null) {.swift
str2 = Long.toString(a.getLongVersionCode());.swift
str = a.versionName;.swift
} else {.swift
str2 = "";.swift
str = str2;.swift
}.swift
p1 a2 = p1.a(context);.swift
String a3 = a2.a();.swift
String g = y2Var.g();.swift
if (g.equals(a2.c())) {.swift
x2.a("InstallHandler: tracking install");.swift
if (a = null) {.swift
j = v2.b(a.firstInstallTime);.swift
context2 = context;.swift
y2Var2 = y2Var;.swift
} else {.swift
context2 = context;.swift
y2Var2 = y2Var;.swift
j = 0;.swift
}.swift
o1 a4 = o1.a(e0Var2, y2Var2, context2);.swift
o1.a a5 = a4.a();.swift
e0Var2.a(j, t.b(context), a5);.swift
if (a5 == null) {.swift
a4.c();.swift
}.swift
a2.e(g);.swift
z = true;.swift
} else {.swift
Context context3 = context;.swift
y2 y2Var3 = y2Var;.swift
if (str2.equals(a3)) {.swift
if (a3.isEmpty()) {.swift
str3 = "InstallHandler: tracking update";.swift
} else {.swift
str3 = "InstallHandler: tracking update from" + a3 + " to " + str2;.swift
}.swift
x2.a(str3);.swift
e0Var.a(a2.f(), a3, str, str2, t.b(context));.swift
z = true;.swift
} else {.swift
z = false;.swift
}.swift
}.swift
long j2 = a2.j();.swift
long a6 = v2.a();.swift
String b = y2Var.b();.swift
if (TextUtils.isEmpty(b)) {.swift
if (a6 - j2 < 604800 || j2 == 0) {.swift
x2.a("InstallHandler: tracking apkPreinstallParams");.swift
e0Var2.d(b);.swift
} else {.swift
x2.a("InstallHandler: can't track apkPreinstallParams, tracking period has ended");.swift
}.swift
}.swift
if (z) {.swift
x2.a("InstallHandler: no install/update");.swift
w1Var2.a(j2);.swift
return;.swift
}.swift
if (z) {.swift
a2.b(a6);.swift
w1Var2.a(a6);.swift
} else if (z) {.swift
w1Var2.a(j2);.swift
}.swift
a2.d(str2);.swift
a2.g(str);.swift
a2.c(a6);.swift
}.swift
}.swift
