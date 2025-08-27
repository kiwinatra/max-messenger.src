package defpackage;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* renamed from: bs2  reason: default package */
public final class bs2 extends SuspendLambda implements Function2 {
    public /* synthetic */ Object a;
    public final /* synthetic */ long b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public bs2(long j, Continuation continuation) {
        super(2, continuation);
        this.b = j;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        bs2 bs2 = new bs2(this.b, continuation);
        bs2.a = obj;
        return bs2;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((bs2) create((a32) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        a32 a32 = (a32) this.a;
        long j = this.b;
        long g = a32.g();
        String r = a32.r();
        String h = a32.h(kl0.a, jl0.a);
        if (h == null) {
            h = "";
        }
        a32.m0();
        return new njb(j, g, a32.v0, r, h);
    }
}
