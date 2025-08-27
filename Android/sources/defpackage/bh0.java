package defpackage;

/* renamed from: bh0  reason: default package */
public final class bh0 implements dh0 {
    public final boolean a;

    public bh0(boolean z) {
        this.a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof bh0) && this.a == ((bh0) obj).a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.a);
    }

    public final String toString() {
        return tr1.m(new StringBuilder("ContactsPermissionChange(isGranted="), this.a, ")");
    }
}
