package defpackage;

import android.net.Uri;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KProperty;
import one.me.chatscreen.ChatScreen;

/* renamed from: hn2  reason: default package */
public final class hn2 extends SuspendLambda implements Function2 {
    public /* synthetic */ Object a;
    public final /* synthetic */ ChatScreen b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public hn2(Continuation continuation, ChatScreen chatScreen) {
        super(2, continuation);
        this.b = chatScreen;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        hn2 hn2 = new hn2(continuation, this.b);
        hn2.a = obj;
        return hn2;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((hn2) create(obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        bh9 bh9 = (bh9) this.a;
        KProperty[] kPropertyArr = ChatScreen.d1;
        ChatScreen chatScreen = this.b;
        chatScreen.getClass();
        if (bh9 instanceof yg9) {
            chatScreen.B0().j();
            chatScreen.C0();
        } else if (bh9 instanceof zg9) {
            lp2 B0 = chatScreen.B0();
            Uri uri = ((zg9) bh9).a;
            Long l = chatScreen.q0().l();
            aje u = ev0.u(B0.a, ((osa) B0.l()).b(), f14.b, new vo2(B0, uri, l, (Continuation) null));
            B0.D0.setValue(B0, lp2.X0[0], u);
            chatScreen.C0();
        } else if (Intrinsics.areEqual((Object) bh9, (Object) ah9.a)) {
            chatScreen.F0();
        } else if (bh9 instanceof xg9) {
            lp2 B02 = chatScreen.B0();
            CharSequence charSequence = ((xg9) bh9).a;
            Long k = chatScreen.q0().k();
            KProperty[] kPropertyArr2 = lp2.X0;
            B02.k(charSequence, k, (List) null, false);
            chatScreen.q0().t((Long) null, true);
        } else {
            throw new NoWhenBranchMatchedException();
        }
        return Unit.INSTANCE;
    }
}
