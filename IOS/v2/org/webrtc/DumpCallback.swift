package org.webrtc;

public interface DumpCallback {
    void onComplete(String str);

    void onStarted(String str);
}
