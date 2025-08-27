package defpackage;

import kotlin.Pair;
import kotlin.collections.SetsKt;
import kotlin.reflect.KProperty;

/* renamed from: pfa  reason: default package */
public final class pfa implements zi6, qk3 {
    public final /* synthetic */ int a;
    public final /* synthetic */ qfa b;
    public final /* synthetic */ long c;

    public /* synthetic */ pfa(qfa qfa, long j, int i) {
        this.a = i;
        this.b = qfa;
        this.c = j;
    }

    public void accept(Object obj) {
        switch (this.a) {
            case 1:
                Pair pair = (Pair) obj;
                long longValue = ((Number) pair.component1()).longValue();
                if (((Boolean) pair.component2()).booleanValue()) {
                    qfa qfa = this.b;
                    qfa.getClass();
                    KProperty kProperty = qfa.y[5];
                    ((hga) qfa.w.get()).f(longValue, this.c);
                    return;
                }
                return;
            default:
                Pair pair2 = (Pair) obj;
                long longValue2 = ((Number) pair2.component1()).longValue();
                if (((Boolean) pair2.component2()).booleanValue()) {
                    qfa qfa2 = this.b;
                    a32 D = qfa2.c().D(longValue2);
                    if (D != null) {
                        m72 m72 = D.b;
                        int i = m72.m;
                        hs7 hs7 = qfa2.v;
                        if (i > 0) {
                            KProperty kProperty2 = qfa.y[4];
                            ((qwa) hs7.get()).d(SetsKt.setOf(Long.valueOf(longValue2)));
                        } else {
                            KProperty kProperty3 = qfa.y[4];
                            ((qwa) hs7.get()).a(m72.a);
                        }
                    }
                    KProperty kProperty4 = qfa.y[5];
                    ((hga) qfa2.w.get()).f(longValue2, this.c);
                    return;
                }
                return;
        }
    }

    public Object apply(Object obj) {
        switch (this.a) {
            case 0:
                a32 a32 = (a32) obj;
                qfa qfa = this.b;
                qfa.getClass();
                return new wbe(lbe.h(a32), new no5(this.c, qfa, a32), 0);
            default:
                a32 a322 = (a32) obj;
                qfa qfa2 = this.b;
                qfa2.getClass();
                return new wbe(lbe.h(a322), new no5(this.c, qfa2, a322), 0);
        }
    }
}
