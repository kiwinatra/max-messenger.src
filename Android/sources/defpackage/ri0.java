package defpackage;

import android.graphics.Bitmap;
import com.facebook.imagepipeline.image.CloseableStaticBitmap;

/* renamed from: ri0  reason: default package */
public abstract class ri0 extends ej0 {
    public final void f(i0 i0Var) {
        if (i0Var.h()) {
            y33 y33 = (y33) i0Var.e();
            try {
                g((y33 == null || !(y33.e0() instanceof CloseableStaticBitmap)) ? null : ((CloseableStaticBitmap) y33.e0()).getUnderlyingBitmap());
            } finally {
                y33.U(y33);
            }
        }
    }

    public abstract void g(Bitmap bitmap);
}
