package defpackage;

/* renamed from: h1d  reason: default package */
public final class h1d extends ibf {
    public fo3 c;

    public h1d(pf9 pf9) {
        super(pf9);
    }

    public final void c(pf9 pf9, String str) {
        if (str.equals("profile")) {
            this.c = fo3.e(pf9);
        } else {
            pf9.A();
        }
    }

    public final String toString() {
        fo3 fo3 = this.c;
        return "{contactInfo=" + fo3 + "}";
    }
}
