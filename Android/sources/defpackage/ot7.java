package defpackage;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Lazy;
import kotlin.NoWhenBranchMatchedException;
import kotlin.math.MathKt;

/* renamed from: ot7  reason: default package */
public final class ot7 extends h3b {
    public final nt7 H0;
    public boolean I0;

    /* JADX WARNING: type inference failed for: r0v0, types: [nt7, androidx.constraintlayout.widget.ConstraintLayout, android.view.View, android.view.ViewGroup] */
    public ot7(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        ? constraintLayout = new ConstraintLayout(context, attributeSet);
        constraintLayout.setMinHeight(MathKt.roundToInt(((float) 52) * vo4.c().getDisplayMetrics().density));
        this.H0 = constraintLayout;
        this.I0 = constraintLayout.getShouldUpdateConstraints$common_release();
        addView(constraintLayout, new FrameLayout.LayoutParams(-1, -2));
        constraintLayout.addView(getTitleTextView());
        l();
        m();
        setShouldUpdateConstraints(true);
        requestLayout();
    }

    public final void f(j7e j7e) {
        this.H0.addView(j7e, new fj3(0, -2));
    }

    public boolean getShouldUpdateConstraints() {
        return this.I0;
    }

    public final void h(View view) {
        this.H0.addView(view);
    }

    public final void i(View view) {
        this.H0.removeView(view);
    }

    public final void j() {
        z2b form = getForm();
        TextView titleTextView = getTitleTextView();
        nt7 nt7 = this.H0;
        nt7.getClass();
        int ordinal = form.ordinal();
        if (ordinal == 0) {
            ViewGroup.LayoutParams layoutParams = titleTextView.getLayoutParams();
            if (layoutParams != null) {
                layoutParams.width = -2;
                layoutParams.height = -2;
                titleTextView.setLayoutParams(layoutParams);
                ViewGroup.LayoutParams layoutParams2 = nt7.getLayoutParams();
                if (layoutParams2 != null) {
                    layoutParams2.height = MathKt.roundToInt(((float) 52) * vo4.c().getDisplayMetrics().density);
                    nt7.setLayoutParams(layoutParams2);
                    return;
                }
                throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
            }
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
        } else if (ordinal == 1) {
            ViewGroup.LayoutParams layoutParams3 = titleTextView.getLayoutParams();
            if (layoutParams3 != null) {
                layoutParams3.width = 0;
                layoutParams3.height = -2;
                titleTextView.setLayoutParams(layoutParams3);
                ViewGroup.LayoutParams layoutParams4 = nt7.getLayoutParams();
                if (layoutParams4 != null) {
                    layoutParams4.height = MathKt.roundToInt(((float) 52) * vo4.c().getDisplayMetrics().density);
                    nt7.setLayoutParams(layoutParams4);
                    return;
                }
                throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
            }
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
        } else if (ordinal == 2) {
            ViewGroup.LayoutParams layoutParams5 = titleTextView.getLayoutParams();
            if (layoutParams5 != null) {
                layoutParams5.width = -2;
                layoutParams5.height = -2;
                titleTextView.setLayoutParams(layoutParams5);
                ViewGroup.LayoutParams layoutParams6 = nt7.getLayoutParams();
                if (layoutParams6 != null) {
                    layoutParams6.height = MathKt.roundToInt(((float) 64) * vo4.c().getDisplayMetrics().density);
                    nt7.setLayoutParams(layoutParams6);
                    return;
                }
                throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
            }
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
        } else {
            throw new NoWhenBranchMatchedException();
        }
    }

    public final void n() {
        z2b form = getForm();
        Lazy<j7e> subtitleTextViewLazy = getSubtitleTextViewLazy();
        this.H0.getClass();
        if (subtitleTextViewLazy.isInitialized()) {
            j7e value = subtitleTextViewLazy.getValue();
            ViewGroup.LayoutParams layoutParams = value.getLayoutParams();
            if (layoutParams != null) {
                layoutParams.width = form == z2b.b ? 0 : -2;
                layoutParams.height = -2;
                value.setLayoutParams(layoutParams);
                return;
            }
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:59:0x025f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onMeasure(int r19, int r20) {
        /*
            r18 = this;
            r0 = r18
            super.onMeasure(r19, r20)
            boolean r1 = r18.getShouldUpdateConstraints()
            if (r1 == 0) goto L_0x03f1
            android.widget.TextView r1 = r18.getTitleTextView()
            kotlin.Lazy r2 = r18.getTitleAvatarViewLazy()
            kotlin.Lazy r3 = r18.getSubtitleTextViewLazy()
            kotlin.Lazy r4 = r18.getTitleDropdownViewLazy()
            android.view.View r5 = r18.getRightSecondaryView()
            android.view.View r6 = r18.getRightPrimaryView()
            android.view.View r7 = r18.getLeftView()
            kotlin.Lazy r8 = r18.getSelectionViewLazy()
            z2b r9 = r18.getForm()
            nt7 r10 = r0.H0
            r10.getClass()
            pj3 r11 = new pj3
            r11.<init>()
            r11.d(r10)
            int r9 = r9.ordinal()
            r13 = 2
            r15 = 3
            r12 = 0
            if (r9 == 0) goto L_0x0299
            r14 = 1
            if (r9 == r14) goto L_0x0206
            if (r9 != r13) goto L_0x0200
            android.view.View r2 = defpackage.y7e.t(r2)
            android.view.View r4 = defpackage.y7e.t(r4)
            android.view.View r3 = defpackage.y7e.t(r3)
            android.view.View r8 = defpackage.y7e.t(r8)
            if (r7 == 0) goto L_0x006b
            int r9 = r7.getId()
            r11.e(r9, r15, r12, r15)
            r14 = 4
            r11.e(r9, r14, r12, r14)
            r14 = 6
            r11.e(r9, r14, r12, r14)
        L_0x006b:
            if (r7 == 0) goto L_0x0072
            int r9 = r7.getMeasuredWidth()
            goto L_0x0073
        L_0x0072:
            r9 = r12
        L_0x0073:
            if (r5 == 0) goto L_0x007a
            int r14 = r5.getMeasuredWidth()
            goto L_0x007b
        L_0x007a:
            r14 = r12
        L_0x007b:
            if (r6 == 0) goto L_0x0082
            int r16 = r6.getMeasuredWidth()
            goto L_0x0084
        L_0x0082:
            r16 = r12
        L_0x0084:
            int r14 = r14 + r16
            int r9 = java.lang.Math.max(r9, r14)
            r15 = 8
            float r15 = (float) r15
            android.content.res.Resources r16 = defpackage.vo4.c()
            android.util.DisplayMetrics r13 = r16.getDisplayMetrics()
            float r13 = r13.density
            float r13 = r13 * r15
            int r13 = kotlin.math.MathKt.roundToInt((float) r13)
            if (r2 == 0) goto L_0x00f2
            int r12 = r2.getId()
            ni0 r0 = new ni0
            r17 = r10
            r10 = 4
            r0.<init>((java.lang.Object) r11, (int) r12, (int) r10)
            r10 = 0
            r0.R(r10)
            r0.b(r10)
            if (r7 == 0) goto L_0x00d0
            int r7 = r7.getId()
            ila r7 = r0.O(r7)
            android.content.res.Resources r10 = defpackage.vo4.c()
            android.util.DisplayMetrics r10 = r10.getDisplayMetrics()
            float r10 = r10.density
            float r10 = r10 * r15
            int r10 = kotlin.math.MathKt.roundToInt((float) r10)
            r12 = 2
            int r10 = r10 / r12
            r7.e(r10)
            goto L_0x00e2
        L_0x00d0:
            r7 = 0
            ila r10 = r0.P(r7)
            android.content.res.Resources r7 = defpackage.vo4.c()
            android.util.DisplayMetrics r7 = r7.getDisplayMetrics()
            float r7 = r7.density
            defpackage.tr1.u(r15, r7, r10)
        L_0x00e2:
            int r7 = r1.getId()
            r0.v(r7)
            r7 = 0
            r0.x(r7)
            r7 = 2
            r0.z(r7)
            goto L_0x00f4
        L_0x00f2:
            r17 = r10
        L_0x00f4:
            if (r4 == 0) goto L_0x0132
            int r0 = r4.getId()
            int r7 = r1.getId()
            r10 = 3
            r11.e(r0, r10, r7, r10)
            int r7 = r1.getId()
            r10 = 4
            r11.e(r0, r10, r7, r10)
            int r7 = r1.getId()
            r10 = 7
            r12 = 6
            r11.e(r0, r12, r7, r10)
            r7 = 0
            r11.e(r0, r10, r7, r10)
            ila r7 = new ila
            r12 = 4
            r7.<init>(r11, r10, r0, r12)
            r7.e(r14)
            kj3 r7 = r11.j(r0)
            lj3 r7 = r7.d
            r10 = 2
            r7.V = r10
            kj3 r0 = r11.j(r0)
            lj3 r0 = r0.d
            r7 = 0
            r0.w = r7
        L_0x0132:
            int r0 = r1.getId()
            ni0 r7 = new ni0
            r10 = 4
            r7.<init>((java.lang.Object) r11, (int) r0, (int) r10)
            r10 = 0
            r7.R(r10)
            defpackage.kr7.i(r7, r3)
            r10 = 1056964608(0x3f000000, float:0.5)
            if (r2 == 0) goto L_0x0161
            r12 = 0
            r7.x(r12)
            int r12 = r2.getId()
            ila r12 = r7.O(r12)
            android.content.res.Resources r14 = defpackage.vo4.c()
            android.util.DisplayMetrics r14 = r14.getDisplayMetrics()
            float r14 = r14.density
            defpackage.tr1.u(r15, r14, r12)
            goto L_0x016c
        L_0x0161:
            r7.x(r10)
            r12 = 0
            ila r14 = r7.P(r12)
            r14.e(r9)
        L_0x016c:
            if (r4 == 0) goto L_0x0186
            int r4 = r4.getId()
            ila r4 = r7.v(r4)
            r12 = 2
            float r14 = (float) r12
            android.content.res.Resources r12 = defpackage.vo4.c()
            android.util.DisplayMetrics r12 = r12.getDisplayMetrics()
            float r12 = r12.density
            defpackage.tr1.u(r14, r12, r4)
            goto L_0x01aa
        L_0x0186:
            if (r5 == 0) goto L_0x0194
            int r4 = r5.getId()
            ila r4 = r7.v(r4)
            r4.e(r13)
            goto L_0x01aa
        L_0x0194:
            if (r6 == 0) goto L_0x01a2
            int r4 = r6.getId()
            ila r4 = r7.v(r4)
            r4.e(r13)
            goto L_0x01aa
        L_0x01a2:
            r4 = 0
            ila r12 = r7.t(r4)
            r12.e(r9)
        L_0x01aa:
            r7.k()
            r4 = 2
            r7.z(r4)
            kj3 r0 = r11.j(r0)
            lj3 r0 = r0.d
            r0.W = r4
            if (r3 == 0) goto L_0x01f6
            int r0 = r3.getId()
            ni0 r3 = new ni0
            r4 = 4
            r3.<init>((java.lang.Object) r11, (int) r0, (int) r4)
            int r0 = r1.getId()
            r3.Q(r0)
            r0 = 0
            r3.b(r0)
            int r4 = r1.getId()
            r3.P(r4)
            if (r2 == 0) goto L_0x01e1
            r3.t(r0)
            r0 = 0
            r3.x(r0)
            goto L_0x01ef
        L_0x01e1:
            r3.x(r10)
            int r0 = r1.getId()
            ila r0 = r3.t(r0)
            r0.e(r9)
        L_0x01ef:
            r3.k()
            r0 = 2
            r3.z(r0)
        L_0x01f6:
            defpackage.kr7.n(r11, r8)
            defpackage.kr7.m(r11, r5, r6, r13)
        L_0x01fc:
            r0 = r17
            goto L_0x03e5
        L_0x0200:
            kotlin.NoWhenBranchMatchedException r0 = new kotlin.NoWhenBranchMatchedException
            r0.<init>()
            throw r0
        L_0x0206:
            r17 = r10
            android.view.View r0 = defpackage.y7e.t(r3)
            android.view.View r2 = defpackage.y7e.t(r8)
            int r3 = r1.getId()
            ni0 r4 = new ni0
            r7 = 4
            r4.<init>((java.lang.Object) r11, (int) r3, (int) r7)
            r3 = 0
            r4.R(r3)
            defpackage.kr7.i(r4, r0)
            r4.P(r3)
            r3 = 16
            if (r5 == 0) goto L_0x0240
            int r7 = r5.getId()
            ila r4 = r4.v(r7)
            float r3 = (float) r3
            android.content.res.Resources r7 = defpackage.vo4.c()
            android.util.DisplayMetrics r7 = r7.getDisplayMetrics()
            float r7 = r7.density
            defpackage.tr1.u(r3, r7, r4)
        L_0x023e:
            r3 = 0
            goto L_0x025d
        L_0x0240:
            if (r6 == 0) goto L_0x0259
            int r7 = r6.getId()
            ila r4 = r4.v(r7)
            float r3 = (float) r3
            android.content.res.Resources r7 = defpackage.vo4.c()
            android.util.DisplayMetrics r7 = r7.getDisplayMetrics()
            float r7 = r7.density
            defpackage.tr1.u(r3, r7, r4)
            goto L_0x023e
        L_0x0259:
            r3 = 0
            r4.t(r3)
        L_0x025d:
            if (r0 == 0) goto L_0x027f
            int r0 = r0.getId()
            int r4 = r1.getId()
            r7 = 3
            r8 = 4
            r11.e(r0, r7, r4, r8)
            r11.e(r0, r8, r3, r8)
            int r3 = r1.getId()
            r4 = 6
            r11.e(r0, r4, r3, r4)
            int r1 = r1.getId()
            r3 = 7
            r11.e(r0, r3, r1, r3)
        L_0x027f:
            defpackage.kr7.n(r11, r2)
            r0 = 12
            float r0 = (float) r0
            android.content.res.Resources r1 = defpackage.vo4.c()
            android.util.DisplayMetrics r1 = r1.getDisplayMetrics()
            float r1 = r1.density
            float r0 = r0 * r1
            int r0 = kotlin.math.MathKt.roundToInt((float) r0)
            defpackage.kr7.m(r11, r5, r6, r0)
            goto L_0x01fc
        L_0x0299:
            r17 = r10
            android.view.View r0 = defpackage.y7e.t(r2)
            android.view.View r2 = defpackage.y7e.t(r4)
            android.view.View r3 = defpackage.y7e.t(r3)
            android.view.View r4 = defpackage.y7e.t(r8)
            if (r7 == 0) goto L_0x02be
            int r8 = r7.getId()
            r9 = 3
            r10 = 0
            r11.e(r8, r9, r10, r9)
            r9 = 4
            r11.e(r8, r9, r10, r9)
            r9 = 6
            r11.e(r8, r9, r10, r9)
        L_0x02be:
            int r7 = defpackage.kr7.w(r7)
            int r8 = defpackage.kr7.w(r5)
            int r9 = defpackage.kr7.w(r6)
            int r9 = r9 + r8
            int r7 = java.lang.Math.max(r7, r9)
            if (r0 == 0) goto L_0x0304
            int r8 = r0.getId()
            int r9 = r1.getId()
            r10 = 3
            r11.e(r8, r10, r9, r10)
            int r9 = r1.getId()
            r10 = 4
            r11.e(r8, r10, r9, r10)
            r9 = 6
            r10 = 0
            r11.e(r8, r9, r10, r9)
            ila r10 = new ila
            r12 = 4
            r10.<init>(r11, r9, r8, r12)
            r10.e(r7)
            int r10 = r1.getId()
            r12 = 7
            r11.e(r8, r12, r10, r9)
            kj3 r8 = r11.j(r8)
            lj3 r8 = r8.d
            r9 = 2
            r8.V = r9
        L_0x0304:
            if (r2 == 0) goto L_0x0339
            int r8 = r2.getId()
            int r9 = r1.getId()
            r10 = 3
            r11.e(r8, r10, r9, r10)
            int r9 = r1.getId()
            r10 = 4
            r11.e(r8, r10, r9, r10)
            int r9 = r1.getId()
            r10 = 7
            r12 = 6
            r11.e(r8, r12, r9, r10)
            r9 = 0
            r11.e(r8, r10, r9, r10)
            ila r9 = new ila
            r12 = 4
            r9.<init>(r11, r10, r8, r12)
            r9.e(r7)
            kj3 r8 = r11.j(r8)
            lj3 r8 = r8.d
            r9 = 2
            r8.V = r9
        L_0x0339:
            int r8 = r1.getId()
            ni0 r9 = new ni0
            r10 = 4
            r9.<init>((java.lang.Object) r11, (int) r8, (int) r10)
            r10 = 0
            r9.R(r10)
            defpackage.kr7.i(r9, r3)
            if (r0 == 0) goto L_0x0365
            int r12 = r0.getId()
            ila r12 = r9.O(r12)
            r13 = 8
            float r13 = (float) r13
            android.content.res.Resources r14 = defpackage.vo4.c()
            android.util.DisplayMetrics r14 = r14.getDisplayMetrics()
            float r14 = r14.density
            defpackage.tr1.u(r13, r14, r12)
            goto L_0x036c
        L_0x0365:
            ila r12 = r9.P(r10)
            r12.e(r7)
        L_0x036c:
            if (r2 == 0) goto L_0x0386
            int r2 = r2.getId()
            ila r2 = r9.v(r2)
            r10 = 2
            float r7 = (float) r10
            android.content.res.Resources r12 = defpackage.vo4.c()
            android.util.DisplayMetrics r12 = r12.getDisplayMetrics()
            float r12 = r12.density
            defpackage.tr1.u(r7, r12, r2)
            goto L_0x038f
        L_0x0386:
            r2 = 0
            r10 = 2
            ila r12 = r9.t(r2)
            r12.e(r7)
        L_0x038f:
            kj3 r2 = r11.j(r8)
            lj3 r2 = r2.d
            r2.W = r10
            r9.z(r10)
            r9.k()
            if (r3 == 0) goto L_0x03cb
            int r2 = r3.getId()
            int r3 = r1.getId()
            r7 = 3
            r8 = 4
            r11.e(r2, r7, r3, r8)
            r3 = 0
            r11.e(r2, r8, r3, r8)
            if (r0 == 0) goto L_0x03bb
            int r0 = r0.getId()
            r3 = 6
            r11.e(r2, r3, r0, r3)
            goto L_0x03c3
        L_0x03bb:
            r3 = 6
            int r0 = r1.getId()
            r11.e(r2, r3, r0, r3)
        L_0x03c3:
            int r0 = r1.getId()
            r1 = 7
            r11.e(r2, r1, r0, r1)
        L_0x03cb:
            defpackage.kr7.n(r11, r4)
            r0 = 12
            float r0 = (float) r0
            android.content.res.Resources r1 = defpackage.vo4.c()
            android.util.DisplayMetrics r1 = r1.getDisplayMetrics()
            float r1 = r1.density
            float r0 = r0 * r1
            int r0 = kotlin.math.MathKt.roundToInt((float) r0)
            defpackage.kr7.m(r11, r5, r6, r0)
            goto L_0x01fc
        L_0x03e5:
            r11.a(r0)
            r1 = 0
            r0 = r18
            r0.setShouldUpdateConstraints(r1)
            super.onMeasure(r19, r20)
        L_0x03f1:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ot7.onMeasure(int, int):void");
    }

    public void setShouldUpdateConstraints(boolean z) {
        this.I0 = z;
    }
}
