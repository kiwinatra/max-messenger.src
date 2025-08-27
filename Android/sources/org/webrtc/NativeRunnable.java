package org.webrtc;

public class NativeRunnable {
    private final Runnable runnable;

    public NativeRunnable(Runnable runnable2) {
        this.runnable = runnable2;
    }

    @CalledByNative
    public void run() {
        this.runnable.run();
    }
}
