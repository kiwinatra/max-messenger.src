package defpackage;

/* renamed from: f4f  reason: default package */
public final class f4f extends ij0 {
    public final long b;

    public f4f(long j) {
        this.b = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof f4f) && this.b == ((f4f) obj).b;
    }

    public final int hashCode() {
        return Long.hashCode(this.b);
    }

    public final String toString() {
        return wj6.m(new StringBuilder("SuspendBotEvent(chatId="), this.b, ")");
    }
}
