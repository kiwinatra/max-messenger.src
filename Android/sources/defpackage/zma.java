package defpackage;

import java.util.ArrayList;

/* renamed from: zma  reason: default package */
public final class zma {
    public static zma b;
    public boolean a = false;

    public zma() {
        new ArrayList();
        ((qra) ym.e()).F().getClass();
        eaf.b();
        ((qra) ym.e()).J();
        a33 a33 = ym.v.c().a;
    }

    @oye
    public void onEvent(wa2 wa2) {
        if (wa2.a == 0) {
            z68.c("zma", "onEvent: ChatInfoEvent" + wa2, new Object[0]);
            throw null;
        }
    }

    @oye
    public void onEvent(hj0 hj0) {
        if (hj0.a == 0) {
            z68.c("zma", "onEvent: BaseErrorEvent" + hj0, new Object[0]);
            if (!m58.A(hj0.b.b)) {
                throw null;
            } else if (!this.a) {
                this.a = true;
            }
        }
    }

    @oye
    public void onEvent(ab2 ab2) {
        this.a = false;
        this.a = true;
    }
}
