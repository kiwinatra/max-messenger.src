package defpackage;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* renamed from: pm5  reason: default package */
public final class pm5 extends SuspendLambda implements Function2 {
    public int a;
    public /* synthetic */ Object b;
    public final /* synthetic */ String c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public pm5(String str, Continuation continuation) {
        super(2, continuation);
        this.c = str;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        pm5 pm5 = new pm5(this.c, continuation);
        pm5.b = obj;
        return pm5;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((pm5) create((ds5) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.a;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            ds5 ds5 = (ds5) this.b;
            String str = this.c;
            if (str != null) {
                this.a = 1;
                if (ds5.a(str, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
        } else if (i == 1) {
            ResultKt.throwOnFailure(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        return Unit.INSTANCE;
    }
}
