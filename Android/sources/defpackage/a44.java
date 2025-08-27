package defpackage;

import java.lang.ref.WeakReference;

/* renamed from: a44  reason: default package */
public final class a44 implements Runnable {
    public final boolean X;
    public final WeakReference a;
    public final long b = 500;
    public final long c = System.currentTimeMillis();
    public final float o;
    public final float v;
    public final float w;
    public final float x;
    public final float y;
    public final float z;

    public a44(c44 c44, float f, float f2, float f3, float f4, float f5, float f6, boolean z2) {
        this.a = new WeakReference(c44);
        this.o = f;
        this.v = f2;
        this.w = f3;
        this.x = f4;
        this.y = f5;
        this.z = f6;
        this.X = z2;
    }

    public final void run() {
        c44 c44 = (c44) this.a.get();
        if (c44 != null) {
            long currentTimeMillis = System.currentTimeMillis() - this.c;
            long j = this.b;
            float min = (float) Math.min(j, currentTimeMillis);
            float f = (float) j;
            float f2 = (min / f) - 1.0f;
            float f3 = (f2 * f2 * f2) + 1.0f;
            float f4 = (this.w * f3) + c44.DEFAULT_ASPECT_RATIO;
            float f5 = (f3 * this.x) + c44.DEFAULT_ASPECT_RATIO;
            float n = f6e.n(min, this.z, f);
            if (min < f) {
                float[] fArr = c44.mCurrentImageCenter;
                c44.postTranslate(f4 - (fArr[0] - this.o), f5 - (fArr[1] - this.v));
                if (!this.X) {
                    c44.zoomInImage(this.y + n, c44.mCropRect.centerX(), c44.mCropRect.centerY());
                }
                if (!c44.isImageWrapCropBounds()) {
                    c44.post(this);
                }
            }
        }
    }
}
