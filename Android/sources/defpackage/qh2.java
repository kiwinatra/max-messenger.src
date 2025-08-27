package defpackage;

import android.view.ViewGroup;
import java.util.concurrent.CancellationException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import one.me.chatmedia.viewer.ChatMediaViewerScreen;

/* renamed from: qh2  reason: default package */
public final class qh2 extends SuspendLambda implements Function2 {
    public /* synthetic */ Object a;
    public final /* synthetic */ ChatMediaViewerScreen b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public qh2(Continuation continuation, ChatMediaViewerScreen chatMediaViewerScreen) {
        super(2, continuation);
        this.b = chatMediaViewerScreen;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        qh2 qh2 = new qh2(continuation, this.b);
        qh2.a = obj;
        return qh2;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((qh2) create(obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        n09 n09;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        if (((Boolean) this.a).booleanValue()) {
            ChatMediaViewerScreen chatMediaViewerScreen = this.b;
            pm7 pm7 = chatMediaViewerScreen.F0;
            if (pm7 != null) {
                pm7.b((CancellationException) null);
            }
            chatMediaViewerScreen.o0().a((yh2) chatMediaViewerScreen.r0().Q0.a.getValue());
            n09 n092 = chatMediaViewerScreen.x0;
            if (n092 != null) {
                y7e.c((ViewGroup) n092.b, n092.g(), -1);
            }
            if (chatMediaViewerScreen.o0().getVisibility() == 0 && (n09 = chatMediaViewerScreen.x0) != null) {
                n09.m(true);
            }
            chatMediaViewerScreen.u0();
            chatMediaViewerScreen.r0().V0.d(Boolean.FALSE);
        }
        return Unit.INSTANCE;
    }
}
