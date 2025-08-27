package defpackage;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* renamed from: tua  reason: default package */
public final class tua extends SuspendLambda implements Function2 {
    public int a;
    public /* synthetic */ Object b;
    public final /* synthetic */ uua c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public tua(uua uua, Continuation continuation) {
        super(2, continuation);
        this.c = uua;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        tua tua = new tua(this.c, continuation);
        tua.b = obj;
        return tua;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((tua) create((d14) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.a;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            d14 d14 = (d14) this.b;
            uua uua = this.c;
            this.a = 1;
            obj = new te0(new mk4[]{ev0.d(d14, ((osa) ((gaf) uua.a.getValue())).a(), new rua(uua, (Continuation) null), 2), ev0.d(d14, ((osa) ((gaf) uua.a.getValue())).a(), new sua(uua, (Continuation) null), 2)}).a(this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else if (i == 1) {
            ResultKt.throwOnFailure(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        return obj;
    }
}
