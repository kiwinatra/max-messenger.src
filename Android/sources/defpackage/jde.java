package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Path;
import android.net.Uri;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Unit;
import kotlin.comparisons.ComparisonsKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.IntCompanionObject;
import kotlin.jvm.internal.Intrinsics;
import kotlin.math.MathKt;
import kotlin.properties.Delegates;
import kotlin.reflect.KProperty;
import kotlin.time.Duration;

/* renamed from: jde  reason: default package */
public final class jde extends vff implements fde, i9g {
    public static final /* synthetic */ KProperty[] J0 = {rae.s(jde.class, "model", "getModel()Lone/me/messages/list/loader/model/SingleVideoAttach;", 0)};
    public final s87 A0;
    public final m3g B0;
    public final Lazy C0;
    public final int D0;
    public final int E0;
    public final int F0;
    public final bl G0 = new bl(26, this);
    public p50 H0;
    public pm7 I0;
    public final w4g y0;
    public final cob z0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public jde(Context context) {
        super(context);
        w4g w4g = new w4g();
        this.y0 = w4g;
        cob cob = new cob(context);
        this.z0 = cob;
        s87 s87 = new s87(context);
        s87.setOverlayDrawable(cob);
        this.A0 = s87;
        m3g m3g = new m3g(context);
        m3g.setBackgroundEnabled(true);
        this.B0 = m3g;
        this.C0 = LazyKt.lazy(LazyThreadSafetyMode.NONE, new a1b(context, 26));
        float f = (float) 4;
        this.D0 = MathKt.roundToInt(vo4.c().getDisplayMetrics().density * f);
        this.E0 = MathKt.roundToInt(vo4.c().getDisplayMetrics().density * f);
        this.F0 = MathKt.roundToInt(f * vo4.c().getDisplayMetrics().density);
        Delegates delegates = Delegates.INSTANCE;
        w4g.b = this;
        getDate$message_list_release().setBackgroundEnabled(true);
        addView(s87, new ViewGroup.LayoutParams(-1, -1));
        addView(m3g, new ViewGroup.LayoutParams(-2, -2));
        setTransitionGroup(true);
    }

    private final ede getModel() {
        return (ede) this.G0.getValue(this, J0[0]);
    }

    private final m3g getTransferStatusView() {
        return (m3g) this.C0.getValue();
    }

    public static final void s(jde jde, f00 f00) {
        ede model = jde.getModel();
        Long l = null;
        Long valueOf = model != null ? Long.valueOf(model.a) : null;
        if (f00 != null) {
            l = Long.valueOf(f00.a());
        }
        if (Intrinsics.areEqual((Object) valueOf, (Object) l)) {
            if ((f00 instanceof b00) || (f00 instanceof e00)) {
                f6e.b(jde, jde.getTransferStatusView(), new ViewGroup.LayoutParams(-2, -2));
                jde.getTransferStatusView().setVisibility(0);
                m3g transferStatusView = jde.getTransferStatusView();
                CharSequence a = f00.b().a(jde.getContext());
                if (a == null) {
                    a = "";
                }
                transferStatusView.setContent(a);
                return;
            }
            Lazy lazy = jde.C0;
            if (lazy.isInitialized()) {
                ((m3g) lazy.getValue()).setVisibility(8);
            }
        }
    }

    private final void setModel(ede ede) {
        this.G0.setValue(this, J0[0], ede);
    }

    public static final void t(jde jde) {
        jde jde2 = jde;
        ede model = jde.getModel();
        if (model != null) {
            b3g b3g = model.c;
            ede ede = model;
            p87 p87 = r2;
            p87 p872 = new p87(0, b3g.b, b3g.c, b3g.d, false, b3g.e, b3g.h, b3g.i, false, (String) null, (Uri) null, 3328);
            jde2.A0.setImageAttach(p87);
            long r1 = Duration.m1371getInWholeMillisecondsimpl(b3g.f);
            String[] strArr = ghf.c;
            jde2.B0.setContent(b0h.c(r1));
            ome ome = ede.d;
            if (!(ome.getValue() instanceof b00) && !(ome.getValue() instanceof e00)) {
                Lazy lazy = jde2.C0;
                if (lazy.isInitialized()) {
                    ((m3g) lazy.getValue()).setVisibility(8);
                }
            }
            jde.requestLayout();
            jde.invalidate();
        }
    }

    public final void a() {
        this.y0.a();
    }

    /* JADX INFO: finally extract failed */
    public final boolean drawChild(Canvas canvas, View view, long j) {
        if (view != this.A0) {
            return super.drawChild(canvas, view, j);
        }
        Path a = ((r89) getBackground()).a();
        int save = canvas.save();
        canvas.clipPath(a);
        try {
            super.drawChild(canvas, view, j);
            canvas.restoreToCount(save);
            return true;
        } catch (Throwable th) {
            canvas.restoreToCount(save);
            throw th;
        }
    }

    public View getPreviewView() {
        return this.A0;
    }

    public final boolean i(MotionEvent motionEvent) {
        return rcg.c(this.A0, this).contains((int) motionEvent.getX(), (int) motionEvent.getY());
    }

    public final void j(ede ede) {
        setModel(ede);
    }

    public final boolean k() {
        return this.y0.k();
    }

    public final void m(f9g f9g, t87 t87, long j, boolean z) {
        this.y0.m(f9g, t87, j, z);
    }

    public final boolean o() {
        return y7e.L((Lazy) this.y0.c);
    }

    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5;
        int contentHorizontalPadding$message_list_release = getContentHorizontalPadding$message_list_release();
        int contentTopPadding$message_list_release = getContentTopPadding$message_list_release();
        if (y7e.L(getSenderNameViewStub$message_list_release().b)) {
            int a = getSenderNameViewStub$message_list_release().a() + contentTopPadding$message_list_release;
            getSenderNameViewStub$message_list_release().c(contentHorizontalPadding$message_list_release, contentTopPadding$message_list_release);
            contentTopPadding$message_list_release = getSenderBottomMargin$message_list_release() + a;
        }
        if (y7e.L((Lazy) getSenderAliasDelegate().c) && y7e.L(getSenderNameViewStub$message_list_release().b)) {
            getSenderAliasDelegate().S((getMeasuredWidth() - contentHorizontalPadding$message_list_release) - getSenderAliasDelegate().L(), getContentTopPadding$message_list_release() + ((getSenderNameViewStub$message_list_release().a() / 2) - (getSenderAliasDelegate().K() / 2)));
        }
        if (y7e.L((Lazy) getMessageLinkDelegate().c)) {
            getMessageLinkDelegate().S(contentHorizontalPadding$message_list_release, contentTopPadding$message_list_release);
            contentTopPadding$message_list_release += getMessageLinkDelegate().K();
        }
        s87 s87 = this.A0;
        int i6 = 0;
        s87.layout(0, contentTopPadding$message_list_release, s87.getMeasuredWidth(), s87.getMeasuredHeight());
        ev0.x(getMessageTextView$message_list_release(), contentHorizontalPadding$message_list_release, contentTopPadding$message_list_release, 0, 12);
        int bottom = getMessageTextView$message_list_release().getBottom();
        if (s87.getMeasuredLayoutHeight() == s87.getMeasuredHeight()) {
            bottom += getContentTopPadding$message_list_release();
        }
        int measuredLayoutHeight = ((s87.getMeasuredLayoutHeight() - s87.getMeasuredHeight()) / 2) + bottom;
        int measuredWidth = (getMeasuredWidth() - s87.getMeasuredWidth()) / 2;
        s87.layout(measuredWidth, measuredLayoutHeight, s87.getMeasuredWidth() + measuredWidth, s87.getMeasuredHeight() + measuredLayoutHeight);
        w4g w4g = this.y0;
        if (y7e.L((Lazy) w4g.c)) {
            w4g.S(measuredWidth, measuredLayoutHeight);
        }
        Lazy lazy = this.C0;
        boolean isInitialized = lazy.isInitialized();
        int i7 = this.F0;
        int i8 = this.E0;
        if (isInitialized) {
            ev0.x((m3g) lazy.getValue(), i7, s87.getTop() + i8, 0, 12);
        }
        if (y7e.L((Lazy) getReactionsDelegate().c)) {
            i5 = a81.e((float) 10, vo4.c().getDisplayMetrics().density, a81.e((float) 8, vo4.c().getDisplayMetrics().density, getMeasuredHeight() - getReactionsDelegate().K()));
        } else {
            i5 = getMeasuredHeight();
        }
        ev0.x(getDate$message_list_release(), (getMeasuredWidth() - getDate$message_list_release().getMeasuredWidth()) - this.D0, (i5 - getDate$message_list_release().getMeasuredHeight()) - getStatusBottomMargin$message_list_release(), 0, 12);
        m3g m3g = this.B0;
        ev0.x(m3g, i7, (i5 - m3g.getMeasuredHeight()) - i8, 0, 12);
        if (y7e.L((Lazy) getReactionsDelegate().c)) {
            int b = g63.b((float) 10, vo4.c().getDisplayMetrics().density, i5);
            krc reactionsDelegate = getReactionsDelegate();
            if (getReactionsDelegate().y) {
                i6 = getMeasuredWidth() - getReactionsDelegate().L();
            }
            reactionsDelegate.S(i6, b);
        }
    }

    public final void onMeasure(int i, int i2) {
        float f = (float) 10;
        int f2 = a81.f(f, vo4.c().getDisplayMetrics().density, 2, View.MeasureSpec.getSize(i));
        getMessageTextView$message_list_release().d();
        int size = getDependOnOutsideView() ? View.MeasureSpec.getSize(i) : Math.max(getContentHorizontalPadding$message_list_release() + getSuggestedMinimumWidth(), (getContentHorizontalPadding$message_list_release() * 2) + getMessageTextView$message_list_release().getMeasuredWidth());
        int contentTopPadding$message_list_release = getContentTopPadding$message_list_release() + getMessageTextView$message_list_release().getMeasuredHeight();
        if (y7e.L((Lazy) getSenderAliasDelegate().c) && y7e.L(getSenderNameViewStub$message_list_release().b)) {
            getSenderAliasDelegate().T(View.MeasureSpec.makeMeasureSpec(f2, IntCompanionObject.MIN_VALUE), i2);
            size = Math.max(size, getSenderAliasDelegate().L());
        }
        if (y7e.L(getSenderNameViewStub$message_list_release().b)) {
            getSenderNameViewStub$message_list_release().d(View.MeasureSpec.makeMeasureSpec(f2, IntCompanionObject.MIN_VALUE), i2);
            size = Math.max(size, (getContentHorizontalPadding$message_list_release() * 2) + getSenderNameViewStub$message_list_release().b() + getSenderAliasDelegate().g0());
            contentTopPadding$message_list_release += getSenderBottomMargin$message_list_release() + getSenderNameViewStub$message_list_release().a();
        }
        if (y7e.L((Lazy) getMessageLinkDelegate().c)) {
            getMessageLinkDelegate().T(View.MeasureSpec.makeMeasureSpec(f2, IntCompanionObject.MIN_VALUE), i2);
            size = Math.max(size, (getContentHorizontalPadding$message_list_release() * 2) + getMessageLinkDelegate().L());
            contentTopPadding$message_list_release += getMessageLinkDelegate().K();
        }
        getDate$message_list_release().measure(i, i2);
        m3g m3g = this.B0;
        m3g.measure(i, i2);
        Lazy lazy = this.C0;
        if (lazy.isInitialized()) {
            ((m3g) lazy.getValue()).measure(i, i2);
        }
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(f2, 1073741824);
        s87 s87 = this.A0;
        s87.measure(makeMeasureSpec, i2);
        int i3 = 0;
        int maxOf = ComparisonsKt.maxOf(size, s87.getMeasuredWidth(), m3g.getMeasuredWidth() + getDate$message_list_release().getMeasuredWidth(), lazy.isInitialized() ? ((View) lazy.getValue()).getMeasuredWidth() : 0);
        int max = Math.max(s87.getMeasuredHeight(), Math.max(getDate$message_list_release().getMeasuredHeight(), m3g.getMeasuredHeight()));
        if (s87.getMeasuredLayoutHeight() == s87.getMeasuredHeight()) {
            i3 = getContentTopPadding$message_list_release();
        }
        int i4 = max + i3 + contentTopPadding$message_list_release;
        w4g w4g = this.y0;
        if (y7e.L((Lazy) w4g.c)) {
            w4g.T(View.MeasureSpec.makeMeasureSpec(maxOf, 1073741824), View.MeasureSpec.makeMeasureSpec(s87.getMeasuredHeight(), 1073741824));
        }
        if (y7e.L((Lazy) getReactionsDelegate().c)) {
            getReactionsDelegate().T(View.MeasureSpec.makeMeasureSpec(f2, IntCompanionObject.MIN_VALUE), i2);
            maxOf = Math.max(maxOf, getReactionsDelegate().L());
            int b = g63.b((float) 8, vo4.c().getDisplayMetrics().density, getReactionsDelegate().K() + MathKt.roundToInt(f * vo4.c().getDisplayMetrics().density));
            i4 += b;
            ((r89) getBackground()).x = (float) b;
        } else {
            ((r89) getBackground()).x = c44.DEFAULT_ASPECT_RATIO;
        }
        setMeasuredDimension(maxOf, i4);
    }

    public final boolean r() {
        return this.y0.r();
    }

    public void setVideoClickListener(Function2<? super o00, ? super Long, Unit> function2) {
        this.y0.v = function2;
    }

    public void setVideoLongClickListener(Function2<? super Long, ? super View, Unit> function2) {
        this.y0.w = function2;
    }

    public final void u(ede ede) {
        p50 p50;
        setModel(ede);
        this.H0 = new p50(9, this, ede);
        if (isAttachedToWindow() && (p50 = this.H0) != null) {
            p50.onViewAttachedToWindow(this);
        }
        addOnAttachStateChangeListener(this.H0);
    }
}
