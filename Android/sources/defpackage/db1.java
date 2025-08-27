package defpackage;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.reflect.KProperty;
import one.me.calls.ui.bottomsheet.previewjoinlink.CallJoinLinkPreviewWidget;

/* renamed from: db1  reason: default package */
public final class db1 extends SuspendLambda implements Function2 {
    public /* synthetic */ Object a;
    public final /* synthetic */ CallJoinLinkPreviewWidget b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public db1(Continuation continuation, CallJoinLinkPreviewWidget callJoinLinkPreviewWidget) {
        super(2, continuation);
        this.b = callJoinLinkPreviewWidget;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        db1 db1 = new db1(continuation, this.b);
        db1.a = obj;
        return db1;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((db1) create(obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        v5a v5a = (v5a) this.a;
        if (v5a instanceof e91) {
            KProperty[] kPropertyArr = CallJoinLinkPreviewWidget.z0;
            CallJoinLinkPreviewWidget callJoinLinkPreviewWidget = this.b;
            ((lf1) callJoinLinkPreviewWidget.c.getValue()).i(((e91) v5a).b, true, false, true, new fb1(0, v5a, callJoinLinkPreviewWidget));
        }
        return Unit.INSTANCE;
    }
}
