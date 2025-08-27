package defpackage;

import java.util.Set;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* renamed from: mo6  reason: default package */
public final class mo6 extends SuspendLambda implements Function2 {
    public int a;
    public final /* synthetic */ gp6 b;
    public final /* synthetic */ Set c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public mo6(gp6 gp6, Set set, Continuation continuation) {
        super(2, continuation);
        this.b = gp6;
        this.c = set;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        return new mo6(this.b, this.c, continuation);
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((mo6) create((d14) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.a;
        gp6 gp6 = this.b;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            k26 k26 = new k26(gp6.Z, 9);
            this.a = 1;
            if (bs0.z(k26, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else if (i == 1) {
            ResultKt.throwOnFailure(obj);
        } else if (i == 2) {
            ResultKt.throwOnFailure(obj);
            return Unit.INSTANCE;
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        this.a = 2;
        Object I = ev0.I(((osa) gp6.l()).e(), new rn6(gp6, this.c, (Continuation) null), this);
        if (I != IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            I = Unit.INSTANCE;
        }
        if (I == coroutine_suspended) {
            return coroutine_suspended;
        }
        return Unit.INSTANCE;
    }
}
