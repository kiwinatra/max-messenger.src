package defpackage;

import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;

/* renamed from: cu3  reason: default package */
public final /* synthetic */ class cu3 implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ long b;
    public final /* synthetic */ Object c;

    public /* synthetic */ cu3(Object obj, long j, int i) {
        this.a = i;
        this.c = obj;
        this.b = j;
    }

    public final Object invoke(Object obj) {
        switch (this.a) {
            case 0:
                Long l = (Long) obj;
                return f6e.a((vk3) ((eu3) this.c).a.a.get(Long.valueOf(this.b)));
            case 1:
                if (((g0b) obj) != g0b.v) {
                    k7c k7c = (k7c) this.c;
                    boolean z = k7c.I0.p() && k7c.I0.q();
                    long j = this.b;
                    ((jqg) k7c.w.getValue()).a(new jud(j, z));
                    if (z) {
                        xag.h(k7c.x0, new b5c(j, k7c.b));
                    }
                }
                return Unit.INSTANCE;
            default:
                ((Long) obj).getClass();
                hwe hwe = (hwe) this.c;
                int i = 0;
                for (Object next : ((rve) hwe.z.getValue()).b) {
                    int i2 = i + 1;
                    if (i < 0) {
                        CollectionsKt.throwIndexOverflow();
                    }
                    lz7 lz7 = (lz7) next;
                    boolean z2 = lz7 instanceof mqe;
                    long j2 = this.b;
                    if ((z2 && ((mqe) lz7).a == j2) || ((lz7 instanceof wx1) && ((wx1) lz7).b.a == j2)) {
                        qve qve = new qve(i, 0, 4, j2);
                        xme xme = hwe.Z;
                        xme.getClass();
                        xme.m((Object) null, qve);
                    }
                    i = i2;
                }
                return Unit.INSTANCE;
        }
    }
}
