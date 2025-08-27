package defpackage;

import ru.ok.tamtam.errors.TamErrorException;

/* renamed from: kyf  reason: default package */
public final /* synthetic */ class kyf implements zi6, nsb {
    public final /* synthetic */ int a;
    public final /* synthetic */ lyf b;

    public /* synthetic */ kyf(lyf lyf, int i) {
        this.a = i;
        this.b = lyf;
    }

    public Object apply(Object obj) {
        switch (this.a) {
            case 0:
                qf9 qf9 = (qf9) obj;
                lyf lyf = this.b;
                lyf.getClass();
                return qf9.d == xyf.VIDEO ? ((pz3) lyf.d.get()).a(qf9) : jha.q(qf9);
            case 1:
                this.b.getClass();
                return lyf.b((qf9) obj);
            default:
                bxf bxf = (bxf) obj;
                lyf lyf2 = this.b;
                lyf2.getClass();
                if (!bxf.a.c.b() || !bxf.a()) {
                    return jha.q(new tf9(bxf, (boe) null));
                }
                return new yia(lyf2.b.a(bxf.h.a).o(), new gxf(bxf, 3), 3);
        }
    }

    public boolean test(Object obj) {
        Throwable th = (Throwable) obj;
        this.b.getClass();
        return (th instanceof TamErrorException) && "invalid.token".equals(((TamErrorException) th).a.b);
    }
}
