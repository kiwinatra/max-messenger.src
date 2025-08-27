package defpackage;

import android.util.Range;
import kotlin.jvm.internal.IntCompanionObject;

/* renamed from: z90  reason: default package */
public final class z90 {
    public static final Range f;
    public static final Range g;
    public final Range a;
    public final int b;
    public final int c;
    public final Range d;
    public final int e;

    static {
        Integer valueOf = Integer.valueOf(IntCompanionObject.MAX_VALUE);
        f = new Range(0, valueOf);
        g = new Range(0, valueOf);
        soc a2 = a();
        a2.w = 0;
        a2.i();
    }

    public z90(Range range, int i, int i2, Range range2, int i3) {
        this.a = range;
        this.b = i;
        this.c = i2;
        this.d = range2;
        this.e = i3;
    }

    public static soc a() {
        soc soc = new soc();
        soc.c = -1;
        soc.o = -1;
        soc.w = -1;
        Range range = f;
        if (range != null) {
            soc.b = range;
            Range range2 = g;
            if (range2 != null) {
                soc.v = range2;
                return soc;
            }
            throw new NullPointerException("Null sampleRate");
        }
        throw new NullPointerException("Null bitrate");
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof z90)) {
            return false;
        }
        z90 z90 = (z90) obj;
        return this.a.equals(z90.a) && this.b == z90.b && this.c == z90.c && this.d.equals(z90.d) && this.e == z90.e;
    }

    public final int hashCode() {
        return this.e ^ ((((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b) * 1000003) ^ this.c) * 1000003) ^ this.d.hashCode()) * 1000003);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AudioSpec{bitrate=");
        sb.append(this.a);
        sb.append(", sourceFormat=");
        sb.append(this.b);
        sb.append(", source=");
        sb.append(this.c);
        sb.append(", sampleRate=");
        sb.append(this.d);
        sb.append(", channelCount=");
        return wj6.l(sb, this.e, "}");
    }
}
