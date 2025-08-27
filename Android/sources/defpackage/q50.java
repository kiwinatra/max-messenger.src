package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.LayerDrawable;
import android.text.Layout;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewOutlineProvider;
import android.widget.ImageView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.work.WorkRequest;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.IntCompanionObject;
import kotlin.jvm.internal.Intrinsics;
import kotlin.math.MathKt;
import kotlin.ranges.RangesKt;
import kotlin.reflect.KProperty;

/* renamed from: q50  reason: default package */
public final class q50 extends ViewGroup implements dsd, a84, tsc, tc9, asd {
    public static final int S0 = MathKt.roundToInt(((float) 44) * vo4.c().getDisplayMetrics().density);
    public static final int T0 = MathKt.roundToInt(((float) 36) * vo4.c().getDisplayMetrics().density);
    public static final int U0 = MathKt.roundToInt(((float) 24) * vo4.c().getDisplayMetrics().density);
    public final f80 A0;
    public final AppCompatTextView B0;
    public boolean C0;
    public ws0 D0;
    public final int E0;
    public final int F0;
    public final int G0;
    public final int H0;
    public final int I0;
    public final int J0;
    public final int K0;
    public Long L0;
    public Long M0;
    public w50 N0;
    public String O0;
    public pm7 P0;
    public pm7 Q0;
    public p50 R0;
    public final Function1 a;
    public final krc b;
    public final oc9 c;
    public final yrd o;
    public final esd v = new esd(this);
    public final Lazy v0;
    public final int w;
    public final Lazy w0;
    public final AppCompatImageView x;
    public final Lazy x0;
    public final Lazy y;
    public final z74 y0;
    public final Lazy z;
    public final int z0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public q50(Context context, hq7 hq7) {
        super(context);
        Context context2 = context;
        krc krc = new krc();
        oc9 oc9 = new oc9();
        yrd yrd = new yrd();
        this.a = hq7;
        this.b = krc;
        this.c = oc9;
        this.o = yrd;
        int i = S0;
        this.w = i;
        AppCompatImageView appCompatImageView = new AppCompatImageView(context2, (AttributeSet) null);
        appCompatImageView.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
        this.x = appCompatImageView;
        v4 v4Var = new v4(context2, 1);
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        this.y = LazyKt.lazy(lazyThreadSafetyMode, v4Var);
        this.z = LazyKt.lazy(lazyThreadSafetyMode, new m(13));
        this.v0 = LazyKt.lazy(lazyThreadSafetyMode, new j6(11, this));
        this.w0 = LazyKt.lazy(lazyThreadSafetyMode, new v4(context2, 2));
        this.x0 = LazyKt.lazy(lazyThreadSafetyMode, new v4(context2, 3));
        z74 z74 = new z74(context2);
        z74.setBackgroundEnabled(false);
        this.y0 = z74;
        int roundToInt = MathKt.roundToInt(((float) 24) * vo4.c().getDisplayMetrics().density);
        this.z0 = roundToInt;
        f80 f80 = new f80(context2);
        this.A0 = f80;
        AppCompatTextView appCompatTextView = new AppCompatTextView(context2, (AttributeSet) null);
        ogf ogf = puf.a;
        tr2.d.b(appCompatTextView, uy4.b);
        this.B0 = appCompatTextView;
        js9 js9 = fu4.k;
        this.D0 = js9.e(getContext()).f().a().a(this.C0);
        this.E0 = MathKt.roundToInt(((float) 10) * vo4.c().getDisplayMetrics().density);
        float f = (float) 4;
        this.F0 = MathKt.roundToInt(vo4.c().getDisplayMetrics().density * f);
        float f2 = (float) 8;
        this.G0 = MathKt.roundToInt(vo4.c().getDisplayMetrics().density * f2);
        this.H0 = MathKt.roundToInt(f2 * vo4.c().getDisplayMetrics().density);
        this.I0 = MathKt.roundToInt(vo4.c().getDisplayMetrics().density * f);
        this.J0 = MathKt.roundToInt(vo4.c().getDisplayMetrics().density * f);
        this.K0 = MathKt.roundToInt(f * vo4.c().getDisplayMetrics().density);
        this.O0 = "";
        krc.b = this;
        oc9.b = this;
        yrd.b = this;
        setLayoutParams(new ViewGroup.MarginLayoutParams(-2, -2));
        addView(z74, new ViewGroup.LayoutParams(-2, -2));
        addView(appCompatTextView, new ViewGroup.LayoutParams(-2, -2));
        addView(appCompatImageView, new ViewGroup.LayoutParams(i, i));
        addView(f80, new ViewGroup.LayoutParams(-1, roundToInt));
        ejd ejd = r89.y;
        k2b f3 = js9.e(getContext()).f();
        ejd.getClass();
        setBackground(ejd.a(f3));
        setClipChildren(true);
        setOutlineProvider(ViewOutlineProvider.BACKGROUND);
        setWillNotDraw(false);
        setTransitionGroup(true);
        f80.setListener(new wie(4, (Object) this));
    }

    public static LayerDrawable a(q50 q50) {
        LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{q50.getProgressDrawable(), q50.getDrawableInsideProgress()});
        int i = T0;
        layerDrawable.setLayerSize(0, i, i);
        int i2 = U0;
        int i3 = (i - i2) / 2;
        layerDrawable.setLayerSize(1, i2, i2);
        layerDrawable.setLayerInset(1, i3, i3, i3, i3);
        return layerDrawable;
    }

    private final Drawable getDrawableInsideProgress() {
        return (Drawable) this.y.getValue();
    }

    private final InsetDrawable getPauseDrawable() {
        return (InsetDrawable) this.x0.getValue();
    }

    private final InsetDrawable getPlayDrawable() {
        return (InsetDrawable) this.w0.getValue();
    }

    private final te7 getProgressDrawable() {
        return (te7) this.z.getValue();
    }

    private final LayerDrawable getProgressDrawableWithIcon() {
        return (LayerDrawable) this.v0.getValue();
    }

    public final void b() {
        ws0 a2 = fu4.k.e(getContext()).f().a().a(this.C0);
        this.D0 = a2;
        AppCompatImageView appCompatImageView = this.x;
        appCompatImageView.setBackground(i8b.K(Integer.valueOf(a2.a.e), (Integer) null, (Integer) null));
        appCompatImageView.setColorFilter(this.D0.c.c);
        Drawable drawableInsideProgress = getDrawableInsideProgress();
        if (drawableInsideProgress != null) {
            drawableInsideProgress.setTint(this.D0.c.c);
        }
        getProgressDrawable().b = new int[]{this.D0.c.c, 0};
        this.A0.setIncomingMessage(this.C0);
        this.B0.setTextColor(this.D0.b.c);
        this.y0.setTextColor(this.D0.c.a);
    }

    public final void c(m30 m30) {
        boolean areEqual = Intrinsics.areEqual((Object) m30, (Object) ejd.b);
        AppCompatImageView appCompatImageView = this.x;
        if (areEqual) {
            appCompatImageView.setImageDrawable(getProgressDrawableWithIcon());
        } else if (Intrinsics.areEqual((Object) m30, (Object) v02.a)) {
            appCompatImageView.setImageDrawable(getPauseDrawable());
        } else if (Intrinsics.areEqual((Object) m30, (Object) cd4.b) || Intrinsics.areEqual((Object) m30, (Object) mz4.a)) {
            appCompatImageView.setImageDrawable(getPlayDrawable());
        } else {
            throw new NoWhenBranchMatchedException();
        }
    }

    public final void e(ws0 ws0) {
        this.c.e(ws0);
    }

    public final void g(xd9 xd9, boolean z2) {
        this.b.g(xd9, z2);
    }

    public int getAliasWidthWithPaddings() {
        return this.o.g0();
    }

    public final void h(CharSequence charSequence, boolean z2) {
        KProperty[] kPropertyArr = z74.B0;
        this.y0.c(charSequence, false);
    }

    public final void l(ws0 ws0, boolean z2) {
        this.b.l(ws0, z2);
    }

    public final void n() {
        this.c.n();
    }

    public final void onLayout(boolean z2, int i, int i2, int i3, int i4) {
        esd esd = this.v;
        boolean L = y7e.L(esd.b);
        int i5 = this.G0;
        int i6 = this.E0;
        int i7 = L ? i5 : i6;
        if (y7e.L(esd.b)) {
            int a2 = esd.a() + i7;
            esd.c(i6, i7);
            i7 = this.K0 + a2;
        }
        yrd yrd = this.o;
        if (y7e.L((Lazy) yrd.c) && y7e.L(esd.b)) {
            yrd.S((getMeasuredWidth() - i6) - yrd.L(), ((esd.a() / 2) - (yrd.K() / 2)) + i5);
        }
        oc9 oc9 = this.c;
        if (y7e.L((Lazy) oc9.c)) {
            oc9.S(i6, i7);
            i7 += oc9.K() + this.J0;
        }
        AppCompatImageView appCompatImageView = this.x;
        iq.K(appCompatImageView, i6, i7, appCompatImageView.getMeasuredWidth() + i6, appCompatImageView.getMeasuredHeight() + i7);
        int measuredWidth = appCompatImageView.getMeasuredWidth() + this.H0 + i6;
        int e = a81.e((float) 6, vo4.c().getDisplayMetrics().density, measuredWidth);
        f80 f80 = this.A0;
        iq.K(f80, e, i7, f80.getMeasuredWidth() + measuredWidth, f80.getMeasuredHeight() + i7);
        int measuredHeight = f80.getMeasuredHeight() + this.I0 + i7;
        AppCompatTextView appCompatTextView = this.B0;
        iq.K(appCompatTextView, measuredWidth, measuredHeight, appCompatTextView.getMeasuredWidth() + measuredWidth, appCompatTextView.getMeasuredHeight() + measuredHeight);
        int bottom = appCompatImageView.getBottom();
        krc krc = this.b;
        if (y7e.L((Lazy) krc.c)) {
            float f = (float) 10;
            krc.S(MathKt.roundToInt(f * vo4.c().getDisplayMetrics().density), g63.b(f, vo4.c().getDisplayMetrics().density, bottom));
        }
        int measuredWidth2 = getMeasuredWidth();
        z74 z74 = this.y0;
        int measuredWidth3 = (measuredWidth2 - z74.getMeasuredWidth()) - i6;
        int measuredHeight2 = (getMeasuredHeight() - z74.getMeasuredHeight()) - this.F0;
        iq.K(z74, measuredWidth3, measuredHeight2, z74.getMeasuredWidth() + measuredWidth3, z74.getMeasuredHeight() + measuredHeight2);
    }

    public final void onMeasure(int i, int i2) {
        int i3;
        Long l = this.M0;
        if (l != null) {
            float f = (float) 192;
            i3 = (int) ((((float) a81.e(f, vo4.c().getDisplayMetrics().density, View.MeasureSpec.getSize(i))) * (((float) (RangesKt.coerceIn(l.longValue(), 1000, (long) WorkRequest.DEFAULT_BACKOFF_DELAY_MILLIS) - 1000)) / ((float) 29000))) + ((float) MathKt.roundToInt(vo4.c().getDisplayMetrics().density * f)));
        } else {
            i3 = View.MeasureSpec.getSize(i);
        }
        esd esd = this.v;
        boolean L = y7e.L(esd.b);
        int i4 = this.E0;
        int i5 = L ? this.G0 : i4;
        yrd yrd = this.o;
        if (y7e.L((Lazy) yrd.c) && y7e.L(esd.b)) {
            yrd.T(View.MeasureSpec.makeMeasureSpec(i3, IntCompanionObject.MIN_VALUE), i2);
        }
        if (y7e.L(esd.b)) {
            esd.d(View.MeasureSpec.makeMeasureSpec(i3 - i4, IntCompanionObject.MIN_VALUE), i2);
            i5 += esd.a() + this.K0;
        }
        oc9 oc9 = this.c;
        if (y7e.L((Lazy) oc9.c)) {
            oc9.T(View.MeasureSpec.makeMeasureSpec(i3, IntCompanionObject.MIN_VALUE), i2);
            i5 += oc9.K() + this.J0;
        }
        this.y0.measure(i, i2);
        AppCompatTextView appCompatTextView = this.B0;
        appCompatTextView.measure(View.MeasureSpec.makeMeasureSpec(i3, IntCompanionObject.MIN_VALUE), i2);
        AppCompatImageView appCompatImageView = this.x;
        int i6 = this.w;
        appCompatImageView.measure(View.MeasureSpec.makeMeasureSpec(i6, 1073741824), View.MeasureSpec.makeMeasureSpec(i6, 1073741824));
        float f2 = (float) 10;
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(((MathKt.roundToInt(((float) 6) * vo4.c().getDisplayMetrics().density) * 2) + ((i3 - appCompatImageView.getMeasuredWidth()) - this.H0)) - (MathKt.roundToInt(vo4.c().getDisplayMetrics().density * f2) * 2), 1073741824);
        int i7 = this.z0;
        this.A0.measure(makeMeasureSpec, View.MeasureSpec.makeMeasureSpec(i7, 1073741824));
        int max = Math.max(appCompatImageView.getMeasuredHeight() + i4, appCompatTextView.getMeasuredHeight() + i7 + this.I0 + this.F0) + i5;
        krc krc = this.b;
        if (y7e.L((Lazy) krc.c)) {
            krc.T(View.MeasureSpec.makeMeasureSpec(i3, IntCompanionObject.MIN_VALUE), i2);
            max = tr1.e(f2, vo4.c().getDisplayMetrics().density, krc.K(), max);
        }
        setMeasuredDimension(i3, max);
    }

    public final void q(boolean z2) {
        this.b.q(z2);
    }

    public void setAlias(Layout layout) {
        this.o.setAlias(layout);
    }

    public void setAliasColor(int i) {
        this.o.setAliasColor(i);
    }

    public final void setAudio(l50 l50) {
        p50 p50;
        this.L0 = Long.valueOf(l50.b);
        long j = l50.j;
        this.M0 = Long.valueOf(j);
        boolean z2 = l50.c;
        this.C0 = z2;
        this.O0 = l50.d;
        f80 f80 = this.A0;
        f80.setIncomingMessage(z2);
        f80.b(j, l50.h);
        this.B0.setText(l50.i);
        ct.G(this.x, 300, new m50(this, l50, 1));
        this.R0 = new p50(0, this, l50);
        if (isAttachedToWindow() && (p50 = this.R0) != null) {
            p50.onViewAttachedToWindow(this);
        }
        addOnAttachStateChangeListener(this.R0);
        requestLayout();
    }

    public void setChipObserver(jqc jqc) {
        this.b.setChipObserver(jqc);
    }

    public void setDateBackgroundColor(int i) {
        this.y0.setBackgroundColor(i);
    }

    public void setDateTextColor(int i) {
        this.y0.setTextColor(i);
    }

    public void setDateViewStatus(hcg hcg) {
        this.y0.setStatus(hcg);
    }

    public void setForwardClickListener(Function1<? super gc9, Unit> function1) {
        this.c.w = function1;
    }

    public void setIsIncoming(boolean z2) {
        this.b.v = z2;
    }

    public void setLink(nc9 nc9) {
        this.c.setLink(nc9);
    }

    public void setOnClickListener(Function1<? super hqc, Unit> function1) {
        this.b.w = function1;
    }

    public void setReplyClickListener(Function2<? super Long, ? super Long, Unit> function2) {
        this.c.v = function2;
    }

    public void setSenderName(Layout layout) {
        this.v.e(layout);
    }

    public void setSenderNameColor(int i) {
        this.v.f(i);
    }

    public void setStackFromEnd(boolean z2) {
        this.b.y = z2;
    }
}
