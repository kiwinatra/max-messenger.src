package defpackage;

/* renamed from: pac  reason: default package */
public final class pac {
    public final Class a;
    public final Class b;

    public pac(Class cls, Class cls2) {
        this.a = cls;
        this.b = cls2;
    }

    public static pac a(Class cls) {
        return new pac(oac.class, cls);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || pac.class != obj.getClass()) {
            return false;
        }
        pac pac = (pac) obj;
        if (!this.b.equals(pac.b)) {
            return false;
        }
        return this.a.equals(pac.a);
    }

    public final int hashCode() {
        return this.a.hashCode() + (this.b.hashCode() * 31);
    }

    public final String toString() {
        Class<oac> cls = oac.class;
        Class cls2 = this.b;
        Class<oac> cls3 = this.a;
        if (cls3 == cls) {
            return cls2.getName();
        }
        return "@" + cls3.getName() + " " + cls2.getName();
    }
}
