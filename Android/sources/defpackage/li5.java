package defpackage;

import java.util.ArrayList;
import java.util.concurrent.Callable;

/* renamed from: li5  reason: default package */
public final /* synthetic */ class li5 implements Callable {
    public final /* synthetic */ int a;
    public final /* synthetic */ long b;
    public final /* synthetic */ long c;
    public final /* synthetic */ Object o;

    public /* synthetic */ li5(int i, long j, long j2, Object obj) {
        this.a = i;
        this.o = obj;
        this.b = j;
        this.c = j2;
    }

    public final Object call() {
        switch (this.a) {
            case 0:
                jna jna = (jna) ((mi5) this.o).a;
                return Long.valueOf(ocf.d(jna.E(), new ju(((ltb) jna.D()).a.n(), 5, this.b, this.c, -1), false, 0, 12));
            default:
                long j = this.b;
                long j2 = this.c;
                bj5 bj5 = (bj5) this.o;
                i6d i6d = bj5.a;
                i6d.c();
                try {
                    ArrayList a2 = bj5.a(bj5, j, j2);
                    i6d.r();
                    return a2;
                } finally {
                    i6d.l();
                }
        }
    }
}
