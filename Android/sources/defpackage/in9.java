package defpackage;

import java.util.List;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import one.me.messages.list.loader.MessageModel;
import one.me.messages.list.ui.MessagesListWidget;

/* renamed from: in9  reason: default package */
public final class in9 extends SuspendLambda implements Function2 {
    public /* synthetic */ Object a;
    public final /* synthetic */ MessagesListWidget b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public in9(Continuation continuation, MessagesListWidget messagesListWidget) {
        super(2, continuation);
        this.b = messagesListWidget;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        in9 in9 = new in9(continuation, this.b);
        in9.a = obj;
        return in9;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((in9) create((List) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        List list = (List) this.a;
        String str = this.b.a;
        a67 a67 = z68.b;
        if (a67 != null && a67.c()) {
            w78 w78 = w78.o;
            int size = list.size();
            Object firstOrNull = CollectionsKt.firstOrNull(list);
            MessageModel messageModel = firstOrNull instanceof MessageModel ? (MessageModel) firstOrNull : null;
            String n = messageModel != null ? messageModel.n() : null;
            Object lastOrNull = CollectionsKt.lastOrNull(list);
            MessageModel messageModel2 = lastOrNull instanceof MessageModel ? (MessageModel) lastOrNull : null;
            String n2 = messageModel2 != null ? messageModel2.n() : null;
            a67.d(w78, str, "Got new messages on UI, size=" + size + ", first=" + n + ", last=" + n2, (Throwable) null);
        }
        this.b.v0.G(list);
        return Unit.INSTANCE;
    }
}
