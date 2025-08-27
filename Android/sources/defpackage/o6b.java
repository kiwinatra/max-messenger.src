package defpackage;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.net.Uri;
import com.facebook.imagepipeline.nativecode.NativeRoundingFilter;

/* renamed from: o6b  reason: default package */
public final class o6b extends hk0 {
    public final /* synthetic */ int c = 1;
    public Object d;

    public o6b() {
    }

    public final qx0 b() {
        switch (this.c) {
            case 0:
                return new uae(String.valueOf(((Uri) this.d).hashCode()));
            default:
                if (((uae) this.d) == null) {
                    this.d = new uae("RoundAsCirclePostprocessor#AntiAliased");
                }
                return (uae) this.d;
        }
    }

    public final void c(Bitmap bitmap) {
        switch (this.c) {
            case 0:
                Bitmap A = m5a.A((Uri) this.d);
                if (A != null) {
                    Canvas canvas = new Canvas(bitmap);
                    float width = ((float) bitmap.getWidth()) / ((float) A.getWidth());
                    canvas.scale(width, width);
                    canvas.drawBitmap(A, c44.DEFAULT_ASPECT_RATIO, c44.DEFAULT_ASPECT_RATIO, (Paint) null);
                    return;
                }
                return;
            default:
                NativeRoundingFilter.toCircleFast(bitmap, true);
                return;
        }
    }

    public o6b(Uri uri) {
        this.d = uri;
    }

    public /* synthetic */ o6b(boolean z) {
    }
}
