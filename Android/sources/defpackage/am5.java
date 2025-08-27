package defpackage;

/* renamed from: am5  reason: default package */
public final class am5 extends ibf {
    public String c;

    public am5(pf9 pf9) {
        super(pf9);
    }

    public final void c(pf9 pf9, String str) {
        str.getClass();
        if (!str.equals("url")) {
            pf9.A();
        } else {
            this.c = ryg.g0(pf9);
        }
    }

    public final String toString() {
        return wj6.k("{url='", this.c, "'}");
    }
}
