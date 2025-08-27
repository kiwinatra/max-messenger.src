package defpackage;

/* renamed from: wr4  reason: default package */
public final class wr4 implements yr4 {
    public final int a;

    public wr4(int i) {
        this.a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof wr4) && this.a == ((wr4) obj).a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.a);
    }

    public final String toString() {
        return wj6.l(new StringBuilder("DownloadFailed(textFailRes="), this.a, ")");
    }
}
