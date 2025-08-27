package defpackage;

/* renamed from: br7  reason: default package */
public final class br7 {
    public final int a;

    public br7(int i) {
        this.a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof br7) && this.a == ((br7) obj).a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.a);
    }

    public final String toString() {
        return wj6.l(new StringBuilder("StateConfig(titleTextColor="), this.a, ")");
    }
}
