package defpackage;

import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import java.util.concurrent.ExecutorService;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.math.MathKt;

/* renamed from: k2e  reason: default package */
public final class k2e extends pae {
    public final nob v;

    public k2e(nob nob, ExecutorService executorService) {
        super(executorService);
        this.v = nob;
    }

    /* renamed from: J */
    public final void s(kbe kbe, int i) {
        if (kbe instanceof j2e) {
            j2e j2e = (j2e) kbe;
            lz7 lz7 = (lz7) E(i);
            if (lz7 instanceof and) {
                j2e.M(lz7);
                r1e r1e = (r1e) j2e.a;
                boolean z = ((and) lz7).x instanceof d1e;
                nob nob = this.v;
                if (z) {
                    r1e.setOnSwitchCheckedListener((Function2<? super Long, ? super Boolean, Unit>) new r6(19, nob));
                } else {
                    r1e.setOnSwitchCheckedListener((n1e) null);
                }
                ct.G(r1e, 300, new kqc(10, (Object) nob, (Object) (and) lz7));
                return;
            }
            return;
        }
        kbe.M((lz7) E(i));
    }

    public final pzc u(ViewGroup viewGroup, int i) {
        if (i == qza.D) {
            return new pzc(new r1e(viewGroup.getContext(), (AttributeSet) null));
        }
        if (i == qza.C) {
            TextView textView = new TextView(viewGroup.getContext());
            float f = (float) 16;
            textView.setPadding(MathKt.roundToInt(vo4.c().getDisplayMetrics().density * f), textView.getPaddingTop(), MathKt.roundToInt(f * vo4.c().getDisplayMetrics().density), textView.getPaddingBottom());
            puf.t.b(textView, uy4.b);
            b0h.H(textView, new ra(3, (Continuation) null, 22));
            return new b61(textView, 9);
        }
        String name = k2e.class.getName();
        a67 a67 = z68.b;
        if (a67 != null && a67.c()) {
            a67.d(w78.w, name, wj6.h(i, "unknown item viewType: "), (Throwable) null);
        }
        return new b61(new View(viewGroup.getContext()), 10);
    }
}
