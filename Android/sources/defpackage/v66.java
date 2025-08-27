package defpackage;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* renamed from: v66  reason: default package */
public final class v66 extends SuspendLambda implements Function2 {
    public int a;
    public final /* synthetic */ w66 b;
    public final /* synthetic */ String c;
    public final /* synthetic */ int o;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public v66(w66 w66, String str, int i, Continuation continuation) {
        super(2, continuation);
        this.b = w66;
        this.c = str;
        this.o = i;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        return new v66(this.b, this.c, this.o, continuation);
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((v66) create((d14) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.a;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            u82 u82 = this.b.b;
            this.a = 1;
            ia2 ia2 = (ia2) u82;
            ia2.getClass();
            Object I = ev0.I(ia2.x, new p92(ia2, this.c, this.o, (Continuation) null), this);
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
