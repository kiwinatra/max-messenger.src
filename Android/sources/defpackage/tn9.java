package defpackage;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import one.me.messages.list.ui.MessagesListWidget;

/* renamed from: tn9  reason: default package */
public final class tn9 extends SuspendLambda implements Function2 {
    public /* synthetic */ Object a;
    public final /* synthetic */ MessagesListWidget b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public tn9(Continuation continuation, MessagesListWidget messagesListWidget) {
        super(2, continuation);
        this.b = messagesListWidget;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        tn9 tn9 = new tn9(continuation, this.b);
        tn9.a = obj;
        return tn9;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((tn9) create(obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        int L;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        ewf ewf = (ewf) this.a;
        MessagesListWidget messagesListWidget = this.b;
        bwf bwf = messagesListWidget.A0;
        if (bwf != null) {
            long j = bwf.c;
            bwf.c = ewf.a();
            if (ewf.a() != j) {
                messagesListWidget.h0().a0();
            }
            if ((ewf instanceof dwf) && (L = messagesListWidget.v0.L(((dwf) ewf).a)) >= 0) {
                messagesListWidget.H0.e = -1;
                messagesListWidget.h0().getLinearLayoutManager().m1(L, messagesListWidget.h0().getMeasuredHeight() - bwf.i().getMeasuredHeight());
            }
        }
        return Unit.INSTANCE;
    }
}
