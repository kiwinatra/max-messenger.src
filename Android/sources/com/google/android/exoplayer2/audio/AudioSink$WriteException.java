package com.google.android.exoplayer2.audio;

public final class AudioSink$WriteException extends Exception {
    public final boolean a;
    public final ca6 b;

    public AudioSink$WriteException(int i, ca6 ca6, boolean z) {
        super(i2a.h(36, i, "AudioTrack write failed: "));
        this.a = z;
        this.b = ca6;
    }
}
