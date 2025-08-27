package defpackage;

import kotlin.KotlinNothingValueException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* renamed from: g81  reason: default package */
public final class g81 extends SuspendLambda implements Function2 {
    public int a;
    public final /* synthetic */ h81 b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public g81(h81 h81, Continuation continuation) {
        super(2, continuation);
        this.b = h81;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        return new g81(this.b, continuation);
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((g81) create((d14) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        xme xme;
        Object value;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.a;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            h81 h81 = this.b;
            me5 me5 = ((mp1) h81.v).j().j;
            if ((me5 instanceof he5) || (me5 instanceof ge5) || (me5 instanceof ie5)) {
                do {
                    xme = h81.z;
                    value = xme.getValue();
                    f81 f81 = (f81) value;
                } while (!xme.b(value, new e81(false)));
                return Unit.INSTANCE;
            }
            xme xme2 = ((k21) h81.o).k;
            bx bxVar = new bx(3, (Object) h81);
            this.a = 1;
            if (xme2.e(bxVar, this) == coroutine_suspended) {
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
