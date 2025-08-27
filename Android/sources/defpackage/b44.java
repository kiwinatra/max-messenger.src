package defpackage;

import java.lang.ref.WeakReference;

/* renamed from: b44  reason: default package */
public final class b44 implements Runnable {
    public final WeakReference a;
    public final long b;
    public final long c = System.currentTimeMillis();
    public final float o;
    public final float v;
    public final float w;
    public final float x;

    public b44(c44 c44, long j, float f, float f2, float f3, float f4) {
        this.a = new WeakReference(c44);
        this.b = j;
        this.o = f;
        this.v = f2;
        this.w = f3;
        this.x = f4;
    }

    public final void run() {
        c44 c44 = (c44) this.a.get();
        if (c44 != null) {
            long currentTimeMillis = System.currentTimeMillis() - this.c;
            long j = this.b;
            float min = (float) Math.min(j, currentTimeMillis);
            float f = (float) j;
            float n = f6e.n(min, this.v, f);
            if (min < f) {
                c44.zoomInImage(this.o + n, this.w, this.x);
                c44.post(this);
                return;
            }
            c44.setImageToWrapCropBounds();
        }
    }
}
