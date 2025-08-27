package defpackage;

import java.util.Collections;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* renamed from: cy2  reason: default package */
public final /* synthetic */ class cy2 implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ long b;
    public final /* synthetic */ Object c;

    public /* synthetic */ cy2(Object obj, long j, int i) {
        this.a = i;
        this.c = obj;
        this.b = j;
    }

    /* JADX INFO: finally extract failed */
    public final Object invoke() {
        switch (this.a) {
            case 0:
                r62 n = ((my2) this.c).n();
                long j = this.b;
                a32 K = n.K(j);
                if (K != null && (K.E() || K.S())) {
                    return K;
                }
                return n.b(l72.a, Collections.singletonList(Long.valueOf(j)), (String) null, (String) null);
            default:
                long j2 = this.b;
                f6d f6d = (f6d) this.c;
                hs2 c2 = f6d.c();
                i6d i6d = c2.a;
                i6d.c();
                try {
                    hs2.c(c2, j2);
                    i6d.r();
                    i6d.l();
                    ((aj9) f6d.d.getValue()).e(j2);
                    ddd ddd = (ddd) f6d.c.getValue();
                    i6d i6d2 = ddd.a;
                    i6d2.b();
                    t5d t5d = ddd.c;
                    gf6 E = t5d.E();
                    E.k(1, j2);
                    try {
                        i6d2.c();
                        E.n();
                        i6d2.r();
                        i6d2.l();
                        t5d.S(E);
                        return Unit.INSTANCE;
                    } catch (Throwable th) {
                        t5d.S(E);
                        throw th;
                    }
                } catch (Throwable th2) {
                    i6d.l();
                    throw th2;
                }
        }
    }
}
