package defpackage;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* renamed from: h39  reason: default package */
public final class h39 extends SuspendLambda implements Function2 {
    public /* synthetic */ Object a;
    public final /* synthetic */ long b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public h39(long j, Continuation continuation) {
        super(2, continuation);
        this.b = j;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        h39 h39 = new h39(this.b, continuation);
        h39.a = obj;
        return h39;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((h39) create((vk3) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
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
