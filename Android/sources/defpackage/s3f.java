package defpackage;

import android.graphics.RectF;
import android.opengl.Matrix;
import android.util.Size;
import android.view.Surface;
import java.io.Closeable;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: s3f  reason: default package */
public final class s3f implements Closeable {
    public final go1 X;
    public do1 Y;
    public final Object a = new Object();
    public final Surface b;
    public final int c;
    public final Size o;
    public final float[] v;
    public tk3 w;
    public Executor x;
    public boolean y;
    public boolean z;

    public s3f(Surface surface, int i, Size size, kc0 kc0, kc0 kc02) {
        float[] fArr = new float[16];
        this.v = fArr;
        this.y = false;
        this.z = false;
        this.b = surface;
        this.c = i;
        this.o = size;
        a(fArr, new float[16], kc0);
        a(new float[16], new float[16], kc02);
        this.X = m5a.F(new nqd(21, this));
    }

    public static void a(float[] fArr, float[] fArr2, kc0 kc0) {
        Matrix.setIdentityM(fArr, 0);
        if (kc0 != null) {
            y7e.S(fArr);
            int i = kc0.d;
            y7e.R(fArr, (float) i);
            boolean z2 = kc0.e;
            if (z2) {
                Matrix.translateM(fArr, 0, 1.0f, c44.DEFAULT_ASPECT_RATIO, c44.DEFAULT_ASPECT_RATIO);
                Matrix.scaleM(fArr, 0, -1.0f, 1.0f, 1.0f);
            }
            Size size = kc0.a;
            Size g = grf.g(size, i);
            float f = (float) 0;
            android.graphics.Matrix a2 = grf.a(new RectF(f, f, (float) size.getWidth(), (float) size.getHeight()), new RectF(f, f, (float) g.getWidth(), (float) g.getHeight()), i, z2);
            RectF rectF = new RectF(kc0.b);
            a2.mapRect(rectF);
            Matrix.translateM(fArr, 0, rectF.left / ((float) g.getWidth()), ((((float) g.getHeight()) - rectF.height()) - rectF.top) / ((float) g.getHeight()), c44.DEFAULT_ASPECT_RATIO);
            Matrix.scaleM(fArr, 0, rectF.width() / ((float) g.getWidth()), rectF.height() / ((float) g.getHeight()), 1.0f);
            Matrix.setIdentityM(fArr2, 0);
            y7e.S(fArr2);
            su1 su1 = kc0.c;
            if (su1 != null) {
                bs0.r("Camera has no transform.", su1.l());
                y7e.R(fArr2, (float) su1.n().c());
                if (su1.n().h() == 0) {
                    Matrix.translateM(fArr2, 0, 1.0f, c44.DEFAULT_ASPECT_RATIO, c44.DEFAULT_ASPECT_RATIO);
                    Matrix.scaleM(fArr2, 0, -1.0f, 1.0f, 1.0f);
                }
            }
            Matrix.invertM(fArr2, 0, fArr2, 0);
            Matrix.multiplyMM(fArr, 0, fArr2, 0, fArr, 0);
        }
    }

    public final Surface b(ew6 ew6, tk3 tk3) {
        boolean z2;
        synchronized (this.a) {
            this.x = ew6;
            this.w = tk3;
            z2 = this.y;
        }
        if (z2) {
            m();
        }
        return this.b;
    }

    public final void close() {
        synchronized (this.a) {
            try {
                if (!this.z) {
                    this.z = true;
                }
            } catch (Throwable th) {
                while (true) {
                    throw th;
                }
            }
        }
        this.Y.b((Object) null);
    }

    public final void m() {
        Executor executor;
        AtomicReference atomicReference = new AtomicReference();
        synchronized (this.a) {
            try {
                if (this.x != null) {
                    tk3 tk3 = this.w;
                    if (tk3 != null) {
                        if (!this.z) {
                            atomicReference.set(tk3);
                            executor = this.x;
                            this.y = false;
                        }
                        executor = null;
                    }
                }
                this.y = true;
                executor = null;
            } catch (Throwable th) {
                while (true) {
                    throw th;
                }
            }
        }
        if (executor != null) {
            try {
                executor.execute(new s6e(7, this, atomicReference));
            } catch (RejectedExecutionException unused) {
            }
        }
    }
}
