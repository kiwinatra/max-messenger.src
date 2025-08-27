package defpackage;

/* renamed from: a60  reason: default package */
public final class a60 {
    public static final a60 d = new Object().a();
    public final boolean a;
    public final boolean b;
    public final boolean c;

    public a60(z50 z50) {
        this.a = z50.a;
        this.b = z50.b;
        this.c = z50.c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || a60.class != obj.getClass()) {
            return false;
        }
        a60 a60 = (a60) obj;
        return this.a == a60.a && this.b == a60.b && this.c == a60.c;
    }

    public final int hashCode() {
        return ((this.a ? 1 : 0) << true) + ((this.b ? 1 : 0) << true) + (this.c ? 1 : 0);
    }
}
