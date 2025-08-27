package defpackage;

import java.util.List;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* renamed from: xo2  reason: default package */
public final class xo2 extends SuspendLambda implements Function2 {
    public int a;
    public final /* synthetic */ lp2 b;
    public final /* synthetic */ long c;
    public final /* synthetic */ CharSequence o;
    public final /* synthetic */ List v;
    public final /* synthetic */ boolean w;
    public final /* synthetic */ Long x;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public xo2(lp2 lp2, long j, CharSequence charSequence, List list, boolean z, Long l, Continuation continuation) {
        super(2, continuation);
        this.b = lp2;
        this.c = j;
        this.o = charSequence;
        this.v = list;
        this.w = z;
        this.x = l;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        return new xo2(this.b, this.c, this.o, this.v, this.w, this.x, continuation);
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((xo2) create((d14) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.a;
        lp2 lp2 = this.b;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            this.a = 1;
            if (((vrd) lp2.y0.getValue()).a(this.c, this.o, this.v, this.w, this.x, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else if (i == 1) {
            ResultKt.throwOnFailure(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        lp2.j();
        return Unit.INSTANCE;
    }
}
