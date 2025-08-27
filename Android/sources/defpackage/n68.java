package defpackage;

/* renamed from: n68  reason: default package */
public final class n68 extends ibf {
    public b89 c;

    public n68(pf9 pf9) {
        super(pf9);
    }

    public final void c(pf9 pf9, String str) {
        str.getClass();
        if (!str.equals("message")) {
            pf9.A();
        } else {
            this.c = z79.a(pf9);
        }
    }

    public final String toString() {
        b89 b89 = this.c;
        return "{message=" + b89 + "}";
    }
}
