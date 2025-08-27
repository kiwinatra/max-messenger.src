package defpackage;

import java.util.Set;

/* renamed from: o58  reason: default package */
public final /* synthetic */ class o58 implements x6 {
    public final /* synthetic */ int a;
    public final /* synthetic */ q58 b;

    public /* synthetic */ o58(q58 q58, int i) {
        this.a = i;
        this.b = q58;
    }

    public final void run() {
        switch (this.a) {
            case 0:
                p58 p58 = this.b.J0;
                if (p58 != null) {
                    gg9 gg9 = (gg9) p58;
                    if (gg9.b1 != null) {
                        a89 a89 = gg9.U0.a;
                        return;
                    }
                    return;
                }
                return;
            default:
                q58 q58 = this.b;
                if (q58.J0 != null) {
                    xt6 xt6 = (xt6) ((qra) ym.e()).D();
                    if (!xt6.a() || xt6.d() < 12000000) {
                        gg9 gg92 = (gg9) q58.J0;
                        t3a t3a = gg92.b1;
                        if (t3a != null) {
                            a89 a892 = gg92.U0.a;
                            for (k0a k0a : (Set) ((l2a) t3a).a) {
                                k0a.b.d();
                            }
                            return;
                        }
                        return;
                    }
                    l20 l20 = q58.w;
                    if (l20 == null || !l20.n.a()) {
                        l20 l202 = q58.w;
                        if (l202 != null && l202.n.d()) {
                            gg9 gg93 = (gg9) q58.J0;
                            if (gg93.b1 != null) {
                                a89 a893 = gg93.U0.a;
                                return;
                            }
                            return;
                        }
                        return;
                    }
                    gg9 gg94 = (gg9) q58.J0;
                    if (gg94.b1 != null) {
                        a89 a894 = gg94.U0.a;
                        return;
                    }
                    return;
                }
                return;
        }
    }
}
