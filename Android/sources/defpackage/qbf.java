package defpackage;

import com.my.tracker.obfuscated.e0;
import java.util.Map;

/* renamed from: qbf  reason: default package */
public final /* synthetic */ class qbf implements Runnable {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ int b;
    public final /* synthetic */ long c;
    public final /* synthetic */ Object o;
    public final /* synthetic */ Object v;

    public /* synthetic */ qbf(int i, long j, e0 e0Var, Map map) {
        this.o = e0Var;
        this.v = map;
        this.b = i;
        this.c = j;
    }

    public final void run() {
        switch (this.a) {
            case 0:
                wbf wbf = (wbf) this.o;
                wbf.getClass();
                z68.a(wbf.q, "persistable task execution started, force connection");
                ((ltb) ((jtb) wbf.f.getValue())).a.w(true);
                ((eef) wbf.e.getValue()).g((hdb) ((qm) this.v), this.c, this.b);
                rvd.A((jqg) wbf.k.getValue());
                ((bef) wbf.l.getValue()).a();
                return;
            default:
                ((e0) this.o).a((Map) this.v, this.b, this.c);
                return;
        }
    }

    public /* synthetic */ qbf(wbf wbf, qm qmVar, long j, int i) {
        this.o = wbf;
        this.v = qmVar;
        this.c = j;
        this.b = i;
    }
}
