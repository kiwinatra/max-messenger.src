package defpackage;

/* renamed from: wt4  reason: default package */
public final class wt4 extends ibf {
    public long c;

    public wt4(pf9 pf9) {
        super(pf9);
    }

    public final void c(pf9 pf9, String str) {
        if (str.equals("time")) {
            this.c = ryg.d0(pf9, 0);
        } else {
            pf9.A();
        }
    }

    public final String toString() {
        return wj6.j(this.c, "Response{time=", "}");
    }
}
