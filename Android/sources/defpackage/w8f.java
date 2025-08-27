package defpackage;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: w8f  reason: default package */
public final class w8f {
    public final String a;
    public final String b;
    public final String c;
    public final List d;
    public final List e;

    public w8f(String str, String str2, String str3, List list, List list2) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = list;
        this.e = list2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w8f)) {
            return false;
        }
        w8f w8f = (w8f) obj;
        if (Intrinsics.areEqual((Object) this.a, (Object) w8f.a) && Intrinsics.areEqual((Object) this.b, (Object) w8f.b) && Intrinsics.areEqual((Object) this.c, (Object) w8f.c) && Intrinsics.areEqual((Object) this.d, (Object) w8f.d)) {
            return Intrinsics.areEqual((Object) this.e, (Object) w8f.e);
        }
        return false;
    }

    public final int hashCode() {
        return this.e.hashCode() + rae.i(this.d, g63.d(g63.d(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31);
    }

    public final String toString() {
        return "ForeignKey{referenceTable='" + this.a + "', onDelete='" + this.b + " +', onUpdate='" + this.c + "', columnNames=" + this.d + ", referenceColumnNames=" + this.e + '}';
    }
}
