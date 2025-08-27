package defpackage;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.reflect.KProperty;

/* renamed from: kyb  reason: default package */
public final class kyb extends SuspendLambda implements Function2 {
    public int a;
    public final /* synthetic */ syb b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public kyb(syb syb, Continuation continuation) {
        super(2, continuation);
        this.b = syb;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        return new kyb(this.b, continuation);
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((kyb) create((d14) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.a;
        syb syb = this.b;
        boolean z = true;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            eu3 eu3 = syb.x;
            this.a = 1;
            obj = eu3.d();
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else if (i == 1) {
            ResultKt.throwOnFailure(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        long r = ((vk3) obj).r();
        KProperty[] kPropertyArr = syb.C0;
        a32 l = syb.l();
        long j = syb.c;
        if (l == null || !l.Z(j)) {
            z = false;
        }
        if (r != j && !z) {
            xag.h(syb.y0, new xxb(new igf(ixa.g1), Boxing.boxInt(exa.b)));
        }
        return Unit.INSTANCE;
    }
}
