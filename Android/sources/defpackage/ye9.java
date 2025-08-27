package defpackage;

/* renamed from: ye9  reason: default package */
public final class ye9 {
    public final long a;
    public final long b;
    public final boolean c;

    public ye9(a32 a32, a89 a89, boolean z) {
        long j = a32 != null ? a32.a : -1;
        long j2 = a89.a.b;
        this.a = j;
        this.b = j2;
        this.c = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ye9)) {
            return false;
        }
        ye9 ye9 = (ye9) obj;
        return this.a == ye9.a && this.b == ye9.b && this.c == ye9.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + wzf.i(Long.hashCode(this.a) * 31, 31, this.b);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Key(chatId=");
        sb.append(this.a);
        sb.append(", messageId=");
        sb.append(this.b);
        sb.append(", isChild=");
        return tr1.m(sb, this.c, ")");
    }
}
