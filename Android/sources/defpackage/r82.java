package defpackage;

import java.io.Serializable;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: r82  reason: default package */
public final class r82 implements Serializable {
    public final Map X;
    public final List Y;
    public final Set Z;
    public final String a;
    public final String b;
    public final String c;
    public final Set o;
    public final Set v;
    public final Set w;
    public final boolean x;
    public final List y;
    public final long z;

    public r82(String str, String str2, String str3, Set set, Set set2, Set set3, boolean z2, List list, long j, Map map, List list2, Set set4) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.o = set;
        this.v = set2;
        this.w = set3;
        this.x = z2;
        this.y = list;
        this.z = j;
        this.X = map;
        this.Y = list2;
        this.Z = set4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r82)) {
            return false;
        }
        r82 r82 = (r82) obj;
        return Intrinsics.areEqual((Object) this.a, (Object) r82.a) && Intrinsics.areEqual((Object) this.b, (Object) r82.b) && Intrinsics.areEqual((Object) this.c, (Object) r82.c) && Intrinsics.areEqual((Object) this.o, (Object) r82.o) && Intrinsics.areEqual((Object) this.v, (Object) r82.v) && Intrinsics.areEqual((Object) this.w, (Object) r82.w) && this.x == r82.x && Intrinsics.areEqual((Object) this.y, (Object) r82.y) && this.z == r82.z && Intrinsics.areEqual((Object) this.X, (Object) r82.X) && Intrinsics.areEqual((Object) this.Y, (Object) r82.Y) && Intrinsics.areEqual((Object) this.Z, (Object) r82.Z);
    }

    public final int hashCode() {
        int d = g63.d(this.a.hashCode() * 31, 31, this.b);
        String str = this.c;
        int hashCode = str == null ? 0 : str.hashCode();
        int hashCode2 = this.o.hashCode();
        return this.Z.hashCode() + rae.i(this.Y, (this.X.hashCode() + wzf.i(rae.i(this.y, g63.e((this.w.hashCode() + ((this.v.hashCode() + ((hashCode2 + ((d + hashCode) * 31)) * 31)) * 31)) * 31, 31, this.x), 31), 31, this.z)) * 31, 31);
    }

    public final String toString() {
        return "ChatFolder(id=" + this.a + ", title=" + this.b + ", emoji=" + this.c + ", include=" + this.o + ", favorites=" + this.v + ", filters=" + this.w + ", hideEmpty=" + this.x + ", elements=" + this.y + ", creatorId=" + this.z + ", filterSubjects=" + this.X + ", widgets=" + this.Y + ", options=" + this.Z + ")";
    }
}
