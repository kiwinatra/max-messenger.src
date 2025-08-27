package defpackage;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: qk6  reason: default package */
public final class qk6 extends vk6 {
    public final String a;
    public final List b;
    public final mk6 c;

    public qk6(String str, String str2, List list) {
        mk6 mk6 = new mk6(str2);
        this.a = str;
        this.b = list;
        this.c = mk6;
    }

    public final String[] a(pk6 pk6) {
        return new String[]{this.a};
    }

    public final String b() {
        return this.a;
    }

    public final h3 c() {
        return this.c;
    }

    public final List d() {
        return this.b;
    }

    public final String e(pk6 pk6) {
        String b2 = pk6.b();
        return pk6.a + " AND " + b2 + " = ?";
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qk6)) {
            return false;
        }
        qk6 qk6 = (qk6) obj;
        return Intrinsics.areEqual((Object) this.a, (Object) qk6.a) && Intrinsics.areEqual((Object) this.b, (Object) qk6.b) && Intrinsics.areEqual((Object) this.c, (Object) qk6.c);
    }

    public final int hashCode() {
        return this.c.a.hashCode() + rae.i(this.b, this.a.hashCode() * 31, 31);
    }

    public final String toString() {
        return "Real(id=" + this.a + ", queryParams=" + this.b + ", name=" + this.c + ")";
    }
}
