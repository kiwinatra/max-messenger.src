package defpackage;

/* renamed from: lcb  reason: default package */
public final class lcb {
    public final boolean a;

    public lcb(boolean z) {
        this.a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof lcb) && this.a == ((lcb) obj).a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.a);
    }

    public final String toString() {
        return tr1.m(new StringBuilder("ContactsPermissionChange(isGranted="), this.a, ")");
    }
}
