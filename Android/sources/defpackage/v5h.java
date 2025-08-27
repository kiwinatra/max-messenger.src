package defpackage;

/* renamed from: v5h  reason: default package */
public final class v5h extends z4h {
    public final /* synthetic */ qdf b;
    public final /* synthetic */ z4h c;
    public final /* synthetic */ h7h o;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public v5h(h7h h7h, qdf qdf, qdf qdf2, t2h t2h) {
        super(qdf);
        this.b = qdf2;
        this.c = t2h;
        this.o = h7h;
    }

    public final void a() {
        synchronized (this.o.f) {
            try {
                h7h h7h = this.o;
                qdf qdf = this.b;
                h7h.e.add(qdf);
                qdf.a.i(new p7d(28, (Object) h7h, (Object) qdf));
                if (this.o.k.getAndIncrement() > 0) {
                    this.o.b.a("Already connected to the service.", new Object[0]);
                }
                h7h.b(this.o, this.c);
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
