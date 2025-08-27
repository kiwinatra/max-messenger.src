package defpackage;

/* renamed from: e73  reason: default package */
public final class e73 implements f73 {
    public final long a;

    public e73(long j) {
        this.a = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof e73) && this.a == ((e73) obj).a;
    }

    public final int hashCode() {
        return Long.hashCode(this.a);
    }

    public final String toString() {
        return wj6.m(new StringBuilder("Remove(chatId="), this.a, ")");
    }
}
