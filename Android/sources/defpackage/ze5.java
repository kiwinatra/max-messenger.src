package defpackage;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import one.me.android.externalcallback.ExternalCallbackWidget;
import one.me.sdk.arch.Widget;

/* renamed from: ze5  reason: default package */
public final class ze5 extends SuspendLambda implements Function2 {
    public /* synthetic */ Object a;
    public final /* synthetic */ ExternalCallbackWidget b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ze5(Continuation continuation, ExternalCallbackWidget externalCallbackWidget) {
        super(2, continuation);
        this.b = externalCallbackWidget;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        ze5 ze5 = new ze5(continuation, this.b);
        ze5.a = obj;
        return ze5;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((ze5) create(obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        v5a v5a = (v5a) this.a;
        boolean z = v5a instanceof pa4;
        ExternalCallbackWidget externalCallbackWidget = this.b;
        if (z) {
            zb8.b.Y0((pa4) v5a);
        } else if (v5a instanceof ue5) {
            e0b e0b = new e0b((Widget) externalCallbackWidget);
            e0b.h(((ue5) v5a).b);
            e0b.j();
        } else {
            boolean z2 = v5a instanceof te5;
        }
        externalCallbackWidget.i0(false);
        return Unit.INSTANCE;
    }
}
