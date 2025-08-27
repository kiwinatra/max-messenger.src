package defpackage;

import android.content.Context;
import android.graphics.PointF;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.WindowManager;
import android.widget.FrameLayout;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.jvm.functions.Function0;
import kotlin.math.MathKt;
import kotlin.properties.Delegates;
import kotlin.reflect.KProperty;

/* renamed from: rf1  reason: default package */
public final class rf1 extends FrameLayout {
    public static final /* synthetic */ KProperty[] v0;
    public final Lazy a = LazyKt.lazy(LazyThreadSafetyMode.NONE, new v11(18));
    public final Lazy b;
    public final Lazy c;
    public anb o;
    public final PointF v;
    public final qf1 w;
    public final qf1 x;
    public pf1 y;
    public final qf1 z;

    static {
        Class<rf1> cls = rf1.class;
        v0 = new KProperty[]{rae.s(cls, "boundariesOffset", "getBoundariesOffset()Lone/me/calls/ui/ui/pip/fake/boundaries/PipBoundariesOffset;", 0), rae.s(cls, "pipTheme", "getPipTheme()Lone/me/sdk/design/OneMeTheme;", 0), rae.s(cls, "pipMode", "getPipMode()Lone/me/calls/ui/view/pip/CallPipView$Companion$PipMode;", 0)};
    }

    public rf1(Context context) {
        super(context, (AttributeSet) null);
        this.b = LazyKt.lazy(new s2(13, (Object) context, (Object) this));
        this.c = oh1.a.c();
        this.o = ymb.a;
        this.v = new PointF();
        Delegates delegates = Delegates.INSTANCE;
        this.w = new qf1(new nmb(0, 0), this);
        this.x = new qf1(this, 0);
        of1 of1 = of1.a;
        this.z = new qf1(this, 1);
        setLayoutParams(new FrameLayout.LayoutParams(MathKt.roundToInt(((float) 118) * vo4.c().getDisplayMetrics().density), MathKt.roundToInt(((float) 174) * vo4.c().getDisplayMetrics().density)));
        addView(getFakePipView());
    }

    /* access modifiers changed from: private */
    public final gn1 getFakePipView() {
        return (gn1) this.b.getValue();
    }

    private final int getFlag() {
        return ((Number) this.a.getValue()).intValue();
    }

    /* access modifiers changed from: private */
    public final b91 getPipPositionMediator() {
        return (b91) this.c.getValue();
    }

    public final void c(int i, int i2, int i3, int i4) {
        float f = (float) i;
        float f2 = (float) i2;
        this.o.i(f, f2, i3 - i, i4 - i2, getBoundariesOffset());
        PointF pointF = this.v;
        if (!(!(pointF.x == c44.DEFAULT_ASPECT_RATIO || pointF.y == c44.DEFAULT_ASPECT_RATIO))) {
            pointF = null;
        }
        if (pointF != null) {
            this.o.d(pointF.x - f, pointF.y - f2);
        }
    }

    public final void d(v4b v4b) {
        gn1 fakePipView = getFakePipView();
        CharSequence charSequence = v4b.j;
        KProperty[] kPropertyArr = gn1.i1;
        fakePipView.T(charSequence, (String) null);
        fakePipView.setAvatar(v4b.a);
        fakePipView.setButtonAction(v4b.h);
        fakePipView.R(v4b.d);
        fakePipView.Q(v4b.f);
        fakePipView.setOpponentVideo(v4b.g);
    }

    public final pf1 getApplicationPipDepended() {
        return this.y;
    }

    public final nmb getBoundariesOffset() {
        return (nmb) this.w.getValue(this, v0[0]);
    }

    public final of1 getPipMode() {
        return (of1) this.z.getValue(this, v0[2]);
    }

    public final k2b getPipTheme() {
        return (k2b) this.x.getValue(this, v0[1]);
    }

    public final WindowManager.LayoutParams getWindowsViewLayoutParams() {
        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams(MathKt.roundToInt(((float) 118) * vo4.c().getDisplayMetrics().density), MathKt.roundToInt(((float) 174) * vo4.c().getDisplayMetrics().density), 1000, getFlag(), -3);
        layoutParams.x = 0;
        layoutParams.y = 0;
        layoutParams.gravity = 51;
        return layoutParams;
    }

    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return !this.o.b(motionEvent);
    }

    public final void onLayout(boolean z2, int i, int i2, int i3, int i4) {
        super.onLayout(z2, i, i2, i3, i4);
        c(i, i2, i3, i4);
    }

    public final void setApplicationPipDepended(pf1 pf1) {
        this.y = pf1;
    }

    public final void setBackgroundCorners(float f) {
        getFakePipView().setBackgroundCorners(f);
    }

    public final void setBoundariesOffset(nmb nmb) {
        this.w.setValue(this, v0[0], nmb);
    }

    public final void setListener(dn1 dn1) {
        gn1 fakePipView = getFakePipView();
        fakePipView.e1 = ze1.c;
        fakePipView.Z0 = dn1;
    }

    public final void setPipMode(of1 of1) {
        this.z.setValue(this, v0[2], of1);
    }

    public final void setPipTheme(k2b k2b) {
        this.x.setValue(this, v0[1], k2b);
    }

    public final void setStartPosition(PointF pointF) {
        if (pointF != null) {
            float f = pointF.x;
            float f2 = pointF.y;
            PointF pointF2 = this.v;
            pointF2.x = f;
            pointF2.y = f2;
        }
        c(getLeft(), getTop(), getRight(), getBottom());
    }

    public final void setVideoLayoutUpdatesControllerProvider(Function0<p6g> function0) {
        getFakePipView().setVideoLayoutUpdatesControllerProvider(function0);
    }
}
