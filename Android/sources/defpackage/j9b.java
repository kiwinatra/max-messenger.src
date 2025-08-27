package defpackage;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.time.Duration;
import kotlin.time.DurationKt;
import kotlin.time.DurationUnit;

/* renamed from: j9b  reason: default package */
public final class j9b extends SuspendLambda implements Function2 {
    public int a;
    public final /* synthetic */ v9b b;
    public final /* synthetic */ ws c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public j9b(v9b v9b, ws wsVar, Continuation continuation) {
        super(2, continuation);
        this.b = v9b;
        this.c = wsVar;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        return new j9b(this.b, this.c, continuation);
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((j9b) create((d14) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Object obj2;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.a;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            um1 um1 = this.b.b;
            this.a = 1;
            ym1 ym1 = (ym1) um1;
            ym1.getClass();
            ws wsVar = this.c;
            if (wsVar.isEmpty()) {
                obj2 = Unit.INSTANCE;
            } else {
                jz9 d = wa8.d(wsVar);
                Duration.Companion companion = Duration.Companion;
                obj2 = ((is9) ym1.d.getValue()).v(d, DurationKt.toDuration(30, DurationUnit.SECONDS), this);
                if (obj2 != IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                    obj2 = Unit.INSTANCE;
                }
            }
            if (obj2 == coroutine_suspended) {
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
