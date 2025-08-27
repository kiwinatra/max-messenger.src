package defpackage;

import java.util.HashMap;
import java.util.List;

/* renamed from: doe  reason: default package */
public final class doe extends gz {
    public final String X;
    public final List Y;
    public final String Z;
    public final long o;
    public final int v;
    public final int v0;
    public final int w;
    public final long w0;
    public final String x;
    public final String x0;
    public final long y;
    public final boolean y0;
    public final String z;
    public final int z0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public doe(long j, int i, int i2, String str, long j2, String str2, String str3, List list, String str4, int i3, long j3, String str5, boolean z2, int i4, boolean z3, boolean z4) {
        super(b10.STICKER, z3, z4);
        this.o = j;
        this.v = i;
        this.w = i2;
        this.x = str;
        this.y = j2;
        this.z = str2;
        this.X = str3;
        this.Y = list;
        this.Z = str4;
        this.v0 = i3;
        this.w0 = j3;
        this.x0 = str5;
        this.y0 = z2;
        this.z0 = i4;
    }

    public final HashMap a() {
        HashMap a = super.a();
        a.put("stickerId", Long.valueOf(this.o));
        return a;
    }
}
