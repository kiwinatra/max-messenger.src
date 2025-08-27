package defpackage;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewGroup;
import java.util.concurrent.CancellationException;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.math.MathKt;
import kotlin.reflect.KProperty;
import one.me.keyboardmedia.MediaKeyboardWidget;

/* renamed from: xr8  reason: default package */
public final class xr8 {
    public static final /* synthetic */ KProperty[] m = {rae.s(xr8.class, "keyboardObserverJob", "getKeyboardObserverJob()Lkotlinx/coroutines/Job;", 0)};
    public final e9d a;
    public final View b;
    public final View c;
    public final Function0 d;
    public final boolean e;
    public final tu7 f;
    public boolean g;
    public final Function0 h;
    public AnimatorSet i;
    public final wie j = o5a.U();
    public final int k = MathKt.roundToInt(((float) 100) * vo4.c().getDisplayMetrics().density);
    public boolean l;

    public xr8(e9d e9d, oz1 oz1, View view, Function0 function0, boolean z, tu7 tu7, boolean z2, Function0 function02) {
        this.a = e9d;
        this.b = oz1;
        this.c = view;
        this.d = function0;
        this.e = z;
        this.f = tu7;
        this.g = z2;
        this.h = function02;
    }

    public final void a() {
        KProperty[] kPropertyArr = m;
        KProperty kProperty = kPropertyArr[0];
        wie wie = this.j;
        pm7 pm7 = (pm7) wie.getValue(this, kProperty);
        if (pm7 != null) {
            pm7.b((CancellationException) null);
        }
        wie.setValue(this, kPropertyArr[0], (Object) null);
        e9d e9d = this.a;
        if (e9d.n()) {
            e9d.C();
        }
    }

    public final ValueAnimator b(int i2) {
        ValueAnimator ofInt = ValueAnimator.ofInt(new int[]{this.c.getPaddingBottom(), i2});
        ofInt.addUpdateListener(new ur8(this, 0));
        return ofInt;
    }

    public final int c() {
        int i2 = pq7.a;
        return pq7.a(this.b.getContext());
    }

    public final MediaKeyboardWidget d() {
        i9d i9d = (i9d) CollectionsKt.firstOrNull(this.a.e());
        zx3 zx3 = i9d != null ? i9d.a : null;
        if (zx3 instanceof MediaKeyboardWidget) {
            return (MediaKeyboardWidget) zx3;
        }
        return null;
    }

    /* JADX WARNING: type inference failed for: r10v3, types: [android.view.ViewGroup$LayoutParams] */
    /* JADX WARNING: type inference failed for: r10v8, types: [android.view.ViewGroup$LayoutParams] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 2 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void e(boolean r10) {
        /*
            r9 = this;
            r0 = 2
            r1 = 1
            r2 = 0
            e9d r3 = r9.a
            boolean r3 = r3.n()
            if (r3 != 0) goto L_0x000c
            return
        L_0x000c:
            boolean r3 = r9.e
            r4 = 0
            android.view.View r5 = r9.b
            if (r3 == 0) goto L_0x0070
            android.util.Property r3 = android.view.View.TRANSLATION_Y
            float r6 = r5.getTranslationY()
            int r7 = r5.getHeight()
            float r7 = (float) r7
            float[] r8 = new float[r0]
            r8[r2] = r6
            r8[r1] = r7
            android.animation.ObjectAnimator r3 = android.animation.ObjectAnimator.ofFloat(r5, r3, r8)
            android.animation.AnimatorSet r6 = r9.i
            if (r6 == 0) goto L_0x002f
            r6.cancel()
        L_0x002f:
            android.animation.AnimatorSet r6 = new android.animation.AnimatorSet
            r6.<init>()
            if (r10 == 0) goto L_0x0055
            android.view.ViewGroup$LayoutParams r10 = r5.getLayoutParams()
            boolean r5 = r10 instanceof android.view.ViewGroup.MarginLayoutParams
            if (r5 == 0) goto L_0x0041
            r4 = r10
            android.view.ViewGroup$MarginLayoutParams r4 = (android.view.ViewGroup.MarginLayoutParams) r4
        L_0x0041:
            if (r4 == 0) goto L_0x0046
            int r10 = r4.bottomMargin
            goto L_0x0047
        L_0x0046:
            r10 = r2
        L_0x0047:
            android.animation.ValueAnimator r10 = r9.b(r10)
            android.animation.Animator[] r0 = new android.animation.Animator[r0]
            r0[r2] = r10
            r0[r1] = r3
            r6.playTogether(r0)
            goto L_0x0058
        L_0x0055:
            r6.play(r3)
        L_0x0058:
            r3 = 200(0xc8, double:9.9E-322)
            r6.setDuration(r3)
            tr8 r10 = new tr8
            r10.<init>(r9, r1)
            xh r0 = new xh
            r0.<init>(r6, r10, r2)
            r6.addListener(r0)
            r6.start()
            r9.i = r6
            goto L_0x009f
        L_0x0070:
            int r10 = r5.getHeight()
            float r10 = (float) r10
            r5.setTranslationY(r10)
            android.view.ViewGroup$LayoutParams r10 = r5.getLayoutParams()
            boolean r0 = r10 instanceof android.view.ViewGroup.MarginLayoutParams
            if (r0 == 0) goto L_0x0083
            r4 = r10
            android.view.ViewGroup$MarginLayoutParams r4 = (android.view.ViewGroup.MarginLayoutParams) r4
        L_0x0083:
            if (r4 == 0) goto L_0x0088
            int r10 = r4.bottomMargin
            goto L_0x0089
        L_0x0088:
            r10 = r2
        L_0x0089:
            android.view.View r0 = r9.c
            int r1 = r0.getPaddingLeft()
            int r3 = r0.getPaddingTop()
            int r4 = r0.getPaddingRight()
            r0.setPadding(r1, r3, r4, r10)
            r9.l = r2
            r9.a()
        L_0x009f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.xr8.e(boolean):void");
    }

    public final void f() {
        this.l = true;
        boolean z = this.e;
        View view = this.c;
        View view2 = this.b;
        if (z) {
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view2, View.TRANSLATION_Y, new float[]{view2.getTranslationY(), 0.0f});
            int c2 = c();
            ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
            ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams : null;
            int i2 = c2 + (marginLayoutParams != null ? marginLayoutParams.bottomMargin : 0);
            boolean z2 = view.getPaddingBottom() != i2;
            AnimatorSet animatorSet = this.i;
            if (animatorSet != null) {
                animatorSet.cancel();
            }
            AnimatorSet animatorSet2 = new AnimatorSet();
            if (z2) {
                animatorSet2.playTogether(new Animator[]{b(i2), ofFloat});
            } else {
                animatorSet2.play(ofFloat);
            }
            animatorSet2.setDuration(200);
            animatorSet2.addListener(new xh(animatorSet2, new tr8(this, 0), 1));
            animatorSet2.start();
            this.i = animatorSet2;
        } else {
            int i3 = pq7.a;
            boolean b2 = pq7.b(pq7.c);
            oq7 oq7 = (oq7) this.d.invoke();
            if (oq7 != null) {
                oq7.k();
            }
            if (b2) {
                gag.l(view, new nf(view, this));
            } else {
                int c3 = c();
                ViewGroup.LayoutParams layoutParams2 = view2.getLayoutParams();
                ViewGroup.MarginLayoutParams marginLayoutParams2 = layoutParams2 instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams2 : null;
                int i4 = c3 + (marginLayoutParams2 != null ? marginLayoutParams2.bottomMargin : 0);
                boolean z3 = view.getPaddingBottom() != i4;
                view2.setTranslationY(c44.DEFAULT_ASPECT_RATIO);
                if (z3) {
                    view.setPadding(view.getPaddingLeft(), view.getPaddingTop(), view.getPaddingRight(), i4);
                }
            }
        }
        xme xme = pq7.f;
        bs5 ql8 = new ql8(xme, 1);
        if (((Boolean) xme.getValue()).booleanValue()) {
            ql8 = new eu5(ql8, 0);
        }
        this.j.setValue(this, m[0], o5a.O(new ps5(ql8, new wr8(this, (Continuation) null), 5), this.f));
    }
}
