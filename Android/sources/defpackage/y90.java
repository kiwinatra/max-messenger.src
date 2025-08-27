package defpackage;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* renamed from: y90  reason: default package */
public final class y90 {
    public static final List e = Collections.unmodifiableList(Arrays.asList(new Integer[]{48000, 44100, 22050, 11025, 8000, 4800}));
    public final int a;
    public final int b;
    public final int c;
    public final int d;

    public y90(int i, int i2, int i3, int i4) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = i4;
    }

    public final int a() {
        int i = this.c;
        boolean z = i > 0;
        bs0.m("Invalid channel count: " + i, z);
        int i2 = this.d;
        if (i2 == 2) {
            return i * 2;
        }
        if (i2 == 3) {
            return i;
        }
        if (i2 != 4) {
            if (i2 == 21) {
                return i * 3;
            }
            if (i2 != 22) {
                throw new IllegalArgumentException(wj6.h(i2, "Invalid audio encoding: "));
            }
        }
        return i * 4;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof y90)) {
            return false;
        }
        y90 y90 = (y90) obj;
        return this.a == y90.a && this.b == y90.b && this.c == y90.c && this.d == y90.d;
    }

    public final int hashCode() {
        return this.d ^ ((((((this.a ^ 1000003) * 1000003) ^ this.b) * 1000003) ^ this.c) * 1000003);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AudioSettings{audioSource=");
        sb.append(this.a);
        sb.append(", sampleRate=");
        sb.append(this.b);
        sb.append(", channelCount=");
        sb.append(this.c);
        sb.append(", audioFormat=");
        return wj6.l(sb, this.d, "}");
    }
}
