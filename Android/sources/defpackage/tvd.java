package defpackage;

/* renamed from: tvd  reason: default package */
public final class tvd extends gud {
    public final long b;
    public final long c;
    public final long o;
    public final boolean v;

    public tvd(long j, long j2, boolean z, long j3) {
        this.b = j;
        this.c = j2;
        this.o = j3;
        this.v = z;
    }

    public final void z() {
        fa9 o2 = o();
        o2.getClass();
        long j = this.o;
        Long valueOf = Long.valueOf(j);
        boolean z = this.v;
        z68.c("fa9", "updateDelayedAttrs %d, %b", valueOf, Boolean.valueOf(z));
        z6d z6d = ((a74) o2.a).c;
        Long valueOf2 = Long.valueOf(j);
        Boolean valueOf3 = Boolean.valueOf(z);
        long j2 = this.c;
        z6d.q(j2, valueOf2, valueOf3);
        o2.f.c.remove(Long.valueOf(j2));
        o().z(o().r(j2), oa9.SENDING);
        nwf nwf = new nwf(((qjd) i()).n(), this.b, this.c, this.o, this.v);
        hud hud = this.a;
        hud hud2 = null;
        if (hud == null) {
            hud = null;
        }
        ocf.d((ocf) hud.j.getValue(), nwf, true, 1, 4);
        hud hud3 = this.a;
        if (hud3 != null) {
            hud2 = hud3;
        }
        ((sv0) hud2.c.getValue()).c(new twf(0, this.b, this.c));
    }
}
