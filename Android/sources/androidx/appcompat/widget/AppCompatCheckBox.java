package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.InputFilter;
import android.util.AttributeSet;
import android.widget.CheckBox;

public class AppCompatCheckBox extends CheckBox implements vkf, t15 {
    public final mn a;
    public final jn b;
    public final gp c;
    public jo o;

    public AppCompatCheckBox(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, hdc.checkboxStyle);
    }

    private jo getEmojiTextViewHelper() {
        if (this.o == null) {
            this.o = new jo(this);
        }
        return this.o;
    }

    public final boolean a() {
        return getEmojiTextViewHelper().b();
    }

    public void drawableStateChanged() {
        super.drawableStateChanged();
        jn jnVar = this.b;
        if (jnVar != null) {
            jnVar.a();
        }
        gp gpVar = this.c;
        if (gpVar != null) {
            gpVar.b();
        }
    }

    public ColorStateList getSupportBackgroundTintList() {
        jn jnVar = this.b;
        if (jnVar != null) {
            return jnVar.b();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        jn jnVar = this.b;
        if (jnVar != null) {
            return jnVar.c();
        }
        return null;
    }

    public ColorStateList getSupportButtonTintList() {
        mn mnVar = this.a;
        if (mnVar != null) {
            return mnVar.a;
        }
        return null;
    }

    public PorterDuff.Mode getSupportButtonTintMode() {
        mn mnVar = this.a;
        if (mnVar != null) {
            return mnVar.b;
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.c.d();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.c.e();
    }

    public void setAllCaps(boolean z) {
        super.setAllCaps(z);
        getEmojiTextViewHelper().d(z);
    }

    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        jn jnVar = this.b;
        if (jnVar != null) {
            jnVar.e();
        }
    }

    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        jn jnVar = this.b;
        if (jnVar != null) {
            jnVar.f(i);
        }
    }

    public void setButtonDrawable(Drawable drawable) {
        super.setButtonDrawable(drawable);
        mn mnVar = this.a;
        if (mnVar == null) {
            return;
        }
        if (mnVar.e) {
            mnVar.e = false;
            return;
        }
        mnVar.e = true;
        mnVar.a();
    }

    public void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        gp gpVar = this.c;
        if (gpVar != null) {
            gpVar.b();
        }
    }

    public void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        gp gpVar = this.c;
        if (gpVar != null) {
            gpVar.b();
        }
    }

    public void setEmojiCompatEnabled(boolean z) {
        getEmojiTextViewHelper().e(z);
    }

    public void setFilters(InputFilter[] inputFilterArr) {
        super.setFilters(getEmojiTextViewHelper().a(inputFilterArr));
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        jn jnVar = this.b;
        if (jnVar != null) {
            jnVar.h(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        jn jnVar = this.b;
        if (jnVar != null) {
            jnVar.i(mode);
        }
    }

    public void setSupportButtonTintList(ColorStateList colorStateList) {
        mn mnVar = this.a;
        if (mnVar != null) {
            mnVar.a = colorStateList;
            mnVar.c = true;
            mnVar.a();
        }
    }

    public void setSupportButtonTintMode(PorterDuff.Mode mode) {
        mn mnVar = this.a;
        if (mnVar != null) {
            mnVar.b = mode;
            mnVar.d = true;
            mnVar.a();
        }
    }

    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        gp gpVar = this.c;
        gpVar.i(colorStateList);
        gpVar.b();
    }

    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        gp gpVar = this.c;
        gpVar.j(mode);
        gpVar.b();
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AppCompatCheckBox(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        tkf.a(context);
        zhf.a(getContext(), this);
        mn mnVar = new mn(this);
        this.a = mnVar;
        mnVar.c(attributeSet, i);
        jn jnVar = new jn(this);
        this.b = jnVar;
        jnVar.d(attributeSet, i);
        gp gpVar = new gp(this);
        this.c = gpVar;
        gpVar.f(attributeSet, i);
        getEmojiTextViewHelper().c(attributeSet, i);
    }

    public void setButtonDrawable(int i) {
        setButtonDrawable(iq.D(getContext(), i));
    }
}
