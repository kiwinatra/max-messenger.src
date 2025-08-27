package defpackage;

import java.util.List;

/* renamed from: sqe  reason: default package */
public final /* synthetic */ class sqe implements zi6, qk3 {
    public final /* synthetic */ int a;
    public final /* synthetic */ vqe b;

    public /* synthetic */ sqe(vqe vqe, int i) {
        this.a = i;
        this.b = vqe;
    }

    public void accept(Object obj) {
        List list = (List) obj;
        ere ere = this.b.a;
        ere.getClass();
        ryg.k0(new na3(4, new yia(jha.n(list), new dre(3), 3).B(), new tqe(ere, 1)).m(), m58.f, new x52(29, list), new uh5(6, list));
    }

    public Object apply(Object obj) {
        switch (this.a) {
            case 0:
                this.b.getClass();
                return vqe.g((cqe) obj);
            default:
                fqe fqe = (fqe) obj;
                vqe vqe = this.b;
                vqe.getClass();
                return ((moe) vqe.b).e(fqe.h).i(new pbb(17, vqe, fqe));
        }
    }
}
