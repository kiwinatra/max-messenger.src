package defpackage;

/* renamed from: zh  reason: default package */
public final class zh extends ei {
    public final int a;

    public zh(int i) {
        this.a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof zh) && this.a == ((zh) obj).a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.a);
    }

    public final String toString() {
        return wj6.l(new StringBuilder("Color(value="), this.a, ")");
    }
}
