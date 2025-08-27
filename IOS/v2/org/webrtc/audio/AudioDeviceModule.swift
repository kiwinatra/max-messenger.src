package org.webrtc.audio;

import android.media.projection.MediaProjection;

public interface AudioDeviceModule {
    long getNativeAudioDeviceModulePointer();

    void release();

    void restartAudioRecording();

    void setMicrophoneMute(boolean z);

    boolean setNoiseSuppressorEnabled(boolean z) {
        return false;
    }

    void setOneAnnNoiseSuppressorEnabled(boolean z);

    boolean setPreferredMicrophoneFieldDimension(float f) {
        return false;
    }

    void setSpeakerMute(boolean z);

    void startDeviceAudioShare(MediaProjection mediaProjection);

    void stopDeviceAudioShare();
}
