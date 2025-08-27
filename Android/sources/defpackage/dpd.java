package defpackage;

/* renamed from: dpd  reason: default package */
public final class dpd implements gpd {
    public final int a;

    public dpd(int i) {
        this.a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof dpd) && this.a == ((dpd) obj).a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.a);
    }

    public final String toString() {
        return wj6.l(new StringBuilder("AlbumHeightChanged(height="), this.a, ")");
    }
}
