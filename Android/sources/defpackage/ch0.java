package defpackage;

/* renamed from: ch0  reason: default package */
public final class ch0 implements dh0 {
    public final boolean a;

    public ch0(boolean z) {
        this.a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ch0) && this.a == ((ch0) obj).a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.a);
    }

    public final String toString() {
        return tr1.m(new StringBuilder("NotificationsPermissionChange(isGranted="), this.a, ")");
    }
}
