package defpackage;

import java.util.List;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import one.me.chatmedia.viewer.ChatMediaViewerScreen;

/* renamed from: kh2  reason: default package */
public final class kh2 extends SuspendLambda implements Function2 {
    public /* synthetic */ Object a;
    public final /* synthetic */ ChatMediaViewerScreen b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public kh2(Continuation continuation, ChatMediaViewerScreen chatMediaViewerScreen) {
        super(2, continuation);
        this.b = chatMediaViewerScreen;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        kh2 kh2 = new kh2(continuation, this.b);
        kh2.a = obj;
        return kh2;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((kh2) create(obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        ai2 ai2 = (ai2) this.a;
        ChatMediaViewerScreen chatMediaViewerScreen = this.b;
        int j = chatMediaViewerScreen.A0.j();
        List list = ai2.a;
        rh2 rh2 = new rh2(chatMediaViewerScreen, j, ai2);
        of2 of2 = chatMediaViewerScreen.A0;
        of2.getClass();
        of2.w0.b(list, new si0(1, rh2));
        return Unit.INSTANCE;
    }
}
