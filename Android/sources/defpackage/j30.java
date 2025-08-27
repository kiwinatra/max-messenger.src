package defpackage;

import android.media.AudioAttributes;
import java.util.Objects;

/* renamed from: j30  reason: default package */
public final class j30 {
    public final AudioAttributes a;

    public j30(AudioAttributes audioAttributes) {
        this.a = audioAttributes;
    }

    public final int a() {
        AudioAttributes audioAttributes = this.a;
        audioAttributes.getClass();
        return audioAttributes.getContentType();
    }

    public final int b() {
        AudioAttributes audioAttributes = this.a;
        audioAttributes.getClass();
        return audioAttributes.getFlags();
    }

    public final int c() {
        AudioAttributes audioAttributes = this.a;
        audioAttributes.getClass();
        return audioAttributes.getUsage();
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof j30)) {
            return false;
        }
        return Objects.equals(this.a, ((j30) obj).a);
    }

    public final int hashCode() {
        AudioAttributes audioAttributes = this.a;
        audioAttributes.getClass();
        return audioAttributes.hashCode();
    }

    public final String toString() {
        return "AudioAttributesCompat: audioattributes=" + this.a;
    }
}
