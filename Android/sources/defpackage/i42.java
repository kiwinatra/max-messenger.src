package defpackage;

import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.net.Uri;
import android.text.Spanned;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import java.util.BitSet;
import kotlin.Lazy;
import kotlin.NoWhenBranchMatchedException;
import kotlin.text.StringsKt;
import one.me.sdk.richvector.EnhancedVectorDrawable;
import one.me.sdk.uikit.common.avatar.OneMeAvatarView;

/* renamed from: i42  reason: default package */
public final class i42 extends ViewGroup implements phf {
    public final View A0;
    public final BitSet B0;
    public final BitSet C0;
    public final int D0 = 1;
    public final int E0 = 2;
    public final int F0 = 3;
    public final int G0 = 4;
    public final int H0 = 5;
    public final int I0 = 6;
    public final int J0 = 7;
    public final int K0 = 8;
    public final int L0 = 9;
    public boolean M0;
    public final cf N0;
    public long O0;
    public final muf P0;
    public final OneMeAvatarView a;
    public final TextView b;
    public final b15 c;
    public final b15 o;
    public final TextView v;
    public final Lazy v0;
    public final yea w;
    public final Lazy w0;
    public final View x;
    public final Lazy x0;
    public final Lazy y;
    public final View y0;
    public final Lazy z;
    public final View z0;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public i42(android.content.Context r18) {
        /*
            r17 = this;
            r0 = r17
            r1 = r18
            r2 = 0
            r3 = 0
            r0.<init>(r1, r2, r3, r3)
            one.me.sdk.uikit.common.avatar.OneMeAvatarView r4 = new one.me.sdk.uikit.common.avatar.OneMeAvatarView
            r4.<init>(r1, r2)
            r4.setFocusable(r3)
            r0.a = r4
            android.widget.TextView r2 = new android.widget.TextView
            r2.<init>(r1)
            ogf r5 = defpackage.puf.F
            r5.b(r2, defpackage.uy4.b)
            js9 r5 = defpackage.fu4.k
            android.content.Context r6 = r2.getContext()
            fu4 r6 = r5.e(r6)
            k2b r6 = r6.f()
            xef r6 = r6.getText()
            int r6 = r6.e
            r2.setTextColor(r6)
            r2.setSingleLine()
            r2.setFallbackLineSpacing(r3)
            android.text.TextUtils$TruncateAt r6 = android.text.TextUtils.TruncateAt.END
            r2.setEllipsize(r6)
            r2.setFocusable(r3)
            r0.b = r2
            b15 r7 = new b15
            r7.<init>(r1)
            ogf r8 = defpackage.puf.H
            r8.b(r7, defpackage.uy4.b)
            android.content.Context r9 = r7.getContext()
            fu4 r9 = r5.e(r9)
            k2b r9 = r9.f()
            xef r9 = r9.getText()
            int r9 = r9.f
            r7.setTextColor(r9)
            r9 = 2
            r7.setMaxLines(r9)
            r7.setFallbackLineSpacing(r3)
            r7.setEllipsize(r6)
            r7.setFocusable(r3)
            defpackage.gsg.h(r7)
            r0.c = r7
            b15 r10 = new b15
            r10.<init>(r1)
            r8.b(r10, defpackage.uy4.b)
            android.content.Context r8 = r10.getContext()
            fu4 r8 = r5.e(r8)
            k2b r8 = r8.f()
            xef r8 = r8.getText()
            int r8 = r8.f
            r10.setTextColor(r8)
            r10.setFallbackLineSpacing(r3)
            r10.setMaxLines(r9)
            r10.setEllipsize(r6)
            r10.setFocusable(r3)
            r0.o = r10
            android.widget.TextView r6 = new android.widget.TextView
            r6.<init>(r1)
            ogf r8 = defpackage.puf.G
            r8.b(r6, defpackage.uy4.b)
            r6.setFallbackLineSpacing(r3)
            android.content.Context r8 = r6.getContext()
            fu4 r8 = r5.e(r8)
            k2b r8 = r8.f()
            xef r8 = r8.getText()
            int r8 = r8.h
            r6.setTextColor(r8)
            r6.setFocusable(r3)
            r0.v = r6
            yea r8 = new yea
            r8.<init>(r1)
            r8.setFocusable(r3)
            r0.w = r8
            android.view.View r11 = new android.view.View
            r11.<init>(r1)
            r11.setFocusable(r3)
            r0.x = r11
            g42 r12 = new g42
            r13 = 0
            r12.<init>(r0, r13)
            kotlin.LazyThreadSafetyMode r13 = kotlin.LazyThreadSafetyMode.NONE
            kotlin.Lazy r12 = kotlin.LazyKt.lazy((kotlin.LazyThreadSafetyMode) r13, r12)
            r0.y = r12
            g42 r12 = new g42
            r14 = 1
            r12.<init>(r0, r14)
            kotlin.Lazy r12 = kotlin.LazyKt.lazy((kotlin.LazyThreadSafetyMode) r13, r12)
            r0.z = r12
            g42 r12 = new g42
            r14 = 2
            r12.<init>(r0, r14)
            kotlin.Lazy r12 = kotlin.LazyKt.lazy((kotlin.LazyThreadSafetyMode) r13, r12)
            r0.v0 = r12
            s2 r12 = new s2
            r14 = 16
            r12.<init>((int) r14, (java.lang.Object) r1, (java.lang.Object) r0)
            kotlin.Lazy r12 = kotlin.LazyKt.lazy((kotlin.LazyThreadSafetyMode) r13, r12)
            r0.w0 = r12
            g42 r12 = new g42
            r14 = 3
            r12.<init>(r0, r14)
            kotlin.Lazy r12 = kotlin.LazyKt.lazy((kotlin.LazyThreadSafetyMode) r13, r12)
            r0.x0 = r12
            android.view.View r12 = new android.view.View
            r12.<init>(r1)
            int r13 = defpackage.cad.D1
            android.content.Context r14 = r12.getContext()
            android.graphics.drawable.Drawable r13 = defpackage.ew3.b(r14, r13)
            android.content.Context r14 = r12.getContext()
            fu4 r14 = r5.e(r14)
            k2b r14 = r14.f()
            u67 r14 = r14.getIcon()
            int r14 = r14.g
            defpackage.iq.a0(r13, r14)
            r12.setBackground(r13)
            r12.setFocusable(r3)
            r0.y0 = r12
            android.view.View r13 = new android.view.View
            r13.<init>(r1)
            int r14 = defpackage.cad.t1
            android.content.Context r15 = r13.getContext()
            android.graphics.drawable.Drawable r14 = defpackage.ew3.b(r15, r14)
            android.content.Context r15 = r13.getContext()
            fu4 r15 = r5.e(r15)
            k2b r15 = r15.f()
            u67 r15 = r15.getIcon()
            int r15 = r15.g
            defpackage.iq.a0(r14, r15)
            r13.setBackground(r14)
            r13.setFocusable(r3)
            r0.z0 = r13
            android.view.View r14 = new android.view.View
            r14.<init>(r1)
            android.graphics.drawable.ColorDrawable r15 = new android.graphics.drawable.ColorDrawable
            r9 = -16711936(0xffffffffff00ff00, float:-1.7146522E38)
            r15.<init>(r9)
            r14.setBackground(r15)
            r14.setFocusable(r3)
            r0.A0 = r14
            java.util.BitSet r9 = new java.util.BitSet
            r15 = 8
            r9.<init>(r15)
            r0.B0 = r9
            java.util.BitSet r3 = new java.util.BitSet
            r3.<init>(r15)
            r0.C0 = r3
            r15 = 1
            r0.D0 = r15
            r15 = 2
            r0.E0 = r15
            r15 = 3
            r0.F0 = r15
            r15 = 4
            r0.G0 = r15
            r15 = 5
            r0.H0 = r15
            r15 = 6
            r0.I0 = r15
            r15 = 7
            r0.J0 = r15
            r15 = 8
            r0.K0 = r15
            r15 = 9
            r0.L0 = r15
            cf r15 = new cf
            r16 = r3
            r3 = 9
            r15.<init>(r3, r0)
            r0.N0 = r15
            muf r3 = new muf
            fu4 r1 = r5.e(r1)
            k2b r1 = r1.f()
            gl1 r5 = new gl1
            r15 = 3
            r5.<init>(r15)
            r3.<init>(r1, r5)
            r1 = 20
            float r1 = (float) r1
            android.content.res.Resources r5 = defpackage.vo4.c()
            android.util.DisplayMetrics r5 = r5.getDisplayMetrics()
            float r5 = r5.density
            float r1 = r1 * r5
            int r1 = kotlin.math.MathKt.roundToInt((float) r1)
            r5 = 0
            r3.setBounds(r5, r5, r1, r1)
            r3.setCallback(r0)
            r0.P0 = r3
            android.graphics.drawable.RippleDrawable r1 = r17.getRippleDrawable()
            r0.setBackground(r1)
            r0.addView(r4)
            r1 = -1
            r3 = -2
            r0.addView(r2, r1, r3)
            r0.addView(r7, r1, r3)
            r0.addView(r10, r1, r3)
            r0.addView(r6)
            r0.addView(r13)
            r0.addView(r8)
            r0.addView(r11)
            r0.addView(r12)
            r0.addView(r14)
            r1 = 6
            float r1 = (float) r1
            android.content.res.Resources r2 = defpackage.vo4.c()
            android.util.DisplayMetrics r2 = r2.getDisplayMetrics()
            float r2 = r2.density
            float r2 = r2 * r1
            int r2 = kotlin.math.MathKt.roundToInt((float) r2)
            r3 = 10
            float r3 = (float) r3
            android.content.res.Resources r4 = defpackage.vo4.c()
            android.util.DisplayMetrics r4 = r4.getDisplayMetrics()
            float r4 = r4.density
            float r4 = r4 * r3
            int r4 = kotlin.math.MathKt.roundToInt((float) r4)
            android.content.res.Resources r5 = defpackage.vo4.c()
            android.util.DisplayMetrics r5 = r5.getDisplayMetrics()
            float r5 = r5.density
            float r1 = r1 * r5
            int r1 = kotlin.math.MathKt.roundToInt((float) r1)
            android.content.res.Resources r5 = defpackage.vo4.c()
            android.util.DisplayMetrics r5 = r5.getDisplayMetrics()
            float r5 = r5.density
            float r3 = r3 * r5
            int r3 = kotlin.math.MathKt.roundToInt((float) r3)
            r0.setPadding(r2, r4, r1, r3)
            int r0 = r9.size()
            r1 = 0
            r2 = 1
            r9.set(r1, r0, r2)
            int r0 = r16.size()
            r2 = r16
            r2.set(r1, r0, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.i42.<init>(android.content.Context):void");
    }

    private final RippleDrawable getRippleDrawable() {
        return (RippleDrawable) this.x0.getValue();
    }

    public final boolean a(String str) {
        if (str == null || str.length() == 0) {
            return false;
        }
        b15 b15 = this.c;
        return b15.getPaint().measureText(str) > ((float) b15.getMeasuredWidth());
    }

    public final boolean b(String str) {
        if (str == null || str.length() == 0) {
            return false;
        }
        TextView textView = this.b;
        return textView.getPaint().measureText(str) > ((float) textView.getMeasuredWidth());
    }

    public final void c(CharSequence charSequence, Long l) {
        OneMeAvatarView oneMeAvatarView = this.a;
        oneMeAvatarView.setAvatarUrl((String) null);
        boolean z2 = true;
        oneMeAvatarView.f(new gd0(charSequence == null ? "" : charSequence, l.longValue()), true);
        this.B0.set(0, true);
        BitSet bitSet = this.C0;
        if (charSequence == null || StringsKt.isBlank(charSequence)) {
            z2 = false;
        }
        bitSet.set(0, z2);
        requestLayout();
    }

    public final void d(BitSet bitSet, boolean z2) {
        bitSet.set(this.G0, z2);
    }

    public final void e(int i, boolean z2) {
        yea yea = this.w;
        xea xea = yea.o;
        int i2 = xea.a;
        xea a2 = xea.a(xea, i, false, false, false, 14);
        yea.o = a2;
        boolean z3 = false;
        if (i2 != i) {
            BitSet bitSet = yea.v;
            int i3 = yea.x;
            boolean z4 = z2 && bitSet.get(i3);
            wsa wsa = yea.v0;
            wsa.g(a2.a, z4);
            wsa.setAppearance(a2.d ? qsa.c : qsa.a);
            bitSet.set(i3, a2.e);
            yea.requestLayout();
        }
        BitSet bitSet2 = this.C0;
        int i4 = this.G0;
        if (bitSet2.get(i4) || i > 0) {
            z3 = true;
        }
        bitSet2.set(i4, z3);
        d(this.B0, true);
        requestLayout();
    }

    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        onThemeChanged(fu4.k.e(getContext()).f());
        if (this.o.getVisibility() == 0) {
            this.P0.start();
        }
    }

    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        BitSet bitSet = this.B0;
        bitSet.set(0, bitSet.size(), true);
        requestLayout();
    }

    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.P0.stop();
    }

    /* JADX INFO: finally extract failed */
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        b15 b15 = this.o;
        if (b15.getVisibility() == 0) {
            Rect bottomLineRect = b15.getBottomLineRect();
            if (!bottomLineRect.isEmpty()) {
                bottomLineRect.offset(b15.getLeft(), b15.getTop());
                muf muf = this.P0;
                int save = canvas.save();
                canvas.translate(((float) bottomLineRect.right) - ((float) muf.getBounds().width()), (float) bottomLineRect.top);
                try {
                    muf.draw(canvas);
                    canvas.restoreToCount(save);
                    muf.start();
                } catch (Throwable th) {
                    canvas.restoreToCount(save);
                    throw th;
                }
            }
        }
    }

    public final void onLayout(boolean z2, int i, int i2, int i3, int i4) {
        int measuredWidth;
        int i5;
        int i6;
        int i7;
        float measuredHeight = ((float) (getMeasuredHeight() - (getPaddingBottom() + getPaddingTop()))) / 2.0f;
        OneMeAvatarView oneMeAvatarView = this.a;
        int paddingTop = (int) ((measuredHeight + ((float) getPaddingTop())) - (((float) oneMeAvatarView.getMeasuredWidth()) / 2.0f));
        BitSet bitSet = this.C0;
        int i8 = 0;
        if (bitSet.get(0)) {
            ct.A(getPaddingStart(), paddingTop, getPaddingStart() + oneMeAvatarView.getMeasuredWidth(), oneMeAvatarView.getMeasuredHeight() + paddingTop, this.a, this);
        }
        float f = (float) 12;
        int b2 = g63.b(f, vo4.c().getDisplayMetrics().density, oneMeAvatarView.getMeasuredWidth() + getPaddingStart());
        boolean z3 = bitSet.get(this.D0);
        TextView textView = this.b;
        if (z3) {
            ct.A(b2, getPaddingTop(), textView.getMeasuredWidth() + b2, textView.getMeasuredHeight() + getPaddingTop(), textView, this);
        }
        float measuredHeight2 = ((float) textView.getMeasuredHeight()) / 2.0f;
        View view = this.z0;
        int top = (int) ((measuredHeight2 + ((float) textView.getTop())) - (((float) view.getMeasuredHeight()) / 2.0f));
        if (bitSet.get(this.J0)) {
            if (z3) {
                i7 = g63.b((float) 4, vo4.c().getDisplayMetrics().density, textView.getMeasuredWidth());
            } else {
                i7 = 0;
            }
            int i9 = i7 + b2;
            if (z3) {
                i8 = g63.b((float) 4, vo4.c().getDisplayMetrics().density, textView.getMeasuredWidth());
            }
            ct.A(i9, top, view.getMeasuredWidth() + b2 + i8, view.getMeasuredHeight() + top, view, this);
        }
        int b3 = g63.b(f, vo4.c().getDisplayMetrics().density, oneMeAvatarView.getMeasuredWidth() + getPaddingStart());
        float f2 = (float) 2;
        int b4 = g63.b(f2, vo4.c().getDisplayMetrics().density, textView.getBottom());
        if (bitSet.get(this.E0)) {
            b15 b15 = this.c;
            ct.A(b3, b4, b15.getMeasuredWidth() + b3, this.c.getMeasuredHeight() + b4, b15, this);
        }
        if (bitSet.get(this.L0)) {
            b15 b152 = this.o;
            ct.A(b3, b4, b152.getMeasuredWidth() + b3, this.o.getMeasuredHeight() + b4, b152, this);
        }
        int measuredWidth2 = getMeasuredWidth() - getPaddingEnd();
        float measuredHeight3 = ((float) textView.getMeasuredHeight()) / 2.0f;
        View view2 = this.y0;
        int top2 = (int) ((measuredHeight3 + ((float) textView.getTop())) - (((float) view2.getMeasuredHeight()) / 2.0f));
        int i10 = this.I0;
        if (bitSet.get(i10)) {
            ct.A(measuredWidth2 - view2.getMeasuredWidth(), top2, measuredWidth2, view2.getMeasuredHeight() + top2, view2, this);
        }
        if (bitSet.get(i10)) {
            measuredWidth = a81.e((float) 4, vo4.c().getDisplayMetrics().density, measuredWidth2 - view2.getMeasuredWidth());
        } else {
            measuredWidth = getMeasuredWidth() - getPaddingEnd();
        }
        int i11 = measuredWidth;
        float measuredHeight4 = ((float) textView.getMeasuredHeight()) / 2.0f;
        TextView textView2 = this.v;
        int top3 = (int) ((measuredHeight4 + ((float) textView.getTop())) - (((float) textView2.getMeasuredHeight()) / 2.0f));
        int i12 = this.F0;
        if (bitSet.get(i12)) {
            ct.A(i11 - textView2.getMeasuredWidth(), top3, i11, textView2.getMeasuredHeight() + top3, textView2, this);
        }
        if (bitSet.get(i12)) {
            i5 = a81.e(f2, vo4.c().getDisplayMetrics().density, i11 - textView2.getMeasuredWidth());
        } else {
            i5 = i11;
        }
        float measuredHeight5 = ((float) textView.getMeasuredHeight()) / 2.0f;
        View view3 = this.x;
        int top4 = (int) ((measuredHeight5 + ((float) textView.getTop())) - (((float) view3.getMeasuredHeight()) / 2.0f));
        if (bitSet.get(this.H0)) {
            ct.A(i5 - view3.getMeasuredWidth(), top4, i5, view3.getMeasuredHeight() + top4, view3, this);
        }
        int measuredWidth3 = getMeasuredWidth() - getPaddingEnd();
        int i13 = this.G0;
        boolean z4 = bitSet.get(i13);
        yea yea = this.w;
        if (z4) {
            int e = a81.e((float) 1, vo4.c().getDisplayMetrics().density, b4);
            yea yea2 = this.w;
            ct.A(measuredWidth3 - yea2.getMeasuredWidth(), e, measuredWidth3, yea.getMeasuredHeight() + e, yea2, this);
        }
        if (bitSet.get(i13)) {
            i6 = a81.e((float) 4, vo4.c().getDisplayMetrics().density, measuredWidth3 - yea.getMeasuredWidth());
        } else {
            i6 = measuredWidth3;
        }
        if (bitSet.get(this.K0)) {
            View view4 = this.A0;
            ct.A(i6 - view4.getMeasuredWidth(), b4, i6, view4.getMeasuredHeight() + b4, view4, this);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:135:0x034f  */
    /* JADX WARNING: Removed duplicated region for block: B:136:0x0356  */
    /* JADX WARNING: Removed duplicated region for block: B:139:0x035e  */
    /* JADX WARNING: Removed duplicated region for block: B:147:0x03a8  */
    /* JADX WARNING: Removed duplicated region for block: B:154:0x03c9  */
    /* JADX WARNING: Removed duplicated region for block: B:155:0x03cb  */
    /* JADX WARNING: Removed duplicated region for block: B:158:0x03e3  */
    /* JADX WARNING: Removed duplicated region for block: B:169:0x040c  */
    /* JADX WARNING: Removed duplicated region for block: B:185:0x043f  */
    /* JADX WARNING: Removed duplicated region for block: B:188:0x044f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onMeasure(int r31, int r32) {
        /*
            r30 = this;
            r0 = r30
            r1 = r31
            r2 = r32
            android.widget.TextView r3 = r0.b
            boolean r4 = defpackage.wgf.d(r3)
            r5 = 1
            if (r4 == 0) goto L_0x0012
            r0.setVerified(r5)
        L_0x0012:
            java.util.BitSet r4 = r0.C0
            r6 = 0
            boolean r7 = r4.get(r6)
            if (r7 == 0) goto L_0x001d
            r7 = r6
            goto L_0x001f
        L_0x001d:
            r7 = 8
        L_0x001f:
            one.me.sdk.uikit.common.avatar.OneMeAvatarView r9 = r0.a
            r9.setVisibility(r7)
            int r7 = r0.D0
            boolean r10 = r4.get(r7)
            if (r10 == 0) goto L_0x002e
            r10 = r6
            goto L_0x0030
        L_0x002e:
            r10 = 8
        L_0x0030:
            r3.setVisibility(r10)
            int r10 = r0.L0
            boolean r11 = r4.get(r10)
            if (r11 == 0) goto L_0x003d
            r11 = r6
            goto L_0x003f
        L_0x003d:
            r11 = 8
        L_0x003f:
            b15 r12 = r0.o
            r12.setVisibility(r11)
            int r11 = r0.E0
            boolean r13 = r4.get(r11)
            if (r13 == 0) goto L_0x004e
            r13 = r6
            goto L_0x0050
        L_0x004e:
            r13 = 8
        L_0x0050:
            b15 r14 = r0.c
            r14.setVisibility(r13)
            android.widget.TextView r13 = r0.v
            int r15 = r0.F0
            boolean r16 = r4.get(r15)
            if (r16 == 0) goto L_0x0061
            r8 = r6
            goto L_0x0063
        L_0x0061:
            r8 = 8
        L_0x0063:
            r13.setVisibility(r8)
            android.view.View r8 = r0.z0
            int r5 = r0.J0
            boolean r17 = r4.get(r5)
            if (r17 == 0) goto L_0x0071
            goto L_0x0073
        L_0x0071:
            r6 = 8
        L_0x0073:
            r8.setVisibility(r6)
            int r6 = r0.G0
            boolean r18 = r4.get(r6)
            r19 = r11
            if (r18 == 0) goto L_0x0084
            r18 = r12
            r12 = 0
            goto L_0x0088
        L_0x0084:
            r18 = r12
            r12 = 8
        L_0x0088:
            yea r11 = r0.w
            r11.setVisibility(r12)
            android.view.View r12 = r0.x
            r20 = r14
            int r14 = r0.H0
            boolean r21 = r4.get(r14)
            if (r21 == 0) goto L_0x009d
            r21 = r11
            r11 = 0
            goto L_0x00a1
        L_0x009d:
            r21 = r11
            r11 = 8
        L_0x00a1:
            r12.setVisibility(r11)
            android.view.View r11 = r0.y0
            r22 = r6
            int r6 = r0.I0
            boolean r23 = r4.get(r6)
            if (r23 == 0) goto L_0x00b4
            r23 = r3
            r3 = 0
            goto L_0x00b8
        L_0x00b4:
            r23 = r3
            r3 = 8
        L_0x00b8:
            r11.setVisibility(r3)
            android.view.View r3 = r0.A0
            r24 = r7
            int r7 = r0.K0
            boolean r25 = r4.get(r7)
            if (r25 == 0) goto L_0x00cb
            r25 = r7
            r7 = 0
            goto L_0x00cf
        L_0x00cb:
            r25 = r7
            r7 = 8
        L_0x00cf:
            r3.setVisibility(r7)
            boolean r7 = r4.get(r10)
            r16 = r10
            muf r10 = r0.P0
            if (r7 == 0) goto L_0x00e1
            r10.start()
        L_0x00df:
            r10 = r8
            goto L_0x00e5
        L_0x00e1:
            r10.stop()
            goto L_0x00df
        L_0x00e5:
            long r7 = r0.O0
            r26 = 4294967295(0xffffffff, double:2.1219957905E-314)
            r29 = r10
            r28 = r11
            long r10 = r7 & r26
            int r10 = (int) r10
            java.util.BitSet r11 = r0.B0
            r26 = 32
            if (r10 != r1) goto L_0x00fe
            long r7 = r7 << r26
            int r7 = (int) r7
            if (r7 == r2) goto L_0x0107
        L_0x00fe:
            int r7 = r11.size()
            r8 = 1
            r10 = 0
            r11.set(r10, r7, r8)
        L_0x0107:
            long r7 = (long) r1
            long r1 = (long) r2
            long r1 = r1 << r26
            long r1 = r1 | r7
            r0.O0 = r1
            int r1 = android.view.View.MeasureSpec.getMode(r31)
            if (r1 != 0) goto L_0x0116
            r8 = 1
            goto L_0x0117
        L_0x0116:
            r8 = 0
        L_0x0117:
            if (r8 == 0) goto L_0x0128
            android.content.Context r1 = r30.getContext()
            android.content.res.Resources r1 = r1.getResources()
            android.util.DisplayMetrics r1 = r1.getDisplayMetrics()
            int r1 = r1.widthPixels
            goto L_0x012c
        L_0x0128:
            int r1 = android.view.View.MeasureSpec.getSize(r31)
        L_0x012c:
            r2 = 54
            float r2 = (float) r2
            android.content.res.Resources r7 = defpackage.vo4.c()
            android.util.DisplayMetrics r7 = r7.getDisplayMetrics()
            float r7 = r7.density
            float r2 = r2 * r7
            int r2 = kotlin.math.MathKt.roundToInt((float) r2)
            int r7 = r30.getPaddingStart()
            int r7 = r1 - r7
            int r10 = r30.getPaddingEnd()
            int r7 = r7 - r10
            int r10 = r30.getPaddingStart()
            int r10 = r1 - r10
            int r26 = r30.getPaddingEnd()
            int r10 = r10 - r26
            r32 = r1
            r1 = 0
            boolean r17 = r4.get(r1)
            r26 = r8
            r8 = 1073741824(0x40000000, float:2.0)
            if (r17 == 0) goto L_0x0173
            boolean r27 = r11.get(r1)
            if (r27 == 0) goto L_0x0173
            int r1 = android.view.View.MeasureSpec.makeMeasureSpec(r2, r8)
            int r2 = android.view.View.MeasureSpec.makeMeasureSpec(r2, r8)
            r9.measure(r1, r2)
        L_0x0173:
            int r1 = r9.getMeasuredWidth()
            r2 = 12
            float r2 = (float) r2
            android.content.res.Resources r27 = defpackage.vo4.c()
            android.util.DisplayMetrics r8 = r27.getDisplayMetrics()
            float r8 = r8.density
            float r8 = r8 * r2
            int r8 = kotlin.math.MathKt.roundToInt((float) r8)
            int r8 = r8 + r1
            int r7 = r7 - r8
            int r1 = r9.getMeasuredWidth()
            android.content.res.Resources r8 = defpackage.vo4.c()
            android.util.DisplayMetrics r8 = r8.getDisplayMetrics()
            float r8 = r8.density
            float r8 = r8 * r2
            int r8 = kotlin.math.MathKt.roundToInt((float) r8)
            int r8 = r8 + r1
            int r10 = r10 - r8
            boolean r1 = r4.get(r15)
            if (r1 == 0) goto L_0x01aa
            r1 = 0
            r13.measure(r1, r1)
        L_0x01aa:
            int r1 = r13.getMeasuredWidth()
            int r7 = r7 - r1
            boolean r1 = r4.get(r14)
            r8 = 16
            r9 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r1 == 0) goto L_0x01e9
            boolean r1 = r11.get(r14)
            if (r1 == 0) goto L_0x01e9
            float r1 = (float) r8
            android.content.res.Resources r13 = defpackage.vo4.c()
            android.util.DisplayMetrics r13 = r13.getDisplayMetrics()
            float r13 = r13.density
            float r13 = r13 * r1
            int r13 = kotlin.math.MathKt.roundToInt((float) r13)
            int r13 = android.view.View.MeasureSpec.makeMeasureSpec(r13, r9)
            android.content.res.Resources r27 = defpackage.vo4.c()
            android.util.DisplayMetrics r8 = r27.getDisplayMetrics()
            float r8 = r8.density
            float r1 = r1 * r8
            int r1 = kotlin.math.MathKt.roundToInt((float) r1)
            int r1 = android.view.View.MeasureSpec.makeMeasureSpec(r1, r9)
            r12.measure(r13, r1)
        L_0x01e9:
            boolean r1 = r4.get(r14)
            if (r1 == 0) goto L_0x01f4
            int r1 = r12.getMeasuredWidth()
            int r7 = r7 - r1
        L_0x01f4:
            boolean r1 = r4.get(r14)
            r8 = 2
            if (r1 == 0) goto L_0x0210
            boolean r1 = r4.get(r15)
            if (r1 == 0) goto L_0x0210
            float r1 = (float) r8
            android.content.res.Resources r12 = defpackage.vo4.c()
            android.util.DisplayMetrics r12 = r12.getDisplayMetrics()
            float r12 = r12.density
            int r7 = defpackage.a81.e(r1, r12, r7)
        L_0x0210:
            boolean r1 = r4.get(r6)
            if (r1 == 0) goto L_0x024b
            boolean r1 = r11.get(r6)
            if (r1 == 0) goto L_0x024b
            r1 = 16
            float r12 = (float) r1
            android.content.res.Resources r1 = defpackage.vo4.c()
            android.util.DisplayMetrics r1 = r1.getDisplayMetrics()
            float r1 = r1.density
            float r1 = r1 * r12
            int r1 = kotlin.math.MathKt.roundToInt((float) r1)
            int r1 = android.view.View.MeasureSpec.makeMeasureSpec(r1, r9)
            android.content.res.Resources r13 = defpackage.vo4.c()
            android.util.DisplayMetrics r13 = r13.getDisplayMetrics()
            float r13 = r13.density
            float r12 = r12 * r13
            int r12 = kotlin.math.MathKt.roundToInt((float) r12)
            int r12 = android.view.View.MeasureSpec.makeMeasureSpec(r12, r9)
            r13 = r28
            r13.measure(r1, r12)
            goto L_0x024d
        L_0x024b:
            r13 = r28
        L_0x024d:
            boolean r1 = r4.get(r6)
            r12 = 4
            if (r1 == 0) goto L_0x0274
            int r1 = r13.getMeasuredWidth()
            int r7 = r7 - r1
            boolean r1 = r4.get(r15)
            if (r1 != 0) goto L_0x0265
            boolean r1 = r4.get(r14)
            if (r1 == 0) goto L_0x0274
        L_0x0265:
            float r1 = (float) r12
            android.content.res.Resources r13 = defpackage.vo4.c()
            android.util.DisplayMetrics r13 = r13.getDisplayMetrics()
            float r13 = r13.density
            int r7 = defpackage.a81.e(r1, r13, r7)
        L_0x0274:
            boolean r1 = r4.get(r5)
            if (r1 == 0) goto L_0x02af
            boolean r1 = r11.get(r5)
            if (r1 == 0) goto L_0x02af
            r1 = 16
            float r1 = (float) r1
            android.content.res.Resources r13 = defpackage.vo4.c()
            android.util.DisplayMetrics r13 = r13.getDisplayMetrics()
            float r13 = r13.density
            float r13 = r13 * r1
            int r13 = kotlin.math.MathKt.roundToInt((float) r13)
            int r13 = android.view.View.MeasureSpec.makeMeasureSpec(r13, r9)
            android.content.res.Resources r27 = defpackage.vo4.c()
            android.util.DisplayMetrics r8 = r27.getDisplayMetrics()
            float r8 = r8.density
            float r1 = r1 * r8
            int r1 = kotlin.math.MathKt.roundToInt((float) r1)
            int r1 = android.view.View.MeasureSpec.makeMeasureSpec(r1, r9)
            r8 = r29
            r8.measure(r13, r1)
            goto L_0x02b1
        L_0x02af:
            r8 = r29
        L_0x02b1:
            boolean r1 = r4.get(r5)
            if (r1 == 0) goto L_0x02cd
            int r1 = r8.getMeasuredWidth()
            float r8 = (float) r12
            android.content.res.Resources r12 = defpackage.vo4.c()
            android.util.DisplayMetrics r12 = r12.getDisplayMetrics()
            float r12 = r12.density
            float r8 = r8 * r12
            int r8 = kotlin.math.MathKt.roundToInt((float) r8)
            int r8 = r8 + r1
            int r7 = r7 - r8
        L_0x02cd:
            boolean r1 = r4.get(r15)
            if (r1 != 0) goto L_0x02e3
            boolean r1 = r4.get(r14)
            if (r1 != 0) goto L_0x02e3
            boolean r1 = r4.get(r6)
            if (r1 == 0) goto L_0x02e0
            goto L_0x02e3
        L_0x02e0:
            r1 = r24
            goto L_0x02f2
        L_0x02e3:
            android.content.res.Resources r1 = defpackage.vo4.c()
            android.util.DisplayMetrics r1 = r1.getDisplayMetrics()
            float r1 = r1.density
            int r7 = defpackage.a81.e(r2, r1, r7)
            goto L_0x02e0
        L_0x02f2:
            boolean r8 = r4.get(r1)
            if (r8 == 0) goto L_0x0340
            boolean r1 = r11.get(r1)
            if (r1 != 0) goto L_0x0323
            boolean r1 = r11.get(r15)
            if (r1 != 0) goto L_0x0323
            boolean r1 = r11.get(r14)
            if (r1 != 0) goto L_0x0323
            boolean r1 = r11.get(r6)
            if (r1 != 0) goto L_0x0323
            boolean r1 = r11.get(r5)
            if (r1 == 0) goto L_0x0317
            goto L_0x0323
        L_0x0317:
            boolean r1 = r23.isLayoutRequested()
            if (r1 == 0) goto L_0x031e
            goto L_0x0323
        L_0x031e:
            r1 = r22
            r6 = r23
            goto L_0x0343
        L_0x0323:
            if (r7 > 0) goto L_0x0327
            r1 = 0
            goto L_0x032b
        L_0x0327:
            int r1 = android.view.View.MeasureSpec.makeMeasureSpec(r7, r9)
        L_0x032b:
            int r5 = r23.getLineHeight()
            r6 = 1073741824(0x40000000, float:2.0)
            int r5 = android.view.View.MeasureSpec.makeMeasureSpec(r5, r6)
            r23.forceLayout()
            r6 = r23
            r6.measure(r1, r5)
        L_0x033d:
            r1 = r22
            goto L_0x0343
        L_0x0340:
            r6 = r23
            goto L_0x033d
        L_0x0343:
            boolean r5 = r4.get(r1)
            if (r5 == 0) goto L_0x0356
            boolean r5 = r11.get(r1)
            if (r5 == 0) goto L_0x0356
            r7 = r21
            r5 = 0
            r7.measure(r5, r5)
            goto L_0x0358
        L_0x0356:
            r7 = r21
        L_0x0358:
            boolean r5 = r4.get(r1)
            if (r5 == 0) goto L_0x0363
            int r5 = r7.getMeasuredWidth()
            int r10 = r10 - r5
        L_0x0363:
            r5 = r25
            boolean r7 = r4.get(r5)
            if (r7 == 0) goto L_0x03a2
            boolean r7 = r11.get(r5)
            if (r7 == 0) goto L_0x03a2
            r7 = 68
            float r7 = (float) r7
            android.content.res.Resources r8 = defpackage.vo4.c()
            android.util.DisplayMetrics r8 = r8.getDisplayMetrics()
            float r8 = r8.density
            float r7 = r7 * r8
            int r7 = kotlin.math.MathKt.roundToInt((float) r7)
            r8 = 1073741824(0x40000000, float:2.0)
            int r7 = android.view.View.MeasureSpec.makeMeasureSpec(r7, r8)
            r12 = 20
            float r12 = (float) r12
            android.content.res.Resources r13 = defpackage.vo4.c()
            android.util.DisplayMetrics r13 = r13.getDisplayMetrics()
            float r13 = r13.density
            float r12 = r12 * r13
            int r12 = kotlin.math.MathKt.roundToInt((float) r12)
            int r12 = android.view.View.MeasureSpec.makeMeasureSpec(r12, r8)
            r3.measure(r7, r12)
        L_0x03a2:
            boolean r7 = r4.get(r5)
            if (r7 == 0) goto L_0x03ad
            int r3 = r3.getMeasuredWidth()
            int r10 = r10 - r3
        L_0x03ad:
            boolean r3 = r4.get(r5)
            if (r3 != 0) goto L_0x03b9
            boolean r3 = r4.get(r1)
            if (r3 == 0) goto L_0x03c7
        L_0x03b9:
            android.content.res.Resources r3 = defpackage.vo4.c()
            android.util.DisplayMetrics r3 = r3.getDisplayMetrics()
            float r3 = r3.density
            int r10 = defpackage.a81.e(r2, r3, r10)
        L_0x03c7:
            if (r10 > 0) goto L_0x03cb
            r10 = 0
            goto L_0x03cf
        L_0x03cb:
            int r10 = android.view.View.MeasureSpec.makeMeasureSpec(r10, r9)
        L_0x03cf:
            int r2 = r20.getLineHeight()
            r3 = 2
            int r2 = r2 * r3
            r3 = 1073741824(0x40000000, float:2.0)
            int r2 = android.view.View.MeasureSpec.makeMeasureSpec(r2, r3)
            r3 = r19
            boolean r7 = r4.get(r3)
            if (r7 == 0) goto L_0x040c
            boolean r3 = r11.get(r3)
            if (r3 != 0) goto L_0x0401
            boolean r3 = r11.get(r5)
            if (r3 != 0) goto L_0x0401
            boolean r3 = r11.get(r1)
            if (r3 != 0) goto L_0x0401
            boolean r3 = r20.isLayoutRequested()
            if (r3 == 0) goto L_0x03fc
            goto L_0x0401
        L_0x03fc:
            r7 = r16
            r3 = r20
            goto L_0x040f
        L_0x0401:
            r20.forceLayout()
            r3 = r20
            r3.measure(r10, r2)
        L_0x0409:
            r7 = r16
            goto L_0x040f
        L_0x040c:
            r3 = r20
            goto L_0x0409
        L_0x040f:
            boolean r4 = r4.get(r7)
            if (r4 == 0) goto L_0x0435
            boolean r4 = r11.get(r7)
            if (r4 != 0) goto L_0x042d
            boolean r4 = r11.get(r5)
            if (r4 != 0) goto L_0x042d
            boolean r1 = r11.get(r1)
            if (r1 != 0) goto L_0x042d
            boolean r1 = r18.isLayoutRequested()
            if (r1 == 0) goto L_0x0435
        L_0x042d:
            r18.forceLayout()
            r1 = r18
            r1.measure(r10, r2)
        L_0x0435:
            cf r1 = r0.N0
            if (r26 == 0) goto L_0x044f
            int r2 = android.view.View.MeasureSpec.getSize(r31)
            if (r2 > 0) goto L_0x044f
            android.os.Handler r2 = r30.getHandler()
            if (r2 == 0) goto L_0x0468
            r2.removeCallbacks(r1)
            r2.post(r1)
            r1 = 1
            r0.M0 = r1
            goto L_0x0468
        L_0x044f:
            boolean r2 = r0.M0
            if (r2 == 0) goto L_0x0460
            android.os.Handler r2 = r30.getHandler()
            if (r2 == 0) goto L_0x045c
            r2.removeCallbacks(r1)
        L_0x045c:
            r1 = 0
            r0.M0 = r1
            goto L_0x0461
        L_0x0460:
            r1 = 0
        L_0x0461:
            int r2 = r11.size()
            r11.set(r1, r2, r1)
        L_0x0468:
            int r1 = r30.getPaddingTop()
            int r2 = r30.getPaddingBottom()
            int r2 = r2 + r1
            int r1 = r6.getMeasuredHeight()
            int r1 = r1 + r2
            int r2 = r3.getMeasuredHeight()
            int r2 = r2 + r1
            r1 = 2
            float r1 = (float) r1
            android.content.res.Resources r3 = defpackage.vo4.c()
            android.util.DisplayMetrics r3 = r3.getDisplayMetrics()
            float r3 = r3.density
            int r1 = defpackage.g63.b(r1, r3, r2)
            r2 = 82
            float r2 = (float) r2
            android.content.res.Resources r3 = defpackage.vo4.c()
            android.util.DisplayMetrics r3 = r3.getDisplayMetrics()
            float r3 = r3.density
            float r2 = r2 * r3
            int r2 = kotlin.math.MathKt.roundToInt((float) r2)
            int r1 = java.lang.Math.max(r1, r2)
            r2 = r32
            r0.setMeasuredDimension(r2, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.i42.onMeasure(int, int):void");
    }

    public final void onThemeChanged(k2b k2b) {
        Drawable drawable;
        Drawable drawable2;
        Drawable drawable3;
        Drawable drawable4;
        this.a.onThemeChanged(k2b);
        TextView textView = this.b;
        textView.setTextColor(k2b.getText().e);
        int i = k2b.getText().f;
        b15 b15 = this.c;
        b15.setTextColor(i);
        TextView textView2 = this.v;
        textView2.setTextColor(k2b.getText().h);
        this.w.onThemeChanged(k2b);
        iq.a0(this.y0.getBackground(), k2b.getIcon().g);
        iq.a0(this.z0.getBackground(), k2b.getIcon().g);
        Lazy lazy = this.z;
        Object[] objArr = null;
        Lazy lazy2 = lazy.isInitialized() ? lazy : null;
        if (!(lazy2 == null || (drawable4 = (Drawable) lazy2.getValue()) == null)) {
            k2b.getIcon().getClass();
            iq.a0(drawable4, -16745729);
        }
        Lazy lazy3 = this.y;
        if (!lazy3.isInitialized()) {
            lazy3 = null;
        }
        if (!(lazy3 == null || (drawable3 = (Drawable) lazy3.getValue()) == null)) {
            iq.a0(drawable3, k2b.getIcon().g);
        }
        if (!lazy.isInitialized()) {
            lazy = null;
        }
        if (!(lazy == null || (drawable2 = (Drawable) lazy.getValue()) == null)) {
            k2b.getIcon().getClass();
            iq.a0(drawable2, -16745729);
        }
        Lazy lazy4 = this.v0;
        if (!lazy4.isInitialized()) {
            lazy4 = null;
        }
        if (!(lazy4 == null || (drawable = (Drawable) lazy4.getValue()) == null)) {
            k2b.getIcon().getClass();
            iq.a0(drawable, -16745729);
        }
        Lazy lazy5 = this.w0;
        if (!lazy5.isInitialized()) {
            lazy5 = null;
        }
        Drawable drawable5 = lazy5 != null ? (Drawable) lazy5.getValue() : null;
        EnhancedVectorDrawable enhancedVectorDrawable = drawable5 instanceof EnhancedVectorDrawable ? (EnhancedVectorDrawable) drawable5 : null;
        if (enhancedVectorDrawable != null) {
            hi7.Y(enhancedVectorDrawable, "error", k2b.c().a.e);
        }
        getRippleDrawable().setColor(ColorStateList.valueOf(k2b.b().a.f));
        CharSequence text = textView.getText();
        Spanned spanned = text instanceof Spanned ? (Spanned) text : null;
        Class<phf> cls = phf.class;
        Object[] spans = spanned != null ? spanned.getSpans(0, textView.getText().length(), cls) : null;
        if (spans == null) {
            spans = new phf[0];
        }
        for (Object obj : spans) {
            phf phf = (phf) obj;
            phf.onThemeChanged(k2b);
            wgf.c(textView, phf);
        }
        CharSequence text2 = b15.getText();
        Spanned spanned2 = text2 instanceof Spanned ? (Spanned) text2 : null;
        Object[] spans2 = spanned2 != null ? spanned2.getSpans(0, b15.getText().length(), cls) : null;
        if (spans2 == null) {
            spans2 = new phf[0];
        }
        for (Object obj2 : spans2) {
            phf phf2 = (phf) obj2;
            phf2.onThemeChanged(k2b);
            wgf.c(b15, phf2);
        }
        CharSequence text3 = textView2.getText();
        Spanned spanned3 = text3 instanceof Spanned ? (Spanned) text3 : null;
        Object[] spans3 = spanned3 != null ? spanned3.getSpans(0, textView2.getText().length(), cls) : null;
        if (spans3 == null) {
            spans3 = new phf[0];
        }
        for (Object obj3 : spans3) {
            phf phf3 = (phf) obj3;
            phf3.onThemeChanged(k2b);
            wgf.c(textView2, phf3);
        }
        this.P0.onThemeChanged(k2b);
        k2b f = fu4.k.e(getContext()).f();
        b15 b152 = this.o;
        CharSequence text4 = b152.getText();
        Spanned spanned4 = text4 instanceof Spanned ? (Spanned) text4 : null;
        if (spanned4 != null) {
            objArr = spanned4.getSpans(0, b152.getText().length(), cls);
        }
        if (objArr == null) {
            objArr = new phf[0];
        }
        for (Object obj4 : objArr) {
            phf phf4 = (phf) obj4;
            phf4.onThemeChanged(f);
            wgf.c(b152, phf4);
        }
        invalidate();
    }

    public final void setAvatar(Uri uri) {
        String uri2 = uri != null ? uri.toString() : null;
        OneMeAvatarView oneMeAvatarView = this.a;
        oneMeAvatarView.setAvatarUrl(uri2);
        boolean z2 = true;
        oneMeAvatarView.f((gd0) null, true);
        this.B0.set(0, true);
        BitSet bitSet = this.C0;
        if (uri == null) {
            z2 = false;
        }
        bitSet.set(0, z2);
        requestLayout();
    }

    public final void setAvatarClickListener(View.OnClickListener onClickListener) {
        ct.G(this.a, 300, onClickListener);
    }

    public final void setCall(CharSequence charSequence) {
        BitSet bitSet = this.C0;
        boolean z2 = charSequence == null || StringsKt.isBlank(charSequence);
        int i = this.K0;
        bitSet.set(i, !z2);
        this.B0.set(i, true);
        requestLayout();
    }

    public final void setMention(boolean z2) {
        this.w.c(z2);
        BitSet bitSet = this.C0;
        d(bitSet, bitSet.get(this.G0) || z2);
        d(this.B0, true);
        requestLayout();
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x003c  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void setMuted(boolean r13) {
        /*
            r12 = this;
            java.util.BitSet r0 = r12.C0
            int r1 = r12.J0
            r0.set(r1, r13)
            java.util.BitSet r2 = r12.B0
            boolean r3 = r2.get(r1)
            r4 = 0
            r5 = 1
            if (r3 != 0) goto L_0x0025
            android.view.View r3 = r12.z0
            int r3 = r3.getVisibility()
            if (r3 != 0) goto L_0x001b
            r3 = r5
            goto L_0x001c
        L_0x001b:
            r3 = r4
        L_0x001c:
            boolean r6 = r0.get(r1)
            if (r3 == r6) goto L_0x0023
            goto L_0x0025
        L_0x0023:
            r3 = r4
            goto L_0x0026
        L_0x0025:
            r3 = r5
        L_0x0026:
            r2.set(r1, r3)
            yea r1 = r12.w
            xea r6 = r1.o
            boolean r3 = r6.d
            r7 = 0
            r11 = 7
            r8 = 0
            r9 = 0
            r10 = r13
            xea r6 = defpackage.xea.a(r6, r7, r8, r9, r10, r11)
            r1.o = r6
            if (r3 == r13) goto L_0x004d
            js9 r3 = defpackage.fu4.k
            android.content.Context r6 = r1.getContext()
            fu4 r3 = r3.e(r6)
            k2b r3 = r3.f()
            r1.b(r13, r3)
        L_0x004d:
            int r1 = r12.G0
            boolean r3 = r0.get(r1)
            if (r3 != 0) goto L_0x0057
            if (r13 == 0) goto L_0x0058
        L_0x0057:
            r4 = r5
        L_0x0058:
            r0.set(r1, r4)
            r2.set(r1, r5)
            r12.requestLayout()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.i42.setMuted(boolean):void");
    }

    public final void setOnline(boolean z2) {
        this.a.setOnlineBadgeVisibility(z2);
        this.B0.set(0, true);
        requestLayout();
    }

    public final void setPinned(boolean z2) {
        this.C0.set(this.I0, z2);
        requestLayout();
    }

    public final void setReaction(boolean z2) {
        this.w.d(z2);
        BitSet bitSet = this.C0;
        d(bitSet, bitSet.get(this.G0) || z2);
        d(this.B0, true);
        requestLayout();
    }

    public final void setStatus(h42 h42) {
        Drawable drawable;
        View view = this.x;
        int ordinal = h42.ordinal();
        boolean z2 = true;
        if (ordinal == 0) {
            drawable = null;
        } else if (ordinal == 1) {
            drawable = (Drawable) this.y.getValue();
        } else if (ordinal == 2) {
            drawable = (Drawable) this.z.getValue();
        } else if (ordinal == 3) {
            drawable = (Drawable) this.v0.getValue();
        } else if (ordinal == 4) {
            drawable = (Drawable) this.w0.getValue();
        } else {
            throw new NoWhenBranchMatchedException();
        }
        view.setBackground(drawable);
        BitSet bitSet = this.C0;
        boolean z3 = view.getBackground() != null;
        int i = this.H0;
        bitSet.set(i, z3);
        BitSet bitSet2 = this.B0;
        if ((view.getVisibility() == 0) == bitSet.get(i)) {
            z2 = false;
        }
        bitSet2.set(i, z2);
        requestLayout();
    }

    public final void setSubtitle(CharSequence charSequence) {
        b15 b15 = this.c;
        CharSequence text = b15.getText();
        BitSet bitSet = this.B0;
        int i = this.E0;
        boolean z2 = true;
        if (text != charSequence) {
            b15.setText(charSequence);
            bitSet.set(i, true);
        }
        BitSet bitSet2 = this.C0;
        bitSet2.set(i, charSequence != null && !StringsKt.isBlank(charSequence) && !bitSet2.get(this.L0));
        if (!bitSet.get(i)) {
            if (bitSet2.get(i) == (b15.getVisibility() == 0)) {
                z2 = false;
            }
        }
        bitSet.set(i, z2);
        k2b f = fu4.k.e(getContext()).f();
        CharSequence text2 = b15.getText();
        Object[] objArr = null;
        Spanned spanned = text2 instanceof Spanned ? (Spanned) text2 : null;
        if (spanned != null) {
            objArr = spanned.getSpans(0, b15.getText().length(), phf.class);
        }
        if (objArr == null) {
            objArr = new phf[0];
        }
        for (Object obj : objArr) {
            phf phf = (phf) obj;
            phf.onThemeChanged(f);
            wgf.c(b15, phf);
        }
        requestLayout();
    }

    public final void setTime(CharSequence charSequence) {
        TextView textView = this.v;
        CharSequence text = textView.getText();
        BitSet bitSet = this.B0;
        int i = this.F0;
        boolean z2 = true;
        if (text != charSequence) {
            textView.setText(charSequence);
            bitSet.set(i, true);
        }
        BitSet bitSet2 = this.C0;
        bitSet2.set(i, charSequence != null && !StringsKt.isBlank(charSequence));
        if (!bitSet.get(i)) {
            if (bitSet2.get(i) == (textView.getVisibility() == 0)) {
                z2 = false;
            }
        }
        bitSet.set(i, z2);
        requestLayout();
    }

    public final void setTitle(CharSequence charSequence) {
        TextView textView = this.b;
        CharSequence text = textView.getText();
        BitSet bitSet = this.B0;
        int i = this.D0;
        boolean z2 = true;
        if (text != charSequence) {
            textView.setText(charSequence);
            bitSet.set(i, true);
        }
        BitSet bitSet2 = this.C0;
        bitSet2.set(i, charSequence != null && !StringsKt.isBlank(charSequence));
        if (!bitSet.get(i)) {
            if (bitSet2.get(i) == (textView.getVisibility() == 0)) {
                z2 = false;
            }
        }
        bitSet.set(i, z2);
        k2b f = fu4.k.e(getContext()).f();
        CharSequence text2 = textView.getText();
        Object[] objArr = null;
        Spanned spanned = text2 instanceof Spanned ? (Spanned) text2 : null;
        if (spanned != null) {
            objArr = spanned.getSpans(0, textView.getText().length(), phf.class);
        }
        if (objArr == null) {
            objArr = new phf[0];
        }
        for (Object obj : objArr) {
            phf phf = (phf) obj;
            phf.onThemeChanged(f);
            wgf.c(textView, phf);
        }
        requestLayout();
    }

    public final void setTyping(CharSequence charSequence) {
        b15 b15 = this.o;
        CharSequence text = b15.getText();
        BitSet bitSet = this.B0;
        int i = this.L0;
        boolean z2 = true;
        if (text != charSequence) {
            b15.setText(charSequence);
            this.P0.start();
            bitSet.set(i, true);
        }
        BitSet bitSet2 = this.C0;
        bitSet2.set(i, charSequence != null && !StringsKt.isBlank(charSequence));
        b15 b152 = this.c;
        CharSequence text2 = b152.getText();
        bitSet2.set(this.E0, text2 != null && !StringsKt.isBlank(text2) && !bitSet2.get(i));
        if (!bitSet.get(i)) {
            if (bitSet2.get(i) == (b152.getVisibility() == 0)) {
                z2 = false;
            }
        }
        bitSet.set(i, z2);
        k2b f = fu4.k.e(getContext()).f();
        CharSequence text3 = b15.getText();
        Object[] objArr = null;
        Spanned spanned = text3 instanceof Spanned ? (Spanned) text3 : null;
        if (spanned != null) {
            objArr = spanned.getSpans(0, b15.getText().length(), phf.class);
        }
        if (objArr == null) {
            objArr = new phf[0];
        }
        for (Object obj : objArr) {
            phf phf = (phf) obj;
            phf.onThemeChanged(f);
            wgf.c(b15, phf);
        }
        requestLayout();
    }

    public final void setVerified(boolean z2) {
        TextView textView = this.b;
        m2g S = m5a.S(wgf.f(textView));
        l2g l2g = null;
        if (z2) {
            l2g b2 = wgf.b(textView);
            if ((b2 != null ? b2.a : null) == S) {
                return;
            }
        }
        if (z2) {
            l2g b3 = wgf.b(textView);
            if ((b3 != null ? b3.a : null) != S) {
                l2g = new l2g(getContext(), S, new gl1(4));
            }
        }
        wgf.e(textView, l2g);
    }

    public final boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.P0;
    }
}
