package defpackage;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* renamed from: nzb  reason: default package */
public final class nzb extends SuspendLambda implements Function2 {
    public int a;
    public final /* synthetic */ szb b;
    public final /* synthetic */ o1c c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public nzb(szb szb, o1c o1c, Continuation continuation) {
        super(2, continuation);
        this.b = szb;
        this.c = o1c;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        return new nzb(this.b, this.c, continuation);
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((nzb) create((d14) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.a;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            n6e n6e = this.b.a;
            o1c o1c = this.c;
            Long boxLong = Boxing.boxLong(o1c.a);
            fo3 fo3 = o1c.b;
            jzb jzb = new jzb(boxLong, fo3.a(), hhf.c(fo3.Z), fo3.b());
            this.a = 1;
            if (n6e.a(jzb, this) == coroutine_suspended) {
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
