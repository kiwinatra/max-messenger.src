package defpackage;

/* renamed from: zfb  reason: default package */
public final class zfb implements agb {
    public final long a;

    public zfb(long j) {
        this.a = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof zfb) && this.a == ((zfb) obj).a;
    }

    public final int hashCode() {
        return Long.hashCode(this.a);
    }

    public final String toString() {
        return wj6.m(new StringBuilder("OpenChat(chatId="), this.a, ")");
    }
}
