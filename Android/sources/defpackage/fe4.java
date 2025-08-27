package defpackage;

import android.content.res.Resources;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import com.facebook.imagepipeline.image.CloseableStaticBitmap;

/* renamed from: fe4  reason: default package */
public final class fe4 implements tu4 {
    public final Resources a;
    public final tu4 b;
    public final tu4 c = null;

    public fe4(Resources resources, xc4 xc4) {
        this.a = resources;
        this.b = xc4;
    }

    /* JADX INFO: finally extract failed */
    public final Drawable a(v33 v33) {
        try {
            tf6.P();
            if (v33 instanceof CloseableStaticBitmap) {
                CloseableStaticBitmap closeableStaticBitmap = (CloseableStaticBitmap) v33;
                BitmapDrawable bitmapDrawable = new BitmapDrawable(this.a, closeableStaticBitmap.getUnderlyingBitmap());
                if (closeableStaticBitmap.getRotationAngle() == 0 || closeableStaticBitmap.getRotationAngle() == -1) {
                    if (closeableStaticBitmap.getExifOrientation() == 1 || closeableStaticBitmap.getExifOrientation() == 0) {
                        tf6.P();
                        return bitmapDrawable;
                    }
                }
                o5b o5b = new o5b(bitmapDrawable, closeableStaticBitmap.getRotationAngle(), closeableStaticBitmap.getExifOrientation());
                tf6.P();
                return o5b;
            }
            tu4 tu4 = this.b;
            if (tu4 != null) {
                if (tu4.b(v33)) {
                    Drawable a2 = tu4.a(v33);
                    tf6.P();
                    return a2;
                }
            }
            tu4 tu42 = this.c;
            if (tu42 != null) {
                if (tu42.b(v33)) {
                    Drawable a3 = tu42.a(v33);
                    tf6.P();
                    return a3;
                }
            }
            tf6.P();
            return null;
        } catch (Throwable th) {
            tf6.P();
            throw th;
        }
    }

    public final boolean b(v33 v33) {
        return true;
    }
}
