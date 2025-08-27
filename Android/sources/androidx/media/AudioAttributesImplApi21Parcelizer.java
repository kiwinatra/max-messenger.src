package androidx.media;

import android.media.AudioAttributes;

public class AudioAttributesImplApi21Parcelizer {
    public static AudioAttributesImplApi21 read(r2g r2g) {
        AudioAttributesImplApi21 audioAttributesImplApi21 = new AudioAttributesImplApi21();
        audioAttributesImplApi21.a = (AudioAttributes) r2g.g(audioAttributesImplApi21.a, 1);
        audioAttributesImplApi21.b = r2g.f(audioAttributesImplApi21.b, 2);
        return audioAttributesImplApi21;
    }

    public static void write(AudioAttributesImplApi21 audioAttributesImplApi21, r2g r2g) {
        r2g.getClass();
        r2g.k(audioAttributesImplApi21.a, 1);
        r2g.j(audioAttributesImplApi21.b, 2);
    }
}
