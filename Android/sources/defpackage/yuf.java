package defpackage;

/* renamed from: yuf  reason: default package */
public final class yuf extends avf {
    public final c2f b;
    public final long c;

    public yuf(c2f c2f) {
        this.b = c2f;
        this.c = ((long) c2f.ordinal()) - ((long) 100);
    }

    public final long a() {
        return this.c;
    }

    public final int b() {
        return 969;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof yuf) && this.b == ((yuf) obj).b;
    }

    public final int hashCode() {
        return this.b.hashCode();
    }

    public final String toString() {
        return "NavigationUiItem(mentionState=" + this.b + ")";
    }
}
