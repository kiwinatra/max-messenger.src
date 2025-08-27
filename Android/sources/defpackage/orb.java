package defpackage;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import java.util.WeakHashMap;
import kotlin.KotlinVersion;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.ranges.RangesKt;

/* renamed from: orb  reason: default package */
public class orb extends FrameLayout {
    public static final /* synthetic */ int z = 0;
    public frb a;
    public lrb b = lrb.a;
    public boolean c = true;
    public boolean o;
    public ValueAnimator v;
    public final kag w = new kag(getContext(), this, new mrb(this, 1));
    public final Lazy x = LazyKt.lazy(LazyThreadSafetyMode.NONE, new zqb(this, 2));
    public int y = -1;

    public orb(Context context) {
        super(context, (AttributeSet) null);
        ct.G(this, 300, new u99(17, (Object) this));
    }

    public static Unit a(orb orb, float f) {
        orb.setBackgroundAlpha(f);
        return Unit.INSTANCE;
    }

    public static Unit b(orb orb, float f) {
        orb.setBackgroundAlpha(f);
        return Unit.INSTANCE;
    }

    public static Unit c(orb orb, float f, float f2) {
        if (f2 != c44.DEFAULT_ASPECT_RATIO) {
            f2 = ((float) 1) - f2;
        }
        if (f > f2) {
            orb.setBackgroundAlpha(((float) 1) - f);
        }
        return Unit.INSTANCE;
    }

    public static void d(orb orb, Function2 function2, float f, ValueAnimator valueAnimator) {
        frb frb = orb.a;
        if (frb != null) {
            frb.f().offsetTopAndBottom(((Integer) valueAnimator.getAnimatedValue()).intValue() - frb.f().getTop());
            orb.getHalfExpandedViewHelper().a(frb.f().getTop());
            frb.m(frb.f().getTop());
            function2.invoke(Float.valueOf(valueAnimator.getAnimatedFraction()), Float.valueOf(f));
        }
    }

    /* access modifiers changed from: private */
    public final yqb getHalfExpandedViewHelper() {
        return (yqb) this.x.getValue();
    }

    /* access modifiers changed from: private */
    public final int getScrollStateOffset() {
        int ordinal = this.b.ordinal();
        Integer num = null;
        if (ordinal == 0) {
            frb frb = this.a;
            if (frb != null) {
                num = Integer.valueOf(frb.e());
            }
        } else if (ordinal == 1) {
            frb frb2 = this.a;
            if (frb2 != null) {
                num = Integer.valueOf(frb2.c());
            }
        } else if (ordinal == 2) {
            frb frb3 = this.a;
            if (frb3 != null) {
                num = Integer.valueOf(frb3.a());
            }
        } else {
            throw new NoWhenBranchMatchedException();
        }
        if (num != null) {
            return num.intValue();
        }
        return 0;
    }

    private final int getViewDragHeight() {
        View f;
        frb frb = this.a;
        if (frb == null || (f = frb.f()) == null) {
            return 0;
        }
        return f.getHeight();
    }

    public static /* synthetic */ void i(orb orb, int i, zqb zqb, zqb zqb2, Function2 function2, int i2) {
        Function0 function0 = zqb;
        if ((i2 & 2) != 0) {
            function0 = new lgb(21);
        }
        Function0 function02 = zqb2;
        if ((i2 & 4) != 0) {
            function02 = new lgb(20);
        }
        orb.h(i, function0, function02, function2);
    }

    /* access modifiers changed from: private */
    public final void setBackgroundAlpha(float f) {
        Drawable background = getBackground();
        if (background != null) {
            background.setAlpha((int) (RangesKt.coerceIn(f, (float) c44.DEFAULT_ASPECT_RATIO, 1.0f) * ((float) KotlinVersion.MAX_COMPONENT_VALUE)));
        }
    }

    public final void computeScroll() {
        super.computeScroll();
        if (this.w.g()) {
            WeakHashMap weakHashMap = gag.a;
            postInvalidateOnAnimation();
        }
    }

    public final frb getCallback() {
        return this.a;
    }

    public final lrb getScrollState() {
        return this.b;
    }

    public final boolean getStackFromBottom() {
        return this.c;
    }

    public final void h(int i, Function0 function0, Function0 function02, Function2 function2) {
        View f;
        ValueAnimator valueAnimator = this.v;
        float animatedFraction = valueAnimator != null ? valueAnimator.getAnimatedFraction() : c44.DEFAULT_ASPECT_RATIO;
        ValueAnimator valueAnimator2 = this.v;
        if (valueAnimator2 != null) {
            valueAnimator2.removeAllListeners();
            valueAnimator2.cancel();
        }
        frb frb = this.a;
        if (frb != null && (f = frb.f()) != null) {
            ValueAnimator ofInt = ValueAnimator.ofInt(new int[]{f.getTop(), i});
            ofInt.setDuration(200);
            ofInt.addUpdateListener(new rf(this, function2, animatedFraction, 1));
            ofInt.addListener(new drb(function02, this, function0, 1));
            ofInt.start();
            this.v = ofInt;
        }
    }

    public final void j(boolean z2) {
        View f;
        this.b = lrb.a;
        if (getViewDragHeight() > 0) {
            int scrollStateOffset = getScrollStateOffset();
            frb frb = this.a;
            if (frb != null) {
                frb.i();
            }
            if (z2) {
                i(this, scrollStateOffset, new zqb(this, 1), (zqb) null, new brb(this, 1), 4);
            } else {
                frb frb2 = this.a;
                if (!(frb2 == null || (f = frb2.f()) == null)) {
                    f.offsetTopAndBottom(scrollStateOffset);
                }
                frb frb3 = this.a;
                if (frb3 != null) {
                    frb3.h();
                }
                setBackgroundAlpha(c44.DEFAULT_ASPECT_RATIO);
            }
        }
        invalidate();
    }

    public final void k() {
        this.b = lrb.c;
        if (getViewDragHeight() > 0) {
            i(this, getScrollStateOffset(), (zqb) null, new zqb(this, 0), new brb(this, 0), 2);
        }
        invalidate();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0018, code lost:
        if (r0.n(r4.getX(), r4.getY()) == true) goto L_0x001c;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean onInterceptTouchEvent(android.view.MotionEvent r4) {
        /*
            r3 = this;
            int r0 = r4.getAction()
            r1 = 2
            if (r0 != r1) goto L_0x001b
            frb r0 = r3.a
            if (r0 == 0) goto L_0x001b
            float r1 = r4.getX()
            float r2 = r4.getY()
            boolean r0 = r0.n(r1, r2)
            r1 = 1
            if (r0 != r1) goto L_0x001b
            goto L_0x001c
        L_0x001b:
            r1 = 0
        L_0x001c:
            r3.o = r1
            kotlin.Result$Companion r0 = kotlin.Result.Companion     // Catch:{ all -> 0x002f }
            kag r3 = r3.w     // Catch:{ all -> 0x002f }
            boolean r3 = r3.q(r4)     // Catch:{ all -> 0x002f }
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r3)     // Catch:{ all -> 0x002f }
            java.lang.Object r3 = kotlin.Result.m23constructorimpl(r3)     // Catch:{ all -> 0x002f }
            goto L_0x003a
        L_0x002f:
            r3 = move-exception
            kotlin.Result$Companion r4 = kotlin.Result.Companion
            java.lang.Object r3 = kotlin.ResultKt.createFailure(r3)
            java.lang.Object r3 = kotlin.Result.m23constructorimpl(r3)
        L_0x003a:
            java.lang.Throwable r4 = kotlin.Result.m26exceptionOrNullimpl(r3)
            if (r4 == 0) goto L_0x0047
            java.lang.String r0 = "PopupLayout"
            java.lang.String r1 = "onInterceptTouchEvent fail, issue ONEME-9645"
            defpackage.z68.f(r0, r1, r4)
        L_0x0047:
            java.lang.Boolean r4 = java.lang.Boolean.FALSE
            boolean r0 = kotlin.Result.m29isFailureimpl(r3)
            if (r0 == 0) goto L_0x0050
            r3 = r4
        L_0x0050:
            java.lang.Boolean r3 = (java.lang.Boolean) r3
            boolean r3 = r3.booleanValue()
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.orb.onInterceptTouchEvent(android.view.MotionEvent):boolean");
    }

    public final void onLayout(boolean z2, int i, int i2, int i3, int i4) {
        View f;
        frb frb = this.a;
        if (frb != null && (f = frb.f()) != null) {
            int scrollStateOffset = (this.v == null && this.w.a == 0) ? getScrollStateOffset() : f.getTop();
            super.onLayout(z2, i, i2, i3, i4);
            ViewGroup.LayoutParams layoutParams = f.getLayoutParams();
            ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams : null;
            int i5 = scrollStateOffset - (marginLayoutParams != null ? marginLayoutParams.topMargin : 0);
            f.offsetTopAndBottom(i5);
            yqb halfExpandedViewHelper = getHalfExpandedViewHelper();
            halfExpandedViewHelper.b = 0;
            halfExpandedViewHelper.a(i5);
            if (this.y != f.getMeasuredHeight()) {
                this.y = f.getMeasuredHeight();
                if (this.v != null) {
                    int ordinal = this.b.ordinal();
                    if (ordinal == 0) {
                        j(true);
                    } else if (ordinal == 1) {
                        setHalfScreen((Function2<? super Float, ? super Float, Unit>) null);
                    } else if (ordinal == 2) {
                        k();
                    } else {
                        throw new NoWhenBranchMatchedException();
                    }
                }
            }
        }
    }

    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (parcelable instanceof krb) {
            krb krb = (krb) parcelable;
            super.onRestoreInstanceState(krb.getSuperState());
            lrb lrb = (lrb) lrb.v.get(krb.a);
            this.b = lrb;
            this.c = krb.b;
            int ordinal = lrb.ordinal();
            if (ordinal == 0) {
                j(false);
            } else if (ordinal == 1) {
                setHalfScreen((Function2<? super Float, ? super Float, Unit>) null);
            } else if (ordinal == 2) {
                k();
            } else {
                throw new NoWhenBranchMatchedException();
            }
        } else {
            super.onRestoreInstanceState(parcelable);
        }
    }

    public final Parcelable onSaveInstanceState() {
        return new krb(super.onSaveInstanceState(), this.b.ordinal(), this.c);
    }

    public final boolean onTouchEvent(MotionEvent motionEvent) {
        Boolean bool;
        kag kag = this.w;
        if (kag.r == null) {
            super.onTouchEvent(motionEvent);
        }
        this.o = true;
        try {
            Result.Companion companion = Result.Companion;
            kag.k(motionEvent);
            bool = Result.m23constructorimpl(Boolean.TRUE);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            bool = Result.m23constructorimpl(ResultKt.createFailure(th));
        }
        Throwable r3 = Result.m26exceptionOrNullimpl(bool);
        if (r3 != null) {
            z68.f("PopupLayout", "onTouchEvent fail, issue ONEME-9645", r3);
        }
        Boolean bool2 = Boolean.FALSE;
        if (Result.m29isFailureimpl(bool)) {
            bool = bool2;
        }
        return ((Boolean) bool).booleanValue();
    }

    public final void requestDisallowInterceptTouchEvent(boolean z2) {
        kag kag = this.w;
        int i = kag.a;
        if (i != 2 && i != 1) {
            kag.a();
            super.requestDisallowInterceptTouchEvent(z2);
        }
    }

    public void setBackground(Drawable drawable) {
        super.setBackground(drawable);
        if (this.b == lrb.a) {
            setBackgroundAlpha(c44.DEFAULT_ASPECT_RATIO);
        } else {
            setBackgroundAlpha(1.0f);
        }
    }

    public final void setCallback(frb frb) {
        this.a = frb;
    }

    public final void setHalfScreen(Function2<? super Float, ? super Float, Unit> function2) {
        this.b = lrb.b;
        if (getViewDragHeight() > 0) {
            int scrollStateOffset = getScrollStateOffset();
            if (function2 == null) {
                function2 = new brb(this, 2);
            }
            h(scrollStateOffset, new zqb(this, 3), new zqb(this, 4), function2);
        } else if (this.b == lrb.a) {
            setBackgroundAlpha(c44.DEFAULT_ASPECT_RATIO);
        } else {
            setBackgroundAlpha(1.0f);
        }
        invalidate();
    }

    public final void setScrollState(lrb lrb) {
        this.b = lrb;
    }

    public final void setStackFromBottom(boolean z2) {
        this.c = z2;
    }
}
