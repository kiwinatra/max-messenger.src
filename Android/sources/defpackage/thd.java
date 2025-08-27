package defpackage;

import java.util.EnumMap;
import kotlin.jvm.functions.Function0;

/* renamed from: thd  reason: default package */
public final class thd implements Function0 {
    public final /* synthetic */ xhd a;
    public final /* synthetic */ rhd b;
    public final /* synthetic */ boolean c = true;

    public thd(xhd xhd, rhd rhd) {
        this.a = xhd;
        this.b = rhd;
    }

    public final Object invoke() {
        xhd xhd = this.a;
        ohd d = xhd.d(this.b);
        if (this.c) {
            EnumMap enumMap = xhd.y;
            EnumMap enumMap2 = xhd.x;
            rhd rhd = this.b;
            xhd.a(rhd, enumMap, enumMap2, new whd(d, xhd, rhd, xhd, d));
        } else {
            d.setVisibility(8);
            xhd.removeView(d);
        }
        return Boolean.TRUE;
    }
}
