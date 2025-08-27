package defpackage;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.reflect.KProperty;
import one.me.calls.ui.ui.pip.PipScreen;

/* renamed from: gnb  reason: default package */
public final class gnb extends SuspendLambda implements Function2 {
    public /* synthetic */ Object a;
    public final /* synthetic */ PipScreen b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public gnb(PipScreen pipScreen, Continuation continuation) {
        super(2, continuation);
        this.b = pipScreen;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        gnb gnb = new gnb(this.b, continuation);
        gnb.a = obj;
        return gnb;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((gnb) create((v4b) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        v4b v4b = (v4b) this.a;
        KProperty[] kPropertyArr = PipScreen.c;
        rf1 rf1 = ((wmb) this.b.b.getValue()).o;
        if (rf1 != null) {
            rf1.d(v4b);
        }
        return Unit.INSTANCE;
    }
}
