package defpackage;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.reflect.KProperty;

/* renamed from: nv2  reason: default package */
public final class nv2 extends SuspendLambda implements Function2 {
    public final /* synthetic */ ov2 a;
    public final /* synthetic */ long b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public nv2(ov2 ov2, long j, Continuation continuation) {
        super(2, continuation);
        this.a = ov2;
        this.b = j;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        return new nv2(this.a, this.b, continuation);
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((nv2) create((d14) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        KProperty[] kPropertyArr = ov2.O0;
        r62 n = ((my2) this.a.k()).n();
        r62 r62 = n;
        jbd.a(new y52(r62, this.b, ((ltb) n.n).a.m(), 0), n.z, (x6) null, new fm0(22), (lfd) null);
        return Unit.INSTANCE;
    }
}
