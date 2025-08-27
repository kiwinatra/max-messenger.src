package defpackage;

import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.reflect.KProperty;

/* renamed from: pv2  reason: default package */
public final /* synthetic */ class pv2 implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ tw2 b;
    public final /* synthetic */ long c;

    public /* synthetic */ pv2(tw2 tw2, long j, int i) {
        this.a = i;
        this.b = tw2;
        this.c = j;
    }

    public final Object invoke(Object obj) {
        long j = this.c;
        tw2 tw2 = this.b;
        g0b g0b = (g0b) obj;
        switch (this.a) {
            case 0:
                int ordinal = g0b.ordinal();
                if (ordinal == 0 || ordinal == 1) {
                    ev0.u(tw2.a, ((osa) tw2.w).b().plus(caa.a), f14.c, new rw2(tw2, j, (Continuation) null));
                } else if (ordinal == 3) {
                    tw2.getClass();
                    xag.h(tw2.L0, new e8e(new igf(jra.t), new pv2(tw2, j, 0)));
                }
                return Unit.INSTANCE;
            case 1:
                int ordinal2 = g0b.ordinal();
                if (ordinal2 == 0 || ordinal2 == 1) {
                    ev0.u(tw2.a, ((osa) tw2.w).b().plus(caa.a), f14.c, new rw2(tw2, j, (Continuation) null));
                    e1d.a((e1d) tw2.x.getValue(), j);
                } else if (ordinal2 != 2) {
                    if (ordinal2 == 3) {
                        tw2.getClass();
                        xag.h(tw2.L0, new e8e(new igf(jra.s), new pv2(tw2, j, 1)));
                    } else if (ordinal2 != 4) {
                        throw new NoWhenBranchMatchedException();
                    }
                }
                return Unit.INSTANCE;
            default:
                if (g0b != g0b.v) {
                    KProperty[] kPropertyArr = tw2.T0;
                    ((jqg) tw2.C0.getValue()).a(new jud(j, false));
                }
                return Unit.INSTANCE;
        }
    }
}
