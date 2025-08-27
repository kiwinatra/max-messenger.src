package defpackage;

import java.util.Set;
import kotlin.collections.SetsKt;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: wj3  reason: default package */
public final class wj3 {
    public static final wj3 i = new wj3(1, false, false, false, false, -1, -1, SetsKt.emptySet());
    public final int a;
    public final boolean b;
    public final boolean c;
    public final boolean d;
    public final boolean e;
    public final long f;
    public final long g;
    public final Set h;

    public wj3(int i2, boolean z, boolean z2, boolean z3, boolean z4, long j, long j2, Set set) {
        this.a = i2;
        this.b = z;
        this.c = z2;
        this.d = z3;
        this.e = z4;
        this.f = j;
        this.g = j2;
        this.h = set;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (!Intrinsics.areEqual((Object) wj3.class, (Object) obj.getClass())) {
            return false;
        }
        wj3 wj3 = (wj3) obj;
        if (this.b == wj3.b && this.c == wj3.c && this.d == wj3.d && this.e == wj3.e && this.f == wj3.f && this.g == wj3.g && this.a == wj3.a) {
            return Intrinsics.areEqual((Object) this.h, (Object) wj3.h);
        }
        return false;
    }

    public final int hashCode() {
        long j = this.f;
        long j2 = this.g;
        return this.h.hashCode() + (((((((((((((tr1.y(this.a) * 31) + (this.b ? 1 : 0)) * 31) + (this.c ? 1 : 0)) * 31) + (this.d ? 1 : 0)) * 31) + (this.e ? 1 : 0)) * 31) + ((int) (j ^ (j >>> 32)))) * 31) + ((int) (j2 ^ (j2 >>> 32)))) * 31);
    }
}
