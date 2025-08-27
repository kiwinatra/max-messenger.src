package defpackage;

import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KProperty;
import one.me.chatmedia.viewer.ChatMediaViewerScreen;

/* renamed from: ph2  reason: default package */
public final class ph2 extends SuspendLambda implements Function2 {
    public /* synthetic */ Object a;
    public final /* synthetic */ ChatMediaViewerScreen b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ph2(Continuation continuation, ChatMediaViewerScreen chatMediaViewerScreen) {
        super(2, continuation);
        this.b = chatMediaViewerScreen;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        ph2 ph2 = new ph2(continuation, this.b);
        ph2.a = obj;
        return ph2;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((ph2) create(obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        ry3 ry3 = (ry3) this.a;
        KProperty[] kPropertyArr = ChatMediaViewerScreen.H0;
        ChatMediaViewerScreen chatMediaViewerScreen = this.b;
        chatMediaViewerScreen.getClass();
        if (Intrinsics.areEqual((Object) ry3, (Object) ny3.a)) {
            if (chatMediaViewerScreen.D0 >= c44.DEFAULT_ASPECT_RATIO) {
                chatMediaViewerScreen.p0().g(chatMediaViewerScreen.D0);
                chatMediaViewerScreen.D0 = -1.0f;
                chatMediaViewerScreen.o0().b(false);
            } else {
                chatMediaViewerScreen.D0 = chatMediaViewerScreen.p0().b();
                chatMediaViewerScreen.p0().g(c44.DEFAULT_ASPECT_RATIO);
                chatMediaViewerScreen.o0().b(true);
            }
        } else if (Intrinsics.areEqual((Object) ry3, (Object) py3.a)) {
            chatMediaViewerScreen.E0 = true;
        } else if (ry3 instanceof qy3) {
            chatMediaViewerScreen.E0 = false;
            chatMediaViewerScreen.p0().I0((long) ((qy3) ry3).a);
        } else if (ry3 instanceof oy3) {
            aj2 r0 = chatMediaViewerScreen.r0();
            int i = ((oy3) ry3).a;
            aje u = ev0.u(r0.a, ((osa) r0.z).b(), f14.b, new hi2(r0, i, (Continuation) null));
            r0.a1.setValue(r0, aj2.b1[3], u);
        } else if (Intrinsics.areEqual((Object) ry3, (Object) my3.a)) {
            chatMediaViewerScreen.r0().z(cra.c);
        } else {
            throw new NoWhenBranchMatchedException();
        }
        return Unit.INSTANCE;
    }
}
