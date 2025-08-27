package defpackage;

import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewGroup;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.jvm.functions.Function0;
import kotlin.ranges.RangesKt;

/* renamed from: a6f  reason: default package */
public final class a6f {
    public final Function0 a;
    public final View b;
    public final ViewGroup c;
    public final Function0 d;
    public final y5f e;
    public boolean f;
    public float g = -1.0f;
    public float h = -1.0f;
    public float i = -1.0f;
    public float j = -1.0f;
    public final int k;
    public final int l;
    public View m;
    public final d7 n;
    public final r3d o;
    public final Lazy p;
    public u5f q;
    public Long r;

    public a6f(Integer num, lce lce, View view, ViewGroup viewGroup, sz0 sz0, y5f y5f) {
        this.a = lce;
        this.b = view;
        this.c = viewGroup;
        this.d = sz0;
        this.e = y5f;
        this.k = hi7.v(view.getContext());
        this.l = view.getContext().getResources().getDisplayMetrics().heightPixels;
        this.n = kv0.p(view.getContext(), num);
        this.o = cvg.I(new dle(12));
        this.p = LazyKt.lazy(LazyThreadSafetyMode.NONE, new lce(9, this));
    }

    public final boolean a() {
        return this.e == y5f.a;
    }

    public final void b(float f2) {
        Long l2 = this.r;
        ValueAnimator duration = ValueAnimator.ofFloat(new float[]{f2, 0.0f}).setDuration((long) (Math.abs(f2) * ((float) (l2 != null ? l2.longValue() : 200))));
        duration.addUpdateListener(new x5f(this, 0));
        duration.addListener(new z5f(this, f2, 0));
        duration.start();
    }

    public final void c(float f2) {
        boolean a2 = a();
        d7 d7Var = this.n;
        Function0 function0 = this.d;
        View view = this.b;
        ViewGroup viewGroup = this.c;
        if (a2) {
            View view2 = this.m;
            if (view2 == null) {
                view2 = (View) function0.invoke();
                this.m = view2;
            }
            f6e.A(viewGroup, view2, view, d7Var, f2);
            return;
        }
        View view3 = this.m;
        if (view3 == null) {
            view3 = (View) function0.invoke();
            this.m = view3;
        }
        if (view != null) {
            view.setTranslationY(((float) viewGroup.getContext().getResources().getDisplayMetrics().heightPixels) * f2);
        }
        if (d7Var != null) {
            d7Var.setAlpha(1.0f - Math.abs(f2));
        }
        float coerceAtMost = RangesKt.coerceAtMost(Math.abs(f2) * ((float) 3), 1.0f);
        if (view3 != null) {
            view3.setPivotX(((float) view3.getWidth()) / 2.0f);
        }
        if (view3 != null) {
            view3.setPivotY(((float) view3.getHeight()) / 2.0f);
        }
        if (view3 != null) {
            view3.setScaleX(((((float) 1) - coerceAtMost) * 0.1f) + 1.0f);
        }
        if (view3 != null) {
            view3.setScaleY(((((float) 1) - coerceAtMost) * 0.1f) + 1.0f);
        }
    }
}
