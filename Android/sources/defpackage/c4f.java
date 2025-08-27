package defpackage;

import android.util.Size;
import android.view.Surface;
import android.view.SurfaceHolder;
import java.util.Objects;

/* renamed from: c4f  reason: default package */
public final class c4f implements SurfaceHolder.Callback {
    public Size a;
    public z3f b;
    public z3f c;
    public u00 o;
    public Size v;
    public boolean w = false;
    public boolean x = false;
    public final /* synthetic */ d4f y;

    public c4f(d4f d4f) {
        this.y = d4f;
    }

    public final boolean a() {
        d4f d4f = this.y;
        Surface surface = d4f.e.getHolder().getSurface();
        if (this.w || this.b == null || !Objects.equals(this.a, this.v)) {
            return false;
        }
        u00 u00 = this.o;
        z3f z3f = this.b;
        Objects.requireNonNull(z3f);
        z3f.b(surface, iw3.a(d4f.e.getContext()), new a0(17, u00));
        this.w = true;
        d4f.a = true;
        d4f.m();
        return true;
    }

    public final void surfaceChanged(SurfaceHolder surfaceHolder, int i, int i2, int i3) {
        this.v = new Size(i2, i3);
        a();
    }

    public final void surfaceCreated(SurfaceHolder surfaceHolder) {
        z3f z3f;
        if (this.x && (z3f = this.c) != null) {
            z3f.d();
            z3f.j.b((Object) null);
            this.c = null;
            this.x = false;
        }
    }

    public final void surfaceDestroyed(SurfaceHolder surfaceHolder) {
        if (this.w) {
            z3f z3f = this.b;
            if (z3f != null) {
                Objects.toString(z3f);
                this.b.l.a();
            }
        } else {
            z3f z3f2 = this.b;
            if (z3f2 != null) {
                Objects.toString(z3f2);
                this.b.d();
            }
        }
        this.x = true;
        z3f z3f3 = this.b;
        if (z3f3 != null) {
            this.c = z3f3;
        }
        this.w = false;
        this.b = null;
        this.o = null;
        this.v = null;
        this.a = null;
    }
}
