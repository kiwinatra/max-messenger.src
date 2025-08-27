package defpackage;

/* renamed from: qdf  reason: default package */
public final class qdf {
    public final s7h a = new s7h();

    public final void a(Exception exc) {
        this.a.m(exc);
    }

    public final void b(Object obj) {
        this.a.n(obj);
    }

    public final void c(Exception exc) {
        s7h s7h = this.a;
        s7h.getClass();
        vzg.n(exc, "Exception must not be null");
        synchronized (s7h.a) {
            try {
                if (!s7h.c) {
                    s7h.c = true;
                    s7h.f = exc;
                    s7h.b.x(s7h);
                }
            } catch (Throwable th) {
                while (true) {
                    throw th;
                }
            }
        }
    }

    public final void d(Object obj) {
        s7h s7h = this.a;
        synchronized (s7h.a) {
            try {
                if (!s7h.c) {
                    s7h.c = true;
                    s7h.e = obj;
                    s7h.b.x(s7h);
                }
            } catch (Throwable th) {
                while (true) {
                    throw th;
                }
            }
        }
    }
}
