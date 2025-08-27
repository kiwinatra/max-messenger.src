package defpackage;

import java.util.concurrent.ExecutorService;

/* renamed from: y00  reason: default package */
public final class y00 {
    public final jbf a;
    public final m95 b;
    public final ln5 c;
    public final wi6 d;
    public final ea5 e;
    public final kc3 f;

    /* JADX WARNING: type inference failed for: r7v6, types: [java.lang.Object, kc3] */
    public y00(ln5 ln5, jbf jbf, m95 m95) {
        this.a = jbf;
        this.b = m95;
        this.c = ln5;
        wi6 wi6 = new wi6(200, 0);
        this.d = wi6;
        jbf.getClass();
        kbf kbf = (kbf) jbf;
        ExecutorService f2 = ((aua) kbf.a.getValue()).f(5, "preview-disk-cache");
        wce wce = xfd.a;
        this.e = new ea5(f2, true);
        ? obj = new Object();
        this.f = obj;
        oi8 f3 = new ai8(new sh8(0, new x00(this)), new x00(this), 1).h(kbf.a()).f(kbf.c());
        oh8 oh8 = new oh8(new d9d(8, wi6), new x00(this), m58.e);
        f3.a(oh8);
        obj.a(oh8);
    }
}
