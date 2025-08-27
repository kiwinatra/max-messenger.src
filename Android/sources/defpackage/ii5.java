package defpackage;

/* renamed from: ii5  reason: default package */
public final /* synthetic */ class ii5 implements t2f {
    public final /* synthetic */ int a;
    public final /* synthetic */ long b;
    public final /* synthetic */ Object c;

    public /* synthetic */ ii5(Object obj, long j, int i) {
        this.a = i;
        this.c = obj;
        this.b = j;
    }

    public final Object get() {
        switch (this.a) {
            case 0:
                mi5 mi5 = (mi5) this.c;
                mi5.getClass();
                return mi5.a(new hi5(mi5, this.b, 0));
            default:
                qi5 qi5 = (qi5) this.c;
                qi5.getClass();
                ade ade = new ade();
                qi5.f.put(Long.valueOf(((jna) qi5.a).f(4, this.b)), ade);
                return ade;
        }
    }
}
