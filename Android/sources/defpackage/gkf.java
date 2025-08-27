package defpackage;

import android.net.Uri;
import java.util.Collections;
import java.util.List;

/* renamed from: gkf  reason: default package */
public final class gkf implements jv0 {
    public static final Object A0 = new Object();
    public static final Object B0 = new Object();
    public static final gr8 C0;
    public boolean X;
    public vq8 Y;
    public boolean Z;
    public Object a = A0;
    public Object b;
    public gr8 c = C0;
    public Object o;
    public long v;
    public long v0;
    public long w;
    public long w0;
    public long x;
    public int x0;
    public boolean y;
    public int y0;
    public boolean z;
    public long z0;

    /* JADX WARNING: type inference failed for: r8v0, types: [pq8, rq8] */
    static {
        oq8 oq8 = new oq8();
        lx5 lx5 = tb7.b;
        k0d k0d = k0d.v;
        List emptyList = Collections.emptyList();
        k0d k0d2 = k0d.v;
        Uri uri = Uri.EMPTY;
        C0 = new gr8("com.google.android.exoplayer2.Timeline", new pq8(oq8), uri != null ? new zq8(uri, (cvg) null, emptyList, k0d2) : null, new vq8(-9223372036854775807L, -9223372036854775807L, -9223372036854775807L, -3.4028235E38f, -3.4028235E38f), ts8.Q0);
    }

    public final boolean a() {
        y64.j(this.X == (this.Y != null));
        return this.Y != null;
    }

    public final void b(Object obj, gr8 gr8, Object obj2, long j, long j2, long j3, boolean z2, boolean z3, vq8 vq8, long j4, long j5, int i, int i2, long j6) {
        zq8 zq8;
        gr8 gr82 = gr8;
        vq8 vq82 = vq8;
        this.a = obj;
        this.c = gr82 != null ? gr82 : C0;
        this.b = (gr82 == null || (zq8 = gr82.b) == null) ? null : zq8.f;
        this.o = obj2;
        this.v = j;
        this.w = j2;
        this.x = j3;
        this.y = z2;
        this.z = z3;
        this.X = vq82 != null;
        this.Y = vq82;
        this.v0 = j4;
        this.w0 = j5;
        this.x0 = i;
        this.y0 = i2;
        this.z0 = j6;
        this.Z = false;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null) {
            if (gkf.class.equals(obj.getClass())) {
                gkf gkf = (gkf) obj;
                return t0g.a(this.a, gkf.a) && t0g.a(this.c, gkf.c) && t0g.a(this.o, gkf.o) && t0g.a(this.Y, gkf.Y) && this.v == gkf.v && this.w == gkf.w && this.x == gkf.x && this.y == gkf.y && this.z == gkf.z && this.Z == gkf.Z && this.v0 == gkf.v0 && this.w0 == gkf.w0 && this.x0 == gkf.x0 && this.y0 == gkf.y0 && this.z0 == gkf.z0;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = (this.c.hashCode() + ((this.a.hashCode() + 217) * 31)) * 31;
        Object obj = this.o;
        int i = 0;
        int hashCode2 = (hashCode + (obj == null ? 0 : obj.hashCode())) * 31;
        vq8 vq8 = this.Y;
        if (vq8 != null) {
            i = vq8.hashCode();
        }
        long j = this.v;
        long j2 = this.w;
        long j3 = this.x;
        long j4 = this.v0;
        long j5 = this.w0;
        long j6 = this.z0;
        return ((((((((((((((((((((((hashCode2 + i) * 31) + ((int) (j ^ (j >>> 32)))) * 31) + ((int) (j2 ^ (j2 >>> 32)))) * 31) + ((int) (j3 ^ (j3 >>> 32)))) * 31) + (this.y ? 1 : 0)) * 31) + (this.z ? 1 : 0)) * 31) + (this.Z ? 1 : 0)) * 31) + ((int) (j4 ^ (j4 >>> 32)))) * 31) + ((int) (j5 ^ (j5 >>> 32)))) * 31) + this.x0) * 31) + this.y0) * 31) + ((int) (j6 ^ (j6 >>> 32)));
    }
}
