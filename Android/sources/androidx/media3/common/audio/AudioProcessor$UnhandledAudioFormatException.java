package androidx.media3.common.audio;

public final class AudioProcessor$UnhandledAudioFormatException extends Exception {
    public final j60 a;

    public AudioProcessor$UnhandledAudioFormatException(j60 j60) {
        this("Unhandled input format:", j60);
    }

    public AudioProcessor$UnhandledAudioFormatException(String str, j60 j60) {
        super(str + " " + j60);
        this.a = j60;
    }
}
