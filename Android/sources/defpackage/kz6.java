package defpackage;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: kz6  reason: default package */
public final class kz6 implements mz6 {
    public final long a;
    public final long b;
    public final List c;

    public kz6(long j, long j2, ArrayList arrayList) {
        this.a = j;
        this.b = j2;
        this.c = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kz6)) {
            return false;
        }
        kz6 kz6 = (kz6) obj;
        return this.a == kz6.a && this.b == kz6.b && Intrinsics.areEqual((Object) this.c, (Object) kz6.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + wzf.i(Long.hashCode(this.a) * 31, 31, this.b);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("OneToOne(opponentId=");
        sb.append(this.a);
        sb.append(", chatId=");
        sb.append(this.b);
        sb.append(", messagesIds=");
        return tr1.l(sb, this.c, ")");
    }
}
