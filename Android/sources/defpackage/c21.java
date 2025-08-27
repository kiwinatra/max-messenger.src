package defpackage;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* renamed from: c21  reason: default package */
public final class c21 extends SuspendLambda implements Function2 {
    public /* synthetic */ Object a;
    public final /* synthetic */ long b;
    public final /* synthetic */ k21 c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public c21(long j, k21 k21, Continuation continuation) {
        super(2, continuation);
        this.b = j;
        this.c = k21;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        c21 c21 = new c21(this.b, this.c, continuation);
        c21.a = obj;
        return c21;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((c21) create((a32) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        a32 a32 = (a32) this.a;
        if (a32 != null) {
            k21 k21 = this.c;
            ev0.v(k21.a, ((osa) ((gaf) k21.f.getValue())).a(), (f14) null, new b21(k21, a32, (Continuation) null), 2);
            return Unit.INSTANCE;
        }
        throw new IllegalArgumentException("chat not found for id =#" + this.b);
    }
}
