package defpackage;

import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: mre  reason: default package */
public final class mre {
    public final cre a;
    public final Set b = Collections.newSetFromMap(new ConcurrentHashMap());
    public final ai5 c;
    public final ir3 d;
    public final lfd e;
    public final lfd f;
    public final obf g;
    public final AtomicReference h = new AtomicReference(kre.v);
    public final AtomicReference i = new AtomicReference(lre.v);
    public ao1 j;
    public final or7 k;

    public mre(moe moe, vqe vqe, ai5 ai5, ir3 ir3, lfd lfd, lfd lfd2, lfd lfd3, rl rlVar, gcf gcf, obf obf) {
        this.c = ai5;
        this.d = ir3;
        this.e = lfd;
        lfd lfd4 = lfd3;
        this.f = lfd4;
        this.g = obf;
        moe moe2 = moe;
        cre cre = new cre(new nob((Object) moe), vqe, lfd2, lfd4, rlVar, gcf);
        this.a = cre;
        cre.c.add(this);
        pka x = ai5.c().x(lfd2);
        or7 or7 = new or7(new nqd(12, this), new dre(4), m58.e);
        x.a(or7);
        this.k = or7;
    }

    public final boolean a() {
        return ((bre) this.a.a.get()).a();
    }

    public final void b() {
        cre cre = this.a;
        cre.getClass();
        z68.c("cre", "loadInitial: ", new Object[0]);
        jbd.c(cre.j);
        synchronized (cre) {
            cre.b = null;
        }
        cre.a.set(cre.k);
        fce j2 = new wbe(lbe.h((bre) cre.a.get()), new zqe(cre, 3), 0).n(cre.f).j(cre.g);
        ao1 ao1 = new ao1(3, new zqe(cre, 0), new zqe(cre, 1));
        j2.l(ao1);
        cre.j = ao1;
    }

    public final void c() {
        cre cre = this.a;
        if (!((bre) cre.a.get()).a()) {
            z68.f("cre", "loadNext: skipped, cant load next", (Throwable) null);
        } else if (!jbd.d(cre.j)) {
            z68.f("cre", "loadNext: skipped, already loading", (Throwable) null);
        } else {
            z68.c("cre", "loadNext: ", new Object[0]);
            fce j2 = new wbe(new wbe(lbe.h((bre) cre.a.get()), new zqe(cre, 3), 0), new zqe(cre, 2), 0).n(cre.f).j(cre.g);
            ao1 ao1 = new ao1(3, new zqe(cre, 0), new zqe(cre, 1));
            j2.l(ao1);
            cre.j = ao1;
        }
    }

    public final void d(String str) {
        cre cre = this.a;
        synchronized (cre) {
            try {
                if (cvg.c(cre.b, str)) {
                    z68.c("cre", "search: skipped, already requested", new Object[0]);
                    return;
                }
                cre.b = str;
                z68.c("cre", "search: %s", str);
                jbd.c(cre.j);
                cre.a.set(cre.k);
                fce j2 = cre.c(0, str, Collections.emptyList()).n(cre.f).j(cre.g);
                ao1 ao1 = new ao1(3, new zqe(cre, 0), new zqe(cre, 1));
                j2.l(ao1);
                cre.j = ao1;
            } catch (Throwable th) {
                while (true) {
                    throw th;
                }
            }
        }
    }

    public final void e() {
        kre kre = (kre) this.h.get();
        fce j2 = new yia(jha.n((List) kre.b), new ire(this, kre), 3).B().n(this.e).j(this.f);
        ao1 ao1 = new ao1(3, new ire(this, kre), new dre(5));
        j2.l(ao1);
        this.j = ao1;
    }
}
