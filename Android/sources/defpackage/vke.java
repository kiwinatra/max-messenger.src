package defpackage;

import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.appcompat.widget.AppCompatTextView;
import com.google.android.material.internal.CheckableImageButton;
import com.google.android.material.textfield.TextInputLayout;
import java.util.WeakHashMap;

/* renamed from: vke  reason: default package */
public final class vke extends LinearLayout {
    public final TextInputLayout a;
    public final AppCompatTextView b;
    public CharSequence c;
    public final CheckableImageButton o;
    public ColorStateList v;
    public boolean v0;
    public PorterDuff.Mode w;
    public int x;
    public ImageView.ScaleType y;
    public View.OnLongClickListener z;

    public vke(TextInputLayout textInputLayout, g6d g6d) {
        super(textInputLayout.getContext());
        CharSequence text;
        this.a = textInputLayout;
        setVisibility(8);
        setOrientation(0);
        setLayoutParams(new FrameLayout.LayoutParams(-2, -1, 8388611));
        CheckableImageButton checkableImageButton = (CheckableImageButton) LayoutInflater.from(getContext()).inflate(qjc.design_text_input_start_icon, this, false);
        this.o = checkableImageButton;
        CharSequence charSequence = null;
        AppCompatTextView appCompatTextView = new AppCompatTextView(getContext(), (AttributeSet) null);
        this.b = appCompatTextView;
        if (m5a.K(getContext())) {
            ((ViewGroup.MarginLayoutParams) checkableImageButton.getLayoutParams()).setMarginEnd(0);
        }
        View.OnLongClickListener onLongClickListener = this.z;
        checkableImageButton.setOnClickListener((View.OnClickListener) null);
        hd8.V(checkableImageButton, onLongClickListener);
        this.z = null;
        checkableImageButton.setOnLongClickListener((View.OnLongClickListener) null);
        hd8.V(checkableImageButton, (View.OnLongClickListener) null);
        int i = tnc.TextInputLayout_startIconTint;
        TypedArray typedArray = (TypedArray) g6d.c;
        if (typedArray.hasValue(i)) {
            this.v = m5a.B(getContext(), g6d, tnc.TextInputLayout_startIconTint);
        }
        if (typedArray.hasValue(tnc.TextInputLayout_startIconTintMode)) {
            this.w = ct.D(typedArray.getInt(tnc.TextInputLayout_startIconTintMode, -1), (PorterDuff.Mode) null);
        }
        if (typedArray.hasValue(tnc.TextInputLayout_startIconDrawable)) {
            b(g6d.q(tnc.TextInputLayout_startIconDrawable));
            if (typedArray.hasValue(tnc.TextInputLayout_startIconContentDescription) && checkableImageButton.getContentDescription() != (text = typedArray.getText(tnc.TextInputLayout_startIconContentDescription))) {
                checkableImageButton.setContentDescription(text);
            }
            checkableImageButton.setCheckable(typedArray.getBoolean(tnc.TextInputLayout_startIconCheckable, true));
        }
        int dimensionPixelSize = typedArray.getDimensionPixelSize(tnc.TextInputLayout_startIconMinSize, getResources().getDimensionPixelSize(iec.mtrl_min_touch_target_size));
        if (dimensionPixelSize >= 0) {
            if (dimensionPixelSize != this.x) {
                this.x = dimensionPixelSize;
                checkableImageButton.setMinimumWidth(dimensionPixelSize);
                checkableImageButton.setMinimumHeight(dimensionPixelSize);
            }
            if (typedArray.hasValue(tnc.TextInputLayout_startIconScaleType)) {
                ImageView.ScaleType m = hd8.m(typedArray.getInt(tnc.TextInputLayout_startIconScaleType, -1));
                this.y = m;
                checkableImageButton.setScaleType(m);
            }
            appCompatTextView.setVisibility(8);
            appCompatTextView.setId(agc.textinput_prefix_text);
            appCompatTextView.setLayoutParams(new LinearLayout.LayoutParams(-2, -2));
            WeakHashMap weakHashMap = gag.a;
            appCompatTextView.setAccessibilityLiveRegion(1);
            appCompatTextView.setTextAppearance(typedArray.getResourceId(tnc.TextInputLayout_prefixTextAppearance, 0));
            if (typedArray.hasValue(tnc.TextInputLayout_prefixTextColor)) {
                appCompatTextView.setTextColor(g6d.o(tnc.TextInputLayout_prefixTextColor));
            }
            CharSequence text2 = typedArray.getText(tnc.TextInputLayout_prefixText);
            this.c = !TextUtils.isEmpty(text2) ? text2 : charSequence;
            appCompatTextView.setText(text2);
            e();
            addView(checkableImageButton);
            addView(appCompatTextView);
            return;
        }
        throw new IllegalArgumentException("startIconSize cannot be less than 0");
    }

    public final int a() {
        int i;
        CheckableImageButton checkableImageButton = this.o;
        if (checkableImageButton.getVisibility() == 0) {
            i = ((ViewGroup.MarginLayoutParams) checkableImageButton.getLayoutParams()).getMarginEnd() + checkableImageButton.getMeasuredWidth();
        } else {
            i = 0;
        }
        WeakHashMap weakHashMap = gag.a;
        return this.b.getPaddingStart() + getPaddingStart() + i;
    }

    public final void b(Drawable drawable) {
        CheckableImageButton checkableImageButton = this.o;
        checkableImageButton.setImageDrawable(drawable);
        if (drawable != null) {
            ColorStateList colorStateList = this.v;
            PorterDuff.Mode mode = this.w;
            TextInputLayout textInputLayout = this.a;
            hd8.c(textInputLayout, checkableImageButton, colorStateList, mode);
            c(true);
            hd8.R(textInputLayout, checkableImageButton, this.v);
            return;
        }
        c(false);
        View.OnLongClickListener onLongClickListener = this.z;
        checkableImageButton.setOnClickListener((View.OnClickListener) null);
        hd8.V(checkableImageButton, onLongClickListener);
        this.z = null;
        checkableImageButton.setOnLongClickListener((View.OnLongClickListener) null);
        hd8.V(checkableImageButton, (View.OnLongClickListener) null);
        if (checkableImageButton.getContentDescription() != null) {
            checkableImageButton.setContentDescription((CharSequence) null);
        }
    }

    public final void c(boolean z2) {
        CheckableImageButton checkableImageButton = this.o;
        int i = 0;
        if ((checkableImageButton.getVisibility() == 0) != z2) {
            if (!z2) {
                i = 8;
            }
            checkableImageButton.setVisibility(i);
            d();
            e();
        }
    }

    public final void d() {
        int i;
        EditText editText = this.a.o;
        if (editText != null) {
            if (this.o.getVisibility() == 0) {
                i = 0;
            } else {
                WeakHashMap weakHashMap = gag.a;
                i = editText.getPaddingStart();
            }
            int compoundPaddingTop = editText.getCompoundPaddingTop();
            int dimensionPixelSize = getContext().getResources().getDimensionPixelSize(iec.material_input_text_to_prefix_suffix_padding);
            int compoundPaddingBottom = editText.getCompoundPaddingBottom();
            WeakHashMap weakHashMap2 = gag.a;
            this.b.setPaddingRelative(i, compoundPaddingTop, dimensionPixelSize, compoundPaddingBottom);
        }
    }

    public final void e() {
        int i = 8;
        int i2 = (this.c == null || this.v0) ? 8 : 0;
        if (this.o.getVisibility() == 0 || i2 == 0) {
            i = 0;
        }
        setVisibility(i);
        this.b.setVisibility(i2);
        this.a.q();
    }

    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        d();
    }
}
