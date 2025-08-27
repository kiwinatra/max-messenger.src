package org.webrtc;

public class NativeDumpCallback implements DumpCallback {
    private final DumpCallback callback;

    public NativeDumpCallback(DumpCallback dumpCallback) {
        this.callback = dumpCallback;
    }

    @CalledByNative
    public void onComplete(String str) {
        this.callback.onComplete(str);
    }

    @CalledByNative
    public void onStarted(String str) {
        this.callback.onStarted(str);
    }
}
