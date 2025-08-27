package defpackage;

import java.text.SimpleDateFormat;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Lazy;

/* renamed from: esb  reason: default package */
public final class esb {
    public final sv0 a;
    public final Lazy b;
    public final ConcurrentHashMap c = new ConcurrentHashMap();

    public esb(sv0 sv0, Lazy lazy) {
        this.a = sv0;
        this.b = lazy;
    }

    public final void a() {
        ConcurrentHashMap concurrentHashMap = this.c;
        for (Map.Entry value : concurrentHashMap.entrySet()) {
            gsb gsb = (gsb) value.getValue();
            gsb.g = null;
            gsb.h = null;
            gsb.i = null;
            gsb.j = null;
            gsb.k = null;
            gsb.l = null;
            gsb.m = null;
            gsb.n = null;
            gsb.o = false;
            gsb.p = false;
            gsb.q = false;
        }
        concurrentHashMap.clear();
    }

    public final void b(a32 a32, ha9 ha9) {
        gsb a2 = ((hsb) this.b.getValue()).a((a32) null, ha9);
        this.c.put(Long.valueOf(ha9.b), a2);
        a2.i(a32);
    }

    public final gsb c(ha9 ha9) {
        return (gsb) this.c.computeIfAbsent(Long.valueOf(ha9.b), new yi(14, new wk(28, this, ha9)));
    }

    public final void d() {
        for (Map.Entry value : this.c.entrySet()) {
            gsb gsb = (gsb) value.getValue();
            gsb.g = null;
            gsb.h = null;
            gsb.i = null;
            gsb.j = null;
            gsb.k = null;
            gsb.l = null;
            gsb.m = null;
            gsb.n = null;
            gsb.o = false;
            gsb.p = false;
            gsb.q = false;
            a32 a32 = gsb.f;
            if (a32 != null) {
                gsb.i(a32);
            }
        }
    }

    public final void e(ha9 ha9) {
        String format;
        gsb c2 = c(ha9);
        c2.e();
        if (c2.m == null) {
            yva yva = c2.a;
            long j = c2.d.o;
            Locale u = yva.c.u();
            synchronized (j4b.n) {
                if (j4b.m == null) {
                    j4b.m = new SimpleDateFormat("LLLL yyyy", u);
                }
                format = j4b.m.format(Long.valueOf(j));
            }
            c2.m = format;
        }
    }
}
