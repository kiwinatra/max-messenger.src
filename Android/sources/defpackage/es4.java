package defpackage;

/* renamed from: es4  reason: default package */
public final class es4 implements hs4 {
    public final boolean a;

    public es4(boolean z) {
        this.a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof es4) && this.a == ((es4) obj).a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.a);
    }

    public final String toString() {
        return tr1.m(new StringBuilder("FileDownloadInterrupted(shouldRetry="), this.a, ")");
    }
}
