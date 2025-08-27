package defpackage;

import java.util.List;

/* renamed from: f18  reason: default package */
public final /* synthetic */ class f18 implements zi6 {
    public final /* synthetic */ int a;
    public final /* synthetic */ j18 b;
    public final /* synthetic */ kv9 c;

    public /* synthetic */ f18(j18 j18, kv9 kv9, int i) {
        this.a = i;
        this.b = j18;
        this.c = kv9;
    }

    public final Object apply(Object obj) {
        int i = this.a;
        List list = (List) obj;
        j18 j18 = this.b;
        j18.getClass();
        switch (i) {
            case 0:
                kv9 kv9 = this.c;
                return new na3(4, j18.z.a(), new yb2(1, kv9.b, kv9.c, kv9.o)).g(new h18(j18, kv9, 0));
            default:
                kv9 kv92 = this.c;
                return new na3(4, j18.z.a(), new x52(4, kv92.v)).g(new h18(j18, kv92, 1));
        }
    }
}
