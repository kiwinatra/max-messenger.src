package defpackage;

import android.net.Uri;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import one.me.chatscreen.ChatScreen;
import one.me.sdk.messagewrite.MessageWriteWidget;

/* renamed from: en2  reason: default package */
public final class en2 extends SuspendLambda implements Function2 {
    public /* synthetic */ Object a;
    public final /* synthetic */ ChatScreen b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public en2(Continuation continuation, ChatScreen chatScreen) {
        super(2, continuation);
        this.b = chatScreen;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        en2 en2 = new en2(continuation, this.b);
        en2.a = obj;
        return en2;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((en2) create(obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        wk8 wk8 = (wk8) this.a;
        String name = this.b.getClass().getName();
        a67 a67 = z68.b;
        if (a67 != null && a67.c()) {
            w78 w78 = w78.o;
            iu7 iu7 = ((lv7) this.b.lifecycleOwner.getLifecycle()).d;
            iu7 iu72 = ((lv7) this.b.getViewLifecycleOwner().getLifecycle()).d;
            a67.d(w78, name, "got mediaBarViewModel.upEvents " + wk8 + " " + iu7 + "," + iu72, (Throwable) null);
        }
        if (Intrinsics.areEqual((Object) wk8, (Object) rk8.a)) {
            MessageWriteWidget r0 = this.b.r0();
            if (r0 != null) {
                r0.d0().setText(r0.v.f.j);
            }
        } else if (Intrinsics.areEqual((Object) wk8, (Object) qk8.a)) {
            MessageWriteWidget r02 = this.b.r0();
            if (r02 != null) {
                r02.d0().setText(r02.v.f.j);
            }
            ChatScreen chatScreen = this.b;
            chatScreen.getClass();
            ((oz1) chatScreen.K0.getValue(chatScreen, ChatScreen.d1[7])).setVisibility(8);
        } else if (Intrinsics.areEqual((Object) wk8, (Object) sk8.a)) {
            rk9 s0 = this.b.s0();
            xag.h(s0.y, kk9.a);
        } else if (wk8 instanceof vk8) {
            vk8 vk8 = (vk8) wk8;
            this.b.B0().u(vk8.a, this.b.q0().l(), vk8.b, vk8.c);
            this.b.C0();
        } else if (wk8 instanceof tk8) {
            lp2 B0 = this.b.B0();
            Uri uri = ((tk8) wk8).a;
            Long l = this.b.q0().l();
            a32 a32 = (a32) B0.Q0.a.getValue();
            if (a32 != null) {
                aje u = ev0.u(B0.a, ((osa) B0.l()).b(), f14.b, new uo2(uri, a32.a, B0, l, (Continuation) null));
                B0.D0.setValue(B0, lp2.X0[0], u);
            }
            this.b.C0();
        } else if (wk8 instanceof uk8) {
            uk8 uk8 = (uk8) wk8;
            this.b.B0().t(uk8.a, uk8.b, uk8.c, this.b.q0().l());
            this.b.C0();
        } else if (wk8 instanceof pk8) {
            pk8 pk8 = (pk8) wk8;
            this.b.B0().k(pk8.a, this.b.q0().k(), pk8.b, pk8.c);
            this.b.q0().t((Long) null, true);
        } else {
            throw new NoWhenBranchMatchedException();
        }
        return Unit.INSTANCE;
    }
}
