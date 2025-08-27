package defpackage;

import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.text.Editable;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.text.Regex;

/* renamed from: zwa  reason: default package */
public final class zwa extends LinearLayout implements phf {
    public ywa a;
    public Function1 b;
    public ysa c;
    public final Regex o = new Regex("^[+\\d][\\d\\s\\u00A0-]*$");
    public boolean v;
    public u2 v0;
    public final AppCompatImageView w;
    public final AppCompatTextView x;
    public final AppCompatImageView y;
    public final EditText z;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public zwa(android.content.Context r19) {
        /*
            r18 = this;
            r0 = r18
            r1 = r19
            r2 = 3
            r3 = 0
            r4 = 1
            r5 = 0
            r0.<init>(r1, r5)
            kotlin.text.Regex r6 = new kotlin.text.Regex
            java.lang.String r7 = "^[+\\d][\\d\\s\\u00A0-]*$"
            r6.<init>((java.lang.String) r7)
            r0.o = r6
            xwa r6 = new xwa
            r6.<init>(r0)
            android.text.InputFilter[] r7 = new android.text.InputFilter[r4]
            r7[r3] = r6
            androidx.appcompat.widget.AppCompatImageView r6 = new androidx.appcompat.widget.AppCompatImageView
            r6.<init>(r1, r5)
            int r8 = android.view.View.generateViewId()
            r6.setId(r8)
            r0.w = r6
            androidx.appcompat.widget.AppCompatTextView r8 = new androidx.appcompat.widget.AppCompatTextView
            r8.<init>(r1, r5)
            int r9 = defpackage.dad.N
            r8.setId(r9)
            ogf r9 = defpackage.puf.k
            r9.b(r8, defpackage.uy4.b)
            r10 = 4
            float r10 = (float) r10
            android.content.res.Resources r11 = defpackage.vo4.c()
            android.util.DisplayMetrics r11 = r11.getDisplayMetrics()
            float r11 = r11.density
            float r11 = r11 * r10
            int r11 = kotlin.math.MathKt.roundToInt((float) r11)
            float r12 = (float) r3
            android.content.res.Resources r13 = defpackage.vo4.c()
            android.util.DisplayMetrics r13 = r13.getDisplayMetrics()
            float r13 = r13.density
            float r13 = r13 * r12
            int r13 = kotlin.math.MathKt.roundToInt((float) r13)
            android.content.res.Resources r14 = defpackage.vo4.c()
            android.util.DisplayMetrics r14 = r14.getDisplayMetrics()
            float r14 = r14.density
            float r10 = r10 * r14
            int r10 = kotlin.math.MathKt.roundToInt((float) r10)
            android.content.res.Resources r14 = defpackage.vo4.c()
            android.util.DisplayMetrics r14 = r14.getDisplayMetrics()
            float r14 = r14.density
            float r12 = r12 * r14
            int r12 = kotlin.math.MathKt.roundToInt((float) r12)
            r8.setPadding(r11, r13, r10, r12)
            r0.x = r8
            androidx.appcompat.widget.AppCompatImageView r10 = new androidx.appcompat.widget.AppCompatImageView
            r10.<init>(r1, r5)
            int r11 = android.view.View.generateViewId()
            r10.setId(r11)
            int r11 = defpackage.cad.Y
            r10.setImageResource(r11)
            r0.y = r10
            aab r11 = new aab
            vq7 r12 = new vq7
            r13 = 23
            r12.<init>((int) r13, (java.lang.Object) r0)
            r11.<init>(r1, r12)
            android.widget.EditText r12 = new android.widget.EditText
            r12.<init>(r1)
            int r1 = defpackage.dad.O
            r12.setId(r1)
            r12.setPadding(r3, r3, r3, r3)
            android.widget.LinearLayout$LayoutParams r1 = new android.widget.LinearLayout$LayoutParams
            r13 = -1
            r14 = -2
            r1.<init>(r13, r14)
            r15 = 8
            float r15 = (float) r15
            android.content.res.Resources r16 = defpackage.vo4.c()
            android.util.DisplayMetrics r13 = r16.getDisplayMetrics()
            float r13 = r13.density
            float r15 = r15 * r13
            int r13 = kotlin.math.MathKt.roundToInt((float) r15)
            r1.setMargins(r13, r3, r3, r3)
            r12.setLayoutParams(r1)
            r9.b(r12, defpackage.uy4.b)
            java.lang.String r1 = "phone"
            java.lang.String[] r1 = new java.lang.String[]{r1}
            r12.setAutofillHints(r1)
            r12.setBackground(r5)
            android.graphics.drawable.GradientDrawable r1 = new android.graphics.drawable.GradientDrawable
            r1.<init>()
            r1.setShape(r3)
            android.content.res.Resources r5 = defpackage.vo4.c()
            android.util.DisplayMetrics r5 = r5.getDisplayMetrics()
            float r5 = r5.density
            double r14 = (double) r5
            r16 = 4609434218613702656(0x3ff8000000000000, double:1.5)
            double r14 = r14 * r16
            int r5 = kotlin.math.MathKt.roundToInt((double) r14)
            int r13 = r12.getLineHeight()
            r1.setSize(r5, r13)
            r12.setTextCursorDrawable(r1)
            r12.setFilters(r7)
            java.lang.String r1 = "0123456789 -()"
            android.text.method.DigitsKeyListener r1 = android.text.method.DigitsKeyListener.getInstance(r1)
            r12.setKeyListener(r1)
            r12.setImportantForAutofill(r4)
            r12.setInputType(r2)
            r12.setSingleLine(r4)
            r12.setSaveEnabled(r3)
            r12.setFocusable(r4)
            r12.setFocusableInTouchMode(r4)
            r12.setCustomSelectionActionModeCallback(r11)
            r12.setCustomInsertionActionModeCallback(r11)
            i23 r1 = new i23
            r1.<init>(r2, r0)
            r12.setOnFocusChangeListener(r1)
            qh9 r1 = new qh9
            r1.<init>(r4, r0)
            r12.setOnKeyListener(r1)
            r0.z = r12
            android.widget.LinearLayout$LayoutParams r1 = new android.widget.LinearLayout$LayoutParams
            r2 = -1
            r5 = -2
            r1.<init>(r2, r5)
            r0.setLayoutParams(r1)
            r1 = 16
            r0.setGravity(r1)
            r1 = 12
            float r1 = (float) r1
            android.content.res.Resources r2 = defpackage.vo4.c()
            android.util.DisplayMetrics r2 = r2.getDisplayMetrics()
            float r2 = r2.density
            float r2 = r2 * r1
            int r2 = kotlin.math.MathKt.roundToInt((float) r2)
            android.content.res.Resources r5 = defpackage.vo4.c()
            android.util.DisplayMetrics r5 = r5.getDisplayMetrics()
            float r5 = r5.density
            float r1 = r1 * r5
            int r1 = kotlin.math.MathKt.roundToInt((float) r1)
            int r5 = r18.getPaddingTop()
            int r7 = r18.getPaddingBottom()
            r0.setPadding(r2, r5, r1, r7)
            r0.setOrientation(r3)
            r1 = 52
            float r1 = (float) r1
            android.content.res.Resources r2 = defpackage.vo4.c()
            android.util.DisplayMetrics r2 = r2.getDisplayMetrics()
            float r2 = r2.density
            float r1 = r1 * r2
            int r1 = kotlin.math.MathKt.roundToInt((float) r1)
            r0.setMinimumHeight(r1)
            r0.setClipToOutline(r4)
            n04 r1 = new n04
            android.content.res.Resources r2 = defpackage.vo4.c()
            android.util.DisplayMetrics r2 = r2.getDisplayMetrics()
            float r2 = r2.density
            r3 = 1098907648(0x41800000, float:16.0)
            float r2 = r2 * r3
            r1.<init>(r2)
            r0.setOutlineProvider(r1)
            r0.addView(r6)
            r0.addView(r8)
            r0.addView(r10)
            r0.addView(r12)
            js9 r1 = defpackage.fu4.k
            android.content.Context r2 = r18.getContext()
            fu4 r1 = r1.e(r2)
            k2b r1 = r1.f()
            r0.onThemeChanged(r1)
            u2 r1 = new u2
            r2 = 10
            r1.<init>(r2, r0)
            r12.addTextChangedListener(r1)
            r0.v0 = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.zwa.<init>(android.content.Context):void");
    }

    public final String getCode() {
        return String.valueOf(this.x.getText());
    }

    public final Function1<Boolean, Unit> getOnWindowFocusChanged() {
        return this.b;
    }

    public final String getPhone() {
        CharSequence text = this.x.getText();
        Editable text2 = this.z.getText();
        StringBuilder sb = new StringBuilder();
        sb.append(text);
        sb.append(text2);
        return sb.toString();
    }

    public final ywa getPhoneFormatterProvider() {
        return this.a;
    }

    public final String getPhoneWithoutCode() {
        return String.valueOf(this.z.getText());
    }

    public final void onDetachedFromWindow() {
        this.z.removeTextChangedListener(this.v0);
        this.v0 = null;
        this.a = null;
        super.onDetachedFromWindow();
    }

    public final void onThemeChanged(k2b k2b) {
        setBackgroundColor(k2b.c().a.g);
        EditText editText = this.z;
        Drawable textCursorDrawable = editText.getTextCursorDrawable();
        GradientDrawable gradientDrawable = textCursorDrawable instanceof GradientDrawable ? (GradientDrawable) textCursorDrawable : null;
        if (gradientDrawable != null) {
            k2b.getText().getClass();
            gradientDrawable.setColor(ColorStateList.valueOf(-16745729));
        }
        editText.setTextColor(k2b.getText().e);
        editText.setHintTextColor(k2b.getText().f);
        this.y.setImageTintList(ColorStateList.valueOf(k2b.getIcon().i));
        this.x.setTextColor(k2b.getText().e);
    }

    public final void onWindowFocusChanged(boolean z2) {
        super.onWindowFocusChanged(z2);
        Function1 function1 = this.b;
        if (function1 != null) {
            function1.invoke(Boolean.valueOf(z2));
        }
    }

    public final void setCountry(ysa ysa) {
        Drawable drawable;
        this.c = ysa;
        AppCompatImageView appCompatImageView = this.w;
        Integer num = ysa.o;
        if (num != null) {
            drawable = ew3.b(getContext(), num.intValue());
        } else {
            drawable = null;
        }
        appCompatImageView.setImageDrawable(drawable);
        AppCompatTextView appCompatTextView = this.x;
        appCompatTextView.setText("+" + ysa.b);
    }

    public final void setHint(CharSequence charSequence) {
        this.z.setHint(charSequence);
    }

    public final void setOnCountryViewClickListener(Function0<Unit> function0) {
        e7 e7Var = new e7(16, function0);
        this.w.setOnClickListener(e7Var);
        this.x.setOnClickListener(e7Var);
        this.y.setOnClickListener(e7Var);
    }

    public final void setOnWindowFocusChanged(Function1<? super Boolean, Unit> function1) {
        this.b = function1;
    }

    public final void setPhoneFormatterProvider(ywa ywa) {
        this.a = ywa;
    }

    public final void setText(CharSequence charSequence) {
        EditText editText = this.z;
        editText.setText(charSequence, TextView.BufferType.NORMAL);
        try {
            editText.setSelection(charSequence.length());
        } catch (IndexOutOfBoundsException e) {
            z68.f(zwa.class.getName(), e.toString(), e);
        }
    }
}
