package defpackage;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Ref;

/* renamed from: d98  reason: default package */
public final class d98 extends SuspendLambda implements Function2 {
    public final /* synthetic */ e98 a;
    public final /* synthetic */ Ref.ObjectRef b;
    public final /* synthetic */ b89 c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public d98(e98 e98, Ref.ObjectRef objectRef, b89 b89, Continuation continuation) {
        super(2, continuation);
        this.a = e98;
        this.b = objectRef;
        this.c = b89;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        return new d98(this.a, this.b, this.c, continuation);
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((d98) create((d14) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        e98 e98 = this.a;
        ((fa9) e98.i.getValue()).y((ha9) this.b.element, qe8.g(this.c.y, (bjd) e98.r.getValue()));
        return Unit.INSTANCE;
    }
}
