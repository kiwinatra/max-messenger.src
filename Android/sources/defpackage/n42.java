package defpackage;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.reflect.KProperty;

/* renamed from: n42  reason: default package */
public final class n42 extends SuspendLambda implements Function2 {
    public /* synthetic */ Object a;
    public final /* synthetic */ h52 b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public n42(h52 h52, Continuation continuation) {
        super(2, continuation);
        this.b = h52;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        n42 n42 = new n42(this.b, continuation);
        n42.a = obj;
        return n42;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((n42) create((g02) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        g02 g02 = (g02) this.a;
        h52 h52 = this.b;
        g02 g022 = (g02) h52.i.getValue();
        if ((g022 != null ? g022.b : null) == f02.c) {
            h52.i.setValue(g02);
        }
        KProperty[] kPropertyArr = h52.y;
        h52.d(h52.s());
        return Unit.INSTANCE;
    }
}
