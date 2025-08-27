package defpackage;

import java.util.List;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import one.me.chats.tab.ChatsTabWidget;

/* renamed from: sy2  reason: default package */
public final class sy2 extends SuspendLambda implements Function2 {
    public /* synthetic */ Object a;
    public final /* synthetic */ ChatsTabWidget b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public sy2(Continuation continuation, ChatsTabWidget chatsTabWidget) {
        super(2, continuation);
        this.b = chatsTabWidget;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        sy2 sy2 = new sy2(continuation, this.b);
        sy2.a = obj;
        return sy2;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((sy2) create((List) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        List list = (List) this.a;
        ChatsTabWidget chatsTabWidget = this.b;
        chatsTabWidget.v0.o = list;
        chatsTabWidget.x0.P(list);
        return Unit.INSTANCE;
    }
}
