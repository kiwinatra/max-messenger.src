package defpackage;

import kotlin.Lazy;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.sequences.SequencesKt;

/* renamed from: ps2  reason: default package */
public final /* synthetic */ class ps2 implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Lazy b;
    public final /* synthetic */ Lazy c;
    public final /* synthetic */ rs2 o;

    public /* synthetic */ ps2(Lazy lazy, Lazy lazy2, rs2 rs2, int i) {
        this.a = i;
        this.b = lazy;
        this.c = lazy2;
        this.o = rs2;
    }

    public final Object invoke() {
        long j;
        long j2;
        switch (this.a) {
            case 0:
                zx5 a2 = ((ct2) this.b.getValue()).a();
                au2 zt2 = a2.b() ? yt2.a : new zt2(a2.Y, a2.w, a2.Z, a2.v0, a2.y0);
                my2 my2 = (my2) ((fu2) this.c.getValue());
                my2.getClass();
                a32 a32 = (a32) SequencesKt.firstOrNull(my2.j(my2.k(CollectionsKt.asSequence(my2.n().I(zt2.a())), zt2), zt2));
                Long valueOf = a32 != null ? Long.valueOf(a32.a) : null;
                if (valueOf != null) {
                    j = valueOf.longValue();
                } else {
                    this.o.getClass();
                    j = -1;
                }
                return Long.valueOf(j);
            default:
                zx5 a3 = ((ct2) this.b.getValue()).a();
                au2 zt22 = a3.b() ? yt2.a : new zt2(a3.Y, a3.w, a3.Z, a3.v0, a3.y0);
                my2 my22 = (my2) ((fu2) this.c.getValue());
                my22.getClass();
                a32 a322 = (a32) SequencesKt.lastOrNull(my22.j(my2.k(CollectionsKt.asSequence(my22.n().I(zt22.a())), zt22), zt22));
                Long valueOf2 = a322 != null ? Long.valueOf(a322.a) : null;
                if (valueOf2 != null) {
                    j2 = valueOf2.longValue();
                } else {
                    this.o.getClass();
                    j2 = -1;
                }
                return Long.valueOf(j2);
        }
    }
}
