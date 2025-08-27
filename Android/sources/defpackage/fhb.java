package defpackage;

import android.util.AttributeSet;
import android.view.ViewGroup;
import java.util.concurrent.ExecutorService;
import kotlin.math.MathKt;

/* renamed from: fhb  reason: default package */
public final class fhb extends pae {
    public final ehb v;
    public final int w;

    public fhb(ehb ehb, ExecutorService executorService, int i) {
        super(executorService);
        this.v = ehb;
        this.w = i;
    }

    /* renamed from: L */
    public final void s(ihb ihb, int i) {
        hhb hhb = (hhb) ((lz7) E(i));
        zqa zqa = new zqa(2, (Object) this.v);
        ihb.M(hhb);
        ct.G(ihb.a, 300, new h24(25, (Object) zqa, (Object) hhb));
    }

    public final int l(int i) {
        int i2 = jhb.a;
        return jhb.a;
    }

    public final pzc u(ViewGroup viewGroup, int i) {
        ol3 ol3 = new ol3(viewGroup.getContext(), (AttributeSet) null);
        pzc pzc = new pzc(ol3);
        int i2 = this.w;
        if (i2 > 0) {
            ol3.setPaddingRelative(MathKt.roundToInt(((float) i2) * vo4.c().getDisplayMetrics().density), ol3.getPaddingTop(), ol3.getPaddingEnd(), ol3.getPaddingBottom());
        }
        return pzc;
    }
}
