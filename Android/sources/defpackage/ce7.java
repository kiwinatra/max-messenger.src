package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* renamed from: ce7  reason: default package */
public final class ce7 {
    public final ue1 a;
    public final String b;
    public final boolean c;

    public ce7(ue1 ue1, String str, boolean z) {
        this.a = ue1;
        this.b = str;
        this.c = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ce7)) {
            return false;
        }
        ce7 ce7 = (ce7) obj;
        return Intrinsics.areEqual((Object) this.a, (Object) ce7.a) && Intrinsics.areEqual((Object) this.b, (Object) ce7.b) && this.c == ce7.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + g63.d(this.a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("InboundMessage(senderId=");
        sb.append(this.a);
        sb.append(", text=");
        sb.append(this.b);
        sb.append(", isDirect=");
        return tr1.m(sb, this.c, ")");
    }
}
