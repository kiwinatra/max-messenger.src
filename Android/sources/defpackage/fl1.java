package defpackage;

/* renamed from: fl1  reason: default package */
public final class fl1 extends ld9 {
    public final long r;
    public final boolean s;

    public fl1(long j, boolean z) {
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
        if (!(obj instanceof fl1)) {
            return false;
        }
        fl1 fl1 = (fl1) obj;
        return this.r == fl1.r && this.s == fl1.s;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.s) + (Long.hashCode(this.r) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("User(userId=");
        sb.append(this.r);
        sb.append(", isVideo=");
        return tr1.m(sb, this.s, ")");
    }
}
