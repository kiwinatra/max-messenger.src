package defpackage;

import android.os.Handler;
import android.os.Looper;
import java.util.ArrayList;

/* renamed from: mv4  reason: default package */
public class mv4 implements rdg {
    public boolean a = false;
    public boolean b = false;
    public boolean c = true;
    public lv4 o;
    public gv4 v = null;
    public final kv4 w;

    public mv4(sp6 sp6) {
        this.w = kv4.c ? new kv4() : kv4.b;
        if (sp6 != null) {
            j(sp6);
        }
    }

    public final void a(boolean z) {
        if (this.c != z) {
            this.w.a(z ? jv4.z0 : jv4.A0);
            this.c = z;
            c();
        }
    }

    public final void b() {
        if (!this.a) {
            jv4 jv4 = jv4.x;
            this.w.a(jv4);
            this.a = true;
            gv4 gv4 = this.v;
            if (gv4 != null && ((m0) gv4).h != null) {
                m0 m0Var = (m0) gv4;
                m0Var.getClass();
                if (tf6.X()) {
                    tf6.e("AbstractDraweeController#onAttach");
                }
                if (bg5.e(2)) {
                    bg5.h(m0.x, "controller %x %s: onAttach: %s", Integer.valueOf(System.identityHashCode(m0Var)), m0Var.j, m0Var.m ? "request already submitted" : "request needs submit");
                }
                m0Var.a.a(jv4);
                m0Var.h.getClass();
                m0Var.b.q(m0Var);
                m0Var.l = true;
                if (!m0Var.m) {
                    m0Var.r();
                }
                if (tf6.X()) {
                    tf6.C();
                }
            }
        }
    }

    public final void c() {
        if (!this.b || !this.c) {
            d();
        } else {
            b();
        }
    }

    public final void d() {
        if (this.a) {
            kv4 kv4 = this.w;
            jv4 jv4 = jv4.y;
            kv4.a(jv4);
            boolean z = false;
            this.a = false;
            if (f()) {
                m0 m0Var = (m0) this.v;
                m0Var.getClass();
                tf6.P();
                if (bg5.a.a(2)) {
                    bg5.g(m0.x, "controller %x %s: onDetach", Integer.valueOf(System.identityHashCode(m0Var)), m0Var.j);
                }
                m0Var.a.a(jv4);
                m0Var.l = false;
                pk4 pk4 = m0Var.b;
                pk4.getClass();
                if (Looper.getMainLooper().getThread() == Thread.currentThread()) {
                    synchronized (pk4.a) {
                        try {
                            if (!((ArrayList) pk4.c).contains(m0Var)) {
                                ((ArrayList) pk4.c).add(m0Var);
                                if (((ArrayList) pk4.c).size() == 1) {
                                    z = true;
                                }
                                if (z) {
                                    ((Handler) pk4.b).post((cf) pk4.e);
                                }
                            }
                        } catch (Throwable th) {
                            while (true) {
                                throw th;
                            }
                        }
                    }
                } else {
                    m0Var.n();
                }
                tf6.P();
            }
        }
    }

    public final z7d e() {
        lv4 lv4 = this.o;
        if (lv4 == null) {
            return null;
        }
        return ((sp6) lv4).d;
    }

    public final boolean f() {
        gv4 gv4 = this.v;
        return gv4 != null && ((m0) gv4).h == this.o;
    }

    public final void g() {
        this.w.a(jv4.x0);
        this.b = true;
        c();
    }

    public final void h() {
        this.w.a(jv4.y0);
        this.b = false;
        c();
    }

    public final void i(gv4 gv4) {
        boolean z = this.a;
        if (z) {
            d();
        }
        boolean f = f();
        kv4 kv4 = this.w;
        if (f) {
            kv4.a(jv4.o);
            ((jnb) this.v).w((lv4) null);
        }
        this.v = gv4;
        if (gv4 != null) {
            kv4.a(jv4.c);
            ((jnb) this.v).w(this.o);
        } else {
            kv4.a(jv4.v);
        }
        if (z) {
            b();
        }
    }

    public final void j(lv4 lv4) {
        this.w.a(jv4.a);
        boolean f = f();
        z7d e = e();
        if (e instanceof pdg) {
            e.w = null;
        }
        lv4.getClass();
        this.o = lv4;
        z7d z7d = ((sp6) lv4).d;
        a(z7d == null || z7d.isVisible());
        z7d e2 = e();
        if (e2 instanceof pdg) {
            e2.w = this;
        }
        if (f) {
            ((jnb) this.v).w(lv4);
        }
    }

    public final void onDraw() {
        if (!this.a) {
            bg5.l(kv4.class, "%x: Draw requested for a non-attached controller %x. %s", Integer.valueOf(System.identityHashCode(this)), Integer.valueOf(System.identityHashCode(this.v)), toString());
            this.b = true;
            this.c = true;
            c();
        }
    }

    public final String toString() {
        w28 K = hsg.K(this);
        K.w("controllerAttached", this.a);
        K.w("holderAttached", this.b);
        K.w("drawableVisible", this.c);
        K.x(this.w.a.toString(), "events");
        return K.toString();
    }
}
