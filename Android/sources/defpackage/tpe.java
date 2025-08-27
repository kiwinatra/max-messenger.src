package defpackage;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.reflect.KProperty;

/* renamed from: tpe  reason: default package */
public final class tpe extends SuspendLambda implements Function2 {
    public int a;
    public int b;
    public final /* synthetic */ mqe c;
    public final /* synthetic */ upe o;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public tpe(mqe mqe, upe upe, Continuation continuation) {
        super(2, continuation);
        this.c = mqe;
        this.o = upe;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        return new tpe(this.c, this.o, continuation);
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((tpe) create((d14) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        int i;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = this.b;
        upe upe = this.o;
        boolean z = false;
        if (i2 == 0) {
            ResultKt.throwOnFailure(obj);
            mqe mqe = this.c;
            lqe lqe = mqe.w;
            lqe lqe2 = lqe.b;
            int i3 = lqe != lqe2 ? 1 : 0;
            KProperty[] kPropertyArr = upe.F0;
            bb3 h = ((ai5) upe.y.getValue()).h(mqe.a, mqe.w != lqe2);
            this.a = i3;
            this.b = 1;
            if (bs0.e(h, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
            i = i3;
        } else if (i2 == 1) {
            i = this.a;
            ResultKt.throwOnFailure(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        s85 s85 = upe.Z;
        if (i != 0) {
            z = true;
        }
        xag.h(s85, new p8e(z ? cad.o : cad.y, z ? hza.c : hza.d));
        return Unit.INSTANCE;
    }
}
