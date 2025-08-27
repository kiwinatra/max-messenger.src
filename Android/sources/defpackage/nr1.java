package defpackage;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: nr1  reason: default package */
public final /* synthetic */ class nr1 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ xr1 b;
    public final /* synthetic */ List c;

    public /* synthetic */ nr1(xr1 xr1, ArrayList arrayList, int i) {
        this.a = i;
        this.b = xr1;
        this.c = arrayList;
    }

    public final void run() {
        aqg aqg;
        switch (this.a) {
            case 0:
                xr1 xr1 = this.b;
                List<ea0> list = this.c;
                xr1.getClass();
                ArrayList arrayList = new ArrayList();
                boolean z = false;
                boolean z2 = false;
                for (ea0 ea0 : list) {
                    if (xr1.a.I(ea0.a)) {
                        ((LinkedHashMap) xr1.a.b).remove(ea0.a);
                        arrayList.add(ea0.a);
                        if (ea0.b == bub.class) {
                            z2 = true;
                        }
                    }
                }
                if (!arrayList.isEmpty()) {
                    TextUtils.join(", ", arrayList);
                    xr1.toString();
                    if (z2) {
                        xr1.x.h.e = null;
                    }
                    xr1.p();
                    if (xr1.a.G().isEmpty()) {
                        xr1.x.l.c = false;
                    } else {
                        xr1.K();
                    }
                    if (xr1.a.F().isEmpty()) {
                        xr1.x.q();
                        xr1.C();
                        xr1.x.y(false);
                        xr1.Z = xr1.y();
                        xr1.toString();
                        switch (tr1.y(xr1.Q0)) {
                            case 3:
                                if (xr1.X == null) {
                                    z = true;
                                }
                                bs0.r((String) null, z);
                                xr1.E(3);
                                return;
                            case 5:
                            case 6:
                            case 7:
                                if (xr1.y.a() || ((aqg = (aqg) xr1.P0.b) != null && !((AtomicBoolean) aqg.b).get())) {
                                    z = true;
                                }
                                xr1.P0.i();
                                xr1.E(5);
                                if (z) {
                                    bs0.r((String) null, xr1.v0.isEmpty());
                                    xr1.r();
                                    return;
                                }
                                return;
                            case 8:
                            case 9:
                                xr1.E(5);
                                xr1.q();
                                return;
                            default:
                                xr1.toString();
                                return;
                        }
                    } else {
                        xr1.J();
                        xr1.C();
                        if (xr1.Q0 == 9) {
                            xr1.A();
                            return;
                        }
                        return;
                    }
                } else {
                    return;
                }
            default:
                List list2 = this.c;
                xr1 xr12 = this.b;
                lr1 lr1 = xr12.x;
                try {
                    xr12.G((ArrayList) list2);
                    return;
                } finally {
                    lr1.q();
                }
        }
    }
}
