package defpackage;

import java.util.HashMap;

/* renamed from: v4e  reason: default package */
public final class v4e extends gz {
    public final gz X;
    public final long o;
    public final String v;
    public final String w;
    public final String x;
    public final String y;
    public final web z;

    public v4e(long j, String str, String str2, String str3, String str4, web web, gz gzVar, boolean z2, boolean z3) {
        super(b10.SHARE, z2, z3);
        this.o = j;
        this.v = str;
        this.w = str2;
        this.x = str3;
        this.y = str4;
        this.z = web;
        this.X = gzVar;
    }

    public final HashMap a() {
        HashMap a = super.a();
        a.put("shareId", Long.valueOf(this.o));
        a.put("url", this.v);
        return a;
    }
}
