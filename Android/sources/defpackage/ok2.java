package defpackage;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* renamed from: ok2  reason: default package */
public final class ok2 extends SuspendLambda implements Function2 {
    public int a;
    public final /* synthetic */ fu4 b;
    public final /* synthetic */ b89 c;
    public final /* synthetic */ he9 o;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ok2(fu4 fu4, b89 b89, he9 he9, Continuation continuation) {
        super(2, continuation);
        this.b = fu4;
        this.c = b89;
        this.o = he9;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        return new ok2(this.b, this.c, this.o, continuation);
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((ok2) create((d14) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.a;
        fu4 fu4 = this.b;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            this.a = 1;
            obj = fu4.c(fu4, this.c, this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else if (i == 1) {
            ResultKt.throwOnFailure(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ha9 ha9 = (ha9) obj;
        xme xme = (xme) fu4.i;
        qy6 qy6 = new qy6(ha9.o, ha9.b, ha9.c, this.o.o);
        xme.getClass();
        xme.m((Object) null, qy6);
        return Unit.INSTANCE;
    }
}
