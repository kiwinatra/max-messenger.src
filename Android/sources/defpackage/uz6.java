package defpackage;

import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: uz6  reason: default package */
public final class uz6 implements lz7 {
    public final hz6 X;
    public final mz6 Y;
    public final long Z;
    public final long a;
    public final long b;
    public final CharSequence c;
    public final String o;
    public final boolean v;
    public final String w;
    public final String x;
    public final boolean y;
    public final CharSequence z;

    public uz6(long j, long j2, CharSequence charSequence, String str, boolean z2, String str2, String str3, boolean z3, CharSequence charSequence2, hz6 hz6, mz6 mz6) {
        this.a = j;
        this.b = j2;
        this.c = charSequence;
        this.o = str;
        this.v = z2;
        this.w = str2;
        this.x = str3;
        this.y = z3;
        this.z = charSequence2;
        this.X = hz6;
        this.Y = mz6;
        this.Z = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof uz6)) {
            return false;
        }
        uz6 uz6 = (uz6) obj;
        return this.a == uz6.a && this.b == uz6.b && Intrinsics.areEqual((Object) this.c, (Object) uz6.c) && Intrinsics.areEqual((Object) this.o, (Object) uz6.o) && this.v == uz6.v && Intrinsics.areEqual((Object) this.w, (Object) uz6.w) && Intrinsics.areEqual((Object) this.x, (Object) uz6.x) && this.y == uz6.y && Intrinsics.areEqual((Object) this.z, (Object) uz6.z) && this.X == uz6.X && Intrinsics.areEqual((Object) this.Y, (Object) uz6.Y);
    }

    public final boolean f(lz7 lz7) {
        return this.Z == lz7.getItemId();
    }

    public final long getItemId() {
        return this.Z;
    }

    public final int hashCode() {
        int e = wj6.e(this.c, wzf.i(Long.hashCode(this.a) * 31, 31, this.b), 31);
        String str = this.o;
        return this.Y.hashCode() + ((this.X.hashCode() + wj6.e(this.z, g63.e(g63.d(g63.d(g63.e((e + (str == null ? 0 : str.hashCode())) * 31, 31, this.v), 31, this.w), 31, this.x), 31, this.y), 31)) * 31);
    }

    public final int i() {
        return 1;
    }

    public final Object l(Object obj) {
        uz6 uz6 = (uz6) ((lz7) obj);
        List createListBuilder = CollectionsKt.createListBuilder();
        String str = this.w;
        String str2 = uz6.w;
        if (!Intrinsics.areEqual((Object) str, (Object) str2)) {
            createListBuilder.add(new rz6(str2));
        }
        if (!Intrinsics.areEqual((Object) this.o, (Object) uz6.o) || this.b != uz6.b || !Intrinsics.areEqual((Object) this.c, (Object) uz6.c) || this.v != uz6.v) {
            createListBuilder.add(new nz6(uz6.b, uz6.c, uz6.o, uz6.v));
        }
        String str3 = this.x;
        String str4 = uz6.x;
        if (!Intrinsics.areEqual((Object) str3, (Object) str4)) {
            createListBuilder.add(new sz6(str4));
        }
        boolean z2 = this.y;
        boolean z3 = uz6.y;
        if (z2 != z3) {
            createListBuilder.add(new qz6(z3));
        }
        CharSequence charSequence = this.z;
        CharSequence charSequence2 = uz6.z;
        if (!Intrinsics.areEqual((Object) charSequence, (Object) charSequence2)) {
            createListBuilder.add(new pz6(charSequence2));
        }
        hz6 hz6 = this.X;
        hz6 hz62 = uz6.X;
        if (hz6 != hz62) {
            createListBuilder.add(new oz6(hz62));
        }
        return CollectionsKt.build(createListBuilder);
    }

    public final String toString() {
        return "HistoryItemState(id=" + this.a + ", avatarColorId=" + this.b + ", abbreviation=" + this.c + ", avatar=" + this.o + ", isCallLink=" + this.v + ", callName=" + this.w + ", time=" + this.x + ", isMissing=" + this.y + ", description=" + this.z + ", callMediaType=" + this.X + ", callType=" + this.Y + ")";
    }
}
