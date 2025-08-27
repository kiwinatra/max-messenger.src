package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* renamed from: ix4  reason: default package */
public final class ix4 {
    public final String a;
    public final String b;
    public final int c;

    public ix4(String str, String str2, int i) {
        this.a = str;
        this.b = str2;
        this.c = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ix4) {
            ix4 ix4 = (ix4) obj;
            if (Intrinsics.areEqual((Object) this.a, (Object) ix4.a) && Intrinsics.areEqual((Object) this.b, (Object) ix4.b) && this.c == ix4.c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return g63.d(this.a.hashCode() * 31, 31, this.b) + this.c;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DropRecord(event='");
        sb.append(this.a);
        sb.append("', reason='");
        sb.append(this.b);
        sb.append("', count=");
        return tr1.k(sb, this.c, ')');
    }
}
