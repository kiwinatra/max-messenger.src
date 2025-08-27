package defpackage;

/* renamed from: li7  reason: default package */
public final class li7 {
    public final long a;

    public /* synthetic */ li7(long j) {
        this.a = j;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof li7)) {
            return false;
        }
        return this.a == ((li7) obj).a;
    }

    public final int hashCode() {
        return Long.hashCode(this.a);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("(");
        long j = this.a;
        sb.append((int) (j >> 32));
        sb.append(", ");
        return tr1.k(sb, (int) (j & 4294967295L), ')');
    }
}
