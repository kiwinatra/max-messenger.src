package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.net.Uri;
import android.util.AttributeSet;
import android.widget.ImageButton;
import android.widget.ImageView;

public class AppCompatImageButton extends ImageButton {
    public final jn a;
    public final ko b;
    public boolean c;

    public AppCompatImageButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, hdc.imageButtonStyle);
    }

    public final void drawableStateChanged() {
        super.drawableStateChanged();
        jn jnVar = this.a;
        if (jnVar != null) {
            jnVar.a();
        }
        ko koVar = this.b;
        if (koVar != null) {
            koVar.a();
        }
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

    public ColorStateList getSupportImageTintList() {
        ci3 ci3;
        ko koVar = this.b;
        if (koVar == null || (ci3 = koVar.b) == null) {
            return null;
        }
        return (ColorStateList) ci3.d;
    }

    public PorterDuff.Mode getSupportImageTintMode() {
        ci3 ci3;
        ko koVar = this.b;
        if (koVar == null || (ci3 = koVar.b) == null) {
            return null;
        }
        return (PorterDuff.Mode) ci3.e;
    }

    public final boolean hasOverlappingRendering() {
        return ((this.b.a.getBackground() instanceof RippleDrawable) ^ true) && super.hasOverlappingRendering();
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

    public void setImageBitmap(Bitmap bitmap) {
        super.setImageBitmap(bitmap);
        ko koVar = this.b;
        if (koVar != null) {
            koVar.a();
        }
    }

    public void setImageDrawable(Drawable drawable) {
        ko koVar = this.b;
        if (!(koVar == null || drawable == null || this.c)) {
            koVar.c = drawable.getLevel();
        }
        super.setImageDrawable(drawable);
        if (koVar != null) {
            koVar.a();
            if (!this.c) {
                ImageView imageView = koVar.a;
                if (imageView.getDrawable() != null) {
                    imageView.getDrawable().setLevel(koVar.c);
                }
            }
        }
    }

    public void setImageLevel(int i) {
        super.setImageLevel(i);
        this.c = true;
    }

    public void setImageResource(int i) {
        this.b.c(i);
    }

    public void setImageURI(Uri uri) {
        super.setImageURI(uri);
        ko koVar = this.b;
        if (koVar != null) {
            koVar.a();
        }
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

    public void setSupportImageTintList(ColorStateList colorStateList) {
        ko koVar = this.b;
        if (koVar != null) {
            if (koVar.b == null) {
                koVar.b = new ci3(2);
            }
            ci3 ci3 = koVar.b;
            ci3.d = colorStateList;
            ci3.c = true;
            koVar.a();
        }
    }

    public void setSupportImageTintMode(PorterDuff.Mode mode) {
        ko koVar = this.b;
        if (koVar != null) {
            if (koVar.b == null) {
                koVar.b = new ci3(2);
            }
            ci3 ci3 = koVar.b;
            ci3.e = mode;
            ci3.b = true;
            koVar.a();
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AppCompatImageButton(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        tkf.a(context);
        this.c = false;
        zhf.a(getContext(), this);
        jn jnVar = new jn(this);
        this.a = jnVar;
        jnVar.d(attributeSet, i);
        ko koVar = new ko(this);
        this.b = koVar;
        koVar.b(attributeSet, i);
    }
}
