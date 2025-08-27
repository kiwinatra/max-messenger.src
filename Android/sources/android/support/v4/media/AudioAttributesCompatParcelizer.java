package android.support.v4.media;

import androidx.media.AudioAttributesCompat;

public final class AudioAttributesCompatParcelizer extends androidx.media.AudioAttributesCompatParcelizer {
    public static AudioAttributesCompat read(r2g r2g) {
        return androidx.media.AudioAttributesCompatParcelizer.read(r2g);
    }

    public static void write(AudioAttributesCompat audioAttributesCompat, r2g r2g) {
        androidx.media.AudioAttributesCompatParcelizer.write(audioAttributesCompat, r2g);
    }
}
