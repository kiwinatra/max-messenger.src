package androidx.appcompat.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.InputFilter;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ActionMode;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputMethodManager;
import android.view.textclassifier.TextClassifier;
import android.widget.TextView;
import androidx.core.widget.a;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

public class AppCompatTextView extends TextView implements t15 {
    public final jn a;
    public final gp b;
    public jo c;
    public boolean o;
    public ip v;
    public Future w;

    public AppCompatTextView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 16842884);
    }

    private jo getEmojiTextViewHelper() {
        if (this.c == null) {
            this.c = new jo(this);
        }
        return this.c;
    }

    public final boolean a() {
        return getEmojiTextViewHelper().b();
    }

    public final void drawableStateChanged() {
        super.drawableStateChanged();
        jn jnVar = this.a;
        if (jnVar != null) {
            jnVar.a();
        }
        gp gpVar = this.b;
        if (gpVar != null) {
            gpVar.b();
        }
    }

    public int getAutoSizeMaxTextSize() {
        return super.getAutoSizeMaxTextSize();
    }

    public int getAutoSizeMinTextSize() {
        return super.getAutoSizeMinTextSize();
    }

    public int getAutoSizeStepGranularity() {
        return super.getAutoSizeStepGranularity();
    }

    public int[] getAutoSizeTextAvailableSizes() {
        return super.getAutoSizeTextAvailableSizes();
    }

    @SuppressLint({"WrongConstant"})
    public int getAutoSizeTextType() {
        return super.getAutoSizeTextType() == 1 ? 1 : 0;
    }

    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        return a.b(super.getCustomSelectionActionModeCallback());
    }

    public int getFirstBaselineToTopHeight() {
        return getPaddingTop() - getPaint().getFontMetricsInt().top;
    }

    public int getLastBaselineToBottomHeight() {
        return getPaddingBottom() + getPaint().getFontMetricsInt().bottom;
    }

    public hp getSuperCaller() {
        if (this.v == null) {
            if (Build.VERSION.SDK_INT >= 34) {
                this.v = new jp(this);
            } else {
                this.v = new ip(this);
            }
        }
        return this.v;
    }

    public ColorStateList getSupportBackgroundTintList() {
        jn jnVar = this.a;
        if (jnVar != null) {
            return jnVar.b();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        jn jnVar = this.a;
        if (jnVar != null) {
            return jnVar.c();
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.b.d();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.b.e();
    }

    public CharSequence getText() {
        i();
        return super.getText();
    }

    public TextClassifier getTextClassifier() {
        return super.getTextClassifier();
    }

    public ksb getTextMetricsParamsCompat() {
        return new ksb(ugf.c(this));
    }

    public final void i() {
        Future future = this.w;
        if (future != null) {
            try {
                this.w = null;
                rae.w(future.get());
                throw null;
            } catch (InterruptedException | ExecutionException unused) {
            }
        }
    }

    public final InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
        this.b.getClass();
        gp.h(this, onCreateInputConnection, editorInfo);
        q8.x(onCreateInputConnection, editorInfo, this);
        return onCreateInputConnection;
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        int i = Build.VERSION.SDK_INT;
        if (i >= 30 && i < 33 && onCheckIsTextEditor()) {
            ((InputMethodManager) getContext().getSystemService("input_method")).isActive(this);
        }
    }

    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        gp gpVar = this.b;
        if (gpVar != null) {
            gpVar.getClass();
        }
    }

    public void onMeasure(int i, int i2) {
        i();
        super.onMeasure(i, i2);
    }

    public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        super.onTextChanged(charSequence, i, i2, i3);
    }

    public void setAllCaps(boolean z) {
        super.setAllCaps(z);
        getEmojiTextViewHelper().d(z);
    }

    public final void setAutoSizeTextTypeUniformWithConfiguration(int i, int i2, int i3, int i4) {
        super.setAutoSizeTextTypeUniformWithConfiguration(i, i2, i3, i4);
    }

    public final void setAutoSizeTextTypeUniformWithPresetSizes(int[] iArr, int i) {
        super.setAutoSizeTextTypeUniformWithPresetSizes(iArr, i);
    }

    public void setAutoSizeTextTypeWithDefaults(int i) {
        super.setAutoSizeTextTypeWithDefaults(i);
    }

    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        jn jnVar = this.a;
        if (jnVar != null) {
            jnVar.e();
        }
    }

    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        jn jnVar = this.a;
        if (jnVar != null) {
            jnVar.f(i);
        }
    }

    public final void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        gp gpVar = this.b;
        if (gpVar != null) {
            gpVar.b();
        }
    }

    public final void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        gp gpVar = this.b;
        if (gpVar != null) {
            gpVar.b();
        }
    }

    public final void setCompoundDrawablesRelativeWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        gp gpVar = this.b;
        if (gpVar != null) {
            gpVar.b();
        }
    }

    public final void setCompoundDrawablesWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        gp gpVar = this.b;
        if (gpVar != null) {
            gpVar.b();
        }
    }

    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(callback);
    }

    public void setEmojiCompatEnabled(boolean z) {
        getEmojiTextViewHelper().e(z);
    }

    public void setFilters(InputFilter[] inputFilterArr) {
        super.setFilters(getEmojiTextViewHelper().a(inputFilterArr));
    }

    public void setFirstBaselineToTopHeight(int i) {
        getSuperCaller().Q0(i);
    }

    public void setLastBaselineToBottomHeight(int i) {
        getSuperCaller().H0(i);
    }

    public void setLineHeight(int i) {
        a.a(this, i);
    }

    public void setPrecomputedText(lsb lsb) {
        throw null;
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        jn jnVar = this.a;
        if (jnVar != null) {
            jnVar.h(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        jn jnVar = this.a;
        if (jnVar != null) {
            jnVar.i(mode);
        }
    }

    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        gp gpVar = this.b;
        gpVar.i(colorStateList);
        gpVar.b();
    }

    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        gp gpVar = this.b;
        gpVar.j(mode);
        gpVar.b();
    }

    public void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        gp gpVar = this.b;
        if (gpVar != null) {
            gpVar.g(i, context);
        }
    }

    public void setTextClassifier(TextClassifier textClassifier) {
        super.setTextClassifier(textClassifier);
    }

    public void setTextFuture(Future<lsb> future) {
        this.w = future;
        if (future != null) {
            requestLayout();
        }
    }

    public void setTextMetricsParamsCompat(ksb ksb) {
        TextDirectionHeuristic textDirectionHeuristic;
        TextDirectionHeuristic textDirectionHeuristic2 = ksb.b;
        TextDirectionHeuristic textDirectionHeuristic3 = TextDirectionHeuristics.FIRSTSTRONG_RTL;
        int i = 1;
        if (!(textDirectionHeuristic2 == textDirectionHeuristic3 || textDirectionHeuristic2 == (textDirectionHeuristic = TextDirectionHeuristics.FIRSTSTRONG_LTR))) {
            if (textDirectionHeuristic2 == TextDirectionHeuristics.ANYRTL_LTR) {
                i = 2;
            } else if (textDirectionHeuristic2 == TextDirectionHeuristics.LTR) {
                i = 3;
            } else if (textDirectionHeuristic2 == TextDirectionHeuristics.RTL) {
                i = 4;
            } else if (textDirectionHeuristic2 == TextDirectionHeuristics.LOCALE) {
                i = 5;
            } else if (textDirectionHeuristic2 == textDirectionHeuristic) {
                i = 6;
            } else if (textDirectionHeuristic2 == textDirectionHeuristic3) {
                i = 7;
            }
        }
        setTextDirection(i);
        getPaint().set(ksb.a);
        tgf.e(this, ksb.c);
        tgf.h(this, ksb.d);
    }

    public final void setTypeface(Typeface typeface, int i) {
        Typeface typeface2;
        if (!this.o) {
            if (typeface == null || i <= 0) {
                typeface2 = null;
            } else {
                Context context = getContext();
                pf6 pf6 = iuf.a;
                if (context != null) {
                    typeface2 = Typeface.create(typeface, i);
                } else {
                    throw new IllegalArgumentException("Context cannot be null");
                }
            }
            this.o = true;
            if (typeface2 != null) {
                typeface = typeface2;
            }
            try {
                super.setTypeface(typeface, i);
            } finally {
                this.o = false;
            }
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AppCompatTextView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        tkf.a(context);
        this.o = false;
        this.v = null;
        zhf.a(getContext(), this);
        jn jnVar = new jn(this);
        this.a = jnVar;
        jnVar.d(attributeSet, i);
        gp gpVar = new gp(this);
        this.b = gpVar;
        gpVar.f(attributeSet, i);
        gpVar.b();
        getEmojiTextViewHelper().c(attributeSet, i);
    }

    public final void setLineHeight(int i, float f) {
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 34) {
            getSuperCaller().S0(i, f);
        } else if (i2 >= 34) {
            vgf.a(this, i, f);
        } else {
            a.a(this, Math.round(TypedValue.applyDimension(i, f, getResources().getDisplayMetrics())));
        }
    }

    public final void setCompoundDrawablesRelativeWithIntrinsicBounds(int i, int i2, int i3, int i4) {
        Context context = getContext();
        Drawable drawable = null;
        Drawable D = i != 0 ? iq.D(context, i) : null;
        Drawable D2 = i2 != 0 ? iq.D(context, i2) : null;
        Drawable D3 = i3 != 0 ? iq.D(context, i3) : null;
        if (i4 != 0) {
            drawable = iq.D(context, i4);
        }
        setCompoundDrawablesRelativeWithIntrinsicBounds(D, D2, D3, drawable);
        gp gpVar = this.b;
        if (gpVar != null) {
            gpVar.b();
        }
    }

    public final void setCompoundDrawablesWithIntrinsicBounds(int i, int i2, int i3, int i4) {
        Context context = getContext();
        Drawable drawable = null;
        Drawable D = i != 0 ? iq.D(context, i) : null;
        Drawable D2 = i2 != 0 ? iq.D(context, i2) : null;
        Drawable D3 = i3 != 0 ? iq.D(context, i3) : null;
        if (i4 != 0) {
            drawable = iq.D(context, i4);
        }
        setCompoundDrawablesWithIntrinsicBounds(D, D2, D3, drawable);
        gp gpVar = this.b;
        if (gpVar != null) {
            gpVar.b();
        }
    }
}
