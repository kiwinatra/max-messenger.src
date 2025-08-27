package defpackage;

import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;

/* renamed from: r6c  reason: default package */
public final /* synthetic */ class r6c implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ k7c b;

    public /* synthetic */ r6c(k7c k7c, int i) {
        this.a = i;
        this.b = k7c;
    }

    public final Object invoke(Object obj) {
        g0b g0b = (g0b) obj;
        switch (this.a) {
            case 0:
                int ordinal = g0b.ordinal();
                k7c k7c = this.b;
                if (ordinal == 0 || ordinal == 1) {
                    ev0.u(k7c.a, ((osa) k7c.n()).b().plus(caa.a), f14.c, new i7c(k7c, (Continuation) null));
                    k7c.l();
                } else {
                    if (ordinal != 2) {
                        if (ordinal == 3) {
                            k7c.t();
                        } else if (ordinal != 4) {
                            throw new NoWhenBranchMatchedException();
                        }
                    }
                    k7c.L0 = false;
                }
                return Unit.INSTANCE;
            case 1:
                int ordinal2 = g0b.ordinal();
                k7c k7c2 = this.b;
                if (ordinal2 == 0 || ordinal2 == 1) {
                    ev0.u(k7c2.a, ((osa) k7c2.n()).b().plus(caa.a), f14.c, new i7c(k7c2, (Continuation) null));
                } else {
                    if (ordinal2 != 2) {
                        if (ordinal2 == 3) {
                            k7c2.getClass();
                            xag.h(k7c2.w0, new b6c(new igf(lxa.C2), new r6c(k7c2, 1)));
                        } else if (ordinal2 != 4) {
                            throw new NoWhenBranchMatchedException();
                        }
                    }
                    k7c2.L0 = false;
                }
                return Unit.INSTANCE;
            default:
                if (g0b == g0b.v) {
                    k7c k7c3 = this.b;
                    ev0.v(k7c3.a, ((osa) k7c3.n()).b(), (f14) null, new j7c(k7c3, (Continuation) null), 2);
                }
                return Unit.INSTANCE;
        }
    }
}
