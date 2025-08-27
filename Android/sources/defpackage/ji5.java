package defpackage;

/* renamed from: ji5  reason: default package */
public final /* synthetic */ class ji5 implements t2f {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ long b;
    public final /* synthetic */ long c;
    public final /* synthetic */ Object o;

    public /* synthetic */ ji5(long j, qfa qfa, long j2) {
        this.b = j;
        this.o = qfa;
        this.c = j2;
    }

    public final Object get() {
        switch (this.a) {
            case 0:
                mi5 mi5 = (mi5) this.o;
                mi5.getClass();
                return mi5.a(new li5(0, this.b, this.c, mi5));
            default:
                StringBuilder sb = new StringBuilder("onSelfReadMarkChangedByServerId: no chat found in cache for chatServerId=");
                long j = this.b;
                sb.append(j);
                z68.c(qfa.z, sb.toString(), new Object[0]);
                wbe wbe = new wbe(((qfa) this.o).b(j, this.c), new yl4(j, 12), 0);
                return wbe instanceof jj6 ? ((jj6) wbe).e() : new sh8(3, wbe);
        }
    }

    public /* synthetic */ ji5(mi5 mi5, long j, long j2) {
        this.o = mi5;
        this.b = j;
        this.c = j2;
    }
}
