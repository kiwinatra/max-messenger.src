package defpackage;

import androidx.work.impl.WorkDatabase;
import java.util.List;
import java.util.Set;

/* renamed from: kqg  reason: default package */
public final /* synthetic */ class kqg implements Runnable {
    public final /* synthetic */ WorkDatabase a;
    public final /* synthetic */ xpg b;
    public final /* synthetic */ xpg c;
    public final /* synthetic */ List o;
    public final /* synthetic */ String v;
    public final /* synthetic */ Set w;
    public final /* synthetic */ boolean x;

    public /* synthetic */ kqg(WorkDatabase workDatabase, xpg xpg, xpg xpg2, List list, String str, Set set, boolean z) {
        this.a = workDatabase;
        this.b = xpg;
        this.c = xpg2;
        this.o = list;
        this.v = str;
        this.w = set;
        this.x = z;
    }

    /* JADX INFO: finally extract failed */
    public final void run() {
        WorkDatabase workDatabase = this.a;
        ypg y = workDatabase.y();
        aqg z = workDatabase.z();
        xpg xpg = this.c;
        xpg b2 = xpg.b(this.b, (String) null, xpg.b, (String) null, (t64) null, xpg.k, xpg.n, xpg.t + 1, 515069);
        i6d i6d = (i6d) y.a;
        i6d.b();
        i6d.c();
        try {
            ((we4) y.c).a0(b2);
            i6d.r();
            i6d.l();
            i6d i6d2 = (i6d) z.a;
            i6d2.b();
            ppg ppg = (ppg) z.c;
            gf6 E = ppg.E();
            String str = this.v;
            if (str == null) {
                E.X(1);
            } else {
                E.h(1, str);
            }
            i6d2.c();
            try {
                E.n();
                i6d2.r();
                i6d2.l();
                ppg.S(E);
                z.q(str, this.w);
                if (!this.x) {
                    y.o(-1, str);
                    workDatabase.x().g(str);
                }
            } catch (Throwable th) {
                i6d2.l();
                ppg.S(E);
                throw th;
            }
        } catch (Throwable th2) {
            i6d.l();
            throw th2;
        }
    }
}
