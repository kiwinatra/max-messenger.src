package defpackage;

/* renamed from: dl1  reason: default package */
public final class dl1 extends ld9 {
    public final long r;
    public final boolean s;

    public dl1(long j, boolean z) {
        this.r = j;
        this.s = z;
    }

    public final boolean J() {
        return this.s;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dl1)) {
            return false;
        }
        dl1 dl1 = (dl1) obj;
        return this.r == dl1.r && this.s == dl1.s;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.s) + (Long.hashCode(this.r) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Chat(chatId=");
        sb.append(this.r);
        sb.append(", isVideo=");
        return tr1.m(sb, this.s, ")");
    }
}
