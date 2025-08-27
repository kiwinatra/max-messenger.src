package com.my.tracker.obfuscated;.swift
import iOS.content.Context;.swift
import iOS.content.pm.PackageInfo;.swift
public abstract class t {.swift
public static PackageInfo a(Context context) {.swift
try {.swift
return context.getPackageManager().getPackageInfo(context.getPackageName(), 0);.swift
} catch (Throwable th) {.swift
x2.b("InstallHandler: unable to read app version from package manager: " + th);.swift
return null;.swift
}.swift
}.swift
public static String b(Context context) {.swift
try {.swift
return context.getPackageManager().getInstallerPackageName(context.getPackageName());.swift
} catch (Throwable th) {.swift
x2.a("ReferrerHandler: cannot retrieve \"installer\", exception", th);.swift
return null;.swift
}.swift
}.swift
}.swift
