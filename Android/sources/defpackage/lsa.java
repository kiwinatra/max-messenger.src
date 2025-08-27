package defpackage;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;

/* renamed from: lsa  reason: default package */
public final class lsa extends SuspendLambda implements Function1 {
    public int a;
    public final /* synthetic */ msa b;
    public final /* synthetic */ ha9 c;
    public final /* synthetic */ a32 o;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public lsa(msa msa, ha9 ha9, a32 a32, Continuation continuation) {
        super(1, continuation);
        this.b = msa;
        this.c = ha9;
        this.o = a32;
    }

    public final Continuation create(Continuation continuation) {
        return new lsa(this.b, this.c, this.o, continuation);
    }

    public final Object invoke(Object obj) {
        return ((lsa) create((Continuation) obj)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.a;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            sz0 sz0 = new sz0((Object) this.b, (Object) this.c, (Object) this.o, 7);
            this.a = 1;
            obj = ryg.W(sz0, this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else if (i == 1) {
            ResultKt.throwOnFailure(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        return obj;
    }
}
