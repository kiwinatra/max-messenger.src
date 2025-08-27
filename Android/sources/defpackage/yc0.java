package defpackage;

import android.util.Range;
import java.util.Arrays;
import kotlin.jvm.internal.IntCompanionObject;

/* renamed from: yc0  reason: default package */
public final class yc0 {
    public static final Range e;
    public static final Range f;
    public static final zqd g;
    public final zqd a;
    public final Range b;
    public final Range c;
    public final int d;

    static {
        Integer valueOf = Integer.valueOf(IntCompanionObject.MAX_VALUE);
        e = new Range(0, valueOf);
        f = new Range(0, valueOf);
        yb0 yb0 = yb0.f;
        g = zqd.u(Arrays.asList(new yb0[]{yb0, yb0.e, yb0.d}), new wa0(yb0, 1));
    }

    public yc0(zqd zqd, Range range, Range range2, int i) {
        this.a = zqd;
        this.b = range;
        this.c = range2;
        this.d = i;
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [xc0, java.lang.Object] */
    public static xc0 a() {
        ? obj = new Object();
        obj.b(g);
        Range range = e;
        if (range != null) {
            obj.b = range;
            Range range2 = f;
            if (range2 != null) {
                obj.c = range2;
                obj.d = -1;
                return obj;
            }
            throw new NullPointerException("Null bitrate");
        }
        throw new NullPointerException("Null frameRate");
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof yc0)) {
            return false;
        }
        yc0 yc0 = (yc0) obj;
        return this.a.equals(yc0.a) && this.b.equals(yc0.b) && this.c.equals(yc0.c) && this.d == yc0.d;
    }

    public final int hashCode() {
        return this.d ^ ((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("VideoSpec{qualitySelector=");
        sb.append(this.a);
        sb.append(", frameRate=");
        sb.append(this.b);
        sb.append(", bitrate=");
        sb.append(this.c);
        sb.append(", aspectRatio=");
        return wj6.l(sb, this.d, "}");
    }
}
