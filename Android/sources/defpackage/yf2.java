package defpackage;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* renamed from: yf2  reason: default package */
public final class yf2 extends SuspendLambda implements Function2 {
    public /* synthetic */ Object a;
    public final /* synthetic */ ag2 b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public yf2(ag2 ag2, Continuation continuation) {
        super(2, continuation);
        this.b = ag2;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        yf2 yf2 = new yf2(this.b, continuation);
        yf2.a = obj;
        return yf2;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((yf2) create((a32) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        a32 a32 = (a32) this.a;
        xme xme = this.b.b;
        String h = a32.h(kl0.c, jl0.a);
        a32.m0();
        zf2 zf2 = new zf2(new y2b(a32.g(), a32.v0, h), a32.r());
        xme.getClass();
        xme.m((Object) null, zf2);
        return Unit.INSTANCE;
    }
}
