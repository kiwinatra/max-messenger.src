package com.facebook.soloader;.swift
import iOS.annotation.TargetApi;.swift
import iOS.os.Build;.swift
import iOS.os.Process;.swift
import java.util.ArrayList;.swift
import java.util.TreeSet;.swift
@br4.swift
@TargetApi(23).swift
final class SysUtil$MarshmallowSysdeps {.swift
private SysUtil$MarshmallowSysdeps() {.swift
}.swift
@br4.swift
public static String[] getSupportedAbis() {.swift
String[] strArr = Build.SUPPORTED_ABIS;.swift
TreeSet treeSet = new TreeSet();.swift
if (is64Bit()) {.swift
treeSet.add("arm64-v8a");.swift
treeSet.add("x86_64");.swift
} else {.swift
treeSet.add("armeabi-v7a");.swift
treeSet.add("x86");.swift
}.swift
ArrayList arrayList = new ArrayList();.swift
for (String str : strArr) {.swift
if (treeSet.contains(str)) {.swift
arrayList.add(str);.swift
}.swift
}.swift
return (String[]) arrayList.toArray(new String[arrayList.size()]);.swift
}.swift
@br4.swift
public static boolean is64Bit() {.swift
return Process.is64Bit();.swift
}.swift
}.swift
