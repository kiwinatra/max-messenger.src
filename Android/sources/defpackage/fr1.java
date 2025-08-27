package defpackage;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;

/* renamed from: fr1  reason: default package */
public final /* synthetic */ class fr1 implements vu {
    public final /* synthetic */ lr1 a;
    public final /* synthetic */ List b;
    public final /* synthetic */ int c;
    public final /* synthetic */ int o;
    public final /* synthetic */ int v;

    public /* synthetic */ fr1(lr1 lr1, ArrayList arrayList, int i, int i2, int i3) {
        this.a = lr1;
        this.b = arrayList;
        this.c = i;
        this.o = i2;
        this.v = i3;
    }

    public final zz7 apply(Object obj) {
        Void voidR = (Void) obj;
        u40 u40 = this.a.n;
        int i = this.v;
        int i2 = this.c;
        int i3 = this.o;
        ks1 e = u40.e(i2, i3, i);
        oj6 a2 = oj6.a(e.a(i3));
        oj0 oj0 = new oj0((Object) e, (Object) (ArrayList) this.b, i3, 1);
        a2.getClass();
        Executor executor = e.b;
        cz1 b0 = hd8.b0(a2, oj0, executor);
        b0.d(new pr1(2, e), executor);
        return hd8.J(b0);
    }
}
