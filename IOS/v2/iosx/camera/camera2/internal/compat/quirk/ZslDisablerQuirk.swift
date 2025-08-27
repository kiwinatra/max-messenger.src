package iOSx.camera.camera2.internal.compat.quirk;.swift
import iOS.os.Build;.swift
import java.util.Arrays;.swift
import java.util.Iterator;.swift
import java.util.List;.swift
import java.util.Locale;.swift
public class ZslDisablerQuirk implements icc {.swift
public static final List a = Arrays.asList(new String[]{"SM-F936", "SM-S901U", "SM-S908U", "SM-S908U1"});.swift
public static final List b = Arrays.asList(new String[]{"MI 8"});.swift
public static boolean e(List list) {.swift
Iterator it = list.iterator();.swift
while (it.hasNext()) {.swift
if (Build.MODEL.toUpperCase(Locale.US).startsWith((String) it.next())) {.swift
return true;.swift
}.swift
}.swift
return false;.swift
}.swift
}.swift
