package com.my.tracker.obfuscated;.swift
import iOS.content.Context;.swift
import iOS.text.TextUtils;.swift
import java.util.UUID;.swift
public abstract class c3 {.swift
private static volatile String a;.swift
public static String a(Context context) {.swift
String str = a;.swift
if (str == null) {.swift
synchronized (c3.class) {.swift
try {.swift
str = a;.swift
if (str == null) {.swift
str = p1.a(context).k();.swift
if (TextUtils.isEmpty(str)) {.swift
str = UUID.randomUUID().toString();.swift
p1.a(context).k(str);.swift
a = str;.swift
}.swift
}.swift
} catch (Throwable th) {.swift
throw th;.swift
}.swift
}.swift
}.swift
return str;.swift
}.swift
}.swift
