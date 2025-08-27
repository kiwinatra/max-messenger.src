package defpackage;

import java.io.Serializable;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: b89  reason: default package */
public final class b89 implements Serializable, g88 {
    public final List A0;
    public final cl4 B0;
    public final ud9 C0;
    public final mf9 X;
    public final pe9 Y;
    public final int Z;
    public final long a;
    public final long b;
    public final long c;
    public final long o;
    public final re9 v;
    public final long v0;
    public final long w;
    public final int w0;
    public final String x;
    public final int x0;
    public final a00 y;
    public final long y0;
    public final lc9 z;
    public final g72 z0;

    public b89(long j, long j2, long j3, long j4, re9 re9, long j5, String str, a00 a00, lc9 lc9, mf9 mf9, pe9 pe9, int i, long j6, int i2, int i3, long j7, g72 g72, List list, cl4 cl4, ud9 ud9) {
        this.a = j;
        this.b = j2;
        this.c = j3;
        this.o = j4;
        this.v = re9;
        this.w = j5;
        this.x = str;
        this.y = a00;
        this.z = lc9;
        this.X = mf9;
        this.Y = pe9;
        this.Z = i;
        this.v0 = j6;
        this.w0 = i2;
        this.x0 = i3;
        this.y0 = j7;
        this.z0 = g72;
        this.A0 = list;
        this.B0 = cl4;
        this.C0 = ud9;
    }

    public final String a(boolean z2, boolean z3) {
        String str = this.x;
        if (str == null) {
            str = null;
        } else if (!z3) {
            str = "***";
        }
        String U = iq.U(Long.valueOf(this.b));
        String w2 = n54.w(this.A0, z2, z3);
        return "Message{id=" + this.a + ", text=" + str + ", delayedAttrs=" + this.B0 + ", time=" + U + ", status=" + this.v + ", sender=" + this.o + ", cid=" + this.w + ", attaches=" + this.y + ", type=" + this.X + ", elements=" + w2 + "}";
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b89)) {
            return false;
        }
        b89 b89 = (b89) obj;
        return this.a == b89.a && this.b == b89.b && this.c == b89.c && this.o == b89.o && this.v == b89.v && this.w == b89.w && Intrinsics.areEqual((Object) this.x, (Object) b89.x) && Intrinsics.areEqual((Object) this.y, (Object) b89.y) && Intrinsics.areEqual((Object) this.z, (Object) b89.z) && this.X == b89.X && Intrinsics.areEqual((Object) this.Y, (Object) b89.Y) && this.Z == b89.Z && this.v0 == b89.v0 && this.w0 == b89.w0 && this.x0 == b89.x0 && this.y0 == b89.y0 && Intrinsics.areEqual((Object) this.z0, (Object) b89.z0) && Intrinsics.areEqual((Object) this.A0, (Object) b89.A0) && Intrinsics.areEqual((Object) this.B0, (Object) b89.B0) && Intrinsics.areEqual((Object) this.C0, (Object) b89.C0);
    }

    public final int hashCode() {
        int i = wzf.i(wzf.i(wzf.i(Long.hashCode(this.a) * 31, 31, this.b), 31, this.c), 31, this.o);
        int i2 = 0;
        re9 re9 = this.v;
        int i3 = wzf.i((i + (re9 == null ? 0 : re9.hashCode())) * 31, 31, this.w);
        String str = this.x;
        int hashCode = (this.y.hashCode() + ((i3 + (str == null ? 0 : str.hashCode())) * 31)) * 31;
        lc9 lc9 = this.z;
        int hashCode2 = (this.X.hashCode() + ((hashCode + (lc9 == null ? 0 : lc9.hashCode())) * 31)) * 31;
        pe9 pe9 = this.Y;
        int i4 = wzf.i(rae.h(this.x0, rae.h(this.w0, wzf.i(rae.h(this.Z, (hashCode2 + (pe9 == null ? 0 : pe9.hashCode())) * 31, 31), 31, this.v0), 31), 31), 31, this.y0);
        g72 g72 = this.z0;
        int i5 = rae.i(this.A0, (i4 + (g72 == null ? 0 : g72.hashCode())) * 31, 31);
        cl4 cl4 = this.B0;
        int hashCode3 = (i5 + (cl4 == null ? 0 : cl4.hashCode())) * 31;
        ud9 ud9 = this.C0;
        if (ud9 != null) {
            i2 = ud9.hashCode();
        }
        return hashCode3 + i2;
    }

    public final String toString() {
        return a(false, false);
    }
}
