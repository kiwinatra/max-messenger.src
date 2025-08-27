package defpackage;

import android.view.View;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.reflect.KProperty;
import one.me.chatscreen.ChatScreen;
import one.me.sdk.messagewrite.MessageWriteWidget;

/* renamed from: gn2  reason: default package */
public final class gn2 extends SuspendLambda implements Function2 {
    public /* synthetic */ Object a;
    public final /* synthetic */ ChatScreen b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public gn2(Continuation continuation, ChatScreen chatScreen) {
        super(2, continuation);
        this.b = chatScreen;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        gn2 gn2 = new gn2(continuation, this.b);
        gn2.a = obj;
        return gn2;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((gn2) create(obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        MessageWriteWidget r0;
        View view;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        qk9 qk9 = (qk9) this.a;
        boolean z = qk9 instanceof pk9;
        ChatScreen chatScreen = this.b;
        if (z) {
            KProperty[] kPropertyArr = ChatScreen.d1;
            Long l = chatScreen.q0().l();
            pk9 pk9 = (pk9) qk9;
            long j = pk9.a;
            if (!(l == null || l.longValue() != j || (r0 = chatScreen.r0()) == null || (view = r0.getView()) == null)) {
                Boxing.boxBoolean(view.requestFocus());
            }
            chatScreen.q0().u(Boxing.boxLong(pk9.a));
        } else if (qk9 instanceof ok9) {
            KProperty[] kPropertyArr2 = ChatScreen.d1;
            mh9 q0 = chatScreen.q0();
            Long boxLong = Boxing.boxLong(((ok9) qk9).a);
            KProperty[] kPropertyArr3 = mh9.K0;
            q0.t(boxLong, true);
        } else if (qk9 instanceof mk9) {
            KProperty[] kPropertyArr4 = ChatScreen.d1;
            if (chatScreen.w0().getState() == nza.c || chatScreen.w0().getState() == nza.o) {
                chatScreen.w0().b();
            }
        } else if (qk9 instanceof nk9) {
            KProperty[] kPropertyArr5 = ChatScreen.d1;
            lp2 B0 = chatScreen.B0();
            String str = ((nk9) qk9).a;
            Long l2 = chatScreen.q0().l();
            a32 a32 = (a32) B0.Q0.a.getValue();
            if (a32 != null) {
                aje u = ev0.u(B0.a, ((osa) B0.l()).b(), f14.b, new so2(str, a32, B0, l2, (Continuation) null));
                B0.I0.setValue(B0, lp2.X0[5], u);
            }
        } else {
            throw new NoWhenBranchMatchedException();
        }
        return Unit.INSTANCE;
    }
}
