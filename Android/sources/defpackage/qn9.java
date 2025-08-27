package defpackage;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import one.me.messages.list.ui.MessagesListWidget;

/* renamed from: qn9  reason: default package */
public final class qn9 extends SuspendLambda implements Function2 {
    public /* synthetic */ Object a;
    public final /* synthetic */ MessagesListWidget b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public qn9(Continuation continuation, MessagesListWidget messagesListWidget) {
        super(2, continuation);
        this.b = messagesListWidget;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        qn9 qn9 = new qn9(continuation, this.b);
        qn9.a = obj;
        return qn9;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((qn9) create(obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        zhd zhd = (zhd) this.a;
        MessagesListWidget messagesListWidget = this.b;
        String str = messagesListWidget.a;
        a67 a67 = z68.b;
        if (a67 != null && a67.c()) {
            w78 w78 = w78.o;
            a67.d(w78, str, "Got new scrollEvent=" + zhd, (Throwable) null);
        }
        if (zhd.b) {
            messagesListWidget.f0().b();
        } else {
            messagesListWidget.e0().s1(new on9(messagesListWidget, 0));
        }
        return Unit.INSTANCE;
    }
}
