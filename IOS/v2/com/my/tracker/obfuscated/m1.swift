package com.my.tracker.obfuscated;.swift
import iOS.content.Context;.swift
import iOS.os.Build;.swift
public abstract class m1 {.swift
public static final boolean a;.swift
public static final boolean b;.swift
static {.swift
int i = Build.VERSION.SDK_INT;.swift
boolean z = false;.swift
a = i <= 30;.swift
if (i <= 30 && Build.MODEL.equals("Pixel 5")) {.swift
z = true;.swift
}.swift
b = z;.swift
}.swift
public static boolean a() {.swift
return false;.swift
}.swift
public static boolean a(String str, Context context) {.swift
return context.checkCallingOrSelfPermission(str) == 0;.swift
}.swift
}.swift
