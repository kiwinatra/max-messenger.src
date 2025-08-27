package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.net.Uri;
import android.util.AttributeSet;
import android.widget.ImageView;

public class AppCompatImageView extends ImageView {
    private final jn mBackgroundTintHelper;
    private boolean mHasLevel;
    private final ko mImageHelper;

    public AppCompatImageView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public void drawableStateChanged() {
        super.drawableStateChanged();
        jn jnVar = this.mBackgroundTintHelper;
        if (jnVar != null) {
            jnVar.a();
        }
        ko koVar = this.mImageHelper;
        if (koVar != null) {
            koVar.a();
        }
    }

    public ColorStateList getSupportBackgroundTintList() {
        jn jnVar = this.mBackgroundTintHelper;
        if (jnVar != null) {
            return jnVar.b();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        jn jnVar = this.mBackgroundTintHelper;
        if (jnVar != null) {
            return jnVar.c();
        }
        return null;
    }

    public ColorStateList getSupportImageTintList() {
        ci3 ci3;
        ko koVar = this.mImageHelper;
        if (koVar == null || (ci3 = koVar.b) == null) {
            return null;
        }
        return (ColorStateList) ci3.d;
    }

    public PorterDuff.Mode getSupportImageTintMode() {
        ci3 ci3;
        ko koVar = this.mImageHelper;
        if (koVar == null || (ci3 = koVar.b) == null) {
            return null;
        }
        return (PorterDuff.Mode) ci3.e;
    }

    public boolean hasOverlappingRendering() {
        return ((this.mImageHelper.a.getBackground() instanceof RippleDrawable) ^ true) && super.hasOverlappingRendering();
    }

    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        jn jnVar = this.mBackgroundTintHelper;
        if (jnVar != null) {
            jnVar.e();
        }
    }

    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        jn jnVar = this.mBackgroundTintHelper;
        if (jnVar != null) {
            jnVar.f(i);
        }
    }

    public void setImageBitmap(Bitmap bitmap) {
        super.setImageBitmap(bitmap);
        ko koVar = this.mImageHelper;
        if (koVar != null) {
            koVar.a();
        }
    }

    public void setImageDrawable(Drawable drawable) {
        ko koVar = this.mImageHelper;
        if (!(koVar == null || drawable == null || this.mHasLevel)) {
            koVar.c = drawable.getLevel();
        }
        super.setImageDrawable(drawable);
        ko koVar2 = this.mImageHelper;
        if (koVar2 != null) {
            koVar2.a();
            if (!this.mHasLevel) {
                ko koVar3 = this.mImageHelper;
                ImageView imageView = koVar3.a;
                if (imageView.getDrawable() != null) {
                    imageView.getDrawable().setLevel(koVar3.c);
                }
            }
        }
    }

    public void setImageLevel(int i) {
        super.setImageLevel(i);
        this.mHasLevel = true;
    }

    public void setImageResource(int i) {
        ko koVar = this.mImageHelper;
        if (koVar != null) {
            koVar.c(i);
        }
    }

    public void setImageURI(Uri uri) {
        super.setImageURI(uri);
        ko koVar = this.mImageHelper;
        if (koVar != null) {
            koVar.a();
        }
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        jn jnVar = this.mBackgroundTintHelper;
        if (jnVar != null) {
            jnVar.h(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        jn jnVar = this.mBackgroundTintHelper;
        if (jnVar != null) {
            jnVar.i(mode);
        }
    }

    public void setSupportImageTintList(ColorStateList colorStateList) {
        ko koVar = this.mImageHelper;
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
        ko koVar = this.mImageHelper;
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
    public AppCompatImageView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        tkf.a(context);
        this.mHasLevel = false;
        zhf.a(getContext(), this);
        jn jnVar = new jn(this);
        this.mBackgroundTintHelper = jnVar;
        jnVar.d(attributeSet, i);
        ko koVar = new ko(this);
        this.mImageHelper = koVar;
        koVar.b(attributeSet, i);
    }
}
