package defpackage;

/* renamed from: bu  reason: default package */
public final class bu extends qm implements lcf {
    public final int o = 2;
    public final String v = null;
    public final long w;
    public final int x;
    public final String y;

    public bu(long j, String str, long j2) {
        super(j);
        this.w = j2;
        this.x = 50;
        this.y = str;
    }

    public final void e(ibf ibf) {
        fu fuVar = (fu) ibf;
        rm rmVar = this.c;
        if (rmVar == null) {
            rmVar = null;
        }
        rmVar.b().c(new st(this.a, fuVar));
    }

    public final fbf g() {
        return new yt(this.o, this.v, this.w, this.x, this.y);
    }

    public final void h(qaf qaf) {
        rm rmVar = this.c;
        if (rmVar == null) {
            rmVar = null;
        }
        rmVar.b().c(new hj0(this.a, qaf));
    }
}
