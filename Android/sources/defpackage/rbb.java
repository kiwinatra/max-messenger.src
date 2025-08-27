package defpackage;

import java.util.Arrays;

/* renamed from: rbb  reason: default package */
public final class rbb extends qpc {
    public final float b;

    public rbb() {
        this.b = -1.0f;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof rbb)) {
            return false;
        }
        return this.b == ((rbb) obj).b;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Float.valueOf(this.b)});
    }

    public rbb(float f) {
        y64.f("percent must be in the range of [0, 100]", f >= c44.DEFAULT_ASPECT_RATIO && f <= 100.0f);
        this.b = f;
    }
}
