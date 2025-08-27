package defpackage;

import java.util.List;
import java.util.Map;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* renamed from: zj  reason: default package */
public final class zj extends SuspendLambda implements Function2 {
    public int a;
    public final /* synthetic */ gk b;
    public final /* synthetic */ List c;
    public final /* synthetic */ Map o;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public zj(gk gkVar, List list, Map map, Continuation continuation) {
        super(2, continuation);
        this.b = gkVar;
        this.c = list;
        this.o = map;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        return new zj(this.b, this.c, this.o, continuation);
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((zj) create((d14) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.a;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            this.a = 1;
            if (gk.c(this.b, this.c, this.o, this) == coroutine_suspended) {
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
