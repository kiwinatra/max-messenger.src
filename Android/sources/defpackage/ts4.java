package defpackage;

/* renamed from: ts4  reason: default package */
public final class ts4 implements vs4 {
    public final boolean a;

    public ts4(boolean z) {
        this.a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ts4) && this.a == ((ts4) obj).a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.a);
    }

    public final String toString() {
        return tr1.m(new StringBuilder("FileDownloadInterrupted(shouldRetry="), this.a, ")");
    }
}
