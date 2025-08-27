package defpackage;

/* renamed from: a65  reason: default package */
public final /* synthetic */ class a65 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ c65 b;
    public final /* synthetic */ do1 c;

    public /* synthetic */ a65(c65 c65, do1 do1, int i) {
        this.a = i;
        this.b = c65;
        this.c = do1;
    }

    public final void run() {
        switch (this.a) {
            case 0:
                this.c.b(this.b.b);
                return;
            default:
                c65 c65 = this.b;
                du0 du0 = c65.b;
                du0 du02 = du0.a;
                do1 do1 = this.c;
                if (du0 == du02) {
                    g65 g65 = c65.o;
                    zz7 a2 = g65.a();
                    hd8.N(a2, do1);
                    do1.a(new b65(c65, a2, 0), ryg.j());
                    c65.c.add(a2);
                    a2.d(new b65(c65, a2, 1), g65.h);
                    return;
                } else if (du0 == du0.b) {
                    do1.d(new IllegalStateException("BufferProvider is not active."));
                    return;
                } else {
                    do1.d(new IllegalStateException("Unknown state: " + c65.b));
                    return;
                }
        }
    }
}
