package defpackage;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KProperty;
import one.me.chatscreen.ChatScreen;
import one.me.sdk.messagewrite.mention.SuggestionsWidget;

/* renamed from: sm2  reason: default package */
public final class sm2 extends SuspendLambda implements Function2 {
    public final /* synthetic */ ChatScreen a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public sm2(Continuation continuation, ChatScreen chatScreen) {
        super(2, continuation);
        this.a = chatScreen;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        return new sm2(continuation, this.a);
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((sm2) create((h0f) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        KProperty[] kPropertyArr = ChatScreen.d1;
        ChatScreen chatScreen = this.a;
        if (chatScreen.y0().a() == null) {
            mz2 y0 = chatScreen.y0();
            boolean areEqual = Intrinsics.areEqual((Object) y0.b(), (Object) "SuggestionsWidgetTag");
            String str = chatScreen.F0;
            if (!areEqual) {
                i9d i9d = new i9d(new SuggestionsWidget(str, (DefaultConstructorMarker) null), (String) null, (ey3) null, (ey3) null, false, -1);
                i9d.d("SuggestionsWidgetTag");
                y0.a.R(i9d);
            }
            e9d childRouter = chatScreen.getChildRouter(chatScreen.x0());
            childRouter.e = 1;
            childRouter.Q(false);
            if (!childRouter.n()) {
                childRouter.R(iq.n(new SuggestionsWidget(str, (DefaultConstructorMarker) null), (ey3) null, (ey3) null));
            }
        }
        return Unit.INSTANCE;
    }
}
