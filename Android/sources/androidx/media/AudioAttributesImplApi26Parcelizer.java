package androidx.media;

import android.media.AudioAttributes;

public class AudioAttributesImplApi26Parcelizer {
    public static AudioAttributesImplApi26 read(r2g r2g) {
        AudioAttributesImplApi26 audioAttributesImplApi26 = new AudioAttributesImplApi26();
        audioAttributesImplApi26.a = (AudioAttributes) r2g.g(audioAttributesImplApi26.a, 1);
        audioAttributesImplApi26.b = r2g.f(audioAttributesImplApi26.b, 2);
        return audioAttributesImplApi26;
    }

    public static void write(AudioAttributesImplApi26 audioAttributesImplApi26, r2g r2g) {
        r2g.getClass();
        r2g.k(audioAttributesImplApi26.a, 1);
        r2g.j(audioAttributesImplApi26.b, 2);
    }
}
