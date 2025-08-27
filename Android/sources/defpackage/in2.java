package defpackage;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.reflect.KProperty;
import one.me.chatscreen.ChatScreen;

/* renamed from: in2  reason: default package */
public final class in2 extends SuspendLambda implements Function2 {
    public /* synthetic */ Object a;
    public final /* synthetic */ ChatScreen b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public in2(Continuation continuation, ChatScreen chatScreen) {
        super(2, continuation);
        this.b = chatScreen;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        in2 in2 = new in2(continuation, this.b);
        in2.a = obj;
        return in2;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((in2) create(obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        dx9 dx9 = (dx9) this.a;
        KProperty[] kPropertyArr = ChatScreen.d1;
        ChatScreen chatScreen = this.b;
        chatScreen.getClass();
        if (dx9.a > 0) {
            chatScreen.z0().a(String.valueOf(dx9.a), dx9.b, new gm2(chatScreen, 3), new hm2(chatScreen, 1));
        } else if (chatScreen.z0().c()) {
            chatScreen.z0().b();
        }
        return Unit.INSTANCE;
    }
}
