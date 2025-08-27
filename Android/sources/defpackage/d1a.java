package defpackage;

import java.util.Collections;

/* renamed from: d1a  reason: default package */
public final /* synthetic */ class d1a implements ti8 {
    public final /* synthetic */ g1a a;

    public /* synthetic */ d1a(g1a g1a) {
        this.a = g1a;
    }

    public final void a(pi8 pi8) {
        g1a g1a = this.a;
        pf8 pf8 = g1a.Y;
        if (pf8 == null || !pf8.h) {
            pi8.a(Collections.emptyList());
            return;
        }
        j18 j18 = (j18) g1a.x;
        j18.getClass();
        sh8 sh8 = new sh8(0, new i18(j18, pf8.c, 0));
        uc9 uc9 = uc9.h;
        uc9 uc92 = (uc9) sh8.c(uc9);
        if (uc92 == uc9) {
            pi8.a(Collections.emptyList());
        } else {
            pi8.a(Collections.singletonList(uc92));
        }
    }
}
