package defpackage;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.ImageView;
import java.util.WeakHashMap;

/* renamed from: ko  reason: default package */
public final class ko {
    public final ImageView a;
    public ci3 b;
    public int c = 0;

    public ko(ImageView imageView) {
        this.a = imageView;
    }

    public final void a() {
        ci3 ci3;
        ImageView imageView = this.a;
        Drawable drawable = imageView.getDrawable();
        if (drawable != null) {
            yu4.a(drawable);
        }
        if (drawable != null && (ci3 = this.b) != null) {
            ho.e(drawable, ci3, imageView.getDrawableState());
        }
    }

    public final void b(AttributeSet attributeSet, int i) {
        ImageView imageView = this.a;
        g6d w = g6d.w(imageView.getContext(), attributeSet, koc.AppCompatImageView, i, 0);
        ImageView imageView2 = this.a;
        Context context = imageView2.getContext();
        int[] iArr = koc.AppCompatImageView;
        WeakHashMap weakHashMap = gag.a;
        bag.d(imageView2, context, iArr, attributeSet, (TypedArray) w.c, i, 0);
        try {
            Drawable drawable = imageView.getDrawable();
            TypedArray typedArray = (TypedArray) w.c;
            if (drawable == null) {
                int resourceId = typedArray.getResourceId(koc.AppCompatImageView_srcCompat, -1);
                if (!(resourceId == -1 || (drawable = iq.D(imageView.getContext(), resourceId)) == null)) {
                    imageView.setImageDrawable(drawable);
                }
            }
            if (drawable != null) {
                yu4.a(drawable);
            }
            if (typedArray.hasValue(koc.AppCompatImageView_tint)) {
                ua7.c(imageView, w.o(koc.AppCompatImageView_tint));
            }
            if (typedArray.hasValue(koc.AppCompatImageView_tintMode)) {
                ua7.d(imageView, yu4.c(typedArray.getInt(koc.AppCompatImageView_tintMode, -1), (PorterDuff.Mode) null));
            }
            w.x();
        } catch (Throwable th) {
            w.x();
            throw th;
        }
    }

    public final void c(int i) {
        ImageView imageView = this.a;
        if (i != 0) {
            Drawable D = iq.D(imageView.getContext(), i);
            if (D != null) {
                yu4.a(D);
            }
            imageView.setImageDrawable(D);
        } else {
            imageView.setImageDrawable((Drawable) null);
        }
        a();
    }
}
