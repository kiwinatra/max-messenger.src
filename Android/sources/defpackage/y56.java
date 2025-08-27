package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* renamed from: y56  reason: default package */
public final class y56 implements lz7 {
    public final long a;
    public final CharSequence b;
    public final int c;
    public final CharSequence o;
    public final String v;
    public final x56 w;
    public final int x;
    public final long y;

    public y56(long j, CharSequence charSequence, int i, CharSequence charSequence2, String str, x56 x56, int i2) {
        this.a = j;
        this.b = charSequence;
        this.c = i;
        this.o = charSequence2;
        this.v = str;
        this.w = x56;
        this.x = i2;
        this.y = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y56)) {
            return false;
        }
        y56 y56 = (y56) obj;
        return this.a == y56.a && Intrinsics.areEqual((Object) this.b, (Object) y56.b) && this.c == y56.c && Intrinsics.areEqual((Object) this.o, (Object) y56.o) && Intrinsics.areEqual((Object) this.v, (Object) y56.v) && Intrinsics.areEqual((Object) this.w, (Object) y56.w) && this.x == y56.x;
    }

    public final long getItemId() {
        return this.y;
    }

    public final int hashCode() {
        int h = rae.h(this.c, wj6.e(this.b, Long.hashCode(this.a) * 31, 31), 31);
        int i = 0;
        CharSequence charSequence = this.o;
        int hashCode = (h + (charSequence == null ? 0 : charSequence.hashCode())) * 31;
        String str = this.v;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        x56 x56 = this.w;
        if (x56 != null) {
            i = x56.hashCode();
        }
        return Integer.hashCode(this.x) + ((hashCode2 + i) * 31);
    }

    public final int i() {
        return this.x;
    }

    public final String toString() {
        return "FolderWidgetItem(id=" + this.a + ", name=" + this.b + ", backgroundColor=" + this.c + ", description=" + this.o + ", iconUrl=" + this.v + ", clickAction=" + this.w + ", viewType=" + this.x + ")";
    }
}
