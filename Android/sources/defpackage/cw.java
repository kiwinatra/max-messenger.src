package defpackage;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* renamed from: cw  reason: default package */
public final class cw extends SuspendLambda implements Function2 {
    public /* synthetic */ Object a;
    public final /* synthetic */ gx b;
    public final /* synthetic */ long c;
    public final /* synthetic */ ra3 o;
    public final /* synthetic */ ra3 v;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public cw(gx gxVar, long j, sa3 sa3, sa3 sa32, Continuation continuation) {
        super(2, continuation);
        this.b = gxVar;
        this.c = j;
        this.o = sa3;
        this.v = sa32;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        cw cwVar = new cw(this.b, this.c, (sa3) this.o, (sa3) this.v, continuation);
        cwVar.a = obj;
        return cwVar;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((cw) create((d14) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        d14 d14 = (d14) this.a;
        gx gxVar = this.b;
        CoroutineContext coroutineContext = gxVar.t;
        gaf gaf = gxVar.b;
        ev0.v(d14, coroutineContext.plus(((osa) gaf).b()), (f14) null, new aw(this.b, this.c, (sa3) this.o, (Continuation) null), 2);
        return ev0.v(d14, gxVar.t.plus(((osa) gaf).b()), (f14) null, new bw(this.b, this.c, (sa3) this.v, (Continuation) null), 2);
    }
}
