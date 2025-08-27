package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.IntCompanionObject;
import kotlin.math.MathKt;
import kotlin.reflect.KProperty;

/* renamed from: epe  reason: default package */
public final class epe extends ViewGroup implements a84, roe, tsc, tc9 {
    public final roe a;
    public final krc b;
    public final oc9 c;
    public final FrameLayout o;
    public final int v = MathKt.roundToInt(((float) 10) * vo4.c().getDisplayMetrics().density);
    public final z74 w;
    public final Lazy x;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public epe(Context context, roe roe) {
        super(context);
        krc krc = new krc();
        oc9 oc9 = new oc9();
        this.a = roe;
        this.b = krc;
        this.c = oc9;
        FrameLayout frameLayout = new FrameLayout(context);
        this.o = frameLayout;
        z74 z74 = new z74(context);
        z74.setBackgroundEnabled(true);
        this.w = z74;
        this.x = LazyKt.lazy(LazyThreadSafetyMode.NONE, new lce(5, this));
        krc.b = this;
        oc9.b = this;
        roe.setParent(frameLayout);
        setLayoutParams(new ViewGroup.MarginLayoutParams(-2, -2));
        addView(frameLayout, new ViewGroup.LayoutParams(-2, -2));
        addView(z74, new ViewGroup.LayoutParams(-2, -2));
    }

    private final r89 getMessageBackground() {
        return (r89) this.x.getValue();
    }

    public final void a(gpe gpe) {
        this.a.a(gpe);
    }

    public final void b(hb8 hb8) {
        this.a.b(hb8);
    }

    public final void e(ws0 ws0) {
        this.c.e(ws0);
    }

    public final void g(xd9 xd9, boolean z) {
        this.b.g(xd9, z);
    }

    public final void h(CharSequence charSequence, boolean z) {
        KProperty[] kPropertyArr = z74.B0;
        this.w.c(charSequence, false);
    }

    public final void l(ws0 ws0, boolean z) {
        this.b.l(ws0, z);
    }

    public final void n() {
        this.c.n();
        this.w.setBackgroundEnabled(true);
        setBackground((Drawable) null);
    }

    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5;
        int measuredWidth;
        float f = (float) 10;
        int roundToInt = MathKt.roundToInt(vo4.c().getDisplayMetrics().density * f);
        oc9 oc9 = this.c;
        boolean L = y7e.L((Lazy) oc9.c);
        int i6 = this.v;
        if (L) {
            oc9.S(roundToInt, i6);
            i5 = tr1.e((float) 4, vo4.c().getDisplayMetrics().density, oc9.K(), i6);
        } else {
            i5 = i6;
        }
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        u89 u89 = layoutParams instanceof u89 ? (u89) layoutParams : null;
        int i7 = 0;
        boolean z2 = u89 != null && !u89.a;
        FrameLayout frameLayout = this.o;
        Lazy lazy = (Lazy) oc9.c;
        if (z2 && !y7e.L(lazy)) {
            roundToInt = (getMeasuredWidth() - frameLayout.getMeasuredWidth()) - i6;
        }
        ev0.x(frameLayout, roundToInt, i5, 0, 12);
        int e = tr1.e((float) 2, vo4.c().getDisplayMetrics().density, frameLayout.getMeasuredHeight(), i5);
        boolean L2 = y7e.L(lazy);
        z74 z74 = this.w;
        if (L2 || z2) {
            measuredWidth = getMeasuredWidth() - z74.getMeasuredWidth();
        } else {
            measuredWidth = frameLayout.getMeasuredWidth();
            i6 = z74.getMeasuredWidth();
        }
        ev0.x(z74, measuredWidth - i6, e, 0, 12);
        int b2 = e + (getBackground() != null ? g63.b((float) 4, vo4.c().getDisplayMetrics().density, z74.getMeasuredHeight()) : z74.getMeasuredHeight());
        krc krc = this.b;
        if (y7e.L((Lazy) krc.c)) {
            if (krc.y) {
                i7 = getMeasuredWidth() - krc.L();
            }
            krc.S(i7, MathKt.roundToInt(f * vo4.c().getDisplayMetrics().density) + b2);
        }
    }

    public final void onMeasure(int i, int i2) {
        int size = View.MeasureSpec.getSize(i);
        int i3 = this.v;
        int i4 = size - (i3 * 2);
        int roundToInt = MathKt.roundToInt(((float) 8) * vo4.c().getDisplayMetrics().density);
        FrameLayout frameLayout = this.o;
        frameLayout.measure(View.MeasureSpec.makeMeasureSpec(i4, IntCompanionObject.MIN_VALUE), i2);
        int max = Math.max(0, frameLayout.getMeasuredWidth());
        int measuredHeight = frameLayout.getMeasuredHeight() + roundToInt;
        oc9 oc9 = this.c;
        if (y7e.L((Lazy) oc9.c)) {
            oc9.T(View.MeasureSpec.makeMeasureSpec(max, IntCompanionObject.MIN_VALUE), i2);
            max = Math.max(max, oc9.L());
            measuredHeight = tr1.e((float) 4, vo4.c().getDisplayMetrics().density, oc9.K(), measuredHeight);
        }
        z74 z74 = this.w;
        z74.measure(i, i2);
        int e = tr1.e((float) 4, vo4.c().getDisplayMetrics().density, z74.getMeasuredHeight() + MathKt.roundToInt(((float) 2) * vo4.c().getDisplayMetrics().density), measuredHeight);
        int i5 = (i3 * 2) + max;
        krc krc = this.b;
        if (y7e.L((Lazy) krc.c)) {
            krc.T(View.MeasureSpec.makeMeasureSpec(i4, IntCompanionObject.MIN_VALUE), i2);
            i5 = Math.max(i5, krc.L());
            int b2 = g63.b((float) 10, vo4.c().getDisplayMetrics().density, krc.K());
            e += b2;
            if (getBackground() != null) {
                ((r89) getBackground()).x = (float) b2;
            }
        } else if (getBackground() != null) {
            ((r89) getBackground()).x = c44.DEFAULT_ASPECT_RATIO;
        }
        setMeasuredDimension(i5, e);
    }

    public final void q(boolean z) {
        this.b.q(z);
    }

    public void setChipObserver(jqc jqc) {
        this.b.setChipObserver(jqc);
    }

    public void setDateBackgroundColor(int i) {
        this.w.setBackgroundColor(i);
    }

    public void setDateTextColor(int i) {
        this.w.setTextColor(i);
    }

    public void setDateViewStatus(hcg hcg) {
        this.w.setStatus(hcg);
    }

    public void setForwardClickListener(Function1<? super gc9, Unit> function1) {
        this.c.w = function1;
    }

    public void setIsIncoming(boolean z) {
        this.b.v = z;
    }

    public void setLink(nc9 nc9) {
        this.c.setLink(nc9);
        this.w.setBackgroundEnabled(false);
        if (getBackground() == null) {
            setBackground(getMessageBackground());
        }
    }

    public void setOnClickListener(Function1<? super hqc, Unit> function1) {
        this.b.w = function1;
    }

    public void setParent(ViewGroup viewGroup) {
        this.a.setParent(viewGroup);
    }

    public void setReplyClickListener(Function2<? super Long, ? super Long, Unit> function2) {
        this.c.v = function2;
    }

    public void setStackFromEnd(boolean z) {
        this.b.y = z;
    }
}
