package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Looper;
import android.text.Layout;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewOutlineProvider;
import kotlin.Lazy;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.IntCompanionObject;
import kotlin.math.MathKt;
import kotlin.reflect.KProperty;

/* renamed from: v43  reason: default package */
public final class v43 extends ViewGroup implements dsd, a84, t99, k43, tsc, tc9, l6b, asd {
    public final krc a;
    public final oc9 b;
    public final m6b c;
    public final yrd o;
    public final esd v = new esd(this);
    public final int v0;
    public final q43 w;
    public final int w0;
    public final z74 x;
    public final int y;
    public final int z;

    /* JADX WARNING: type inference failed for: r2v0, types: [m6b, java.lang.Object] */
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public v43(Context context) {
        super(context);
        krc krc = new krc();
        oc9 oc9 = new oc9();
        ? obj = new Object();
        yrd yrd = new yrd();
        this.a = krc;
        this.b = oc9;
        this.c = obj;
        this.o = yrd;
        this.w = new q43(context, this);
        z74 z74 = new z74(context);
        z74.setBackgroundEnabled(true);
        this.x = z74;
        this.y = MathKt.roundToInt(((float) 10) * vo4.c().getDisplayMetrics().density);
        float f = (float) 4;
        this.z = MathKt.roundToInt(vo4.c().getDisplayMetrics().density * f);
        this.v0 = MathKt.roundToInt(vo4.c().getDisplayMetrics().density * f);
        this.w0 = MathKt.roundToInt(f * vo4.c().getDisplayMetrics().density);
        krc.b = this;
        oc9.b = this;
        yrd.b = this;
        setLayoutParams(new ViewGroup.MarginLayoutParams(-2, -2));
        addView(z74, new ViewGroup.LayoutParams(-2, -2));
        ejd ejd = r89.y;
        k2b f2 = fu4.k.e(getContext()).f();
        ejd.getClass();
        setBackground(ejd.a(f2));
        setClipChildren(true);
        setOutlineProvider(ViewOutlineProvider.BACKGROUND);
        setWillNotDraw(false);
        setTransitionGroup(true);
    }

    public final void c(o43 o43) {
        float[] fArr = o43.a;
        q43 q43 = this.w;
        q43.h = fArr;
        q43.f.setValue(q43, q43.k[0], o43.b);
        requestLayout();
        invalidate();
    }

    public final void e(ws0 ws0) {
        this.b.e(ws0);
    }

    public final void f(MotionEvent motionEvent, int[] iArr) {
        this.w.e(iArr, MathKt.roundToInt(motionEvent.getX()), MathKt.roundToInt(motionEvent.getY()));
    }

    public final void g(xd9 xd9, boolean z2) {
        this.a.g(xd9, z2);
    }

    public int getAliasWidthWithPaddings() {
        return this.o.g0();
    }

    public boolean getDependOnOutsideView() {
        return this.c.a;
    }

    public final void h(CharSequence charSequence, boolean z2) {
        KProperty[] kPropertyArr = z74.B0;
        this.x.c(charSequence, false);
    }

    public final boolean i(MotionEvent motionEvent) {
        return false;
    }

    public final void invalidateDrawable(Drawable drawable) {
        if (Looper.getMainLooper().isCurrentThread()) {
            super.invalidateDrawable(drawable);
            return;
        }
        Handler handler = getHandler();
        if (handler != null) {
            handler.postAtFrontOfQueue(new r43(this, drawable, 0));
        } else {
            post(new s43(this, drawable, 0));
        }
    }

    public final void l(ws0 ws0, boolean z2) {
        this.a.l(ws0, z2);
    }

    public final void n() {
        this.b.n();
    }

    public final void onDraw(Canvas canvas) {
        Path a2 = ((r89) getBackground()).a();
        int save = canvas.save();
        canvas.clipPath(a2);
        try {
            super.onDraw(canvas);
            q43 q43 = this.w;
            int length = q43.h.length;
            for (int i = 0; i < length; i++) {
                z7d e = q43.e.c(i).e();
                if (e != null) {
                    e.draw(canvas);
                }
            }
        } finally {
            canvas.restoreToCount(save);
        }
    }

    public final void onFinishTemporaryDetach() {
        super.onFinishTemporaryDetach();
        this.w.e.p();
    }

    public final void onLayout(boolean z2, int i, int i2, int i3, int i4) {
        esd esd = this.v;
        boolean L = y7e.L(esd.b);
        oc9 oc9 = this.b;
        int i5 = this.y;
        int i6 = (L || y7e.L((Lazy) oc9.c)) ? i5 : 0;
        Lazy lazy = esd.b;
        if (y7e.L(lazy)) {
            int a2 = esd.a() + i6;
            esd.c(i5, i6);
            i6 = this.z + a2;
        }
        yrd yrd = this.o;
        if (y7e.L((Lazy) yrd.c) && y7e.L(lazy)) {
            yrd.S((getMeasuredWidth() - i5) - yrd.L(), ((esd.a() / 2) - (yrd.K() / 2)) + i5);
        }
        if (y7e.L((Lazy) oc9.c)) {
            oc9.S(i5, i6);
            i6 += oc9.K() + i5;
        }
        this.w.b(i6);
        krc krc = this.a;
        int e = y7e.L((Lazy) krc.c) ? a81.e((float) 10, vo4.c().getDisplayMetrics().density, a81.e((float) 8, vo4.c().getDisplayMetrics().density, getMeasuredHeight() - krc.K())) : getMeasuredHeight();
        if (y7e.L((Lazy) krc.c)) {
            krc.S(krc.y ? getMeasuredWidth() - krc.L() : 0, MathKt.roundToInt(((float) 10) * vo4.c().getDisplayMetrics().density) + e);
        }
        int measuredWidth = getMeasuredWidth();
        z74 z74 = this.x;
        ev0.x(z74, (measuredWidth - z74.getMeasuredWidth()) - this.w0, (e - z74.getMeasuredHeight()) - this.v0, 0, 12);
    }

    public final void onMeasure(int i, int i2) {
        int size = getDependOnOutsideView() ? View.MeasureSpec.getSize(i) : a81.f((float) 10, vo4.c().getDisplayMetrics().density, 2, View.MeasureSpec.getSize(i));
        int i3 = 0;
        int i4 = getDependOnOutsideView() ? size : 0;
        esd esd = this.v;
        boolean L = y7e.L(esd.b);
        int i5 = this.y;
        oc9 oc9 = this.b;
        if (L || y7e.L((Lazy) oc9.c)) {
            i3 = i5;
        }
        yrd yrd = this.o;
        if (y7e.L((Lazy) yrd.c) && y7e.L(esd.b)) {
            yrd.T(View.MeasureSpec.makeMeasureSpec(size, IntCompanionObject.MIN_VALUE), i2);
            i4 = Math.max(i4, yrd.L());
        }
        if (y7e.L(esd.b)) {
            esd.d(View.MeasureSpec.makeMeasureSpec(size, IntCompanionObject.MIN_VALUE), i2);
            i4 = Math.max(i4, (i5 * 2) + esd.b() + yrd.g0());
            i3 += esd.a() + this.z;
        }
        if (y7e.L((Lazy) oc9.c)) {
            oc9.T(View.MeasureSpec.makeMeasureSpec(size, IntCompanionObject.MIN_VALUE), i2);
            i4 = Math.max(i4, (i5 * 2) + oc9.L());
            i3 += oc9.K() + i5;
        }
        z74 z74 = this.x;
        z74.measure(i, i2);
        int max = Math.max(i4, z74.getMeasuredWidth());
        int max2 = Math.max(i3, z74.getMeasuredHeight());
        q43 q43 = this.w;
        q43.c(size);
        int max3 = Math.max(max, q43.c);
        int max4 = Math.max(max2, q43.d);
        krc krc = this.a;
        if (y7e.L((Lazy) krc.c)) {
            krc.T(View.MeasureSpec.makeMeasureSpec(size, IntCompanionObject.MIN_VALUE), i2);
            max3 = Math.max(max3, krc.L());
            int b2 = g63.b((float) 8, vo4.c().getDisplayMetrics().density, krc.K() + MathKt.roundToInt(((float) 10) * vo4.c().getDisplayMetrics().density));
            max4 += b2;
            ((r89) getBackground()).x = (float) b2;
        } else {
            ((r89) getBackground()).x = c44.DEFAULT_ASPECT_RATIO;
        }
        setMeasuredDimension(max3, max4);
    }

    public final void onStartTemporaryDetach() {
        super.onStartTemporaryDetach();
        this.w.e.q();
    }

    public final l43 p(MotionEvent motionEvent) {
        return this.w.a(MathKt.roundToInt(motionEvent.getX()), MathKt.roundToInt(motionEvent.getY()));
    }

    public final void q(boolean z2) {
        this.a.q(z2);
    }

    public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
        if (Looper.getMainLooper().isCurrentThread()) {
            super.scheduleDrawable(drawable, runnable, j);
            return;
        }
        Handler handler = getHandler();
        if (handler != null) {
            handler.postAtFrontOfQueue(new t43(this, drawable, runnable, j, 0));
            return;
        }
        post(new t43(this, drawable, runnable, j, 1));
    }

    public void setAlias(Layout layout) {
        this.o.setAlias(layout);
    }

    public void setAliasColor(int i) {
        this.o.setAliasColor(i);
    }

    public void setChipObserver(jqc jqc) {
        this.a.setChipObserver(jqc);
    }

    public void setDateBackgroundColor(int i) {
        this.x.setBackgroundColor(i);
    }

    public void setDateTextColor(int i) {
        this.x.setTextColor(i);
    }

    public void setDateViewStatus(hcg hcg) {
        this.x.setStatus(hcg);
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

    public void setOnFinalImageSetCallback(Function1<? super String, Unit> function1) {
        this.w.g = function1;
    }

    public void setReplyClickListener(Function2<? super Long, ? super Long, Unit> function2) {
        this.b.v = function2;
    }

    public void setSenderName(Layout layout) {
        this.v.e(layout);
    }

    public void setSenderNameColor(int i) {
        this.v.f(i);
    }

    public void setStackFromEnd(boolean z2) {
        this.a.y = z2;
    }

    public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        if (Looper.getMainLooper().isCurrentThread()) {
            super.unscheduleDrawable(drawable, runnable);
            return;
        }
        Handler handler = getHandler();
        if (handler != null) {
            handler.postAtFrontOfQueue(new u43(this, drawable, runnable, 0));
        } else {
            post(new u43(this, drawable, runnable, 1));
        }
    }

    public final boolean verifyDrawable(Drawable drawable) {
        return this.w.g(drawable) || super.verifyDrawable(drawable);
    }

    public final void unscheduleDrawable(Drawable drawable) {
        if (Looper.getMainLooper().isCurrentThread()) {
            super.unscheduleDrawable(drawable);
            return;
        }
        Handler handler = getHandler();
        if (handler != null) {
            handler.postAtFrontOfQueue(new r43(this, drawable, 1));
        } else {
            post(new s43(this, drawable, 1));
        }
    }
}
