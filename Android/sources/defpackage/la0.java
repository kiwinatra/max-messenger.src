package defpackage;

/* renamed from: la0  reason: default package */
public final class la0 {
    public final String a;
    public final Class b;
    public final Object c;

    public la0(Class cls, Object obj, String str) {
        if (str != null) {
            this.a = str;
            if (cls != null) {
                this.b = cls;
                this.c = obj;
                return;
            }
            throw new NullPointerException("Null valueClass");
        }
        throw new NullPointerException("Null id");
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof la0)) {
            return false;
        }
        la0 la0 = (la0) obj;
        if (this.a.equals(la0.a) && this.b.equals(la0.b)) {
            Object obj2 = la0.c;
            Object obj3 = this.c;
            if (obj3 == null) {
                if (obj2 == null) {
                    return true;
                }
            } else if (obj3.equals(obj2)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = (((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003;
        Object obj = this.c;
        return (obj == null ? 0 : obj.hashCode()) ^ hashCode;
    }

    public final String toString() {
        return "Option{id=" + this.a + ", valueClass=" + this.b + ", token=" + this.c + "}";
    }
}
