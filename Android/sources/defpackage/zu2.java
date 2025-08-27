package defpackage;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* renamed from: zu2  reason: default package */
public final class zu2 extends SuspendLambda implements Function2 {
    public int a;
    public final /* synthetic */ ov2 b;
    public final /* synthetic */ long c;
    public final /* synthetic */ b89 o;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public zu2(ov2 ov2, long j, b89 b89, Continuation continuation) {
        super(2, continuation);
        this.b = ov2;
        this.c = j;
        this.o = b89;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        return new zu2(this.b, this.c, this.o, continuation);
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((zu2) create((d14) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.a;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            to9 to9 = (to9) this.b.v0.getValue();
            this.a = 1;
            to9.getClass();
            obj = n6d.a(to9.a.a.m(), new ro9(to9, this.c, this.o, (Continuation) null), this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else if (i == 1) {
            ResultKt.throwOnFailure(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ha9 ha9 = (ha9) obj;
        if (ha9 != null) {
            return Boxing.boxLong(ha9.b);
        }
        return null;
    }
}
