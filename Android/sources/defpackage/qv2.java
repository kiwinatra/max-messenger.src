package defpackage;

import java.util.Set;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.reflect.KProperty;

/* renamed from: qv2  reason: default package */
public final class qv2 extends SuspendLambda implements Function2 {
    public int a;
    public final /* synthetic */ tw2 b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public qv2(tw2 tw2, Continuation continuation) {
        super(2, continuation);
        this.b = tw2;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        return new qv2(this.b, continuation);
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((qv2) create((d14) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.a;
        tw2 tw2 = this.b;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            KProperty[] kPropertyArr = tw2.T0;
            this.a = 1;
            obj = ((ia2) ((u82) tw2.y0.getValue())).d(tw2.c, this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else if (i == 1) {
            ResultKt.throwOnFailure(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        zx5 zx5 = (zx5) obj;
        Set set = zx5 != null ? zx5.w : null;
        tw2.I0.setValue(Boxing.boxBoolean(!(set == null || set.isEmpty())));
        return Unit.INSTANCE;
    }
}
