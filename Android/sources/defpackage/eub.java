package defpackage;

import java.util.ArrayList;
import java.util.Objects;

/* renamed from: eub  reason: default package */
public final class eub implements iha {
    public final qu1 a;
    public final fz9 b;
    public jub c;
    public final sda d;
    public oj6 e;
    public boolean f = false;

    public eub(qu1 qu1, fz9 fz9, sda sda) {
        this.a = qu1;
        this.b = fz9;
        this.d = sda;
        synchronized (this) {
            this.c = (jub) fz9.d();
        }
    }

    public final void a(Object obj) {
        ru1 ru1 = (ru1) obj;
        ru1 ru12 = ru1.CLOSING;
        jub jub = jub.a;
        if (ru1 == ru12 || ru1 == ru1.CLOSED || ru1 == ru1.RELEASING || ru1 == ru1.RELEASED) {
            b(jub);
            if (this.f) {
                this.f = false;
                oj6 oj6 = this.e;
                if (oj6 != null) {
                    oj6.cancel(false);
                    this.e = null;
                }
            }
        } else if ((ru1 == ru1.OPENING || ru1 == ru1.OPEN || ru1 == ru1.PENDING_OPEN) && !this.f) {
            b(jub);
            ArrayList arrayList = new ArrayList();
            qu1 qu1 = this.a;
            oj6 a2 = oj6.a(m5a.F(new u00((Object) this, (Object) qu1, (Object) arrayList, 24)));
            y3a y3a = new y3a(12, (Object) this);
            ep4 j = ryg.j();
            a2.getClass();
            cz1 b0 = hd8.b0(a2, y3a, j);
            bu1 bu1 = new bu1(2, this);
            cz1 b02 = hd8.b0(b0, new xv1(22, (Object) bu1), ryg.j());
            this.e = b02;
            hd8.a(b02, new d19(this, arrayList, qu1), ryg.j());
            this.f = true;
        }
    }

    public final void b(jub jub) {
        synchronized (this) {
            try {
                if (!this.c.equals(jub)) {
                    this.c = jub;
                    Objects.toString(jub);
                    this.b.i(jub);
                }
            } catch (Throwable th) {
                while (true) {
                    throw th;
                }
            }
        }
    }

    public final void onError(Throwable th) {
        oj6 oj6 = this.e;
        if (oj6 != null) {
            oj6.cancel(false);
            this.e = null;
        }
        b(jub.a);
    }
}
