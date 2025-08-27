package defpackage;

/* renamed from: bd8  reason: default package */
public final /* synthetic */ class bd8 implements u2f {
    public final /* synthetic */ r62 a;
    public final /* synthetic */ km3 b;
    public final /* synthetic */ ns3 c;
    public final /* synthetic */ tld o;
    public final /* synthetic */ boolean v;
    public final /* synthetic */ bud w;

    public /* synthetic */ bd8(r62 r62, km3 km3, ns3 ns3, tld tld, boolean z, bud bud) {
        this.a = r62;
        this.b = km3;
        this.c = ns3;
        this.o = tld;
        this.v = z;
        this.w = bud;
    }

    public final Object get() {
        akd akd = (akd) this.w;
        old old = null;
        String[] strArr = akd.y() ? (String[]) akd.m.getValue() : null;
        r62 r62 = this.a;
        km3 km3 = this.b;
        ns3 ns3 = this.c;
        tld tld = this.o;
        boolean z = this.v;
        nld nld = new nld(r62, km3, ns3, tld, z);
        if (strArr != null) {
            if (!(!(strArr.length == 0))) {
                strArr = null;
            }
            if (strArr != null) {
                old = new old(strArr, r62, tld);
            }
        }
        return new mld(r62, km3, tld, z, nld, old);
    }
}
