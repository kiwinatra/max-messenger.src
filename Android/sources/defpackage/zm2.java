package defpackage;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.properties.ReadOnlyProperty;
import kotlin.reflect.KProperty;
import one.me.chatscreen.ChatScreen;
import one.me.chatscreen.videomsg.VideoMessageWidget;

/* renamed from: zm2  reason: default package */
public final class zm2 extends SuspendLambda implements Function2 {
    public /* synthetic */ Object a;
    public final /* synthetic */ ChatScreen b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public zm2(Continuation continuation, ChatScreen chatScreen) {
        super(2, continuation);
        this.b = chatScreen;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        zm2 zm2 = new zm2(continuation, this.b);
        zm2.a = obj;
        return zm2;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((zm2) create(obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        boolean booleanValue = ((Boolean) this.a).booleanValue();
        KProperty[] kPropertyArr = ChatScreen.d1;
        ChatScreen chatScreen = this.b;
        chatScreen.A0().setVisibility(booleanValue ? 0 : 8);
        ReadOnlyProperty readOnlyProperty = chatScreen.R0;
        if (booleanValue) {
            mz2 mz2 = (mz2) readOnlyProperty.getValue(chatScreen, ChatScreen.d1[13]);
            if (!Intrinsics.areEqual((Object) mz2.b(), (Object) "video_msg_controller")) {
                i9d i9d = new i9d(new VideoMessageWidget(), (String) null, (ey3) null, (ey3) null, false, -1);
                i9d.d("video_msg_controller");
                mz2.a.R(i9d);
            }
        } else {
            mz2 mz22 = (mz2) readOnlyProperty.getValue(chatScreen, ChatScreen.d1[13]);
            mz22.getClass();
            mz22.a.P(CollectionsKt.emptyList(), (ey3) null);
        }
        return Unit.INSTANCE;
    }
}
