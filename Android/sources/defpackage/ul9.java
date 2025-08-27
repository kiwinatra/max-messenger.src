package defpackage;

import java.util.List;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* renamed from: ul9  reason: default package */
public final class ul9 extends SuspendLambda implements Function2 {
    public int a;
    public final /* synthetic */ en9 b;
    public final /* synthetic */ List c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ul9(en9 en9, List list, Continuation continuation) {
        super(2, continuation);
        this.b = en9;
        this.c = list;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        return new ul9(this.b, this.c, continuation);
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((ul9) create((d14) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.a;
        en9 en9 = this.b;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            long j = en9.b.a;
            this.a = 1;
            obj = ((wo9) en9.G0.getValue()).b(j, this.c, this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else if (i == 1) {
            ResultKt.throwOnFailure(obj);
        } else if (i == 2) {
            ResultKt.throwOnFailure(obj);
            return Unit.INSTANCE;
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        if (!((Boolean) obj).booleanValue()) {
            gc8 c2 = ((osa) en9.w).c();
            tl9 tl9 = new tl9(en9, (Continuation) null);
            this.a = 2;
            if (ev0.I(c2, tl9, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        }
        return Unit.INSTANCE;
    }
}
