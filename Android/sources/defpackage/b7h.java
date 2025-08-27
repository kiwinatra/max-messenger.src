package defpackage;

/* renamed from: b7h  reason: default package */
public final class b7h extends a6h {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ b7h(int i, Object obj) {
        this.b = i;
        this.c = obj;
    }

    public final void a() {
        switch (this.b) {
            case 0:
                synchronized (((x7h) this.c).f) {
                    try {
                        if (((x7h) this.c).k.get() > 0) {
                            if (((x7h) this.c).k.decrementAndGet() > 0) {
                                ((x7h) this.c).b.d("Leaving the connection open for other ongoing calls.", new Object[0]);
                                return;
                            }
                        }
                        x7h x7h = (x7h) this.c;
                        if (x7h.m != null) {
                            x7h.b.d("Unbind from service.", new Object[0]);
                            x7h x7h2 = (x7h) this.c;
                            x7h2.a.unbindService(x7h2.l);
                            x7h x7h3 = (x7h) this.c;
                            x7h3.g = false;
                            x7h3.m = null;
                            x7h3.l = null;
                        }
                        ((x7h) this.c).d();
                        return;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            default:
                v6h v6h = (v6h) this.c;
                x7h x7h4 = (x7h) v6h.b;
                x7h4.b.d("unlinkToDeath", new Object[0]);
                x7h4.m.asBinder().unlinkToDeath(x7h4.j, 0);
                x7h x7h5 = (x7h) v6h.b;
                x7h5.m = null;
                x7h5.g = false;
                return;
        }
    }
}
