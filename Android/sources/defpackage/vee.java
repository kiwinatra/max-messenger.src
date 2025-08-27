package defpackage;

import java.util.ArrayList;
import java.util.List;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* renamed from: vee  reason: default package */
public final class vee extends SuspendLambda implements Function2 {
    public Function0 a;
    public int b;
    public final /* synthetic */ List c;
    public final /* synthetic */ Function0 o;
    public final /* synthetic */ Function1 v;
    public final /* synthetic */ long w;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public vee(ArrayList arrayList, Function0 function0, Function1 function1, long j, Continuation continuation) {
        super(2, continuation);
        this.c = arrayList;
        this.o = function0;
        this.v = function1;
        this.w = j;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        return new vee((ArrayList) this.c, this.o, this.v, this.w, continuation);
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((vee) create((d14) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Function0 function0;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.b;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            for (lg7 invoke : this.c) {
                this.v.invoke(invoke);
            }
            Function0 function02 = this.o;
            if (function02 != null) {
                this.a = function02;
                this.b = 1;
                if (xk4.b(this.w, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                function0 = function02;
            }
            return Unit.INSTANCE;
        } else if (i == 1) {
            function0 = this.a;
            ResultKt.throwOnFailure(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        function0.invoke();
        return Unit.INSTANCE;
    }
}
