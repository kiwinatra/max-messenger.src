package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* renamed from: dmb  reason: default package */
public final class dmb implements emb {
    public final long a;
    public final ngf b;
    public final boolean c;

    public dmb(long j, mgf mgf, boolean z) {
        this.a = j;
        this.b = mgf;
        this.c = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dmb)) {
            return false;
        }
        dmb dmb = (dmb) obj;
        return this.a == dmb.a && Intrinsics.areEqual((Object) this.b, (Object) dmb.b) && this.c == dmb.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + i2a.g(Long.hashCode(this.a) * 31, 31, this.b);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("State(messageId=");
        sb.append(this.a);
        sb.append(", text=");
        sb.append(this.b);
        sb.append(", canClose=");
        return tr1.m(sb, this.c, ")");
    }
}
