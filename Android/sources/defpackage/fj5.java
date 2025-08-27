package defpackage;

import java.util.ArrayList;

/* renamed from: fj5  reason: default package */
public final class fj5 implements zi6 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Iterable b;

    public /* synthetic */ fj5(Iterable iterable, int i) {
        this.a = i;
        this.b = iterable;
    }

    public final Object apply(Object obj) {
        switch (this.a) {
            case 0:
                bj5 bj5 = (bj5) obj;
                bj5.getClass();
                return new qa3(2, new ni(11, bj5, this.b));
            default:
                nj5 nj5 = (nj5) obj;
                nj5.getClass();
                return new qa3(2, new ni(13, nj5, (ArrayList) this.b));
        }
    }
}
