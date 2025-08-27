package defpackage;

import android.view.Surface;
import androidx.appcompat.widget.Toolbar;
import java.util.concurrent.Executor;

/* renamed from: obd  reason: default package */
public final class obd implements ja7 {
    public boolean a;
    public int b;
    public final Object c;
    public final Object o;
    public Object v;
    public Object w;
    public Object x;

    public obd(ja7 ja7) {
        this.c = new Object();
        this.b = 0;
        this.a = false;
        this.x = new k87(1, this);
        this.o = ja7;
        this.v = ja7.getSurface();
    }

    public void a() {
        synchronized (this.c) {
            try {
                this.a = true;
                ((ja7) this.o).i();
                if (this.b == 0) {
                    close();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void close() {
        synchronized (this.c) {
            try {
                Surface surface = (Surface) this.v;
                if (surface != null) {
                    surface.release();
                }
                ((ja7) this.o).close();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public ha7 e() {
        l87 l87;
        synchronized (this.c) {
            ha7 e = ((ja7) this.o).e();
            if (e != null) {
                this.b++;
                l87 = new l87(e);
                l87.a((k87) this.x);
            } else {
                l87 = null;
            }
        }
        return l87;
    }

    public int f() {
        int f;
        synchronized (this.c) {
            f = ((ja7) this.o).f();
        }
        return f;
    }

    public int getHeight() {
        int height;
        synchronized (this.c) {
            height = ((ja7) this.o).getHeight();
        }
        return height;
    }

    public Surface getSurface() {
        Surface surface;
        synchronized (this.c) {
            surface = ((ja7) this.o).getSurface();
        }
        return surface;
    }

    public int getWidth() {
        int width;
        synchronized (this.c) {
            width = ((ja7) this.o).getWidth();
        }
        return width;
    }

    public void i() {
        synchronized (this.c) {
            ((ja7) this.o).i();
        }
    }

    public void k(ia7 ia7, Executor executor) {
        synchronized (this.c) {
            ((ja7) this.o).k(new pbb(14, this, ia7), executor);
        }
    }

    public int o() {
        int o2;
        synchronized (this.c) {
            o2 = ((ja7) this.o).o();
        }
        return o2;
    }

    public ha7 p() {
        l87 l87;
        synchronized (this.c) {
            ha7 p = ((ja7) this.o).p();
            if (p != null) {
                this.b++;
                l87 = new l87(p);
                l87.a((k87) this.x);
            } else {
                l87 = null;
            }
        }
        return l87;
    }

    public obd(fj fjVar, Toolbar toolbar) {
        this.v = null;
        this.w = null;
        this.a = true;
        this.b = lic.toolbar_title;
        this.c = fjVar;
        this.o = toolbar;
    }
}
