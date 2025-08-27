package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* renamed from: rdb  reason: default package */
public final class rdb {
    public final String a;
    public final long b;

    public rdb(String str, long j) {
        this.a = str;
        this.b = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rdb)) {
            return false;
        }
        rdb rdb = (rdb) obj;
        return Intrinsics.areEqual((Object) this.a, (Object) rdb.a) && this.b == rdb.b;
    }

    public final int hashCode() {
        return Long.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PhoneAndServerPhone(phone=");
        sb.append(this.a);
        sb.append(", serverPhone=");
        return wj6.m(sb, this.b, ")");
    }
}
