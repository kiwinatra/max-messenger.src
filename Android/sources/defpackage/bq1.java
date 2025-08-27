package defpackage;

import java.util.UUID;
import kotlin.Lazy;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* renamed from: bq1  reason: default package */
public final class bq1 extends SuspendLambda implements Function2 {
    public final /* synthetic */ qpg a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public bq1(qpg qpg, Continuation continuation) {
        super(2, continuation);
        this.a = qpg;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        return new bq1(this.a, continuation);
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((bq1) create((d14) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        String uuid = UUID.randomUUID().toString();
        jna jna = (jna) ((rl) ((Lazy) this.a.o).getValue());
        return Boxing.boxLong(jna.z(jna, new kw7(((ltb) jna.D()).a.n(), uuid)));
    }
}
