package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* renamed from: bp0  reason: default package */
public final class bp0 implements lz7 {
    public final long a;
    public final String b;
    public final CharSequence c;
    public final CharSequence o;

    public bp0(long j, String str, String str2, CharSequence charSequence) {
        this.a = j;
        this.b = str;
        this.c = str2;
        this.o = charSequence;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bp0)) {
            return false;
        }
        bp0 bp0 = (bp0) obj;
        return this.a == bp0.a && Intrinsics.areEqual((Object) this.b, (Object) bp0.b) && Intrinsics.areEqual((Object) this.c, (Object) bp0.c) && Intrinsics.areEqual((Object) this.o, (Object) bp0.o);
    }

    public final long getItemId() {
        return this.a;
    }

    public final int hashCode() {
        int hashCode = Long.hashCode(this.a) * 31;
        String str = this.b;
        return this.o.hashCode() + wj6.e(this.c, (hashCode + (str == null ? 0 : str.hashCode())) * 31, 31);
    }

    public final int i() {
        return 0;
    }

    public final String toString() {
        return "BlackListItem(itemId=" + this.a + ", avatar=" + this.b + ", name=" + this.c + ", abbreviation=" + this.o + ")";
    }
}
