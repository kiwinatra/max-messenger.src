package defpackage;

import java.util.concurrent.ExecutorService;

/* renamed from: se2  reason: default package */
public final class se2 implements vz6 {
    public final dv X = new dv();
    public final String a;
    public final zz6 b;
    public final ea5 c;
    public final lfd o;
    public final kc3 v = new Object();
    public final m95 w;
    public cv x;
    public final dv y = new dv();
    public final dv z = new dv();

    /* JADX WARNING: type inference failed for: r0v0, types: [java.lang.Object, kc3] */
    public se2(zz6 zz6, ba baVar, lfd lfd, m95 m95, String str) {
        this.b = zz6;
        zz6.j = this;
        a32 o2 = ((gh2) baVar.c).o();
        String str2 = "chat(" + (o2 != null ? Long.valueOf(o2.a) : null) + ")-media-loader";
        jbf jbf = (jbf) baVar.b;
        jbf.getClass();
        ExecutorService f = ((aua) ((kbf) jbf).a.getValue()).f(5, str2);
        wce wce = xfd.a;
        this.c = new ea5(f, true);
        this.o = lfd;
        this.w = m95;
        this.a = str;
    }

    public final void s() {
        this.o.c(new xu(this, 1));
    }
}
