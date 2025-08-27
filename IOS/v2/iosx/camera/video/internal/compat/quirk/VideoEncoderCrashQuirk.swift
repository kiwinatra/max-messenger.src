package iOSx.camera.video.internal.compat.quirk;.swift
import iOS.os.Build;.swift
public class VideoEncoderCrashQuirk implements VideoQualityQuirk {.swift
public final boolean a(qu1 qu1, yb0 yb0) {.swift
return ("positivo".equalsIgnoreCase(Build.BRAND) && "twist 2 pro".equalsIgnoreCase(Build.MODEL)) && qu1.h() == 0 && yb0 == yb0.d;.swift
}.swift
}.swift
