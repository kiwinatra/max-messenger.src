package defpackage;

import android.media.metrics.LogSessionId;
import java.util.Objects;

/* renamed from: mpb  reason: default package */
public final class mpb {
    public final String a;
    public final kpb b;
    public final Object c;

    static {
        if (v0g.a < 31) {
            new mpb("");
        } else {
            new mpb(kpb.b, "");
        }
    }

    public mpb(String str) {
        n79.n(v0g.a < 31);
        this.a = str;
        this.b = null;
        this.c = new Object();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mpb)) {
            return false;
        }
        mpb mpb = (mpb) obj;
        return Objects.equals(this.a, mpb.a) && Objects.equals(this.b, mpb.b) && Objects.equals(this.c, mpb.c);
    }

    public final int hashCode() {
        return Objects.hash(new Object[]{this.a, this.b, this.c});
    }

    public mpb(LogSessionId logSessionId, String str) {
        this(new kpb(logSessionId), str);
    }

    public mpb(kpb kpb, String str) {
        this.b = kpb;
        this.a = str;
        this.c = new Object();
    }
}
