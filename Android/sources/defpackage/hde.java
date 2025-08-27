package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Path;
import android.net.Uri;
import android.text.Layout;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewOutlineProvider;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Unit;
import kotlin.comparisons.ComparisonsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.IntCompanionObject;
import kotlin.jvm.internal.Intrinsics;
import kotlin.math.MathKt;
import kotlin.properties.Delegates;
import kotlin.reflect.KProperty;
import kotlin.time.Duration;

/* renamed from: hde  reason: default package */
public final class hde extends ViewGroup implements dsd, a84, fde, tsc, tc9, l6b, i9g, asd {
    public static final /* synthetic */ KProperty[] H0 = {rae.s(hde.class, "model", "getModel()Lone/me/messages/list/loader/model/SingleVideoAttach;", 0)};
    public final int A0;
    public final int B0;
    public final int C0;
    public final int D0;
    public final bl E0;
    public p50 F0;
    public pm7 G0;
    public final krc a;
    public final oc9 b;
    public final m6b c;
    public final w4g o;
    public final yrd v;
    public final z74 v0;
    public final esd w = new esd(this);
    public final Lazy w0;
    public final cob x;
    public final int x0;
    public final s87 y;
    public final int y0;
    public final m3g z;
    public final int z0;

    /* JADX WARNING: type inference failed for: r3v0, types: [m6b, java.lang.Object] */
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public hde(Context context) {
        super(context);
        krc krc = new krc();
        oc9 oc9 = new oc9();
        ? obj = new Object();
        w4g w4g = new w4g();
        yrd yrd = new yrd();
        this.a = krc;
        this.b = oc9;
        this.c = obj;
        this.o = w4g;
        this.v = yrd;
        cob cob = new cob(context);
        this.x = cob;
        s87 s87 = new s87(context);
        s87.setOverlayDrawable(cob);
        this.y = s87;
        m3g m3g = new m3g(context);
        m3g.setBackgroundEnabled(true);
        this.z = m3g;
        z74 z74 = new z74(context);
        z74.setBackgroundEnabled(true);
        this.v0 = z74;
        this.w0 = LazyKt.lazy(LazyThreadSafetyMode.NONE, new a1b(context, 25));
        float f = (float) 4;
        this.x0 = MathKt.roundToInt(vo4.c().getDisplayMetrics().density * f);
        this.y0 = MathKt.roundToInt(((float) 10) * vo4.c().getDisplayMetrics().density);
        this.z0 = MathKt.roundToInt(vo4.c().getDisplayMetrics().density * f);
        this.A0 = MathKt.roundToInt(vo4.c().getDisplayMetrics().density * f);
        this.B0 = MathKt.roundToInt(vo4.c().getDisplayMetrics().density * f);
        this.C0 = MathKt.roundToInt(vo4.c().getDisplayMetrics().density * f);
        this.D0 = MathKt.roundToInt(f * vo4.c().getDisplayMetrics().density);
        Delegates delegates = Delegates.INSTANCE;
        this.E0 = new bl(25, this);
        krc.b = this;
        oc9.b = this;
        w4g.b = this;
        yrd.b = this;
        setLayoutParams(new ViewGroup.MarginLayoutParams(-2, -2));
        addView(s87, new ViewGroup.LayoutParams(-1, -1));
        addView(z74, new ViewGroup.LayoutParams(-2, -2));
        addView(m3g, new ViewGroup.LayoutParams(-2, -2));
        ejd ejd = r89.y;
        k2b f2 = fu4.k.e(getContext()).f();
        ejd.getClass();
        setBackground(ejd.a(f2));
        setClipChildren(true);
        setOutlineProvider(ViewOutlineProvider.BACKGROUND);
        setWillNotDraw(false);
        setTransitionGroup(true);
    }

    public static final void b(hde hde, f00 f00) {
        ede model = hde.getModel();
        Long l = null;
        Long valueOf = model != null ? Long.valueOf(model.a) : null;
        if (f00 != null) {
            l = Long.valueOf(f00.a());
        }
        if (Intrinsics.areEqual((Object) valueOf, (Object) l)) {
            if ((f00 instanceof b00) || (f00 instanceof e00)) {
                f6e.b(hde, hde.getTransferStatusView(), new ViewGroup.LayoutParams(-2, -2));
                hde.getTransferStatusView().setVisibility(0);
                m3g transferStatusView = hde.getTransferStatusView();
                CharSequence a2 = f00.b().a(hde.getContext());
                if (a2 == null) {
                    a2 = "";
                }
                transferStatusView.setContent(a2);
                return;
            }
            Lazy lazy = hde.w0;
            if (lazy.isInitialized()) {
                ((m3g) lazy.getValue()).setVisibility(8);
            }
        }
    }

    public static final void c(hde hde) {
        hde hde2 = hde;
        ede model = hde.getModel();
        if (model != null) {
            b3g b3g = model.c;
            ede ede = model;
            p87 p87 = r2;
            p87 p872 = new p87(0, b3g.b, b3g.c, b3g.d, false, b3g.e, b3g.h, b3g.i, false, (String) null, (Uri) null, 3328);
            hde2.y.setImageAttach(p87);
            long r1 = Duration.m1371getInWholeMillisecondsimpl(b3g.f);
            String[] strArr = ghf.c;
            hde2.z.setContent(b0h.c(r1));
            ome ome = ede.d;
            if (!(ome.getValue() instanceof b00) && !(ome.getValue() instanceof e00)) {
                Lazy lazy = hde2.w0;
                if (lazy.isInitialized()) {
                    ((m3g) lazy.getValue()).setVisibility(8);
                }
            }
            hde.requestLayout();
            hde.invalidate();
        }
    }

    private final ede getModel() {
        return (ede) this.E0.getValue(this, H0[0]);
    }

    private final m3g getTransferStatusView() {
        return (m3g) this.w0.getValue();
    }

    private final void setModel(ede ede) {
        this.E0.setValue(this, H0[0], ede);
    }

    public final void a() {
        this.o.a();
    }

    public final void d(ede ede) {
        p50 p50;
        setModel(ede);
        this.F0 = new p50(8, this, ede);
        if (isAttachedToWindow() && (p50 = this.F0) != null) {
            p50.onViewAttachedToWindow(this);
        }
        addOnAttachStateChangeListener(this.F0);
    }

    /* JADX INFO: finally extract failed */
    public final boolean drawChild(Canvas canvas, View view, long j) {
        if (view != this.y) {
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

    public int getAliasWidthWithPaddings() {
        return this.v.g0();
    }

    public boolean getDependOnOutsideView() {
        return this.c.a;
    }

    public View getPreviewView() {
        return this.y;
    }

    public final void h(CharSequence charSequence, boolean z2) {
        this.v0.c(charSequence, z2);
    }

    public final void j(ede ede) {
        setModel(ede);
    }

    public final boolean k() {
        return this.o.k();
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
        int i5;
        int i6;
        esd esd = this.w;
        boolean L = y7e.L(esd.b);
        int i7 = 0;
        int i8 = this.y0;
        if (L) {
            esd.c(i8, i8);
            i5 = esd.a() + i8 + this.z0;
        } else {
            i5 = 0;
        }
        yrd yrd = this.v;
        if (y7e.L((Lazy) yrd.c) && y7e.L(esd.b)) {
            yrd.S((getMeasuredWidth() - i8) - yrd.L(), ((esd.a() / 2) - (yrd.K() / 2)) + i8);
        }
        oc9 oc9 = this.b;
        if (y7e.L((Lazy) oc9.c)) {
            int i9 = i5 + i8;
            oc9.S(i8, i9);
            i5 = oc9.K() + i9 + this.x0;
        }
        Lazy lazy = this.w0;
        boolean isInitialized = lazy.isInitialized();
        int i10 = this.D0;
        int i11 = this.C0;
        if (isInitialized) {
            ev0.x((m3g) lazy.getValue(), i10, i5 + i11, 0, 12);
        }
        ev0.x(this.y, 0, i5, 0, 12);
        w4g w4g = this.o;
        if (y7e.L((Lazy) w4g.c)) {
            w4g.S(0, i5);
        }
        krc krc = this.a;
        if (y7e.L((Lazy) krc.c)) {
            i6 = a81.e((float) 10, vo4.c().getDisplayMetrics().density, a81.e((float) 8, vo4.c().getDisplayMetrics().density, getMeasuredHeight() - krc.K()));
        } else {
            i6 = getMeasuredHeight();
        }
        int measuredWidth = getMeasuredWidth();
        z74 z74 = this.v0;
        ev0.x(z74, (measuredWidth - z74.getMeasuredWidth()) - this.B0, (i6 - z74.getMeasuredHeight()) - this.A0, 0, 12);
        m3g m3g = this.z;
        ev0.x(m3g, i10, (i6 - m3g.getMeasuredHeight()) - i11, 0, 12);
        if (y7e.L((Lazy) krc.c)) {
            int b2 = g63.b((float) 10, vo4.c().getDisplayMetrics().density, i6);
            if (krc.y) {
                i7 = getMeasuredWidth() - krc.L();
            }
            krc.S(i7, b2);
        }
    }

    public final void onMeasure(int i, int i2) {
        int i3;
        int size = getDependOnOutsideView() ? View.MeasureSpec.getSize(i) : a81.f((float) 10, vo4.c().getDisplayMetrics().density, 2, View.MeasureSpec.getSize(i));
        int i4 = 0;
        int i5 = getDependOnOutsideView() ? size : 0;
        yrd yrd = this.v;
        boolean L = y7e.L((Lazy) yrd.c);
        esd esd = this.w;
        if (L && y7e.L(esd.b)) {
            yrd.T(View.MeasureSpec.makeMeasureSpec(size, IntCompanionObject.MIN_VALUE), i2);
            i5 = Math.max(i5, yrd.L());
        }
        boolean L2 = y7e.L(esd.b);
        int i6 = this.y0;
        if (L2) {
            esd.d(View.MeasureSpec.makeMeasureSpec(size, IntCompanionObject.MIN_VALUE), i2);
            i5 = Math.max(i5, (i6 * 2) + esd.b() + yrd.g0());
            i3 = Math.max(0, esd.a() + this.z0) + i6;
        } else {
            i3 = 0;
        }
        oc9 oc9 = this.b;
        if (y7e.L((Lazy) oc9.c)) {
            oc9.T(View.MeasureSpec.makeMeasureSpec(size, IntCompanionObject.MIN_VALUE), i2);
            i5 = Math.max(i5, (i6 * 2) + oc9.L());
            i3 += oc9.K() + i6 + this.x0;
        }
        z74 z74 = this.v0;
        z74.measure(i, i2);
        m3g m3g = this.z;
        m3g.measure(i, i2);
        Lazy lazy = this.w0;
        if (lazy.isInitialized()) {
            ((m3g) lazy.getValue()).measure(i, i2);
        }
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(size, 1073741824);
        s87 s87 = this.y;
        s87.measure(makeMeasureSpec, i2);
        int measuredWidth = s87.getMeasuredWidth();
        int measuredWidth2 = m3g.getMeasuredWidth() + z74.getMeasuredWidth();
        if (lazy.isInitialized()) {
            i4 = ((View) lazy.getValue()).getMeasuredWidth();
        }
        int maxOf = ComparisonsKt.maxOf(i5, measuredWidth, measuredWidth2, i4);
        int measuredHeight = s87.getMeasuredHeight() + i3;
        w4g w4g = this.o;
        if (y7e.L((Lazy) w4g.c)) {
            w4g.T(View.MeasureSpec.makeMeasureSpec(maxOf, 1073741824), View.MeasureSpec.makeMeasureSpec(s87.getMeasuredHeight(), 1073741824));
        }
        krc krc = this.a;
        if (y7e.L((Lazy) krc.c)) {
            krc.T(View.MeasureSpec.makeMeasureSpec(size, IntCompanionObject.MIN_VALUE), i2);
            maxOf = Math.max(maxOf, krc.L());
            int b2 = g63.b((float) 8, vo4.c().getDisplayMetrics().density, krc.K() + MathKt.roundToInt(((float) 10) * vo4.c().getDisplayMetrics().density));
            measuredHeight += b2;
            ((r89) getBackground()).x = (float) b2;
        } else {
            ((r89) getBackground()).x = c44.DEFAULT_ASPECT_RATIO;
        }
        setMeasuredDimension(maxOf, measuredHeight);
    }

    public final void q(boolean z2) {
        this.a.q(z2);
    }

    public final boolean r() {
        return this.o.r();
    }

    public void setAlias(Layout layout) {
        this.v.setAlias(layout);
    }

    public void setAliasColor(int i) {
        this.v.setAliasColor(i);
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

    public void setSenderName(Layout layout) {
        this.w.e(layout);
    }

    public void setSenderNameColor(int i) {
        this.w.f(i);
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
