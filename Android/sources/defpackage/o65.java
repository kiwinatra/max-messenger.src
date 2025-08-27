package defpackage;

import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityManager;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.appcompat.widget.AppCompatTextView;
import com.google.android.material.internal.CheckableImageButton;
import com.google.android.material.textfield.TextInputLayout;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.WeakHashMap;

/* renamed from: o65  reason: default package */
public final class o65 extends LinearLayout {
    public View.OnLongClickListener A0;
    public CharSequence B0;
    public final AppCompatTextView C0;
    public boolean D0;
    public EditText E0;
    public final AccessibilityManager F0;
    public rt3 G0;
    public final ojf H0 = new ojf(2, this);
    public final TextInputLayout a;
    public final FrameLayout b;
    public final CheckableImageButton c;
    public ColorStateList o;
    public PorterDuff.Mode v;
    public final LinkedHashSet v0 = new LinkedHashSet();
    public View.OnLongClickListener w;
    public ColorStateList w0;
    public final CheckableImageButton x;
    public PorterDuff.Mode x0;
    public final yy y;
    public int y0;
    public int z = 0;
    public ImageView.ScaleType z0;

    /* JADX WARNING: type inference failed for: r12v1, types: [yy, java.lang.Object] */
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public o65(TextInputLayout textInputLayout, g6d g6d) {
        super(textInputLayout.getContext());
        CharSequence text;
        TextInputLayout textInputLayout2 = textInputLayout;
        g6d g6d2 = g6d;
        n65 n65 = new n65(this);
        this.F0 = (AccessibilityManager) getContext().getSystemService("accessibility");
        this.a = textInputLayout2;
        setVisibility(8);
        setOrientation(0);
        setLayoutParams(new FrameLayout.LayoutParams(-2, -1, 8388613));
        FrameLayout frameLayout = new FrameLayout(getContext());
        this.b = frameLayout;
        frameLayout.setVisibility(8);
        frameLayout.setLayoutParams(new LinearLayout.LayoutParams(-2, -1));
        LayoutInflater from = LayoutInflater.from(getContext());
        CheckableImageButton a2 = a(this, from, agc.text_input_error_icon);
        this.c = a2;
        CheckableImageButton a3 = a(frameLayout, from, agc.text_input_end_icon);
        this.x = a3;
        ? obj = new Object();
        obj.c = new SparseArray();
        obj.o = this;
        int i = tnc.TextInputLayout_endIconDrawable;
        TypedArray typedArray = (TypedArray) g6d2.c;
        obj.a = typedArray.getResourceId(i, 0);
        obj.b = typedArray.getResourceId(tnc.TextInputLayout_passwordToggleDrawable, 0);
        this.y = obj;
        AppCompatTextView appCompatTextView = new AppCompatTextView(getContext(), (AttributeSet) null);
        this.C0 = appCompatTextView;
        int i2 = tnc.TextInputLayout_errorIconTint;
        TypedArray typedArray2 = (TypedArray) g6d2.c;
        if (typedArray2.hasValue(i2)) {
            this.o = m5a.B(getContext(), g6d2, tnc.TextInputLayout_errorIconTint);
        }
        if (typedArray2.hasValue(tnc.TextInputLayout_errorIconTintMode)) {
            this.v = ct.D(typedArray2.getInt(tnc.TextInputLayout_errorIconTintMode, -1), (PorterDuff.Mode) null);
        }
        if (typedArray2.hasValue(tnc.TextInputLayout_errorIconDrawable)) {
            i(g6d2.q(tnc.TextInputLayout_errorIconDrawable));
        }
        a2.setContentDescription(getResources().getText(ymc.error_icon_content_description));
        WeakHashMap weakHashMap = gag.a;
        a2.setImportantForAccessibility(2);
        a2.setClickable(false);
        a2.setPressable(false);
        a2.setFocusable(false);
        if (!typedArray2.hasValue(tnc.TextInputLayout_passwordToggleEnabled)) {
            if (typedArray2.hasValue(tnc.TextInputLayout_endIconTint)) {
                this.w0 = m5a.B(getContext(), g6d2, tnc.TextInputLayout_endIconTint);
            }
            if (typedArray2.hasValue(tnc.TextInputLayout_endIconTintMode)) {
                this.x0 = ct.D(typedArray2.getInt(tnc.TextInputLayout_endIconTintMode, -1), (PorterDuff.Mode) null);
            }
        }
        if (typedArray2.hasValue(tnc.TextInputLayout_endIconMode)) {
            g(typedArray2.getInt(tnc.TextInputLayout_endIconMode, 0));
            if (typedArray2.hasValue(tnc.TextInputLayout_endIconContentDescription) && a3.getContentDescription() != (text = typedArray2.getText(tnc.TextInputLayout_endIconContentDescription))) {
                a3.setContentDescription(text);
            }
            a3.setCheckable(typedArray2.getBoolean(tnc.TextInputLayout_endIconCheckable, true));
        } else if (typedArray2.hasValue(tnc.TextInputLayout_passwordToggleEnabled)) {
            if (typedArray2.hasValue(tnc.TextInputLayout_passwordToggleTint)) {
                this.w0 = m5a.B(getContext(), g6d2, tnc.TextInputLayout_passwordToggleTint);
            }
            if (typedArray2.hasValue(tnc.TextInputLayout_passwordToggleTintMode)) {
                this.x0 = ct.D(typedArray2.getInt(tnc.TextInputLayout_passwordToggleTintMode, -1), (PorterDuff.Mode) null);
            }
            g(typedArray2.getBoolean(tnc.TextInputLayout_passwordToggleEnabled, false) ? 1 : 0);
            CharSequence text2 = typedArray2.getText(tnc.TextInputLayout_passwordToggleContentDescription);
            if (a3.getContentDescription() != text2) {
                a3.setContentDescription(text2);
            }
        }
        int dimensionPixelSize = typedArray2.getDimensionPixelSize(tnc.TextInputLayout_endIconMinSize, getResources().getDimensionPixelSize(iec.mtrl_min_touch_target_size));
        if (dimensionPixelSize >= 0) {
            if (dimensionPixelSize != this.y0) {
                this.y0 = dimensionPixelSize;
                a3.setMinimumWidth(dimensionPixelSize);
                a3.setMinimumHeight(dimensionPixelSize);
                a2.setMinimumWidth(dimensionPixelSize);
                a2.setMinimumHeight(dimensionPixelSize);
            }
            if (typedArray2.hasValue(tnc.TextInputLayout_endIconScaleType)) {
                ImageView.ScaleType m = hd8.m(typedArray2.getInt(tnc.TextInputLayout_endIconScaleType, -1));
                this.z0 = m;
                a3.setScaleType(m);
                a2.setScaleType(m);
            }
            appCompatTextView.setVisibility(8);
            appCompatTextView.setId(agc.textinput_suffix_text);
            appCompatTextView.setLayoutParams(new LinearLayout.LayoutParams(-2, -2, 80.0f));
            appCompatTextView.setAccessibilityLiveRegion(1);
            appCompatTextView.setTextAppearance(typedArray2.getResourceId(tnc.TextInputLayout_suffixTextAppearance, 0));
            if (typedArray2.hasValue(tnc.TextInputLayout_suffixTextColor)) {
                appCompatTextView.setTextColor(g6d2.o(tnc.TextInputLayout_suffixTextColor));
            }
            CharSequence text3 = typedArray2.getText(tnc.TextInputLayout_suffixText);
            this.B0 = TextUtils.isEmpty(text3) ? null : text3;
            appCompatTextView.setText(text3);
            n();
            frameLayout.addView(a3);
            addView(appCompatTextView);
            addView(frameLayout);
            addView(a2);
            textInputLayout2.n1.add(n65);
            if (textInputLayout2.o != null) {
                n65.a(textInputLayout2);
            }
            addOnAttachStateChangeListener(new el(5, this));
            return;
        }
        throw new IllegalArgumentException("endIconSize cannot be less than 0");
    }

    public final CheckableImageButton a(ViewGroup viewGroup, LayoutInflater layoutInflater, int i) {
        CheckableImageButton checkableImageButton = (CheckableImageButton) layoutInflater.inflate(qjc.design_text_input_end_icon, viewGroup, false);
        checkableImageButton.setId(i);
        if (m5a.K(getContext())) {
            ((ViewGroup.MarginLayoutParams) checkableImageButton.getLayoutParams()).setMarginStart(0);
        }
        return checkableImageButton;
    }

    public final p65 b() {
        p65 b54;
        int i = this.z;
        yy yyVar = this.y;
        SparseArray sparseArray = (SparseArray) yyVar.c;
        p65 p65 = (p65) sparseArray.get(i);
        if (p65 == null) {
            o65 o65 = (o65) yyVar.o;
            if (i == -1) {
                b54 = new b54(o65, 0);
            } else if (i == 0) {
                b54 = new b54(o65, 1);
            } else if (i == 1) {
                p65 = new z9b(o65, yyVar.b);
                sparseArray.append(i, p65);
            } else if (i == 2) {
                b54 = new l23(o65);
            } else if (i == 3) {
                b54 = new kx4(o65);
            } else {
                throw new IllegalArgumentException(wj6.h(i, "Invalid end icon mode: "));
            }
            p65 = b54;
            sparseArray.append(i, p65);
        }
        return p65;
    }

    public final int c() {
        int i;
        if (d() || e()) {
            CheckableImageButton checkableImageButton = this.x;
            i = ((ViewGroup.MarginLayoutParams) checkableImageButton.getLayoutParams()).getMarginStart() + checkableImageButton.getMeasuredWidth();
        } else {
            i = 0;
        }
        WeakHashMap weakHashMap = gag.a;
        return this.C0.getPaddingEnd() + getPaddingEnd() + i;
    }

    public final boolean d() {
        return this.b.getVisibility() == 0 && this.x.getVisibility() == 0;
    }

    public final boolean e() {
        return this.c.getVisibility() == 0;
    }

    public final void f(boolean z2) {
        boolean z3;
        boolean isActivated;
        boolean z4;
        p65 b2 = b();
        boolean k = b2.k();
        CheckableImageButton checkableImageButton = this.x;
        boolean z5 = true;
        if (!k || (z4 = checkableImageButton.o) == b2.l()) {
            z3 = false;
        } else {
            checkableImageButton.setChecked(!z4);
            z3 = true;
        }
        if (!(b2 instanceof kx4) || (isActivated = checkableImageButton.isActivated()) == b2.j()) {
            z5 = z3;
        } else {
            checkableImageButton.setActivated(!isActivated);
        }
        if (z2 || z5) {
            hd8.R(this.a, checkableImageButton, this.w0);
        }
    }

    public final void g(int i) {
        if (this.z != i) {
            p65 b2 = b();
            rt3 rt3 = this.G0;
            AccessibilityManager accessibilityManager = this.F0;
            if (!(rt3 == null || accessibilityManager == null)) {
                accessibilityManager.removeTouchExplorationStateChangeListener(new w3(rt3));
            }
            CharSequence charSequence = null;
            this.G0 = null;
            b2.s();
            this.z = i;
            Iterator it = this.v0.iterator();
            if (!it.hasNext()) {
                h(i != 0);
                p65 b3 = b();
                int i2 = this.y.a;
                if (i2 == 0) {
                    i2 = b3.d();
                }
                Drawable D = i2 != 0 ? iq.D(getContext(), i2) : null;
                CheckableImageButton checkableImageButton = this.x;
                checkableImageButton.setImageDrawable(D);
                TextInputLayout textInputLayout = this.a;
                if (D != null) {
                    hd8.c(textInputLayout, checkableImageButton, this.w0, this.x0);
                    hd8.R(textInputLayout, checkableImageButton, this.w0);
                }
                int c2 = b3.c();
                if (c2 != 0) {
                    charSequence = getResources().getText(c2);
                }
                if (checkableImageButton.getContentDescription() != charSequence) {
                    checkableImageButton.setContentDescription(charSequence);
                }
                checkableImageButton.setCheckable(b3.k());
                if (b3.i(textInputLayout.getBoxBackgroundMode())) {
                    b3.r();
                    rt3 h = b3.h();
                    this.G0 = h;
                    if (!(h == null || accessibilityManager == null)) {
                        WeakHashMap weakHashMap = gag.a;
                        if (isAttachedToWindow()) {
                            accessibilityManager.addTouchExplorationStateChangeListener(new w3(this.G0));
                        }
                    }
                    View.OnClickListener f = b3.f();
                    View.OnLongClickListener onLongClickListener = this.A0;
                    checkableImageButton.setOnClickListener(f);
                    hd8.V(checkableImageButton, onLongClickListener);
                    EditText editText = this.E0;
                    if (editText != null) {
                        b3.m(editText);
                        j(b3);
                    }
                    hd8.c(textInputLayout, checkableImageButton, this.w0, this.x0);
                    f(true);
                    return;
                }
                throw new IllegalStateException("The current box background mode " + textInputLayout.getBoxBackgroundMode() + " is not supported by the end icon mode " + i);
            }
            rae.w(it.next());
            throw null;
        }
    }

    public final void h(boolean z2) {
        if (d() != z2) {
            this.x.setVisibility(z2 ? 0 : 8);
            k();
            m();
            this.a.q();
        }
    }

    public final void i(Drawable drawable) {
        CheckableImageButton checkableImageButton = this.c;
        checkableImageButton.setImageDrawable(drawable);
        l();
        hd8.c(this.a, checkableImageButton, this.o, this.v);
    }

    public final void j(p65 p65) {
        if (this.E0 != null) {
            if (p65.e() != null) {
                this.E0.setOnFocusChangeListener(p65.e());
            }
            if (p65.g() != null) {
                this.x.setOnFocusChangeListener(p65.g());
            }
        }
    }

    public final void k() {
        int i = 8;
        this.b.setVisibility((this.x.getVisibility() != 0 || e()) ? 8 : 0);
        boolean z2 = (this.B0 == null || this.D0) ? true : false;
        if (d() || e() || !z2) {
            i = 0;
        }
        setVisibility(i);
    }

    public final void l() {
        CheckableImageButton checkableImageButton = this.c;
        Drawable drawable = checkableImageButton.getDrawable();
        TextInputLayout textInputLayout = this.a;
        checkableImageButton.setVisibility((drawable == null || !textInputLayout.v0.q || !textInputLayout.m()) ? 8 : 0);
        k();
        m();
        if (this.z == 0) {
            textInputLayout.q();
        }
    }

    public final void m() {
        int i;
        TextInputLayout textInputLayout = this.a;
        if (textInputLayout.o != null) {
            if (d() || e()) {
                i = 0;
            } else {
                EditText editText = textInputLayout.o;
                WeakHashMap weakHashMap = gag.a;
                i = editText.getPaddingEnd();
            }
            int dimensionPixelSize = getContext().getResources().getDimensionPixelSize(iec.material_input_text_to_prefix_suffix_padding);
            int paddingTop = textInputLayout.o.getPaddingTop();
            int paddingBottom = textInputLayout.o.getPaddingBottom();
            WeakHashMap weakHashMap2 = gag.a;
            this.C0.setPaddingRelative(dimensionPixelSize, paddingTop, i, paddingBottom);
        }
    }

    public final void n() {
        AppCompatTextView appCompatTextView = this.C0;
        int visibility = appCompatTextView.getVisibility();
        boolean z2 = false;
        int i = (this.B0 == null || this.D0) ? 8 : 0;
        if (visibility != i) {
            p65 b2 = b();
            if (i == 0) {
                z2 = true;
            }
            b2.p(z2);
        }
        k();
        appCompatTextView.setVisibility(i);
        this.a.q();
    }
}
