package defpackage;

import java.util.List;

/* renamed from: tqe  reason: default package */
public final /* synthetic */ class tqe implements zi6 {
    public final /* synthetic */ int a;
    public final /* synthetic */ ere b;

    public /* synthetic */ tqe(ere ere, int i) {
        this.a = i;
        this.b = ere;
    }

    public final Object apply(Object obj) {
        List list = (List) obj;
        switch (this.a) {
            case 0:
                ere ere = this.b;
                ere.getClass();
                return new na3(4, new yia(jha.n(list), new dre(3), 3).B(), new tqe(ere, 1));
            default:
                return new na3(4, this.b.a.n().i(new dre(2)), new uqe(1, list));
        }
    }
}
