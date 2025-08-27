package defpackage;

/* renamed from: b6h  reason: default package */
public final class b6h extends z4h {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ b6h(int i, Object obj) {
        this.b = i;
        this.c = obj;
    }

    public final void a() {
        switch (this.b) {
            case 0:
                synchronized (((h7h) this.c).f) {
                    try {
                        if (((h7h) this.c).k.get() <= 0 || ((h7h) this.c).k.decrementAndGet() <= 0) {
                            h7h h7h = (h7h) this.c;
                            if (h7h.m != null) {
                                h7h.b.a("Unbind from service.", new Object[0]);
                                h7h h7h2 = (h7h) this.c;
                                h7h2.a.unbindService(h7h2.l);
                                h7h h7h3 = (h7h) this.c;
                                h7h3.g = false;
                                h7h3.m = null;
                                h7h3.l = null;
                            }
                            ((h7h) this.c).c();
                            return;
                        }
                        ((h7h) this.c).b.a("Leaving the connection open for other ongoing calls.", new Object[0]);
                        return;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            default:
                v6h v6h = (v6h) this.c;
                h7h h7h4 = (h7h) v6h.b;
                h7h4.b.a("unlinkToDeath", new Object[0]);
                h7h4.m.asBinder().unlinkToDeath(h7h4.j, 0);
                h7h h7h5 = (h7h) v6h.b;
                h7h5.m = null;
                h7h5.g = false;
                return;
        }
    }
}
