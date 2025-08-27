package defpackage;

/* renamed from: zc9  reason: default package */
public final class zc9 {
    public final long a;

    public zc9(long j) {
        this.a = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof zc9) && this.a == ((zc9) obj).a;
    }

    public final int hashCode() {
        return Long.hashCode(this.a);
    }

    public final String toString() {
        return wj6.m(new StringBuilder("ControlInfo(pinnedMessageId="), this.a, ")");
    }
}
