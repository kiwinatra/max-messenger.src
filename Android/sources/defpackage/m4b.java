package defpackage;

import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: m4b  reason: default package */
public final class m4b extends v5a {
    public final long b;
    public final String c;
    public final String d;

    public m4b(long j, String str, String str2) {
        super(Unit.INSTANCE);
        this.b = j;
        this.c = str;
        this.d = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m4b)) {
            return false;
        }
        m4b m4b = (m4b) obj;
        return this.b == m4b.b && Intrinsics.areEqual((Object) this.c, (Object) m4b.c) && Intrinsics.areEqual((Object) this.d, (Object) m4b.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + g63.d(Long.hashCode(this.b) * 31, 31, this.c);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("OpenPhoneBook(contactId=");
        sb.append(this.b);
        sb.append(", fullName=");
        sb.append(this.c);
        sb.append(", phone=");
        return wj6.n(sb, this.d, ")");
    }
}
