package defpackage;

/* renamed from: tg9  reason: default package */
public final class tg9 {
    public final long a;
    public final boolean b;

    public tg9(long j, boolean z) {
        this.a = j;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tg9)) {
            return false;
        }
        tg9 tg9 = (tg9) obj;
        return this.a == tg9.a && this.b == tg9.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (Long.hashCode(this.a) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("InputEditData(messageId=");
        sb.append(this.a);
        sb.append(", shouldInsertOriginalText=");
        return tr1.m(sb, this.b, ")");
    }
}
