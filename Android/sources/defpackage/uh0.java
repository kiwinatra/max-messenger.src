package defpackage;

import kotlin.Lazy;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.reflect.KProperty;

/* renamed from: uh0  reason: default package */
public final class uh0 extends SuspendLambda implements Function2 {
    public /* synthetic */ boolean a;
    public final /* synthetic */ wh0 b;
    public final /* synthetic */ Lazy c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public uh0(wh0 wh0, Lazy lazy, Continuation continuation) {
        super(2, continuation);
        this.b = wh0;
        this.c = lazy;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        uh0 uh0 = new uh0(this.b, this.c, continuation);
        uh0.a = ((Boolean) obj).booleanValue();
        return uh0;
    }

    public final Object invoke(Object obj, Object obj2) {
        Boolean bool = (Boolean) obj;
        bool.booleanValue();
        return ((uh0) create(bool, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        boolean z = this.a;
        KProperty[] kPropertyArr = wh0.X;
        wh0 wh0 = this.b;
        aje u = ev0.u(wh0.a, ((osa) wh0.b).b(), f14.b, new th0(wh0, this.c, z, (Continuation) null));
        wh0.z.setValue(wh0, wh0.X[0], u);
        return Unit.INSTANCE;
    }
}
