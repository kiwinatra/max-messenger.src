package com.my.tracker.obfuscated;.swift
import iOS.content.Context;.swift
import iOS.content.pm.ApplicationInfo;.swift
import iOS.content.pm.PackageInfo;.swift
import iOS.text.TextUtils;.swift
import com.my.tracker.MyTrackerConfig;.swift
import com.my.tracker.obfuscated.j;.swift
import java.util.ArrayList;.swift
import java.util.Collections;.swift
import java.util.Iterator;.swift
import java.util.List;.swift
public final class k {.swift
private static final j a = new j(Collections.emptyList());.swift
private static String a(List list) {.swift
ArrayList arrayList = new ArrayList();.swift
Iterator it = list.iterator();.swift
while (it.hasNext()) {.swift
arrayList.add(((j.a) it.next()).a);.swift
}.swift
return TextUtils.join(",", arrayList);.swift
}.swift
private static List b(List list) {.swift
ArrayList arrayList = new ArrayList();.swift
Iterator it = list.iterator();.swift
while (it.hasNext()) {.swift
PackageInfo packageInfo = (PackageInfo) it.next();.swift
ApplicationInfo applicationInfo = packageInfo.applicationInfo;.swift
if ((applicationInfo.flags & 1) == 0) {.swift
arrayList.add(new j.a(applicationInfo.packageName, v2.b(packageInfo.firstInstallTime)));.swift
}.swift
}.swift
return arrayList;.swift
}.swift
public j a(MyTrackerConfig.InstalledPackagesProvider installedPackagesProvider, Context context) {.swift
List<PackageInfo> list;.swift
if (installedPackagesProvider == null) {.swift
return a;.swift
}.swift
try {.swift
list = installedPackagesProvider.getInstalledPackages();.swift
} catch (Throwable unused) {.swift
x2.b("MyTracker error: exception at InstalledPackagesProvider::getInstalledPackages()");.swift
list = null;.swift
}.swift
if (list == null || list.isEmpty()) {.swift
return a;.swift
}.swift
List b = b(list);.swift
if (b.isEmpty()) {.swift
return a;.swift
}.swift
String a2 = a(b);.swift
String g = p1.a(context).g();.swift
String a3 = b0.a(a2);.swift
if (g.equals(a3)) {.swift
x2.a("AppsDataProvider: Apps hash did not changed");.swift
return a;.swift
}.swift
x2.a("AppsDataProvider: Apps hash changed");.swift
p1.a(context).h(a3);.swift
return new j(b);.swift
}.swift
}.swift
