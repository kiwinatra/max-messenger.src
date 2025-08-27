package defpackage;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;

/* renamed from: df  reason: default package */
public final class df extends Drawable implements Animatable, bv4 {
    public static final ekd y0 = new ekd(7);
    public int X;
    public final long Y = 8;
    public int Z;
    public final dg a;
    public final jz2 b;
    public volatile boolean c;
    public long o;
    public long v;
    public volatile ekd v0 = y0;
    public long w;
    public ov6 w0;
    public int x;
    public final cf x0;
    public long y;
    public long z;

    /* JADX WARNING: type inference failed for: r0v2, types: [ts1, java.lang.Object] */
    public df(eg egVar) {
        this.a = egVar;
        ? obj = new Object();
        this.x0 = new cf(0, this);
        this.b = new jz2(egVar);
        egVar.q(obj);
    }

    public final void a() {
        dg dgVar = this.a;
        if (dgVar != null) {
            dgVar.clear();
        }
    }

    public final void draw(Canvas canvas) {
        if (this.a != null && this.b != null) {
            long uptimeMillis = SystemClock.uptimeMillis();
            long max = this.c ? uptimeMillis - this.o : (long) Math.max((double) this.v, 0.0d);
            int T = this.b.T(max);
            if (T == -1) {
                T = this.a.e() - 1;
                this.v0.getClass();
                this.c = false;
            } else if (T == 0 && this.x != -1 && uptimeMillis >= this.w) {
                this.v0.getClass();
            }
            boolean s = this.a.s(this, canvas, T);
            if (s) {
                this.v0.getClass();
                this.x = T;
            }
            if (!s) {
                this.Z++;
                if (bg5.a.a(2)) {
                    bg5.f(df.class, Integer.valueOf(this.Z), "Dropped a frame. Count: %s");
                }
            }
            long uptimeMillis2 = SystemClock.uptimeMillis();
            if (this.c) {
                long V = this.b.V(uptimeMillis2 - this.o);
                if (V != -1) {
                    long j = this.o + V + this.Y;
                    this.w = j;
                    scheduleSelf(this.x0, j);
                } else {
                    this.v0.getClass();
                    this.c = false;
                }
            }
            this.v = max;
        }
    }

    public final int getIntrinsicHeight() {
        dg dgVar = this.a;
        return dgVar != null ? dgVar.l() : super.getIntrinsicHeight();
    }

    public final int getIntrinsicWidth() {
        dg dgVar = this.a;
        return dgVar != null ? dgVar.p() : super.getIntrinsicWidth();
    }

    public final int getOpacity() {
        return -3;
    }

    public final boolean isRunning() {
        return this.c;
    }

    public final void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        dg dgVar = this.a;
        if (dgVar != null) {
            dgVar.o(rect);
        }
    }

    public final boolean onLevelChange(int i) {
        if (this.c) {
            return false;
        }
        long j = (long) i;
        if (this.v == j) {
            return false;
        }
        this.v = j;
        invalidateSelf();
        return true;
    }

    public final void setAlpha(int i) {
        if (this.w0 == null) {
            this.w0 = new ov6();
        }
        this.w0.c = i;
        dg dgVar = this.a;
        if (dgVar != null) {
            dgVar.d(i);
        }
    }

    public final void setColorFilter(ColorFilter colorFilter) {
        if (this.w0 == null) {
            this.w0 = new ov6();
        }
        ov6 ov6 = this.w0;
        ov6.f = colorFilter;
        ov6.b = colorFilter != null;
        dg dgVar = this.a;
        if (dgVar != null) {
            dgVar.h(colorFilter);
        }
    }

    public final void start() {
        dg dgVar;
        if (!this.c && (dgVar = this.a) != null && dgVar.e() > 1) {
            this.c = true;
            long uptimeMillis = SystemClock.uptimeMillis();
            long j = uptimeMillis - this.y;
            this.o = j;
            this.w = j;
            this.v = uptimeMillis - this.z;
            this.x = this.X;
            invalidateSelf();
            this.v0.getClass();
        }
    }

    public final void stop() {
        if (this.c) {
            long uptimeMillis = SystemClock.uptimeMillis();
            this.y = uptimeMillis - this.o;
            this.z = uptimeMillis - this.v;
            this.X = this.x;
            this.c = false;
            this.o = 0;
            this.w = 0;
            this.v = -1;
            this.x = -1;
            unscheduleSelf(this.x0);
            this.v0.getClass();
        }
    }
}
