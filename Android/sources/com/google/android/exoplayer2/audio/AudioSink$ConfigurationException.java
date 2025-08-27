package com.google.android.exoplayer2.audio;

public final class AudioSink$ConfigurationException extends Exception {
    public final ca6 a;

    public AudioSink$ConfigurationException(AudioProcessor$UnhandledAudioFormatException audioProcessor$UnhandledAudioFormatException, ca6 ca6) {
        super(audioProcessor$UnhandledAudioFormatException);
        this.a = ca6;
    }

    public AudioSink$ConfigurationException(String str, ca6 ca6) {
        super(str);
        this.a = ca6;
    }
}
