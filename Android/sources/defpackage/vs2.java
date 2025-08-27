package defpackage;

import android.view.ViewParent;
import kotlin.Lazy;
import kotlin.jvm.functions.Function0;

/* renamed from: vs2  reason: default package */
public final class vs2 implements Function0 {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object o;

    public vs2(ohd ohd, xhd xhd, rhd rhd) {
        this.b = ohd;
        this.c = xhd;
        this.o = rhd;
    }

    public final Object invoke() {
        switch (this.a) {
            case 0:
                return new zi5((Lazy) this.b, ((q4) this.o).h(fu2.class), (Lazy) this.c);
            default:
                ohd ohd = (ohd) this.b;
                ViewParent parent = ohd.getParent();
                xhd xhd = (xhd) this.c;
                if (parent != null) {
                    xhd.removeView(ohd);
                }
                rhd rhd = rhd.a;
                rhd rhd2 = (rhd) this.o;
                if (rhd2 == rhd) {
                    xhd.addView(ohd, xhd.getChildCount());
                } else {
                    xhd.addView(ohd, 0);
                }
                xhd.a(rhd2, xhd.x, xhd.y, new ep1(ohd, xhd, rhd2, 14));
                return Boolean.TRUE;
        }
    }

    public vs2(Lazy lazy, q4 q4Var, Lazy lazy2) {
        this.b = lazy;
        this.o = q4Var;
        this.c = lazy2;
    }
}
