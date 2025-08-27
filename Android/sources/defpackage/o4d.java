package defpackage;

import android.graphics.Rect;
import java.util.ArrayList;
import java.util.Collections;

/* renamed from: o4d  reason: default package */
public final class o4d implements au1 {
    public final au1 b;
    public final /* synthetic */ int c;
    public final Object d;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public o4d(au1 au1) {
        this(au1, (byte) 0);
        this.c = 0;
        this.d = au1;
    }

    public final void a() {
        this.b.a();
    }

    public zz7 b(float f) {
        switch (this.c) {
            case 0:
                return ((au1) this.d).b(f);
            default:
                return q(f);
        }
    }

    public final void c(je3 je3) {
        this.b.c(je3);
    }

    public zz7 d(float f) {
        switch (this.c) {
            case 0:
                return ((au1) this.d).d(f);
            default:
                return r(f);
        }
    }

    public final Rect e() {
        return this.b.e();
    }

    public final void f(int i) {
        this.b.f(i);
    }

    public final void g(x87 x87) {
        this.b.g(x87);
    }

    public zz7 h(u05 u05) {
        switch (this.c) {
            case 0:
                return ((au1) this.d).h(u05);
            default:
                return s(u05);
        }
    }

    public zz7 i(ArrayList arrayList, int i, int i2) {
        switch (this.c) {
            case 1:
                boolean z = true;
                if (arrayList.size() != 1) {
                    z = false;
                }
                bs0.m("Only support one capture config.", z);
                zz7 l = this.b.l(i, i2);
                oj6 a = oj6.a(l);
                sj6 sj6 = new sj6(l, 2);
                ep4 j = ryg.j();
                a.getClass();
                return hd8.b(Collections.singletonList(hd8.b0(hd8.b0(hd8.b0(a, sj6, j), new hzf(8, this, arrayList), ryg.j()), new sj6(l, 3), ryg.j())));
            default:
                return t(arrayList, i, i2);
        }
    }

    public final void j(bwd bwd) {
        this.b.j(bwd);
    }

    public zz7 k(boolean z) {
        switch (this.c) {
            case 0:
                return ((au1) this.d).k(z);
            default:
                return p(z);
        }
    }

    public final zz7 l(int i, int i2) {
        return this.b.l(i, i2);
    }

    public final je3 m() {
        return this.b.m();
    }

    public final void n() {
        this.b.n();
    }

    public final void o() {
        this.b.o();
    }

    public final zz7 p(boolean z) {
        return this.b.k(z);
    }

    public final zz7 q(float f) {
        return this.b.b(f);
    }

    public final zz7 r(float f) {
        return this.b.d(f);
    }

    public final zz7 s(u05 u05) {
        return this.b.h(u05);
    }

    public final zz7 t(ArrayList arrayList, int i, int i2) {
        return this.b.i(arrayList, i, i2);
    }

    public o4d(au1 au1, byte b2) {
        this.b = au1;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public o4d(au1 au1, nqd nqd) {
        this(au1, (byte) 0);
        this.c = 1;
        this.d = nqd;
    }
}
