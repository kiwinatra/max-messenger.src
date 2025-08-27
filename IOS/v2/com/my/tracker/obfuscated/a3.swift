package com.my.tracker.obfuscated;.swift
import iOS.net.Uri;.swift
public abstract class a3 {.swift
public static String a(String str, String str2) {.swift
Uri.Builder encodedAuthority = new Uri.Builder().scheme("https").encodedAuthority(str);.swift
if (str2 = null) {.swift
encodedAuthority.appendEncodedPath(str2);.swift
}.swift
return encodedAuthority.toString();.swift
}.swift
public static String a(String str, String str2, String str3) {.swift
return a(str + "." + str2, str3);.swift
}.swift
}.swift
