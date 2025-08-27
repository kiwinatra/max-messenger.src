package defpackage;

import java.io.Closeable;

/* renamed from: k4d  reason: default package */
public final class k4d implements Closeable {
    public final k4d X;
    public final long Y;
    public final long Z;
    public final y2d a;
    public final y8c b;
    public final String c;
    public final int o;
    public final jw6 v;
    public final ce v0;
    public final lx6 w;
    public final ptc x;
    public final k4d y;
    public final k4d z;

    public k4d(y2d y2d, y8c y8c, String str, int i, jw6 jw6, lx6 lx6, ptc ptc, k4d k4d, k4d k4d2, k4d k4d3, long j, long j2, ce ceVar) {
        this.a = y2d;
        this.b = y8c;
        this.c = str;
        this.o = i;
        this.v = jw6;
        this.w = lx6;
        this.x = ptc;
        this.y = k4d;
        this.z = k4d2;
        this.X = k4d3;
        this.Y = j;
        this.Z = j2;
        this.v0 = ceVar;
    }

    public static String a(k4d k4d, String str) {
        String b2 = k4d.w.b(str);
        if (b2 != null) {
            return b2;
        }
        return null;
    }

    public final void close() {
        ptc ptc = this.x;
        if (ptc != null) {
            ptc.close();
            return;
        }
        throw new IllegalStateException("response is not eligible for a body and must not be closed".toString());
    }

    public final boolean isSuccessful() {
        int i = this.o;
        return 200 <= i && 299 >= i;
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [java.lang.Object, j4d] */
    public final j4d m() {
        ? obj = new Object();
        obj.a = this.a;
        obj.b = this.b;
        obj.c = this.o;
        obj.d = this.c;
        obj.e = this.v;
        obj.f = this.w.e();
        obj.g = this.x;
        obj.h = this.y;
        obj.i = this.z;
        obj.j = this.X;
        obj.k = this.Y;
        obj.l = this.Z;
        obj.m = this.v0;
        return obj;
    }

    public final String toString() {
        return "Response{protocol=" + this.b + ", code=" + this.o + ", message=" + this.c + ", url=" + this.a.b + '}';
    }
}
