package defpackage;

import java.util.List;
import kotlin.Lazy;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* renamed from: u71  reason: default package */
public final class u71 extends SuspendLambda implements Function2 {
    public int a;
    public final /* synthetic */ v71 b;
    public final /* synthetic */ List c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public u71(v71 v71, List list, Continuation continuation) {
        super(2, continuation);
        this.b = v71;
        this.c = list;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        return new u71(this.b, this.c, continuation);
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((u71) create((d14) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.a;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            qpg qpg = this.b.c;
            this.a = 1;
            Object I = ev0.I(((osa) ((gaf) ((Lazy) qpg.c).getValue())).b(), new cq1(this.c, qpg, (Continuation) null), this);
            if (I != IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                I = Unit.INSTANCE;
            }
            if (I == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else if (i == 1) {
            ResultKt.throwOnFailure(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        return Unit.INSTANCE;
    }
}
