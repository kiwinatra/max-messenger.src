package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* renamed from: yy0  reason: default package */
public final /* synthetic */ class yy0 implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ hz0 b;

    public /* synthetic */ yy0(hz0 hz0, int i) {
        this.a = i;
        this.b = hz0;
    }

    public final Object invoke(Object obj) {
        switch (this.a) {
            case 0:
                this.b.r1.C((xne) obj);
                return Unit.INSTANCE;
            default:
                this.b.r1.O((one) obj);
                return Unit.INSTANCE;
        }
    }
}
