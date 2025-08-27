package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Path;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.IntCompanionObject;
import kotlin.math.MathKt;
import one.me.sdk.uikit.common.views.OneMeDraweeView;

/* renamed from: ace  reason: default package */
public final class ace extends ViewGroup implements a84, zbe, t99, tsc, tc9, l6b, i9g {
    public final krc a;
    public final oc9 b;
    public final m6b c;
    public final w4g o;
    public final esd v = new esd(this);
    public final z74 v0;
    public final s87 w;
    public final int w0;
    public final OneMeDraweeView x;
    public final int x0;
    public final Lazy y;
    public final int y0;
    public boolean z;

    /* JADX WARNING: type inference failed for: r2v0, types: [m6b, java.lang.Object] */
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ace(Context context) {
        super(context);
        krc krc = new krc();
        oc9 oc9 = new oc9();
        ? obj = new Object();
        w4g w4g = new w4g();
        this.a = krc;
        this.b = oc9;
        this.c = obj;
        this.o = w4g;
        s87 s87 = new s87(context);
        this.w = s87;
        OneMeDraweeView oneMeDraweeView = new OneMeDraweeView(context);
        this.x = oneMeDraweeView;
        this.y = LazyKt.lazy(LazyThreadSafetyMode.NONE, new a1b(context, 23));
        z74 z74 = new z74(context);
        z74.setBackgroundEnabled(true);
        this.v0 = z74;
        this.w0 = MathKt.roundToInt(((float) 8) * vo4.c().getDisplayMetrics().density);
        float f = (float) 4;
        this.x0 = MathKt.roundToInt(vo4.c().getDisplayMetrics().density * f);
        this.y0 = MathKt.roundToInt(f * vo4.c().getDisplayMetrics().density);
        oc9.b = this;
        krc.b = this;
        w4g.b = this;
        setLayoutParams(new ViewGroup.MarginLayoutParams(-2, -2));
        addView(oneMeDraweeView, -1, -2);
        addView(s87, new ViewGroup.LayoutParams(-1, -1));
        addView(z74, new ViewGroup.LayoutParams(-2, -2));
        ejd ejd = r89.y;
        k2b f2 = fu4.k.e(getContext()).f();
        ejd.getClass();
        setBackground(ejd.a(f2));
        setWillNotDraw(false);
        setTransitionGroup(true);
        oneMeDraweeView.setupNewController(true);
    }

    private final cq0 getBlurPostProcessor() {
        return (cq0) this.y.getValue();
    }

    public final void a() {
        this.o.a();
    }

    public final void b(p87 p87) {
        this.w.setImageAttach(p87);
        ra7 d = ra7.d(p87.b);
        d.d = p87.h;
        d.l = getBlurPostProcessor();
        qa7 a2 = d.a();
        OneMeDraweeView oneMeDraweeView = this.x;
        oneMeDraweeView.o(a2, (qa7) null);
        ((sp6) oneMeDraweeView.getHierarchy()).h(p87.i);
        requestLayout();
        invalidate();
    }

    /* JADX INFO: finally extract failed */
    public final boolean drawChild(Canvas canvas, View view, long j) {
        OneMeDraweeView oneMeDraweeView = this.x;
        if (view == oneMeDraweeView && !this.z) {
            return false;
        }
        if (view != this.w && view != oneMeDraweeView) {
            return super.drawChild(canvas, view, j);
        }
        Path a2 = ((r89) getBackground()).a();
        int save = canvas.save();
        canvas.clipPath(a2);
        try {
            super.drawChild(canvas, view, j);
            canvas.restoreToCount(save);
            return true;
        } catch (Throwable th) {
            canvas.restoreToCount(save);
            throw th;
        }
    }

    public final void e(ws0 ws0) {
        this.b.e(ws0);
    }

    public final void g(xd9 xd9, boolean z2) {
        this.a.g(xd9, z2);
    }

    public boolean getDependOnOutsideView() {
        return this.c.a;
    }

    public View getPreviewView() {
        return this.w;
    }

    public final void h(CharSequence charSequence, boolean z2) {
        this.v0.c(charSequence, z2);
    }

    public final boolean i(MotionEvent motionEvent) {
        return true;
    }

    public final boolean k() {
        return this.w.getImageAttach().e;
    }

    public final void l(ws0 ws0, boolean z2) {
        this.a.l(ws0, z2);
    }

    public final void m(f9g f9g, t87 t87, long j, boolean z2) {
        this.o.m(f9g, t87, j, z2);
    }

    public final void n() {
        this.b.n();
    }

    public final boolean o() {
        return y7e.L((Lazy) this.o.c);
    }

    public final void onLayout(boolean z2, int i, int i2, int i3, int i4) {
        esd esd = this.v;
        boolean L = y7e.L(esd.b);
        int i5 = 0;
        oc9 oc9 = this.b;
        int roundToInt = (L || y7e.L((Lazy) oc9.c)) ? MathKt.roundToInt(((float) 8) * vo4.c().getDisplayMetrics().density) : 0;
        boolean L2 = y7e.L(esd.b);
        int i6 = this.w0;
        if (L2) {
            esd.c(i6, roundToInt);
            roundToInt = tr1.e((float) 4, vo4.c().getDisplayMetrics().density, esd.a(), roundToInt);
        }
        if (y7e.L((Lazy) oc9.c)) {
            oc9.S(i6, roundToInt);
            roundToInt = tr1.e((float) 4, vo4.c().getDisplayMetrics().density, oc9.K(), roundToInt);
        }
        if (this.z) {
            OneMeDraweeView oneMeDraweeView = this.x;
            oneMeDraweeView.layout(0, roundToInt, oneMeDraweeView.getMeasuredWidth(), oneMeDraweeView.getMeasuredHeight() + roundToInt);
        }
        int measuredWidth = getMeasuredWidth();
        s87 s87 = this.w;
        ev0.x(s87, (measuredWidth - s87.getMeasuredWidth()) / 2, roundToInt, 0, 12);
        w4g w4g = this.o;
        if (y7e.L((Lazy) w4g.c)) {
            w4g.S((getMeasuredWidth() - s87.getMeasuredWidth()) / 2, roundToInt);
        }
        int measuredHeight = s87.getMeasuredHeight() + roundToInt;
        int measuredWidth2 = getMeasuredWidth();
        z74 z74 = this.v0;
        ev0.x(z74, (measuredWidth2 - z74.getMeasuredWidth()) - this.y0, (measuredHeight - z74.getMeasuredHeight()) - this.x0, 0, 12);
        krc krc = this.a;
        if (y7e.L((Lazy) krc.c)) {
            int b2 = g63.b((float) 10, vo4.c().getDisplayMetrics().density, measuredHeight);
            if (krc.y) {
                i5 = getMeasuredWidth() - krc.L();
            }
            krc.S(i5, b2);
        }
    }

    public final void onMeasure(int i, int i2) {
        int i3;
        int size = View.MeasureSpec.getSize(i);
        boolean z2 = false;
        int i4 = getDependOnOutsideView() ? size : 0;
        esd esd = this.v;
        if (y7e.L(esd.b)) {
            esd.d(View.MeasureSpec.makeMeasureSpec(size, IntCompanionObject.MIN_VALUE), i2);
            i4 = Math.max(i4, (MathKt.roundToInt(((float) 10) * vo4.c().getDisplayMetrics().density) * 2) + esd.b());
            i3 = tr1.e((float) 4, vo4.c().getDisplayMetrics().density, esd.a(), MathKt.roundToInt(((float) 8) * vo4.c().getDisplayMetrics().density));
        } else {
            i3 = 0;
        }
        oc9 oc9 = this.b;
        if (y7e.L((Lazy) oc9.c)) {
            oc9.T(View.MeasureSpec.makeMeasureSpec(size, IntCompanionObject.MIN_VALUE), i2);
            i4 = Math.max(i4, (MathKt.roundToInt(((float) 10) * vo4.c().getDisplayMetrics().density) * 2) + oc9.L());
            i3 = tr1.e((float) 4, vo4.c().getDisplayMetrics().density, oc9.K(), i3 + (i3 == 0 ? MathKt.roundToInt(((float) 8) * vo4.c().getDisplayMetrics().density) : 0));
        }
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(size, 1073741824);
        s87 s87 = this.w;
        s87.measure(makeMeasureSpec, i2);
        int max = Math.max(i4, s87.getMeasuredWidth());
        int measuredHeight = s87.getMeasuredHeight() + i3;
        w4g w4g = this.o;
        if (y7e.L((Lazy) w4g.c)) {
            w4g.T(View.MeasureSpec.makeMeasureSpec(s87.getMeasuredWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(s87.getMeasuredHeight(), 1073741824));
        }
        if (!(max == s87.getMeasuredWidth() && s87.getMeasuredLayoutHeight() == s87.getMeasuredHeight())) {
            z2 = true;
        }
        this.z = z2;
        if (z2) {
            this.x.measure(View.MeasureSpec.makeMeasureSpec(max, 1073741824), View.MeasureSpec.makeMeasureSpec(s87.getMeasuredHeight(), 1073741824));
        }
        z74 z74 = this.v0;
        z74.measure(i, i2);
        int max2 = Math.max(max, z74.getMeasuredWidth());
        int max3 = Math.max(measuredHeight, z74.getMeasuredHeight());
        krc krc = this.a;
        if (y7e.L((Lazy) krc.c)) {
            krc.T(View.MeasureSpec.makeMeasureSpec(size, IntCompanionObject.MIN_VALUE), i2);
            max2 = Math.max(max2, krc.L());
            int b2 = g63.b((float) 8, vo4.c().getDisplayMetrics().density, krc.K() + MathKt.roundToInt(((float) 10) * vo4.c().getDisplayMetrics().density));
            max3 += b2;
            ((r89) getBackground()).x = (float) b2;
        } else {
            ((r89) getBackground()).x = c44.DEFAULT_ASPECT_RATIO;
        }
        setMeasuredDimension(max2, max3);
    }

    public final void q(boolean z2) {
        this.a.q(z2);
    }

    public final boolean r() {
        return this.o.r();
    }

    public void setChipObserver(jqc jqc) {
        this.a.setChipObserver(jqc);
    }

    public void setDateBackgroundColor(int i) {
        this.v0.setBackgroundColor(i);
    }

    public void setDateTextColor(int i) {
        this.v0.setTextColor(i);
    }

    public void setDateViewStatus(hcg hcg) {
        this.v0.setStatus(hcg);
    }

    public void setDependOnOutsideView(boolean z2) {
        this.c.a = z2;
    }

    public void setForwardClickListener(Function1<? super gc9, Unit> function1) {
        this.b.w = function1;
    }

    public void setIsIncoming(boolean z2) {
        this.a.v = z2;
    }

    public void setLink(nc9 nc9) {
        this.b.setLink(nc9);
    }

    public void setOnClickListener(Function1<? super hqc, Unit> function1) {
        this.a.w = function1;
    }

    public void setReplyClickListener(Function2<? super Long, ? super Long, Unit> function2) {
        this.b.v = function2;
    }

    public void setStackFromEnd(boolean z2) {
        this.a.y = z2;
    }

    public void setVideoClickListener(Function2<? super o00, ? super Long, Unit> function2) {
        this.o.v = function2;
    }

    public void setVideoLongClickListener(Function2<? super Long, ? super View, Unit> function2) {
        this.o.w = function2;
    }
}
