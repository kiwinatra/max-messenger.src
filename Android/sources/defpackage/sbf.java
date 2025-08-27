package defpackage;

import java.util.concurrent.ConcurrentHashMap;

/* renamed from: sbf  reason: default package */
public final /* synthetic */ class sbf implements Runnable {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ jk3 b;
    public final /* synthetic */ qm c;
    public final /* synthetic */ qaf o;
    public final /* synthetic */ lcf v;

    public /* synthetic */ sbf(jk3 jk3, qm qmVar, qaf qaf, lcf lcf) {
        this.b = jk3;
        this.c = qmVar;
        this.o = qaf;
        this.v = lcf;
    }

    /* JADX WARNING: type inference failed for: r5v4, types: [java.lang.Object, vbf] */
    public final void run() {
        switch (this.a) {
            case 0:
                jk3 jk3 = this.b;
                jk3.getClass();
                lcf lcf = this.v;
                lcf.a().a(new sbf(jk3, this.c, this.o, lcf));
                return;
            default:
                jk3 jk32 = this.b;
                jk32.getClass();
                qm qmVar = this.c;
                fbf r = qmVar.r();
                qaf qaf = this.o;
                wbf wbf = (wbf) jk32.c;
                if (r != null) {
                    wbf.getClass();
                    if (gbf.e0.contains(qaf.b)) {
                        String name = r.getClass().getName();
                        ConcurrentHashMap concurrentHashMap = wbf.a;
                        vbf vbf = (vbf) concurrentHashMap.get(name);
                        vbf vbf2 = vbf;
                        if (vbf == null) {
                            ? obj = new Object();
                            obj.a = 0;
                            vbf2 = obj;
                        }
                        vbf2.a++;
                        vbf2.b = System.currentTimeMillis();
                        concurrentHashMap.put(name, vbf2);
                    }
                }
                this.v.h(qaf);
                wbf.f(qmVar, qaf);
                return;
        }
    }

    public /* synthetic */ sbf(jk3 jk3, lcf lcf, qm qmVar, qaf qaf) {
        this.b = jk3;
        this.v = lcf;
        this.c = qmVar;
        this.o = qaf;
    }
}
