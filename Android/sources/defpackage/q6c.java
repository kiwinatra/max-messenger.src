package defpackage;

import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function1;

/* renamed from: q6c  reason: default package */
public final /* synthetic */ class q6c implements Function1 {
    public final /* synthetic */ k7c a;
    public final /* synthetic */ long b;
    public final /* synthetic */ boolean c;

    public /* synthetic */ q6c(k7c k7c, long j, boolean z) {
        this.a = k7c;
        this.b = j;
        this.c = z;
    }

    public final Object invoke(Object obj) {
        int ordinal = ((g0b) obj).ordinal();
        if (ordinal == 0 || ordinal == 1 || ordinal == 2 || ordinal == 3) {
            k7c k7c = this.a;
            ev0.v(k7c.a, (CoroutineContext) null, (f14) null, new f7c(k7c, this.b, this.c, (Continuation) null), 3);
        } else if (ordinal != 4) {
            throw new NoWhenBranchMatchedException();
        }
        return Unit.INSTANCE;
    }
}
