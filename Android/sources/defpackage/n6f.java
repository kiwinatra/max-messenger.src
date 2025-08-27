package defpackage;

/* renamed from: n6f  reason: default package */
public final class n6f extends ij0 {
    public final boolean b;

    public n6f(boolean z) {
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof n6f) && this.b == ((n6f) obj).b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b);
    }

    public final String toString() {
        return tr1.m(new StringBuilder("SyncMutedChatsEvent(isSuccessful="), this.b, ")");
    }
}
