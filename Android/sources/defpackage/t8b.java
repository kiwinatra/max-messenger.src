package defpackage;

/* renamed from: t8b  reason: default package */
public final class t8b extends u8b {
    public final int a;

    public t8b(int i) {
        this.a = i;
        t8b.class.hashCode();
        Integer.hashCode(i);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof t8b) && this.a == ((t8b) obj).a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.a);
    }

    public final String toString() {
        return wj6.l(new StringBuilder("Loading(index="), this.a, ")");
    }
}
