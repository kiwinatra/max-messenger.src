package defpackage;

/* renamed from: fx1  reason: default package */
public final class fx1 extends bt1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ fx1(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    public void b(int i, it1 it1) {
        switch (this.a) {
            case 1:
                vp9 vp9 = (vp9) this.b;
                synchronized (vp9.a) {
                    try {
                        if (!vp9.v) {
                            vp9.z.put(it1.getTimestamp(), new jt1(it1));
                            vp9.g();
                            return;
                        }
                        return;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            case 2:
                for (vzf vzf : ((idg) this.b).a) {
                    fwd fwd = vzf.m;
                    for (bt1 b2 : fwd.g.e) {
                        b2.b(i, new no5(-1, it1, fwd.g.g));
                    }
                }
                return;
            default:
                return;
        }
    }

    public void d(int i) {
        switch (this.a) {
            case 0:
                ryg.G().execute(new pr1(8, this));
                return;
            default:
                return;
        }
    }
}
