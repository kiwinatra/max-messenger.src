package defpackage;

import android.annotation.SuppressLint;
import android.content.res.ColorStateList;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.StateListDrawable;
import android.text.Editable;
import android.text.InputFilter;
import android.view.ActionMode;
import android.view.TouchDelegate;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import java.util.ArrayList;
import kotlin.Lazy;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.math.MathKt;
import kotlin.reflect.KProperty;
import kotlin.text.StringsKt;

/* renamed from: dc9  reason: default package */
public final class dc9 extends LinearLayout implements phf, x86 {
    public static final /* synthetic */ KProperty[] O0 = {rae.s(dc9.class, "isVideoMessageEnabled", "isVideoMessageEnabled()Z", 0)};
    public final Lazy A0;
    public final Lazy B0;
    public tb9 C0;
    public boolean D0;
    public final bl E0;
    public boolean F0;
    public zb9 G0;
    public final xme H0;
    public final etc I0;
    public final xme J0;
    public final etc K0;
    public final Lazy L0;
    public final Rect M0;
    public final ArrayList N0;
    public int a;
    public final ImageView b;
    public final bc9 c;
    public final int o = cad.Y0;
    public final Lazy v;
    public final Lazy v0;
    public final Lazy w;
    public final Lazy w0;
    public final StateListDrawable x;
    public final Lazy x0;
    public final ImageView y;
    public final Lazy y0;
    public final Lazy z;
    public final Lazy z0;

    /* JADX WARNING: type inference failed for: r2v5, types: [android.widget.TextView, android.view.View, bc9, android.widget.EditText] */
    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public dc9(android.content.Context r19) {
        /*
            r18 = this;
            r0 = r18
            r1 = r19
            r3 = 6
            r4 = 16
            r5 = 0
            r6 = 2
            r7 = 4
            r8 = 1
            r9 = 0
            r0.<init>(r1, r9, r5, r5)
            float r10 = (float) r7
            android.content.res.Resources r11 = defpackage.vo4.c()
            android.util.DisplayMetrics r11 = r11.getDisplayMetrics()
            float r11 = r11.density
            float r11 = r11 * r10
            int r11 = kotlin.math.MathKt.roundToInt((float) r11)
            r0.a = r11
            android.widget.ImageView r11 = new android.widget.ImageView
            r11.<init>(r1)
            int r12 = defpackage.dad.Q
            r11.setId(r12)
            js9 r12 = defpackage.fu4.k
            android.content.Context r13 = r11.getContext()
            fu4 r13 = r12.e(r13)
            k2b r13 = r13.f()
            hq2 r13 = r13.a()
            zqg r13 = r13.f()
            arg r13 = r13.c
            int r13 = r13.c
            android.content.res.ColorStateList r13 = android.content.res.ColorStateList.valueOf(r13)
            r11.setImageTintList(r13)
            android.widget.LinearLayout$LayoutParams r13 = new android.widget.LinearLayout$LayoutParams
            r14 = 28
            float r14 = (float) r14
            android.content.res.Resources r15 = defpackage.vo4.c()
            android.util.DisplayMetrics r15 = r15.getDisplayMetrics()
            float r15 = r15.density
            float r15 = r15 * r14
            int r15 = kotlin.math.MathKt.roundToInt((float) r15)
            android.content.res.Resources r16 = defpackage.vo4.c()
            android.util.DisplayMetrics r2 = r16.getDisplayMetrics()
            float r2 = r2.density
            float r14 = r14 * r2
            int r2 = kotlin.math.MathKt.roundToInt((float) r14)
            r13.<init>(r15, r2)
            r2 = 80
            r13.gravity = r2
            int r14 = r0.a
            android.content.res.Resources r15 = defpackage.vo4.c()
            android.util.DisplayMetrics r15 = r15.getDisplayMetrics()
            float r15 = r15.density
            float r10 = r10 * r15
            int r10 = kotlin.math.MathKt.roundToInt((float) r10)
            int r15 = r13.topMargin
            int r2 = r13.rightMargin
            r13.setMargins(r10, r15, r2, r14)
            r11.setLayoutParams(r13)
            r0.b = r11
            bc9 r2 = new bc9
            r2.<init>(r1)
            int r10 = defpackage.dad.P
            r2.setId(r10)
            r2.setBackground(r9)
            r2.setPadding(r5, r5, r5, r5)
            r10 = 8
            r2.setMaxLines(r10)
            ogf r10 = defpackage.tr2.l
            r10.b(r2, defpackage.uy4.b)
            int r10 = r2.getInputType()
            r10 = r10 | 16384(0x4000, float:2.2959E-41)
            r2.setInputType(r10)
            r10 = 268435456(0x10000000, float:2.5243549E-29)
            r2.setImeOptions(r10)
            android.graphics.drawable.GradientDrawable r10 = new android.graphics.drawable.GradientDrawable
            r10.<init>()
            r10.setShape(r5)
            float r13 = (float) r6
            android.content.res.Resources r14 = defpackage.vo4.c()
            android.util.DisplayMetrics r14 = r14.getDisplayMetrics()
            float r14 = r14.density
            float r13 = r13 * r14
            int r13 = kotlin.math.MathKt.roundToInt((float) r13)
            int r14 = r2.getLineHeight()
            r10.setSize(r13, r14)
            r2.setTextCursorDrawable(r10)
            android.widget.LinearLayout$LayoutParams r10 = new android.widget.LinearLayout$LayoutParams
            r13 = 1065353216(0x3f800000, float:1.0)
            r14 = -2
            r10.<init>(r5, r14, r13)
            r10.gravity = r4
            float r13 = (float) r3
            android.content.res.Resources r15 = defpackage.vo4.c()
            android.util.DisplayMetrics r15 = r15.getDisplayMetrics()
            float r15 = r15.density
            float r15 = r15 * r13
            int r15 = kotlin.math.MathKt.roundToInt((float) r15)
            r10.setMargins(r15, r15, r15, r15)
            r2.setLayoutParams(r10)
            q00 r10 = new q00
            r10.<init>(r4, r0)
            android.view.GestureDetector r4 = new android.view.GestureDetector
            r4.<init>(r1, r10)
            r4.setIsLongpressEnabled(r8)
            pg6 r10 = new pg6
            r10.<init>(r4, r7)
            r2.setOnTouchListener(r10)
            defpackage.gsg.h(r2)
            r0.c = r2
            int r4 = defpackage.cad.Y0
            r0.o = r4
            j35 r4 = new j35
            r10 = 21
            r4.<init>((int) r10, (java.lang.Object) r1, (java.lang.Object) r0)
            kotlin.LazyThreadSafetyMode r10 = kotlin.LazyThreadSafetyMode.NONE
            kotlin.Lazy r4 = kotlin.LazyKt.lazy((kotlin.LazyThreadSafetyMode) r10, r4)
            r0.v = r4
            p35 r4 = new p35
            r15 = 11
            r4.<init>(r1, r15)
            kotlin.Lazy r4 = kotlin.LazyKt.lazy((kotlin.LazyThreadSafetyMode) r10, r4)
            r0.w = r4
            android.graphics.drawable.StateListDrawable r4 = new android.graphics.drawable.StateListDrawable
            r4.<init>()
            r15 = 16842910(0x101009e, float:2.3694E-38)
            int[] r15 = new int[]{r15}
            android.graphics.drawable.GradientDrawable r14 = new android.graphics.drawable.GradientDrawable
            r14.<init>()
            r9 = 1120403456(0x42c80000, float:100.0)
            r14.setCornerRadius(r9)
            kotlin.Unit r17 = kotlin.Unit.INSTANCE
            r4.addState(r15, r14)
            r14 = -16842910(0xfffffffffefeff62, float:-1.6947497E38)
            int[] r14 = new int[]{r14}
            android.graphics.drawable.GradientDrawable r15 = new android.graphics.drawable.GradientDrawable
            r15.<init>()
            r15.setCornerRadius(r9)
            r4.addState(r14, r15)
            r0.x = r4
            android.widget.ImageView r4 = new android.widget.ImageView
            r4.<init>(r1)
            int r9 = defpackage.dad.T
            r4.setId(r9)
            android.widget.LinearLayout$LayoutParams r9 = new android.widget.LinearLayout$LayoutParams
            r14 = 36
            float r14 = (float) r14
            android.content.res.Resources r15 = defpackage.vo4.c()
            android.util.DisplayMetrics r15 = r15.getDisplayMetrics()
            float r15 = r15.density
            float r15 = r15 * r14
            int r15 = kotlin.math.MathKt.roundToInt((float) r15)
            android.content.res.Resources r17 = defpackage.vo4.c()
            android.util.DisplayMetrics r8 = r17.getDisplayMetrics()
            float r8 = r8.density
            float r14 = r14 * r8
            int r8 = kotlin.math.MathKt.roundToInt((float) r14)
            r9.<init>(r15, r8)
            r8 = 80
            r9.gravity = r8
            r8 = 12
            float r14 = (float) r8
            android.content.res.Resources r15 = defpackage.vo4.c()
            android.util.DisplayMetrics r15 = r15.getDisplayMetrics()
            float r15 = r15.density
            float r14 = r14 * r15
            int r14 = kotlin.math.MathKt.roundToInt((float) r14)
            r9.setMarginStart(r14)
            r4.setLayoutParams(r9)
            r0.y = r4
            p35 r9 = new p35
            r9.<init>(r1, r8)
            kotlin.Lazy r1 = kotlin.LazyKt.lazy((kotlin.LazyThreadSafetyMode) r10, r9)
            r0.z = r1
            pb9 r1 = new pb9
            r1.<init>(r0, r6)
            kotlin.Lazy r1 = kotlin.LazyKt.lazy((kotlin.LazyThreadSafetyMode) r10, r1)
            r0.v0 = r1
            pb9 r1 = new pb9
            r8 = 3
            r1.<init>(r0, r8)
            kotlin.Lazy r1 = kotlin.LazyKt.lazy((kotlin.LazyThreadSafetyMode) r10, r1)
            r0.w0 = r1
            pb9 r1 = new pb9
            r1.<init>(r0, r7)
            kotlin.Lazy r1 = kotlin.LazyKt.lazy((kotlin.LazyThreadSafetyMode) r10, r1)
            r0.x0 = r1
            pb9 r1 = new pb9
            r7 = 5
            r1.<init>(r0, r7)
            kotlin.Lazy r1 = kotlin.LazyKt.lazy((kotlin.LazyThreadSafetyMode) r10, r1)
            r0.y0 = r1
            pb9 r1 = new pb9
            r1.<init>(r0, r3)
            kotlin.Lazy r1 = kotlin.LazyKt.lazy((kotlin.LazyThreadSafetyMode) r10, r1)
            r0.z0 = r1
            pb9 r1 = new pb9
            r1.<init>(r0, r5)
            kotlin.Lazy r1 = kotlin.LazyKt.lazy((kotlin.LazyThreadSafetyMode) r10, r1)
            r0.A0 = r1
            pb9 r1 = new pb9
            r3 = 1
            r1.<init>(r0, r3)
            kotlin.Lazy r1 = kotlin.LazyKt.lazy((kotlin.LazyThreadSafetyMode) r10, r1)
            r0.B0 = r1
            tb9 r1 = defpackage.tb9.a
            r0.C0 = r1
            kotlin.properties.Delegates r1 = kotlin.properties.Delegates.INSTANCE
            bl r1 = new bl
            r1.<init>((defpackage.dc9) r0)
            r0.E0 = r1
            vb9 r1 = new vb9
            sb9 r3 = defpackage.sb9.a
            r1.<init>()
            r0.G0 = r1
            r1 = 0
            xme r1 = defpackage.f6e.a(r1)
            r0.H0 = r1
            etc r3 = new etc
            r3.<init>(r1)
            r0.I0 = r3
            java.lang.Integer r1 = java.lang.Integer.valueOf(r5)
            xme r1 = defpackage.f6e.a(r1)
            r0.J0 = r1
            etc r3 = new etc
            r3.<init>(r1)
            r0.K0 = r3
            h49 r1 = new h49
            r1.<init>(r6)
            kotlin.Lazy r1 = kotlin.LazyKt.lazy((kotlin.LazyThreadSafetyMode) r10, r1)
            r0.L0 = r1
            android.graphics.Rect r1 = new android.graphics.Rect
            r1.<init>()
            r0.M0 = r1
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            r0.N0 = r1
            int r1 = defpackage.dad.V
            r0.setId(r1)
            r0.setClipChildren(r5)
            r0.setClipToPadding(r5)
            android.content.res.Resources r1 = defpackage.vo4.c()
            android.util.DisplayMetrics r1 = r1.getDisplayMetrics()
            float r1 = r1.density
            float r13 = r13 * r1
            int r1 = kotlin.math.MathKt.roundToInt((float) r13)
            r0.setPadding(r1, r1, r1, r1)
            android.widget.FrameLayout$LayoutParams r1 = new android.widget.FrameLayout$LayoutParams
            r3 = -1
            r5 = -2
            r1.<init>(r3, r5)
            r3 = 80
            r1.gravity = r3
            r0.setLayoutParams(r1)
            r0.addView(r11)
            r0.addView(r2)
            r0.addView(r4)
            int r1 = defpackage.cad.c1
            r11.setImageResource(r1)
            af7 r1 = new af7
            r3 = 1
            r1.<init>(r3, r0)
            r2.setAccessibilityDelegate(r1)
            v35 r1 = new v35
            r1.<init>(r3, r0)
            r2.addTextChangedListener(r1)
            android.content.Context r1 = r18.getContext()
            fu4 r1 = r12.e(r1)
            k2b r1 = r1.f()
            r0.onThemeChanged(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dc9.<init>(android.content.Context):void");
    }

    public static LayerDrawable b(dc9 dc9) {
        LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{dc9.x, dc9.getCheckDrawable()});
        float f = (float) 4;
        layerDrawable.setLayerInset(1, MathKt.roundToInt(vo4.c().getDisplayMetrics().density * f), MathKt.roundToInt(vo4.c().getDisplayMetrics().density * f), MathKt.roundToInt(vo4.c().getDisplayMetrics().density * f), MathKt.roundToInt(f * vo4.c().getDisplayMetrics().density));
        return layerDrawable;
    }

    public static LayerDrawable c(dc9 dc9) {
        LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{dc9.x, dc9.getArrowDrawable()});
        float f = (float) 4;
        layerDrawable.setLayerInset(1, MathKt.roundToInt(vo4.c().getDisplayMetrics().density * f), MathKt.roundToInt(vo4.c().getDisplayMetrics().density * f), MathKt.roundToInt(vo4.c().getDisplayMetrics().density * f), MathKt.roundToInt(f * vo4.c().getDisplayMetrics().density));
        return layerDrawable;
    }

    private final Drawable getArrowDrawable() {
        return (Drawable) this.v0.getValue();
    }

    private final Drawable getCheckDrawable() {
        return (Drawable) this.x0.getValue();
    }

    private final LayerDrawable getCheckIcon() {
        return (LayerDrawable) this.y0.getValue();
    }

    private final Drawable getEmojiArrowDownDrawable() {
        return (Drawable) this.B0.getValue();
    }

    private final Drawable getEmojiArrowUpDrawable() {
        return (Drawable) this.A0.getValue();
    }

    private final InputFilter getEmptyFilter() {
        return (InputFilter) this.L0.getValue();
    }

    private final Drawable getMicIcon() {
        return (Drawable) this.z0.getValue();
    }

    private final LayerDrawable getSendIcon() {
        return (LayerDrawable) this.w0.getValue();
    }

    private final void setSendActionState(zb9 zb9) {
        this.G0 = zb9;
        j(fu4.k.e(getContext()).f());
    }

    /* access modifiers changed from: private */
    public final void setVideoMsgButtonVisible(boolean z2) {
        Lazy lazy = this.z;
        ImageView imageView = this.y;
        if (z2) {
            f6e.c(this, (View) lazy.getValue(), Integer.valueOf(indexOfChild(imageView)));
            ViewGroup.LayoutParams layoutParams = imageView.getLayoutParams();
            if (layoutParams != null) {
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                marginLayoutParams.setMarginStart(MathKt.roundToInt(((float) 6) * vo4.c().getDisplayMetrics().density));
                imageView.setLayoutParams(marginLayoutParams);
                return;
            }
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        } else if (lazy.isInitialized()) {
            removeView((ImageView) lazy.getValue());
            ViewGroup.LayoutParams layoutParams2 = imageView.getLayoutParams();
            if (layoutParams2 != null) {
                ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) layoutParams2;
                marginLayoutParams2.setMarginStart(MathKt.roundToInt(((float) 12) * vo4.c().getDisplayMetrics().density));
                imageView.setLayoutParams(marginLayoutParams2);
                return;
            }
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        }
    }

    public final void a(uy4 uy4) {
        addOnLayoutChangeListener(new nn1(5, this, uy4));
    }

    public final void e(boolean z2) {
        this.F0 = z2;
        bc9 bc9 = this.c;
        if (!z2) {
            kr7.C(bc9);
        } else if (bc9 != null) {
            bc9.requestFocus();
            bc9.post(new uo5(17, (Object) bc9, (Object) bc9));
        }
    }

    public final void f(CharSequence charSequence) {
        bc9 bc9 = this.c;
        Editable text = bc9.getText();
        if (text == null || charSequence == null) {
            setText(charSequence);
            return;
        }
        int selectionStart = bc9.getSelectionStart();
        int selectionEnd = bc9.getSelectionEnd();
        int max = Math.max(selectionStart, 0);
        int max2 = Math.max(selectionEnd, 0);
        int min = Math.min(max, max2);
        int max3 = Math.max(max, max2);
        if (selectionStart == -1 && selectionEnd == -1) {
            text.append(charSequence);
            return;
        }
        text.replace(min, max3, charSequence, 0, charSequence.length());
    }

    public final boolean g() {
        Editable text = this.c.getText();
        return text == null || StringsKt.isBlank(text);
    }

    public final View getAudioRecordAnchor() {
        return this.y;
    }

    public final tb9 getEmojiExpandableState() {
        return this.C0;
    }

    public final ome getMessagePosition() {
        return this.K0;
    }

    public final ome getMessageState() {
        return this.I0;
    }

    public final zb9 getSendActionState() {
        return this.G0;
    }

    public final CharSequence getText() {
        Editable text = this.c.getText();
        if (text != null) {
            return text.subSequence(0, text.length());
        }
        return null;
    }

    public final View getVideoMessageRecordAnchor() {
        Lazy lazy = this.z;
        if (y7e.L(lazy)) {
            return (View) lazy.getValue();
        }
        return null;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0019, code lost:
        if (kotlin.text.StringsKt.c(r1, "\n") == true) goto L_0x001d;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void h() {
        /*
            r4 = this;
            kotlin.Lazy r0 = r4.w
            boolean r1 = r0.isInitialized()
            if (r1 != 0) goto L_0x0009
            return
        L_0x0009:
            bc9 r1 = r4.c
            android.text.Editable r1 = r1.getText()
            r2 = 0
            if (r1 == 0) goto L_0x001c
            java.lang.String r3 = "\n"
            boolean r1 = kotlin.text.StringsKt__StringsKt.contains$default((java.lang.CharSequence) r1, (java.lang.CharSequence) r3, false, 2, (java.lang.Object) null)
            r3 = 1
            if (r1 != r3) goto L_0x001c
            goto L_0x001d
        L_0x001c:
            r3 = r2
        L_0x001d:
            boolean r1 = r4.g()
            if (r1 == 0) goto L_0x0048
            boolean r1 = r4.D0
            if (r1 != 0) goto L_0x0048
            if (r3 == 0) goto L_0x002a
            goto L_0x0048
        L_0x002a:
            boolean r1 = r4.F0
            if (r1 == 0) goto L_0x003c
            r4.F0 = r2
            java.lang.Object r4 = r0.getValue()
            xle r4 = (defpackage.xle) r4
            vle r0 = defpackage.vle.b
            r4.setExpandableState(r0)
            goto L_0x0053
        L_0x003c:
            java.lang.Object r4 = r0.getValue()
            xle r4 = (defpackage.xle) r4
            vle r0 = defpackage.vle.a
            r4.setExpandableState(r0)
            goto L_0x0053
        L_0x0048:
            java.lang.Object r4 = r0.getValue()
            xle r4 = (defpackage.xle) r4
            vle r0 = defpackage.vle.b
            r4.setExpandableState(r0)
        L_0x0053:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dc9.h():void");
    }

    public final void i() {
        Lazy lazy = this.v;
        if (lazy.isInitialized()) {
            ImageView imageView = (ImageView) lazy.getValue();
            imageView.setImageTintList(ColorStateList.valueOf(fu4.k.f(imageView).a().f().c.c));
        }
    }

    public final void j(k2b k2b) {
        tb9 tb9;
        zb9 zb9 = this.G0;
        boolean g = g();
        yb9 yb9 = yb9.a;
        ImageView imageView = this.y;
        if (!g || !Intrinsics.areEqual((Object) zb9, (Object) yb9)) {
            boolean areEqual = Intrinsics.areEqual((Object) zb9, (Object) xb9.a);
            StateListDrawable stateListDrawable = this.x;
            if (areEqual || Intrinsics.areEqual((Object) zb9, (Object) yb9)) {
                stateListDrawable.setState(new int[]{16842910});
                imageView.setPadding(0, 0, 0, 0);
                Drawable checkDrawable = getCheckDrawable();
                k2b.getIcon().getClass();
                iq.a0(checkDrawable, -1);
                imageView.setImageDrawable(getCheckIcon());
                imageView.setEnabled(true);
                setVideoMsgButtonVisible(false);
            } else {
                boolean g2 = g();
                js9 js9 = fu4.k;
                if (g2 && (tb9 = this.C0) != tb9.a) {
                    Drawable emojiArrowDownDrawable = tb9 == tb9.b ? getEmojiArrowDownDrawable() : getEmojiArrowUpDrawable();
                    imageView.setImageDrawable(emojiArrowDownDrawable);
                    iq.a0(emojiArrowDownDrawable, js9.e(getContext()).f().a().f().c.c);
                    setVideoMsgButtonVisible(false);
                } else if (!g() || !(zb9 instanceof vb9)) {
                    if (imageView.getDrawable() != getSendIcon()) {
                        stateListDrawable.setState(new int[]{16842910});
                        imageView.setImageDrawable(getSendIcon());
                        imageView.setPadding(0, 0, 0, 0);
                        imageView.setEnabled(true);
                    }
                    Drawable arrowDrawable = getArrowDrawable();
                    k2b.getIcon().getClass();
                    iq.a0(arrowDrawable, -1);
                    setVideoMsgButtonVisible(false);
                } else {
                    ((vb9) zb9).getClass();
                    sb9 sb9 = sb9.a;
                    if (ac9.$EnumSwitchMapping$0[0] != 1) {
                        throw new NoWhenBranchMatchedException();
                    } else if (imageView.getDrawable() != getMicIcon()) {
                        imageView.setImageDrawable(getMicIcon());
                        imageView.setEnabled(true);
                        int roundToInt = MathKt.roundToInt(((float) 4) * vo4.c().getDisplayMetrics().density);
                        imageView.setPadding(roundToInt, roundToInt, roundToInt, roundToInt);
                        iq.a0(getMicIcon(), js9.e(getContext()).f().a().f().c.c);
                        Lazy lazy = this.z;
                        if (lazy.isInitialized()) {
                            ImageView imageView2 = (ImageView) lazy.getValue();
                            setVideoMsgButtonVisible(((Boolean) this.E0.getValue(this, O0[0])).booleanValue());
                        }
                    } else {
                        return;
                    }
                }
            }
        } else {
            iq.a0(getCheckDrawable(), k2b.b().b.b);
            imageView.setPadding(0, 0, 0, 0);
            imageView.setImageDrawable(getCheckIcon());
            imageView.setEnabled(false);
            setVideoMsgButtonVisible(false);
        }
        h();
        imageView.invalidate();
    }

    public final InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
        if (onCreateInputConnection == null) {
            return null;
        }
        String[] d = gag.d(this);
        if (d == null || editorInfo == null) {
            return onCreateInputConnection;
        }
        editorInfo.contentMimeTypes = d;
        return new jg7(onCreateInputConnection, new lr2(this));
    }

    public final void onLayout(boolean z2, int i, int i2, int i3, int i4) {
        super.onLayout(z2, i, i2, i3, i4);
        if (z2) {
            ArrayList arrayList = this.N0;
            arrayList.clear();
            ImageView imageView = this.y;
            float f = (float) 12;
            int b2 = g63.b(f, vo4.c().getDisplayMetrics().density, imageView.getLeft());
            int b3 = g63.b(f, vo4.c().getDisplayMetrics().density, imageView.getTop());
            int b4 = g63.b(f, vo4.c().getDisplayMetrics().density, imageView.getRight());
            int b5 = g63.b(f, vo4.c().getDisplayMetrics().density, imageView.getBottom());
            Rect rect = this.M0;
            rect.set(b2, b3, b4, b5);
            arrayList.add(rect);
            setSystemGestureExclusionRects(arrayList);
        }
    }

    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        TouchDelegate touchDelegate = getTouchDelegate();
        wc3 wc3 = touchDelegate instanceof wc3 ? (wc3) touchDelegate : null;
        if (wc3 != null) {
            wc3.a.clear();
        }
        float f = (float) 10;
        gsg.c(MathKt.roundToInt(vo4.c().getDisplayMetrics().density * f), MathKt.roundToInt(vo4.c().getDisplayMetrics().density * f), MathKt.roundToInt(((float) 4) * vo4.c().getDisplayMetrics().density), MathKt.roundToInt(vo4.c().getDisplayMetrics().density * f), this, this.b);
        float f2 = (float) 12;
        gsg.c(0, MathKt.roundToInt(vo4.c().getDisplayMetrics().density * f2), 0, MathKt.roundToInt(f2 * vo4.c().getDisplayMetrics().density), this, this.c);
        float f3 = (float) 6;
        gsg.c(MathKt.roundToInt(vo4.c().getDisplayMetrics().density * f3), MathKt.roundToInt(vo4.c().getDisplayMetrics().density * f3), MathKt.roundToInt(vo4.c().getDisplayMetrics().density * f3), MathKt.roundToInt(vo4.c().getDisplayMetrics().density * f3), this, this.y);
        Lazy lazy = this.v;
        if (lazy.isInitialized()) {
            gsg.c(MathKt.roundToInt(vo4.c().getDisplayMetrics().density * f3), MathKt.roundToInt(vo4.c().getDisplayMetrics().density * f), MathKt.roundToInt(vo4.c().getDisplayMetrics().density * f3), MathKt.roundToInt(f * vo4.c().getDisplayMetrics().density), this, (ImageView) lazy.getValue());
        }
        Lazy lazy2 = this.z;
        if (lazy2.isInitialized()) {
            gsg.c(MathKt.roundToInt(f3 * vo4.c().getDisplayMetrics().density), MathKt.roundToInt(vo4.c().getDisplayMetrics().density * f3), MathKt.roundToInt(vo4.c().getDisplayMetrics().density * f3), MathKt.roundToInt(vo4.c().getDisplayMetrics().density * f3), this, (ImageView) lazy2.getValue());
        }
    }

    public final void onThemeChanged(k2b k2b) {
        js9 js9 = fu4.k;
        setBackgroundColor(js9.e(getContext()).f().a().f().a.a);
        this.b.setImageTintList(ColorStateList.valueOf(js9.e(getContext()).f().a().f().c.c));
        int i = k2b.getText().e;
        bc9 bc9 = this.c;
        bc9.setTextColor(i);
        bc9.setHintTextColor(j4b.l0(0.4f, k2b.getText().h));
        k2b.getText().getClass();
        bc9.setHighlightColor(-16745729);
        Drawable textCursorDrawable = bc9.getTextCursorDrawable();
        GradientDrawable gradientDrawable = textCursorDrawable instanceof GradientDrawable ? (GradientDrawable) textCursorDrawable : null;
        if (gradientDrawable != null) {
            k2b.getText().getClass();
            gradientDrawable.setColor(ColorStateList.valueOf(-16745729));
        }
        Editable text = bc9.getText();
        if (text != null) {
            for (Object obj : text.getSpans(0, text.length(), Object.class)) {
                if (obj instanceof xa9) {
                    ((xa9) obj).b = js9.e(bc9.getContext()).f().a().a(true).b.b;
                } else if (obj instanceof phf) {
                    ((phf) obj).onThemeChanged(k2b);
                }
            }
        }
        StateListDrawable stateListDrawable = this.x;
        k2b.c().a.getClass();
        ((GradientDrawable) stateListDrawable.getStateDrawable(stateListDrawable.findStateDrawableIndex(new int[]{16842910}))).setColor(-16745729);
        ((GradientDrawable) stateListDrawable.getStateDrawable(stateListDrawable.findStateDrawableIndex(new int[]{-16842910}))).setColor(k2b.b().a.r);
        j(k2b);
        i();
        invalidate();
    }

    public final void setCustomSelectionActionModeCallback(Function1<? super EditText, ? extends ActionMode.Callback> function1) {
        bc9 bc9 = this.c;
        bc9.setCustomSelectionActionModeCallback((ActionMode.Callback) function1.invoke(bc9));
    }

    public final void setEmojiExpandableState(tb9 tb9) {
        this.C0 = tb9;
        j(fu4.k.e(getContext()).f());
    }

    public final void setInputEnabled(boolean z2) {
        bc9 bc9 = this.c;
        if (z2) {
            bc9.setFilters(new InputFilter[0]);
            return;
        }
        bc9.setFilters(new InputFilter[]{getEmptyFilter()});
    }

    public final void setInputHint(CharSequence charSequence) {
        this.c.setHint(charSequence);
    }

    public final void setInputKeyListener(View.OnKeyListener onKeyListener) {
        this.c.setOnKeyListener(onKeyListener);
    }

    public final void setKeyboardVisible(boolean z2) {
        this.D0 = z2;
        h();
    }

    public final void setLeftIcon(int i) {
        this.b.setImageResource(i);
    }

    @SuppressLint({"ClickableViewAccessibility"})
    public final void setLeftInnerIconTouchListener(View.OnTouchListener onTouchListener) {
        this.b.setOnTouchListener(onTouchListener);
    }

    public final void setLeftOuterIconOnClickListener(Function0<Unit> function0) {
        ct.G((View) this.w.getValue(), 300, new e7(15, function0));
    }

    public final void setLeftOuterIconText(CharSequence charSequence) {
        Lazy lazy = this.w;
        f6e.c(this, (View) lazy.getValue(), 0);
        ((xle) lazy.getValue()).setText(charSequence);
    }

    public final void setLeftOuterIconVisible(boolean z2) {
        Lazy lazy = this.w;
        if (z2) {
            f6e.c(this, (View) lazy.getValue(), 0);
        } else if (lazy.isInitialized()) {
            removeView((View) lazy.getValue());
        }
    }

    @SuppressLint({"ClickableViewAccessibility"})
    public final void setRightInnerIconTouchListener(View.OnTouchListener onTouchListener) {
        Lazy lazy = this.v;
        if (onTouchListener != null) {
            ((ImageView) lazy.getValue()).setOnTouchListener(onTouchListener);
        } else if (lazy.isInitialized()) {
            ((ImageView) lazy.getValue()).setOnTouchListener((View.OnTouchListener) null);
        }
    }

    public final void setRightInnerIconVisible(boolean z2) {
        Lazy lazy = this.v;
        if (z2) {
            f6e.c(this, (View) lazy.getValue(), Integer.valueOf(indexOfChild(this.c) + 1));
            i();
        } else if (lazy.isInitialized()) {
            removeView((View) lazy.getValue());
        }
    }

    public final void setRightOuterIconActionState(zb9 zb9) {
        setSendActionState(zb9);
    }

    public final void setRightOuterIconEnabled(boolean z2) {
        this.y.setEnabled(z2);
    }

    @SuppressLint({"ClickableViewAccessibility"})
    public final void setRightOuterIconTouchListener(View.OnTouchListener onTouchListener) {
        this.y.setOnTouchListener(onTouchListener);
    }

    public final void setText(CharSequence charSequence) {
        bc9 bc9 = this.c;
        if (charSequence == null) {
            Editable text = bc9.getText();
            if (text != null) {
                text.clear();
                return;
            }
            return;
        }
        bc9.setText(charSequence);
    }

    public final void setVideoMessageEnabled(boolean z2) {
        this.E0.setValue(this, O0[0], Boolean.valueOf(z2));
    }

    @SuppressLint({"ClickableViewAccessibility"})
    public final void setVideoMessageTouchListener(View.OnTouchListener onTouchListener) {
        Lazy lazy = this.z;
        if (onTouchListener != null) {
            ((ImageView) lazy.getValue()).setOnTouchListener(onTouchListener);
        } else if (lazy.isInitialized()) {
            ((ImageView) lazy.getValue()).setOnTouchListener((View.OnTouchListener) null);
        }
    }

    public final void setInputHint(int i) {
        this.c.setHint(i);
    }
}
