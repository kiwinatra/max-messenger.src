package defpackage;

import android.util.AttributeSet;
import android.view.ViewGroup;
import java.util.concurrent.ExecutorService;
import kotlin.jvm.functions.Function0;

/* renamed from: m0f  reason: default package */
public final class m0f extends pae {
    public final l0f v;

    public m0f(l0f l0f, ExecutorService executorService) {
        super(executorService);
        this.v = l0f;
    }

    /* renamed from: L */
    public final void s(p0f p0f, int i) {
        o0f o0f = (o0f) ((lz7) E(i));
        ol3 ol3 = (ol3) p0f.a;
        ol3.setId(xya.B);
        ol3.setName(o0f.b);
        ol3.setMessage(o0f.o);
        sze sze = o0f.x;
        sze.getClass();
        if (sze == sze.a || sze == sze.b) {
            ol3.Y(o0f.a, o0f.b, o0f.c);
        } else {
            ol3.E0.setVisibility(8);
            ol3.U();
        }
        boolean z = !o0f.w.isEmpty();
        l0f l0f = this.v;
        if (z) {
            ol3.b0(ol3, Integer.valueOf(wya.a), (zpa) null, new sz0((Object) l0f, (Object) ol3, (Object) o0f, 13), 6);
        } else {
            ol3.b0(ol3, (Integer) null, (zpa) null, (Function0) null, 6);
        }
        ct.G(ol3, 300, new kqc(19, (Object) l0f, (Object) o0f));
    }

    public final pzc u(ViewGroup viewGroup, int i) {
        return new pzc(new ol3(viewGroup.getContext(), (AttributeSet) null));
    }
}
