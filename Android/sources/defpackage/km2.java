package defpackage;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import one.me.chatscreen.ChatScreen;

/* renamed from: km2  reason: default package */
public final class km2 extends SuspendLambda implements Function2 {
    public int a;
    public final /* synthetic */ ChatScreen b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public km2(Continuation continuation, ChatScreen chatScreen) {
        super(2, continuation);
        this.b = chatScreen;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        return new km2(continuation, this.b);
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((km2) create((d14) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.a;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            ChatScreen chatScreen = this.b;
            if (chatScreen.getView() == null) {
                return Unit.INSTANCE;
            }
            bs5 w = bs0.w(new i21(chatScreen.v0().w, chatScreen.B0().V0, new x2(chatScreen, (Continuation) null, 5), 4));
            jm2 jm2 = new jm2((Continuation) null, chatScreen);
            this.a = 1;
            Object e = w.e(new os5(laa.a, jm2, 4), this);
            if (e != IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                e = Unit.INSTANCE;
            }
            if (e != IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                e = Unit.INSTANCE;
            }
            if (e == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else if (i == 1) {
            ResultKt.throwOnFailure(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        return Unit.INSTANCE;
    }
}
