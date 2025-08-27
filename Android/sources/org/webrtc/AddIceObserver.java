package org.webrtc;

public interface AddIceObserver {
    @CalledByNative
    void onAddFailure(String str);

    @CalledByNative
    void onAddSuccess();
}
