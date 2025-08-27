package defpackage;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* renamed from: bkb  reason: default package */
public final class bkb extends SuspendLambda implements Function2 {
    public /* synthetic */ Object a;
    public final /* synthetic */ long b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public bkb(long j, Continuation continuation) {
        super(2, continuation);
        this.b = j;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        bkb bkb = new bkb(this.b, continuation);
        bkb.a = obj;
        return bkb;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((bkb) create((vk3) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        vk3 vk3 = (vk3) this.a;
        long r = vk3.r();
        String f = vk3.f();
        String str = f == null ? "" : f;
        String t = vk3.t(kl0.a);
        return new njb(this.b, r, vk3.q(), str, t == null ? "" : t);
    }
}
