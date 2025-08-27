package defpackage;

import android.graphics.Matrix;
import android.graphics.Rect;
import android.media.ImageWriter;
import java.nio.ByteBuffer;

/* renamed from: h87  reason: default package */
public abstract class h87 implements ia7 {
    public ByteBuffer X;
    public ByteBuffer Y;
    public final Object Z;
    public volatile int a;
    public volatile int b = 1;
    public volatile boolean c;
    public obd o;
    public ImageWriter v;
    public boolean v0;
    public Rect w = new Rect();
    public Matrix x;
    public ByteBuffer y;
    public ByteBuffer z;

    public h87() {
        new Rect();
        this.x = new Matrix();
        new Matrix();
        this.Z = new Object();
        this.v0 = true;
    }

    public abstract ha7 a(ja7 ja7);

    public final zz7 b(ha7 ha7) {
        int i = this.c ? this.a : 0;
        synchronized (this.Z) {
            try {
                if (this.c && i != 0) {
                    f(ha7, i);
                }
                if (this.c) {
                    d(ha7);
                }
            } catch (Throwable th) {
                while (true) {
                    throw th;
                }
            }
        }
        return new xa7(1, new RuntimeException("No analyzer or executor currently set.".toString()));
    }

    public abstract void c();

    public final void d(ha7 ha7) {
        if (this.b == 1) {
            if (this.z == null) {
                this.z = ByteBuffer.allocateDirect(ha7.getHeight() * ha7.getWidth());
            }
            this.z.position(0);
            if (this.X == null) {
                this.X = ByteBuffer.allocateDirect((ha7.getHeight() * ha7.getWidth()) / 4);
            }
            this.X.position(0);
            if (this.Y == null) {
                this.Y = ByteBuffer.allocateDirect((ha7.getHeight() * ha7.getWidth()) / 4);
            }
            this.Y.position(0);
        } else if (this.b == 2 && this.y == null) {
            this.y = ByteBuffer.allocateDirect(ha7.getHeight() * ha7.getWidth() * 4);
        }
    }

    public abstract void e(ha7 ha7);

    public final void f(ha7 ha7, int i) {
        obd obd = this.o;
        if (obd != null) {
            obd.a();
            int width = ha7.getWidth();
            int height = ha7.getHeight();
            int f = this.o.f();
            int o2 = this.o.o();
            boolean z2 = i == 90 || i == 270;
            int i2 = z2 ? height : width;
            if (!z2) {
                width = height;
            }
            this.o = new obd(b59.n(i2, width, f, o2));
            if (this.b == 1) {
                ImageWriter imageWriter = this.v;
                if (imageWriter != null) {
                    imageWriter.close();
                }
                this.v = ImageWriter.newInstance(this.o.getSurface(), this.o.o());
            }
        }
    }

    public final void i(ja7 ja7) {
        try {
            ha7 a2 = a(ja7);
            if (a2 != null) {
                e(a2);
            }
        } catch (IllegalStateException unused) {
        }
    }
}
