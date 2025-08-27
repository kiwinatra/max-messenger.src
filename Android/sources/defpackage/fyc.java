package defpackage;

/* renamed from: fyc  reason: default package */
public final /* synthetic */ class fyc implements eo1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ lyc b;
    public final /* synthetic */ zb0 c;

    public /* synthetic */ fyc(lyc lyc, zb0 zb0, int i) {
        this.a = i;
        this.b = lyc;
        this.c = zb0;
    }

    /* JADX WARNING: type inference failed for: r4v2, types: [r55, qpg, java.lang.Object] */
    public final Object r(do1 do1) {
        switch (this.a) {
            case 0:
                lyc lyc = this.b;
                q55 q55 = lyc.F;
                w28 w28 = new w28(14, lyc, do1, this.c, false);
                tsd tsd = lyc.e;
                g65 g65 = (g65) q55;
                synchronized (g65.b) {
                    g65.r = w28;
                    g65.s = tsd;
                }
                return "videoEncodingFuture";
            default:
                lyc lyc2 = this.b;
                lyc2.getClass();
                pv1 pv1 = new pv1(8, (Object) lyc2, (Object) do1);
                m70 m70 = lyc2.E;
                tsd tsd2 = lyc2.e;
                m70.a.execute(new ktg(m70, tsd2, new wsb(lyc2, pv1, false), 5));
                g65 g652 = lyc2.H;
                zb0 zb0 = this.c;
                ? obj = new Object();
                obj.o = lyc2;
                obj.a = do1;
                obj.b = pv1;
                obj.c = zb0;
                synchronized (g652.b) {
                    g652.r = obj;
                    g652.s = tsd2;
                }
                return "audioEncodingFuture";
        }
    }
}
