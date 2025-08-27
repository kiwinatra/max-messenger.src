package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import kotlin.coroutines.Continuation;
import kotlin.math.MathKt;

/* renamed from: jse  reason: default package */
public final class jse extends pae {
    public final Executor v;
    public final zq7 w;
    public hb8 x;
    public final bpa y = new bpa(8, new syc(5, this));
    public final p1e z = new p1e((Object) this);

    public jse(ExecutorService executorService, zq7 zq7) {
        super(executorService);
        this.v = executorService;
        this.w = zq7;
    }

    public final int l(int i) {
        return ((lz7) E(i)).i();
    }

    public final pzc u(ViewGroup viewGroup, int i) {
        int i2 = zua.r;
        zq7 zq7 = this.w;
        if (i == i2) {
            Context context = viewGroup.getContext();
            rh9 rh9 = new rh9(14, (Object) zq7);
            TextView textView = new TextView(context);
            textView.setId(zua.e);
            int roundToInt = MathKt.roundToInt(((float) 10) * vo4.c().getDisplayMetrics().density);
            int roundToInt2 = MathKt.roundToInt(((float) 12) * vo4.c().getDisplayMetrics().density);
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -2);
            layoutParams.gravity = 16;
            layoutParams.topMargin = MathKt.roundToInt(((float) 2) * vo4.c().getDisplayMetrics().density);
            textView.setLayoutParams(layoutParams);
            textView.setClipToOutline(true);
            textView.setOutlineProvider(new n04(vo4.c().getDisplayMetrics().density * 10.0f));
            textView.setText(context.getString(ead.p0));
            Drawable b = ew3.b(context, lya.t);
            ArrayList arrayList = wgf.a;
            textView.setCompoundDrawablesRelativeWithIntrinsicBounds(b, (Drawable) null, (Drawable) null, (Drawable) null);
            textView.setCompoundDrawablePadding(MathKt.roundToInt(((float) 8) * vo4.c().getDisplayMetrics().density));
            textView.setPadding(roundToInt2, roundToInt, roundToInt2, roundToInt);
            puf.k.b(textView, uy4.b);
            b0h.H(textView, new ra(3, (Continuation) null, 25));
            ct.G(textView, 300, new e7(26, rh9));
            return new b61(textView, 13);
        } else if (i == fza.i) {
            return new tx1(viewGroup.getContext(), new rh9(15, (Object) zq7));
        } else {
            if (i == fza.j) {
                return new qw3(viewGroup.getContext(), this.x, (ExecutorService) this.v, this.z);
            }
            return bpa.t(this.y, viewGroup.getContext(), i);
        }
    }
}
