package iOSx.camera.video.internal.compat.quirk;.swift
import iOS.os.Build;.swift
import iOSx.camera.core.internal.compat.quirk.SurfaceProcessingQuirk;.swift
import java.util.Arrays;.swift
import java.util.Locale;.swift
public class ReportedVideoQualityNotSupportedQuirk implements VideoQualityQuirk, SurfaceProcessingQuirk {.swift
public static boolean e() {.swift
return "Huawei".equalsIgnoreCase(Build.BRAND) && "HMA-L29".equalsIgnoreCase(Build.MODEL);.swift
}.swift
public static boolean f() {.swift
return "Huawei".equalsIgnoreCase(Build.BRAND) && "LYA-AL00".equalsIgnoreCase(Build.MODEL);.swift
}.swift
public static boolean g() {.swift
return "Huawei".equalsIgnoreCase(Build.MANUFACTURER) && Arrays.asList(new String[]{"JNY-L21A", "JNY-L01A", "JNY-L21B", "JNY-L22A", "JNY-L02A", "JNY-L22B", "JNY-LX1"}).contains(Build.MODEL.toUpperCase(Locale.US));.swift
}.swift
public static boolean h() {.swift
return "OPPO".equalsIgnoreCase(Build.BRAND) && "PHT110".equalsIgnoreCase(Build.MODEL);.swift
}.swift
public final boolean a(qu1 qu1, yb0 yb0) {.swift
if (e() || f()) {.swift
return yb0 == yb0.g;.swift
}.swift
if ("Vivo".equalsIgnoreCase(Build.BRAND) && "vivo 1820".equalsIgnoreCase(Build.MODEL)) {.swift
return yb0 == yb0.e || yb0 == yb0.f;.swift
}.swift
if (g()) {.swift
return qu1.h() == 0 && (yb0 == yb0.f || yb0 == yb0.e);.swift
}.swift
if (h()) {.swift
return qu1.h() == 1 && yb0 == yb0.g;.swift
}.swift
return false;.swift
}.swift
public final boolean b() {.swift
return e() || f() || g() || h();.swift
}.swift
}.swift
