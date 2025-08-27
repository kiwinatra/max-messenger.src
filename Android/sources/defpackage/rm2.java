package defpackage;

import java.util.List;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.reflect.KProperty;
import one.me.chatscreen.ChatScreen;
import one.me.messages.list.ui.MessagesListWidget;

/* renamed from: rm2  reason: default package */
public final class rm2 extends SuspendLambda implements Function2 {
    public int a;
    public final /* synthetic */ ChatScreen b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public rm2(Continuation continuation, ChatScreen chatScreen) {
        super(2, continuation);
        this.b = chatScreen;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        return new rm2(continuation, this.b);
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((rm2) create((d14) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Object obj2;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.a;
        ChatScreen chatScreen = this.b;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            if (chatScreen.getView() == null) {
                return Unit.INSTANCE;
            }
            if (!chatScreen.u0().n()) {
                lp2 B0 = chatScreen.B0();
                this.a = 1;
                obj2 = B0.q(this);
                if (obj2 == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            return Unit.INSTANCE;
        } else if (i == 1) {
            ResultKt.throwOnFailure(obj);
            obj2 = obj;
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        long longValue = ((Number) obj2).longValue();
        KProperty[] kPropertyArr = ChatScreen.d1;
        e9d u0 = chatScreen.u0();
        String str = chatScreen.F0;
        long j = chatScreen.getArgs().getLong("load_mark");
        long j2 = chatScreen.getArgs().getLong("message_id");
        Object obj3 = chatScreen.getArgs().get("highlights");
        List list = obj3 instanceof List ? (List) obj3 : null;
        if (list == null) {
            list = CollectionsKt.emptyList();
        }
        MessagesListWidget messagesListWidget = new MessagesListWidget(str, longValue, j, list, j2, chatScreen.getArgs().getBoolean("highlight_message"), chatScreen.getArgs().getBoolean("from_forward"), (DefaultConstructorMarker) null);
        messagesListWidget.D0 = chatScreen.T0;
        Unit unit = Unit.INSTANCE;
        u0.R(new i9d(messagesListWidget, (String) null, (ey3) null, (ey3) null, false, -1));
        return Unit.INSTANCE;
    }
}
