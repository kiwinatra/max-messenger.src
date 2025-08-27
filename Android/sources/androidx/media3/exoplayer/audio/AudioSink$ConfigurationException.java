package androidx.media3.exoplayer.audio;

import androidx.media3.common.audio.AudioProcessor$UnhandledAudioFormatException;

public final class AudioSink$ConfigurationException extends Exception {
    public final ea6 a;

    public AudioSink$ConfigurationException(AudioProcessor$UnhandledAudioFormatException audioProcessor$UnhandledAudioFormatException, ea6 ea6) {
        super(audioProcessor$UnhandledAudioFormatException);
        this.a = ea6;
    }

    public AudioSink$ConfigurationException(ea6 ea6, String str) {
        super(str);
        this.a = ea6;
    }
}
