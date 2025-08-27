package defpackage;

import java.util.List;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* renamed from: hm9  reason: default package */
public final class hm9 extends SuspendLambda implements Function2 {
    public int a;
    public final /* synthetic */ en9 b;
    public final /* synthetic */ List c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public hm9(en9 en9, List list, Continuation continuation) {
        super(2, continuation);
        this.b = en9;
        this.c = list;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        return new hm9(this.b, this.c, continuation);
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((hm9) create((d14) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.a;
        en9 en9 = this.b;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            a32 a32 = (a32) en9.k1.a.getValue();
            if (a32 == null) {
                return Unit.INSTANCE;
            }
            Long l = (Long) CollectionsKt.firstOrNull(this.c);
            if (l == null) {
                return Unit.INSTANCE;
            }
            long longValue = l.longValue();
            long j = a32.b.a;
            this.a = 1;
            if (((rl2) en9.M0.getValue()).a(a32.a, j, longValue, false, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else if (i == 1) {
            ResultKt.throwOnFailure(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        xag.h(en9.q1, kd9.a);
        return Unit.INSTANCE;
    }
}
