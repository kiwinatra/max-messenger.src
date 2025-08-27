package defpackage;

import android.net.Uri;
import java.util.BitSet;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: xk2  reason: default package */
public final class xk2 implements lz7, gz6 {
    public final Long A0;
    public final long B0;
    public final CharSequence C0;
    public final int D0;
    public final long E0;
    public final boolean X;
    public final long Y;
    public final wk2 Z;
    public final long a;
    public final Uri b;
    public final CharSequence c;
    public final CharSequence o;
    public final CharSequence v;
    public final int v0;
    public final CharSequence w;
    public final boolean w0;
    public final CharSequence x;
    public final boolean x0;
    public final String y;
    public final boolean y0;
    public final boolean z;
    public final long z0;

    public xk2(long j, Uri uri, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, CharSequence charSequence4, CharSequence charSequence5, String str, boolean z2, boolean z3, long j2, wk2 wk2, int i, boolean z4, boolean z5, boolean z6, long j3, Long l, long j4, CharSequence charSequence6) {
        long j5 = j;
        long j6 = j3;
        this.a = j5;
        this.b = uri;
        this.c = charSequence;
        this.o = charSequence2;
        this.v = charSequence3;
        this.w = charSequence4;
        this.x = charSequence5;
        this.y = str;
        this.z = z2;
        this.X = z3;
        this.Y = j2;
        this.Z = wk2;
        this.v0 = i;
        this.w0 = z4;
        this.x0 = z5;
        this.y0 = z6;
        this.z0 = j6;
        this.A0 = l;
        this.B0 = j4;
        this.C0 = charSequence6;
        this.D0 = j6 != 0 ? as2.b : as2.a;
        this.E0 = j5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xk2)) {
            return false;
        }
        xk2 xk2 = (xk2) obj;
        return this.a == xk2.a && Intrinsics.areEqual((Object) this.b, (Object) xk2.b) && Intrinsics.areEqual((Object) this.c, (Object) xk2.c) && Intrinsics.areEqual((Object) this.o, (Object) xk2.o) && Intrinsics.areEqual((Object) this.v, (Object) xk2.v) && Intrinsics.areEqual((Object) this.w, (Object) xk2.w) && Intrinsics.areEqual((Object) this.x, (Object) xk2.x) && Intrinsics.areEqual((Object) this.y, (Object) xk2.y) && this.z == xk2.z && this.X == xk2.X && this.Y == xk2.Y && this.Z == xk2.Z && this.v0 == xk2.v0 && this.w0 == xk2.w0 && this.x0 == xk2.x0 && this.y0 == xk2.y0 && this.z0 == xk2.z0 && Intrinsics.areEqual((Object) this.A0, (Object) xk2.A0) && this.B0 == xk2.B0 && Intrinsics.areEqual((Object) this.C0, (Object) xk2.C0);
    }

    public final boolean f(lz7 lz7) {
        return this.E0 == lz7.getItemId();
    }

    public final long getId() {
        return this.a;
    }

    public final long getItemId() {
        return this.E0;
    }

    public final long h() {
        return this.Y;
    }

    public final int hashCode() {
        int hashCode = Long.hashCode(this.a) * 31;
        int i = 0;
        Uri uri = this.b;
        int e = wj6.e(this.c, (hashCode + (uri == null ? 0 : uri.hashCode())) * 31, 31);
        CharSequence charSequence = this.o;
        int e2 = wj6.e(this.v, (e + (charSequence == null ? 0 : charSequence.hashCode())) * 31, 31);
        CharSequence charSequence2 = this.w;
        int hashCode2 = (e2 + (charSequence2 == null ? 0 : charSequence2.hashCode())) * 31;
        CharSequence charSequence3 = this.x;
        int hashCode3 = (hashCode2 + (charSequence3 == null ? 0 : charSequence3.hashCode())) * 31;
        String str = this.y;
        int i2 = wzf.i(g63.e(g63.e(g63.e(rae.h(this.v0, (this.Z.hashCode() + wzf.i(g63.e(g63.e((hashCode3 + (str == null ? 0 : str.hashCode())) * 31, 31, this.z), 31, this.X), 31, this.Y)) * 31, 31), 31, this.w0), 31, this.x0), 31, this.y0), 31, this.z0);
        Long l = this.A0;
        if (l != null) {
            i = l.hashCode();
        }
        return this.C0.hashCode() + wzf.i((i2 + i) * 31, 31, this.B0);
    }

    public final int i() {
        return this.D0;
    }

    public final Object l(Object obj) {
        lz7 lz7 = (lz7) obj;
        j3h j3h = null;
        xk2 xk2 = lz7 instanceof xk2 ? (xk2) lz7 : null;
        if (xk2 != null) {
            j3h = new j3h(7);
            boolean z2 = false;
            boolean z3 = this.z != xk2.z;
            BitSet bitSet = (BitSet) j3h.a;
            bitSet.set(0, z3);
            bitSet.set(1, !Intrinsics.areEqual((Object) this.b, (Object) xk2.b) || this.B0 != xk2.B0 || !Intrinsics.areEqual((Object) this.C0, (Object) xk2.C0));
            bitSet.set(2, !Intrinsics.areEqual((Object) this.c, (Object) xk2.c));
            bitSet.set(3, !Intrinsics.areEqual((Object) this.o, (Object) xk2.o));
            bitSet.set(4, !Intrinsics.areEqual((Object) this.v, (Object) xk2.v) || !Intrinsics.areEqual((Object) this.w, (Object) xk2.w));
            bitSet.set(5, !Intrinsics.areEqual((Object) this.x, (Object) xk2.x));
            bitSet.set(6, !Intrinsics.areEqual((Object) this.y, (Object) xk2.y));
            bitSet.set(7, this.Y != xk2.Y);
            bitSet.set(8, this.Z != xk2.Z);
            bitSet.set(9, this.v0 != xk2.v0);
            bitSet.set(10, this.w0 != xk2.w0);
            bitSet.set(11, this.x0 != xk2.x0);
            bitSet.set(12, this.y0 != xk2.y0);
            if (this.z0 != xk2.z0) {
                z2 = true;
            }
            bitSet.set(13, z2);
        }
        return j3h;
    }

    public final String toString() {
        String y2 = vzg.y(this.c);
        StringBuilder sb = new StringBuilder("ChatModel(chatId=");
        sb.append(this.a);
        sb.append(", title=");
        sb.append(y2);
        sb.append(", time=");
        return wj6.m(sb, this.Y, ")");
    }
}
