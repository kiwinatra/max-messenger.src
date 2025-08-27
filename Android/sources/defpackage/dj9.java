package defpackage;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* renamed from: dj9  reason: default package */
public final class dj9 extends SuspendLambda implements Function2 {
    public int a;
    public final /* synthetic */ Long b;
    public final /* synthetic */ ej9 c;
    public final /* synthetic */ long o;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public dj9(Long l, ej9 ej9, long j, Continuation continuation) {
        super(2, continuation);
        this.b = l;
        this.c = ej9;
        this.o = j;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        return new dj9(this.b, this.c, this.o, continuation);
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((dj9) create((d14) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.a;
        ej9 ej9 = this.c;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            Long l = this.b;
            if (l == null) {
                return null;
            }
            long longValue = l.longValue();
            this.a = 1;
            obj = ((to9) ej9.a.getValue()).a(longValue, this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else if (i == 1) {
            ResultKt.throwOnFailure(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ha9 ha9 = (ha9) obj;
        if (ha9 == null) {
            return null;
        }
        a89 a2 = gb9.a((gb9) ej9.b.getValue(), ha9);
        long j = a2.a.c;
        long j2 = this.o;
        return new mc9(1, j2, a2, (String) null, (String) null, j2, j);
    }
}
