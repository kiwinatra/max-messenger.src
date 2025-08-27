package defpackage;

import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KProperty;
import one.me.chatscreen.ChatScreen;

/* renamed from: tm2  reason: default package */
public final class tm2 extends SuspendLambda implements Function2 {
    public /* synthetic */ Object a;
    public final /* synthetic */ ChatScreen b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public tm2(Continuation continuation, ChatScreen chatScreen) {
        super(2, continuation);
        this.b = chatScreen;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        tm2 tm2 = new tm2(continuation, this.b);
        tm2.a = obj;
        return tm2;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((tm2) create(obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        Pair pair = (Pair) this.a;
        gr2 gr2 = (gr2) pair.component1();
        lld lld = (lld) pair.component2();
        KProperty[] kPropertyArr = ChatScreen.d1;
        ChatScreen chatScreen = this.b;
        if (Intrinsics.areEqual((Object) chatScreen.z0().getRightActions(), (Object) s2b.a)) {
            chatScreen.z0().setRightActions(gr2.g);
        }
        chatScreen.z0().setTitle(gr2.b);
        ChatScreen.k0(chatScreen, chatScreen.z0(), gr2.d);
        h3b z0 = chatScreen.z0();
        ngf ngf = gr2.c;
        z0.setSubtitle(ngf != null ? ngf.a(chatScreen.getContext()) : null);
        chatScreen.z0().setAvatar(new y2b(gr2.a, gr2.f, gr2.e));
        if (lld instanceof hld) {
            if (chatScreen.w0().getState() == nza.c || chatScreen.w0().getState() == nza.o) {
                chatScreen.w0().b();
            }
        } else if (lld instanceof ild) {
            if (!(chatScreen.w0().getState() == nza.c || chatScreen.w0().getState() == nza.o)) {
                chatScreen.z0().g(false);
                pza w0 = chatScreen.w0();
                w0.setExpandWithAnimation(((ild) lld).a);
                w0.c();
            }
        } else if (!(lld instanceof gld)) {
            throw new NoWhenBranchMatchedException();
        }
        return Unit.INSTANCE;
    }
}
