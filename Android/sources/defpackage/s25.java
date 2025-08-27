package defpackage;

import java.util.List;
import java.util.Objects;

/* renamed from: s25  reason: default package */
public final /* synthetic */ class s25 implements zi6, qk3 {
    public final /* synthetic */ int a;
    public final /* synthetic */ t25 b;

    public /* synthetic */ s25(t25 t25, int i) {
        this.a = i;
        this.b = t25;
    }

    public void accept(Object obj) {
        List list = (List) obj;
        t25 t25 = this.b;
        t25.d = list;
        t25.a.d(list);
    }

    public Object apply(Object obj) {
        switch (this.a) {
            case 0:
                d25 d25 = (d25) obj;
                t25 t25 = this.b;
                t25.getClass();
                return new yia(jha.n(d25.a), new s25(t25, 2), 1).B().i(new rt3(21, (Object) d25));
            default:
                e15 e15 = (e15) obj;
                t25 t252 = this.b;
                t252.getClass();
                gb3 n = jha.n(e15.d);
                u25 u25 = t252.c;
                Objects.requireNonNull(u25);
                return new yia(n, new rt3(22, (Object) u25), 3).B().i(new ib4(13, t252, e15));
        }
    }
}
