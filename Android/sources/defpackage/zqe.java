package defpackage;

import kotlin.jvm.internal.IntCompanionObject;

/* renamed from: zqe  reason: default package */
public final /* synthetic */ class zqe implements qk3, zi6 {
    public final /* synthetic */ int a;
    public final /* synthetic */ cre b;

    public /* synthetic */ zqe(cre cre, int i) {
        this.a = i;
        this.b = cre;
    }

    public void accept(Object obj) {
        int i = this.a;
        cre cre = this.b;
        switch (i) {
            case 0:
                cre.a(cre, (bre) obj);
                return;
            default:
                cre.b(cre, (Throwable) obj);
                return;
        }
    }

    public Object apply(Object obj) {
        switch (this.a) {
            case 2:
                bre bre = (bre) obj;
                cre cre = this.b;
                cre.getClass();
                return bre.a() ? cre.c(bre.b, bre.c, bre.a) : lbe.h(bre);
            case 3:
                bre bre2 = (bre) obj;
                are are = cre.k;
                cre cre2 = this.b;
                if (bre2 == are) {
                    return new wbe(new nia(((moe) cre2.d.a).m.m(new dre(7), IntCompanionObject.MAX_VALUE)), new zqe(cre2, 4), 0);
                }
                cre2.getClass();
                return lbe.h(bre2);
            default:
                fre fre = (fre) obj;
                cre cre3 = this.b;
                cre3.getClass();
                return cre3.e.c(fre.o).i(new nqd(10, fre));
        }
    }
}
