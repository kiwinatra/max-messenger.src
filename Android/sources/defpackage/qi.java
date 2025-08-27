package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* renamed from: qi  reason: default package */
public final class qi {
    public final String a;
    public final k15 b;
    public final int c;
    public final int d;

    public qi(String str, k15 k15, int i, int i2) {
        this.a = str;
        this.b = k15;
        this.c = i;
        this.d = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qi)) {
            return false;
        }
        qi qiVar = (qi) obj;
        return Intrinsics.areEqual((Object) this.a, (Object) qiVar.a) && Intrinsics.areEqual((Object) this.b, (Object) qiVar.b) && this.c == qiVar.c && this.d == qiVar.d;
    }

    public final int hashCode() {
        int hashCode = this.b.hashCode();
        return Integer.hashCode(this.d) + rae.h(this.c, (hashCode + (this.a.hashCode() * 31)) * 31, 31);
    }

    public final String toString() {
        return "AnimojiData(emoji=" + this.a + ", animations=" + this.b + ", from=" + this.c + ", to=" + this.d + ")";
    }
}
