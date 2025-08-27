package defpackage;

/* renamed from: be2  reason: default package */
public final class be2 implements fe2 {
    public final long a;

    public be2(long j) {
        this.a = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof be2) && this.a == ((be2) obj).a;
    }

    public final int hashCode() {
        return Long.hashCode(this.a);
    }

    public final String toString() {
        return wj6.m(new StringBuilder("DownloadError(messageId="), this.a, ")");
    }
}
