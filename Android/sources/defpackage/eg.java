package defpackage;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* renamed from: eg  reason: default package */
public final class eg implements dg {
    public boolean a;
    public long b;
    public Object c;
    public Object o = "";
    public Object v = vv0.DEFAULT;
    public Object w;
    public Object x;

    public synchronized void a() {
        if (!this.a) {
            this.a = true;
            ((ScheduledExecutorService) this.v).schedule((cf) this.x, 1000, TimeUnit.MILLISECONDS);
        }
    }

    public void clear() {
        dg dgVar = (dg) this.c;
        if (dgVar != null) {
            dgVar.clear();
        }
    }

    public void d(int i) {
        dg dgVar = (dg) this.c;
        if (dgVar != null) {
            dgVar.d(i);
        }
    }

    public int e() {
        dg dgVar = (dg) this.c;
        if (dgVar == null) {
            return 0;
        }
        return dgVar.e();
    }

    public void h(ColorFilter colorFilter) {
        dg dgVar = (dg) this.c;
        if (dgVar != null) {
            dgVar.h(colorFilter);
        }
    }

    public int i() {
        dg dgVar = (dg) this.c;
        if (dgVar == null) {
            return 0;
        }
        return dgVar.i();
    }

    public int j(int i) {
        dg dgVar = (dg) this.c;
        if (dgVar == null) {
            return 0;
        }
        return dgVar.j(i);
    }

    public int l() {
        dg dgVar = (dg) this.c;
        if (dgVar == null) {
            return -1;
        }
        return dgVar.l();
    }

    public void o(Rect rect) {
        dg dgVar = (dg) this.c;
        if (dgVar != null) {
            dgVar.o(rect);
        }
    }

    public int p() {
        dg dgVar = (dg) this.c;
        if (dgVar == null) {
            return -1;
        }
        return dgVar.p();
    }

    public void q(ts1 ts1) {
        dg dgVar = (dg) this.c;
        if (dgVar != null) {
            dgVar.q(ts1);
        }
    }

    public boolean s(Drawable drawable, Canvas canvas, int i) {
        this.b = ((ys9) this.o).now();
        boolean z = false;
        dg dgVar = (dg) this.c;
        if (dgVar != null && dgVar.s(drawable, canvas, i)) {
            z = true;
        }
        a();
        return z;
    }

    public int t() {
        dg dgVar = (dg) this.c;
        if (dgVar == null) {
            return 0;
        }
        return dgVar.t();
    }
}
