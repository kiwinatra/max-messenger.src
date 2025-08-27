package defpackage;

/* renamed from: wre  reason: default package */
public final class wre extends ibf {
    public String c;

    public wre(pf9 pf9) {
        super(pf9);
    }

    public final void c(pf9 pf9, String str) {
        if (str.equals("url")) {
            this.c = pf9.A0();
        } else {
            pf9.A();
        }
    }

    public final String toString() {
        return wj6.k("{url='", this.c, "'}");
    }
}
