package defpackage;

import android.graphics.Bitmap;
import android.graphics.Matrix;

/* renamed from: efb  reason: default package */
public final class efb extends hk0 {
    public final /* synthetic */ int c;
    public final int d;

    public /* synthetic */ efb(int i, int i2) {
        this.c = i2;
        this.d = i;
    }

    public final y33 a(Bitmap bitmap, ynb ynb) {
        switch (this.c) {
            case 0:
                Matrix matrix = new Matrix();
                int i = this.d;
                if (i > 0) {
                    matrix.postRotate((float) i, (float) (bitmap.getWidth() / 2), (float) (bitmap.getHeight() / 2));
                }
                return y33.q0(Bitmap.createBitmap(bitmap, 0, 0, bitmap.getWidth(), bitmap.getHeight(), matrix, true), new qbb(1), y33.w);
            default:
                Matrix matrix2 = new Matrix();
                int i2 = this.d;
                if (i2 > 0) {
                    matrix2.postRotate((float) i2, ((float) bitmap.getWidth()) / 2.0f, ((float) bitmap.getHeight()) / 2.0f);
                }
                return y33.q0(Bitmap.createBitmap(bitmap, 0, 0, bitmap.getWidth(), bitmap.getHeight(), matrix2, true), new qbb(2), y33.w);
        }
    }

    public final qx0 b() {
        switch (this.c) {
            case 0:
                return new uae(String.valueOf(this.d));
            default:
                return new uae(String.valueOf(this.d));
        }
    }
}
