package defpackage;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import one.me.messages.list.ui.MessagesListWidget;

/* renamed from: co9  reason: default package */
public final class co9 extends SuspendLambda implements Function2 {
    public /* synthetic */ Object a;
    public final /* synthetic */ MessagesListWidget b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public co9(Continuation continuation, MessagesListWidget messagesListWidget) {
        super(2, continuation);
        this.b = messagesListWidget;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        co9 co9 = new co9(continuation, this.b);
        co9.a = obj;
        return co9;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((co9) create((uy6) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        this.b.X.a((uy6) this.a);
        return Unit.INSTANCE;
    }
}
