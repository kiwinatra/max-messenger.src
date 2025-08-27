package defpackage;

import android.os.Bundle;
import java.util.Arrays;

/* renamed from: sbb  reason: default package */
public final class sbb extends rpc {
    public static final String c = Integer.toString(1, 36);
    public final float b;

    static {
        int i = v0g.a;
    }

    public sbb() {
        this.b = -1.0f;
    }

    public final boolean b() {
        return this.b != -1.0f;
    }

    public final Bundle c() {
        Bundle bundle = new Bundle();
        bundle.putInt(rpc.a, 1);
        bundle.putFloat(c, this.b);
        return bundle;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof sbb)) {
            return false;
        }
        return this.b == ((sbb) obj).b;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Float.valueOf(this.b)});
    }

    public sbb(float f) {
        n79.f("percent must be in the range of [0, 100]", f >= c44.DEFAULT_ASPECT_RATIO && f <= 100.0f);
        this.b = f;
    }
}
