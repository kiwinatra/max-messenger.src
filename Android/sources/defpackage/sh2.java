package defpackage;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.time.Duration;
import one.me.chatmedia.viewer.ChatMediaViewerScreen;

/* renamed from: sh2  reason: default package */
public final class sh2 extends SuspendLambda implements Function2 {
    public /* synthetic */ long a;
    public final /* synthetic */ ChatMediaViewerScreen b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public sh2(Continuation continuation, ChatMediaViewerScreen chatMediaViewerScreen) {
        super(2, continuation);
        this.b = chatMediaViewerScreen;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        sh2 sh2 = new sh2(continuation, this.b);
        sh2.a = ((Duration) obj).m1408unboximpl();
        return sh2;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((sh2) create(Duration.m1351boximpl(((Duration) obj).m1408unboximpl()), (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        long j = this.a;
        ChatMediaViewerScreen chatMediaViewerScreen = this.b;
        if (chatMediaViewerScreen.E0) {
            return Unit.INSTANCE;
        }
        hf7 o0 = chatMediaViewerScreen.o0();
        long r1 = Duration.m1371getInWholeMillisecondsimpl(j);
        n7g p0 = chatMediaViewerScreen.p0();
        o0.c(r1, p0.y != null ? p0.v.T() : 0, chatMediaViewerScreen.p0().G0());
        return Unit.INSTANCE;
    }
}
