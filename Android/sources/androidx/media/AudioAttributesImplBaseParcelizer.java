package androidx.media;

public class AudioAttributesImplBaseParcelizer {
    public static AudioAttributesImplBase read(r2g r2g) {
        AudioAttributesImplBase audioAttributesImplBase = new AudioAttributesImplBase();
        audioAttributesImplBase.a = r2g.f(audioAttributesImplBase.a, 1);
        audioAttributesImplBase.b = r2g.f(audioAttributesImplBase.b, 2);
        audioAttributesImplBase.c = r2g.f(audioAttributesImplBase.c, 3);
        audioAttributesImplBase.d = r2g.f(audioAttributesImplBase.d, 4);
        return audioAttributesImplBase;
    }

    public static void write(AudioAttributesImplBase audioAttributesImplBase, r2g r2g) {
        r2g.getClass();
        r2g.j(audioAttributesImplBase.a, 1);
        r2g.j(audioAttributesImplBase.b, 2);
        r2g.j(audioAttributesImplBase.c, 3);
        r2g.j(audioAttributesImplBase.d, 4);
    }
}
