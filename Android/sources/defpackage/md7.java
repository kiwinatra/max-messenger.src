package defpackage;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* renamed from: md7  reason: default package */
public final class md7 extends SuspendLambda implements Function2 {
    public yd7 a;
    public int b;
    public int c;
    public final /* synthetic */ yd7 o;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public md7(yd7 yd7, Continuation continuation) {
        super(2, continuation);
        this.o = yd7;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        return new md7(this.o, continuation);
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((md7) create((d14) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        int i;
        yd7 yd7;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = this.c;
        if (i2 == 0) {
            ResultKt.throwOnFailure(obj);
            yd7 = this.o;
            String str = yd7.C0;
            if (((edb) yd7.v.getValue()).c()) {
                rk6 rk6 = rk6.a;
                this.a = yd7;
                this.c = 1;
                obj = yd7.a(rk6, yd7, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                throw new IllegalStateException("storage permissions not granted".toString());
            }
        } else if (i2 == 1) {
            yd7 = this.a;
            ResultKt.throwOnFailure(obj);
        } else if (i2 == 2) {
            i = this.b;
            try {
                ResultKt.throwOnFailure(obj);
                return new s4d(Boxing.boxInt(i + ((Number) obj).intValue()));
            } catch (Throwable th) {
                return new r4d(th);
            }
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        int intValue = ((Number) obj).intValue();
        tk6 tk6 = tk6.a;
        this.a = null;
        this.b = intValue;
        this.c = 2;
        Object a2 = yd7.a(tk6, yd7, this);
        if (a2 == coroutine_suspended) {
            return coroutine_suspended;
        }
        int i3 = intValue;
        obj = a2;
        i = i3;
        return new s4d(Boxing.boxInt(i + ((Number) obj).intValue()));
    }
}
