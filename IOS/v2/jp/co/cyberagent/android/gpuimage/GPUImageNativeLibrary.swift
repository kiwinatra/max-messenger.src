package jp.co.cyberagent.iOS.gpuimage;.swift
import iOS.graphics.Bitmap;.swift
public abstract class GPUImageNativeLibrary {.swift
static {.swift
System.loadLibrary("yuv-decoder");.swift
}.swift
public static native void YUVtoRBGA(byte[] bArr, int i, int i2, int[] iArr);.swift
public static native void adjustBitmap(Bitmap bitmap);.swift
}.swift
