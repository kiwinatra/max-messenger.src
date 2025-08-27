package defpackage;

/* renamed from: tbf  reason: default package */
public final /* synthetic */ class tbf implements Runnable {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ jk3 b;
    public final /* synthetic */ lcf c;
    public final /* synthetic */ ibf o;
    public final /* synthetic */ qm v;

    public /* synthetic */ tbf(jk3 jk3, qm qmVar, lcf lcf, ibf ibf) {
        this.b = jk3;
        this.v = qmVar;
        this.c = lcf;
        this.o = ibf;
    }

    public final void run() {
        switch (this.a) {
            case 0:
                jk3 jk3 = this.b;
                jk3.getClass();
                qm qmVar = this.v;
                fbf r = qmVar.r();
                if (r != null) {
                    ((wbf) jk3.c).a.remove(r.getClass().getName());
                }
                lcf lcf = this.c;
                lcf.a().a(new tbf(jk3, lcf, this.o, qmVar));
                return;
            default:
                lcf lcf2 = this.c;
                ibf ibf = this.o;
                qm qmVar2 = this.v;
                jk3 jk32 = this.b;
                jk32.getClass();
                try {
                    lcf2.e(ibf);
                    wbf.a((wbf) jk32.c, qmVar2);
                    return;
                } catch (Exception e) {
                    z68.h(wbf.q, e, "failure to run task %s", qmVar2);
                    lcf2.h(new qaf("app.exception", e.getMessage(), (String) null));
                    return;
                }
        }
    }

    public /* synthetic */ tbf(jk3 jk3, lcf lcf, ibf ibf, qm qmVar) {
        this.b = jk3;
        this.c = lcf;
        this.o = ibf;
        this.v = qmVar;
    }
}
