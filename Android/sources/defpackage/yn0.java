package defpackage;

import android.graphics.Bitmap;

/* renamed from: yn0  reason: default package */
public final class yn0 {
    public int a;
    public int b;
    public final int c;
    public long d;
    public final Object e;

    public yn0(int i, int i2) {
        boolean z = false;
        if (i > 0) {
            if (i2 > 0 ? true : z) {
                this.b = i;
                this.c = i2;
                this.e = new xv1(6, (Object) this);
                return;
            }
            throw new IllegalArgumentException();
        }
        throw new IllegalArgumentException();
    }

    public synchronized void a(Bitmap bitmap) {
        int d2 = vo0.d(bitmap);
        boolean z = false;
        cvg.m("No bitmaps registered.", this.a > 0);
        long j = (long) d2;
        if (j <= this.d) {
            z = true;
        }
        cvg.n(z, "Bitmap size bigger than the total registered size: %d, %d", Integer.valueOf(d2), Long.valueOf(this.d));
        this.d -= j;
        this.a--;
    }

    public synchronized int b() {
        return this.c;
    }

    public yn0(int i, int i2, int i3, long j, sq9 sq9) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = j;
        this.e = sq9;
    }
}
