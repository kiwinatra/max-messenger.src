package androidx.media3.exoplayer.audio;

public final class AudioSink$WriteException extends Exception {
    public final int a;
    public final boolean b;
    public final ea6 c;

    public AudioSink$WriteException(int i, ea6 ea6, boolean z) {
        super(wj6.h(i, "AudioTrack write failed: "));
        this.b = z;
        this.a = i;
        this.c = ea6;
    }
}
