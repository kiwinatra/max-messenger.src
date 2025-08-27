package defpackage;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;

/* renamed from: mp3  reason: default package */
public final /* synthetic */ class mp3 implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ yp3 b;
    public final /* synthetic */ long c;

    public /* synthetic */ mp3(yp3 yp3, long j, int i) {
        this.a = i;
        this.b = yp3;
        this.c = j;
    }

    public final Object invoke(Object obj) {
        g0b g0b = (g0b) obj;
        switch (this.a) {
            case 0:
                int ordinal = g0b.ordinal();
                if (ordinal == 0 || ordinal == 1 || ordinal == 2) {
                    yp3 yp3 = this.b;
                    ev0.u(yp3.a, ((osa) yp3.c).b().plus(caa.a), f14.c, new xp3(yp3, this.c, (Continuation) null));
                }
                return Unit.INSTANCE;
            case 1:
                if (np3.$EnumSwitchMapping$1[g0b.ordinal()] == 1) {
                    yp3 yp32 = this.b;
                    ev0.v(yp32.a, ((osa) yp32.c).b(), (f14) null, new pp3(yp32, this.c, (Continuation) null), 2);
                }
                return Unit.INSTANCE;
            default:
                if (np3.$EnumSwitchMapping$1[g0b.ordinal()] == 1) {
                    yp3 yp33 = this.b;
                    ev0.v(yp33.a, ((osa) yp33.c).b(), (f14) null, new op3(yp33, this.c, (Continuation) null), 2);
                }
                return Unit.INSTANCE;
        }
    }
}
