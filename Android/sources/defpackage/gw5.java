package defpackage;

/* renamed from: gw5  reason: default package */
public final class gw5 extends wv5 {
    public final /* synthetic */ int b;
    public final Object c;

    public /* synthetic */ gw5(int i, Object obj) {
        this.b = i;
        this.c = obj;
    }

    /* JADX WARNING: type inference failed for: r1v9, types: [gce, rk4] */
    public final void g(pye pye) {
        Object obj = this.c;
        switch (this.b) {
            case 0:
                try {
                    Object obj2 = ((t2f) obj).get();
                    if (obj2 != null) {
                        o95 o95 = p95.a;
                        th = (Throwable) obj2;
                        d55.b(th, pye);
                        return;
                    }
                    throw p95.b("Callable returned a null Throwable.");
                } catch (Throwable th) {
                    th = th;
                    hd8.Z(th);
                }
            case 1:
                pye.e(new ow5(pye, (Object[]) obj));
                return;
            case 2:
                ((oka) obj).a(new qw5(pye));
                return;
            default:
                ((lbe) obj).l(new rk4(pye));
                return;
        }
    }
}
