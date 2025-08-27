package defpackage;

import java.io.IOException;

/* renamed from: i37  reason: default package */
public abstract class i37 implements yfe {
    public final dc6 a;
    public boolean b;
    public final /* synthetic */ u9 c;

    public i37(u9 u9Var) {
        this.c = u9Var;
        this.a = new dc6(((xu0) u9Var.w).q());
    }

    public long e(rt0 rt0, long j) {
        u9 u9Var = this.c;
        try {
            return ((xu0) u9Var.w).e(rt0, j);
        } catch (IOException e) {
            ((mtc) u9Var.v).k();
            m();
            throw e;
        }
    }

    public final void m() {
        u9 u9Var = this.c;
        int i = u9Var.b;
        if (i != 6) {
            if (i == 5) {
                dc6 dc6 = this.a;
                lkf lkf = dc6.e;
                dc6.e = lkf.d;
                lkf.a();
                lkf.b();
                u9Var.b = 6;
                return;
            }
            throw new IllegalStateException("state: " + u9Var.b);
        }
    }

    public final lkf q() {
        return this.a;
    }
}
