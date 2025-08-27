package defpackage;

import kotlin.KotlinNothingValueException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.reflect.KProperty;

/* renamed from: mg5  reason: default package */
public final class mg5 extends SuspendLambda implements Function2 {
    public int a;
    public final /* synthetic */ ng5 b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public mg5(ng5 ng5, Continuation continuation) {
        super(2, continuation);
        this.b = ng5;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        return new mg5(this.b, continuation);
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((mg5) create((d14) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.a;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            KProperty[] kPropertyArr = ng5.i;
            ng5 ng5 = this.b;
            etc etc = ng5.b().w;
            bx bxVar = new bx(6, (Object) ng5);
            this.a = 1;
            if (etc.a.e(bxVar, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else if (i != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        } else {
            ResultKt.throwOnFailure(obj);
        }
        throw new KotlinNothingValueException();
    }
}
