package defpackage;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* renamed from: fe1  reason: default package */
public final class fe1 extends SuspendLambda implements Function2 {
    public int a;
    public final /* synthetic */ he1 b;
    public final /* synthetic */ ze1 c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public fe1(he1 he1, ze1 ze1, Continuation continuation) {
        super(2, continuation);
        this.b = he1;
        this.c = ze1;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        return new fe1(this.b, this.c, continuation);
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((fe1) create((d14) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.a;
        he1 he1 = this.b;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            long j = this.c.a;
            this.a = 1;
            obj = ((my2) ((qx2) he1.w.getValue())).u(j, this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else if (i == 1) {
            ResultKt.throwOnFailure(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        long j2 = ((a32) obj).a;
        s85 s85 = he1.w0;
        id1 id1 = id1.b;
        hd1[] hd1Arr = hd1.a;
        id1.getClass();
        xag.h(s85, new pa4(":profile?id=" + j2 + "&type=" + "local_chat"));
        return Unit.INSTANCE;
    }
}
