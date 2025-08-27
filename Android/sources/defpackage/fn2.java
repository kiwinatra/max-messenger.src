package defpackage;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.reflect.KProperty;
import one.me.chatscreen.ChatScreen;

/* renamed from: fn2  reason: default package */
public final class fn2 extends SuspendLambda implements Function2 {
    public /* synthetic */ Object a;
    public final /* synthetic */ ChatScreen b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public fn2(Continuation continuation, ChatScreen chatScreen) {
        super(2, continuation);
        this.b = chatScreen;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        fn2 fn2 = new fn2(continuation, this.b);
        fn2.a = obj;
        return fn2;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((fn2) create(obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        sg9 sg9 = (sg9) this.a;
        KProperty[] kPropertyArr = ChatScreen.d1;
        ChatScreen chatScreen = this.b;
        if (chatScreen.B0().V0.a.getValue() != null) {
            if (sg9 == null) {
                ChatScreen.l0(chatScreen, as0.c);
            } else {
                ChatScreen.l0(chatScreen, as0.a);
            }
        }
        return Unit.INSTANCE;
    }
}
