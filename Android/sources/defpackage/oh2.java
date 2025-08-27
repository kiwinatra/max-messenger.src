package defpackage;

import android.view.Surface;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.reflect.KProperty;
import one.me.chatmedia.viewer.ChatMediaViewerScreen;

/* renamed from: oh2  reason: default package */
public final class oh2 extends SuspendLambda implements Function2 {
    public /* synthetic */ Object a;
    public final /* synthetic */ ChatMediaViewerScreen b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public oh2(Continuation continuation, ChatMediaViewerScreen chatMediaViewerScreen) {
        super(2, continuation);
        this.b = chatMediaViewerScreen;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        oh2 oh2 = new oh2(continuation, this.b);
        oh2.a = obj;
        return oh2;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((oh2) create(obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        v5a v5a = (v5a) this.a;
        if (v5a instanceof pa4) {
            KProperty[] kPropertyArr = ChatMediaViewerScreen.H0;
            ChatMediaViewerScreen chatMediaViewerScreen = this.b;
            chatMediaViewerScreen.n0();
            if (ChatMediaViewerScreen.j0(chatMediaViewerScreen)) {
                n7g p0 = chatMediaViewerScreen.p0();
                p0.pause();
                p0.L0((Surface) null);
                p0.M0();
            }
            hh2.b.Y0((pa4) v5a);
        }
        return Unit.INSTANCE;
    }
}
