package defpackage;

/* renamed from: d73  reason: default package */
public final class d73 implements f73 {
    public final long a;

    public d73(long j) {
        this.a = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof d73) && this.a == ((d73) obj).a;
    }

    public final int hashCode() {
        return Long.hashCode(this.a);
    }

    public final String toString() {
        return wj6.m(new StringBuilder("Add(chatId="), this.a, ")");
    }
}
