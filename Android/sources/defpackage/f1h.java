package defpackage;

/* renamed from: f1h  reason: default package */
public final class f1h extends g1h {
    public final void a(long j, Object obj) {
        bzg bzg = (bzg) ((x0h) k3h.i(j, obj));
        if (bzg.a) {
            bzg.a = false;
        }
    }

    public final void b(long j, Object obj, Object obj2) {
        x0h x0h = (x0h) k3h.i(j, obj);
        x0h x0h2 = (x0h) k3h.i(j, obj2);
        int size = x0h.size();
        int size2 = x0h2.size();
        if (size > 0 && size2 > 0) {
            if (!((bzg) x0h).a) {
                x0h = x0h.c(size2 + size);
            }
            x0h.addAll(x0h2);
        }
        if (size > 0) {
            x0h2 = x0h;
        }
        k3h.p(j, obj, x0h2);
    }
}
