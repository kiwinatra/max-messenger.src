package defpackage;

/* renamed from: qpa  reason: default package */
public final class qpa implements rpa {
    public final int a;

    public qpa(int i) {
        this.a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof qpa) && this.a == ((qpa) obj).a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.a);
    }

    public final String toString() {
        return wj6.l(new StringBuilder("Resource(iconRes="), this.a, ")");
    }
}
