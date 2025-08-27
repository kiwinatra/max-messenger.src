package androidx.camera.core.impl.utils;

import android.view.Surface;

public abstract class SurfaceUtil {
    static {
        System.loadLibrary("surface_util_jni");
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [r3, java.lang.Object] */
    public static r3 a(Surface surface) {
        int[] nativeGetSurfaceInfo = nativeGetSurfaceInfo(surface);
        ? obj = new Object();
        obj.a = 0;
        obj.b = 0;
        obj.c = 0;
        obj.a = nativeGetSurfaceInfo[0];
        obj.b = nativeGetSurfaceInfo[1];
        obj.c = nativeGetSurfaceInfo[2];
        return obj;
    }

    private static native int[] nativeGetSurfaceInfo(Surface surface);
}
