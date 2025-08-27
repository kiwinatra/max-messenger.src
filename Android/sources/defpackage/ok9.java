package defpackage;

/* renamed from: ok9  reason: default package */
public final class ok9 implements qk9 {
    public final long a;

    public ok9(long j) {
        this.a = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ok9) && this.a == ((ok9) obj).a;
    }

    public final int hashCode() {
        return Long.hashCode(this.a);
    }

    public final String toString() {
        return wj6.m(new StringBuilder("SetEditedMessage(messageId="), this.a, ")");
    }
}
