package defpackage;

/* renamed from: mb0  reason: default package */
public final class mb0 extends s6a {
    public final r6a a;
    public final q6a b;

    public mb0(r6a r6a, q6a q6a) {
        this.a = r6a;
        this.b = q6a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof s6a)) {
            return false;
        }
        s6a s6a = (s6a) obj;
        r6a r6a = this.a;
        if (r6a != null ? r6a.equals(((mb0) s6a).a) : ((mb0) s6a).a == null) {
            q6a q6a = this.b;
            if (q6a == null) {
                if (((mb0) s6a).b == null) {
                    return true;
                }
            } else if (q6a.equals(((mb0) s6a).b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = 0;
        r6a r6a = this.a;
        int hashCode = ((r6a == null ? 0 : r6a.hashCode()) ^ 1000003) * 1000003;
        q6a q6a = this.b;
        if (q6a != null) {
            i = q6a.hashCode();
        }
        return hashCode ^ i;
    }

    public final String toString() {
        return "NetworkConnectionInfo{networkType=" + this.a + ", mobileSubtype=" + this.b + "}";
    }
}
