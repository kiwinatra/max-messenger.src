package defpackage;

import java.util.Map;
import java.util.Set;
import kotlin.io.ConstantsKt;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: g8f  reason: default package */
public final class g8f {
    public final String a;
    public final long b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;
    public final String g;
    public final String h;
    public final String i;
    public final String j;
    public final boolean k;
    public final boolean l;
    public final Map m;
    public final Set n;

    public g8f(String str, long j2, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, boolean z, boolean z2, Map map, Set set) {
        this.a = str;
        this.b = j2;
        this.c = str2;
        this.d = str3;
        this.e = str4;
        this.f = str5;
        this.g = str6;
        this.h = str7;
        this.i = str8;
        this.j = str9;
        this.k = z;
        this.l = z2;
        this.m = map;
        this.n = set;
    }

    public static g8f a(g8f g8f, boolean z, Map map, int i2) {
        g8f g8f2 = g8f;
        int i3 = i2;
        String str = g8f2.a;
        long j2 = g8f2.b;
        String str2 = g8f2.c;
        String str3 = g8f2.d;
        String str4 = g8f2.e;
        String str5 = g8f2.f;
        String str6 = g8f2.g;
        String str7 = g8f2.h;
        String str8 = g8f2.i;
        String str9 = g8f2.j;
        boolean z2 = (i3 & 1024) != 0 ? g8f2.k : z;
        boolean z3 = g8f2.l;
        Map map2 = (i3 & ConstantsKt.DEFAULT_BLOCK_SIZE) != 0 ? g8f2.m : map;
        Set set = g8f2.n;
        g8f.getClass();
        return new g8f(str, j2, str2, str3, str4, str5, str6, str7, str8, str9, z2, z3, map2, set);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g8f)) {
            return false;
        }
        g8f g8f = (g8f) obj;
        return Intrinsics.areEqual((Object) this.a, (Object) g8f.a) && this.b == g8f.b && Intrinsics.areEqual((Object) this.c, (Object) g8f.c) && Intrinsics.areEqual((Object) this.d, (Object) g8f.d) && Intrinsics.areEqual((Object) this.e, (Object) g8f.e) && Intrinsics.areEqual((Object) this.f, (Object) g8f.f) && Intrinsics.areEqual((Object) this.g, (Object) g8f.g) && Intrinsics.areEqual((Object) this.h, (Object) g8f.h) && Intrinsics.areEqual((Object) this.i, (Object) g8f.i) && Intrinsics.areEqual((Object) this.j, (Object) g8f.j) && this.k == g8f.k && this.l == g8f.l && Intrinsics.areEqual((Object) this.m, (Object) g8f.m) && Intrinsics.areEqual((Object) this.n, (Object) g8f.n);
    }

    public final int hashCode() {
        int d2 = g63.d(wzf.i(this.a.hashCode() * 31, 31, this.b), 31, this.c);
        int i2 = 0;
        String str = this.d;
        int hashCode = (d2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.e;
        if (str2 != null) {
            i2 = str2.hashCode();
        }
        int d3 = g63.d(g63.d(g63.d(g63.d(g63.d((hashCode + i2) * 31, 31, this.f), 31, this.g), 31, this.h), 31, this.i), 31, this.j);
        boolean z = true;
        boolean z2 = this.k;
        if (z2) {
            z2 = true;
        }
        int i3 = (d3 + (z2 ? 1 : 0)) * 31;
        boolean z3 = this.l;
        if (!z3) {
            z = z3;
        }
        return this.n.hashCode() + ((this.m.hashCode() + ((i3 + (z ? 1 : 0)) * 31)) * 31);
    }

    public final String toString() {
        return "SystemState(versionName=" + this.a + ", versionCode=" + this.b + ", packageName=" + this.c + ", environment=" + this.d + ", buildUuid=" + this.e + ", sessionUuid=" + this.f + ", device=" + this.g + ", deviceId=" + this.h + ", vendor=" + this.i + ", osVersion=" + this.j + ", isInBackground=" + this.k + ", isRooted=" + this.l + ", properties=" + this.m + ", hostedLibrariesInfo=" + this.n + ')';
    }
}
