package defpackage;

/* renamed from: r14  reason: default package */
public final class r14 {
    public static final r14 b = new r14(0);
    public final int a;

    public r14(int i) {
        this.a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof r14) && this.a == ((r14) obj).a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.a);
    }

    public final String toString() {
        return wj6.l(new StringBuilder("Counter(count="), this.a, ")");
    }
}
