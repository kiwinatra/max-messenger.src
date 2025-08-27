package defpackage;

import java.util.concurrent.Callable;

/* renamed from: b48  reason: default package */
public final /* synthetic */ class b48 implements Callable {
    public final /* synthetic */ c48 a;
    public final /* synthetic */ long b;
    public final /* synthetic */ long c;
    public final /* synthetic */ boolean o;
    public final /* synthetic */ long v;
    public final /* synthetic */ long w;

    public /* synthetic */ b48(c48 c48, long j, long j2, boolean z, long j3, long j4) {
        this.a = c48;
        this.b = j;
        this.c = j2;
        this.o = z;
        this.v = j3;
        this.w = j4;
    }

    public final Object call() {
        ha9 ha9;
        long j = this.c;
        int i = (j > 0 ? 1 : (j == 0 ? 0 : -1));
        a89 a89 = null;
        c48 c48 = this.a;
        long j2 = this.w;
        if (i != 0) {
            ha9 = ((fa9) c48.a.getValue()).k(j2, j);
        } else {
            long j3 = this.v;
            if (j3 == 0) {
                ha9 = ((fa9) c48.a.getValue()).r(this.b);
            } else {
                z6d z6d = ((a74) ((fa9) c48.a.getValue()).a).c;
                ya9 h = z6d.d().h(j2, j3);
                ha9 = h != null ? z6d.b(h) : null;
            }
        }
        if (ha9 != null && (this.o || ha9.Y != qe9.DELETED)) {
            a89 = gb9.a((gb9) c48.b.getValue(), ha9);
        }
        if (a89 != null) {
            return a89;
        }
        throw new IllegalStateException("message not found or deleted");
    }
}
