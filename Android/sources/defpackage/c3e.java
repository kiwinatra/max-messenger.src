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

/* renamed from: c3e  reason: default package */
public final class c3e extends pae {
    public final syc v;

    public c3e(syc syc, ExecutorService executorService) {
        super(executorService);
        this.v = syc;
    }

    /* renamed from: J */
    public final void s(kbe kbe, int i) {
        if (kbe instanceof b3e) {
            b3e b3e = (b3e) kbe;
            lz7 lz7 = (lz7) E(i);
            if (lz7 instanceof tmd) {
                b3e.M(lz7);
                boolean z = ((tmd) lz7).z;
                View view = b3e.a;
                syc syc = this.v;
                if (z) {
                    ((r1e) view).setEnabled(true);
                    ct.G(view, 300, new kqc(11, (Object) syc, (Object) (tmd) lz7));
                } else {
                    ((r1e) view).setEnabled(false);
                    view.setOnClickListener((View.OnClickListener) null);
                }
                ((r1e) view).setOnSwitchCheckedListener((Function2<? super Long, ? super Boolean, Unit>) new r6(20, syc));
                return;
            }
            return;
        }
        kbe.M((lz7) E(i));
    }

    public final pzc u(ViewGroup viewGroup, int i) {
        if (i == tza.t) {
            return new pzc(new r1e(viewGroup.getContext(), (AttributeSet) null));
        }
        if (i == tza.s) {
            TextView textView = new TextView(viewGroup.getContext());
            float f = (float) 16;
            textView.setPadding(MathKt.roundToInt(vo4.c().getDisplayMetrics().density * f), textView.getPaddingTop(), MathKt.roundToInt(f * vo4.c().getDisplayMetrics().density), textView.getPaddingBottom());
            puf.t.b(textView, uy4.b);
            b0h.H(textView, new ra(3, (Continuation) null, 23));
            return new b61(textView, 11);
        }
        String name = c3e.class.getName();
        a67 a67 = z68.b;
        if (a67 != null && a67.c()) {
            a67.d(w78.w, name, wj6.h(i, "unknown item viewType: "), (Throwable) null);
        }
        return new b61(new View(viewGroup.getContext()), 12);
    }
}
