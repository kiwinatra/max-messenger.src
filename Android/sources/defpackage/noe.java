package defpackage;

/* renamed from: noe  reason: default package */
public final class noe extends ibf {
    public coe c;

    public noe(pf9 pf9) {
        super(pf9);
    }

    public final void c(pf9 pf9, String str) {
        if (str.equals("sticker")) {
            this.c = coe.a(pf9);
        } else {
            pf9.A();
        }
    }

    public final String toString() {
        return wj6.k("{sticker = ", this.c.toString(), "}");
    }
}
