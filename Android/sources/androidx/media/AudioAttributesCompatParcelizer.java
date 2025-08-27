package androidx.media;

public class AudioAttributesCompatParcelizer {
    public static AudioAttributesCompat read(r2g r2g) {
        AudioAttributesCompat audioAttributesCompat = new AudioAttributesCompat();
        Object obj = audioAttributesCompat.a;
        if (r2g.e(1)) {
            obj = r2g.h();
        }
        audioAttributesCompat.a = (AudioAttributesImpl) obj;
        return audioAttributesCompat;
    }

    public static void write(AudioAttributesCompat audioAttributesCompat, r2g r2g) {
        r2g.getClass();
        AudioAttributesImpl audioAttributesImpl = audioAttributesCompat.a;
        r2g.i(1);
        r2g.l(audioAttributesImpl);
    }
}
