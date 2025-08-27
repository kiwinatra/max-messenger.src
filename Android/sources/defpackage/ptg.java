package defpackage;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: ptg  reason: default package */
public final class ptg implements u9d {
    public final /* synthetic */ hz0 a;

    public ptg(hz0 hz0) {
        this.a = hz0;
    }

    public final void b(t9d t9d) {
        hz0 hz0 = this.a;
        hz0.getClass();
        if (t9d instanceof xie) {
            hz0.H1 = ((xie) t9d).a;
            return;
        }
        boolean z = t9d instanceof u20;
        ef1 ef1 = hz0.n1;
        if (z) {
            ef1.q((ArrayList) ((u20) t9d).a);
        } else if (t9d instanceof mge) {
            ef1.o(((mge) t9d).a);
        } else if (t9d instanceof x77) {
            ((ConcurrentHashMap) hz0.B1.b).putAll((HashMap) ((x77) t9d).a);
        } else if (t9d instanceof a8g) {
            z3a z3a = (z3a) hz0.T1.b;
            z3a.getClass();
            ((v7g) z3a.b).a(new e4(6, (Object) ((a8g) t9d).a));
        } else if (t9d instanceof c7a) {
            ig0 ig0 = hz0.X.A;
            ef1.getClass();
            ArrayList arrayList = new ArrayList();
            Map map = ((c7a) t9d).a;
            for (ue1 ue1 : map.keySet()) {
                ye1 j = ef1.j(ue1);
                Float f = (Float) map.get(ue1);
                if (!(j == null || f == null)) {
                    float floatValue = f.floatValue();
                    ig0.getClass();
                    if (floatValue > 0.6f) {
                        j.i = a7a.a;
                    } else if (floatValue > 0.3f) {
                        j.i = a7a.b;
                    } else {
                        j.i = a7a.c;
                    }
                    boolean z2 = floatValue != j.h;
                    j.h = floatValue;
                    if (z2) {
                        arrayList.add(j);
                    }
                }
            }
            ef1.b.e.onCallParticipantNetworkStatusChanged(arrayList);
        } else if (t9d instanceof xeg) {
            hz0.k(b51.S0, ((xeg) t9d).a);
        }
    }
}
