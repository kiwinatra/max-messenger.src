package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Path;
import android.view.MotionEvent;
import android.view.View;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.IntCompanionObject;
import kotlin.math.MathKt;
import one.me.sdk.uikit.common.views.OneMeDraweeView;

/* renamed from: bce  reason: default package */
public final class bce extends vff implements zbe, i9g {
    public final int A0 = MathKt.roundToInt(((float) 4) * vo4.c().getDisplayMetrics().density);
    public final OneMeDraweeView B0;
    public boolean C0;
    public final Lazy D0;
    public final w4g y0;
    public final s87 z0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public bce(Context context) {
        super(context);
        w4g w4g = new w4g();
        this.y0 = w4g;
        s87 s87 = new s87(context);
        this.z0 = s87;
        OneMeDraweeView oneMeDraweeView = new OneMeDraweeView(context);
        this.B0 = oneMeDraweeView;
        this.D0 = LazyKt.lazy(LazyThreadSafetyMode.NONE, new a1b(context, 24));
        w4g.b = this;
        getDate$message_list_release().setBackgroundEnabled(true);
        addView(oneMeDraweeView, -1, -2);
        addView(s87, -1, -2);
        setTransitionGroup(true);
        oneMeDraweeView.setupNewController(true);
    }

    private final cq0 getBlurPostProcessor() {
        return (cq0) this.D0.getValue();
    }

    public final void a() {
        this.y0.a();
    }

    public final void b(p87 p87) {
        this.z0.setImageAttach(p87);
        ra7 d = ra7.d(p87.b);
        d.d = p87.h;
        d.l = getBlurPostProcessor();
        qa7 a = d.a();
        OneMeDraweeView oneMeDraweeView = this.B0;
        oneMeDraweeView.o(a, (qa7) null);
        ((sp6) oneMeDraweeView.getHierarchy()).h(p87.i);
        requestLayout();
        invalidate();
    }

    /* JADX INFO: finally extract failed */
    public final boolean drawChild(Canvas canvas, View view, long j) {
        OneMeDraweeView oneMeDraweeView = this.B0;
        if (view == oneMeDraweeView && !this.C0) {
            return false;
        }
        if (view != this.z0 && view != oneMeDraweeView) {
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
        return this.z0;
    }

    public final boolean i(MotionEvent motionEvent) {
        int x = (int) motionEvent.getX();
        int y = (int) motionEvent.getY();
        if (rcg.c(this.z0, this).contains(x, y)) {
            return true;
        }
        return rcg.c(this.B0, this).contains(x, y);
    }

    public final boolean k() {
        return this.z0.getImageAttach().e;
    }

    public final void m(f9g f9g, t87 t87, long j, boolean z) {
        this.y0.m(f9g, t87, j, z);
    }

    public final boolean o() {
        return y7e.L((Lazy) this.y0.c);
    }

    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
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
        iq.K(getMessageTextView$message_list_release(), contentHorizontalPadding$message_list_release, contentTopPadding$message_list_release, getMessageTextView$message_list_release().getMeasuredWidth() + contentHorizontalPadding$message_list_release, getMessageTextView$message_list_release().getMeasuredHeight() + contentTopPadding$message_list_release);
        int bottom = getMessageTextView$message_list_release().getBottom();
        s87 s87 = this.z0;
        if (s87.getMeasuredLayoutHeight() == s87.getMeasuredHeight()) {
            bottom += getContentTopPadding$message_list_release();
        }
        if (this.C0) {
            OneMeDraweeView oneMeDraweeView = this.B0;
            oneMeDraweeView.layout(0, bottom, oneMeDraweeView.getMeasuredWidth(), oneMeDraweeView.getMeasuredHeight() + bottom);
        }
        int measuredLayoutHeight = ((s87.getMeasuredLayoutHeight() - s87.getMeasuredHeight()) / 2) + bottom;
        int measuredWidth = (getMeasuredWidth() - s87.getMeasuredWidth()) / 2;
        s87.layout(measuredWidth, measuredLayoutHeight, s87.getMeasuredWidth() + measuredWidth, s87.getMeasuredHeight() + measuredLayoutHeight);
        w4g w4g = this.y0;
        if (y7e.L((Lazy) w4g.c)) {
            w4g.S(measuredWidth, measuredLayoutHeight);
        }
        if (y7e.L((Lazy) getReactionsDelegate().c)) {
            getReactionsDelegate().S(getReactionsDelegate().y ? getMeasuredWidth() - getReactionsDelegate().L() : 0, MathKt.roundToInt(((float) 10) * vo4.c().getDisplayMetrics().density) + (getMeasuredHeight() - ((int) ((r89) getBackground()).x)));
        }
        ev0.x(getDate$message_list_release(), (getMeasuredWidth() - getDate$message_list_release().getMeasuredWidth()) - this.A0, ((getMeasuredHeight() - ((int) ((r89) getBackground()).x)) - getDate$message_list_release().getMeasuredHeight()) - getStatusBottomMargin$message_list_release(), 0, 12);
    }

    public final void onMeasure(int i, int i2) {
        float f = (float) 10;
        int f2 = a81.f(f, vo4.c().getDisplayMetrics().density, 2, View.MeasureSpec.getSize(i));
        int size = View.MeasureSpec.getSize(i);
        getMessageTextView$message_list_release().d();
        int max = Math.max(getDependOnOutsideView() ? size : getContentHorizontalPadding$message_list_release() + getSuggestedMinimumWidth(), (getContentHorizontalPadding$message_list_release() * 2) + getMessageTextView$message_list_release().getMeasuredWidth());
        int contentTopPadding$message_list_release = getContentTopPadding$message_list_release() + getMessageTextView$message_list_release().getMeasuredHeight();
        if (y7e.L((Lazy) getSenderAliasDelegate().c) && y7e.L(getSenderNameViewStub$message_list_release().b)) {
            getSenderAliasDelegate().T(View.MeasureSpec.makeMeasureSpec(f2, IntCompanionObject.MIN_VALUE), i2);
            max = Math.max(max, getSenderAliasDelegate().L());
        }
        if (y7e.L(getSenderNameViewStub$message_list_release().b)) {
            getSenderNameViewStub$message_list_release().d(View.MeasureSpec.makeMeasureSpec(f2, IntCompanionObject.MIN_VALUE), i2);
            max = Math.max(max, (getContentHorizontalPadding$message_list_release() * 2) + getSenderNameViewStub$message_list_release().b() + getSenderAliasDelegate().g0());
            contentTopPadding$message_list_release += getSenderBottomMargin$message_list_release() + getSenderNameViewStub$message_list_release().a();
        }
        if (y7e.L((Lazy) getMessageLinkDelegate().c)) {
            getMessageLinkDelegate().T(View.MeasureSpec.makeMeasureSpec(f2, IntCompanionObject.MIN_VALUE), i2);
            max = Math.max(max, (getContentHorizontalPadding$message_list_release() * 2) + getMessageLinkDelegate().L());
            contentTopPadding$message_list_release += getMessageLinkDelegate().K();
        }
        getDate$message_list_release().measure(i, i2);
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(size, 1073741824);
        s87 s87 = this.z0;
        s87.measure(makeMeasureSpec, i2);
        int max2 = Math.max(max, s87.getMeasuredLayoutWidth());
        boolean z = false;
        int measuredLayoutHeight = s87.getMeasuredLayoutHeight() + (s87.getMeasuredLayoutHeight() == s87.getMeasuredLayoutHeight() ? getContentTopPadding$message_list_release() : 0) + contentTopPadding$message_list_release;
        w4g w4g = this.y0;
        if (y7e.L((Lazy) w4g.c)) {
            w4g.T(View.MeasureSpec.makeMeasureSpec(s87.getMeasuredLayoutWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(s87.getMeasuredHeight(), 1073741824));
        }
        if (!(max2 == s87.getMeasuredWidth() && s87.getMeasuredLayoutHeight() == s87.getMeasuredHeight())) {
            z = true;
        }
        this.C0 = z;
        if (z) {
            this.B0.measure(View.MeasureSpec.makeMeasureSpec(max2, 1073741824), View.MeasureSpec.makeMeasureSpec(measuredLayoutHeight, 1073741824));
        }
        if (y7e.L((Lazy) getReactionsDelegate().c)) {
            getReactionsDelegate().T(View.MeasureSpec.makeMeasureSpec(f2, IntCompanionObject.MIN_VALUE), i2);
            max2 = Math.max(max2, getReactionsDelegate().L());
            int b = g63.b((float) 8, vo4.c().getDisplayMetrics().density, getReactionsDelegate().K() + MathKt.roundToInt(f * vo4.c().getDisplayMetrics().density));
            measuredLayoutHeight += b;
            ((r89) getBackground()).x = (float) b;
        } else {
            ((r89) getBackground()).x = c44.DEFAULT_ASPECT_RATIO;
        }
        setMeasuredDimension(max2, measuredLayoutHeight);
    }

    public final boolean r() {
        return this.y0.r();
    }

    public void setDateTextColor(int i) {
        getDate$message_list_release().setTextColor(i);
    }

    public void setVideoClickListener(Function2<? super o00, ? super Long, Unit> function2) {
        this.y0.v = function2;
    }

    public void setVideoLongClickListener(Function2<? super Long, ? super View, Unit> function2) {
        this.y0.w = function2;
    }
}
