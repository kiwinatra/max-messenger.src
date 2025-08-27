package defpackage;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* renamed from: ide  reason: default package */
public final class ide extends SuspendLambda implements Function2 {
    public /* synthetic */ Object a;
    public final /* synthetic */ jde b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ide(jde jde, Continuation continuation) {
        super(2, continuation);
        this.b = jde;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        ide ide = new ide(this.b, continuation);
        ide.a = obj;
        return ide;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((ide) create((f00) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        jde.s(this.b, (f00) this.a);
        return Unit.INSTANCE;
    }
}
