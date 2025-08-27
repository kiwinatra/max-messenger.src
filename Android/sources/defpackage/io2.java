package defpackage;

import java.util.List;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* renamed from: io2  reason: default package */
public final class io2 extends SuspendLambda implements Function2 {
    public int a;
    public final /* synthetic */ lp2 b;
    public final /* synthetic */ Long c;
    public final /* synthetic */ Long o;
    public final /* synthetic */ CharSequence v;
    public final /* synthetic */ List w;
    public final /* synthetic */ boolean x;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public io2(lp2 lp2, Long l, Long l2, CharSequence charSequence, List list, boolean z, Continuation continuation) {
        super(2, continuation);
        this.b = lp2;
        this.c = l;
        this.o = l2;
        this.v = charSequence;
        this.w = list;
        this.x = z;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        return new io2(this.b, this.c, this.o, this.v, this.w, this.x, continuation);
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((io2) create((d14) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.a;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            uz4 uz4 = this.b.v;
            long longValue = this.c.longValue();
            long longValue2 = this.o.longValue();
            this.a = 1;
            if (uz4.a(longValue, longValue2, this.v, this.w, this.x, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else if (i == 1) {
            ResultKt.throwOnFailure(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        return Unit.INSTANCE;
    }
}
