package org.webrtc;

public class BreakpadBridge {
    public static void crash() {
        nativeCrash();
    }

    public static void initBreakpad(String str) {
        nativeInitBreakpad(str);
    }

    private static native void nativeCrash();

    private static native void nativeInitBreakpad(String str);
}
