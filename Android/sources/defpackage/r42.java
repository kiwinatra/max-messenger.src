package defpackage;

import java.util.HashMap;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* renamed from: r42  reason: default package */
public final class r42 extends SuspendLambda implements Function2 {
    public final /* synthetic */ h52 a;
    public final /* synthetic */ boolean b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public r42(h52 h52, boolean z, Continuation continuation) {
        super(2, continuation);
        this.a = h52;
        this.b = z;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        return new r42(this.a, this.b, continuation);
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((r42) create((d14) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        h52 h52 = this.a;
        a32 o = h52.o();
        if (o == null) {
            return Unit.INSTANCE;
        }
        (this.b ? h52.v : h52.w).set(((jna) ((rl) h52.o.getValue())).o(o.a, o.b.a, 0, (String) null, true, (HashMap) null));
        return Unit.INSTANCE;
    }
}
