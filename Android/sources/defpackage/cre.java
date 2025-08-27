package defpackage;

import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: cre  reason: default package */
public final class cre {
    public static final are k = new bre(-1, (String) null, Collections.emptyList());
    public final AtomicReference a = new AtomicReference(k);
    public volatile String b = null;
    public final Set c = Collections.newSetFromMap(new ConcurrentHashMap());
    public final nob d;
    public final vqe e;
    public final lfd f;
    public final lfd g;
    public final rl h;
    public final gcf i;
    public ao1 j;

    public cre(nob nob, vqe vqe, lfd lfd, lfd lfd2, rl rlVar, gcf gcf) {
        this.d = nob;
        this.e = vqe;
        this.f = lfd;
        this.g = lfd2;
        this.h = rlVar;
        this.i = gcf;
    }

    public static void a(cre cre, bre bre) {
        cre.a.set(bre);
        for (mre mre : cre.c) {
            mre.h.set(new fbf(12, bre.a, bre.c));
            mre.e();
        }
    }

    public static void b(cre cre, Throwable th) {
        cre.getClass();
        z68.f("cre", "onError: failed", th);
        for (mre mre : cre.c) {
            mre.getClass();
        }
    }

    public final wbe c(long j2, String str, List list) {
        wbe i2 = ((jna) this.h).U(new yt(3, (String) null, j2, 50, str), this.f).i(new ch2(12, fu.class));
        gcf gcf = this.i;
        gcf.getClass();
        return new wbe(i2.k(new ecf(gcf, 3, 0)), new fkd(this, list, str, 2), 0);
    }
}
