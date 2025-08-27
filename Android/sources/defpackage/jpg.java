package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* renamed from: jpg  reason: default package */
public final /* synthetic */ class jpg implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ kpg b;
    public final /* synthetic */ hs7 c;

    public /* synthetic */ jpg(kpg kpg, hs7 hs7, int i) {
        this.a = i;
        this.b = kpg;
        this.c = hs7;
    }

    public final Object invoke() {
        switch (this.a) {
            case 0:
                kpg kpg = this.b;
                hs7 hs7 = this.c;
                int i = kpg.b;
                if (i >= 0) {
                    ((nd) hs7.get()).c(i, "WM_WORKERS_COUNT");
                }
                return Unit.INSTANCE;
            default:
                kpg kpg2 = this.b;
                hs7 hs72 = this.c;
                int i2 = kpg2.d;
                if (i2 >= 0) {
                    ((nd) hs72.get()).c(i2, "WM_QUEUE_SIZE");
                }
                return Unit.INSTANCE;
        }
    }
}
