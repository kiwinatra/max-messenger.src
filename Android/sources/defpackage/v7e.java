package defpackage;

import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatEditText;
import androidx.appcompat.widget.AppCompatTextView;
import one.me.sdk.uikit.common.button.OneMeButton;

/* renamed from: v7e  reason: default package */
public final class v7e extends y0c {
    public o54 D0;
    public final TextView E0;
    public final AppCompatEditText F0;
    public final AppCompatTextView G0;
    public final OneMeButton H0;
    public final ImageView I0;
    public final ImageView J0;
    public final LinearLayout K0;
    public final TextView L0;
    public final TextView M0;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public v7e(android.content.Context r20) {
        /*
            r19 = this;
            r0 = r19
            r1 = r20
            android.widget.LinearLayout r2 = new android.widget.LinearLayout
            r2.<init>(r1)
            r0.<init>(r2)
            android.widget.TextView r3 = new android.widget.TextView
            r3.<init>(r1)
            android.widget.LinearLayout$LayoutParams r4 = new android.widget.LinearLayout$LayoutParams
            r5 = -2
            r6 = -1
            r4.<init>(r5, r6)
            r3.setLayoutParams(r4)
            r4 = 16
            r3.setGravity(r4)
            ogf r7 = defpackage.puf.k
            r7.b(r3, defpackage.uy4.b)
            r0.E0 = r3
            androidx.appcompat.widget.AppCompatEditText r8 = new androidx.appcompat.widget.AppCompatEditText
            r9 = 0
            r8.<init>(r1, r9)
            android.widget.LinearLayout$LayoutParams r10 = new android.widget.LinearLayout$LayoutParams
            r10.<init>(r5, r5)
            r11 = 1065353216(0x3f800000, float:1.0)
            r10.weight = r11
            r12 = 0
            float r13 = (float) r12
            android.content.res.Resources r14 = defpackage.vo4.c()
            android.util.DisplayMetrics r14 = r14.getDisplayMetrics()
            float r14 = r14.density
            float r14 = r14 * r13
            int r14 = kotlin.math.MathKt.roundToInt((float) r14)
            r15 = 12
            float r15 = (float) r15
            android.content.res.Resources r16 = defpackage.vo4.c()
            android.util.DisplayMetrics r12 = r16.getDisplayMetrics()
            float r12 = r12.density
            float r12 = r12 * r15
            int r12 = kotlin.math.MathKt.roundToInt((float) r12)
            int r6 = r8.getPaddingTop()
            int r4 = r8.getPaddingBottom()
            r8.setPaddingRelative(r14, r6, r12, r4)
            r8.setLayoutParams(r10)
            android.text.TextUtils$TruncateAt r4 = android.text.TextUtils.TruncateAt.END
            r8.setEllipsize(r4)
            r6 = 524288(0x80000, float:7.34684E-40)
            r8.setInputType(r6)
            r7.b(r8, defpackage.uy4.b)
            r8.setBackground(r9)
            r6 = 1
            r8.setSingleLine(r6)
            js9 r10 = defpackage.fu4.k
            android.content.Context r12 = r8.getContext()
            fu4 r12 = r10.e(r12)
            k2b r12 = r12.f()
            xef r12 = r12.getText()
            int r12 = r12.h
            r8.setHintTextColor(r12)
            android.content.res.Resources r12 = r8.getResources()
            int r14 = defpackage.ixa.B0
            java.lang.CharSequence r12 = r12.getText(r14)
            r8.setHint(r12)
            s24 r12 = new s24
            r14 = 1
            r12.<init>(r0, r8, r14)
            r8.setOnFocusChangeListener(r12)
            vy5 r12 = new vy5
            r14 = 1
            r12.<init>(r14)
            r8.setOnEditorActionListener(r12)
            r0.F0 = r8
            androidx.appcompat.widget.AppCompatTextView r12 = new androidx.appcompat.widget.AppCompatTextView
            r12.<init>(r1, r9)
            android.widget.LinearLayout$LayoutParams r14 = new android.widget.LinearLayout$LayoutParams
            r14.<init>(r5, r5)
            r14.weight = r11
            android.content.res.Resources r11 = defpackage.vo4.c()
            android.util.DisplayMetrics r11 = r11.getDisplayMetrics()
            float r11 = r11.density
            float r13 = r13 * r11
            int r11 = kotlin.math.MathKt.roundToInt((float) r13)
            r13 = 10
            float r13 = (float) r13
            android.content.res.Resources r17 = defpackage.vo4.c()
            android.util.DisplayMetrics r5 = r17.getDisplayMetrics()
            float r5 = r5.density
            float r5 = r5 * r13
            int r5 = kotlin.math.MathKt.roundToInt((float) r5)
            android.content.res.Resources r17 = defpackage.vo4.c()
            android.util.DisplayMetrics r6 = r17.getDisplayMetrics()
            float r6 = r6.density
            float r6 = r6 * r15
            int r6 = kotlin.math.MathKt.roundToInt((float) r6)
            android.content.res.Resources r17 = defpackage.vo4.c()
            android.util.DisplayMetrics r9 = r17.getDisplayMetrics()
            float r9 = r9.density
            float r9 = r9 * r13
            int r9 = kotlin.math.MathKt.roundToInt((float) r9)
            r12.setPaddingRelative(r11, r5, r6, r9)
            r12.setLayoutParams(r14)
            r12.setEllipsize(r4)
            r4 = 16
            r12.setGravity(r4)
            r7.b(r12, defpackage.uy4.b)
            r4 = 0
            r12.setBackground(r4)
            r5 = 1
            r12.setSingleLine(r5)
            r0.G0 = r12
            one.me.sdk.uikit.common.button.OneMeButton r5 = new one.me.sdk.uikit.common.button.OneMeButton
            r5.<init>(r1, r4)
            android.content.res.Resources r4 = defpackage.vo4.c()
            android.util.DisplayMetrics r4 = r4.getDisplayMetrics()
            float r4 = r4.density
            float r4 = r4 * r15
            int r4 = kotlin.math.MathKt.roundToInt((float) r4)
            android.content.res.Resources r6 = defpackage.vo4.c()
            android.util.DisplayMetrics r6 = r6.getDisplayMetrics()
            float r6 = r6.density
            float r6 = r6 * r15
            int r6 = kotlin.math.MathKt.roundToInt((float) r6)
            int r7 = r5.getPaddingTop()
            int r9 = r5.getPaddingBottom()
            r5.setPaddingRelative(r4, r7, r6, r9)
            aqa r4 = defpackage.aqa.b
            r5.setSize(r4)
            zpa r4 = defpackage.zpa.b
            r5.setMode(r4)
            xpa r4 = defpackage.xpa.a
            r5.setAppearance(r4)
            android.widget.LinearLayout$LayoutParams r4 = new android.widget.LinearLayout$LayoutParams
            r6 = -2
            r7 = -1
            r4.<init>(r7, r6)
            r5.setLayoutParams(r4)
            r0.H0 = r5
            android.widget.ImageView r4 = new android.widget.ImageView
            r4.<init>(r1)
            int r6 = defpackage.fxa.w0
            r4.setId(r6)
            r7 = 8
            r4.setVisibility(r7)
            android.widget.LinearLayout$LayoutParams r9 = new android.widget.LinearLayout$LayoutParams
            r11 = 24
            float r11 = (float) r11
            android.content.res.Resources r14 = defpackage.vo4.c()
            android.util.DisplayMetrics r14 = r14.getDisplayMetrics()
            float r14 = r14.density
            float r14 = r14 * r11
            int r14 = kotlin.math.MathKt.roundToInt((float) r14)
            android.content.res.Resources r17 = defpackage.vo4.c()
            android.util.DisplayMetrics r7 = r17.getDisplayMetrics()
            float r7 = r7.density
            float r7 = r7 * r11
            int r7 = kotlin.math.MathKt.roundToInt((float) r7)
            r9.<init>(r14, r7)
            android.content.res.Resources r7 = defpackage.vo4.c()
            android.util.DisplayMetrics r7 = r7.getDisplayMetrics()
            float r7 = r7.density
            float r7 = r7 * r15
            int r7 = kotlin.math.MathKt.roundToInt((float) r7)
            int r14 = r9.topMargin
            r17 = r5
            int r5 = r9.getMarginEnd()
            r18 = r2
            int r2 = r9.bottomMargin
            r9.setMarginStart(r7)
            r9.topMargin = r14
            r9.setMarginEnd(r5)
            r9.bottomMargin = r2
            r4.setLayoutParams(r9)
            u99 r2 = new u99
            r5 = 29
            r2.<init>((int) r5, (java.lang.Object) r0)
            defpackage.ct.G(r4, 300, r2)
            int r2 = defpackage.cad.p0
            android.content.Context r5 = r4.getContext()
            fu4 r5 = r10.e(r5)
            k2b r5 = r5.f()
            u67 r5 = r5.getIcon()
            int r5 = r5.i
            android.content.Context r7 = r4.getContext()
            android.graphics.drawable.Drawable r2 = defpackage.ew3.b(r7, r2)
            defpackage.iq.a0(r2, r5)
            r4.setImageDrawable(r2)
            r0.I0 = r4
            android.widget.ImageView r2 = new android.widget.ImageView
            r2.<init>(r1)
            r2.setId(r6)
            r5 = 8
            r2.setVisibility(r5)
            android.widget.LinearLayout$LayoutParams r5 = new android.widget.LinearLayout$LayoutParams
            android.content.res.Resources r6 = defpackage.vo4.c()
            android.util.DisplayMetrics r6 = r6.getDisplayMetrics()
            float r6 = r6.density
            float r6 = r6 * r11
            int r6 = kotlin.math.MathKt.roundToInt((float) r6)
            android.content.res.Resources r7 = defpackage.vo4.c()
            android.util.DisplayMetrics r7 = r7.getDisplayMetrics()
            float r7 = r7.density
            float r7 = r7 * r11
            int r7 = kotlin.math.MathKt.roundToInt((float) r7)
            r5.<init>(r6, r7)
            android.content.res.Resources r6 = defpackage.vo4.c()
            android.util.DisplayMetrics r6 = r6.getDisplayMetrics()
            float r6 = r6.density
            float r6 = r6 * r15
            int r6 = kotlin.math.MathKt.roundToInt((float) r6)
            int r7 = r5.topMargin
            int r9 = r5.getMarginEnd()
            int r14 = r5.bottomMargin
            r5.setMarginStart(r6)
            r5.topMargin = r7
            r5.setMarginEnd(r9)
            r5.bottomMargin = r14
            r2.setLayoutParams(r5)
            int r5 = defpackage.cad.v0
            android.content.Context r6 = r2.getContext()
            fu4 r6 = r10.e(r6)
            k2b r6 = r6.f()
            u67 r6 = r6.getIcon()
            int r6 = r6.f
            android.content.Context r7 = r2.getContext()
            android.graphics.drawable.Drawable r5 = defpackage.ew3.b(r7, r5)
            defpackage.iq.a0(r5, r6)
            r2.setImageDrawable(r5)
            r0.J0 = r2
            android.widget.LinearLayout r5 = new android.widget.LinearLayout
            r5.<init>(r1)
            android.widget.LinearLayout$LayoutParams r6 = new android.widget.LinearLayout$LayoutParams
            r7 = -2
            r9 = -1
            r6.<init>(r9, r7)
            r5.setLayoutParams(r6)
            android.content.res.Resources r6 = defpackage.vo4.c()
            android.util.DisplayMetrics r6 = r6.getDisplayMetrics()
            float r6 = r6.density
            float r6 = r6 * r15
            int r6 = kotlin.math.MathKt.roundToInt((float) r6)
            android.content.res.Resources r7 = defpackage.vo4.c()
            android.util.DisplayMetrics r7 = r7.getDisplayMetrics()
            float r7 = r7.density
            float r7 = r7 * r15
            int r7 = kotlin.math.MathKt.roundToInt((float) r7)
            int r9 = r5.getPaddingTop()
            int r14 = r5.getPaddingBottom()
            r5.setPaddingRelative(r6, r9, r7, r14)
            r6 = 16
            r5.setGravity(r6)
            r6 = 0
            r5.setOrientation(r6)
            r6 = 1
            r5.setClipToOutline(r6)
            n04 r6 = new n04
            android.content.res.Resources r7 = defpackage.vo4.c()
            android.util.DisplayMetrics r7 = r7.getDisplayMetrics()
            float r7 = r7.density
            float r7 = r7 * r15
            int r7 = kotlin.math.MathKt.roundToInt((float) r7)
            float r7 = (float) r7
            r6.<init>(r7)
            r5.setOutlineProvider(r6)
            android.content.Context r6 = r5.getContext()
            fu4 r6 = r10.e(r6)
            k2b r6 = r6.f()
            df0 r6 = r6.c()
            int r6 = r6.h
            r5.setBackgroundColor(r6)
            r5.addView(r3)
            r5.addView(r8)
            r5.addView(r12)
            r5.addView(r2)
            r5.addView(r4)
            r0.K0 = r5
            android.widget.TextView r2 = new android.widget.TextView
            r2.<init>(r1)
            android.content.Context r3 = r2.getContext()
            fu4 r3 = r10.e(r3)
            k2b r3 = r3.f()
            xef r3 = r3.getText()
            int r3 = r3.b
            r2.setTextColor(r3)
            ogf r3 = defpackage.puf.o
            r3.b(r2, defpackage.uy4.b)
            android.content.res.Resources r4 = defpackage.vo4.c()
            android.util.DisplayMetrics r4 = r4.getDisplayMetrics()
            float r4 = r4.density
            float r11 = r11 * r4
            int r4 = kotlin.math.MathKt.roundToInt((float) r11)
            int r6 = r2.getPaddingTop()
            int r7 = r2.getPaddingEnd()
            int r8 = r2.getPaddingBottom()
            r2.setPaddingRelative(r4, r6, r7, r8)
            android.widget.LinearLayout$LayoutParams r4 = new android.widget.LinearLayout$LayoutParams
            r6 = -2
            r4.<init>(r6, r6)
            android.content.res.Resources r6 = defpackage.vo4.c()
            android.util.DisplayMetrics r6 = r6.getDisplayMetrics()
            float r6 = r6.density
            float r6 = r6 * r13
            int r6 = kotlin.math.MathKt.roundToInt((float) r6)
            r4.topMargin = r6
            r2.setLayoutParams(r4)
            r0.L0 = r2
            android.widget.TextView r4 = new android.widget.TextView
            r4.<init>(r1)
            r3.b(r4, defpackage.uy4.b)
            android.content.res.Resources r1 = r4.getResources()
            int r3 = defpackage.ixa.A0
            java.lang.CharSequence r1 = r1.getText(r3)
            r4.setText(r1)
            android.widget.LinearLayout$LayoutParams r1 = new android.widget.LinearLayout$LayoutParams
            r3 = -2
            r1.<init>(r3, r3)
            android.content.res.Resources r3 = defpackage.vo4.c()
            android.util.DisplayMetrics r3 = r3.getDisplayMetrics()
            float r3 = r3.density
            float r3 = r3 * r13
            int r3 = kotlin.math.MathKt.roundToInt((float) r3)
            r1.topMargin = r3
            r4.setLayoutParams(r1)
            r0.M0 = r4
            r1 = r18
            r3 = 1
            r1.setOrientation(r3)
            android.widget.LinearLayout$LayoutParams r3 = new android.widget.LinearLayout$LayoutParams
            r6 = -2
            r7 = -1
            r3.<init>(r7, r6)
            r1.setLayoutParams(r3)
            r3 = 16
            r1.setGravity(r3)
            r1.addView(r5)
            r3 = r17
            r1.addView(r3)
            r1.addView(r2)
            r1.addView(r4)
            android.content.res.Resources r2 = defpackage.vo4.c()
            android.util.DisplayMetrics r2 = r2.getDisplayMetrics()
            float r2 = r2.density
            float r2 = r2 * r15
            int r2 = kotlin.math.MathKt.roundToInt((float) r2)
            android.content.res.Resources r3 = defpackage.vo4.c()
            android.util.DisplayMetrics r3 = r3.getDisplayMetrics()
            float r3 = r3.density
            float r13 = r13 * r3
            int r3 = kotlin.math.MathKt.roundToInt((float) r13)
            android.content.res.Resources r4 = defpackage.vo4.c()
            android.util.DisplayMetrics r4 = r4.getDisplayMetrics()
            float r4 = r4.density
            float r15 = r15 * r4
            int r4 = kotlin.math.MathKt.roundToInt((float) r15)
            int r5 = r1.getPaddingTop()
            r1.setPaddingRelative(r2, r5, r4, r3)
            qrb r2 = new qrb
            r3 = 12
            r4 = 0
            r2.<init>((java.lang.Object) r0, (kotlin.coroutines.Continuation) r4, (int) r3)
            defpackage.b0h.H(r1, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.v7e.<init>(android.content.Context):void");
    }

    public final void M(lz7 lz7) {
        P(((u7e) lz7).a);
    }

    /* JADX WARNING: Removed duplicated region for block: B:27:0x00b6  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x00b8  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x00bc  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x00c6  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x00c8  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x00d7  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void P(defpackage.o54 r13) {
        /*
            r12 = this;
            boolean r0 = r13 instanceof defpackage.r7e
            android.widget.TextView r1 = r12.M0
            android.widget.LinearLayout r2 = r12.K0
            android.widget.ImageView r3 = r12.J0
            android.widget.ImageView r4 = r12.I0
            r5 = 0
            android.view.View r6 = r12.a
            one.me.sdk.uikit.common.button.OneMeButton r7 = r12.H0
            r8 = 8
            if (r0 == 0) goto L_0x0037
            r7.setVisibility(r5)
            r7.setProgressEnabled(r5)
            r4.setVisibility(r8)
            r3.setVisibility(r8)
            r2.setVisibility(r8)
            r1.setVisibility(r8)
            r0 = r13
            r7e r0 = (defpackage.r7e) r0
            android.content.Context r1 = r6.getContext()
            ngf r0 = r0.o
            java.lang.CharSequence r0 = r0.a(r1)
            r7.setText((java.lang.CharSequence) r0)
            goto L_0x00e7
        L_0x0037:
            boolean r0 = r13 instanceof defpackage.t7e
            android.widget.TextView r9 = r12.E0
            androidx.appcompat.widget.AppCompatTextView r10 = r12.G0
            androidx.appcompat.widget.AppCompatEditText r11 = r12.F0
            if (r0 == 0) goto L_0x006b
            r7.setVisibility(r8)
            r2.setVisibility(r5)
            r11.setVisibility(r8)
            r10.setVisibility(r5)
            r9.setVisibility(r8)
            r4.setVisibility(r8)
            r0 = r13
            t7e r0 = (defpackage.t7e) r0
            r3.setVisibility(r5)
            r1.setVisibility(r8)
            android.content.Context r1 = r6.getContext()
            ngf r0 = r0.o
            java.lang.CharSequence r0 = r0.a(r1)
            r10.setText(r0)
            goto L_0x00e7
        L_0x006b:
            boolean r0 = r13 instanceof defpackage.s7e
            if (r0 == 0) goto L_0x012f
            r7.setVisibility(r8)
            r2.setVisibility(r5)
            r11.setVisibility(r5)
            r10.setVisibility(r8)
            r9.setVisibility(r5)
            boolean r0 = r11.isFocused()
            r2 = 1
            if (r0 == 0) goto L_0x009a
            android.text.Editable r0 = r11.getText()
            if (r0 == 0) goto L_0x0094
            int r0 = r0.length()
            if (r0 != 0) goto L_0x0092
            goto L_0x0094
        L_0x0092:
            r0 = r5
            goto L_0x0095
        L_0x0094:
            r0 = r2
        L_0x0095:
            r0 = r0 ^ r2
            if (r0 == 0) goto L_0x009a
            r0 = r5
            goto L_0x009b
        L_0x009a:
            r0 = r8
        L_0x009b:
            r4.setVisibility(r0)
            r0 = r13
            s7e r0 = (defpackage.s7e) r0
            boolean r4 = r0.r
            java.lang.String r7 = r0.p
            if (r4 == 0) goto L_0x00be
            boolean r4 = r11.isFocused()
            if (r4 != 0) goto L_0x00be
            if (r7 == 0) goto L_0x00b8
            int r4 = r7.length()
            if (r4 != 0) goto L_0x00b6
            goto L_0x00b8
        L_0x00b6:
            r4 = r5
            goto L_0x00b9
        L_0x00b8:
            r4 = r2
        L_0x00b9:
            r2 = r2 ^ r4
            if (r2 == 0) goto L_0x00be
            r2 = r5
            goto L_0x00bf
        L_0x00be:
            r2 = r8
        L_0x00bf:
            r3.setVisibility(r2)
            boolean r2 = r0.s
            if (r2 == 0) goto L_0x00c8
            r2 = r5
            goto L_0x00c9
        L_0x00c8:
            r2 = r8
        L_0x00c9:
            r1.setVisibility(r2)
            java.lang.String r1 = r0.o
            r9.setText(r1)
            o54 r1 = r12.D0
            boolean r1 = r1 instanceof defpackage.s7e
            if (r1 != 0) goto L_0x00da
            r11.setText(r7)
        L_0x00da:
            android.content.Context r1 = r6.getContext()
            ngf r0 = r0.q
            java.lang.CharSequence r0 = r0.a(r1)
            r11.setHint(r0)
        L_0x00e7:
            r12.D0 = r13
            android.widget.TextView r12 = r12.L0
            ngf r0 = r13.m()
            if (r0 == 0) goto L_0x00f8
            java.lang.Integer r0 = r13.n()
            if (r0 == 0) goto L_0x00f8
            goto L_0x00f9
        L_0x00f8:
            r5 = r8
        L_0x00f9:
            r12.setVisibility(r5)
            ngf r0 = r13.m()
            if (r0 == 0) goto L_0x010b
            android.content.Context r1 = r12.getContext()
            java.lang.CharSequence r0 = r0.a(r1)
            goto L_0x010c
        L_0x010b:
            r0 = 0
        L_0x010c:
            r12.setText(r0)
            java.lang.Integer r13 = r13.n()
            if (r13 == 0) goto L_0x012e
            int r13 = r13.intValue()
            js9 r0 = defpackage.fu4.k
            android.content.Context r1 = r12.getContext()
            fu4 r0 = r0.e(r1)
            k2b r0 = r0.f()
            int r13 = r0.i(r13)
            r12.setTextColor(r13)
        L_0x012e:
            return
        L_0x012f:
            kotlin.NoWhenBranchMatchedException r12 = new kotlin.NoWhenBranchMatchedException
            r12.<init>()
            throw r12
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.v7e.P(o54):void");
    }
}
