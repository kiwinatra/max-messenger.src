package defpackage;

import java.util.ArrayList;
import java.util.List;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* renamed from: xee  reason: default package */
public final class xee extends SuspendLambda implements Function2 {
    public Function0 a;
    public int b;
    public final /* synthetic */ List c;
    public final /* synthetic */ Function0 o;
    public final /* synthetic */ afe v;
    public final /* synthetic */ Function1 w;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public xee(ArrayList arrayList, kg3 kg3, afe afe, tee tee, Continuation continuation) {
        super(2, continuation);
        this.c = arrayList;
        this.o = kg3;
        this.v = afe;
        this.w = tee;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        return new xee((ArrayList) this.c, (kg3) this.o, this.v, (tee) this.w, continuation);
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((xee) create((d14) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Function0 function0;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.b;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            List list = this.c;
            int i2 = 0;
            for (Object next : list) {
                int i3 = i2 + 1;
                if (i2 < 0) {
                    CollectionsKt.throwIndexOverflow();
                }
                ev0.v(this.v.a, (CoroutineContext) null, (f14) null, new wee(i2, (tee) this.w, (lg7) next, (Continuation) null), 3);
                i2 = i3;
            }
            Function0 function02 = this.o;
            if (function02 != null) {
                this.a = function02;
                this.b = 1;
                if (xk4.b(((long) list.size()) * 100, this) == coroutine_suspended) {
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
