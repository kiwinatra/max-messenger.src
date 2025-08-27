package defpackage;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.NoWhenBranchMatchedException;
import kotlin.math.MathKt;
import kotlin.properties.Delegates;
import kotlin.reflect.KProperty;

/* renamed from: e7e  reason: default package */
public final class e7e extends FrameLayout implements phf {
    public static final /* synthetic */ KProperty[] w = {rae.s(e7e.class, "shimmerBackground", "getShimmerBackground()Lone/me/sdk/uikit/common/shimmers/ShimmerContactCell$Companion$Background;", 0)};
    public final FrameLayout a;
    public final FrameLayout b;
    public final FrameLayout c;
    public final g7e o;
    public final bl v = new bl(this);

    public e7e(Context context) {
        super(context, (AttributeSet) null);
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setId(dad.F);
        float f = (float) 40;
        frameLayout.setLayoutParams(new FrameLayout.LayoutParams(MathKt.roundToInt(vo4.c().getDisplayMetrics().density * f), MathKt.roundToInt(f * vo4.c().getDisplayMetrics().density)));
        this.a = frameLayout;
        FrameLayout frameLayout2 = new FrameLayout(context);
        frameLayout2.setId(dad.J);
        frameLayout2.setLayoutParams(new FrameLayout.LayoutParams(MathKt.roundToInt(((float) 169) * vo4.c().getDisplayMetrics().density), MathKt.roundToInt(((float) 20) * vo4.c().getDisplayMetrics().density)));
        this.b = frameLayout2;
        FrameLayout frameLayout3 = new FrameLayout(context);
        frameLayout3.setId(dad.I);
        float f2 = (float) 12;
        frameLayout3.setLayoutParams(new FrameLayout.LayoutParams(MathKt.roundToInt(((float) 90) * vo4.c().getDisplayMetrics().density), MathKt.roundToInt(vo4.c().getDisplayMetrics().density * f2)));
        this.c = frameLayout3;
        ConstraintLayout constraintLayout = new ConstraintLayout(context);
        constraintLayout.setId(dad.H);
        constraintLayout.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        g7e g7e = new g7e(context);
        g7e.setId(dad.G);
        g7e.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        this.o = g7e;
        Delegates delegates = Delegates.INSTANCE;
        d7e d7e = d7e.a;
        setId(dad.E);
        setLayoutParams(new FrameLayout.LayoutParams(-1, MathKt.roundToInt(((float) 62) * vo4.c().getDisplayMetrics().density)));
        constraintLayout.addView(frameLayout);
        constraintLayout.addView(frameLayout2);
        constraintLayout.addView(frameLayout3);
        g7e.addView(constraintLayout);
        addView(g7e);
        onThemeChanged(fu4.k.e(getContext()).f());
        pj3 h = ct.h(constraintLayout);
        int id = frameLayout.getId();
        h.e(id, 3, 0, 3);
        h.e(id, 4, 0, 4);
        h.e(id, 6, 0, 6);
        new ila(h, 6, id, 4).e(MathKt.roundToInt(vo4.c().getDisplayMetrics().density * f2));
        int id2 = frameLayout2.getId();
        h.e(id2, 3, frameLayout.getId(), 3);
        h.e(id2, 6, frameLayout.getId(), 7);
        new ila(h, 6, id2, 4).e(MathKt.roundToInt(vo4.c().getDisplayMetrics().density * f2));
        int id3 = frameLayout3.getId();
        h.e(id3, 4, frameLayout.getId(), 4);
        h.e(id3, 6, frameLayout.getId(), 7);
        new ila(h, 6, id3, 4).e(MathKt.roundToInt(f2 * vo4.c().getDisplayMetrics().density));
        h.a(constraintLayout);
    }

    public final void a(k2b k2b) {
        int ordinal = getShimmerBackground().ordinal();
        if (ordinal == 0) {
            k2b.c().getClass();
            setBackgroundColor(0);
        } else if (ordinal == 1) {
            setBackgroundColor(k2b.c().i);
        } else {
            throw new NoWhenBranchMatchedException();
        }
    }

    public final d7e getShimmerBackground() {
        return (d7e) this.v.getValue(this, w[0]);
    }

    public final void onThemeChanged(k2b k2b) {
        a(k2b);
        this.a.setBackground(i8b.K(Integer.valueOf(k2b.b().a.c), (Integer) null, (Integer) null));
        float f = (float) 4;
        this.b.setBackground(i8b.O(Integer.valueOf(k2b.b().a.c), (Integer) null, (Integer) null, MathKt.roundToInt(vo4.c().getDisplayMetrics().density * f)));
        this.c.setBackground(i8b.O(Integer.valueOf(k2b.b().a.c), (Integer) null, (Integer) null, MathKt.roundToInt(f * vo4.c().getDisplayMetrics().density)));
        p3a p3a = new p3a(6);
        c7e c7e = (c7e) p3a.a;
        c7e.k = false;
        c7e.i = c44.DEFAULT_ASPECT_RATIO;
        p3a.y(1200);
        p3a.x(k2b.b().a.c);
        c7e.d = k2b.c().i;
        p3a.w();
        this.o.a(p3a.q());
    }

    public final void setShimmerBackground(d7e d7e) {
        this.v.setValue(this, w[0], d7e);
    }
}
