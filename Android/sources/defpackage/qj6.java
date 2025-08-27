package defpackage;

import java.util.concurrent.Callable;
import java.util.concurrent.TimeoutException;
import kotlin.collections.CollectionsKt;

/* renamed from: qj6  reason: default package */
public final /* synthetic */ class qj6 implements Callable {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ long b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object o;

    public /* synthetic */ qj6(do1 do1, zz7 zz7, long j) {
        this.c = do1;
        this.o = zz7;
        this.b = j;
    }

    /* JADX WARNING: type inference failed for: r1v7, types: [java.lang.Object, m20] */
    public final Object call() {
        m20 m20;
        switch (this.a) {
            case 0:
                return Boolean.valueOf(((do1) this.c).d(new TimeoutException("Future[" + ((zz7) this.o) + "] is not done within " + this.b + " ms.")));
            default:
                z6d z6d = (z6d) this.c;
                aj9 d = z6d.d();
                long j = this.b;
                ya9 c2 = d.c(j);
                int i = 0;
                if (c2 == null) {
                    return 0;
                }
                w28 w28 = c2.m;
                if (w28 != null) {
                    m20 = w28.Q();
                } else {
                    ? obj = new Object();
                    obj.a = CollectionsKt.emptyList();
                    m20 = obj;
                }
                int i2 = 1;
                int b2 = m20.b() + (m20.b != null ? 1 : 0);
                ((qk3) this.o).accept(m20);
                if (m20.b == null) {
                    i2 = 0;
                }
                int b3 = m20.b() + i2;
                if (b2 > 0 || b3 > 0) {
                    w28 c3 = m20.c();
                    i = z6d.d().m(new iwf(j, c3, qe8.c(c3)));
                }
                return Integer.valueOf(i);
        }
    }

    public /* synthetic */ qj6(z6d z6d, long j, qk3 qk3) {
        this.c = z6d;
        this.b = j;
        this.o = qk3;
    }
}
