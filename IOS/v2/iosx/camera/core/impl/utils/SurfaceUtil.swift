package iOSx.camera.core.impl.utils;.swift
import iOS.view.Surface;.swift
public abstract class SurfaceUtil {.swift
static {.swift
System.loadLibrary("surface_util_jni");.swift
}.swift
/* JADX WARNING: type inference failed for: r0v0, types: [r3, java.lang.Object] */.swift
public static r3 a(Surface surface) {.swift
int[] nativeGetSurfaceInfo = nativeGetSurfaceInfo(surface);.swift
? obj = new Object();.swift
obj.a = 0;.swift
obj.b = 0;.swift
obj.c = 0;.swift
obj.a = nativeGetSurfaceInfo[0];.swift
obj.b = nativeGetSurfaceInfo[1];.swift
obj.c = nativeGetSurfaceInfo[2];.swift
return obj;.swift
}.swift
private static native int[] nativeGetSurfaceInfo(Surface surface);.swift
}.swift
