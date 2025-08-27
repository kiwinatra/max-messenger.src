package defpackage;

import android.hardware.camera2.TotalCaptureResult;

/* renamed from: fs1  reason: default package */
public final class fs1 implements ls1 {
    public final lr1 a;
    public final zq0 b;
    public final int c;
    public boolean d = false;

    public fs1(lr1 lr1, int i, zq0 zq0) {
        this.a = lr1;
        this.c = i;
        this.b = zq0;
    }

    public final zz7 a(TotalCaptureResult totalCaptureResult) {
        if (!u40.g(this.c, totalCaptureResult)) {
            return hd8.E(Boolean.FALSE);
        }
        this.d = true;
        oj6 a2 = oj6.a(m5a.F(new d9d(27, this)));
        es1 es1 = new es1(0);
        ep4 j = ryg.j();
        a2.getClass();
        return hd8.b0(a2, new xv1(22, (Object) es1), j);
    }

    public final boolean b() {
        return this.c == 0;
    }

    public final void c() {
        if (this.d) {
            this.a.h.a(false, true);
            this.b.b = false;
        }
    }
}
