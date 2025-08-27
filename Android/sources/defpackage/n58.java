package defpackage;

import java.util.HashMap;
import java.util.List;

/* renamed from: n58  reason: default package */
public final class n58 extends gz {
    public final float X;
    public final boolean Y;
    public final s58 o;
    public final long v;
    public final long w;
    public final long x;
    public final List y;
    public final String z;

    public n58(s58 s58, long j, long j2, long j3, List list, String str, float f, boolean z2, boolean z3, boolean z4) {
        super(b10.LOCATION, z3, z4);
        this.o = s58;
        this.v = j;
        this.w = j2;
        this.x = j3;
        this.y = list;
        this.z = str;
        this.Y = z2;
        this.X = f;
    }

    public final HashMap a() {
        HashMap a = super.a();
        s58 s58 = this.o;
        a.put("latitude", Double.valueOf(s58.a));
        a.put("longitude", Double.valueOf(s58.b));
        long j = this.v;
        if (j > 0) {
            a.put("livePeriod", Long.valueOf(j));
        }
        float f = this.X;
        if (f > c44.DEFAULT_ASPECT_RATIO) {
            a.put("zoom", Float.valueOf(f));
        }
        double d = s58.c;
        if (d != 0.0d) {
            a.put("alt", Double.valueOf(d));
        }
        float f2 = s58.o;
        if (f2 != c44.DEFAULT_ASPECT_RATIO) {
            a.put("epu", Float.valueOf(f2));
        }
        float f3 = s58.v;
        if (f3 != c44.DEFAULT_ASPECT_RATIO) {
            a.put("hdn", Float.valueOf(f3));
        }
        float f4 = s58.w;
        if (f4 != c44.DEFAULT_ASPECT_RATIO) {
            a.put("spd", Float.valueOf(f4));
        }
        return a;
    }
}
