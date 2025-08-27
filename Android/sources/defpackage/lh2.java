package defpackage;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.reflect.KProperty;
import one.me.chatmedia.viewer.ChatMediaViewerScreen;

/* renamed from: lh2  reason: default package */
public final class lh2 extends SuspendLambda implements Function2 {
    public /* synthetic */ Object a;
    public final /* synthetic */ ChatMediaViewerScreen b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public lh2(Continuation continuation, ChatMediaViewerScreen chatMediaViewerScreen) {
        super(2, continuation);
        this.b = chatMediaViewerScreen;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        lh2 lh2 = new lh2(continuation, this.b);
        lh2.a = obj;
        return lh2;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((lh2) create(obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        ngf ngf = ((bi2) this.a).a;
        ChatMediaViewerScreen chatMediaViewerScreen = this.b;
        CharSequence a2 = ngf != null ? ngf.a(chatMediaViewerScreen.getContext()) : null;
        if (a2 == null) {
            a2 = "";
        }
        if (a2.length() > 0) {
            KProperty[] kPropertyArr = ChatMediaViewerScreen.H0;
            chatMediaViewerScreen.q0().setTitle(a2);
        }
        return Unit.INSTANCE;
    }
}
