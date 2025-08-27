package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
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

/* renamed from: cn0  reason: default package */
public final class cn0 extends ViewGroup implements a84, wff, tsc, tc9, l6b {
    public final krc a;
    public final oc9 b;
    public final m6b c;
    public final lf9 o;
    public final z74 v;
    public final int w = MathKt.roundToInt(((float) 10) * vo4.c().getDisplayMetrics().density);
    public final Lazy x = LazyKt.lazy(LazyThreadSafetyMode.NONE, new j6(13, this));

    /* JADX WARNING: type inference failed for: r2v0, types: [m6b, java.lang.Object] */
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public cn0(Context context) {
        super(context);
        krc krc = new krc();
        oc9 oc9 = new oc9();
        ? obj = new Object();
        this.a = krc;
        this.b = oc9;
        this.c = obj;
        lf9 lf9 = new lf9(context, 0);
        lf9.setId(cwa.N);
        this.o = lf9;
        z74 z74 = new z74(context);
        this.v = z74;
        krc.b = this;
        oc9.b = this;
        lf9.setSingleClickAction(new b(15, (Object) this));
        lf9.setOnLongClickListener(new z20(3, this));
        setLayoutParams(new ViewGroup.MarginLayoutParams(-2, -2));
        addView(lf9, new ViewGroup.LayoutParams(-2, -2));
        addView(z74, new ViewGroup.LayoutParams(-2, -2));
    }

    private final r89 getMessageBackground() {
        return (r89) this.x.getValue();
    }

    public final void e(ws0 ws0) {
        this.b.e(ws0);
    }

    public final void g(xd9 xd9, boolean z) {
        this.a.g(xd9, z);
    }

    public boolean getDependOnOutsideView() {
        return this.c.a;
    }

    public final CharSequence getText() {
        return this.o.getText();
    }

    public final void h(CharSequence charSequence, boolean z) {
        this.v.c(charSequence, z);
    }

    public final void l(ws0 ws0, boolean z) {
        this.a.l(ws0, z);
    }

    public final void n() {
        this.b.n();
        this.v.setBackgroundEnabled(true);
        setBackground((Drawable) null);
    }

    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5;
        int measuredWidth;
        oc9 oc9 = this.b;
        boolean L = y7e.L((Lazy) oc9.c);
        int i6 = this.w;
        if (L) {
            oc9.S(i6, i6);
            i5 = tr1.e((float) 4, vo4.c().getDisplayMetrics().density, oc9.K(), i6);
        } else {
            i5 = i6;
        }
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        u89 u89 = layoutParams instanceof u89 ? (u89) layoutParams : null;
        int i7 = 0;
        boolean z2 = u89 != null && !u89.a;
        lf9 lf9 = this.o;
        Lazy lazy = (Lazy) oc9.c;
        ev0.x(lf9, (!z2 || y7e.L(lazy)) ? i6 : (getMeasuredWidth() - lf9.getMeasuredWidth()) - i6, i5, 0, 12);
        int measuredHeight = lf9.getMeasuredHeight() + (getBackground() == null ? MathKt.roundToInt(((float) 2) * vo4.c().getDisplayMetrics().density) : 0) + i5;
        boolean L2 = y7e.L(lazy);
        z74 z74 = this.v;
        if (L2 || z2) {
            measuredWidth = getMeasuredWidth() - z74.getMeasuredWidth();
        } else {
            measuredWidth = lf9.getMeasuredWidth();
            i6 = z74.getMeasuredWidth();
        }
        ev0.x(z74, measuredWidth - i6, measuredHeight, 0, 12);
        int b2 = measuredHeight + (getBackground() != null ? g63.b((float) 4, vo4.c().getDisplayMetrics().density, z74.getMeasuredHeight()) : z74.getMeasuredHeight());
        krc krc = this.a;
        if (y7e.L((Lazy) krc.c)) {
            if (krc.y) {
                i7 = getMeasuredWidth() - krc.L();
            }
            krc.S(i7, MathKt.roundToInt(((float) 10) * vo4.c().getDisplayMetrics().density) + b2);
        }
    }

    public final void onMeasure(int i, int i2) {
        float f = (float) 10;
        int f2 = a81.f(f, vo4.c().getDisplayMetrics().density, 2, View.MeasureSpec.getSize(i));
        lf9 lf9 = this.o;
        lf9.d();
        int measuredWidth = getDependOnOutsideView() ? f2 : lf9.getMeasuredWidth();
        int measuredHeight = lf9.getMeasuredHeight() + (getBackground() == null ? MathKt.roundToInt(((float) 2) * vo4.c().getDisplayMetrics().density) : 0);
        oc9 oc9 = this.b;
        if (y7e.L((Lazy) oc9.c)) {
            oc9.T(View.MeasureSpec.makeMeasureSpec(f2, IntCompanionObject.MIN_VALUE), i2);
            measuredWidth = Math.max(measuredWidth, oc9.L());
            measuredHeight = tr1.e((float) 4, vo4.c().getDisplayMetrics().density, oc9.K(), measuredHeight);
        }
        krc krc = this.a;
        if (y7e.L((Lazy) krc.c)) {
            krc.T(View.MeasureSpec.makeMeasureSpec(f2, IntCompanionObject.MIN_VALUE), i2);
            measuredWidth = Math.max(measuredWidth, krc.L());
            int b2 = g63.b(f, vo4.c().getDisplayMetrics().density, krc.K());
            measuredHeight += b2;
            if (getBackground() != null) {
                ((r89) getBackground()).x = (float) b2;
            }
        } else if (getBackground() != null) {
            ((r89) getBackground()).x = c44.DEFAULT_ASPECT_RATIO;
        }
        z74 z74 = this.v;
        z74.measure(i, i2);
        setMeasuredDimension((MathKt.roundToInt(f * vo4.c().getDisplayMetrics().density) * 2) + Math.max(measuredWidth, z74.getMeasuredWidth()), (MathKt.roundToInt(((float) 8) * vo4.c().getDisplayMetrics().density) * 2) + z74.getMeasuredHeight() + measuredHeight);
    }

    public final void q(boolean z) {
        this.a.q(z);
    }

    public void setChipObserver(jqc jqc) {
        this.a.setChipObserver(jqc);
    }

    public void setDateBackgroundColor(int i) {
        this.v.setBackgroundColor(i);
    }

    public void setDateTextColor(int i) {
        this.v.setTextColor(i);
    }

    public void setDateViewStatus(hcg hcg) {
        this.v.setStatus(hcg);
    }

    public void setDependOnOutsideView(boolean z) {
        this.c.a = z;
    }

    public void setForwardClickListener(Function1<? super gc9, Unit> function1) {
        this.b.w = function1;
    }

    public void setIsIncoming(boolean z) {
        this.a.v = z;
    }

    public void setLink(nc9 nc9) {
        this.b.setLink(nc9);
        this.v.setBackgroundEnabled(false);
        if (getBackground() == null) {
            setBackground(getMessageBackground());
        }
    }

    public void setOnClickListener(Function1<? super hqc, Unit> function1) {
        this.a.w = function1;
    }

    public void setReplyClickListener(Function2<? super Long, ? super Long, Unit> function2) {
        this.b.v = function2;
    }

    public void setStackFromEnd(boolean z) {
        this.a.y = z;
    }

    public void setTextMessageColors(ws0 ws0) {
        this.o.setTextColors(ws0);
    }

    public void setTextMessageLayout(jf9 jf9) {
        this.o.setLayout(jf9);
    }

    public /* bridge */ /* synthetic */ void setTextMessageLinkClickListener(ny7 ny7) {
    }
}
