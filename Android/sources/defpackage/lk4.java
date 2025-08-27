package defpackage;

import android.util.Log;
import android.util.Size;
import androidx.camera.core.impl.DeferrableSurface$SurfaceClosedException;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: lk4  reason: default package */
public abstract class lk4 {
    public static final Size k = new Size(0, 0);
    public static final AtomicInteger l = new AtomicInteger(0);
    public static final AtomicInteger m = new AtomicInteger(0);
    public final Object a = new Object();
    public int b = 0;
    public boolean c = false;
    public do1 d;
    public final go1 e;
    public do1 f;
    public final go1 g;
    public final Size h;
    public final int i;
    public Class j;

    public lk4(Size size, int i2) {
        this.h = size;
        this.i = i2;
        go1 F = m5a.F(new jk4(this, 0));
        this.e = F;
        this.g = m5a.F(new jk4(this, 1));
        if (o54.C(3, "DeferrableSurface")) {
            m.incrementAndGet();
            l.get();
            toString();
            F.b.d(new kk4(this, Log.getStackTraceString(new Exception())), ryg.j());
        }
    }

    public void a() {
        do1 do1;
        synchronized (this.a) {
            try {
                if (!this.c) {
                    this.c = true;
                    this.f.b((Object) null);
                    if (this.b == 0) {
                        do1 = this.d;
                        this.d = null;
                    } else {
                        do1 = null;
                    }
                    if (o54.C(3, "DeferrableSurface")) {
                        toString();
                    }
                } else {
                    do1 = null;
                }
            } catch (Throwable th) {
                while (true) {
                    throw th;
                }
            }
        }
        if (do1 != null) {
            do1.b((Object) null);
        }
    }

    public final void b() {
        do1 do1;
        synchronized (this.a) {
            try {
                int i2 = this.b;
                if (i2 != 0) {
                    int i3 = i2 - 1;
                    this.b = i3;
                    if (i3 != 0 || !this.c) {
                        do1 = null;
                    } else {
                        do1 = this.d;
                        this.d = null;
                    }
                    if (o54.C(3, "DeferrableSurface")) {
                        toString();
                        if (this.b == 0) {
                            m.get();
                            l.decrementAndGet();
                            toString();
                        }
                    }
                } else {
                    throw new IllegalStateException("Decrementing use count occurs more times than incrementing");
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (do1 != null) {
            do1.b((Object) null);
        }
    }

    public final zz7 c() {
        synchronized (this.a) {
            try {
                if (this.c) {
                    xa7 xa7 = new xa7(1, new DeferrableSurface$SurfaceClosedException(this, "DeferrableSurface already closed."));
                    return xa7;
                }
                zz7 e2 = e();
                return e2;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void d() {
        synchronized (this.a) {
            try {
                int i2 = this.b;
                if (i2 == 0) {
                    if (this.c) {
                        throw new DeferrableSurface$SurfaceClosedException(this, "Cannot begin use on a closed surface.");
                    }
                }
                this.b = i2 + 1;
                if (o54.C(3, "DeferrableSurface")) {
                    if (this.b == 1) {
                        m.get();
                        l.incrementAndGet();
                        toString();
                    }
                    toString();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public abstract zz7 e();
}
