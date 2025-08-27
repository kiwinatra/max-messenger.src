package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Looper;
import android.view.MotionEvent;
import android.view.View;
import kotlin.Lazy;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.IntCompanionObject;
import kotlin.math.MathKt;

/* renamed from: b53  reason: default package */
public final class b53 extends vff implements k43 {
    public final q43 y0;
    public final int z0 = MathKt.roundToInt(((float) 4) * vo4.c().getDisplayMetrics().density);

    public b53(Context context) {
        super(context);
        this.y0 = new q43(context, this);
        getDate$message_list_release().setBackgroundEnabled(true);
        setTransitionGroup(true);
    }

    public final void c(o43 o43) {
        float[] fArr = o43.a;
        q43 q43 = this.y0;
        q43.h = fArr;
        q43.f.setValue(q43, q43.k[0], o43.b);
        requestLayout();
        invalidate();
    }

    public final void f(MotionEvent motionEvent, int[] iArr) {
        this.y0.e(iArr, MathKt.roundToInt(motionEvent.getX()), MathKt.roundToInt(motionEvent.getY()));
    }

    public final void invalidateDrawable(Drawable drawable) {
        if (Looper.getMainLooper().isCurrentThread()) {
            super.invalidateDrawable(drawable);
            return;
        }
        Handler handler = getHandler();
        if (handler != null) {
            handler.postAtFrontOfQueue(new x43(this, drawable, 0));
        } else {
            post(new y43(this, drawable, 0));
        }
    }

    public final void onDraw(Canvas canvas) {
        Path a = ((r89) getBackground()).a();
        int save = canvas.save();
        canvas.clipPath(a);
        try {
            dispatchDraw(canvas);
            q43 q43 = this.y0;
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
        this.y0.e.p();
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
        this.y0.b(getContentTopPadding$message_list_release() + getMessageTextView$message_list_release().getBottom());
        int e = y7e.L((Lazy) getReactionsDelegate().c) ? a81.e((float) 10, vo4.c().getDisplayMetrics().density, a81.e((float) 8, vo4.c().getDisplayMetrics().density, getMeasuredHeight() - getReactionsDelegate().K())) : getMeasuredHeight();
        if (y7e.L((Lazy) getReactionsDelegate().c)) {
            getReactionsDelegate().S(getReactionsDelegate().y ? getMeasuredWidth() - getReactionsDelegate().L() : 0, MathKt.roundToInt(((float) 10) * vo4.c().getDisplayMetrics().density) + e);
        }
        ev0.x(getDate$message_list_release(), (getMeasuredWidth() - getDate$message_list_release().getMeasuredWidth()) - this.z0, (e - getDate$message_list_release().getMeasuredHeight()) - getStatusBottomMargin$message_list_release(), 0, 12);
    }

    public final void onMeasure(int i, int i2) {
        float f = (float) 10;
        int f2 = a81.f(f, vo4.c().getDisplayMetrics().density, 2, View.MeasureSpec.getSize(i));
        getMessageTextView$message_list_release().d();
        int max = Math.max(getDependOnOutsideView() ? View.MeasureSpec.getSize(i) : Math.max(getSuggestedMinimumWidth(), f2), (getContentHorizontalPadding$message_list_release() * 2) + getMessageTextView$message_list_release().getMeasuredWidth());
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
            contentTopPadding$message_list_release += getContentTopPadding$message_list_release() + getMessageLinkDelegate().K();
        }
        getDate$message_list_release().measure(i, i2);
        q43 q43 = this.y0;
        q43.c(max);
        int max2 = Math.max(max, q43.c);
        int i3 = contentTopPadding$message_list_release + q43.d;
        if (y7e.L((Lazy) getReactionsDelegate().c)) {
            getReactionsDelegate().T(View.MeasureSpec.makeMeasureSpec(f2, IntCompanionObject.MIN_VALUE), i2);
            max2 = Math.max(max2, getReactionsDelegate().L());
            int contentTopPadding$message_list_release2 = getContentTopPadding$message_list_release() + getReactionsDelegate().K() + MathKt.roundToInt(f * vo4.c().getDisplayMetrics().density);
            i3 += contentTopPadding$message_list_release2;
            ((r89) getBackground()).x = (float) contentTopPadding$message_list_release2;
        } else {
            ((r89) getBackground()).x = c44.DEFAULT_ASPECT_RATIO;
        }
        setMeasuredDimension(max2, i3);
    }

    public final void onStartTemporaryDetach() {
        super.onStartTemporaryDetach();
        this.y0.e.q();
    }

    public final l43 p(MotionEvent motionEvent) {
        return this.y0.a(MathKt.roundToInt(motionEvent.getX()), MathKt.roundToInt(motionEvent.getY()));
    }

    public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
        if (Looper.getMainLooper().isCurrentThread()) {
            super.scheduleDrawable(drawable, runnable, j);
            return;
        }
        Handler handler = getHandler();
        if (handler != null) {
            handler.postAtFrontOfQueue(new z43(this, drawable, runnable, j, 0));
            return;
        }
        post(new z43(this, drawable, runnable, j, 1));
    }

    public void setOnFinalImageSetCallback(Function1<? super String, Unit> function1) {
        this.y0.g = function1;
    }

    public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        if (Looper.getMainLooper().isCurrentThread()) {
            super.unscheduleDrawable(drawable, runnable);
            return;
        }
        Handler handler = getHandler();
        if (handler != null) {
            handler.postAtFrontOfQueue(new a53(this, drawable, runnable, 0));
        } else {
            post(new a53(this, drawable, runnable, 1));
        }
    }

    public final boolean verifyDrawable(Drawable drawable) {
        return this.y0.g(drawable) || super.verifyDrawable(drawable);
    }

    public final void unscheduleDrawable(Drawable drawable) {
        if (Looper.getMainLooper().isCurrentThread()) {
            super.unscheduleDrawable(drawable);
            return;
        }
        Handler handler = getHandler();
        if (handler != null) {
            handler.postAtFrontOfQueue(new x43(this, drawable, 1));
        } else {
            post(new y43(this, drawable, 1));
        }
    }
}
