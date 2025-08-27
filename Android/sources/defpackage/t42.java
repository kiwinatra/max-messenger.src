package defpackage;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.reflect.KProperty;

/* renamed from: t42  reason: default package */
public final class t42 extends SuspendLambda implements Function2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ h52 b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public t42(int i, h52 h52, Continuation continuation) {
        super(2, continuation);
        this.a = i;
        this.b = h52;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        return new t42(this.a, this.b, continuation);
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((t42) create((d14) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        if (this.a == fxa.E0) {
            KProperty[] kPropertyArr = h52.y;
            h52 h52 = this.b;
            aje v = ev0.v(h52.b, ((osa) h52.p()).b(), (f14) null, new r42(h52, false, (Continuation) null), 2);
            h52.t.setValue(h52, h52.y[0], v);
        }
        return Unit.INSTANCE;
    }
}
