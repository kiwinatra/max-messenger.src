package defpackage;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* renamed from: ui1  reason: default package */
public final class ui1 extends SuspendLambda implements Function2 {
    public int a;
    public final /* synthetic */ jj1 b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ui1(jj1 jj1, Continuation continuation) {
        super(2, continuation);
        this.b = jj1;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        return new ui1(this.b, continuation);
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((ui1) create((d14) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.a;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            jj1 jj1 = this.b;
            ap1 ap1 = jj1.c;
            xme xme = ((mp1) ap1.a).K;
            ome c = ap1.c();
            ap1 ap12 = jj1.c;
            xme xme2 = ((k21) ap12.f).k;
            xme xme3 = ((chd) ap12.i).v;
            ti1 ti1 = new ti1(jj1, (Continuation) null);
            bs5[] bs5Arr = {xme, c, (ome) ap12.o.getValue(), xme2, xme3};
            this.a = 1;
            Object h = fqc.h(laa.a, this, gy3.x, new uu5((Continuation) null, (Object) ti1, 3), bs5Arr);
            if (h != IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                h = Unit.INSTANCE;
            }
            if (h != IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                h = Unit.INSTANCE;
            }
            if (h == coroutine_suspended) {
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
