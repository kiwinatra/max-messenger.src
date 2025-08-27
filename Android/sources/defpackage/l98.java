package defpackage;

/* renamed from: l98  reason: default package */
public final class l98 extends qm implements lcf {
    public final String o;

    public l98(long j, String str) {
        super(j);
        this.o = str;
    }

    public final void e(ibf ibf) {
        rm rmVar = this.c;
        if (rmVar == null) {
            rmVar = null;
        }
        rmVar.b().c(new js3(this.a, 4));
    }

    public final fbf g() {
        fbf fbf = new fbf(x3b.LOGOUT);
        String str = this.o;
        if (!(str == null || str.length() == 0)) {
            fbf.t("pushToken", str);
        }
        return fbf;
    }

    public final void h(qaf qaf) {
        rm rmVar = this.c;
        if (rmVar == null) {
            rmVar = null;
        }
        rmVar.b().c(new hj0(this.a, qaf));
    }
}
